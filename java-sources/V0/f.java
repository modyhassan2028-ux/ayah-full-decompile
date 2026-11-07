package V0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    public static void b(Canvas canvas, int i10, BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    public static void c(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void d(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void e(Canvas canvas, RectF rectF, float f3, float f7, RectF rectF2, float f10, float f11, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f3, f7, rectF2, f10, f11, paint);
    }

    public static void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void h(Canvas canvas, MeasuredText measuredText, int i10, int i11, int i12, int i13, float f3, float f7, boolean z10, Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f3, f7, z10, paint);
    }

    public static void i(Canvas canvas) {
        canvas.enableZ();
    }

    public static final void j(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
