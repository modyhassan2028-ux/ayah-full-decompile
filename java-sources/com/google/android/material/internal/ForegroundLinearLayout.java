package com.google.android.material.internal;

import H7.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p128m7.a;

/* JADX INFO: loaded from: classes.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f14975G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Rect f14976H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Rect f14977I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f14978J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f14979K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f14980L;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f14975G;
        if (drawable != null) {
            if (this.f14980L) {
                this.f14980L = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f14979K;
                Rect rect = this.f14976H;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f14978J;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f14977I;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f7) {
        super.drawableHotspotChanged(f3, f7);
        Drawable drawable = this.f14975G;
        if (drawable != null) {
            drawable.setHotspot(f3, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14975G;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f14975G.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f14975G;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f14978J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14975G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f14980L = z10 | this.f14980L;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14980L = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f14975G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f14975G);
            }
            this.f14975G = drawable;
            this.f14980L = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f14978J == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f14978J != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14978J = i10;
            if (i10 == 119 && this.f14975G != null) {
                this.f14975G.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14975G;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14976H = new Rect();
        this.f14977I = new Rect();
        this.f14978J = 119;
        this.f14979K = true;
        this.f14980L = false;
        TypedArray typedArrayM = H.m(context, attributeSet, a.f19682v, i10, 0, new int[0]);
        this.f14978J = typedArrayM.getInt(1, this.f14978J);
        Drawable drawable = typedArrayM.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f14979K = typedArrayM.getBoolean(2, true);
        typedArrayM.recycle();
    }
}
