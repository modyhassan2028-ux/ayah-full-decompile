package W;

import D.AbstractC0071n;
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
public abstract class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8894a = 0;

    public static final void a(Z0.y yVar, p241y9.c cVar, l0.r rVar, boolean z10, U0.L l10, W2.n nVar, K.V v10, K.U u8, boolean z11, int i10, int i11, p180s0.J j, L1 l11, C0698o c0698o, int i12) {
        U0.L l12;
        boolean z12;
        p180s0.J jA;
        int i13;
        int i14;
        W2.n nVar2;
        K.V v11;
        K.U u10;
        long j10;
        boolean z13;
        W2.n nVar3;
        p180s0.J j11;
        U0.L l13;
        c0698o.V(-1268528240);
        int i15 = i12 | (c0698o.g(yVar) ? 4 : 2) | (c0698o.g(rVar) ? 256 : 128) | 920218624;
        int i16 = 22 | (c0698o.g(l11) ? (char) 256 : (char) 128);
        if ((i15 & 306783379) == 306783378 && (i16 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            z13 = z10;
            l13 = l10;
            nVar3 = nVar;
            v11 = v10;
            u10 = u8;
            i14 = i10;
            i13 = i11;
            j11 = j;
        } else {
            c0698o.P();
            if ((i12 & 1) == 0 || c0698o.w()) {
                l12 = (U0.L) c0698o.k(AbstractC0542b2.f8991a);
                z12 = true;
                int i17 = z11 ? 1 : Integer.MAX_VALUE;
                P1 p10 = P1.f8759a;
                jA = AbstractC0537a1.a(4, c0698o);
                i13 = 1;
                i14 = i17;
                nVar2 = Z0.G.f10893a;
                v11 = K.V.f4547e;
                u10 = K.U.f4546a;
            } else {
                c0698o.N();
                z12 = z10;
                l12 = l10;
                nVar2 = nVar;
                v11 = v10;
                u10 = u8;
                i14 = i10;
                i13 = i11;
                jA = j;
            }
            c0698o.q();
            c0698o.T(-508241210);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new B.j();
                c0698o.e0(objH);
            }
            B.j jVar = (B.j) objH;
            boolean z14 = false;
            c0698o.p(false);
            c0698o.T(-508235100);
            long jB = l12.b();
            if (jB == 16) {
                boolean zBooleanValue = ((Boolean) p000a.a.r(jVar, c0698o, 0).getValue()).booleanValue();
                if (z12) {
                    j10 = zBooleanValue ? l11.f8657a : l11.f8658b;
                } else {
                    j10 = l11.f8659c;
                }
                jB = j10;
                z14 = false;
            }
            long j12 = jB;
            c0698o.p(z14);
            C0672b.a(O.V.f6342a.a(l11.f8665k), p074h0.j.d(-1163788208, new T1(rVar, l11, yVar, cVar, z12, l12.d(new U0.L(j12, 0L, null, 0L, 0, 0L, 16777214)), v11, u10, z11, i14, i13, nVar2, jVar, jA), c0698o), c0698o, 56);
            z13 = z12;
            nVar3 = nVar2;
            j11 = jA;
            l13 = l12;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new U1(yVar, cVar, rVar, z13, l13, nVar3, v11, u10, z11, i14, i13, j11, l11, i12);
        }
    }

    public static final void b(String str, p241y9.c cVar, l0.r rVar, boolean z10, U0.L l10, W2.n nVar, K.V v10, K.U u8, int i10, int i11, p180s0.J j, L1 l11, C0698o c0698o, int i12) {
        boolean z11;
        K.U u10;
        int i13;
        U0.L l12;
        p180s0.J j10;
        int i14;
        W2.n nVar2;
        long j11;
        boolean z12;
        W2.n nVar3;
        p180s0.J j12;
        U0.L l13;
        c0698o.V(-676242365);
        int i15 = i12 | (c0698o.g(str) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | 920218624;
        int i16 = (c0698o.g(v10) ? (char) 0 : (char) 0) | 28086;
        int i17 = (c0698o.g(l11) ? (char) 256 : (char) 128) | 22;
        if ((i15 & 306783379) == 306783378 && (i16 & 306783379) == 306783378 && (i17 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            z12 = z10;
            l13 = l10;
            nVar3 = nVar;
            u10 = u8;
            i13 = i10;
            i14 = i11;
            j12 = j;
        } else {
            c0698o.P();
            if ((i12 & 1) == 0 || c0698o.w()) {
                U0.L l14 = (U0.L) c0698o.k(AbstractC0542b2.f8991a);
                P1 p10 = P1.f8759a;
                p180s0.J jA = AbstractC0537a1.a(4, c0698o);
                z11 = true;
                W2.n nVar4 = Z0.G.f10893a;
                u10 = K.U.f4546a;
                i13 = Integer.MAX_VALUE;
                l12 = l14;
                j10 = jA;
                i14 = 1;
                nVar2 = nVar4;
            } else {
                c0698o.N();
                z11 = z10;
                l12 = l10;
                nVar2 = nVar;
                u10 = u8;
                i13 = i10;
                i14 = i11;
                j10 = j;
            }
            c0698o.q();
            c0698o.T(-508515290);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new B.j();
                c0698o.e0(objH);
            }
            B.j jVar = (B.j) objH;
            boolean z13 = false;
            c0698o.p(false);
            c0698o.T(-508509180);
            long jB = l12.b();
            if (jB == 16) {
                boolean zBooleanValue = ((Boolean) p000a.a.r(jVar, c0698o, 0).getValue()).booleanValue();
                if (z11) {
                    j11 = zBooleanValue ? l11.f8657a : l11.f8658b;
                } else {
                    j11 = l11.f8659c;
                }
                jB = j11;
                z13 = false;
            }
            long j13 = jB;
            c0698o.p(z13);
            C0672b.a(O.V.f6342a.a(l11.f8665k), p074h0.j.d(1859145987, new Q1(rVar, l11, str, cVar, z11, l12.d(new U0.L(j13, 0L, null, 0L, 0, 0L, 16777214)), v10, u10, i13, i14, nVar2, jVar, j10), c0698o), c0698o, 56);
            z12 = z11;
            nVar3 = nVar2;
            j12 = j10;
            l13 = l12;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new R1(str, cVar, rVar, z12, l13, nVar3, v10, u10, i13, i14, j12, l11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    public static final void c(p241y9.e eVar, p241y9.e eVar2, p241y9.f fVar, p241y9.e eVar3, p241y9.e eVar4, p241y9.e eVar5, p241y9.e eVar6, boolean z10, float f3, p074h0.d dVar, p241y9.e eVar7, D.P p10, C0698o c0698o, int i10, int i11) {
        int i12;
        int i13;
        D.P p11;
        l0.j jVar;
        l0.j jVar2;
        float f7;
        p241y9.e eVar8;
        float f10;
        p241y9.f fVar2;
        p241y9.e eVar9;
        p241y9.e eVar10;
        boolean z11;
        l0.j jVar3 = l0.c.f19317v;
        l0.j jVar4 = l0.c.f19313r;
        c0698o.V(-1830307184);
        int i14 = i10 & 6;
        l0.o oVar = l0.o.f19333a;
        if (i14 == 0) {
            i12 = i10 | (c0698o.g(oVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.i(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.i(eVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.i(fVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.i(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.i(eVar4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0698o.i(eVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c0698o.i(eVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c0698o.h(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0698o.d(f3) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0698o.i(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0698o.i(eVar7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            p11 = p10;
            i13 |= c0698o.g(p11) ? 256 : 128;
        } else {
            p11 = p10;
        }
        int i15 = i13;
        if ((i12 & 306783379) == 306783378 && (i15 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            eVar10 = eVar7;
            eVar9 = eVar;
            fVar2 = fVar;
            f10 = f3;
        } else {
            boolean z12 = ((i12 & 234881024) == 67108864) | ((i12 & 1879048192) == 536870912) | ((i15 & 896) == 256);
            Object objH = c0698o.H();
            if (z12 || objH == C0690k.f10683a) {
                objH = new Y1(z10, f3, p11);
                c0698o.e0(objH);
            }
            Y1 y10 = (Y1) objH;
            p063g1.m mVar = (p063g1.m) c0698o.k(AbstractC0359n0.f5123n);
            int i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, oVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, y10, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                p123m2.c.y(i16, c0698o, i16, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            dVar.invoke(c0698o, Integer.valueOf(i15 & 14));
            c0698o.T(1341517187);
            if (eVar3 != null) {
                l0.r rVarB = androidx.compose.ui.layout.a.c(oVar, "Leading").b(X.M.f9717i);
                jVar = jVar3;
                H0.I iD = AbstractC0071n.d(jVar, false);
                int i17 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                l0.r rVarC2 = l0.a.c(c0698o, rVarB);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i17))) {
                    p123m2.c.y(i17, c0698o, i17, c0285h3);
                }
                C0672b.v(c0698o, rVarC2, c0285h4);
                eVar3.invoke(c0698o, Integer.valueOf((i12 >> 12) & 14));
                c0698o.p(true);
            } else {
                jVar = jVar3;
            }
            ?? r10 = 0;
            c0698o.p(false);
            c0698o.T(1341526310);
            if (eVar4 != null) {
                l0.r rVarB2 = androidx.compose.ui.layout.a.c(oVar, "Trailing").b(X.M.f9717i);
                H0.I iD2 = AbstractC0071n.d(jVar, false);
                int i18 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
                l0.r rVarC3 = l0.a.c(c0698o, rVarB2);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD2, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i18))) {
                    p123m2.c.y(i18, c0698o, i18, c0285h3);
                }
                C0672b.v(c0698o, rVarC3, c0285h4);
                eVar4.invoke(c0698o, Integer.valueOf((i12 >> 15) & 14));
                c0698o.p(true);
                r10 = 0;
            }
            c0698o.p(r10);
            float fD = androidx.compose.foundation.layout.b.d(p11, mVar);
            float fC = androidx.compose.foundation.layout.b.c(p11, mVar);
            if (eVar3 != null) {
                fD -= X.M.f9712c;
                float f11 = (float) r10;
                if (fD < f11) {
                    fD = f11;
                }
            }
            float f12 = fD;
            if (eVar4 != null) {
                fC -= X.M.f9712c;
                float f13 = (float) r10;
                if (fC < f13) {
                    fC = f13;
                }
            }
            c0698o.T(1341556924);
            if (eVar5 != null) {
                l0.r rVarL = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(oVar, "Prefix"), X.M.f9715f, 0.0f, 2)), f12, 0.0f, X.M.f9714e, 0.0f, 10);
                jVar2 = jVar4;
                H0.I iD3 = AbstractC0071n.d(jVar2, false);
                int i19 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M4 = c0698o.m();
                l0.r rVarC4 = l0.a.c(c0698o, rVarL);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD3, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M4, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i19))) {
                    p123m2.c.y(i19, c0698o, i19, c0285h3);
                }
                C0672b.v(c0698o, rVarC4, c0285h4);
                eVar5.invoke(c0698o, Integer.valueOf((i12 >> 18) & 14));
                c0698o.p(true);
            } else {
                jVar2 = jVar4;
            }
            c0698o.p(false);
            c0698o.T(1341568890);
            if (eVar6 != null) {
                float f14 = fC;
                l0.r rVarL2 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(oVar, "Suffix"), X.M.f9715f, 0.0f, 2)), X.M.f9714e, 0.0f, f14, 0.0f, 10);
                f7 = f14;
                H0.I iD4 = AbstractC0071n.d(jVar2, false);
                int i20 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M5 = c0698o.m();
                l0.r rVarC5 = l0.a.c(c0698o, rVarL2);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD4, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M5, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i20))) {
                    p123m2.c.y(i20, c0698o, i20, c0285h3);
                }
                C0672b.v(c0698o, rVarC5, c0285h4);
                eVar8 = eVar6;
                eVar8.invoke(c0698o, Integer.valueOf((i12 >> 21) & 14));
                c0698o.p(true);
            } else {
                f7 = fC;
                eVar8 = eVar6;
            }
            c0698o.p(false);
            c0698o.T(1341581092);
            if (eVar2 != null) {
                f10 = f3;
                l0.r rVarL3 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(oVar, "Label"), B9.a.L(X.M.f9715f, X.M.g, f10), 0.0f, 2)), f12, 0.0f, f7, 0.0f, 10);
                H0.I iD5 = AbstractC0071n.d(jVar2, false);
                int i21 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M6 = c0698o.m();
                l0.r rVarC6 = l0.a.c(c0698o, rVarL3);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD5, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M6, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i21))) {
                    p123m2.c.y(i21, c0698o, i21, c0285h3);
                }
                C0672b.v(c0698o, rVarC6, c0285h4);
                eVar2.invoke(c0698o, Integer.valueOf((i12 >> 6) & 14));
                c0698o.p(true);
            } else {
                f10 = f3;
            }
            c0698o.p(false);
            l0.r rVarL4 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(oVar, X.M.f9715f, 0.0f, 2)), eVar5 == null ? f12 : 0, 0.0f, eVar8 == null ? f7 : 0, 0.0f, 10);
            c0698o.T(1341611627);
            if (fVar != null) {
                fVar2 = fVar;
                fVar2.d(androidx.compose.ui.layout.a.c(oVar, "Hint").b(rVarL4), c0698o, Integer.valueOf((i12 >> 6) & 112));
            } else {
                fVar2 = fVar;
            }
            c0698o.p(false);
            l0.r rVarB3 = androidx.compose.ui.layout.a.c(oVar, "TextField").b(rVarL4);
            H0.I iD6 = AbstractC0071n.d(jVar2, true);
            int i22 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M7 = c0698o.m();
            l0.r rVarC7 = l0.a.c(c0698o, rVarB3);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD6, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M7, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i22))) {
                p123m2.c.y(i22, c0698o, i22, c0285h3);
            }
            C0672b.v(c0698o, rVarC7, c0285h4);
            eVar9 = eVar;
            eVar9.invoke(c0698o, Integer.valueOf((i12 >> 3) & 14));
            c0698o.p(true);
            c0698o.T(1341622624);
            if (eVar7 != null) {
                l0.r rVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(oVar, "Supporting"), X.M.f9716h, 0.0f, 2)), P1.d());
                H0.I iD7 = AbstractC0071n.d(jVar2, false);
                int i23 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M8 = c0698o.m();
                l0.r rVarC8 = l0.a.c(c0698o, rVarG);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD7, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M8, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i23))) {
                    p123m2.c.y(i23, c0698o, i23, c0285h3);
                }
                C0672b.v(c0698o, rVarC8, c0285h4);
                eVar10 = eVar7;
                eVar10.invoke(c0698o, Integer.valueOf((i15 >> 3) & 14));
                z11 = true;
                c0698o.p(true);
            } else {
                eVar10 = eVar7;
                z11 = true;
            }
            c0698o.p(false);
            c0698o.p(z11);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new V1(eVar9, eVar2, fVar2, eVar3, eVar4, eVar5, eVar6, z10, f10, dVar, eVar10, p11, i10, i11);
        }
    }

    public static final int d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f3, long j, float f7, D.P p10) {
        boolean z10 = i11 > 0;
        float fL = (p10.f909b + p10.f911d) * f7;
        if (z10) {
            fL = B9.a.L(X.M.f9711b * 2 * f7, fL, f3);
        }
        int[] iArr = {i16, i14, i15, B9.a.M(i11, f3, 0)};
        for (int i18 = 0; i18 < 4; i18++) {
            i10 = Math.max(i10, iArr[i18]);
        }
        return Math.max(p063g1.a.i(j), Math.max(i12, Math.max(i13, B9.a.V(fL + B9.a.M(0, f3, i11) + i10))) + i17);
    }

    public static final int e(boolean z10, int i10, int i11, H0.U u8) {
        if (!z10) {
            return i11;
        }
        return Math.round((1 + 0.0f) * ((i10 - u8.f3169s) / 2.0f));
    }
}
