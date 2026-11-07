package com.google.android.material.internal;

import H7.H;
import I1.B0;
import I1.I;
import I1.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ayah.R;
import java.util.WeakHashMap;
import p128m7.a;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f14988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f14989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f14990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14994x;

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f14989s == null || this.f14988r == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z10 = this.f14991u;
        Rect rect = this.f14990t;
        if (z10) {
            rect.set(0, 0, width, this.f14989s.top);
            this.f14988r.setBounds(rect);
            this.f14988r.draw(canvas);
        }
        if (this.f14992v) {
            rect.set(0, height - this.f14989s.bottom, width, height);
            this.f14988r.setBounds(rect);
            this.f14988r.draw(canvas);
        }
        if (this.f14993w) {
            Rect rect2 = this.f14989s;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f14988r.setBounds(rect);
            this.f14988r.draw(canvas);
        }
        if (this.f14994x) {
            Rect rect3 = this.f14989s;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f14988r.setBounds(rect);
            this.f14988r.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f14988r;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f14988r;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f14992v = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f14993w = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f14994x = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f14991u = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f14988r = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14990t = new Rect();
        this.f14991u = true;
        this.f14992v = true;
        this.f14993w = true;
        this.f14994x = true;
        TypedArray typedArrayM = H.m(context, attributeSet, a.S, i10, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f14988r = typedArrayM.getDrawable(0);
        typedArrayM.recycle();
        setWillNotDraw(true);
        c cVar = new c(13, this);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(this, cVar);
    }

    public void e(B0 b5) {
    }
}
