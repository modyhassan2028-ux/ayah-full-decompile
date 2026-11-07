package p132n1;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19919a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19920b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f19922d;

    public q(MotionLayout motionLayout) {
        this.f19922d = motionLayout;
    }

    @Override // p132n1.o
    public final float a() {
        return this.f19922d.f12178J;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f7 = this.f19919a;
        MotionLayout motionLayout = this.f19922d;
        if (f7 > 0.0f) {
            float f10 = this.f19921c;
            if (f7 / f10 < f3) {
                f3 = f7 / f10;
            }
            motionLayout.f12178J = f7 - (f10 * f3);
            return ((f7 * f3) - (((f10 * f3) * f3) / 2.0f)) + this.f19920b;
        }
        float f11 = this.f19921c;
        if ((-f7) / f11 < f3) {
            f3 = (-f7) / f11;
        }
        motionLayout.f12178J = (f11 * f3) + f7;
        return (((f11 * f3) * f3) / 2.0f) + (f7 * f3) + this.f19920b;
    }
}
