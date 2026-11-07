package com.google.android.material.circularreveal;

import E6.u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p249z7.d;
import p249z7.e;

/* JADX INFO: loaded from: classes.dex */
public class CircularRevealLinearLayout extends LinearLayout implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f14818r;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    @Override // p249z7.e
    public final void c() {
        this.f14818r.getClass();
    }

    @Override // p249z7.e
    public final void d(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        u uVar = this.f14818r;
        if (uVar != null) {
            uVar.k(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // p249z7.e
    public final void e() {
        this.f14818r.getClass();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.f14818r.f1964f;
    }

    @Override // p249z7.e
    public int getCircularRevealScrimColor() {
        return ((Paint) this.f14818r.f1962d).getColor();
    }

    @Override // p249z7.e
    public d getRevealInfo() {
        return this.f14818r.q();
    }

    @Override // p249z7.e
    public final boolean h() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        u uVar = this.f14818r;
        return uVar != null ? uVar.r() : super.isOpaque();
    }

    @Override // p249z7.e
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f14818r.z(drawable);
    }

    @Override // p249z7.e
    public void setCircularRevealScrimColor(int i10) {
        this.f14818r.A(i10);
    }

    @Override // p249z7.e
    public void setRevealInfo(d dVar) {
        this.f14818r.C(dVar);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14818r = new u(this);
    }
}
