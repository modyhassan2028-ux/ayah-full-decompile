package L7;

import android.view.View;
import com.ayah.R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes.dex */
public final class a extends NavigationBarItemView {
    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i11)));
        }
    }
}
