package M7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5764b;

    public /* synthetic */ f(g gVar, int i10) {
        this.f5763a = i10;
        this.f5764b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f5763a) {
            case 1:
                super.onAnimationEnd(animator);
                g gVar = this.f5764b;
                gVar.c();
                c cVar = gVar.j;
                if (cVar != null) {
                    cVar.a((o) gVar.f5052a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f5763a) {
            case 0:
                super.onAnimationRepeat(animator);
                g gVar = this.f5764b;
                gVar.g = (gVar.g + 4) % gVar.f5773f.f5754c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
