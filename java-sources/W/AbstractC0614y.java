package W;

import D.AbstractC0060c;
import D.AbstractC0071n;
import D.C0059b;
import D.InterfaceC0062e;
import D.InterfaceC0064g;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;
import Z.InterfaceC0687i0;
import java.util.WeakHashMap;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.C1429s;

/* JADX INFO: renamed from: W.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0614y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9462b;

    static {
        new C1429s(0.8f, 0.8f, 0.15f);
        float f3 = 4;
        f9461a = f3;
        f9462b = 16 - f3;
    }

    public static final void a(l0.r rVar, p074h0.d dVar, U0.L l10, p241y9.e eVar, p241y9.f fVar, float f3, D.d0 d0Var, E2 e10, C0698o c0698o, int i10) {
        int i11;
        long j;
        float f7;
        c0698o.V(-342194911);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(l10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(eVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.d(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0698o.g(d0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0698o.g(e10) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c0698o.g(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && c0698o.x()) {
            c0698o.N();
        } else {
            if (Float.isNaN(f3) || f3 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float fW = ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(f3);
            if (fW < 0.0f) {
                fW = 0.0f;
            }
            int i12 = i11 & 1879048192;
            boolean zD = (i12 == 536870912) | c0698o.d(fW);
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (zD || objH == s10) {
                objH = new C0564h0(0, 12);
                c0698o.e0(objH);
            }
            C0672b.h((p241y9.a) objH, c0698o);
            boolean z10 = i12 == 536870912;
            Object objH2 = c0698o.H();
            if (z10 || objH2 == s10) {
                objH2 = C0672b.o(new C0564h0(0, 13));
                c0698o.e0(objH2);
            }
            float fFloatValue = ((Number) ((Z.L0) objH2).getValue()).floatValue();
            long j10 = e10.f8529a;
            long j11 = e10.f8530b;
            float fA = AbstractC1434x.f24123c.a(fFloatValue);
            p187t0.l lVar = p187t0.d.f22534x;
            long jA = p180s0.q.a(j10, lVar);
            long jA2 = p180s0.q.a(j11, lVar);
            float fD = p180s0.q.d(jA);
            float fH = p180s0.q.h(jA);
            float fG = p180s0.q.g(jA);
            float fE = p180s0.q.e(jA);
            float fD2 = p180s0.q.d(jA2);
            float fH2 = p180s0.q.h(jA2);
            float fG2 = p180s0.q.g(jA2);
            float fE2 = p180s0.q.e(jA2);
            float f10 = fA >= 0.0f ? fA : 0.0f;
            if (f10 > 1.0f) {
                f7 = 1.0f;
                j = j11;
            } else {
                j = j11;
                f7 = f10;
            }
            Z.L0 l0A = p214w.L.a(p180s0.q.a(p180s0.F.i(B9.a.L(fH, fH2, f7), B9.a.L(fG, fG2, f7), B9.a.L(fE, fE2, f7), B9.a.L(fD, fD2, f7), lVar), p180s0.q.f(j)), AbstractC1413d.p(400.0f, 5, null), c0698o);
            p074h0.d dVarD = p074h0.j.d(1370231018, new A.R0(12, fVar), c0698o);
            c0698o.T(-1193605157);
            c0698o.p(false);
            C1.a(rVar.b(l0.o.f19333a), null, ((p180s0.q) l0A.getValue()).f21845a, 0L, 0.0f, 0.0f, null, p074h0.j.d(-1943739546, new C0596s(d0Var, f3, e10, dVar, l10, eVar, dVarD), c0698o), c0698o, 12582912, 122);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0599t(rVar, dVar, l10, eVar, fVar, f3, d0Var, e10, i10);
        }
    }

    public static final void b(p074h0.d dVar, l0.r rVar, p241y9.e eVar, p241y9.f fVar, float f3, D.d0 d0Var, E2 e10, C0698o c0698o, int i10, int i11) {
        int i12;
        E2 e11;
        float f7;
        p241y9.f fVar2;
        p241y9.e eVar2;
        int i13;
        D.d0 m10;
        l0.r rVar2;
        float f10;
        c0698o.V(226148675);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c0698o.i(eVar) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0698o.i(fVar) ? 2048 : 1024;
        }
        int i17 = i12 | 24576;
        if ((196608 & i10) == 0) {
            i17 = 90112 | i12;
        }
        if ((1572864 & i10) == 0) {
            e11 = e10;
            i17 |= c0698o.g(e11) ? 1048576 : 524288;
        } else {
            e11 = e10;
        }
        int i18 = i17 | 12582912;
        if ((4793491 & i18) == 4793490 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            eVar2 = eVar;
            fVar2 = fVar;
            f10 = f3;
            m10 = d0Var;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                if (i14 != 0) {
                    rVar = l0.o.f19333a;
                }
                p241y9.e eVar3 = i15 != 0 ? AbstractC0580m0.f9251a : eVar;
                p241y9.f fVar3 = i16 != 0 ? AbstractC0580m0.f9252b : fVar;
                float f11 = F2.f8543a;
                WeakHashMap weakHashMap = D.f0.f955u;
                f7 = f11;
                fVar2 = fVar3;
                eVar2 = eVar3;
                i13 = i18 & (-458753);
                m10 = new D.M(C0059b.f(c0698o).g, 16 | AbstractC0060c.g);
            } else {
                c0698o.N();
                i13 = i18 & (-458753);
                eVar2 = eVar;
                fVar2 = fVar;
                f7 = f3;
                m10 = d0Var;
            }
            c0698o.q();
            int i19 = ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112);
            int i20 = i13 << 6;
            int i21 = i19 | (57344 & i20) | (458752 & i20) | (234881024 & i20) | (i20 & 1879048192);
            E2 e12 = e11;
            l0.r rVar3 = rVar;
            a(rVar3, dVar, H2.a(Y.v.f10258c, c0698o), eVar2, fVar2, (p063g1.f.a(f7, Float.NaN) || p063g1.f.a(f7, Float.POSITIVE_INFINITY)) ? F2.f8543a : f7, m10, e12, c0698o, i21);
            rVar2 = rVar3;
            f10 = f7;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0602u(dVar, rVar2, eVar2, fVar2, f10, m10, e10, i10, i11);
        }
    }

    public static final void c(l0.r rVar, r rVar2, long j, long j10, long j11, p074h0.d dVar, U0.L l10, InterfaceC0064g interfaceC0064g, InterfaceC0062e interfaceC0062e, p241y9.e eVar, p074h0.d dVar2, C0698o c0698o, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        long j12 = j11;
        p074h0.d dVar3 = dVar2;
        c0698o.V(-742442296);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c0698o.g(rVar2) : c0698o.i(rVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.f(j) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.f(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.f(j12) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.i(dVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0698o.g(l10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0698o.d(1.0f) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0698o.g(interfaceC0064g) ? 67108864 : 33554432;
        }
        int i15 = i12;
        if ((i10 & 805306368) == 0) {
            i13 = i15 | (c0698o.g(interfaceC0062e) ? 536870912 : 268435456);
        } else {
            i13 = i15;
        }
        if ((i11 & 6) == 0) {
            i14 = i11 | (c0698o.e(0) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= c0698o.h(false) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= c0698o.i(eVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= c0698o.i(dVar3) ? 2048 : 1024;
        }
        int i16 = i14;
        if ((i13 & 306783379) == 306783378 && (i16 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
        } else {
            boolean z10 = ((i13 & 112) == 32 || ((i13 & 64) != 0 && c0698o.i(rVar2))) | ((i13 & 1879048192) == 536870912) | ((i13 & 234881024) == 67108864) | ((i16 & 14) == 4);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new C0608w(rVar2, interfaceC0062e, interfaceC0064g);
                c0698o.e0(objH);
            }
            H0.I i17 = (H0.I) objH;
            int i18 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, i17, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i18))) {
                p123m2.c.y(i18, c0698o, i18, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            l0.o oVar = l0.o.f19333a;
            l0.r rVarC2 = androidx.compose.ui.layout.a.c(oVar, "navigationIcon");
            float f3 = f9461a;
            l0.r rVarL = androidx.compose.foundation.layout.b.l(rVarC2, f3, 0.0f, 0.0f, 0.0f, 14);
            l0.j jVar = l0.c.f19313r;
            H0.I iD = AbstractC0071n.d(jVar, false);
            int i19 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            l0.r rVarC3 = l0.a.c(c0698o, rVarL);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i19))) {
                p123m2.c.y(i19, c0698o, i19, c0285h3);
            }
            C0672b.v(c0698o, rVarC3, c0285h4);
            C0709z c0709z = AbstractC0592q0.f9328a;
            C0672b.a(c0709z.a(new p180s0.q(j)), eVar, c0698o, ((i16 >> 3) & 112) | 8);
            c0698o.p(true);
            l0.r rVarB = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.b.j(androidx.compose.ui.layout.a.c(oVar, "title"), f3, 0.0f, 2).b(oVar), 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, null, false, 131067);
            H0.I iD2 = AbstractC0071n.d(jVar, false);
            int i20 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            l0.r rVarC4 = l0.a.c(c0698o, rVarB);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i20))) {
                p123m2.c.y(i20, c0698o, i20, c0285h3);
            }
            C0672b.v(c0698o, rVarC4, c0285h4);
            int i21 = i13 >> 9;
            X.t.b(j10, l10, dVar, c0698o, (i21 & 14) | ((i13 >> 15) & 112) | (i21 & 896));
            c0698o.p(true);
            l0.r rVarL2 = androidx.compose.foundation.layout.b.l(androidx.compose.ui.layout.a.c(oVar, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            H0.I iD3 = AbstractC0071n.d(jVar, false);
            int i22 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M4 = c0698o.m();
            l0.r rVarC5 = l0.a.c(c0698o, rVarL2);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD3, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M4, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i22))) {
                p123m2.c.y(i22, c0698o, i22, c0285h3);
            }
            C0672b.v(c0698o, rVarC5, c0285h4);
            j12 = j11;
            dVar3 = dVar2;
            C0672b.a(c0709z.a(new p180s0.q(j12)), dVar3, c0698o, 8 | ((i16 >> 6) & 112));
            c0698o.p(true);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0611x(rVar, rVar2, j, j10, j12, dVar, l10, interfaceC0064g, interfaceC0062e, eVar, dVar3, i10, i11);
        }
    }
}
