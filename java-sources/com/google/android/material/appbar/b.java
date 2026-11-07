package com.google.android.material.appbar;

import I1.C0243b;
import J1.g;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f14592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f14593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14594f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f14594f = baseBehavior;
        this.f14592d = appBarLayout;
        this.f14593e = coordinatorLayout;
    }

    @Override // I1.C0243b
    public final void d(View view, g gVar) {
        this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
        gVar.m(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f14592d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f14593e;
        AppBarLayout.BaseBehavior baseBehavior = this.f14594f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((p148o7.c) appBarLayout.getChildAt(i10).getLayoutParams()).f20352a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    gVar.b(J1.d.j);
                    gVar.v(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        gVar.b(J1.d.f4200k);
                        gVar.v(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            gVar.b(J1.d.f4200k);
                            gVar.v(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // I1.C0243b
    public final boolean g(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f14592d;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.g(view, i10, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f14594f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f14593e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i11 = -appBarLayout.getDownNestedPreScrollRange();
            if (i11 != 0) {
                baseBehavior.E(coordinatorLayout, this.f14592d, viewB, i11, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
