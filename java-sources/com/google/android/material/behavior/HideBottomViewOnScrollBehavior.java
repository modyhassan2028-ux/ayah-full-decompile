package com.google.android.material.behavior;

import F7.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p137n7.a;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TimeInterpolator f14603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TimeInterpolator f14604v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f14608z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f14600r = new LinkedHashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14605w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14606x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14607y = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // u1.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f14605w = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f14601s = p050e8.b.S(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f14602t = p050e8.b.S(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f14603u = p050e8.b.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f20018d);
        this.f14604v = p050e8.b.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f20017c);
        return false;
    }

    @Override // u1.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f14600r;
        if (i10 > 0) {
            if (this.f14606x == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f14608z;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f14606x = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw p245z2.a.z(it);
            }
            this.f14608z = view.animate().translationY(this.f14605w + this.f14607y).setInterpolator(this.f14604v).setDuration(this.f14602t).setListener(new e(13, this));
            return;
        }
        if (i10 >= 0 || this.f14606x == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f14608z;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f14606x = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw p245z2.a.z(it2);
        }
        this.f14608z = view.animate().translationY(0).setInterpolator(this.f14603u).setDuration(this.f14601s).setListener(new e(13, this));
    }

    @Override // u1.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
