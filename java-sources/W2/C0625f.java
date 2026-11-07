package W2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ayah.R;

/* JADX INFO: renamed from: W2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0625f extends AnimatorListenerAdapter implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9541b = false;

    public C0625f(View view) {
        this.f9540a = view;
    }

    @Override // W2.m
    public final void b() {
        View view = this.f9540a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? z.f9592a.H(view) : 0.0f));
    }

    @Override // W2.m
    public final void c() {
        this.f9540a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // W2.m
    public final void d(p pVar) {
        throw null;
    }

    @Override // W2.m
    public final void e(p pVar) {
        throw null;
    }

    @Override // W2.m
    public final void g(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        z.f9592a.X(this.f9540a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f9540a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f9541b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f9541b;
        View view = this.f9540a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        E e10 = z.f9592a;
        e10.X(view, 1.0f);
        e10.getClass();
    }

    @Override // W2.m
    public final void a(p pVar) {
    }

    @Override // W2.m
    public final void f(p pVar) {
    }
}
