package F7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2457a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2460d;

    public m(boolean z10, View view, View view2) {
        this.f2458b = z10;
        this.f2459c = view;
        this.f2460d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2457a) {
            case 0:
                u uVar = (u) this.f2460d;
                uVar.f2511r = 0;
                uVar.f2505l = null;
                M.k kVar = (M.k) this.f2459c;
                if (kVar != null) {
                    ((p000a.a) kVar.f5618s).X();
                }
                break;
            default:
                View view = (View) this.f2460d;
                if (!this.f2458b) {
                    ((View) this.f2459c).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2457a) {
            case 0:
                u uVar = (u) this.f2460d;
                uVar.f2515v.a(0, this.f2458b);
                uVar.f2511r = 2;
                uVar.f2505l = animator;
                break;
            default:
                View view = (View) this.f2460d;
                if (this.f2458b) {
                    ((View) this.f2459c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
                break;
        }
    }

    public m(u uVar, boolean z10, M.k kVar) {
        this.f2460d = uVar;
        this.f2458b = z10;
        this.f2459c = kVar;
    }
}
