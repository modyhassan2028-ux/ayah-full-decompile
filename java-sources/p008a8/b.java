package p008a8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p249z7.d;
import p249z7.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11232b;

    public /* synthetic */ b(e eVar, int i10) {
        this.f11231a = i10;
        this.f11232b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11231a) {
            case 0:
                e eVar = this.f11232b;
                d revealInfo = eVar.getRevealInfo();
                revealInfo.f24854c = Float.MAX_VALUE;
                eVar.setRevealInfo(revealInfo);
                break;
            default:
                this.f11232b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f11231a) {
            case 1:
                this.f11232b.e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
