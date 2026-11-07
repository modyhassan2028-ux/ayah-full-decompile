package W;

import A.EnumC0047u0;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0059b;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8556a = 125;

    public static final void a(H1 h7, p074h0.d dVar, l0.r rVar, boolean z10, boolean z11, p074h0.d dVar2, C0698o c0698o, int i10) {
        int i11;
        boolean z12;
        p074h0.d dVar3 = dVar2;
        c0698o.V(-402577235);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(h7) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.h(true) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((1572864 & i10) == 0) {
            i12 |= c0698o.i(dVar3) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && c0698o.x()) {
            c0698o.N();
            z12 = z11;
        } else {
            boolean z13 = c0698o.k(AbstractC0359n0.f5123n) == p063g1.m.f16262s;
            X.s sVar = h7.f8579b;
            boolean z14 = ((I1) sVar.g.getValue()) == I1.f8597t;
            EnumC0047u0 enumC0047u0 = EnumC0047u0.f425s;
            l0.r rVarB = androidx.compose.material3.internal.a.b(rVar, sVar, enumC0047u0, z14);
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarB);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, iD, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            l0.r rVarB2 = androidx.compose.foundation.layout.a.f11825a.b();
            int i14 = (i12 << 6) & 7168;
            C0059b c0059b = AbstractC0066i.f977a;
            l0.i iVar = l0.c.f19306A;
            D.W wA = D.U.a(c0059b, iVar, c0698o, 0);
            int i15 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            l0.r rVarC2 = l0.a.c(c0698o, rVarB2);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o, i15, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            Integer numValueOf = Integer.valueOf(((i14 >> 6) & 112) | 6);
            D.X x9 = D.X.f924a;
            dVar.d(x9, c0698o, numValueOf);
            c0698o.p(true);
            X.s sVar2 = h7.f8579b;
            boolean zH = ((i12 & 7168) == 2048) | c0698o.h(z13) | ((57344 & i12) == 16384) | ((i12 & 14) == 4);
            Object objH = c0698o.H();
            if (zH || objH == C0690k.f10683a) {
                objH = new E1(h7, z10, z13);
                c0698o.e0(objH);
            }
            l0.r rVarD = androidx.compose.material3.internal.a.d(l0.o.f19333a, sVar2, enumC0047u0, (p241y9.e) objH);
            int i16 = (i12 >> 9) & 7168;
            D.W wA2 = D.U.a(c0059b, iVar, c0698o, 0);
            int i17 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            l0.r rVarC3 = l0.a.c(c0698o, rVarD);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i17))) {
                p123m2.c.y(i17, c0698o, i17, c0285h3);
            }
            C0672b.v(c0698o, rVarC3, c0285h4);
            dVar3 = dVar2;
            dVar3.d(x9, c0698o, Integer.valueOf(((i16 >> 6) & 112) | 6));
            c0698o.p(true);
            c0698o.p(true);
            z12 = true;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new Ga.n(h7, dVar, rVar, z10, z12, dVar3, i10);
        }
    }
}
