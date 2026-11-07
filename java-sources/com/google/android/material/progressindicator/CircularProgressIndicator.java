package com.google.android.material.progressindicator;

import H7.H;
import M7.d;
import M7.e;
import M7.h;
import M7.j;
import M7.o;
import X2.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ayah.R;
import p128m7.a;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<h> {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final d a(Context context, AttributeSet attributeSet) {
        h hVar = new h(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        H.c(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = a.f19672l;
        H.d(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        hVar.f5776h = Math.max(g.y(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), hVar.f5752a * 2);
        hVar.f5777i = g.y(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        hVar.j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hVar.a();
        return hVar;
    }

    public int getIndicatorDirection() {
        return ((h) this.f15103r).j;
    }

    public int getIndicatorInset() {
        return ((h) this.f15103r).f5777i;
    }

    public int getIndicatorSize() {
        return ((h) this.f15103r).f5776h;
    }

    public void setIndicatorDirection(int i10) {
        ((h) this.f15103r).j = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        d dVar = this.f15103r;
        if (((h) dVar).f5777i != i10) {
            ((h) dVar).f5777i = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        d dVar = this.f15103r;
        if (((h) dVar).f5776h != iMax) {
            ((h) dVar).f5776h = iMax;
            ((h) dVar).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((h) this.f15103r).a();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        h hVar = (h) this.f15103r;
        e eVar = new e(hVar);
        Context context2 = getContext();
        o oVar = new o(context2, hVar, eVar, new M7.g(hVar));
        oVar.f5804E = p.a(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(oVar);
        setProgressDrawable(new j(getContext(), hVar, eVar));
    }
}
