package p056f2;

import L5.c;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p251z9.j;

/* JADX INFO: renamed from: f2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933f extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0934g f16091c;

    public C0933f(C0934g c0934g) {
        this.f16091c = c0934g;
    }

    @Override // p056f2.W
    public final void a(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        C0934g c0934g = this.f16091c;
        X x9 = (X) c0934g.f16104r;
        View view = x9.f16041c.f16145X;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((X) c0934g.f16104r).c(this);
        if (K.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + x9 + " has been cancelled.");
        }
    }

    @Override // p056f2.W
    public final void b(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        C0934g c0934g = this.f16091c;
        X x9 = (X) c0934g.f16104r;
        if (c0934g.k()) {
            x9.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = x9.f16041c.f16145X;
        j.d(context, "context");
        c cVarP = c0934g.p(context);
        if (cVarP == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) cVarP.f5532s;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (x9.f16039a != 1) {
            view.startAnimation(animation);
            x9.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        RunnableC0950x runnableC0950x = new RunnableC0950x(animation, viewGroup, view);
        runnableC0950x.setAnimationListener(new AnimationAnimationListenerC0932e(x9, viewGroup, view, this));
        view.startAnimation(runnableC0950x);
        if (K.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + x9 + " has started.");
        }
    }
}
