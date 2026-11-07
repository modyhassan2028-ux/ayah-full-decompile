package p177r7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f21577b;

    public /* synthetic */ a(BottomAppBar bottomAppBar, int i10) {
        this.f21576a = i10;
        this.f21577b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i10 = this.f21576a;
        BottomAppBar bottomAppBar = this.f21577b;
        switch (i10) {
            case 1:
                int i11 = BottomAppBar.f14616M0;
                bottomAppBar.f14630q0 = null;
                break;
            case 2:
                int i12 = BottomAppBar.f14616M0;
                bottomAppBar.f14621E0 = false;
                bottomAppBar.f14631r0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f21576a;
        BottomAppBar bottomAppBar = this.f21577b;
        switch (i10) {
            case 0:
                if (!bottomAppBar.f14621E0) {
                    bottomAppBar.G(bottomAppBar.f14632s0, bottomAppBar.f14622F0);
                }
                break;
            case 1:
                int i11 = BottomAppBar.f14616M0;
                break;
            case 2:
                int i12 = BottomAppBar.f14616M0;
                break;
            default:
                bottomAppBar.f14627K0.onAnimationStart(animator);
                View viewC = bottomAppBar.C();
                FloatingActionButton floatingActionButton = viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                }
                break;
        }
    }
}
