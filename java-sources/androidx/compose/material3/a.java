package androidx.compose.material3;

import B.j;
import D.AbstractC0071n;
import Ga.n;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import R0.g;
import W.AbstractC0537a1;
import W.D0;
import W.J1;
import W.K1;
import W.W0;
import Y.q;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.f;
import androidx.compose.foundation.selection.b;
import l0.o;
import l0.r;
import p180s0.J;
import p180s0.L;
import p223x.InterfaceC1433w;
import p223x.Y;
import p223x.u0;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Y f11924f;
    public static final u0 g;

    static {
        float f3 = q.f10228b;
        f11919a = f3;
        f11920b = q.g;
        f11921c = q.f10232f;
        float f7 = q.f10230d;
        f11922d = f7;
        f11923e = (f7 - f3) / 2;
        f11924f = new Y();
        g = new u0(100, (InterfaceC1433w) null, 6);
    }

    public static final void a(boolean z10, c cVar, r rVar, boolean z11, J1 j10, C0698o c0698o, int i10) {
        int i11;
        boolean z12;
        r rVar2;
        boolean z13;
        r rVar3;
        c0698o.V(1580463220);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o.h(z10) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(cVar) ? 32 : 16;
        }
        int i12 = i11 | 28032;
        if ((i10 & 196608) == 0) {
            i12 |= c0698o.g(j10) ? 131072 : 65536;
        }
        int i13 = i12 | 1572864;
        if ((599187 & i13) == 599186 && c0698o.x()) {
            c0698o.N();
            rVar3 = rVar;
            z13 = z11;
        } else {
            c0698o.P();
            int i14 = i10 & 1;
            r rVarB = o.f19333a;
            if (i14 == 0 || c0698o.w()) {
                z12 = true;
                rVar2 = rVarB;
            } else {
                c0698o.N();
                rVar2 = rVar;
                z12 = z11;
            }
            c0698o.q();
            c0698o.T(783532531);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new j();
                c0698o.e0(objH);
            }
            j jVar = (j) objH;
            c0698o.p(false);
            if (cVar != null) {
                M0 m10 = D0.f8496a;
                rVarB = b.b(MinimumInteractiveModifier.f11916a, z10, jVar, z12, new g(2), cVar);
                jVar = jVar;
            }
            boolean z14 = z12;
            r rVarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.q(rVar2.b(rVarB), l0.c.f19317v), f11921c, f11922d);
            float f3 = q.f10227a;
            int i15 = i13 << 3;
            int i16 = i13 >> 6;
            b(rVarH, z10, z14, j10, jVar, AbstractC0537a1.a(5, c0698o), c0698o, (i15 & 57344) | (i15 & 112) | (i16 & 896) | (i16 & 7168));
            z13 = z14;
            rVar3 = rVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K1(z10, cVar, rVar3, z13, j10, i10);
        }
    }

    public static final void b(r rVar, boolean z10, boolean z11, J1 j10, j jVar, J j, C0698o c0698o, int i10) {
        int i11;
        long j11;
        long j12;
        long j13;
        c0698o.V(-1594099146);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.h(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.g(jVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.g(j) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && c0698o.x()) {
            c0698o.N();
        } else {
            if (z11) {
                j11 = z10 ? j10.f8610b : j10.f8614f;
            } else {
                j11 = z10 ? j10.j : j10.f8620n;
            }
            if (z11) {
                j12 = z10 ? j10.f8609a : j10.f8613e;
            } else {
                j12 = z10 ? j10.f8616i : j10.f8619m;
            }
            float f3 = q.f10227a;
            J jA = AbstractC0537a1.a(5, c0698o);
            float f7 = q.f10231e;
            if (z11) {
                j13 = z10 ? j10.f8611c : j10.g;
            } else {
                j13 = z10 ? j10.f8617k : j10.f8621o;
            }
            r rVarA = androidx.compose.foundation.a.a(rVar.b(new BorderModifierNodeElement(f7, new L(j13), jA)), j11, jA);
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarA);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            r rVarA2 = androidx.compose.foundation.a.a(f.a(androidx.compose.foundation.layout.a.f11825a.a(o.f19333a, l0.c.f19316u).b(new ThumbElement(jVar, z10)), jVar, W0.c(false, q.f10229c / 2, c0698o, 54, 4)), j12, j);
            I iD2 = AbstractC0071n.d(l0.c.f19317v, false);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarA2);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            c0698o.T(1163457794);
            c0698o.p(false);
            c0698o.p(true);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new n(rVar, z10, z11, j10, jVar, j, i10);
        }
    }
}
