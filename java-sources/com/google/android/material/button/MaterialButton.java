package com.google.android.material.button;

import H7.H;
import I1.S;
import R7.m;
import R7.o;
import R7.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p151p.C1256n;
import p181s2.s;
import p185s8.u0;
import p202u7.a;
import p202u7.b;
import p202u7.c;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, z {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f14714I = {R.attr.state_checkable};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f14715J = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f14716A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14717B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14719D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14720E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f14721F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14722G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14723H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f14724u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f14725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f14726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f14727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f14728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f14729z;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f14724u;
        return (cVar == null || cVar.f22976o) ? false : true;
    }

    public final void b() {
        int i10 = this.f14723H;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.f14729z, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.f14729z, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.f14729z, null, null);
        }
    }

    public final void c(boolean z10) {
        Drawable drawable = this.f14729z;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f14729z = drawableMutate;
            drawableMutate.setTintList(this.f14728y);
            PorterDuff.Mode mode = this.f14727x;
            if (mode != null) {
                this.f14729z.setTintMode(mode);
            }
            int intrinsicWidth = this.f14717B;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f14729z.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f14717B;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f14729z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f14729z;
            int i10 = this.f14718C;
            int i11 = this.f14719D;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f14729z.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f14723H;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f14729z) || (((i12 == 3 || i12 == 4) && drawable5 != this.f14729z) || ((i12 == 16 || i12 == 32) && drawable4 != this.f14729z))) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        if (this.f14729z == null || getLayout() == null) {
            return;
        }
        int i12 = this.f14723H;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f14718C = 0;
                if (i12 == 16) {
                    this.f14719D = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f14717B;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f14729z.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f14720E) - getPaddingBottom()) / 2);
                if (this.f14719D != iMax) {
                    this.f14719D = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f14719D = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f14723H;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f14718C = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f14717B;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f14729z.getIntrinsicWidth();
        }
        int textLayoutWidth = i10 - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f3689a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f14720E) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f14723H == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f14718C != paddingEnd) {
            this.f14718C = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f14716A)) {
            return this.f14716A;
        }
        c cVar = this.f14724u;
        return ((cVar == null || !cVar.f22978q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f14724u.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f14729z;
    }

    public int getIconGravity() {
        return this.f14723H;
    }

    public int getIconPadding() {
        return this.f14720E;
    }

    public int getIconSize() {
        return this.f14717B;
    }

    public ColorStateList getIconTint() {
        return this.f14728y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14727x;
    }

    public int getInsetBottom() {
        return this.f14724u.f22969f;
    }

    public int getInsetTop() {
        return this.f14724u.f22968e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f14724u.f22973l;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        if (a()) {
            return this.f14724u.f22965b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f14724u.f22972k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f14724u.f22970h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f14724u.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f14724u.f22971i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14721F;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            u0.C(this, this.f14724u.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        c cVar = this.f14724u;
        if (cVar != null && cVar.f22978q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14714I);
        }
        if (this.f14721F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14715J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f14721F);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f14724u;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f22978q);
        accessibilityNodeInfo.setChecked(this.f14721F);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f6852r);
        setChecked(bVar.f22963t);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f22963t = this.f14721F;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f14724u.f22979r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f14729z != null) {
            if (this.f14729z.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f14716A = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!a()) {
            super.setBackgroundColor(i10);
            return;
        }
        c cVar = this.f14724u;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f14724u;
        cVar.f22976o = true;
        MaterialButton materialButton = cVar.f22964a;
        materialButton.setSupportBackgroundTintList(cVar.j);
        materialButton.setSupportBackgroundTintMode(cVar.f22971i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? Y2.a.E(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f14724u.f22978q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        c cVar = this.f14724u;
        if (cVar == null || !cVar.f22978q || !isEnabled() || this.f14721F == z10) {
            return;
        }
        this.f14721F = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.f14721F;
            if (!materialButtonToggleGroup.f14737w) {
                materialButtonToggleGroup.b(getId(), z11);
            }
        }
        if (this.f14722G) {
            return;
        }
        this.f14722G = true;
        Iterator it = this.f14725v.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        this.f14722G = false;
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            c cVar = this.f14724u;
            if (cVar.f22977p && cVar.g == i10) {
                return;
            }
            cVar.g = i10;
            cVar.f22977p = true;
            m mVarG = cVar.f22965b.g();
            mVarG.b(i10);
            cVar.c(mVarG.a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (a()) {
            this.f14724u.b(false).l(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f14729z != drawable) {
            this.f14729z = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f14723H != i10) {
            this.f14723H = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f14720E != i10) {
            this.f14720E = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? Y2.a.E(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f14717B != i10) {
            this.f14717B = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f14728y != colorStateList) {
            this.f14728y = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14727x != mode) {
            this.f14727x = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(s.e(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f14724u;
        cVar.d(cVar.f22968e, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f14724u;
        cVar.d(i10, cVar.f22969f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f14726w = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f14726w;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C1256n) aVar).f20747s).invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f14724u;
            MaterialButton materialButton = cVar.f22964a;
            if (cVar.f22973l != colorStateList) {
                cVar.f22973l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(O7.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(s.e(getContext(), i10));
        }
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f14724u.c(oVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            c cVar = this.f14724u;
            cVar.f22975n = z10;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f14724u;
            if (cVar.f22972k != colorStateList) {
                cVar.f22972k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(s.e(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            c cVar = this.f14724u;
            if (cVar.f22970h != i10) {
                cVar.f22970h = i10;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f14724u;
        if (cVar.j != colorStateList) {
            cVar.j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f14724u;
        if (cVar.f22971i != mode) {
            cVar.f22971i = mode;
            if (cVar.b(false) == null || cVar.f22971i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.f22971i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f14724u.f22979r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14721F);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Button), attributeSet, i10);
        this.f14725v = new LinkedHashSet();
        this.f14721F = false;
        this.f14722G = false;
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19686z, i10, com.ayah.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f14720E = typedArrayM.getDimensionPixelSize(12, 0);
        int i11 = typedArrayM.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f14727x = H.o(i11, mode);
        this.f14728y = g.w(getContext(), typedArrayM, 14);
        this.f14729z = g.z(getContext(), typedArrayM, 10);
        this.f14723H = typedArrayM.getInteger(11, 1);
        this.f14717B = typedArrayM.getDimensionPixelSize(13, 0);
        c cVar = new c(this, o.d(context2, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Button).a());
        this.f14724u = cVar;
        cVar.f22966c = typedArrayM.getDimensionPixelOffset(1, 0);
        cVar.f22967d = typedArrayM.getDimensionPixelOffset(2, 0);
        cVar.f22968e = typedArrayM.getDimensionPixelOffset(3, 0);
        cVar.f22969f = typedArrayM.getDimensionPixelOffset(4, 0);
        if (typedArrayM.hasValue(8)) {
            int dimensionPixelSize = typedArrayM.getDimensionPixelSize(8, -1);
            cVar.g = dimensionPixelSize;
            m mVarG = cVar.f22965b.g();
            mVarG.b(dimensionPixelSize);
            cVar.c(mVarG.a());
            cVar.f22977p = true;
        }
        cVar.f22970h = typedArrayM.getDimensionPixelSize(20, 0);
        cVar.f22971i = H.o(typedArrayM.getInt(7, -1), mode);
        cVar.j = g.w(getContext(), typedArrayM, 6);
        cVar.f22972k = g.w(getContext(), typedArrayM, 19);
        cVar.f22973l = g.w(getContext(), typedArrayM, 16);
        cVar.f22978q = typedArrayM.getBoolean(5, false);
        cVar.f22981t = typedArrayM.getDimensionPixelSize(9, 0);
        cVar.f22979r = typedArrayM.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f3689a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM.hasValue(0)) {
            cVar.f22976o = true;
            setSupportBackgroundTintList(cVar.j);
            setSupportBackgroundTintMode(cVar.f22971i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f22966c, paddingTop + cVar.f22968e, paddingEnd + cVar.f22967d, paddingBottom + cVar.f22969f);
        typedArrayM.recycle();
        setCompoundDrawablePadding(this.f14720E);
        c(this.f14729z != null);
    }
}
