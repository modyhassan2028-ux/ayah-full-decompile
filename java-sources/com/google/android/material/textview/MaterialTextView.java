package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ayah.R;
import p128m7.a;
import p185s8.u0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (u0.z(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, a.f19642J);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iY = -1;
            for (int i11 = 0; i11 < 2 && iY < 0; i11++) {
                iY = g.y(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iY >= 0) {
                setLineHeight(iY);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, 0), attributeSet, i10);
        Context context2 = getContext();
        if (u0.z(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.f19643K;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, 0);
            int[] iArr2 = {1, 2};
            int iY = -1;
            for (int i11 = 0; i11 < 2 && iY < 0; i11++) {
                iY = g.y(context2, typedArrayObtainStyledAttributes, iArr2[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iY != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i10, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a.f19642J);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iY2 = -1;
                for (int i12 = 0; i12 < 2 && iY2 < 0; i12++) {
                    iY2 = g.y(context3, typedArrayObtainStyledAttributes3, iArr3[i12], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iY2 >= 0) {
                    setLineHeight(iY2);
                }
            }
        }
    }
}
