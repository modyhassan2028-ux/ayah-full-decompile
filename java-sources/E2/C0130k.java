package E2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: E2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f1694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0138o f1699f;

    public C0130k(C0138o c0138o, F0 f3, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1699f = c0138o;
        this.f1694a = f3;
        this.f1695b = i10;
        this.f1696c = view;
        this.f1697d = i11;
        this.f1698e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f1695b;
        View view = this.f1696c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1697d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1698e.setListener(null);
        C0138o c0138o = this.f1699f;
        F0 f3 = this.f1694a;
        c0138o.c(f3);
        c0138o.f1745p.remove(f3);
        c0138o.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1699f.getClass();
    }
}
