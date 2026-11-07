package H7;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class z implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f3584a;

    public z(TimeInterpolator timeInterpolator) {
        this.f3584a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z10, TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new z(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        return 1.0f - this.f3584a.getInterpolation(f3);
    }
}
