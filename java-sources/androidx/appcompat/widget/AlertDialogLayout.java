package androidx.appcompat.widget;

import I1.S;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ayah.R;
import java.util.WeakHashMap;
import p151p.C1268t0;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = S.f3689a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C1268t0 c1268t0 = (C1268t0) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) c1268t0).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) c1268t0).leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) c1268t0).rightMargin;
                    }
                    if (i(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) c1268t0).topMargin;
                    childAt.layout(i16, i22, measuredWidth + i16, i22 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1268t0).bottomMargin + i22;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1268t0).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) c1268t0).rightMargin;
                }
                i16 = i14 - i15;
                if (i(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i23 = paddingTop + ((LinearLayout.LayoutParams) c1268t0).topMargin;
                childAt.layout(i16, i23, measuredWidth + i16, i23 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1268t0).bottomMargin + i23;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iCombineMeasuredStates;
        int iJ;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = alertDialogLayout.getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i10, i11);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iJ = j(view2);
            measuredHeight = view2.getMeasuredHeight() - iJ;
            paddingBottom += iJ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iJ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - iJ;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iJ += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iJ, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = alertDialogLayout.getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i16 = i11;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i16, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    C1268t0 c1268t0 = (C1268t0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1268t0).width == -1) {
                        int i18 = ((LinearLayout.LayoutParams) c1268t0).height;
                        ((LinearLayout.LayoutParams) c1268t0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i16, 0);
                        ((LinearLayout.LayoutParams) c1268t0).height = i18;
                    }
                }
                i17++;
                alertDialogLayout = this;
                i16 = i11;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
