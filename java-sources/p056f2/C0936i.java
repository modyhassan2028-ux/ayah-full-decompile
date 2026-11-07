package p056f2;

import L5.c;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p020c.C0776a;
import p251z9.j;

/* JADX INFO: renamed from: f2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0936i extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0934g f16100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f16101d;

    public C0936i(C0934g c0934g) {
        this.f16100c = c0934g;
    }

    @Override // p056f2.W
    public final void a(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f16101d;
        C0934g c0934g = this.f16100c;
        if (animatorSet == null) {
            ((X) c0934g.f16104r).c(this);
            return;
        }
        X x9 = (X) c0934g.f16104r;
        if (!x9.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938k.f16103a.a(animatorSet);
        }
        if (K.K(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(x9);
            sb.append(" has been canceled");
            sb.append(x9.g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // p056f2.W
    public final void b(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        X x9 = (X) this.f16100c.f16104r;
        AnimatorSet animatorSet = this.f16101d;
        if (animatorSet == null) {
            x9.c(this);
            return;
        }
        animatorSet.start();
        if (K.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + x9 + " has started.");
        }
    }

    @Override // p056f2.W
    public final void c(C0776a c0776a, ViewGroup viewGroup) {
        j.e(c0776a, "backEvent");
        j.e(viewGroup, "container");
        X x9 = (X) this.f16100c.f16104r;
        AnimatorSet animatorSet = this.f16101d;
        if (animatorSet == null) {
            x9.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !x9.f16041c.f16130D) {
            return;
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + x9);
        }
        long jA = C0937j.f16102a.a(animatorSet);
        long j = (long) (c0776a.f13367c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + x9);
        }
        C0938k.f16103a.b(animatorSet, j);
    }

    @Override // p056f2.W
    public final void d(ViewGroup viewGroup) {
        C0936i c0936i;
        j.e(viewGroup, "container");
        C0934g c0934g = this.f16100c;
        if (c0934g.k()) {
            return;
        }
        Context context = viewGroup.getContext();
        j.d(context, "context");
        c cVarP = c0934g.p(context);
        this.f16101d = cVarP != null ? (AnimatorSet) cVarP.f5533t : null;
        X x9 = (X) c0934g.f16104r;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = x9.f16041c;
        boolean z10 = x9.f16039a == 3;
        View view = abstractComponentCallbacksC0947u.f16145X;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f16101d;
        if (animatorSet != null) {
            c0936i = this;
            animatorSet.addListener(new C0935h(viewGroup, view, z10, x9, c0936i));
        } else {
            c0936i = this;
        }
        AnimatorSet animatorSet2 = c0936i.f16101d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
