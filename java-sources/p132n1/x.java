package p132n1;

import android.view.animation.Interpolator;
import m1.e;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f19961a;

    public x(e eVar) {
        this.f19961a = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        return (float) this.f19961a.a(f3);
    }
}
