package P4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f6671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f6672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f6673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Resources f6674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6676f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f6677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6678i = "";
    public RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6679k;

    public b(Context context) {
        this.f6674d = context.getResources();
        Resources resources = context.getResources();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.f6671a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.f6673c = paint2;
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.number_circle_overlay_text_size);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(dimensionPixelSize);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        float fDescent = textPaint.descent();
        this.f6677h = ((fDescent - textPaint.ascent()) / 2) - fDescent;
        this.f6672b = textPaint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j.e(canvas, "canvas");
        RectF rectF = this.j;
        if (rectF != null && this.f6679k) {
            float f3 = this.f6675e;
            canvas.drawCircle(f3, this.f6676f, f3, this.f6673c);
            canvas.drawArc(rectF, -90.0f, 360 * this.g, true, this.f6671a);
            if (this.f6678i.length() > 0) {
                canvas.drawText(this.f6678i, rectF.centerX(), rectF.centerY() + this.f6677h, this.f6672b);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = (i12 - i10) / 2;
        this.f6675e = i14;
        int i15 = ((i13 - i11) - (i14 * 2)) / 2;
        this.f6676f = i14 + i15;
        int i16 = i11 + i15;
        this.j = new RectF(i10, i16, i12, (this.f6675e * 2) + i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
