package androidx.appcompat.widget;

import I1.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11555t;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11555t = -1;
        int[] iArr = p073h.a.f16389l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        S.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f11553r = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f11553r);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f11554s != z10) {
            if (!z10 || this.f11553r) {
                this.f11554s = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f11553r) {
            if (size > this.f11555t && this.f11554s) {
                setStacked(false);
            }
            this.f11555t = size;
        }
        if (this.f11554s || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f11553r && !this.f11554s && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f11554s) {
                int childCount2 = getChildCount();
                for (int i14 = i13 + 1; i14 < childCount2; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                }
                paddingBottom = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = S.f3689a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f11553r != z10) {
            this.f11553r = z10;
            if (!z10 && this.f11554s) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
