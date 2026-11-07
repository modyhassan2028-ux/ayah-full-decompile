package com.google.android.material.navigationrail;

import L7.a;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15092b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final FrameLayout.LayoutParams f15093c0;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.f15092b0 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f15093c0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView e(Context context) {
        return new a(context);
    }

    public final int g(int i10, int i11, int i12, View view) {
        int iMakeMeasureSpec;
        int measuredHeight;
        if (view == null) {
            int iMax = i11 / Math.max(1, i12);
            int size = this.f15092b0;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i10);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i13 += measuredHeight;
            }
        }
        return i13;
    }

    public int getItemMinimumHeight() {
        return this.f15092b0;
    }

    public int getMenuGravity() {
        return this.f15093c0.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iG;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || !NavigationBarMenuView.f(getLabelVisibilityMode(), size2)) {
            iG = g(i10, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, size2);
                int size3 = this.f15092b0;
                if (size3 == -1) {
                    size3 = View.MeasureSpec.getSize(i10);
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size3, iMax), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                size -= measuredHeight;
                size2--;
            } else {
                measuredHeight = 0;
            }
            iG = g(i10, size, size2, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState(iG, i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.f15092b0 != i10) {
            this.f15092b0 = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.f15093c0;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
