package E2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F0 f1475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1476f;
    public final ValueAnimator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1478i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1479k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1480l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F0 f1483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J f1484p;

    public F(J j, F0 f3, int i10, float f7, float f10, float f11, float f12, int i11, F0 f13) {
        this.f1484p = j;
        this.f1482n = i11;
        this.f1483o = f13;
        this.f1476f = i10;
        this.f1475e = f3;
        this.f1471a = f7;
        this.f1472b = f10;
        this.f1473c = f11;
        this.f1474d = f12;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0150y(1, this));
        valueAnimatorOfFloat.setTarget(f3.f1486a);
        valueAnimatorOfFloat.addListener(this);
        this.f1481m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f1480l) {
            this.f1475e.o(true);
        }
        this.f1480l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1481m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f1479k) {
            return;
        }
        int i10 = this.f1482n;
        F0 f3 = this.f1483o;
        J j = this.f1484p;
        if (i10 <= 0) {
            j.f1527m.getClass();
            H.a(f3);
        } else {
            j.f1517a.add(f3.f1486a);
            this.f1477h = true;
            if (i10 > 0) {
                j.f1532r.post(new p039d8.a(j, this, i10));
            }
        }
        View view = j.f1537w;
        View view2 = f3.f1486a;
        if (view == view2) {
            j.q(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
