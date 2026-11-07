package com.google.android.material.chip;

import G1.g;
import H7.C;
import H7.C0227a;
import H7.E;
import H7.H;
import H7.InterfaceC0234h;
import H7.InterfaceC0235i;
import I1.I;
import I1.S;
import J1.f;
import N7.e;
import O7.a;
import R7.B;
import R7.o;
import R7.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.material.chip.Chip;
import io.realm.internal.ObjectServerFacade;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p181s2.s;
import p185s8.u0;
import p240y7.b;
import p240y7.c;
import p240y7.d;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements c, z, InterfaceC0235i {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Rect f14789O = new Rect();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int[] f14790P = {R.attr.state_selected};
    public static final int[] Q = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0234h f14791A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14792B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14793C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14794D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f14795E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f14796F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14797G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14798H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f14799I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final b f14800J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14801K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f14802L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RectF f14803M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C f14804N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f14805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InsetDrawable f14806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RippleDrawable f14807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View.OnClickListener f14808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f14809z;

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f14803M;
        rectF.setEmpty();
        if (d() && this.f14808y != null) {
            d dVar = this.f14805v;
            Rect bounds = dVar.getBounds();
            rectF.setEmpty();
            if (dVar.b0()) {
                float f3 = dVar.f24709v0 + dVar.f24708u0 + dVar.f24694g0 + dVar.f24707t0 + dVar.f24706s0;
                if (dVar.getLayoutDirection() == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f3;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f14802L;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private e getTextAppearance() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24662C0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f14794D != z10) {
            this.f14794D = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f14793C != z10) {
            this.f14793C = z10;
            refreshDrawableState();
        }
    }

    public final void c(int i10) {
        this.f14798H = i10;
        if (!this.f14796F) {
            InsetDrawable insetDrawable = this.f14806w;
            if (insetDrawable == null) {
                int[] iArr = a.f6500a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f14806w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = a.f6500a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f14805v.R));
        int iMax2 = Math.max(0, i10 - this.f14805v.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f14806w;
            if (insetDrawable2 == null) {
                int[] iArr3 = a.f6500a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f14806w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = a.f6500a;
                    f();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f14806w != null) {
            Rect rect = new Rect();
            this.f14806w.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = a.f6500a;
                f();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f14806w = new InsetDrawable((Drawable) this.f14805v, i11, i12, i11, i12);
        int[] iArr6 = a.f6500a;
        f();
    }

    public final boolean d() {
        d dVar = this.f14805v;
        if (dVar == null) {
            return false;
        }
        Drawable drawable = dVar.f24691d0;
        return (drawable != null ? B1.N(drawable) : null) != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f14801K) {
            return this.f14800J.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        if (!this.f14801K) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f14800J;
        bVar.getClass();
        boolean zQ = false;
        int i11 = 0;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i12 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i12 = 33;
                                } else if (keyCode == 21) {
                                    i12 = 17;
                                } else if (keyCode != 22) {
                                    i12 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i11 < repeatCount && bVar.q(i12, null)) {
                                    i11++;
                                    z10 = true;
                                }
                                zQ = z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i10 = bVar.f7194l;
                                if (i10 != Integer.MIN_VALUE) {
                                    bVar.s(i10, 16, null);
                                }
                                zQ = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i10 = bVar.f7194l;
                    if (i10 != Integer.MIN_VALUE) {
                        bVar.s(i10, 16, null);
                    }
                    zQ = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zQ = bVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zQ = bVar.q(1, null);
            }
        }
        if (!zQ || bVar.f7194l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        int i11;
        super.drawableStateChanged();
        d dVar = this.f14805v;
        boolean zE = false;
        if (dVar != null && d.C(dVar.f24691d0)) {
            d dVar2 = this.f14805v;
            ?? IsEnabled = isEnabled();
            if (this.f14795E) {
                i10 = IsEnabled;
                i10 = IsEnabled + 1;
            }
            i10 = IsEnabled;
            int i12 = i10;
            if (this.f14794D) {
                i12 = i10 + 1;
            }
            int i13 = i12;
            if (this.f14793C) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.f14795E) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f14794D) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f14793C) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            if (!Arrays.equals(dVar2.f24676Q0, iArr)) {
                dVar2.f24676Q0 = iArr;
                if (dVar2.b0()) {
                    zE = dVar2.E(dVar2.getState(), iArr);
                }
            }
        }
        if (zE) {
            invalidate();
        }
    }

    public final void e() {
        d dVar;
        if (!d() || (dVar = this.f14805v) == null || !dVar.f24690c0 || this.f14808y == null) {
            S.o(this, null);
            this.f14801K = false;
        } else {
            S.o(this, this.f14800J);
            this.f14801K = true;
        }
    }

    public final void f() {
        this.f14807x = new RippleDrawable(a.c(this.f14805v.f24681V), getBackgroundDrawable(), null);
        this.f14805v.getClass();
        RippleDrawable rippleDrawable = this.f14807x;
        WeakHashMap weakHashMap = S.f3689a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        d dVar;
        if (TextUtils.isEmpty(getText()) || (dVar = this.f14805v) == null) {
            return;
        }
        int iZ = (int) (dVar.z() + dVar.f24709v0 + dVar.f24706s0);
        d dVar2 = this.f14805v;
        int iY = (int) (dVar2.y() + dVar2.f24702o0 + dVar2.f24705r0);
        if (this.f14806w != null) {
            Rect rect = new Rect();
            this.f14806w.getPadding(rect);
            iY += rect.left;
            iZ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = S.f3689a;
        setPaddingRelative(iY, paddingTop, iZ, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f14799I)) {
            return this.f14799I;
        }
        d dVar = this.f14805v;
        if (dVar == null || !dVar.f24696i0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f14814y.f3463b) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f14806w;
        return insetDrawable == null ? this.f14805v : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24698k0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24699l0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.Q;
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return Math.max(0.0f, dVar.A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f14805v;
    }

    public float getChipEndPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24709v0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        d dVar = this.f14805v;
        if (dVar == null || (drawable = dVar.f24686Y) == null) {
            return null;
        }
        return B1.N(drawable);
    }

    public float getChipIconSize() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24688a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24687Z;
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.R;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24702o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.T;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.U;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        d dVar = this.f14805v;
        if (dVar == null || (drawable = dVar.f24691d0) == null) {
            return null;
        }
        return B1.N(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24695h0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24708u0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24694g0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24707t0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24693f0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24679T0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f14801K) {
            b bVar = this.f14800J;
            if (bVar.f7194l == 1 || bVar.f7193k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public p137n7.e getHideMotionSpec() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24701n0;
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24704q0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24703p0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24681V;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f14805v.f7325r.f7294a;
    }

    public p137n7.e getShowMotionSpec() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24700m0;
        }
        return null;
    }

    public float getTextEndPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24706s0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        d dVar = this.f14805v;
        if (dVar != null) {
            return dVar.f24705r0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        d dVar = this.f14805v;
        if (dVar != null) {
            paint.drawableState = dVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f14804N);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.C(this, this.f14805v);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14790P);
        }
        d dVar = this.f14805v;
        if (dVar != null && dVar.f24696i0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f14801K) {
            b bVar = this.f14800J;
            int i11 = bVar.f7194l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.q(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        d dVar = this.f14805v;
        int i11 = 0;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f24696i0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f14973t) {
                int i12 = 0;
                while (true) {
                    if (i11 >= chipGroup.getChildCount()) {
                        i12 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i11);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
                i10 = i12;
            } else {
                i10 = -1;
            }
            Object tag = getTag(com.ayah.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i10, 1, false, isChecked()).f4217a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f14797G != i10) {
            this.f14797G = i10;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f14793C) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f14793C) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f14808y;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f14801K) {
                        this.f14800J.x(1, 1);
                    }
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f14799I = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14807x) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14807x) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.F(z10);
        }
    }

    public void setCheckableResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.F(dVar.f24710w0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        d dVar = this.f14805v;
        if (dVar == null) {
            this.f14792B = z10;
        } else if (dVar.f24696i0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.G(Y2.a.E(dVar.f24710w0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.H(s.e(dVar.f24710w0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.I(dVar.f24710w0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.Q == colorStateList) {
            return;
        }
        dVar.Q = colorStateList;
        dVar.onStateChange(dVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListE;
        d dVar = this.f14805v;
        if (dVar == null || dVar.Q == (colorStateListE = s.e(dVar.f24710w0, i10))) {
            return;
        }
        dVar.Q = colorStateListE;
        dVar.onStateChange(dVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.J(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.J(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(d dVar) {
        d dVar2 = this.f14805v;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                dVar2.f24678S0 = new WeakReference(null);
            }
            this.f14805v = dVar;
            dVar.f24680U0 = false;
            dVar.f24678S0 = new WeakReference(this);
            c(this.f14798H);
        }
    }

    public void setChipEndPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.f24709v0 == f3) {
            return;
        }
        dVar.f24709v0 = f3;
        dVar.invalidateSelf();
        dVar.D();
    }

    public void setChipEndPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            float dimension = dVar.f24710w0.getResources().getDimension(i10);
            if (dVar.f24709v0 != dimension) {
                dVar.f24709v0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.K(Y2.a.E(dVar.f24710w0, i10));
        }
    }

    public void setChipIconSize(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.L(f3);
        }
    }

    public void setChipIconSizeResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.L(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.M(s.e(dVar.f24710w0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.N(dVar.f24710w0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f3) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.R == f3) {
            return;
        }
        dVar.R = f3;
        dVar.invalidateSelf();
        dVar.D();
    }

    public void setChipMinHeightResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            float dimension = dVar.f24710w0.getResources().getDimension(i10);
            if (dVar.R != dimension) {
                dVar.R = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.f24702o0 == f3) {
            return;
        }
        dVar.f24702o0 = f3;
        dVar.invalidateSelf();
        dVar.D();
    }

    public void setChipStartPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            float dimension = dVar.f24710w0.getResources().getDimension(i10);
            if (dVar.f24702o0 != dimension) {
                dVar.f24702o0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.O(s.e(dVar.f24710w0, i10));
        }
    }

    public void setChipStrokeWidth(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.P(f3);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.P(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.Q(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.f24695h0 == charSequence) {
            return;
        }
        String str = G1.b.f2770b;
        G1.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? G1.b.f2773e : G1.b.f2772d;
        bVar.getClass();
        G1.f fVar = g.f2782a;
        dVar.f24695h0 = bVar.c(charSequence);
        dVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.R(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.R(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.Q(Y2.a.E(dVar.f24710w0, i10));
        }
        e();
    }

    public void setCloseIconSize(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.S(f3);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.S(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.T(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.T(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.U(s.e(dVar.f24710w0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.l(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f14805v == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24679T0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f14796F = z10;
        c(this.f14798H);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(p137n7.e eVar) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24701n0 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24701n0 = p137n7.e.b(dVar.f24710w0, i10);
        }
    }

    public void setIconEndPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.W(f3);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.W(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.X(f3);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.X(dVar.f24710w0.getResources().getDimension(i10));
        }
    }

    @Override // H7.InterfaceC0235i
    public void setInternalOnCheckedChangeListener(InterfaceC0234h interfaceC0234h) {
        this.f14791A = interfaceC0234h;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f14805v == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24682V0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14809z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f14808y = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.Y(colorStateList);
        }
        this.f14805v.getClass();
        f();
    }

    public void setRippleColorResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.Y(s.e(dVar.f24710w0, i10));
            this.f14805v.getClass();
            f();
        }
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        this.f14805v.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(p137n7.e eVar) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24700m0 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24700m0 = p137n7.e.b(dVar.f24710w0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        d dVar = this.f14805v;
        if (dVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dVar.f24680U0 ? null : charSequence, bufferType);
        d dVar2 = this.f14805v;
        if (dVar2 == null || TextUtils.equals(dVar2.f24683W, charSequence)) {
            return;
        }
        dVar2.f24683W = charSequence;
        dVar2.f24662C0.f3445e = true;
        dVar2.invalidateSelf();
        dVar2.D();
    }

    public void setTextAppearance(e eVar) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.f24662C0.c(eVar, dVar.f24710w0);
        }
        h();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.f24706s0 == f3) {
            return;
        }
        dVar.f24706s0 = f3;
        dVar.invalidateSelf();
        dVar.D();
    }

    public void setTextEndPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            float dimension = dVar.f24710w0.getResources().getDimension(i10);
            if (dVar.f24706s0 != dimension) {
                dVar.f24706s0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f3) {
        super.setTextSize(i10, f3);
        d dVar = this.f14805v;
        if (dVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f3, getResources().getDisplayMetrics());
            E e10 = dVar.f24662C0;
            e eVar = e10.g;
            if (eVar != null) {
                eVar.f6065k = fApplyDimension;
                e10.f3441a.setTextSize(fApplyDimension);
                dVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f3) {
        d dVar = this.f14805v;
        if (dVar == null || dVar.f24705r0 == f3) {
            return;
        }
        dVar.f24705r0 = f3;
        dVar.invalidateSelf();
        dVar.D();
    }

    public void setTextStartPaddingResource(int i10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            float dimension = dVar.f24710w0.getResources().getDimension(i10);
            if (dVar.f24705r0 != dimension) {
                dVar.f24705r0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.V(z10);
        }
        e();
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i10);
        this.f14802L = new Rect();
        this.f14803M = new RectF();
        int i11 = 1;
        this.f14804N = new C(i11, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        d dVar = new d(context2, attributeSet, i10);
        Context context3 = dVar.f24710w0;
        int[] iArr = p128m7.a.j;
        TypedArray typedArrayM = H.m(context3, attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        dVar.f24684W0 = typedArrayM.hasValue(37);
        Context context4 = dVar.f24710w0;
        ColorStateList colorStateListW = va.g.w(context4, typedArrayM, 24);
        if (dVar.f24674P != colorStateListW) {
            dVar.f24674P = colorStateListW;
            dVar.onStateChange(dVar.getState());
        }
        ColorStateList colorStateListW2 = va.g.w(context4, typedArrayM, 11);
        if (dVar.Q != colorStateListW2) {
            dVar.Q = colorStateListW2;
            dVar.onStateChange(dVar.getState());
        }
        float dimension = typedArrayM.getDimension(19, 0.0f);
        if (dVar.R != dimension) {
            dVar.R = dimension;
            dVar.invalidateSelf();
            dVar.D();
        }
        if (typedArrayM.hasValue(12)) {
            dVar.J(typedArrayM.getDimension(12, 0.0f));
        }
        dVar.O(va.g.w(context4, typedArrayM, 22));
        dVar.P(typedArrayM.getDimension(23, 0.0f));
        dVar.Y(va.g.w(context4, typedArrayM, 36));
        String text = typedArrayM.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(dVar.f24683W, text);
        E e10 = dVar.f24662C0;
        if (!zEquals) {
            dVar.f24683W = text;
            e10.f3445e = true;
            dVar.invalidateSelf();
            dVar.D();
        }
        e eVar = (!typedArrayM.hasValue(0) || (resourceId = typedArrayM.getResourceId(0, 0)) == 0) ? null : new e(context4, resourceId);
        eVar.f6065k = typedArrayM.getDimension(1, eVar.f6065k);
        e10.c(eVar, context4);
        int i12 = typedArrayM.getInt(3, 0);
        if (i12 == 1) {
            dVar.f24679T0 = TextUtils.TruncateAt.START;
        } else if (i12 == 2) {
            dVar.f24679T0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i12 == 3) {
            dVar.f24679T0 = TextUtils.TruncateAt.END;
        }
        dVar.N(typedArrayM.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            dVar.N(typedArrayM.getBoolean(15, false));
        }
        dVar.K(va.g.z(context4, typedArrayM, 14));
        if (typedArrayM.hasValue(17)) {
            dVar.M(va.g.w(context4, typedArrayM, 17));
        }
        dVar.L(typedArrayM.getDimension(16, -1.0f));
        dVar.V(typedArrayM.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            dVar.V(typedArrayM.getBoolean(26, false));
        }
        dVar.Q(va.g.z(context4, typedArrayM, 25));
        dVar.U(va.g.w(context4, typedArrayM, 30));
        dVar.S(typedArrayM.getDimension(28, 0.0f));
        dVar.F(typedArrayM.getBoolean(6, false));
        dVar.I(typedArrayM.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            dVar.I(typedArrayM.getBoolean(8, false));
        }
        dVar.G(va.g.z(context4, typedArrayM, 7));
        if (typedArrayM.hasValue(9)) {
            dVar.H(va.g.w(context4, typedArrayM, 9));
        }
        dVar.f24700m0 = p137n7.e.a(context4, typedArrayM, 39);
        dVar.f24701n0 = p137n7.e.a(context4, typedArrayM, 33);
        float dimension2 = typedArrayM.getDimension(21, 0.0f);
        if (dVar.f24702o0 != dimension2) {
            dVar.f24702o0 = dimension2;
            dVar.invalidateSelf();
            dVar.D();
        }
        dVar.X(typedArrayM.getDimension(35, 0.0f));
        dVar.W(typedArrayM.getDimension(34, 0.0f));
        float dimension3 = typedArrayM.getDimension(41, 0.0f);
        if (dVar.f24705r0 != dimension3) {
            dVar.f24705r0 = dimension3;
            dVar.invalidateSelf();
            dVar.D();
        }
        float dimension4 = typedArrayM.getDimension(40, 0.0f);
        if (dVar.f24706s0 != dimension4) {
            dVar.f24706s0 = dimension4;
            dVar.invalidateSelf();
            dVar.D();
        }
        dVar.T(typedArrayM.getDimension(29, 0.0f));
        dVar.R(typedArrayM.getDimension(27, 0.0f));
        float dimension5 = typedArrayM.getDimension(13, 0.0f);
        if (dVar.f24709v0 != dimension5) {
            dVar.f24709v0 = dimension5;
            dVar.invalidateSelf();
            dVar.D();
        }
        dVar.f24682V0 = typedArrayM.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM.recycle();
        H.c(context2, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action);
        H.d(context2, attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action);
        this.f14796F = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f14798H = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(H.g(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(dVar);
        WeakHashMap weakHashMap = S.f3689a;
        dVar.l(I.e(this));
        H.c(context2, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action);
        H.d(context2, attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f14800J = new b(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new B(i11, this));
        }
        setChecked(this.f14792B);
        setText(dVar.f24683W);
        setEllipsize(dVar.f24679T0);
        h();
        if (!this.f14805v.f24680U0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f14796F) {
            setMinHeight(this.f14798H);
        }
        this.f14797G = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y7.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip chip = this.f24656a;
                InterfaceC0234h interfaceC0234h = chip.f14791A;
                if (interfaceC0234h != null) {
                    C0227a c0227a = (C0227a) ((O8.c) interfaceC0234h).f6511r;
                    if (!z10 ? c0227a.e(chip, c0227a.f3464c) : c0227a.a(chip)) {
                        c0227a.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f14809z;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.I(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        d dVar = this.f14805v;
        if (dVar != null) {
            dVar.N(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d dVar = this.f14805v;
        if (dVar != null) {
            Context context2 = dVar.f24710w0;
            dVar.f24662C0.c(new e(context2, i10), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        d dVar = this.f14805v;
        if (dVar != null) {
            Context context = dVar.f24710w0;
            dVar.f24662C0.c(new e(context, i10), context);
        }
        h();
    }
}
