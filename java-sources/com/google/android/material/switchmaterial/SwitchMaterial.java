package com.google.android.material.switchmaterial;

import D7.a;
import H7.H;
import I1.I;
import I1.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int[][] f15194r0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final a f15195n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ColorStateList f15196o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorStateList f15197p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f15198q0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f15196o0 == null) {
            int iB = Y2.a.B(com.ayah.R.attr.colorSurface, this);
            int iB2 = Y2.a.B(com.ayah.R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(com.ayah.R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.f15195n0;
            if (aVar.f1336a) {
                float fE = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = S.f3689a;
                    fE += I.e((View) parent);
                }
                dimension += fE;
            }
            int iA = aVar.a(iB, dimension);
            this.f15196o0 = new ColorStateList(f15194r0, new int[]{Y2.a.V(iB, 1.0f, iB2), iA, Y2.a.V(iB, 0.38f, iB2), iA});
        }
        return this.f15196o0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f15197p0 == null) {
            int iB = Y2.a.B(com.ayah.R.attr.colorSurface, this);
            int iB2 = Y2.a.B(com.ayah.R.attr.colorControlActivated, this);
            int iB3 = Y2.a.B(com.ayah.R.attr.colorOnSurface, this);
            this.f15197p0 = new ColorStateList(f15194r0, new int[]{Y2.a.V(iB, 0.54f, iB2), Y2.a.V(iB, 0.32f, iB3), Y2.a.V(iB, 0.12f, iB2), Y2.a.V(iB, 0.12f, iB3)});
        }
        return this.f15197p0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15198q0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f15198q0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15198q0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i10);
        Context context2 = getContext();
        this.f15195n0 = new a(context2);
        H.c(context2, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = p128m7.a.f19657b0;
        H.d(context2, attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f15198q0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
