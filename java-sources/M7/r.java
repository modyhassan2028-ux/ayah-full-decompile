package M7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5817b;

    public /* synthetic */ r(s sVar, int i10) {
        this.f5816a = i10;
        this.f5817b = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f5816a) {
            case 1:
                super.onAnimationEnd(animator);
                s sVar = this.f5817b;
                sVar.c();
                c cVar = sVar.j;
                if (cVar != null) {
                    cVar.a((o) sVar.f5052a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f5816a) {
            case 0:
                super.onAnimationRepeat(animator);
                s sVar = this.f5817b;
                sVar.g = (sVar.g + 1) % sVar.f5824f.f5754c.length;
                sVar.f5825h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
