package p230x6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f24384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f24385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24386d;

    public a(int i10, int i11, int i12) {
        this.f24383a = i10;
        Paint paint = new Paint(1);
        paint.setColor(i11);
        this.f24384b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i12);
        this.f24385c = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j.e(canvas, "canvas");
        float f3 = getBounds().left;
        boolean z10 = this.f24386d;
        Paint paint = this.f24384b;
        if (!z10) {
            float fWidth = (getBounds().width() / 2.0f) + f3;
            canvas.drawLine(fWidth, getBounds().top, fWidth, getBounds().bottom, paint);
        } else {
            float f7 = getBounds().right;
            canvas.drawRect(getBounds(), this.f24385c);
            canvas.drawLine(f3, getBounds().top, f3, getBounds().bottom, paint);
            canvas.drawLine(f7, getBounds().top, f7, getBounds().bottom, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f24383a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
