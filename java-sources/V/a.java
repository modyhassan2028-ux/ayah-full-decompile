package V;

import A.C0041r0;
import D0.y;
import Z.C0672b;
import Z.C0681f0;
import Z.X;
import Z.t0;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;
import p180s0.AbstractC1295d;
import p180s0.o;
import p180s0.q;
import p232y.K;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t0, g, K {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f8324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f8326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X f8327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X f8328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewGroup f8329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RippleContainer f8330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0681f0 f8331z = C0672b.r(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0681f0 f8319A = C0672b.r(Boolean.TRUE);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f8320B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8321C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0041r0 f8322D = new C0041r0(25, this);

    public a(boolean z10, float f3, X x9, X x10, ViewGroup viewGroup) {
        this.f8323r = z10;
        this.f8324s = new y(new F.k(x10, 5), z10);
        this.f8325t = z10;
        this.f8326u = f3;
        this.f8327v = x9;
        this.f8328w = x10;
        this.f8329x = viewGroup;
    }

    @Override // V.g
    public final void U() {
        this.f8331z.setValue(null);
    }

    @Override // p232y.K
    public final void a(J0.K k7) {
        int iE;
        p196u0.b bVar = k7.f3942r;
        this.f8320B = bVar.f22795s.v();
        float f3 = this.f8326u;
        if (Float.isNaN(f3)) {
            iE = B9.a.V(f.a(k7, this.f8325t, bVar.f22795s.v()));
        } else {
            iE = k7.E(f3);
        }
        this.f8321C = iE;
        long j = ((q) this.f8327v.getValue()).f21845a;
        float f7 = ((e) this.f8328w.getValue()).f8350d;
        k7.a();
        this.f8324s.b(k7, Float.isNaN(f3) ? f.a(k7, this.f8323r, k7.b()) : k7.w(f3), j);
        o oVarP = bVar.f22795s.p();
        ((Boolean) this.f8319A.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.f8331z.getValue();
        if (rippleHostView != null) {
            rippleHostView.m1setRipplePropertiesbiQXAtU(bVar.f22795s.v(), this.f8321C, j, f7);
            rippleHostView.draw(AbstractC1295d.a(oVarP));
        }
    }

    @Override // Z.t0
    public final void c() {
        RippleContainer rippleContainer = this.f8330y;
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

    @Override // Z.t0
    public final void d() {
        RippleContainer rippleContainer = this.f8330y;
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

    @Override // Z.t0
    public final void b() {
    }
}
