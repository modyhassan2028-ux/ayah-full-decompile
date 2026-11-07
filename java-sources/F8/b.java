package F8;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f2522r;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f2522r++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f2522r += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f2522r += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
