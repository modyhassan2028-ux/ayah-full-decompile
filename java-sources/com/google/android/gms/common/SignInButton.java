package com.google.android.gms.common;

import Q6.a;
import U6.r;
import U6.y;
import Y6.b;
import a7.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ayah.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f13975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f13976u;

    public SignInButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f13976u;
        if (onClickListener == null || view != this.f13975t) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        setStyle(this.f13973r, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f13975t.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13976u = onClickListener;
        View view = this.f13975t;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.f13973r, this.f13974s);
    }

    public void setSize(int i10) {
        setStyle(i10, this.f13974s);
    }

    public void setStyle(int i10, int i11) {
        this.f13973r = i10;
        this.f13974s = i11;
        Context context = getContext();
        View view = this.f13975t;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13975t = r.f(context, this.f13973r, this.f13974s);
        } catch (c unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i12 = this.f13973r;
            int i13 = this.f13974s;
            zaaa zaaaVar = new zaaa(context, null);
            Resources resources = context.getResources();
            zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaaaVar.setTextSize(14.0f);
            int i14 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaaVar.setMinHeight(i14);
            zaaaVar.setMinWidth(i14);
            int iA = zaaa.a(i13, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
            int iA2 = zaaa.a(i13, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
            if (i12 == 0 || i12 == 1) {
                iA = iA2;
            } else if (i12 != 2) {
                throw new IllegalStateException(p123m2.c.r(i12, "Unknown button size: "));
            }
            Drawable drawable = resources.getDrawable(iA);
            drawable.setTintList(resources.getColorStateList(R.color.common_google_signin_btn_tint));
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
            zaaaVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(zaaa.a(i13, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light));
            y.f(colorStateList);
            zaaaVar.setTextColor(colorStateList);
            if (i12 == 0) {
                zaaaVar.setText(resources.getString(R.string.common_signin_button_text));
            } else if (i12 == 1) {
                zaaaVar.setText(resources.getString(R.string.common_signin_button_text_long));
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException(p123m2.c.r(i12, "Unknown button size: "));
                }
                zaaaVar.setText((CharSequence) null);
            }
            zaaaVar.setTransformationMethod(null);
            if (b.c(zaaaVar.getContext())) {
                zaaaVar.setGravity(19);
            }
            this.f13975t = zaaaVar;
        }
        addView(this.f13975t);
        this.f13975t.setEnabled(isEnabled());
        this.f13975t.setOnClickListener(this);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13976u = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f6868a, 0, 0);
        try {
            this.f13973r = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f13974s = typedArrayObtainStyledAttributes.getInt(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.f13973r, this.f13974s);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    public void setStyle(int i10, int i11, Scope[] scopeArr) {
        setStyle(i10, i11);
    }
}
