package K2;

import F2.C0156a;
import F2.InterfaceC0157b;
import F9.n;
import R2.c;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, InterfaceC0157b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f5219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f5221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f5222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f5223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0156a f5224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5225x;

    public b(Context context, String str, File file, int i10, c cVar) {
        j.e(context, "context");
        j.e(cVar, "delegate");
        this.f5219r = context;
        this.f5220s = str;
        this.f5221t = file;
        this.f5222u = i10;
        this.f5223v = cVar;
    }

    @Override // R2.c
    public final R2.a U() {
        if (!this.f5225x) {
            String databaseName = this.f5223v.getDatabaseName();
            if (databaseName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Context context = this.f5219r;
            File databasePath = context.getDatabasePath(databaseName);
            C0156a c0156a = this.f5224w;
            if (c0156a == null) {
                j.k("databaseConfiguration");
                throw null;
            }
            boolean z10 = c0156a.f2270v;
            T2.a aVar = new T2.a(databaseName, context.getFilesDir(), z10);
            try {
                aVar.a(z10);
                if (databasePath.exists()) {
                    try {
                        int iS = B9.a.S(databasePath);
                        int i10 = this.f5222u;
                        if (iS != i10) {
                            C0156a c0156a2 = this.f5224w;
                            if (c0156a2 == null) {
                                j.k("databaseConfiguration");
                                throw null;
                            }
                            if (!n.H(c0156a2, iS, i10)) {
                                if (context.deleteDatabase(databaseName)) {
                                    try {
                                        e(databasePath);
                                    } catch (IOException e10) {
                                        Log.w("ROOM", "Unable to copy database file.", e10);
                                    }
                                } else {
                                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                                }
                            }
                        }
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to read database version.", e11);
                    }
                } else {
                    try {
                        e(databasePath);
                    } catch (IOException e12) {
                        throw new RuntimeException("Unable to copy database file.", e12);
                    }
                }
                aVar.b();
                this.f5225x = true;
            } catch (Throwable th) {
                aVar.b();
                throw th;
            }
        }
        return this.f5223v.U();
    }

    @Override // F2.InterfaceC0157b
    public final c b() {
        return this.f5223v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5223v.close();
        this.f5225x = false;
    }

    public final void e(File file) throws IOException {
        ReadableByteChannel channel;
        Context context = this.f5219r;
        String str = this.f5220s;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f5221t;
            if (file2 == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            channel = new FileInputStream(file2).getChannel();
        }
        ReadableByteChannel readableByteChannel = channel;
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
        j.b(channel2);
        j.e(readableByteChannel, "input");
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStreamNewInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                channel2.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            channel2.force(false);
            readableByteChannel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (this.f5224w == null) {
                j.k("databaseConfiguration");
                throw null;
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            readableByteChannel.close();
            channel2.close();
            throw th;
        }
    }

    @Override // R2.c
    public final String getDatabaseName() {
        return this.f5223v.getDatabaseName();
    }

    @Override // R2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        this.f5223v.setWriteAheadLoggingEnabled(z10);
    }
}
