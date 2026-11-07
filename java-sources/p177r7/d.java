package p177r7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f21581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f21584e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f21584e = bottomAppBar;
        this.f21581b = actionMenuView;
        this.f21582c = i10;
        this.f21583d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f21580a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f21580a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f21584e;
        int i10 = bottomAppBar.f14620D0;
        boolean z10 = i10 != 0;
        if (i10 != 0) {
            bottomAppBar.f14620D0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.m(i10);
        }
        bottomAppBar.K(this.f21581b, this.f21582c, this.f21583d, z10);
    }
}
