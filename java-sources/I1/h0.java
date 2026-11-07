package I1;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h0 {
    public static /* synthetic */ WindowInsetsAnimation.Bounds a(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation b(int i10, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i10, interpolator, j);
    }

    public static /* synthetic */ void c() {
    }
}
