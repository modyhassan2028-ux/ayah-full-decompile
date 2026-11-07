package p178r8;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f21624t;

    public j(l lVar, i iVar) {
        this.f21624t = lVar;
        this.f21622r = lVar.N(iVar.f21620a + 4);
        this.f21623s = iVar.f21621b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f21623s;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f21622r;
        l lVar = this.f21624t;
        lVar.F(i13, bArr, i10, i11);
        this.f21622r = lVar.N(this.f21622r + i11);
        this.f21623s -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f21623s == 0) {
            return -1;
        }
        l lVar = this.f21624t;
        lVar.f21626r.seek(this.f21622r);
        int i10 = lVar.f21626r.read();
        this.f21622r = lVar.N(this.f21622r + 1);
        this.f21623s--;
        return i10;
    }
}
