package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f14589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f14590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14591c;

    public a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f14591c = baseBehavior;
        this.f14589a = coordinatorLayout;
        this.f14590b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f14591c.A(this.f14589a, this.f14590b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
