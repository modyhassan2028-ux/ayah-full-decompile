package I1;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f3759a;

    public l0(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3759a = new j0(h0.b(i10, interpolator, j));
        } else {
            this.f3759a = new C0254g0(i10, interpolator, j);
        }
    }
}
