package androidx.appcompat.widget;

import E2.C0112b;
import N1.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p074h0.i;
import p151p.A;
import p151p.T;
import p151p.Y0;
import p151p.Z0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f11524u = {R.attr.popupBackground};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f11526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f11527t;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            c0112b.a();
        }
        T t2 = this.f11526s;
        if (t2 != null) {
            t2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11526s.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11526s.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p000a.a.S(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f11527t.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11526s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11526s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(Y2.a.E(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f11527t.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11527t.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11525r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11526s;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11526s;
        t2.l(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t2 = this.f11526s;
        if (t2 != null) {
            t2.g(context, i10);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        Y0.a(this, getContext());
        i iVarB = i.B(getContext(), attributeSet, f11524u, i10);
        if (((TypedArray) iVarB.f16423t).hasValue(0)) {
            setDropDownBackgroundDrawable(iVarB.r(0));
        }
        iVarB.C();
        C0112b c0112b = new C0112b(this);
        this.f11525r = c0112b;
        c0112b.l(attributeSet, i10);
        T t2 = new T(this);
        this.f11526s = t2;
        t2.f(attributeSet, i10);
        t2.b();
        A a9 = new A(this);
        this.f11527t = a9;
        a9.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = a9.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
