package X7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f9998b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f9997a = i10;
        this.f9998b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9997a) {
            case 1:
                this.f9998b.f10047b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9997a) {
            case 0:
                this.f9998b.f10047b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
