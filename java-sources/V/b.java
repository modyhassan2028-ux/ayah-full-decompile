package V;

import A.C0041r0;
import B.n;
import D0.y;
import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.InterfaceC0289l;
import J0.InterfaceC0293p;
import J0.InterfaceC0301y;
import J0.K;
import K9.AbstractC0405x;
import W.C0594r0;
import W.C0597s0;
import android.view.View;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import l0.q;
import p180s0.AbstractC1295d;
import p180s0.o;
import u.A;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q implements g, InterfaceC0289l, InterfaceC0293p, InterfaceC0301y {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final B.j f8332F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f8333G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float f8334H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0594r0 f8335I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0597s0 f8336J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public y f8337K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f8338L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f8340N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public RippleContainer f8342P;
    public RippleHostView Q;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f8339M = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final A f8341O = new A();

    public b(B.j jVar, boolean z10, float f3, C0594r0 c0594r0, C0597s0 c0597s0) {
        this.f8332F = jVar;
        this.f8333G = z10;
        this.f8334H = f3;
        this.f8335I = c0594r0;
        this.f8336J = c0597s0;
    }

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // V.g
    public final void U() {
        this.Q = null;
        AbstractC0283f.m(this);
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        AbstractC0405x.x(h0(), null, new O9.y(this, (p150o9.c) null, 10), 3);
    }

    @Override // l0.q
    public final void n0() {
        RippleContainer rippleContainer = this.f8342P;
        if (rippleContainer != null) {
            U();
            L5.c cVar = rippleContainer.f11904u;
            RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) cVar.f5532s).get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f5532s;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f11903t.add(rippleHostView);
            }
        }
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        k7.a();
        y yVar = this.f8337K;
        if (yVar != null) {
            yVar.b(k7, this.f8338L, this.f8335I.a());
        }
        o oVarP = k7.f3942r.f22795s.p();
        RippleHostView rippleHostView = this.Q;
        if (rippleHostView != null) {
            rippleHostView.m1setRipplePropertiesbiQXAtU(this.f8339M, B9.a.V(this.f8338L), this.f8335I.a(), ((e) this.f8336J.invoke()).f8350d);
            rippleHostView.draw(AbstractC1295d.a(oVarP));
        }
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
        this.f8340N = true;
        p063g1.c cVar = AbstractC0283f.x(this).f3912P;
        this.f8339M = B9.a.d0(j);
        float f3 = this.f8334H;
        this.f8338L = Float.isNaN(f3) ? f.a(cVar, this.f8333G, this.f8339M) : cVar.w(f3);
        A a9 = this.f8341O;
        Object[] objArr = a9.f22650a;
        int i10 = a9.f22651b;
        for (int i11 = 0; i11 < i10; i11++) {
            v0((n) objArr[i11]);
        }
        a9.c();
    }

    public final void v0(n nVar) {
        RippleHostView rippleHostView;
        if (!(nVar instanceof B.l)) {
            if (nVar instanceof B.m) {
                RippleHostView rippleHostView2 = this.Q;
                if (rippleHostView2 != null) {
                    rippleHostView2.d();
                    return;
                }
                return;
            }
            if (!(nVar instanceof B.k) || (rippleHostView = this.Q) == null) {
                return;
            }
            rippleHostView.d();
            return;
        }
        B.l lVar = (B.l) nVar;
        long j = this.f8339M;
        float f3 = this.f8338L;
        RippleContainer rippleContainerC = this.f8342P;
        if (rippleContainerC == null) {
            rippleContainerC = F9.n.c(F9.n.d((View) AbstractC0283f.i(this, AndroidCompositionLocals_androidKt.f12067f)));
            this.f8342P = rippleContainerC;
        }
        RippleHostView rippleHostViewA = rippleContainerC.a(this);
        rippleHostViewA.b(lVar, this.f8333G, j, B9.a.V(f3), this.f8335I.a(), ((e) this.f8336J.invoke()).f8350d, new C0041r0(26, this));
        this.Q = rippleHostViewA;
        AbstractC0283f.m(this);
    }
}
