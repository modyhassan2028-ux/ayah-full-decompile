package E2;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1503a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        switch (this.f1503a) {
            case 0:
                return f3 * f3 * f3 * f3 * f3;
            case 1:
            case 2:
            case 3:
            default:
                float f7 = f3 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }
}
