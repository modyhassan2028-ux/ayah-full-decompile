package I1;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f3753e;

    public j0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f3753e = windowInsetsAnimation;
    }

    public static A1.c f(WindowInsetsAnimation.Bounds bounds) {
        return A1.c.d(bounds.getUpperBound());
    }

    public static A1.c g(WindowInsetsAnimation.Bounds bounds) {
        return A1.c.d(bounds.getLowerBound());
    }

    public static void h(View view, AbstractC0244b0 abstractC0244b0) {
        view.setWindowInsetsAnimationCallback(abstractC0244b0 != null ? new i0(abstractC0244b0) : null);
    }

    @Override // I1.k0
    public final float a() {
        return this.f3753e.getAlpha();
    }

    @Override // I1.k0
    public final long b() {
        return this.f3753e.getDurationMillis();
    }

    @Override // I1.k0
    public final float c() {
        return this.f3753e.getInterpolatedFraction();
    }

    @Override // I1.k0
    public final int d() {
        return this.f3753e.getTypeMask();
    }

    @Override // I1.k0
    public final void e(float f3) {
        this.f3753e.setFraction(f3);
    }
}
