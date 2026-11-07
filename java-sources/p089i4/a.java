package p089i4;

import Y3.m;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ImageSpan;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ImageSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f16748r;

    public a(m mVar, float f3) {
        super(mVar);
        this.f16748r = f3;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
        j.e(canvas, "canvas");
        j.e(paint, "paint");
        float f7 = this.f16748r;
        canvas.translate(0.0f, f7);
        super.draw(canvas, charSequence, i10, i11, f3, i12, i13, i14, paint);
        canvas.translate(0.0f, -f7);
    }
}
