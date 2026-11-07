package W;

import A.C0007a;
import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0068k;
import D.C0076t;
import D0.C0086d;
import Ga.C0200i;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import O.C0438f;
import O.C0449q;
import Z.AbstractC0693l0;
import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0707x;
import Z.C0709z;
import Z.InterfaceC0687i0;
import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.material3.ClockDialModifier;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.lifecycle.InterfaceC0771u;
import com.ayah.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p223x.AbstractC1413d;
import u.AbstractC1354i;

/* JADX INFO: loaded from: classes.dex */
public abstract class A2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8456e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u.s f8459i;
    public static final u.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f8460k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8452a = 101;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8453b = 69;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8454c = 36;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f8457f = 74;
    public static final float g = 48;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u.s f8458h = AbstractC1354i.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f3 = 24;
        f8455d = f3;
        f8456e = f3;
        u.s sVarA = AbstractC1354i.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f8459i = sVarA;
        u.s sVar = new u.s(sVarA.f22758b);
        int[] iArr = sVarA.f22757a;
        int i10 = sVarA.f22758b;
        for (int i11 = 0; i11 < i10; i11++) {
            sVar.a((iArr[i11] % 12) + 12);
        }
        j = sVar;
        f8460k = 12;
    }

    public static final void a(C2 c10, C0554e2 c0554e2, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(c0554e2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            C0672b.b(new C0695m0[]{AbstractC0542b2.f8991a.a(H2.a(Y.s.f10249r, c0698o)), AbstractC0359n0.f5123n.a(p063g1.m.f16261r)}, p074h0.j.d(-477913269, new A.K(11, c10, c0554e2), c0698o), c0698o, 56);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i2(c10, c0554e2, i10, 0);
        }
    }

    public static final void b(C0576l c0576l, C0554e2 c0554e2, boolean z10, C0698o c0698o, int i10) {
        int i11;
        C0698o c0698o2;
        c0698o.V(-1170157036);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(c0576l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(c0554e2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.h(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            c0698o2 = c0698o;
        } else {
            c0698o2 = c0698o;
            p181s2.s.a(c0576l.f9222a.c() == 1 ? f8458h : f8459i, androidx.compose.ui.draw.a.c(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.a.a(l0.o.f19333a, c0554e2.f9042a, J.e.f3871a).b(new ClockDialModifier(c0576l, z10, c0576l.f9222a.c())), Y.s.f10234a), new C0007a(27, c0576l, c0554e2)), AbstractC1413d.q(200, 0, null, 6), null, p074h0.j.d(-1022006568, new K.p0(c0554e2, c0576l, z10), c0698o), c0698o2, 24960);
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0438f(c0576l, c0554e2, z10, i10, 2);
        }
    }

    public static final void c(C2 c10, C0554e2 c0554e2, C0698o c0698o, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        c0698o.V(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(c0554e2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            C0076t c0076tA = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o, 6);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.o oVar = l0.o.f19333a;
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
            C0672b.v(c0698o, c0076tA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            a(c10, c0554e2, c0698o, i11 & 126);
            c0698o.T(919638492);
            if (c10.d()) {
                z10 = true;
                z11 = false;
            } else {
                int i13 = i11;
                z11 = false;
                l0.r rVarL = androidx.compose.foundation.layout.b.l(oVar, 0.0f, f8460k, 0.0f, 0.0f, 13);
                H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                int i14 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                l0.r rVarC2 = l0.a.c(c0698o, rVarL);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                    p123m2.c.y(i14, c0698o, i14, c0285h3);
                }
                C0672b.v(c0698o, rVarC2, c0285h4);
                int i15 = i13 << 3;
                d(androidx.compose.foundation.layout.c.k(oVar, Y.s.f10239f, Y.s.f10238e), c10, c0554e2, c0698o, (i15 & 896) | (i15 & 112) | 6);
                z10 = true;
                c0698o.p(true);
            }
            c0698o.p(z11);
            c0698o.p(z10);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i2(c10, c0554e2, i10, 1);
        }
    }

    public static final void d(l0.r rVar, C2 c10, C0554e2 c0554e2, C0698o c0698o, int i10) {
        l0.r rVar2;
        int i11;
        C0554e2 c0554e3;
        c0698o.V(1261215927);
        if ((i10 & 6) == 0) {
            rVar2 = rVar;
            i11 = (c0698o.g(rVar2) ? 4 : 2) | i10;
        } else {
            rVar2 = rVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            c0554e3 = c0554e2;
            i11 |= c0698o.g(c0554e3) ? 256 : 128;
        } else {
            c0554e3 = c0554e2;
        }
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = q2.f9331b;
                c0698o.e0(objH);
            }
            p180s0.J jA = AbstractC0537a1.a(Y.s.f10243l, c0698o);
            p251z9.j.c(jA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            J.d dVar = (J.d) jA;
            float f3 = (float) 0.0d;
            f(rVar2, c10, c0554e3, (H0.I) objH, J.d.a(dVar, null, new J.b(f3), new J.b(f3), null, 9), J.d.a(dVar, new J.b(f3), null, null, new J.b(f3), 6), c0698o, (i11 & 896) | (i11 & 14) | 3072 | (i11 & 112));
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new o2(rVar, c10, c0554e2, i10, 0);
        }
    }

    public static final void e(C0576l c0576l, l0.r rVar, C0554e2 c0554e2, boolean z10, C0698o c0698o, int i10) {
        int i11;
        l0.r rVar2;
        c0698o.V(1432307537);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(c0576l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(c0554e2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            rVar2 = rVar;
            l0.r rVarL = androidx.compose.foundation.layout.b.l(rVar2, 0.0f, 0.0f, 0.0f, f8455d, 7);
            D.W wA = D.U.a(AbstractC0066i.f977a, l0.c.f19307B, c0698o, 48);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarL);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            int i13 = i11 & 14;
            int i14 = i11 >> 3;
            int i15 = i13 | (i14 & 112);
            c(c0576l, c0554e2, c0698o, i15);
            AbstractC0060c.a(c0698o, androidx.compose.foundation.layout.c.n(l0.o.f19333a, f8454c));
            b(c0576l, c0554e2, z10, c0698o, i15 | (i14 & 896));
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new r2(c0576l, rVar2, c0554e2, z10, i10, 0);
        }
    }

    public static final void f(l0.r rVar, C2 c10, C0554e2 c0554e2, H0.I i10, J.d dVar, J.d dVar2, C0698o c0698o, int i11) {
        int i12;
        long j10 = c0554e2.f9045d;
        c0698o.V(1374241901);
        if ((i11 & 6) == 0) {
            i12 = (c0698o.g(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o.g(c0554e2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0698o.g(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c0698o.g(dVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c0698o.g(dVar2) ? 131072 : 65536;
        }
        int i13 = i12;
        if ((74899 & i13) == 74898 && c0698o.x()) {
            c0698o.N();
        } else {
            float f3 = Y.s.g;
            p180s0.L l10 = new p180s0.L(j10);
            p180s0.J jA = AbstractC0537a1.a(Y.s.f10243l, c0698o);
            p251z9.j.c(jA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            J.d dVar3 = (J.d) jA;
            String strC = X.t.c(R.string.m3c_time_picker_period_toggle_description, c0698o);
            boolean zG = c0698o.g(strC);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zG || objH == obj) {
                objH = new R0.n(strC, 5);
                c0698o.e0(objH);
            }
            l0.r rVarB = R0.m.a(R0.m.a(rVar, false, (p241y9.c) objH), false, I.a.f3645r).b(new BorderModifierNodeElement(f3, l10, dVar3));
            int i14 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarB);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, i10, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o, i14, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            boolean z10 = !c10.i();
            int i15 = i13 & 112;
            boolean z11 = i15 == 32 || ((i13 & 64) != 0 && c0698o.i(c10));
            Object objH2 = c0698o.H();
            if (z11 || objH2 == obj) {
                objH2 = new s2(0, c10);
                c0698o.e0(objH2);
            }
            int i16 = (i13 << 3) & 7168;
            h(z10, dVar, (p241y9.a) objH2, c0554e2, AbstractC0589p0.f9315a, c0698o, ((i13 >> 9) & 112) | 24576 | i16);
            AbstractC0060c.a(c0698o, androidx.compose.foundation.a.a(androidx.compose.ui.layout.a.c(l0.o.f19333a, "Spacer").b(new ZIndexElement(2.0f)).b(androidx.compose.foundation.layout.c.f11828c), j10, p180s0.F.f21774a));
            boolean zI = c10.i();
            boolean z12 = i15 == 32 || ((i13 & 64) != 0 && c0698o.i(c10));
            Object objH3 = c0698o.H();
            if (z12 || objH3 == obj) {
                objH3 = new s2(1, c10);
                c0698o.e0(objH3);
            }
            h(zI, dVar2, (p241y9.a) objH3, c0554e2, AbstractC0589p0.f9316b, c0698o, ((i13 >> 12) & 112) | 24576 | i16);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new t2(rVar, c10, c0554e2, i10, dVar, dVar2, i11);
        }
    }

    public static final void g(C2 c10, l0.r rVar, C0554e2 c0554e2, int i10, C0698o c0698o, int i11) {
        int i12;
        int i13;
        l0.r rVar2;
        int i14;
        l0.r rVar3;
        c0698o.V(-619286452);
        int i15 = i11 | (c0698o.g(c10) ? 4 : 2) | 48 | (c0698o.g(c0554e2) ? 256 : 128) | 1024;
        if ((i15 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
            rVar3 = rVar;
            i14 = i10;
        } else {
            c0698o.P();
            if ((i11 & 1) == 0 || c0698o.w()) {
                Configuration configuration = (Configuration) c0698o.k(AndroidCompositionLocals_androidKt.f12062a);
                i12 = i15 & (-7169);
                i13 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                rVar2 = l0.o.f19333a;
            } else {
                c0698o.N();
                rVar2 = rVar;
                i12 = i15 & (-7169);
                i13 = i10;
            }
            c0698o.q();
            Object systemService = ((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b)).getSystemService("accessibility");
            p251z9.j.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            Object obj = (AccessibilityManager) systemService;
            boolean zH = c0698o.h(true) | c0698o.h(true);
            Object objH = c0698o.H();
            Object obj2 = C0690k.f10683a;
            if (zH || objH == obj2) {
                objH = new X.E();
                c0698o.e0(objH);
            }
            X.E e10 = (X.E) objH;
            InterfaceC0771u interfaceC0771u = (InterfaceC0771u) c0698o.k(p087i2.a.f16736a);
            boolean zG = c0698o.g(e10) | c0698o.i(obj);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj2) {
                objH2 = new C0007a(28, e10, obj);
                c0698o.e0(objH2);
            }
            p241y9.c cVar = (p241y9.c) objH2;
            boolean zG2 = c0698o.g(e10) | c0698o.i(obj);
            Object objH3 = c0698o.H();
            if (zG2 || objH3 == obj2) {
                objH3 = new C0086d(19, e10, obj);
                c0698o.e0(objH3);
            }
            X.t.a(interfaceC0771u, cVar, (p241y9.a) objH3, c0698o, 0);
            boolean z10 = (i12 & 14) == 4;
            Object objH4 = c0698o.H();
            if (z10 || objH4 == obj2) {
                objH4 = new C0576l(c10);
                c0698o.e0(objH4);
            }
            C0576l c0576l = (C0576l) objH4;
            if (i13 == 1) {
                c0698o.T(-337235422);
                k(c0576l, rVar2, c0554e2, true ^ ((Boolean) e10.getValue()).booleanValue(), c0698o, i12 & 1008);
                c0698o.p(false);
            } else {
                c0698o.T(-337036960);
                e(c0576l, rVar2, c0554e2, true ^ ((Boolean) e10.getValue()).booleanValue(), c0698o, i12 & 1008);
                c0698o.p(false);
            }
            i14 = i13;
            rVar3 = rVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new o2(c10, rVar3, c0554e2, i14, i11);
        }
    }

    public static final void h(boolean z10, J.d dVar, p241y9.a aVar, C0554e2 c0554e2, p074h0.d dVar2, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1937408098);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(c0554e2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(dVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c0698o.x()) {
            c0698o.N();
        } else {
            long j10 = z10 ? c0554e2.f9049i : c0554e2.j;
            long j11 = z10 ? c0554e2.g : c0554e2.f9048h;
            l0.r rVarB = new ZIndexElement(z10 ? 0.0f : 1.0f).b(androidx.compose.foundation.layout.c.f11828c);
            boolean z11 = (i11 & 14) == 4;
            Object objH = c0698o.H();
            if (z11 || objH == C0690k.f10683a) {
                objH = new w2(z10);
                c0698o.e0(objH);
            }
            l0.r rVarA = R0.m.a(rVarB, false, (p241y9.c) objH);
            float f3 = 0;
            V0.k(aVar, rVarA, false, dVar, S.d(j11, j10, c0698o, 12), new D.P(f3, f3, f3, f3), dVar2, c0698o, ((i11 << 15) & 1879048192) | ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168), 356);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new x2(z10, dVar, aVar, c0554e2, dVar2, i10);
        }
    }

    public static final void i(C2 c10, C0554e2 c0554e2, C0698o c0698o, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        c0698o.V(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(c0554e2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            D.W wA = D.U.a(AbstractC0066i.f981e, l0.c.f19306A, c0698o, 6);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.o oVar = l0.o.f19333a;
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
            C0672b.v(c0698o, wA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            a(c10, c0554e2, c0698o, i11 & 126);
            c0698o.T(-709485014);
            if (c10.d()) {
                z10 = true;
                z11 = false;
            } else {
                int i13 = i11;
                z11 = false;
                l0.r rVarL = androidx.compose.foundation.layout.b.l(oVar, f8460k, 0.0f, 0.0f, 0.0f, 14);
                H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                int i14 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                l0.r rVarC2 = l0.a.c(c0698o, rVarL);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                    p123m2.c.y(i14, c0698o, i14, c0285h3);
                }
                C0672b.v(c0698o, rVarC2, c0285h4);
                int i15 = i13 << 3;
                j(androidx.compose.foundation.layout.c.k(oVar, Y.s.f10241i, Y.s.f10240h), c10, c0554e2, c0698o, (i15 & 896) | (i15 & 112) | 6);
                z10 = true;
                c0698o.p(true);
            }
            c0698o.p(z11);
            c0698o.p(z10);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i2(c10, c0554e2, i10, 2);
        }
    }

    public static final void j(l0.r rVar, C2 c10, C0554e2 c0554e2, C0698o c0698o, int i10) {
        int i11;
        C0554e2 c0554e3;
        c0698o.V(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            c0554e3 = c0554e2;
            i11 |= c0698o.g(c0554e3) ? 256 : 128;
        } else {
            c0554e3 = c0554e2;
        }
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = q2.f9332c;
                c0698o.e0(objH);
            }
            p180s0.J jA = AbstractC0537a1.a(Y.s.f10243l, c0698o);
            p251z9.j.c(jA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            J.d dVar = (J.d) jA;
            float f3 = (float) 0.0d;
            f(rVar, c10, c0554e3, (H0.I) objH, AbstractC0537a1.b(dVar), J.d.a(dVar, new J.b(f3), new J.b(f3), null, null, 12), c0698o, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new o2(rVar, c10, c0554e2, i10, 2);
        }
    }

    public static final void k(C0576l c0576l, l0.r rVar, C0554e2 c0554e2, boolean z10, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(1249591487);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(c0576l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(c0554e2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
        } else {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            l0.r rVarA = R0.m.a(rVar, false, O.f8739z);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o, 48);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarA);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            int i13 = i11 & 14;
            int i14 = i11 >> 3;
            int i15 = i13 | (i14 & 112);
            i(c0576l, c0554e2, c0698o, i15);
            float f3 = f8454c;
            l0.o oVar = l0.o.f19333a;
            AbstractC0060c.a(c0698o, androidx.compose.foundation.layout.c.d(oVar, f3));
            b(c0576l, c0554e2, z10, c0698o, (i14 & 896) | i15);
            AbstractC0060c.a(c0698o, androidx.compose.foundation.layout.c.d(oVar, f8455d));
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new r2(c0576l, rVar, c0554e2, z10, i10, 1);
        }
    }

    public static final void l(l0.r rVar, float f3, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(1548175696);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.d(f3) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(dVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            boolean z10 = (i11 & 112) == 32;
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new C0562g2(f3);
                c0698o.e0(objH);
            }
            H0.I i12 = (H0.I) objH;
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            int i14 = (((((i11 << 3) & 112) | ((i11 >> 6) & 14)) << 6) & 896) | 6;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, i12, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar.invoke(c0698o, Integer.valueOf((i14 >> 6) & 14));
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0566h2(rVar, f3, dVar, i10);
        }
    }

    public static final void m(l0.r rVar, C0576l c0576l, int i10, boolean z10, C0698o c0698o, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        C0698o c0698o2 = c0698o;
        c0698o2.V(-206784607);
        if ((i11 & 6) == 0) {
            i12 = (c0698o2.g(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o2.i(c0576l) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o2.e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            z11 = z10;
            i12 |= c0698o2.h(z11) ? 2048 : 1024;
        } else {
            z11 = z10;
        }
        if ((i12 & 1171) == 1170 && c0698o2.x()) {
            c0698o2.N();
        } else {
            float f3 = Y.s.f10234a;
            U0.L lA = H2.a(1, c0698o2);
            float fW = ((p063g1.c) c0698o2.k(AbstractC0359n0.f5118h)).w(f8457f);
            Object objH = c0698o2.H();
            Z.S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(new p171r0.c(0L));
                c0698o2.e0(objH);
            }
            Z.X x9 = (Z.X) objH;
            Object objH2 = c0698o2.H();
            if (objH2 == s10) {
                objH2 = C0672b.r(new p063g1.j(0L));
                c0698o2.e0(objH2);
            }
            Z.X x10 = (Z.X) objH2;
            Object objH3 = c0698o2.H();
            if (objH3 == s10) {
                C0707x c0707x = new C0707x(C0672b.m(c0698o2));
                c0698o2.e0(c0707x);
                objH3 = c0707x;
            }
            InterfaceC0402u interfaceC0402u = ((C0707x) objH3).f10851r;
            C2 c10 = c0576l.f9222a;
            String strS = s(c10.c(), i10, c0698o2, c10.d());
            String strA = Y.a(i10, 7);
            boolean zA = c10.c() == 1 ? p251z9.j.a(Y.a(c10.g(), 7), strA) : p251z9.j.a(Y.a(c10.f(), 7), strA);
            l0.j jVar = l0.c.f19317v;
            Z.M0 m10 = D0.f8496a;
            l0.r rVarJ = androidx.compose.foundation.layout.c.j(rVar.b(MinimumInteractiveModifier.f11916a), g);
            Object objH4 = c0698o2.H();
            if (objH4 == s10) {
                z12 = true;
                objH4 = new C0200i(x10, x9, 1 == true ? 1 : 0);
                c0698o2.e0(objH4);
            } else {
                z12 = true;
            }
            l0.r rVarE = androidx.compose.foundation.a.e(androidx.compose.ui.layout.a.d(rVarJ, (p241y9.c) objH4), z12, null);
            boolean zI = c0698o2.i(interfaceC0402u) | c0698o2.i(c0576l) | c0698o2.d(fW) | ((i12 & 7168) == 2048) | c0698o2.h(zA);
            Object objH5 = c0698o2.H();
            if (zI || objH5 == s10) {
                m2 m2Var = new m2(zA, interfaceC0402u, c0576l, fW, z11, x9, x10);
                c0698o2.e0(m2Var);
                objH5 = m2Var;
            }
            l0.r rVarA = R0.m.a(rVarE, true, (p241y9.c) objH5);
            H0.I iD = AbstractC0071n.d(jVar, false);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            l0.r rVarC = l0.a.c(c0698o2, rVarA);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, iD, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            boolean zG = c0698o2.g(strS);
            Object objH6 = c0698o2.H();
            if (zG || objH6 == s10) {
                objH6 = new R0.n(strS, 4);
                c0698o2.e0(objH6);
            }
            AbstractC0542b2.b(strA, new ClearAndSetSemanticsElement((p241y9.c) objH6), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, lA, c0698o, 0, 0, 65532);
            c0698o2 = c0698o;
            c0698o2.p(true);
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new n2(rVar, c0576l, i10, z10, i11);
        }
    }

    public static final void n(l0.r rVar, C0698o c0698o, int i10) {
        int i11;
        C0698o c0698o2 = c0698o;
        c0698o2.V(2100674302);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.g(rVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c0698o2.x()) {
            c0698o2.N();
        } else {
            U0.L lA = U0.L.a((U0.L) c0698o2.k(AbstractC0542b2.f8991a), 0L, 0L, null, null, 0L, 0L, new p055f1.i(17, p055f1.f.f15901b), 15695871);
            O o10 = O.f8738y;
            AtomicInteger atomicInteger = R0.m.f7112a;
            l0.r rVarB = rVar.b(new ClearAndSetSemanticsElement(o10));
            H0.I iD = AbstractC0071n.d(l0.c.f19317v, false);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            l0.r rVarC = l0.a.c(c0698o2, rVarB);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, iD, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            AbstractC0542b2.b(":", null, AbstractC0568i0.d(Y.r.f10233a, c0698o2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, lA, c0698o, 6, 0, 65530);
            c0698o2 = c0698o;
            c0698o2.p(true);
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0068k(i10, 2, rVar);
        }
    }

    public static final void o(l0.r rVar, int i10, C2 c10, int i11, C0554e2 c0554e2, C0698o c0698o, int i12) {
        int i13;
        int i14;
        c0698o.V(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (c0698o.g(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 = i10;
            i13 |= c0698o.e(i14) ? 32 : 16;
        } else {
            i14 = i10;
        }
        if ((i12 & 384) == 0) {
            i13 |= (i12 & 512) == 0 ? c0698o.g(c10) : c0698o.i(c10) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0698o.e(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c0698o.g(c0554e2) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && c0698o.x()) {
            c0698o.N();
        } else {
            boolean z10 = c10.c() == i11;
            String strC = X.t.c(i11 == 0 ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection, c0698o);
            long j10 = z10 ? c0554e2.f9050k : c0554e2.f9051l;
            long j11 = z10 ? c0554e2.f9052m : c0554e2.f9053n;
            boolean zG = c0698o.g(strC);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zG || objH == obj) {
                objH = new R0.n(strC, 6);
                c0698o.e0(objH);
            }
            l0.r rVarA = R0.m.a(rVar, true, (p241y9.c) objH);
            p180s0.J jA = AbstractC0537a1.a(Y.s.f10248q, c0698o);
            boolean z11 = ((i13 & 7168) == 2048) | ((i13 & 896) == 256 || ((i13 & 512) != 0 && c0698o.i(c10)));
            Object objH2 = c0698o.H();
            if (z11 || objH2 == obj) {
                objH2 = new C0449q(i11, c10);
                c0698o.e0(objH2);
            }
            p241y9.a aVar = (p241y9.a) objH2;
            p074h0.d dVarD = p074h0.j.d(-1477282471, new u2(i11, c10, i14, j11), c0698o);
            C0709z c0709z = C1.f8484a;
            long jB = AbstractC0568i0.b(j10, c0698o);
            float f3 = 0;
            AbstractC0693l0 abstractC0693l0 = C1.f8484a;
            float f7 = ((p063g1.f) c0698o.k(abstractC0693l0)).f16252r + f3;
            C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(jB)), abstractC0693l0.a(new p063g1.f(f7))}, p074h0.j.d(-1164547968, new B1(rVarA, jA, j10, f7, z10, aVar, f3, dVarD), c0698o), c0698o, 56);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v2(rVar, i10, c10, i11, c0554e2, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object p(C0576l c0576l, float f3, float f7, float f10, boolean z10, long j10, q9.c cVar) {
        y2 y2Var;
        float f11;
        float fRint;
        boolean z11;
        C0576l c0576l2;
        C0576l c0576l3;
        boolean z12;
        if (cVar instanceof y2) {
            y2Var = (y2) cVar;
            int i10 = y2Var.f9469u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                y2Var.f9469u = i10 - Integer.MIN_VALUE;
            } else {
                y2Var = new y2(cVar);
            }
        } else {
            y2Var = new y2(cVar);
        }
        y2 y2Var2 = y2Var;
        Object obj = y2Var2.f9468t;
        int i11 = y2Var2.f9469u;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z13 = y2Var2.f9467s;
                C0576l c0576l4 = y2Var2.f9466r;
                p110k9.a.e(obj);
                z11 = z13;
                c0576l2 = c0576l4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = y2Var2.f9467s;
                c0576l3 = y2Var2.f9466r;
                p110k9.a.e(obj);
            }
            z11 = z12;
            c0576l2 = c0576l3;
            if (z11) {
                c0576l2.h(1);
            }
            return yVar;
        }
        p110k9.a.e(obj);
        float fAtan2 = ((float) Math.atan2(f7 - ((int) (j10 & 4294967295L)), f3 - ((int) (j10 >> 32)))) - 1.5707964f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 6.2831855f;
        }
        if (c0576l.f9222a.c() == 1) {
            f11 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f11 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f12 = fRint * f11;
        r(c0576l, f3, f7, f10, j10);
        y2Var2.f9466r = c0576l;
        z11 = z10;
        y2Var2.f9467s = z11;
        y2Var2.f9469u = 1;
        p232y.V v10 = c0576l.f9226e;
        C0573k c0573k = new C0573k(c0576l, f12, true, null);
        v10.getClass();
        Object objJ = AbstractC0405x.j(new K0.m1(p232y.T.f24455s, v10, c0573k, (p150o9.c) null), y2Var2);
        if (objJ != aVar) {
            objJ = yVar;
        }
        if (objJ != aVar) {
            c0576l2 = c0576l;
        }
        return aVar;
        if (c0576l2.f9222a.c() == 0 && z11) {
            y2Var2.f9466r = c0576l2;
            y2Var2.f9467s = z11;
            y2Var2.f9469u = 2;
            if (AbstractC0405x.k(100L, y2Var2) != aVar) {
                c0576l3 = c0576l2;
                z12 = z11;
                z11 = z12;
                c0576l2 = c0576l3;
            }
            return aVar;
        }
        if (z11) {
            c0576l2.h(1);
        }
        return yVar;
    }

    public static final long q(C0576l c0576l) {
        float f3 = 2;
        float f7 = Y.s.f10236c / f3;
        C2 c10 = c0576l.f9222a;
        float f10 = (((c10.d() && c10.i() && c10.c() == 0) ? f8453b : f8452a) - f7) + f7;
        float fCos = ((float) Math.cos(((Number) c0576l.f9225d.d()).floatValue())) * f10;
        float f11 = Y.s.f10234a / f3;
        return (((long) Float.floatToRawIntBits(fCos + f11)) << 32) | (((long) Float.floatToRawIntBits((f10 * ((float) Math.sin(((Number) c0576l.f9225d.d()).floatValue()))) + f11)) & 4294967295L);
    }

    public static final void r(C2 c10, float f3, float f7, float f10, long j10) {
        if (c10.c() == 0 && c10.d()) {
            c10.a(((float) Math.hypot((double) (((float) ((int) (j10 >> 32))) - f3), (double) (((float) ((int) (j10 & 4294967295L))) - f7))) < f10);
        }
    }

    public static final String s(int i10, int i11, C0698o c0698o, boolean z10) {
        int i12;
        if (i10 == 1) {
            i12 = R.string.m3c_time_picker_minute_suffix;
        } else {
            i12 = z10 ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        }
        Object[] objArr = {Integer.valueOf(i11)};
        String strC = X.t.c(i12, c0698o);
        Locale locale = p050e8.b.z((Configuration) c0698o.k(AndroidCompositionLocals_androidKt.f12062a)).f1426a.get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strC, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
