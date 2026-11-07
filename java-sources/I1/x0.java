package I1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends w0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final B0 f3793s = B0.h(null, WindowInsets.CONSUMED);

    public x0(B0 b5, WindowInsets windowInsets) {
        super(b5, windowInsets);
    }

    @Override // I1.w0, I1.s0, I1.y0
    public A1.c g(int i10) {
        return A1.c.d(this.f3777c.getInsets(A0.a(i10)));
    }

    @Override // I1.w0, I1.s0, I1.y0
    public A1.c h(int i10) {
        return A1.c.d(this.f3777c.getInsetsIgnoringVisibility(A0.a(i10)));
    }

    @Override // I1.w0, I1.s0, I1.y0
    public boolean q(int i10) {
        return this.f3777c.isVisible(A0.a(i10));
    }

    public x0(B0 b5, x0 x0Var) {
        super(b5, x0Var);
    }
}
