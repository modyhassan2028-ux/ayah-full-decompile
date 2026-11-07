package F7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2482d;

    public t(w wVar) {
        this.f2482d = wVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f3 = (int) this.f2481c;
        R7.i iVar = this.f2482d.f2497b;
        if (iVar != null) {
            iVar.l(f3);
        }
        this.f2479a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10 = this.f2479a;
        w wVar = this.f2482d;
        if (!z10) {
            R7.i iVar = wVar.f2497b;
            this.f2480b = iVar == null ? 0.0f : iVar.f7325r.f7304m;
            this.f2481c = a();
            this.f2479a = true;
        }
        float f3 = this.f2480b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f2481c - f3)) + f3);
        R7.i iVar2 = wVar.f2497b;
        if (iVar2 != null) {
            iVar2.l(animatedFraction);
        }
    }
}
