package com.google.android.material.card;

import H7.H;
import R7.i;
import R7.m;
import R7.o;
import R7.z;
import Y2.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p181s2.s;
import p185s8.u0;
import p212v7.c;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f14741C = {R.attr.state_checkable};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f14742D = {R.attr.state_checked};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f14743E = {com.ayah.R.attr.state_dragged};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14744A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14745B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f14746y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f14747z;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f14746y.f23350c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f14746y).f23360o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        cVar.f23360o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        cVar.f23360o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    public final void f(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f14746y.f23350c.f7325r.f7296c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f14746y.f23351d.f7325r.f7296c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f14746y.j;
    }

    public int getCheckedIconGravity() {
        return this.f14746y.g;
    }

    public int getCheckedIconMargin() {
        return this.f14746y.f23352e;
    }

    public int getCheckedIconSize() {
        return this.f14746y.f23353f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f14746y.f23357l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f14746y.f23349b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f14746y.f23349b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f14746y.f23349b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f14746y.f23349b.top;
    }

    public float getProgress() {
        return this.f14746y.f23350c.f7325r.f7301i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f14746y.f23350c.i();
    }

    public ColorStateList getRippleColor() {
        return this.f14746y.f23356k;
    }

    public o getShapeAppearanceModel() {
        return this.f14746y.f23358m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f14746y.f23359n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f14746y.f23359n;
    }

    public int getStrokeWidth() {
        return this.f14746y.f23354h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14744A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f14746y;
        cVar.k();
        u0.C(this, cVar.f23350c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f14746y;
        if (cVar != null && cVar.f23364s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14741C);
        }
        if (this.f14744A) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14742D);
        }
        if (this.f14745B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14743E);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f14744A);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f14746y;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f23364s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f14744A);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f14746y.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f14747z) {
            c cVar = this.f14746y;
            if (!cVar.f23363r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f23363r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f14746y.f23350c.m(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f3) {
        super.setCardElevation(f3);
        c cVar = this.f14746y;
        cVar.f23350c.l(cVar.f23348a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        i iVar = this.f14746y.f23351d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.m(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f14746y.f23364s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f14744A != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f14746y.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f14746y;
        if (cVar.g != i10) {
            cVar.g = i10;
            MaterialCardView materialCardView = cVar.f23348a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f14746y.f23352e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f14746y.f23352e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f14746y.g(a.E(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f14746y.f23353f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f14746y.f23353f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f14746y;
        cVar.f23357l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.f14746y;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i10, int i11, int i12, int i13) {
        c cVar = this.f14746y;
        cVar.f23349b.set(i10, i11, i12, i13);
        cVar.l();
    }

    public void setDragged(boolean z10) {
        if (this.f14745B != z10) {
            this.f14745B = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f3) {
        super.setMaxCardElevation(f3);
        this.f14746y.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.f14746y;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f3) {
        c cVar = this.f14746y;
        cVar.f23350c.n(f3);
        i iVar = cVar.f23351d;
        if (iVar != null) {
            iVar.n(f3);
        }
        i iVar2 = cVar.f23362q;
        if (iVar2 != null) {
            iVar2.n(f3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f3) {
        super.setRadius(f3);
        c cVar = this.f14746y;
        m mVarG = cVar.f23358m.g();
        mVarG.b(f3);
        cVar.h(mVarG.a());
        cVar.f23355i.invalidateSelf();
        if (cVar.i()) {
            cVar.l();
        } else if (cVar.f23348a.getPreventCornerOverlap()) {
            i iVar = cVar.f23350c;
            if (!iVar.f7325r.f7294a.f(iVar.g())) {
                cVar.l();
            }
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f14746y;
        cVar.f23356k = colorStateList;
        int[] iArr = O7.a.f6500a;
        RippleDrawable rippleDrawable = cVar.f23360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateListE = s.e(getContext(), i10);
        c cVar = this.f14746y;
        cVar.f23356k = colorStateListE;
        int[] iArr = O7.a.f6500a;
        RippleDrawable rippleDrawable = cVar.f23360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListE);
        }
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        setClipToOutline(oVar.f(getBoundsAsRectF()));
        this.f14746y.h(oVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f14746y;
        if (i10 != cVar.f23354h) {
            cVar.f23354h = i10;
            i iVar = cVar.f23351d;
            ColorStateList colorStateList = cVar.f23359n;
            iVar.s(i10);
            iVar.r(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.f14746y;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f14746y;
        if (cVar != null && cVar.f23364s && isEnabled()) {
            this.f14744A = !this.f14744A;
            refreshDrawableState();
            b();
            cVar.f(this.f14744A, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f14746y;
        if (cVar.f23359n != colorStateList) {
            cVar.f23359n = colorStateList;
            i iVar = cVar.f23351d;
            iVar.s(cVar.f23354h);
            iVar.r(colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_CardView), attributeSet, i10);
        this.f14744A = false;
        this.f14745B = false;
        this.f14747z = true;
        TypedArray typedArrayM = H.m(getContext(), attributeSet, p128m7.a.f19636D, i10, com.ayah.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet, i10);
        this.f14746y = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        i iVar = cVar.f23350c;
        iVar.m(cardBackgroundColor);
        cVar.f23349b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f23348a;
        ColorStateList colorStateListW = g.w(materialCardView.getContext(), typedArrayM, 11);
        cVar.f23359n = colorStateListW;
        if (colorStateListW == null) {
            cVar.f23359n = ColorStateList.valueOf(-1);
        }
        cVar.f23354h = typedArrayM.getDimensionPixelSize(12, 0);
        boolean z10 = typedArrayM.getBoolean(0, false);
        cVar.f23364s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f23357l = g.w(materialCardView.getContext(), typedArrayM, 6);
        cVar.g(g.z(materialCardView.getContext(), typedArrayM, 2));
        cVar.f23353f = typedArrayM.getDimensionPixelSize(5, 0);
        cVar.f23352e = typedArrayM.getDimensionPixelSize(4, 0);
        cVar.g = typedArrayM.getInteger(3, 8388661);
        ColorStateList colorStateListW2 = g.w(materialCardView.getContext(), typedArrayM, 7);
        cVar.f23356k = colorStateListW2;
        if (colorStateListW2 == null) {
            cVar.f23356k = ColorStateList.valueOf(a.B(com.ayah.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListW3 = g.w(materialCardView.getContext(), typedArrayM, 1);
        colorStateListW3 = colorStateListW3 == null ? ColorStateList.valueOf(0) : colorStateListW3;
        i iVar2 = cVar.f23351d;
        iVar2.m(colorStateListW3);
        int[] iArr = O7.a.f6500a;
        RippleDrawable rippleDrawable = cVar.f23360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f23356k);
        }
        iVar.l(materialCardView.getCardElevation());
        float f3 = cVar.f23354h;
        ColorStateList colorStateList = cVar.f23359n;
        iVar2.s(f3);
        iVar2.r(colorStateList);
        materialCardView.setBackgroundInternal(cVar.d(iVar));
        Drawable drawableC = cVar.j() ? cVar.c() : iVar2;
        cVar.f23355i = drawableC;
        materialCardView.setForeground(cVar.d(drawableC));
        typedArrayM.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f14746y.f23350c.m(colorStateList);
    }

    public void setOnCheckedChangeListener(p212v7.a aVar) {
    }
}
