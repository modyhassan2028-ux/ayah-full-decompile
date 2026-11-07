package T1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends OutputStream {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FileOutputStream f7675r;

    public f0(FileOutputStream fileOutputStream) {
        this.f7675r = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f7675r.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f7675r.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        p251z9.j.e(bArr, "b");
        this.f7675r.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        p251z9.j.e(bArr, "bytes");
        this.f7675r.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
