package Ca;

import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f840h = new o(0, 0, false, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Da.t f842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f846f;
    public o g;

    public q(Da.h hVar) {
        p pVar = new p(hVar);
        this.f841a = pVar;
        this.f842b = Y2.a.p(pVar);
        this.f843c = -1L;
        this.f844d = new ArrayList();
        this.f845e = new ArrayList();
    }

    public final long a() {
        return this.f841a.f839s - this.f842b.f1393s.f1362s;
    }

    public final long b() {
        long j = this.f843c;
        if (j == -1) {
            return -1L;
        }
        return j - a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final o c() throws ProtocolException {
        long j;
        long j10;
        o oVar = this.g;
        long j11 = 0;
        if (oVar != null) {
            j = 0;
        } else {
            if (oVar != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long jA = a();
            long j12 = this.f843c;
            o oVar2 = f840h;
            if (jA == j12) {
                j = 0;
                oVar = oVar2;
            } else {
                Da.t tVar = this.f842b;
                if (j12 == -1 && tVar.y()) {
                    j = 0;
                    oVar = oVar2;
                } else {
                    byte b5 = tVar.readByte();
                    int i10 = b5 & 192;
                    int i11 = 1;
                    boolean z10 = (b5 & 32) == 32;
                    int i12 = b5 & 31;
                    long jE = i12 == 31 ? e() : i12;
                    byte b10 = tVar.readByte();
                    if ((b10 & 255) == 128) {
                        throw new ProtocolException("indefinite length not permitted for DER");
                    }
                    if ((b10 & 128) == 128) {
                        int i13 = b10 & 127;
                        if (i13 > 8) {
                            throw new ProtocolException("length encoded with more than 8 bytes is not supported");
                        }
                        long j13 = tVar.readByte();
                        j10 = 255 & j13;
                        if (j10 == 0 || (i13 == 1 && (j13 & 128) == 0)) {
                            throw new ProtocolException("invalid encoding for length");
                        }
                        while (i11 < i13) {
                            j10 = (j10 << 8) + ((long) (tVar.readByte() & 255));
                            i11++;
                            j11 = j11;
                        }
                        j = j11;
                        if (j10 < j) {
                            throw new ProtocolException("length > Long.MAX_VALUE");
                        }
                    } else {
                        j = 0;
                        j10 = b10 & 127;
                    }
                    oVar = new o(i10, jE, z10, j10);
                }
            }
            this.g = oVar;
        }
        if (oVar.f835a == 0 && oVar.f836b == j) {
            return null;
        }
        return oVar;
    }

    public final String d() {
        if (b() == -1 || this.f846f) {
            throw new ProtocolException("constructed strings not supported for DER");
        }
        long jB = b();
        Da.t tVar = this.f842b;
        tVar.S(jB);
        return tVar.f1393s.A(jB, H9.a.f3610a);
    }

    public final long e() {
        long j = 0;
        while (true) {
            long j10 = this.f842b.readByte();
            long j11 = 255 & j10;
            if ((j10 & 128) != 128) {
                return j + j11;
            }
            j = (j + (j10 & 127)) << 7;
        }
    }

    public final String toString() {
        return p120l9.m.l0(this.f845e, " / ", null, null, null, 62);
    }
}
