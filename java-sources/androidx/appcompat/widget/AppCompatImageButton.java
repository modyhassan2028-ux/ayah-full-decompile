package androidx.appcompat.widget;

import E2.C0112b;
import G.a0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.ayah.R;
import ka.h;
import p151p.Y0;
import p151p.Z0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f11519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11520t;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            c0112b.a();
        }
        a0 a0Var = this.f11519s;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        h hVar;
        a0 a0Var = this.f11519s;
        if (a0Var == null || (hVar = (h) a0Var.f2656d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f19152c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h hVar;
        a0 a0Var = this.f11519s;
        if (a0Var == null || (hVar = (h) a0Var.f2656d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f19153d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f11519s.f2655c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a0 a0Var = this.f11519s;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a0 a0Var = this.f11519s;
        if (a0Var != null && drawable != null && !this.f11520t) {
            a0Var.f2654b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (a0Var != null) {
            a0Var.b();
            if (this.f11520t) {
                return;
            }
            ImageView imageView = (ImageView) a0Var.f2655c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(a0Var.f2654b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f11520t = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f11519s.m(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a0 a0Var = this.f11519s;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11518r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f11519s;
        if (a0Var != null) {
            if (((h) a0Var.f2656d) == null) {
                a0Var.f2656d = new h();
            }
            h hVar = (h) a0Var.f2656d;
            hVar.f19152c = colorStateList;
            hVar.f19151b = true;
            a0Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f11519s;
        if (a0Var != null) {
            if (((h) a0Var.f2656d) == null) {
                a0Var.f2656d = new h();
            }
            h hVar = (h) a0Var.f2656d;
            hVar.f19153d = mode;
            hVar.f19150a = true;
            a0Var.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        this.f11520t = false;
        Y0.a(this, getContext());
        C0112b c0112b = new C0112b(this);
        this.f11518r = c0112b;
        c0112b.l(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.f11519s = a0Var;
        a0Var.j(attributeSet, i10);
    }
}
