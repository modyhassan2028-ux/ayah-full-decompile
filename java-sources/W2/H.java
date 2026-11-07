package W2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f9514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f9516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9517d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0626g f9518e;

    public H(C0626g c0626g, ViewGroup viewGroup, View view, View view2) {
        this.f9518e = c0626g;
        this.f9514a = viewGroup;
        this.f9515b = view;
        this.f9516c = view2;
    }

    @Override // W2.m
    public final void a(p pVar) {
        if (this.f9517d) {
            h();
        }
    }

    @Override // W2.m
    public final void d(p pVar) {
        throw null;
    }

    @Override // W2.m
    public final void e(p pVar) {
        pVar.z(this);
    }

    @Override // W2.m
    public final void f(p pVar) {
    }

    @Override // W2.m
    public final void g(p pVar) {
        pVar.z(this);
    }

    public final void h() {
        this.f9516c.setTag(R.id.save_overlay_view, null);
        this.f9514a.getOverlay().remove(this.f9515b);
        this.f9517d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f9514a.getOverlay().remove(this.f9515b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f9515b;
        if (view.getParent() == null) {
            this.f9514a.getOverlay().add(view);
        } else {
            this.f9518e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f9516c;
            View view2 = this.f9515b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f9514a.getOverlay().add(view2);
            this.f9517d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        h();
    }

    @Override // W2.m
    public final void b() {
    }

    @Override // W2.m
    public final void c() {
    }
}
