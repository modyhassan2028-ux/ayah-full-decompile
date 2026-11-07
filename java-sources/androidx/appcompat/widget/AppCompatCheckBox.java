package androidx.appcompat.widget;

import E2.C0112b;
import N1.l;
import N1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.ayah.R;
import p151p.C1269u;
import p151p.C1277y;
import p151p.T;
import p151p.Y0;
import p151p.Z0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements l, m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1269u f11504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0112b f11505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f11506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1277y f11507u;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private C1277y getEmojiTextViewHelper() {
        if (this.f11507u == null) {
            this.f11507u = new C1277y(this);
        }
        return this.f11507u;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            c0112b.a();
        }
        T t2 = this.f11506t;
        if (t2 != null) {
            t2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    @Override // N1.l
    public ColorStateList getSupportButtonTintList() {
        C1269u c1269u = this.f11504r;
        if (c1269u != null) {
            return c1269u.f20782a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1269u c1269u = this.f11504r;
        if (c1269u != null) {
            return c1269u.f20783b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11506t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11506t.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1269u c1269u = this.f11504r;
        if (c1269u != null) {
            if (c1269u.f20786e) {
                c1269u.f20786e = false;
            } else {
                c1269u.f20786e = true;
                c1269u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11506t;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11506t;
        if (t2 != null) {
            t2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11505s;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    @Override // N1.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1269u c1269u = this.f11504r;
        if (c1269u != null) {
            c1269u.f20782a = colorStateList;
            c1269u.f20784c = true;
            c1269u.a();
        }
    }

    @Override // N1.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1269u c1269u = this.f11504r;
        if (c1269u != null) {
            c1269u.f20783b = mode;
            c1269u.f20785d = true;
            c1269u.a();
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11506t;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11506t;
        t2.l(mode);
        t2.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        Y0.a(this, getContext());
        C1269u c1269u = new C1269u(this);
        this.f11504r = c1269u;
        c1269u.c(attributeSet, i10);
        C0112b c0112b = new C0112b(this);
        this.f11505s = c0112b;
        c0112b.l(attributeSet, i10);
        T t2 = new T(this);
        this.f11506t = t2;
        t2.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(Y2.a.E(getContext(), i10));
    }
}
