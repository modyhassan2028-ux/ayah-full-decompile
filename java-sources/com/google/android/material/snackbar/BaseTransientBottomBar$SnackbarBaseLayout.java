package com.google.android.material.snackbar;

import H7.H;
import I1.G;
import I1.I;
import I1.S;
import R7.i;
import R7.o;
import U7.b;
import U7.c;
import Y7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ayah.R;
import java.util.WeakHashMap;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f15182z = new b(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f15183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f15185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f15186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f15189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f15190y;

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p128m7.a.f19655a0);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = S.f3689a;
            I.k(this, dimensionPixelSize);
        }
        this.f15184s = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f15183r = o.d(context2, attributeSet, 0, 0).a();
        }
        this.f15185t = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(g.w(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(H.o(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f15186u = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f15187v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f15188w = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f15182z);
        setFocusable(true);
        if (getBackground() == null) {
            int iV = Y2.a.V(Y2.a.B(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), Y2.a.B(R.attr.colorOnSurface, this));
            o oVar = this.f15183r;
            if (oVar != null) {
                int i10 = c.f8316a;
                i iVar = new i(oVar);
                iVar.m(ColorStateList.valueOf(iV));
                drawable = iVar;
            } else {
                Resources resources = getResources();
                int i11 = c.f8316a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iV);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f15189x;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = S.f3689a;
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f15186u;
    }

    public int getAnimationMode() {
        return this.f15184s;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f15185t;
    }

    public int getMaxInlineActionWidth() {
        return this.f15188w;
    }

    public int getMaxWidth() {
        return this.f15187v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = S.f3689a;
        G.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f15187v;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f15184s = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f15189x != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f15189x);
            drawable.setTintMode(this.f15190y);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f15189x = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f15190y);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f15190y = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f15182z);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(c cVar) {
    }
}
