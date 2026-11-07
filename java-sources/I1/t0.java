package I1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends s0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A1.c f3785n;

    public t0(B0 b5, WindowInsets windowInsets) {
        super(b5, windowInsets);
        this.f3785n = null;
    }

    @Override // I1.y0
    public B0 b() {
        return B0.h(null, this.f3777c.consumeStableInsets());
    }

    @Override // I1.y0
    public B0 c() {
        return B0.h(null, this.f3777c.consumeSystemWindowInsets());
    }

    @Override // I1.y0
    public final A1.c j() {
        if (this.f3785n == null) {
            WindowInsets windowInsets = this.f3777c;
            this.f3785n = A1.c.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3785n;
    }

    @Override // I1.y0
    public boolean o() {
        return this.f3777c.isConsumed();
    }

    @Override // I1.y0
    public void u(A1.c cVar) {
        this.f3785n = cVar;
    }

    public t0(B0 b5, t0 t0Var) {
        super(b5, t0Var);
        this.f3785n = null;
        this.f3785n = t0Var.f3785n;
    }
}
