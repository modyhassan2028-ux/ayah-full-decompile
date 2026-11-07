package I1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f3756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3757d;

    public k0(int i10, Interpolator interpolator, long j) {
        this.f3754a = i10;
        this.f3756c = interpolator;
        this.f3757d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f3757d;
    }

    public float c() {
        Interpolator interpolator = this.f3756c;
        return interpolator != null ? interpolator.getInterpolation(this.f3755b) : this.f3755b;
    }

    public int d() {
        return this.f3754a;
    }

    public void e(float f3) {
        this.f3755b = f3;
    }
}
