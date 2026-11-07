package com.google.android.material.materialswitch;

import A1.a;
import A1.b;
import H7.H;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.ayah.R;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final int[] f14997A0 = {R.attr.state_with_icon};

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Drawable f14998n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Drawable f14999o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15000p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Drawable f15001q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f15002r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorStateList f15003s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f15004t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PorterDuff.Mode f15005u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ColorStateList f15006v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ColorStateList f15007w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f15008x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int[] f15009y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int[] f15010z0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f3) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(a.b(colorStateList.getColorForState(iArr, 0), f3, colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.f14998n0 = b.b(this.f14998n0, this.f15003s0, getThumbTintMode());
        this.f14999o0 = b.b(this.f14999o0, this.f15004t0, this.f15005u0);
        h();
        Drawable drawable = this.f14998n0;
        Drawable drawable2 = this.f14999o0;
        int i10 = this.f15000p0;
        super.setThumbDrawable(b.a(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void f() {
        this.f15001q0 = b.b(this.f15001q0, this.f15006v0, getTrackTintMode());
        this.f15002r0 = b.b(this.f15002r0, this.f15007w0, this.f15008x0);
        h();
        Drawable layerDrawable = this.f15001q0;
        if (layerDrawable != null && this.f15002r0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f15001q0, this.f15002r0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f15002r0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f14998n0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f14999o0;
    }

    public int getThumbIconSize() {
        return this.f15000p0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f15004t0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f15005u0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f15003s0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f15002r0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f15007w0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f15008x0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f15001q0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f15006v0;
    }

    public final void h() {
        if (this.f15003s0 == null && this.f15004t0 == null && this.f15006v0 == null && this.f15007w0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f15003s0;
        if (colorStateList != null) {
            g(this.f14998n0, colorStateList, this.f15009y0, this.f15010z0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f15004t0;
        if (colorStateList2 != null) {
            g(this.f14999o0, colorStateList2, this.f15009y0, this.f15010z0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f15006v0;
        if (colorStateList3 != null) {
            g(this.f15001q0, colorStateList3, this.f15009y0, this.f15010z0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f15007w0;
        if (colorStateList4 != null) {
            g(this.f15002r0, colorStateList4, this.f15009y0, this.f15010z0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f14999o0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14997A0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : iArrOnCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f15009y0 = iArr;
        this.f15010z0 = b.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f14998n0 = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f14999o0 = drawable;
        e();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(Y2.a.E(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.f15000p0 != i10) {
            this.f15000p0 = i10;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f15004t0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f15005u0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f15003s0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f15002r0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(Y2.a.E(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f15007w0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f15008x0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f15001q0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f15006v0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i10);
        this.f15000p0 = -1;
        Context context2 = getContext();
        this.f14998n0 = super.getThumbDrawable();
        this.f15003s0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f15001q0 = super.getTrackDrawable();
        this.f15006v0 = super.getTrackTintList();
        super.setTrackTintList(null);
        i iVarN = H.n(context2, attributeSet, p128m7.a.f19641I, i10, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f14999o0 = iVarN.r(0);
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        this.f15000p0 = typedArray.getDimensionPixelSize(1, -1);
        this.f15004t0 = iVarN.q(2);
        int i11 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f15005u0 = H.o(i11, mode);
        this.f15002r0 = iVarN.r(4);
        this.f15007w0 = iVarN.q(5);
        this.f15008x0 = H.o(typedArray.getInt(6, -1), mode);
        iVarN.C();
        setEnforceSwitchWidth(false);
        e();
        f();
    }
}
