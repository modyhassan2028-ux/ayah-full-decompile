package com.google.android.material.bottomappbar;

import H7.H;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import u1.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f14644a;

    public a(BottomAppBar.Behavior behavior) {
        this.f14644a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        BottomAppBar.Behavior behavior = this.f14644a;
        Rect rect = behavior.f14640A;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f14641B.get();
        if (bottomAppBar != null) {
            int i18 = bottomAppBar.f14635v0;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.j(rect);
                    int iHeight = rect.height();
                    bottomAppBar.J(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f7352e.a(new RectF(rect)));
                    height = iHeight;
                }
                e eVar = (e) view.getLayoutParams();
                if (behavior.f14642C == 0) {
                    if (bottomAppBar.f14634u0 == 1) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (H.l(view)) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i18;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i18;
                    }
                }
                int i19 = BottomAppBar.f14616M0;
                bottomAppBar.I();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
