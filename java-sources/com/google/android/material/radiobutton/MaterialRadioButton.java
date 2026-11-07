package com.google.android.material.radiobutton;

import H7.H;
import Y2.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[][] f15112x = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f15113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15114w;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15113v == null) {
            int iB = a.B(com.ayah.R.attr.colorControlActivated, this);
            int iB2 = a.B(com.ayah.R.attr.colorOnSurface, this);
            int iB3 = a.B(com.ayah.R.attr.colorSurface, this);
            this.f15113v = new ColorStateList(f15112x, new int[]{a.V(iB3, 1.0f, iB), a.V(iB3, 0.54f, iB2), a.V(iB3, 0.38f, iB2), a.V(iB3, 0.38f, iB2)});
        }
        return this.f15113v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15114w && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15114w = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19639G, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM.hasValue(0)) {
            setButtonTintList(g.w(context2, typedArrayM, 0));
        }
        this.f15114w = typedArrayM.getBoolean(1, false);
        typedArrayM.recycle();
    }
}
