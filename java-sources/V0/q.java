package V0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f8383a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return e.a(canvas, path);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return e.e(canvas, rectF);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.a(canvas);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f7, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f7, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f7, float f10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawCircle(f3, f7, f10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f7, RectF rectF2, float f10, float f11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.e(canvas, rectF, f3, f7, rectF2, f10, f11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            h.a(canvas, iArr, i10, fArr, i11, i12, font, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f7, float f10, float f11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawLine(f3, f7, f10, f11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            h.b(canvas, ninePatch, rect, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPoint(f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.g(canvas, renderNode);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f3, float f7, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i10, i11, i12, i13, f3, f7, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.i(canvas);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f8383a;
        if (canvas == null) {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.restore();
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.save();
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f7) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.scale(f3, f7);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f7) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.skew(f3, f7);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f7) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.translate(f3, f7);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return e.d(canvas, rect);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f7, float f10, float f11, float f12, float f13, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawArc(f3, f7, f10, f11, f12, f13, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.c(canvas, j);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f7, float f10, float f11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawOval(f3, f7, f10, f11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            h.c(canvas, ninePatch, rectF, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f7, float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f7, f10, f11, f12, f13, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawText(str, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return g.c(canvas, rectF);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f7, float f10, float f11) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return e.b(canvas, f3, f7, f10, f11);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f7, float f10, float f11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawRect(f3, f7, f10, f11, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f7, float f10, float f11, Paint paint, int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f7, f10, f11, paint, i10);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f7, float f10, float f11, int i10, int i11) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f7, f10, f11, i10, i11);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return e.c(canvas, i10, i11, i12, i13);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f3, float f7, int i12, int i13, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f3, f7, i12, i13, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.b(canvas, i10, blendMode);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f3, float f7, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f3, f7, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f3, float f7, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i10, i11, i12, i13, f3, f7, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return g.b(canvas, path);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f7, float f10, float f11, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f7, f10, f11, paint);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f7, float f10, float f11, int i10) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f7, f10, f11, i10);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f7, float f10, float f11, Region.Op op) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(f3, f7, f10, f11, op);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.d(canvas, j, blendMode);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f7, float f10, float f11, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.quickReject(f3, f7, f10, f11, edgeType);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f7, float f10, float f11) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(f3, f7, f10, f11);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f7, float f10, float f11) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return g.a(canvas, f3, f7, f10, f11);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        p251z9.j.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f3, float f7, boolean z10, Paint paint) {
        Canvas canvas = this.f8383a;
        if (canvas != null) {
            f.h(canvas, measuredText, i10, i11, i12, i13, f3, f7, z10, paint);
        } else {
            p251z9.j.k("nativeCanvas");
            throw null;
        }
    }
}
