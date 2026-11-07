package Da;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f1392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f1393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1394t;

    public t(y yVar) {
        p251z9.j.e(yVar, "source");
        this.f1392r = yVar;
        this.f1393s = new h();
    }

    @Override // Da.j
    public final String G(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j10 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jB = b(0L, j10, (byte) 10);
        h hVar = this.f1393s;
        if (jB != -1) {
            return Ea.a.c(jB, hVar);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && hVar.e(j10 - 1) == 13 && request(j10 + 1) && hVar.e(j10) == 10) {
            return Ea.a.c(j10, hVar);
        }
        h hVar2 = new h();
        hVar.b(hVar2, 0L, Math.min(32, hVar.f1362s));
        throw new EOFException("\\n not found: limit=" + Math.min(hVar.f1362s, j) + " content=" + hVar2.k(hVar2.f1362s).b() + (char) 8230);
    }

    @Override // Da.j
    public final long K(k kVar) {
        p251z9.j.e(kVar, "targetBytes");
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            h hVar = this.f1393s;
            long jN = hVar.n(kVar, jMax);
            if (jN != -1) {
                return jN;
            }
            long j = hVar.f1362s;
            if (this.f1392r.o(8192L, hVar) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // Da.j
    public final int Q(p pVar) throws EOFException {
        h hVar;
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        do {
            hVar = this.f1393s;
            int iD = Ea.a.d(hVar, pVar, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                hVar.skip(pVar.f1378r[iD].a());
                return iD;
            }
        } while (this.f1392r.o(8192L, hVar) != -1);
        return -1;
    }

    @Override // Da.j
    public final void S(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // Da.j
    public final long Y() {
        h hVar;
        S(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zRequest = request(i11);
            hVar = this.f1393s;
            if (!zRequest) {
                break;
            }
            byte bE = hVar.e(i10);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                if (i10 != 0) {
                    break;
                }
                F9.n.n(16);
                String string = Integer.toString(bE, 16);
                p251z9.j.d(string, "toString(...)");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i10 = i11;
        }
        return hVar.Y();
    }

    @Override // Da.j, Da.i
    public final h a() {
        return this.f1393s;
    }

    public final long b(long j, long j10, byte b5) {
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j10).toString());
        }
        long jMax = 0;
        while (jMax < j10) {
            h hVar = this.f1393s;
            long j11 = j10;
            byte b10 = b5;
            long jI = hVar.i(jMax, j11, b10);
            if (jI != -1) {
                return jI;
            }
            long j12 = hVar.f1362s;
            if (j12 >= j11 || this.f1392r.o(8192L, hVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            j10 = j11;
            b5 = b10;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f1394t) {
            return;
        }
        this.f1394t = true;
        this.f1392r.close();
        h hVar = this.f1393s;
        hVar.skip(hVar.f1362s);
    }

    @Override // Da.y
    public final A d() {
        return this.f1392r.d();
    }

    public final int e() throws EOFException {
        S(4L);
        int i10 = this.f1393s.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[LOOP:0: B:5:0x001e->B:35:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[SYNTHETIC] */
    @Override // Da.j
    public final long g(k kVar) {
        long j;
        long j10;
        k kVar2 = kVar;
        p251z9.j.e(kVar2, "bytes");
        int iA = kVar2.a();
        long j11 = iA;
        F9.n.m(kVar2.a(), 0, j11);
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            h hVar = this.f1393s;
            long jA = Ea.a.a(hVar, kVar2, jMax, Long.MAX_VALUE, iA);
            int i10 = iA;
            if (jA != -1) {
                return jA;
            }
            long j12 = hVar.f1362s;
            long j13 = (j12 - j11) + 1;
            if (j13 < Long.MAX_VALUE) {
                if (j12 >= Long.MAX_VALUE) {
                    int iMax = (int) Math.max(1L, j12 - 9223372036854775806L);
                    int iMin = ((int) Math.min(j11, (hVar.f1362s - jMax) + 1)) - 1;
                    if (iMax <= iMin) {
                        int i11 = iMin;
                        while (true) {
                            long j14 = hVar.f1362s;
                            int i12 = i10;
                            h hVar2 = hVar;
                            long j15 = i11;
                            long j16 = j14 - j15;
                            if (i11 < 0 || j16 < 0 || j16 + j15 > j14 || i11 > kVar.a()) {
                                hVar = hVar2;
                                i10 = i12;
                                j = j11;
                                j10 = jMax;
                            } else if (i11 != 0) {
                                hVar = hVar2;
                                i10 = i12;
                                j = j11;
                                j10 = jMax;
                                if (Ea.a.a(hVar, kVar, j16, j16 + 1, i11) != -1) {
                                    break;
                                }
                            } else {
                                hVar = hVar2;
                                i10 = i12;
                                j = j11;
                                j10 = jMax;
                                break;
                            }
                            if (i11 != iMax) {
                                i11--;
                                jMax = j10;
                                j11 = j;
                            }
                        }
                        if (this.f1392r.o(8192L, hVar) == -1) {
                            jMax = Math.max(j10, j13);
                            kVar2 = kVar;
                            iA = i10;
                            j11 = j;
                        }
                    }
                } else {
                    j = j11;
                    j10 = jMax;
                    if (this.f1392r.o(8192L, hVar) == -1) {
                        jMax = Math.max(j10, j13);
                        kVar2 = kVar;
                        iA = i10;
                        j11 = j;
                    }
                }
            }
            return -1L;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1394t;
    }

    @Override // Da.j
    public final k k(long j) {
        S(j);
        return this.f1393s.k(j);
    }

    @Override // Da.y
    public final long o(long j, h hVar) {
        p251z9.j.e(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        h hVar2 = this.f1393s;
        if (hVar2.f1362s == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f1392r.o(8192L, hVar2) == -1) {
                return -1L;
            }
        }
        return hVar2.o(Math.min(j, hVar2.f1362s), hVar);
    }

    @Override // Da.j
    public final t peek() {
        return Y2.a.p(new q(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        p251z9.j.e(byteBuffer, "sink");
        h hVar = this.f1393s;
        if (hVar.f1362s == 0 && this.f1392r.o(8192L, hVar) == -1) {
            return -1;
        }
        return hVar.read(byteBuffer);
    }

    @Override // Da.j
    public final byte readByte() {
        S(1L);
        return this.f1393s.readByte();
    }

    @Override // Da.j
    public final int readInt() {
        S(4L);
        return this.f1393s.readInt();
    }

    @Override // Da.j
    public final short readShort() {
        S(2L);
        return this.f1393s.readShort();
    }

    @Override // Da.j
    public final boolean request(long j) {
        h hVar;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        do {
            hVar = this.f1393s;
            if (hVar.f1362s >= j) {
                return true;
            }
        } while (this.f1392r.o(8192L, hVar) != -1);
        return false;
    }

    @Override // Da.j
    public final void skip(long j) throws EOFException {
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            h hVar = this.f1393s;
            if (hVar.f1362s == 0 && this.f1392r.o(8192L, hVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, hVar.f1362s);
            hVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f1392r + ')';
    }

    @Override // Da.j
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // Da.j
    public final boolean y() {
        if (this.f1394t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1393s;
        return hVar.y() && this.f1392r.o(8192L, hVar) == -1;
    }
}
