package W;

import D.AbstractC0071n;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import p180s0.C1303l;
import p224x0.AbstractC1438b;
import p224x0.C1442f;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0.r f8483a = androidx.compose.foundation.layout.c.j(l0.o.f19333a, Y.g.f10165a);

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(p215w0.b bVar, String str, l0.r rVar, long j, C0698o c0698o, int i10, int i11) {
        int i12;
        l0.r rVar2;
        int i13;
        l0.r rVar3;
        boolean z10;
        Object objH;
        C1303l c1303l;
        boolean z11;
        l0.r rVarA;
        long jD;
        boolean z12;
        Object objH2;
        l0.r rVar4;
        C0699o0 c0699o0R;
        int i14;
        c0698o.V(-2142239481);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(str) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c0698o.f(j)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) == 1170 || !c0698o.x()) {
                c0698o.P();
                i13 = i10 & 1;
                rVar3 = l0.o.f19333a;
                if (i13 == 0 && !c0698o.w()) {
                    c0698o.N();
                } else if (i15 != 0) {
                    rVar2 = rVar3;
                }
                c0698o.q();
                z10 = (((i12 & 7168) ^ 3072) <= 2048 && c0698o.f(j)) || (i12 & 3072) == 2048;
                objH = c0698o.H();
                Z.S s10 = C0690k.f10683a;
                if (z10 || objH == s10) {
                    if (p180s0.q.c(j, p180s0.q.g)) {
                        c1303l = null;
                    } else {
                        c1303l = new C1303l(j, 5);
                    }
                    objH = c1303l;
                    c0698o.e0(objH);
                }
                C1303l c1303l2 = (C1303l) objH;
                c0698o.T(-2144891392);
                if (str != null) {
                    z12 = (i12 & 112) == 32;
                    objH2 = c0698o.H();
                    if (z12 || objH2 == s10) {
                        objH2 = new R0.n(str, 3);
                        c0698o.e0(objH2);
                    }
                    z11 = false;
                    rVarA = R0.m.a(rVar3, false, (p241y9.c) objH2);
                } else {
                    z11 = false;
                    rVarA = rVar3;
                }
                c0698o.p(z11);
                if (p171r0.i.a(bVar.d(), 9205357640488583168L)) {
                    rVar3 = f8483a;
                } else {
                    jD = bVar.d();
                    if (Float.isInfinite(p171r0.i.d(jD)) && Float.isInfinite(p171r0.i.b(jD))) {
                        rVar3 = f8483a;
                    }
                }
                AbstractC0071n.a(androidx.compose.ui.draw.a.d(rVar2.b(rVar3), bVar, 0.0f, c1303l2, 22).b(rVarA), c0698o, 0);
            } else {
                c0698o.N();
            }
            rVar4 = rVar2;
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new B0(bVar, str, rVar4, j, i10, i11, 1);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        if ((i10 & 3072) == 0) {
            if (c0698o.f(j)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i12 & 1171) == 1170) {
            c0698o.P();
            i13 = i10 & 1;
            rVar3 = l0.o.f19333a;
            if (i13 == 0) {
                if (i15 != 0) {
                    rVar2 = rVar3;
                }
            } else if (i15 != 0) {
                rVar2 = rVar3;
            }
            c0698o.q();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objH = c0698o.H();
            Z.S s11 = C0690k.f10683a;
            if (z10) {
                if (p180s0.q.c(j, p180s0.q.g)) {
                    c1303l = null;
                } else {
                    c1303l = new C1303l(j, 5);
                }
                objH = c1303l;
                c0698o.e0(objH);
            } else {
                if (p180s0.q.c(j, p180s0.q.g)) {
                    c1303l = null;
                } else {
                    c1303l = new C1303l(j, 5);
                }
                objH = c1303l;
                c0698o.e0(objH);
            }
            C1303l c1303l3 = (C1303l) objH;
            c0698o.T(-2144891392);
            if (str != null) {
                if ((i12 & 112) == 32) {
                }
                objH2 = c0698o.H();
                if (z12) {
                    objH2 = new R0.n(str, 3);
                    c0698o.e0(objH2);
                } else {
                    objH2 = new R0.n(str, 3);
                    c0698o.e0(objH2);
                }
                z11 = false;
                rVarA = R0.m.a(rVar3, false, (p241y9.c) objH2);
            } else {
                z11 = false;
                rVarA = rVar3;
            }
            c0698o.p(z11);
            if (p171r0.i.a(bVar.d(), 9205357640488583168L)) {
                jD = bVar.d();
                if (Float.isInfinite(p171r0.i.d(jD))) {
                    rVar3 = f8483a;
                }
            } else {
                rVar3 = f8483a;
            }
            AbstractC0071n.a(androidx.compose.ui.draw.a.d(rVar2.b(rVar3), bVar, 0.0f, c1303l3, 22).b(rVarA), c0698o, 0);
        } else {
            c0698o.P();
            i13 = i10 & 1;
            rVar3 = l0.o.f19333a;
            if (i13 == 0) {
                if (i15 != 0) {
                    rVar2 = rVar3;
                }
            } else if (i15 != 0) {
                rVar2 = rVar3;
            }
            c0698o.q();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objH = c0698o.H();
            Z.S s12 = C0690k.f10683a;
            if (z10) {
                if (p180s0.q.c(j, p180s0.q.g)) {
                    c1303l = null;
                } else {
                    c1303l = new C1303l(j, 5);
                }
                objH = c1303l;
                c0698o.e0(objH);
            } else {
                if (p180s0.q.c(j, p180s0.q.g)) {
                    c1303l = null;
                } else {
                    c1303l = new C1303l(j, 5);
                }
                objH = c1303l;
                c0698o.e0(objH);
            }
            C1303l c1303l4 = (C1303l) objH;
            c0698o.T(-2144891392);
            if (str != null) {
                if ((i12 & 112) == 32) {
                }
                objH2 = c0698o.H();
                if (z12) {
                    objH2 = new R0.n(str, 3);
                    c0698o.e0(objH2);
                } else {
                    objH2 = new R0.n(str, 3);
                    c0698o.e0(objH2);
                }
                z11 = false;
                rVarA = R0.m.a(rVar3, false, (p241y9.c) objH2);
            } else {
                z11 = false;
                rVarA = rVar3;
            }
            c0698o.p(z11);
            if (p171r0.i.a(bVar.d(), 9205357640488583168L)) {
                jD = bVar.d();
                if (Float.isInfinite(p171r0.i.d(jD))) {
                    rVar3 = f8483a;
                }
            } else {
                rVar3 = f8483a;
            }
            AbstractC0071n.a(androidx.compose.ui.draw.a.d(rVar2.b(rVar3), bVar, 0.0f, c1303l4, 22).b(rVarA), c0698o, 0);
        }
        rVar4 = rVar2;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new B0(bVar, str, rVar4, j, i10, i11, 1);
        }
    }

    public static final void b(C1442f c1442f, String str, l0.r rVar, long j, C0698o c0698o, int i10, int i11) {
        long j10;
        l0.r rVar2;
        c0698o.V(-126890956);
        int i12 = (c0698o.g(c1442f) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c0698o.g(rVar) ? 256 : 128;
        }
        int i14 = i12 | (((i11 & 8) == 0 && c0698o.f(j)) ? 2048 : 1024);
        if ((i14 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            j10 = j;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                if (i13 != 0) {
                    rVar = l0.o.f19333a;
                }
                if ((i11 & 8) != 0) {
                    j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                    i14 &= -7169;
                }
            } else {
                c0698o.N();
                if ((i11 & 8) != 0) {
                    i14 &= -7169;
                }
            }
            l0.r rVar3 = rVar;
            long j11 = j;
            c0698o.q();
            a(AbstractC1438b.c(c1442f, c0698o), str, rVar3, j11, c0698o, (i14 & 112) | 8 | (i14 & 896) | (i14 & 7168), 0);
            j10 = j11;
            rVar2 = rVar3;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new B0(c1442f, str, rVar2, j10, i10, i11, 0);
        }
    }
}
