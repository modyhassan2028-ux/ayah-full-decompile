package H4;

import D.AbstractC0066i;
import D.P;
import D.U;
import D.W;
import D.X;
import E4.p;
import E4.t;
import E4.u;
import J0.AbstractC0274a0;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import N9.InterfaceC0415h;
import W.AbstractC0542b2;
import W.C1;
import W.Q;
import W.S;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import androidx.compose.ui.ZIndexElement;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.text.NumberFormat;
import java.util.List;
import l0.o;
import l0.r;
import p110k9.y;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f3356a = new p074h0.d(1468926287, new A5.d(7), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f3357b = new p074h0.d(453326121, new A5.d(8), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p074h0.d f3358c = new p074h0.d(1867437353, new A5.d(9), false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r23v0, types: [Z.o] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [G4.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void a(u uVar, r rVar, p241y9.c cVar, C0698o c0698o, int i10) {
        long jG;
        j.e(uVar, "playUntilType");
        j.e(cVar, "onPlayUntilTypeChange");
        c0698o.V(1427859044);
        int i11 = 4;
        int i12 = i10 | (c0698o.e(uVar.ordinal()) ? 4 : 2);
        ?? r10 = 0;
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            List listS = l.S(new u[]{u.f1886r, u.f1887s, u.f1888t});
            final List listS2 = l.S(new Integer[]{Integer.valueOf(R.string.to_ayat), Integer.valueOf(R.string.to_pages), Integer.valueOf(R.string.to_suras)});
            W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o, 0);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            c0698o.T(99322446);
            final int i14 = 0;
            for (Object obj : listS) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC0813f2.T();
                    throw null;
                }
                u uVar2 = (u) obj;
                if (uVar == uVar2) {
                    c0698o.T(2140547090);
                    jG = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).c();
                    c0698o.p(r10);
                } else {
                    c0698o.T(2140603944);
                    jG = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).g();
                    c0698o.p(r10);
                }
                J.d dVarA = i14 == 0 ? J.e.a(10, r10, r10, 10) : i14 == listS.size() - 1 ? J.e.a(r10, 10, 10, r10) : J.e.a(r10, r10, r10, r10);
                P p10 = S.f8804a;
                Q qC = S.c(jG, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).m(), c0698o, 12);
                r rVarB = ((AbstractC0274a0) androidx.compose.foundation.layout.b.f(i14 * (-1), (float) r10)).b(new ZIndexElement(uVar == uVar2 ? 1.0f : 0.0f));
                boolean zE = c0698o.e(uVar2.ordinal());
                ?? H10 = c0698o.H();
                if (zE || H10 == C0690k.f10683a) {
                    H10 = new G4.f(i11, cVar, uVar2);
                    c0698o.e0(H10);
                }
                V0.i((p241y9.a) H10, rVarB, false, dVarA, qC, null, null, p074h0.j.d(1683019503, new p241y9.f() { // from class: H4.c
                    @Override // p241y9.f
                    public final Object d(Object obj2, Object obj3, Object obj4) {
                        C0698o c0698o2 = (C0698o) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        j.e((X) obj2, "$this$OutlinedButton");
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                            AbstractC0542b2.b(p000a.a.m0(((Number) listS2.get(i14)).intValue(), c0698o2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o2, 0, 0, 131070);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, 805306368, 484);
                r10 = r10 == true ? 1 : 0;
                i14 = i15;
                i11 = 4;
            }
            c0698o.p(r10);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(uVar, rVar, cVar, i10, 2);
        }
    }

    public static final void b(InterfaceC0415h interfaceC0415h, p241y9.c cVar, p241y9.c cVar2, r rVar, NumberFormat numberFormat, C0698o c0698o, int i10) {
        r rVar2;
        r rVar3;
        p217w2.b bVarA;
        j.e(interfaceC0415h, "playUntilDetailsModel");
        j.e(cVar, "ayahOperationsHandler");
        j.e(cVar2, "playUntilTypeChanged");
        c0698o.V(-487063145);
        int i11 = i10 | (c0698o.i(interfaceC0415h) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | (c0698o.i(cVar2) ? 256 : 128) | 3072 | (c0698o.i(numberFormat) ? 16384 : 8192);
        if (c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                rVar3 = o.f19333a;
            } else {
                c0698o.N();
                rVar3 = rVar;
            }
            c0698o.q();
            t tVar = (t) C0672b.k(interfaceC0415h, null, null, c0698o, (i11 & 14) | 48, 2).getValue();
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = C0672b.r(u.f1886r);
                c0698o.e0(objH);
            }
            Z.X x9 = (Z.X) objH;
            p217w2.b bVarA2 = null;
            va.g gVar = tVar != null ? tVar.f1885b : null;
            p pVar = gVar instanceof p ? (p) gVar : null;
            InterfaceC0415h interfaceC0415h2 = pVar != null ? pVar.f1880c : null;
            if (interfaceC0415h2 == null) {
                c0698o.T(-1698071472);
                c0698o.p(false);
                bVarA = null;
            } else {
                c0698o.T(83770833);
                bVarA = p217w2.d.a(interfaceC0415h2, c0698o);
                c0698o.p(false);
            }
            va.g gVar2 = tVar != null ? tVar.f1885b : null;
            E4.r rVar4 = gVar2 instanceof E4.r ? (E4.r) gVar2 : null;
            InterfaceC0415h interfaceC0415h3 = rVar4 != null ? rVar4.f1882c : null;
            if (interfaceC0415h3 == null) {
                c0698o.T(-1697980208);
            } else {
                c0698o.T(83773777);
                bVarA2 = p217w2.d.a(interfaceC0415h3, c0698o);
            }
            c0698o.p(false);
            C1.a(rVar3.b(androidx.compose.foundation.layout.c.f11826a), null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, p074h0.j.d(-1080937636, new e(tVar, numberFormat, cVar, bVarA, bVarA2, x9, cVar2), c0698o), c0698o, 12582912, 122);
            rVar2 = rVar3;
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.c(interfaceC0415h, cVar, cVar2, rVar2, numberFormat, i10);
        }
    }

    public static final E4.f c(p124m3.j jVar, p165q3.j jVar2) {
        return new E4.f(jVar.f19585a, jVar.f19595m, jVar.f19586b, jVar.f19596n.f19537m, jVar.c(), jVar2);
    }
}
