package G;

import A.C0007a;
import A.M0;
import D0.C0086d;
import Z.AbstractC0693l0;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: renamed from: G.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0190y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0185t[] f2761a = new C0185t[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F1.b f2762b = new F1.b(1);

    public static final void a(p241y9.a aVar, l0.r rVar, L l10, p241y9.e eVar, C0698o c0698o, int i10) {
        c0698o.V(2002163445);
        int i11 = (c0698o.i(aVar) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | (c0698o.g(l10) ? 256 : 128) | (c0698o.i(eVar) ? 2048 : 1024);
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            c(p074h0.j.d(-1488997347, new androidx.compose.foundation.lazy.layout.c(l10, rVar, eVar, C0672b.u(aVar, c0698o)), c0698o), c0698o, 6);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new E(aVar, rVar, l10, eVar, i10, 0);
        }
    }

    public static final void b(Object obj, int i10, I i11, p074h0.d dVar, C0698o c0698o, int i12) {
        int i13;
        c0698o.V(-2079116560);
        if ((i12 & 6) == 0) {
            i13 = (c0698o.i(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c0698o.e(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c0698o.i(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0698o.i(dVar) ? 2048 : 1024;
        }
        if (c0698o.K(i13 & 1, (i13 & 1171) != 1170)) {
            boolean zG = c0698o.g(obj) | c0698o.g(i11);
            Object objH = c0698o.H();
            Object obj2 = C0690k.f10683a;
            if (zG || objH == obj2) {
                objH = new H(obj, i11);
                c0698o.e0(objH);
            }
            H h7 = (H) objH;
            h7.f2590c = i10;
            C0681f0 c0681f0 = h7.g;
            AbstractC0693l0 abstractC0693l0 = H0.S.f3166a;
            H h10 = (H) c0698o.k(abstractC0693l0);
            p093j0.i iVarC = p093j0.s.c();
            p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
            p093j0.i iVarD = p093j0.s.d(iVarC);
            try {
                if (h10 != ((H) c0681f0.getValue())) {
                    c0681f0.setValue(h10);
                    if (h7.f2591d > 0) {
                        H h11 = h7.f2592e;
                        if (h11 != null) {
                            h11.b();
                        }
                        if (h10 != null) {
                            h10.a();
                        } else {
                            h10 = null;
                        }
                        h7.f2592e = h10;
                    }
                }
                p093j0.s.g(iVarC, iVarD, cVarE);
                boolean zG2 = c0698o.g(h7);
                Object objH2 = c0698o.H();
                if (zG2 || objH2 == obj2) {
                    objH2 = new M0(7, h7);
                    c0698o.e0(objH2);
                }
                C0672b.d(h7, (p241y9.c) objH2, c0698o);
                C0672b.a(abstractC0693l0.a(h7), dVar, c0698o, ((i13 >> 6) & 112) | 8);
            } catch (Throwable th) {
                p093j0.s.g(iVarC, iVarD, cVarE);
                throw th;
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D(obj, i10, i11, dVar, i12);
        }
    }

    public static final void c(p074h0.d dVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        c0698o.V(674185128);
        int i11 = 0;
        int i12 = 1;
        if (c0698o.K(i10 & 1, (i10 & 3) != 2)) {
            Z.M0 m10 = p085i0.l.f16731a;
            p085i0.j jVar = (p085i0.j) c0698o.k(m10);
            p085i0.g gVarY = B0.c.Y(c0698o);
            Object[] objArr = {jVar};
            C0007a c0007a = new C0007a(6, jVar, gVarY);
            p085i0.n nVar = p085i0.o.f16735a;
            p085i0.n nVar2 = new p085i0.n(i11, X.f2646r, c0007a);
            boolean zI = c0698o.i(jVar) | c0698o.i(gVarY);
            Object objH = c0698o.H();
            if (zI || objH == C0690k.f10683a) {
                objH = new C0086d(i12, jVar, gVarY);
                c0698o.e0(objH);
            }
            p241y9.a aVar = (p241y9.a) objH;
            c0698o2 = c0698o;
            Y y10 = (Y) va.g.H(objArr, nVar2, aVar, c0698o2, 0, 4);
            C0672b.a(m10.a(y10), p074h0.j.d(1863926504, new A.K(4, dVar, y10), c0698o2), c0698o2, 56);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new Z(dVar, i10, 0);
        }
    }

    public static final void d(F.i iVar, Object obj, int i10, Object obj2, C0698o c0698o, int i11) {
        int i12;
        c0698o.V(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (c0698o.g(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o.g(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o.e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0698o.g(obj2) ? 2048 : 1024;
        }
        if (c0698o.K(i12 & 1, (i12 & 1171) != 1170)) {
            ((p085i0.c) obj).a(obj2, p074h0.j.d(980966366, new C(i10, iVar, obj2), c0698o), c0698o, 48);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D(iVar, obj, i10, obj2, i11);
        }
    }

    public static final int e(int i10, p011b0.e eVar) {
        int i11 = eVar.f13127t - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = eVar.f13125r;
            int i14 = ((C0175i) objArr[i13]).f2700a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((C0175i) objArr[i12]).f2700a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final int f(int i10, F.i iVar, Object obj) {
        int iF;
        return (obj == null || iVar.b() == 0 || (i10 < iVar.b() && obj.equals(iVar.c(i10))) || (iF = iVar.f2057d.f(obj)) == -1) ? i10 : iF;
    }
}
