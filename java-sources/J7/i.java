package J7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4384c;

    public i(j jVar, boolean z10, int i10) {
        this.f4384c = jVar;
        this.f4382a = z10;
        this.f4383b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f4384c;
        jVar.f4367b.setTranslationX(0.0f);
        jVar.d(this.f4383b, 0.0f, this.f4382a);
    }
}
