package com.google.android.material.bottomnavigation;

import I1.S;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.ayah.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p140o.k;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f14645b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f14646c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f14647d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f14648e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14649f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ArrayList f14650g0;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.f14650g0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f14645b0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f14646c0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f14647d0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f14648e0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView e(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = S.f3689a;
                if (getLayoutDirection() == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f14650g0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        boolean zF = NavigationBarMenuView.f(getLabelVisibilityMode(), size2);
        int i14 = this.f14647d0;
        if (zF && this.f14649f0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f14648e0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i15 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f14646c0 * i15), Math.min(iMax, i14));
            int i16 = size - iMin;
            int iMin2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.f14645b0);
            int i17 = i16 - (i15 * iMin2);
            int i18 = 0;
            while (i18 < childCount) {
                if (getChildAt(i18).getVisibility() != 8) {
                    i13 = i18 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i17 > 0) {
                        i13++;
                        i17--;
                    }
                } else {
                    i13 = 0;
                }
                arrayList.add(Integer.valueOf(i13));
                i18++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i14);
            int i19 = size - (size2 * iMin3);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() == 8) {
                    i12 = 0;
                } else if (i19 > 0) {
                    i12 = iMin3 + 1;
                    i19--;
                } else {
                    i12 = iMin3;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i21)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f14649f0 = z10;
    }
}
