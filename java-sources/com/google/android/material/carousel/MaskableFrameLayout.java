package com.google.android.material.carousel;

import R7.A;
import R7.C;
import R7.E;
import R7.o;
import R7.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p137n7.a;
import p180s0.C1292a;
import p222w7.i;
import p222w7.k;

/* JADX INFO: loaded from: classes.dex */
public class MaskableFrameLayout extends FrameLayout implements i, z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f14762w = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f14764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f14765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f14766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f14767v;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        if (this.f14763r != -1.0f) {
            float fB = a.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f14763r);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        A a9 = this.f14766u;
        Path path = a9.f7282e;
        if (!a9.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.f14764s;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f14764s;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f14763r;
    }

    public o getShapeAppearanceModel() {
        return this.f14765t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f14767v;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            A a9 = this.f14766u;
            if (zBooleanValue != a9.f7278a) {
                a9.f7278a = zBooleanValue;
                a9.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A a9 = this.f14766u;
        this.f14767v = Boolean.valueOf(a9.f7278a);
        if (true != a9.f7278a) {
            a9.f7278a = true;
            a9.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f14763r != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f14764s;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setForceCompatClipping(boolean z10) {
        A a9 = this.f14766u;
        if (z10 != a9.f7278a) {
            a9.f7278a = z10;
            a9.a(this);
        }
    }

    @Override // p222w7.i
    public void setMaskRectF(RectF rectF) {
        RectF rectF2 = this.f14764s;
        rectF2.set(rectF);
        A a9 = this.f14766u;
        a9.f7281d = rectF2;
        a9.c();
        a9.a(this);
    }

    @Deprecated
    public void setMaskXPercentage(float f3) {
        float fH = B9.a.h(f3, 0.0f, 1.0f);
        if (this.f14763r != fH) {
            this.f14763r = fH;
            a();
        }
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        o oVarH = oVar.h(new C1292a(24));
        this.f14765t = oVarH;
        A a9 = this.f14766u;
        a9.f7280c = oVarH;
        a9.c();
        a9.a(this);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        A c10;
        super(context, attributeSet, i10);
        this.f14763r = -1.0f;
        this.f14764s = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            c10 = new E(this);
        } else {
            c10 = new C(this);
        }
        this.f14766u = c10;
        this.f14767v = null;
        setShapeAppearanceModel(o.d(context, attributeSet, i10, 0).a());
    }

    public void setOnMaskChangedListener(k kVar) {
    }
}
