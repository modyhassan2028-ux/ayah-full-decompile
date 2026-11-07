package p151p;

import I1.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p073h.a;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class C extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatSeekBar f20533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f20534f;
    public ColorStateList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f20535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20536i;
    public boolean j;

    public C(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.g = null;
        this.f20535h = null;
        this.f20536i = false;
        this.j = false;
        this.f20533e = appCompatSeekBar;
    }

    @Override // p151p.A
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        AppCompatSeekBar appCompatSeekBar = this.f20533e;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = a.f16386h;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        S.n(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        Drawable drawableS = iVarB.s(0);
        if (drawableS != null) {
            appCompatSeekBar.setThumb(drawableS);
        }
        Drawable drawableR = iVarB.r(1);
        Drawable drawable = this.f20534f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f20534f = drawableR;
        if (drawableR != null) {
            drawableR.setCallback(appCompatSeekBar);
            drawableR.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableR.isStateful()) {
                drawableR.setState(appCompatSeekBar.getDrawableState());
            }
            f();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.f20535h = AbstractC1249j0.c(typedArray.getInt(3, -1), this.f20535h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = iVarB.q(2);
            this.f20536i = true;
        }
        iVarB.C();
        f();
    }

    public final void f() {
        Drawable drawable = this.f20534f;
        if (drawable != null) {
            if (this.f20536i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f20534f = drawableMutate;
                if (this.f20536i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f20534f.setTintMode(this.f20535h);
                }
                if (this.f20534f.isStateful()) {
                    this.f20534f.setState(this.f20533e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f20534f != null) {
            AppCompatSeekBar appCompatSeekBar = this.f20533e;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f20534f.getIntrinsicWidth();
                int intrinsicHeight = this.f20534f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f20534f.setBounds(-i10, -i11, i10, i11);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f20534f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
