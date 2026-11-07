package t;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f22502a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f3, float f7, boolean z10) {
        if (!z10) {
            return f3;
        }
        return (float) (((1.0d - f22502a) * ((double) f7)) + ((double) f3));
    }

    public static float b(float f3, float f7, boolean z10) {
        if (!z10) {
            return f3 * 1.5f;
        }
        return (float) (((1.0d - f22502a) * ((double) f7)) + ((double) (f3 * 1.5f)));
    }
}
