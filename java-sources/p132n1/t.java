package p132n1;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19937a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19938b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19939c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19940d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f19941e;

    public t(MotionLayout motionLayout) {
        this.f19941e = motionLayout;
    }

    public final void a() {
        int i10 = this.f19939c;
        MotionLayout motionLayout = this.f19941e;
        if (i10 != -1 || this.f19940d != -1) {
            if (i10 == -1) {
                motionLayout.z(this.f19940d);
            } else {
                int i11 = this.f19940d;
                if (i11 == -1) {
                    motionLayout.setState(i10, -1, -1);
                } else {
                    motionLayout.setTransition(i10, i11);
                }
            }
            motionLayout.setState(v.f19943s);
        }
        if (Float.isNaN(this.f19938b)) {
            if (Float.isNaN(this.f19937a)) {
                return;
            }
            motionLayout.setProgress(this.f19937a);
        } else {
            motionLayout.setProgress(this.f19937a, this.f19938b);
            this.f19937a = Float.NaN;
            this.f19938b = Float.NaN;
            this.f19939c = -1;
            this.f19940d = -1;
        }
    }
}
