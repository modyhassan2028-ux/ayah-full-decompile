package com.google.android.material.navigationrail;

import H7.H;
import O8.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ayah.R;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p074h0.i;
import p128m7.a;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Boolean f15094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Boolean f15095B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f15097y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Boolean f15098z;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public View getHeaderView() {
        return this.f15097y;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i14 = this.f15096x;
        View view = this.f15097y;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.f15097y.getBottom() + i14;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            } else {
                i14 = 0;
            }
        } else if ((navigationRailMenuView.f15093c0.gravity & 112) != 48) {
            i14 = 0;
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumWidth > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i10, i11);
        View view = this.f15097y;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild(getNavigationRailMenuView(), i10, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f15097y.getMeasuredHeight()) - this.f15096x, Integer.MIN_VALUE));
    }

    public void setItemMinimumHeight(int i10) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, R.style.Widget_MaterialComponents_NavigationRailView);
        this.f15098z = null;
        this.f15094A = null;
        this.f15095B = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f15096x = dimensionPixelSize;
        Context context2 = getContext();
        i iVarN = H.n(context2, attributeSet, a.f19647O, i10, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.f15097y;
            if (view != null) {
                removeView(view);
                this.f15097y = null;
            }
            this.f15097y = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(5)) {
            this.f15098z = Boolean.valueOf(typedArray.getBoolean(5, false));
        }
        if (typedArray.hasValue(3)) {
            this.f15094A = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        if (typedArray.hasValue(4)) {
            this.f15095B = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fB = p137n7.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float fC = p137n7.a.c(getItemPaddingTop(), fB, dimensionPixelOffset);
        float fC2 = p137n7.a.c(getItemPaddingBottom(), fB, dimensionPixelOffset2);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        iVarN.C();
        H.f(this, new c((Object) this));
    }
}
