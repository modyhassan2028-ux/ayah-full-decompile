package Da;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class n implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f1369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f1370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Inflater f1371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f1372u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CRC32 f1373v;

    public n(j jVar) {
        p251z9.j.e(jVar, "source");
        t tVar = new t(jVar);
        this.f1370s = tVar;
        Inflater inflater = new Inflater(true);
        this.f1371t = inflater;
        this.f1372u = new o(tVar, inflater);
        this.f1373v = new CRC32();
    }

    public static void b(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + H9.o.h1(8, F9.n.W(i11)) + " != expected 0x" + H9.o.h1(8, F9.n.W(i10)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1372u.close();
    }

    @Override // Da.y
    public final A d() {
        return this.f1370s.f1392r.d();
    }

    public final void e(h hVar, long j, long j10) {
        u uVar = hVar.f1361r;
        p251z9.j.b(uVar);
        while (true) {
            int i10 = uVar.f1397c;
            int i11 = uVar.f1396b;
            if (j < i10 - i11) {
                break;
            }
            j -= (long) (i10 - i11);
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
        }
        while (j10 > 0) {
            int i12 = (int) (((long) uVar.f1396b) + j);
            int iMin = (int) Math.min(uVar.f1397c - i12, j10);
            this.f1373v.update(uVar.f1395a, i12, iMin);
            j10 -= (long) iMin;
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
            j = 0;
        }
    }

    @Override // Da.y
    public final long o(long j, h hVar) throws IOException {
        long j10;
        n nVar = this;
        p251z9.j.e(hVar, "sink");
        byte b5 = nVar.f1369r;
        CRC32 crc32 = nVar.f1373v;
        t tVar = nVar.f1370s;
        if (b5 == 0) {
            tVar.S(10L);
            h hVar2 = tVar.f1393s;
            byte bE = hVar2.e(3L);
            boolean z10 = ((bE >> 1) & 1) == 1;
            if (z10) {
                nVar.e(hVar2, 0L, 10L);
            }
            b("ID1ID2", 8075, tVar.readShort());
            tVar.skip(8L);
            if (((bE >> 2) & 1) == 1) {
                tVar.S(2L);
                if (z10) {
                    e(hVar2, 0L, 2L);
                }
                short s10 = hVar2.readShort();
                long j11 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                tVar.S(j11);
                if (z10) {
                    e(hVar2, 0L, j11);
                }
                tVar.skip(j11);
            }
            if (((bE >> 3) & 1) == 1) {
                long jB = tVar.b(0L, Long.MAX_VALUE, (byte) 0);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    j10 = 2;
                    e(hVar2, 0L, jB + 1);
                } else {
                    j10 = 2;
                }
                tVar.skip(jB + 1);
            } else {
                j10 = 2;
            }
            if (((bE >> 4) & 1) == 1) {
                j10 = j10;
                long jB2 = tVar.b(0L, Long.MAX_VALUE, (byte) 0);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    nVar = this;
                    nVar.e(hVar2, 0L, jB2 + 1);
                } else {
                    nVar = this;
                }
                tVar.skip(jB2 + 1);
            } else {
                nVar = this;
            }
            if (z10) {
                tVar.S(j10);
                short s11 = hVar2.readShort();
                b("FHCRC", (short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            nVar.f1369r = (byte) 1;
        }
        if (nVar.f1369r == 1) {
            long j12 = hVar.f1362s;
            long jO = nVar.f1372u.o(8192L, hVar);
            if (jO != -1) {
                nVar.e(hVar, j12, jO);
                return jO;
            }
            nVar.f1369r = (byte) 2;
        }
        if (nVar.f1369r == 2) {
            b("CRC", tVar.e(), (int) crc32.getValue());
            b("ISIZE", tVar.e(), (int) nVar.f1371t.getBytesWritten());
            nVar.f1369r = (byte) 3;
            if (!tVar.y()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
