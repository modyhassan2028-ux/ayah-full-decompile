package W2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f9510c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9513f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9511d = true;

    public G(int i10, View view) {
        this.f9508a = view;
        this.f9509b = i10;
        this.f9510c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // W2.m
    public final void b() {
        h(false);
        if (this.f9513f) {
            return;
        }
        z.b(this.f9508a, this.f9509b);
    }

    @Override // W2.m
    public final void c() {
        h(true);
        if (this.f9513f) {
            return;
        }
        z.b(this.f9508a, 0);
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

    public final void h(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f9511d || this.f9512e == z10 || (viewGroup = this.f9510c) == null) {
            return;
        }
        this.f9512e = z10;
        B0.c.h0(viewGroup, z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9513f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f9513f) {
            z.b(this.f9508a, this.f9509b);
            ViewGroup viewGroup = this.f9510c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            z.b(this.f9508a, 0);
            ViewGroup viewGroup = this.f9510c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        if (!this.f9513f) {
            z.b(this.f9508a, this.f9509b);
            ViewGroup viewGroup = this.f9510c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // W2.m
    public final void a(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
