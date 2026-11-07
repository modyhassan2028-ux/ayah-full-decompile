package com.google.android.material.snackbar;

import I1.S;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ayah.R;
import java.util.WeakHashMap;
import p050e8.b;
import p137n7.a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f15191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f15192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15193t;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15191r.getPaddingTop() == i11 && this.f15191r.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f15191r;
        WeakHashMap weakHashMap = S.f3689a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f15192s;
    }

    public TextView getMessageView() {
        return this.f15191r;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15191r = (TextView) findViewById(R.id.snackbar_text);
        this.f15192s = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f15191r.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f15193t <= 0 || this.f15192s.getMeasuredWidth() <= this.f15193t) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f15193t = i10;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.T(context, R.attr.motionEasingEmphasizedInterpolator, a.f20016b);
    }
}
