package com.google.android.material.divider;

import H7.H;
import I1.S;
import R7.i;
import Y7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.ayah.R;
import java.util.WeakHashMap;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f14907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14911v;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f14909t;
    }

    public int getDividerInsetEnd() {
        return this.f14911v;
    }

    public int getDividerInsetStart() {
        return this.f14910u;
    }

    public int getDividerThickness() {
        return this.f14908s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = S.f3689a;
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f14911v : this.f14910u;
        if (z10) {
            width = getWidth();
            i10 = this.f14910u;
        } else {
            width = getWidth();
            i10 = this.f14911v;
        }
        int i12 = width - i10;
        int bottom = getBottom() - getTop();
        i iVar = this.f14907r;
        iVar.setBounds(i11, 0, i12, bottom);
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f14908s;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f14909t != i10) {
            this.f14909t = i10;
            this.f14907r.m(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(getContext().getColor(i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f14911v = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f14910u = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f14908s != i10) {
            this.f14908s = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i10);
        Context context2 = getContext();
        this.f14907r = new i();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19638F, i10, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f14908s = typedArrayM.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f14910u = typedArrayM.getDimensionPixelOffset(2, 0);
        this.f14911v = typedArrayM.getDimensionPixelOffset(1, 0);
        setDividerColor(g.w(context2, typedArrayM, 0).getDefaultColor());
        typedArrayM.recycle();
    }
}
