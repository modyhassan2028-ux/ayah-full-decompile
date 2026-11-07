package p076h2;

import android.support.v4.media.session.p;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f16438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16439b;

    public b(float[] fArr) {
        this.f16438a = fArr;
        this.f16439b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f16438a;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f7 = this.f16439b;
        float f10 = (f3 - (iMin * f7)) / f7;
        float f11 = fArr[iMin];
        return p.n(fArr[iMin + 1], f11, f10, f11);
    }
}
