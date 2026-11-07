package P7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6749b;

    public /* synthetic */ m(n nVar, int i10) {
        this.f6748a = i10;
        this.f6749b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6748a) {
            case 0:
                n nVar = this.f6749b;
                if (!nVar.f6750a.g()) {
                    nVar.f6750a.i();
                }
                nVar.f6750a.setTransitionState(j.f6740u);
                break;
            case 1:
                n nVar2 = this.f6749b;
                nVar2.f6752c.setVisibility(8);
                if (!nVar2.f6750a.g()) {
                    nVar2.f6750a.f();
                }
                nVar2.f6750a.setTransitionState(j.f6738s);
                break;
            case 2:
                n nVar3 = this.f6749b;
                if (!nVar3.f6750a.g()) {
                    nVar3.f6750a.i();
                }
                nVar3.f6750a.setTransitionState(j.f6740u);
                break;
            default:
                n nVar4 = this.f6749b;
                nVar4.f6752c.setVisibility(8);
                if (!nVar4.f6750a.g()) {
                    nVar4.f6750a.f();
                }
                nVar4.f6750a.setTransitionState(j.f6738s);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6748a) {
            case 0:
                n nVar = this.f6749b;
                nVar.f6752c.setVisibility(0);
                SearchBar searchBar = nVar.f6762o;
                searchBar.f15122r0.getClass();
                View centerView = searchBar.getCenterView();
                if (centerView != null) {
                    centerView.setAlpha(0.0f);
                }
                break;
            case 1:
                this.f6749b.f6750a.setTransitionState(j.f6737r);
                break;
            case 2:
                n nVar2 = this.f6749b;
                nVar2.f6752c.setVisibility(0);
                nVar2.f6750a.setTransitionState(j.f6739t);
                break;
            default:
                this.f6749b.f6750a.setTransitionState(j.f6737r);
                break;
        }
    }
}
