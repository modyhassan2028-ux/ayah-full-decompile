package p137n7;

import android.support.v4.media.session.p;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f20015a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p076h2.a f20016b = new p076h2.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p076h2.a f20017c = new p076h2.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p076h2.a f20018d = new p076h2.a(p076h2.a.f16437e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f20019e = new DecelerateInterpolator();

    public static float a(float f3, float f7, float f10) {
        return p.n(f7, f3, f10, f3);
    }

    public static float b(float f3, float f7, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f3;
        }
        return f12 >= f11 ? f7 : a(f3, f7, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i10, float f3, int i11) {
        return Math.round(f3 * (i11 - i10)) + i10;
    }
}
