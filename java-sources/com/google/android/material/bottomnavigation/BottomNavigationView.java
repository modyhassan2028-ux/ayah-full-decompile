package com.google.android.material.bottomnavigation;

import H7.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ayah.R;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import i7.C;
import p074h0.i;
import p184s7.a;
import p184s7.b;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.f14649f0 != z10) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z10);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, R.style.Widget_Design_BottomNavigationView);
        i iVarN = H.n(getContext(), attributeSet, p128m7.a.f19664f, i10, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        iVarN.C();
        H.f(this, new C(12));
    }
}
