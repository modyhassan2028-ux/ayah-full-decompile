package I1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A1.c f3787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public A1.c f3788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public A1.c f3789q;

    public v0(B0 b5, WindowInsets windowInsets) {
        super(b5, windowInsets);
        this.f3787o = null;
        this.f3788p = null;
        this.f3789q = null;
    }

    @Override // I1.y0
    public A1.c i() {
        if (this.f3788p == null) {
            this.f3788p = A1.c.d(this.f3777c.getMandatorySystemGestureInsets());
        }
        return this.f3788p;
    }

    @Override // I1.y0
    public A1.c k() {
        if (this.f3787o == null) {
            this.f3787o = A1.c.d(this.f3777c.getSystemGestureInsets());
        }
        return this.f3787o;
    }

    @Override // I1.y0
    public A1.c m() {
        if (this.f3789q == null) {
            this.f3789q = A1.c.d(this.f3777c.getTappableElementInsets());
        }
        return this.f3789q;
    }

    @Override // I1.s0, I1.y0
    public B0 n(int i10, int i11, int i12, int i13) {
        return B0.h(null, this.f3777c.inset(i10, i11, i12, i13));
    }

    public v0(B0 b5, v0 v0Var) {
        super(b5, v0Var);
        this.f3787o = null;
        this.f3788p = null;
        this.f3789q = null;
    }

    @Override // I1.t0, I1.y0
    public void u(A1.c cVar) {
    }
}
