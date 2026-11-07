package Da;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f1389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f1390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1391t;

    public s(x xVar) {
        p251z9.j.e(xVar, "sink");
        this.f1389r = xVar;
        this.f1390s = new h();
    }

    @Override // Da.i
    public final i D() {
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1390s;
        long j = hVar.f1362s;
        if (j == 0) {
            j = 0;
        } else {
            u uVar = hVar.f1361r;
            p251z9.j.b(uVar);
            u uVar2 = uVar.g;
            p251z9.j.b(uVar2);
            int i10 = uVar2.f1397c;
            if (i10 < 8192 && uVar2.f1399e) {
                j -= (long) (i10 - uVar2.f1396b);
            }
        }
        if (j > 0) {
            this.f1389r.Z(j, hVar);
        }
        return this;
    }

    @Override // Da.i
    public final i T(String str) {
        p251z9.j.e(str, "string");
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.d0(str);
        D();
        return this;
    }

    @Override // Da.i
    public final long W(y yVar) {
        long j = 0;
        while (true) {
            long jO = ((h) yVar).o(8192L, this.f1390s);
            if (jO == -1) {
                return j;
            }
            j += jO;
            D();
        }
    }

    @Override // Da.x
    public final void Z(long j, h hVar) {
        p251z9.j.e(hVar, "source");
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.Z(j, hVar);
        D();
    }

    @Override // Da.i
    public final h a() {
        return this.f1390s;
    }

    @Override // Da.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        x xVar = this.f1389r;
        if (this.f1391t) {
            return;
        }
        h hVar = this.f1390s;
        long j = hVar.f1362s;
        if (j > 0) {
            xVar.Z(j, hVar);
        }
        th = null;
        try {
            xVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f1391t = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Da.x
    public final A d() {
        return this.f1389r.d();
    }

    @Override // Da.i, Da.x, java.io.Flushable
    public final void flush() {
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1390s;
        long j = hVar.f1362s;
        x xVar = this.f1389r;
        if (j > 0) {
            xVar.Z(j, hVar);
        }
        xVar.flush();
    }

    @Override // Da.i
    public final i h(String str, int i10, int i11) {
        p251z9.j.e(str, "string");
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.e0(str, i10, i11);
        D();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1391t;
    }

    public final String toString() {
        return "buffer(" + this.f1389r + ')';
    }

    @Override // Da.i
    public final i v(k kVar) {
        p251z9.j.e(kVar, "byteString");
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.N(kVar);
        D();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        p251z9.j.e(byteBuffer, "source");
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f1390s.write(byteBuffer);
        D();
        return iWrite;
    }

    @Override // Da.i
    public final i writeByte(int i10) {
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.O(i10);
        D();
        return this;
    }

    @Override // Da.i
    public final i writeInt(int i10) {
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.b0(i10);
        D();
        return this;
    }

    @Override // Da.i
    public final i writeShort(int i10) {
        if (this.f1391t) {
            throw new IllegalStateException("closed");
        }
        this.f1390s.c0(i10);
        D();
        return this;
    }

    @Override // Da.i
    public final i write(byte[] bArr) {
        if (!this.f1391t) {
            this.f1390s.L(bArr.length, bArr);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
