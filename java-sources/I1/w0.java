package I1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends v0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final B0 f3791r = B0.h(null, WindowInsets.CONSUMED);

    public w0(B0 b5, WindowInsets windowInsets) {
        super(b5, windowInsets);
    }

    @Override // I1.s0, I1.y0
    public A1.c g(int i10) {
        return A1.c.d(this.f3777c.getInsets(z0.a(i10)));
    }

    @Override // I1.s0, I1.y0
    public A1.c h(int i10) {
        return A1.c.d(this.f3777c.getInsetsIgnoringVisibility(z0.a(i10)));
    }

    @Override // I1.s0, I1.y0
    public boolean q(int i10) {
        return this.f3777c.isVisible(z0.a(i10));
    }

    public w0(B0 b5, w0 w0Var) {
        super(b5, w0Var);
    }

    @Override // I1.s0, I1.y0
    public final void d(View view) {
    }
}
