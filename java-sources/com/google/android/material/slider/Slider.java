package com.google.android.material.slider;

import R7.i;
import T7.c;
import T7.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ayah.R;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends c {
    public Slider(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f7907n0;
    }

    public int getFocusedThumbIndex() {
        return this.f7908o0;
    }

    public int getHaloRadius() {
        return this.f7894a0;
    }

    public ColorStateList getHaloTintList() {
        return this.f7924x0;
    }

    public int getLabelBehavior() {
        return this.S;
    }

    public float getStepSize() {
        return this.f7909p0;
    }

    public float getThumbElevation() {
        return this.f7876F0.f7325r.f7304m;
    }

    public int getThumbHeight() {
        return this.f7893W;
    }

    @Override // T7.c
    public int getThumbRadius() {
        return this.f7892V / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f7876F0.f7325r.f7297d;
    }

    public float getThumbStrokeWidth() {
        return this.f7876F0.f7325r.j;
    }

    public ColorStateList getThumbTintList() {
        return this.f7876F0.f7325r.f7296c;
    }

    public int getThumbTrackGapSize() {
        return this.f7895b0;
    }

    public int getThumbWidth() {
        return this.f7892V;
    }

    public int getTickActiveRadius() {
        return this.f7914s0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f7926y0;
    }

    public int getTickInactiveRadius() {
        return this.f7916t0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f7928z0;
    }

    public ColorStateList getTickTintList() {
        if (this.f7928z0.equals(this.f7926y0)) {
            return this.f7926y0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f7866A0;
    }

    public int getTrackHeight() {
        return this.T;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f7868B0;
    }

    public int getTrackInsideCornerSize() {
        return this.f7899f0;
    }

    public int getTrackSidePadding() {
        return this.U;
    }

    public int getTrackStopIndicatorSize() {
        return this.f7898e0;
    }

    public ColorStateList getTrackTintList() {
        if (this.f7868B0.equals(this.f7866A0)) {
            return this.f7866A0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f7918u0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // T7.c
    public float getValueFrom() {
        return this.f7904k0;
    }

    @Override // T7.c
    public float getValueTo() {
        return this.f7905l0;
    }

    @Override // T7.c
    public final boolean q() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    @Override // T7.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i10) {
        super.setFocusedThumbIndex(i10);
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setHaloRadius(int i10) {
        super.setHaloRadius(i10);
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // T7.c
    public void setLabelBehavior(int i10) {
        if (this.S != i10) {
            this.S = i10;
            requestLayout();
        }
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setStepSize(float f3) {
        super.setStepSize(f3);
    }

    @Override // T7.c
    public void setThumbElevation(float f3) {
        this.f7876F0.l(f3);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setThumbHeight(int i10) {
        super.setThumbHeight(i10);
    }

    public void setThumbHeightResource(int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    @Override // T7.c
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f7876F0.r(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(s.e(getContext(), i10));
        }
    }

    @Override // T7.c
    public void setThumbStrokeWidth(float f3) {
        this.f7876F0.s(f3);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        i iVar = this.f7876F0;
        if (colorStateList.equals(iVar.f7325r.f7296c)) {
            return;
        }
        iVar.m(colorStateList);
        invalidate();
    }

    @Override // T7.c
    public void setThumbTrackGapSize(int i10) {
        if (this.f7895b0 == i10) {
            return;
        }
        this.f7895b0 = i10;
        invalidate();
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setThumbWidth(int i10) {
        super.setThumbWidth(i10);
    }

    public void setThumbWidthResource(int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    @Override // T7.c
    public void setTickActiveRadius(int i10) {
        if (this.f7914s0 != i10) {
            this.f7914s0 = i10;
            this.f7921w.setStrokeWidth(i10 * 2);
            z();
        }
    }

    @Override // T7.c
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7926y0)) {
            return;
        }
        this.f7926y0 = colorStateList;
        this.f7921w.setColor(h(colorStateList));
        invalidate();
    }

    @Override // T7.c
    public void setTickInactiveRadius(int i10) {
        if (this.f7916t0 != i10) {
            this.f7916t0 = i10;
            this.f7919v.setStrokeWidth(i10 * 2);
            z();
        }
    }

    @Override // T7.c
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7928z0)) {
            return;
        }
        this.f7928z0 = colorStateList;
        this.f7919v.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.f7912r0 != z10) {
            this.f7912r0 = z10;
            postInvalidate();
        }
    }

    @Override // T7.c
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // T7.c
    public void setTrackHeight(int i10) {
        if (this.T != i10) {
            this.T = i10;
            this.f7911r.setStrokeWidth(i10);
            this.f7913s.setStrokeWidth(this.T);
            z();
        }
    }

    @Override // T7.c
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7868B0)) {
            return;
        }
        this.f7868B0 = colorStateList;
        this.f7911r.setColor(h(colorStateList));
        invalidate();
    }

    @Override // T7.c
    public void setTrackInsideCornerSize(int i10) {
        if (this.f7899f0 == i10) {
            return;
        }
        this.f7899f0 = i10;
        invalidate();
    }

    @Override // T7.c
    public void setTrackStopIndicatorSize(int i10) {
        if (this.f7898e0 == i10) {
            return;
        }
        this.f7898e0 = i10;
        this.f7923x.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f3) {
        setValues(Float.valueOf(f3));
    }

    public void setValueFrom(float f3) {
        this.f7904k0 = f3;
        this.f7922w0 = true;
        postInvalidate();
    }

    public void setValueTo(float f3) {
        this.f7905l0 = f3;
        this.f7922w0 = true;
        postInvalidate();
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.f7878G0 = drawableNewDrawable;
        this.f7880H0.clear();
        postInvalidate();
    }

    public Slider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(d dVar) {
    }
}
