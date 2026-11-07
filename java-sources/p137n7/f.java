package p137n7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20025a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f20027c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20028d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20029e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20026b = 150;

    public f(long j) {
        this.f20025a = j;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f20025a);
        animator.setDuration(this.f20026b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f20028d);
            valueAnimator.setRepeatMode(this.f20029e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f20027c;
        return timeInterpolator != null ? timeInterpolator : a.f20016b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f20025a == fVar.f20025a && this.f20026b == fVar.f20026b && this.f20028d == fVar.f20028d && this.f20029e == fVar.f20029e) {
            return b().getClass().equals(fVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20025a;
        long j10 = this.f20026b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f20028d) * 31) + this.f20029e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(f.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f20025a);
        sb.append(" duration: ");
        sb.append(this.f20026b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f20028d);
        sb.append(" repeatMode: ");
        return a.E(sb, this.f20029e, "}\n");
    }
}
