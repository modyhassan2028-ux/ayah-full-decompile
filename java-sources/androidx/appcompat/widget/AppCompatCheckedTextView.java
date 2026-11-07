package androidx.appcompat.widget;

import E2.C0112b;
import I1.S;
import N1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.ayah.R;
import p017b7.g;
import p074h0.i;
import p151p.AbstractC1249j0;
import p151p.C1269u;
import p151p.C1277y;
import p151p.T;
import p151p.Y0;
import p151p.Z0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1269u f11508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0112b f11509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f11510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1277y f11511u;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private C1277y getEmojiTextViewHelper() {
        if (this.f11511u == null) {
            this.f11511u = new C1277y(this);
        }
        return this.f11511u;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        T t2 = this.f11510t;
        if (t2 != null) {
            t2.b();
        }
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            c0112b.a();
        }
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            c1269u.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            return c1269u.f20782a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            return c1269u.f20783b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11510t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11510t.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p000a.a.S(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            if (c1269u.f20786e) {
                c1269u.f20786e = false;
            } else {
                c1269u.f20786e = true;
                c1269u.b();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11510t;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11510t;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11509s;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            c1269u.f20782a = colorStateList;
            c1269u.f20784c = true;
            c1269u.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1269u c1269u = this.f11508r;
        if (c1269u != null) {
            c1269u.f20783b = mode;
            c1269u.f20785d = true;
            c1269u.b();
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11510t;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11510t;
        t2.l(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t2 = this.f11510t;
        if (t2 != null) {
            t2.g(context, i10);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i10);
        Z0.a(context);
        Y0.a(this, getContext());
        T t2 = new T(this);
        this.f11510t = t2;
        t2.f(attributeSet, i10);
        t2.b();
        C0112b c0112b = new C0112b(this);
        this.f11509s = c0112b;
        c0112b.l(attributeSet, i10);
        this.f11508r = new C1269u(this);
        Context context2 = getContext();
        int[] iArr = p073h.a.f16390m;
        i iVarB = i.B(context2, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        S.n(this, getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(Y2.a.E(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(Y2.a.E(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(Y2.a.E(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(iVarB.q(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1249j0.c(typedArray.getInt(3, -1), null));
            }
            iVarB.C();
            getEmojiTextViewHelper().b(attributeSet, i10);
        } catch (Throwable th) {
            iVarB.C();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(Y2.a.E(getContext(), i10));
    }
}
