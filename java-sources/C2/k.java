package C2;

import U6.C0532j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p112l1.l f716a = new p112l1.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f717b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0532j f718c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0532j b() {
        C0532j c0532j = new C0532j(3);
        f718c = c0532j;
        f716a.j(c0532j);
        return f718c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        j jVarA;
        j jVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f718c == null) {
            synchronized (f717b) {
                if (z10) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            jVarA = j.a(file3);
                        } else {
                            jVarA = null;
                        }
                        if (jVarA == null) {
                            if (!z11) {
                                i10 = 327680;
                            } else if (z12) {
                                i10 = 1;
                            } else if (z13) {
                                i10 = 2;
                            }
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10) {
                            i10 = 2;
                        }
                        if (jVarA != null) {
                            i10 = 3;
                        }
                        jVar = new j(1, i10, jA, length);
                        if (jVarA != null) {
                            jVar.b(file3);
                        } else {
                            jVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f718c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA == null && jVarA.f714c == jA2 && (i12 = jVarA.f713b) != 2) {
                            i10 = i12;
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10 && z13 && i10 != 1) {
                            i10 = 2;
                        }
                        if (jVarA != null && jVarA.f713b == 2 && i10 == 1 && length3 < jVarA.f715d) {
                            i10 = 3;
                        }
                        jVar = new j(1, i10, jA2, length);
                        if (jVarA != null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
