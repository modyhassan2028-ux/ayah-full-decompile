package com.google.android.material.circularreveal.cardview;

import E6.u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import p249z7.d;
import p249z7.e;

/* JADX INFO: loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final u f14820F;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // p249z7.e
    public final void c() {
        this.f14820F.getClass();
    }

    @Override // p249z7.e
    public final void d(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        u uVar = this.f14820F;
        if (uVar != null) {
            uVar.k(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // p249z7.e
    public final void e() {
        this.f14820F.getClass();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.f14820F.f1964f;
    }

    @Override // p249z7.e
    public int getCircularRevealScrimColor() {
        return ((Paint) this.f14820F.f1962d).getColor();
    }

    @Override // p249z7.e
    public d getRevealInfo() {
        return this.f14820F.q();
    }

    @Override // p249z7.e
    public final boolean h() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        u uVar = this.f14820F;
        return uVar != null ? uVar.r() : super.isOpaque();
    }

    @Override // p249z7.e
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f14820F.z(drawable);
    }

    @Override // p249z7.e
    public void setCircularRevealScrimColor(int i10) {
        this.f14820F.A(i10);
    }

    @Override // p249z7.e
    public void setRevealInfo(d dVar) {
        this.f14820F.C(dVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14820F = new u(this);
    }
}
