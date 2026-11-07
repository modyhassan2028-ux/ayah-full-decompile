package p132n1;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f19923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f19925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f19926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f19927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f19928f;
    public final Paint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f19929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f19930i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f19932l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19933m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f19934n;

    public r(MotionLayout motionLayout) {
        this.f19934n = motionLayout;
        Paint paint = new Paint();
        this.f19927e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f19928f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f19929h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.j = new float[8];
        Paint paint5 = new Paint();
        this.f19930i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f19925c = new float[100];
        this.f19924b = new int[50];
    }

    public final void a(Canvas canvas, int i10, int i11, n nVar) {
        Canvas canvas2;
        int width;
        int height;
        float f3;
        boolean z10;
        Paint paint = this.g;
        int[] iArr = this.f19924b;
        boolean z11 = false;
        int i12 = 4;
        if (i10 == 4) {
            int i13 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i13 < this.f19931k) {
                int i14 = iArr[i13];
                if (i14 == 1) {
                    z10 = z12;
                    z10 = true;
                }
                if (i14 == 2) {
                    z13 = true;
                }
                i13++;
                z12 = z10;
                z13 = z13;
            }
            if (z12) {
                float[] fArr = this.f19923a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z13) {
                b(canvas);
            }
        }
        if (i10 == 2) {
            float[] fArr2 = this.f19923a;
            float f7 = fArr2[0];
            float f10 = fArr2[1];
            float f11 = fArr2[fArr2.length - 2];
            float f12 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f7, f10, f11, f12, paint);
        } else {
            canvas2 = canvas;
        }
        if (i10 == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.f19923a, this.f19927e);
        View view = nVar.f19895a;
        if (view != null) {
            width = view.getWidth();
            height = nVar.f19895a.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i15 = 1;
        while (i15 < i11 - 1) {
            if (i10 != i12 || iArr[i15 - 1] != 0) {
                int i16 = i15 * 2;
                float[] fArr3 = this.f19925c;
                float f13 = fArr3[i16];
                float f14 = fArr3[i16 + 1];
                this.f19926d.reset();
                this.f19926d.moveTo(f13, f14 + 10.0f);
                this.f19926d.lineTo(f13 + 10.0f, f14);
                this.f19926d.lineTo(f13, f14 - 10.0f);
                this.f19926d.lineTo(f13 - 10.0f, f14);
                this.f19926d.close();
                int i17 = i15 - 1;
                Paint paint2 = this.f19930i;
                if (i10 == i12) {
                    int i18 = iArr[i17];
                    if (i18 == 1) {
                        d(canvas2, f13 - 0.0f, f14 - 0.0f);
                    } else if (i18 == 2) {
                        c(canvas2, f13 - 0.0f, f14 - 0.0f);
                    } else {
                        if (i18 == 3) {
                            f3 = f14;
                            e(canvas2, f13 - 0.0f, f3 - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f19926d, paint2);
                    }
                    f3 = f14;
                    canvas2.drawPath(this.f19926d, paint2);
                } else {
                    f3 = f14;
                }
                if (i10 == 2) {
                    d(canvas2, f13 - 0.0f, f3 - 0.0f);
                }
                if (i10 == 3) {
                    c(canvas2, f13 - 0.0f, f3 - 0.0f);
                }
                if (i10 == 6) {
                    e(canvas2, f13 - 0.0f, f3 - 0.0f, width, height);
                }
                canvas2.drawPath(this.f19926d, paint2);
            }
            i15++;
            z11 = z11;
            i12 = 4;
        }
        boolean z14 = z11;
        float[] fArr4 = this.f19923a;
        if (fArr4.length > 1) {
            float f15 = fArr4[z14 ? 1 : 0];
            float f16 = fArr4[1];
            Paint paint3 = this.f19928f;
            canvas2.drawCircle(f15, f16, 8.0f, paint3);
            float[] fArr5 = this.f19923a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f19923a;
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[fArr.length - 2];
        float f11 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f10);
        float fMax = Math.max(f7, f11);
        float fMax2 = Math.max(f3, f10);
        float fMax3 = Math.max(f7, f11);
        Paint paint = this.g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f3, f10), Math.min(f7, f11), Math.min(f3, f10), Math.max(f7, f11), paint);
    }

    public final void c(Canvas canvas, float f3, float f7) {
        float[] fArr = this.f19923a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        float fMin = Math.min(f10, f12);
        float fMax = Math.max(f11, f13);
        float fMin2 = f3 - Math.min(f10, f12);
        float fMax2 = Math.max(f11, f13) - f7;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f12 - f10))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f19929h;
        Rect rect = this.f19932l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f7 - 20.0f, paint);
        float fMin3 = Math.min(f10, f12);
        Paint paint2 = this.g;
        canvas.drawLine(f3, f7, fMin3, f7, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f13 - f11))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f3 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f3, f7, f3, Math.max(f11, f13), paint2);
    }

    public final void d(Canvas canvas, float f3, float f7) {
        float[] fArr = this.f19923a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f10 - f12, f11 - f13);
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = (((f7 - f11) * f15) + ((f3 - f10) * f14)) / (fHypot * fHypot);
        float f17 = (f14 * f16) + f10;
        float f18 = (f16 * f15) + f11;
        Path path = new Path();
        path.moveTo(f3, f7);
        path.lineTo(f17, f18);
        float fHypot2 = (float) Math.hypot(f17 - f3, f18 - f7);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f19929h;
        Rect rect = this.f19932l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f3, f7, f17, f18, this.g);
    }

    public final void e(Canvas canvas, float f3, float f7, int i10, int i11) {
        StringBuilder sb = new StringBuilder("");
        MotionLayout motionLayout = this.f19934n;
        sb.append(((int) (((double) (((f3 - (i10 / 2)) * 100.0f) / (motionLayout.getWidth() - i10))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f19929h;
        Rect rect = this.f19932l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f3 / 2.0f) - (rect.width() / 2)) + 0.0f, f7 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.g;
        canvas.drawLine(f3, f7, fMin, f7, paint2);
        String str = "" + (((int) (((double) (((f7 - (i11 / 2)) * 100.0f) / (motionLayout.getHeight() - i11))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f3 + 5.0f, 0.0f - ((f7 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f3, f7, f3, Math.max(0.0f, 1.0f), paint2);
    }
}
