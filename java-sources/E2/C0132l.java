package E2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: E2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0134m f1701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f1703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0138o f1704e;

    public /* synthetic */ C0132l(C0138o c0138o, C0134m c0134m, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f1700a = i10;
        this.f1704e = c0138o;
        this.f1701b = c0134m;
        this.f1702c = viewPropertyAnimator;
        this.f1703d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1700a) {
            case 0:
                this.f1702c.setListener(null);
                View view = this.f1703d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0134m c0134m = this.f1701b;
                F0 f3 = c0134m.f1709a;
                C0138o c0138o = this.f1704e;
                c0138o.c(f3);
                c0138o.f1747r.remove(c0134m.f1709a);
                c0138o.i();
                break;
            default:
                this.f1702c.setListener(null);
                View view2 = this.f1703d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0134m c0134m2 = this.f1701b;
                F0 f7 = c0134m2.f1710b;
                C0138o c0138o2 = this.f1704e;
                c0138o2.c(f7);
                c0138o2.f1747r.remove(c0134m2.f1710b);
                c0138o2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1700a) {
            case 0:
                F0 f3 = this.f1701b.f1709a;
                this.f1704e.getClass();
                break;
            default:
                F0 f7 = this.f1701b.f1710b;
                this.f1704e.getClass();
                break;
        }
    }
}
