package androidx.appcompat.widget;

import E2.C0112b;
import N1.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.ayah.R;
import p017b7.g;
import p151p.C1235c0;
import p151p.C1277y;
import p151p.T;
import p151p.Y0;
import p151p.Z0;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f11502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1277y f11503t;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private C1277y getEmojiTextViewHelper() {
        if (this.f11503t == null) {
            this.f11503t = new C1277y(this);
        }
        return this.f11503t;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            c0112b.a();
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f20768c) {
            return super.getAutoSizeMaxTextSize();
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20647e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f20768c) {
            return super.getAutoSizeMinTextSize();
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20646d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f20768c) {
            return super.getAutoSizeStepGranularity();
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20645c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f20768c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        T t2 = this.f11502s;
        return t2 != null ? t2.f20592i.f20648f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f20768c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            return t2.f20592i.f20643a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11502s.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11502s.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        T t2 = this.f11502s;
        if (t2 == null || q1.f20768c) {
            return;
        }
        t2.f20592i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        T t2 = this.f11502s;
        if (t2 != null) {
            C1235c0 c1235c0 = t2.f20592i;
            if (q1.f20768c || !c1235c0.f()) {
                return;
            }
            c1235c0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.f20585a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11501r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11502s;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11502s;
        t2.l(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t2 = this.f11502s;
        if (t2 != null) {
            t2.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f3) {
        boolean z10 = q1.f20768c;
        if (z10) {
            super.setTextSize(i10, f3);
            return;
        }
        T t2 = this.f11502s;
        if (t2 != null) {
            C1235c0 c1235c0 = t2.f20592i;
            if (z10 || c1235c0.f()) {
                return;
            }
            c1235c0.g(i10, f3);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        Y0.a(this, getContext());
        C0112b c0112b = new C0112b(this);
        this.f11501r = c0112b;
        c0112b.l(attributeSet, i10);
        T t2 = new T(this);
        this.f11502s = t2;
        t2.f(attributeSet, i10);
        t2.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
