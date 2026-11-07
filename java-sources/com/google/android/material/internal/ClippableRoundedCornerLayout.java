package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Path f14969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14970s;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public final void a(float f3, float f7, float f10, float f11, float f12) {
        RectF rectF = new RectF(f3, f7, f10, f11);
        if (this.f14969r == null) {
            this.f14969r = new Path();
        }
        this.f14970s = f12;
        this.f14969r.reset();
        this.f14969r.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        this.f14969r.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14969r == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f14969r);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f14970s;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
