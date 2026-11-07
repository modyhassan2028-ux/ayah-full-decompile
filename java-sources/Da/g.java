package Da;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f1360r;

    public g(h hVar) {
        this.f1360r = hVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f1360r.f1362s, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream
    public final int read() {
        h hVar = this.f1360r;
        if (hVar.f1362s > 0) {
            return hVar.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.f1360r + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        p251z9.j.e(bArr, "sink");
        return this.f1360r.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
