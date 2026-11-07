package ra;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f21759w = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Da.i f21760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Da.h f21761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f21764v;

    public y(Da.i iVar) {
        p251z9.j.e(iVar, "sink");
        this.f21760r = iVar;
        Da.h hVar = new Da.h();
        this.f21761s = hVar;
        this.f21762t = 16384;
        this.f21764v = new f(hVar);
    }

    public final void A(int i10, EnumC1290b enumC1290b) {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            if (enumC1290b.f21649r == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(i10, 4, 3, 0);
            this.f21760r.writeInt(enumC1290b.f21649r);
            this.f21760r.flush();
        }
    }

    public final void E(B b5) {
        p251z9.j.e(b5, "settings");
        synchronized (this) {
            try {
                if (this.f21763u) {
                    throw new IOException("closed");
                }
                i(0, Integer.bitCount(b5.f21638a) * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    boolean z10 = true;
                    if (((1 << i10) & b5.f21638a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f21760r.writeShort(i10);
                        this.f21760r.writeInt(b5.f21639b[i10]);
                    }
                }
                this.f21760r.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(long j, int i10) {
        synchronized (this) {
            try {
                if (this.f21763u) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f21759w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(false, i10, 4, j));
                }
                i(i10, 4, 8, 0);
                this.f21760r.writeInt((int) j);
                this.f21760r.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(B b5) {
        p251z9.j.e(b5, "peerSettings");
        synchronized (this) {
            try {
                if (this.f21763u) {
                    throw new IOException("closed");
                }
                int i10 = this.f21762t;
                int i11 = b5.f21638a;
                if ((i11 & 32) != 0) {
                    i10 = b5.f21639b[5];
                }
                this.f21762t = i10;
                if (((i11 & 2) != 0 ? b5.f21639b[1] : -1) != -1) {
                    f fVar = this.f21764v;
                    int i12 = (i11 & 2) != 0 ? b5.f21639b[1] : -1;
                    fVar.getClass();
                    int iMin = Math.min(i12, 16384);
                    int i13 = fVar.f21668d;
                    if (i13 != iMin) {
                        if (iMin < i13) {
                            fVar.f21666b = Math.min(fVar.f21666b, iMin);
                        }
                        fVar.f21667c = true;
                        fVar.f21668d = iMin;
                        int i14 = fVar.f21671h;
                        if (iMin < i14) {
                            if (iMin == 0) {
                                d[] dVarArr = fVar.f21669e;
                                p120l9.l.e0(0, dVarArr.length, null, dVarArr);
                                fVar.f21670f = fVar.f21669e.length - 1;
                                fVar.g = 0;
                                fVar.f21671h = 0;
                            } else {
                                fVar.a(i14 - iMin);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f21760r.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f21763u = true;
            this.f21760r.close();
        }
    }

    public final void e(boolean z10, int i10, Da.h hVar, int i11) {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            i(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                Da.i iVar = this.f21760r;
                p251z9.j.b(hVar);
                iVar.Z(i11, hVar);
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            this.f21760r.flush();
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        if (i12 != 8) {
            Level level = Level.FINE;
            Logger logger = f21759w;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i10, i11, i12, i13));
            }
        }
        if (i11 > this.f21762t) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f21762t + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = la.c.f19448a;
        Da.i iVar = this.f21760r;
        p251z9.j.e(iVar, "<this>");
        iVar.writeByte((i11 >>> 16) & 255);
        iVar.writeByte((i11 >>> 8) & 255);
        iVar.writeByte(i11 & 255);
        iVar.writeByte(i12 & 255);
        iVar.writeByte(i13 & 255);
        iVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final void n(int i10, EnumC1290b enumC1290b, byte[] bArr) {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            if (enumC1290b.f21649r == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, bArr.length + 8, 7, 0);
            this.f21760r.writeInt(i10);
            this.f21760r.writeInt(enumC1290b.f21649r);
            if (bArr.length != 0) {
                this.f21760r.write(bArr);
            }
            this.f21760r.flush();
        }
    }

    public final void s(boolean z10, int i10, ArrayList arrayList) {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            this.f21764v.d(arrayList);
            long j = this.f21761s.f1362s;
            long jMin = Math.min(this.f21762t, j);
            int i11 = j == jMin ? 4 : 0;
            if (z10) {
                i11 |= 1;
            }
            i(i10, (int) jMin, 1, i11);
            this.f21760r.Z(jMin, this.f21761s);
            if (j > jMin) {
                long j10 = j - jMin;
                while (j10 > 0) {
                    long jMin2 = Math.min(this.f21762t, j10);
                    j10 -= jMin2;
                    i(i10, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                    this.f21760r.Z(jMin2, this.f21761s);
                }
            }
        }
    }

    public final void w(int i10, int i11, boolean z10) {
        synchronized (this) {
            if (this.f21763u) {
                throw new IOException("closed");
            }
            i(0, 8, 6, z10 ? 1 : 0);
            this.f21760r.writeInt(i10);
            this.f21760r.writeInt(i11);
            this.f21760r.flush();
        }
    }
}
