package p151p;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import com.ayah.R;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f20570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(ScrollingTabContainerView scrollingTabContainerView, Context context) {
        super(context, null, R.attr.actionBarTabStyle);
        this.f20570r = scrollingTabContainerView;
        i iVarB = i.B(context, null, new int[]{android.R.attr.background}, R.attr.actionBarTabStyle);
        if (((TypedArray) iVarB.f16423t).hasValue(0)) {
            setBackgroundDrawable(iVarB.r(0));
        }
        iVarB.C();
        setGravity(8388627);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f20570r;
        if (scrollingTabContainerView.f11587v > 0) {
            int measuredWidth = getMeasuredWidth();
            int i12 = scrollingTabContainerView.f11587v;
            if (measuredWidth > i12) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z10) {
        boolean z11 = isSelected() != z10;
        super.setSelected(z10);
        if (z11 && z10) {
            sendAccessibilityEvent(4);
        }
    }
}
