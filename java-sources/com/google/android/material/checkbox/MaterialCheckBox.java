package com.google.android.material.checkbox;

import A1.b;
import H7.H;
import M7.c;
import X2.d;
import X2.e;
import Y2.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.ayah.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p074h0.i;
import p185s8.u0;
import p244z1.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int[] f14768P = {R.attr.state_indeterminate};
    public static final int[] Q = {R.attr.state_error};
    public static final int[][] R = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int S = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f14770B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f14771C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Drawable f14772D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f14773E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f14774F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f14775G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PorterDuff.Mode f14776H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f14777I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f14778J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14779K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f14780L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f14781M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final e f14782N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final c f14783O;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f14784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f14785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f14786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14788z;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i10 = this.f14777I;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14786x == null) {
            int iB = a.B(R.attr.colorControlActivated, this);
            int iB2 = a.B(R.attr.colorError, this);
            int iB3 = a.B(R.attr.colorSurface, this);
            int iB4 = a.B(R.attr.colorOnSurface, this);
            this.f14786x = new ColorStateList(R, new int[]{a.V(iB3, 1.0f, iB2), a.V(iB3, 1.0f, iB), a.V(iB3, 0.54f, iB4), a.V(iB3, 0.38f, iB4), a.V(iB3, 0.38f, iB4)});
        }
        return this.f14786x;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f14774F;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        F7.e eVar;
        this.f14771C = b.b(this.f14771C, this.f14774F, getButtonTintMode());
        this.f14772D = b.b(this.f14772D, this.f14775G, this.f14776H);
        if (this.f14773E) {
            e eVar2 = this.f14782N;
            if (eVar2 != null) {
                d dVar = eVar2.f9870s;
                Drawable drawable = eVar2.f9876r;
                c cVar = this.f14783O;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f5749a == null) {
                        cVar.f5749a = new X2.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f5749a);
                }
                ArrayList arrayList = eVar2.f9873v;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (eVar2.f9873v.size() == 0 && (eVar = eVar2.f9872u) != null) {
                        dVar.f9866b.removeListener(eVar);
                        eVar2.f9872u = null;
                    }
                }
                Drawable drawable2 = eVar2.f9876r;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f5749a == null) {
                        cVar.f5749a = new X2.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f5749a);
                } else if (cVar != null) {
                    if (eVar2.f9873v == null) {
                        eVar2.f9873v = new ArrayList();
                    }
                    if (!eVar2.f9873v.contains(cVar)) {
                        eVar2.f9873v.add(cVar);
                        if (eVar2.f9872u == null) {
                            eVar2.f9872u = new F7.e(9, eVar2);
                        }
                        dVar.f9866b.addListener(eVar2.f9872u);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f14771C;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar2 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar2, false);
                    ((AnimatedStateListDrawable) this.f14771C).addTransition(R.id.indeterminate, R.id.unchecked, eVar2, false);
                }
            }
        }
        Drawable drawable4 = this.f14771C;
        if (drawable4 != null && (colorStateList2 = this.f14774F) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f14772D;
        if (drawable5 != null && (colorStateList = this.f14775G) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(b.a(this.f14771C, this.f14772D, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f14771C;
    }

    public Drawable getButtonIconDrawable() {
        return this.f14772D;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f14775G;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f14776H;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f14774F;
    }

    public int getCheckedState() {
        return this.f14777I;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f14770B;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f14777I == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14787y && this.f14774F == null && this.f14775G == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14768P);
        }
        if (this.f14769A) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        this.f14778J = b.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f14788z || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (H.l(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f14769A) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f14770B));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p231x7.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p231x7.a aVar = (p231x7.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f24387r);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        p231x7.a aVar = new p231x7.a(super.onSaveInstanceState());
        aVar.f24387r = getCheckedState();
        return aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.E(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f14772D = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(a.E(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f14775G == colorStateList) {
            return;
        }
        this.f14775G = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f14776H == mode) {
            return;
        }
        this.f14776H = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f14774F == colorStateList) {
            return;
        }
        this.f14774F = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f14788z = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerE;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f14777I != i10) {
            this.f14777I = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f14780L == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f14779K) {
                return;
            }
            this.f14779K = true;
            LinkedHashSet linkedHashSet = this.f14785w;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw p245z2.a.z(it);
                }
            }
            if (this.f14777I != 2 && (onCheckedChangeListener = this.f14781M) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManagerE = J1.c.e(getContext().getSystemService(J1.c.g()))) != null) {
                autofillManagerE.notifyValueChanged(this);
            }
            this.f14779K = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f14770B = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f14769A == z10) {
            return;
        }
        this.f14769A = z10;
        refreshDrawableState();
        Iterator it = this.f14784v.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14781M = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f14780L = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f14787y = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f14771C = drawable;
        this.f14773E = false;
        a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) throws Throwable {
        e eVar;
        int next;
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i10);
        this.f14784v = new LinkedHashSet();
        this.f14785w = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context2, 0);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = j.f24770a;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            eVar.f9876r = drawable;
            drawable.setCallback(eVar.f9874w);
            new F7.c(eVar.f9876r.getConstantState());
        } else {
            int i11 = e.f9869x;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    e eVar2 = new e(context2, 0);
                    eVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                    eVar = eVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e10) {
                Log.e("AnimatedVDCompat", "parser error", e10);
                eVar = null;
            } catch (XmlPullParserException e11) {
                Log.e("AnimatedVDCompat", "parser error", e11);
                eVar = null;
            }
        }
        this.f14782N = eVar;
        this.f14783O = new c(2, this);
        Context context3 = getContext();
        this.f14771C = getButtonDrawable();
        this.f14774F = getSuperButtonTintList();
        setSupportButtonTintList(null);
        i iVarN = H.n(context3, attributeSet, p128m7.a.f19637E, i10, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        this.f14772D = iVarN.r(2);
        if (this.f14771C != null && u0.z(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == S && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f14771C = a.E(context3, R.drawable.mtrl_checkbox_button);
                this.f14773E = true;
                if (this.f14772D == null) {
                    this.f14772D = a.E(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f14775G = g.x(context3, iVarN, 3);
        this.f14776H = H.o(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f14787y = typedArray.getBoolean(10, false);
        this.f14788z = typedArray.getBoolean(6, true);
        this.f14769A = typedArray.getBoolean(9, false);
        this.f14770B = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        iVarN.C();
        a();
    }
}
