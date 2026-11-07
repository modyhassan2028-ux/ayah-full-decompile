package F5;

import Y3.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Paint f2399e = new Paint();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Paint f2400f = new Paint();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f2402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f2403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2404d;

    public a(Context context, h hVar, T3.a aVar) {
        j.e(aVar, "imageStorage");
        this.f2401a = hVar;
        f2400f.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.quran_selection), PorterDuff.Mode.SRC_IN));
        this.f2402b = (Bitmap) aVar.f7780b.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f2401a.f10398e instanceof p115l4.a) {
            RectF rectF = this.f2403c;
            if (rectF == null) {
                j.k("rectF");
                throw null;
            }
            float f3 = this.f2404d;
            canvas.drawRoundRect(rectF, f3, f3, f2400f);
        }
        canvas.drawBitmap(this.f2402b, (Rect) null, getBounds(), f2399e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2402b.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2402b.getWidth();
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
