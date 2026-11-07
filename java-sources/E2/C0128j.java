package E2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: E2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1683a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f1684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0138o f1687e;

    public C0128j(C0138o c0138o, F0 f3, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1687e = c0138o;
        this.f1684b = f3;
        this.f1686d = viewPropertyAnimator;
        this.f1685c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1683a) {
            case 1:
                this.f1685c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1683a) {
            case 0:
                this.f1686d.setListener(null);
                this.f1685c.setAlpha(1.0f);
                C0138o c0138o = this.f1687e;
                F0 f3 = this.f1684b;
                c0138o.c(f3);
                c0138o.f1746q.remove(f3);
                c0138o.i();
                break;
            default:
                this.f1686d.setListener(null);
                C0138o c0138o2 = this.f1687e;
                F0 f7 = this.f1684b;
                c0138o2.c(f7);
                c0138o2.f1744o.remove(f7);
                c0138o2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1683a) {
            case 0:
                this.f1687e.getClass();
                break;
            default:
                this.f1687e.getClass();
                break;
        }
    }

    public C0128j(C0138o c0138o, F0 f3, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1687e = c0138o;
        this.f1684b = f3;
        this.f1685c = view;
        this.f1686d = viewPropertyAnimator;
    }
}
