package M7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5809f;

    @Override // M7.n
    public final void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11) {
        this.f5805b = rect.width();
        t tVar = (t) this.f5801a;
        float f7 = tVar.f5752a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f7) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (tVar.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.f5805b / 2.0f;
        float f11 = f7 / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        int i10 = tVar.f5752a;
        int i11 = i10 / 2;
        int i12 = tVar.f5753b;
        this.f5808e = i11 == i12;
        this.f5806c = i10 * f3;
        this.f5807d = Math.min(i10 / 2, i12) * f3;
        if (z10 || z11) {
            if ((z10 && tVar.f5756e == 2) || (z11 && tVar.f5757f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && tVar.f5757f != 3)) {
                canvas.translate(0.0f, ((1.0f - f3) * tVar.f5752a) / 2.0f);
            }
        }
        if (z11 && tVar.f5757f == 3) {
            this.f5809f = f3;
        } else {
            this.f5809f = 1.0f;
        }
    }

    @Override // M7.n
    public final void b(Canvas canvas, Paint paint, int i10, int i11) {
        int iT = Y2.a.t(i10, i11);
        t tVar = (t) this.f5801a;
        if (tVar.f5829k <= 0 || iT == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iT);
        PointF pointF = new PointF((this.f5805b / 2.0f) - (this.f5806c / 2.0f), 0.0f);
        int i12 = tVar.f5829k;
        h(canvas, paint, pointF, null, i12, i12);
    }

    @Override // M7.n
    public final void c(Canvas canvas, Paint paint, m mVar, int i10) {
        int iT = Y2.a.t(mVar.f5799c, i10);
        float f3 = mVar.f5797a;
        float f7 = mVar.f5798b;
        int i11 = mVar.f5800d;
        g(canvas, paint, f3, f7, iT, i11, i11);
    }

    @Override // M7.n
    public final void d(Canvas canvas, Paint paint, float f3, float f7, int i10, int i11, int i12) {
        g(canvas, paint, f3, f7, Y2.a.t(i10, i11), i12, i12);
    }

    @Override // M7.n
    public final int e() {
        return ((t) this.f5801a).f5752a;
    }

    @Override // M7.n
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f3, float f7, int i10, int i11, int i12) {
        float f10;
        float fH = B9.a.h(f3, 0.0f, 1.0f);
        float fH2 = B9.a.h(f7, 0.0f, 1.0f);
        float fP = p000a.a.P(1.0f - this.f5809f, 1.0f, fH);
        float fP2 = p000a.a.P(1.0f - this.f5809f, 1.0f, fH2);
        int iH = (int) ((B9.a.h(fP, 0.0f, 0.01f) * i11) / 0.01f);
        float fH3 = 1.0f - B9.a.h(fP2, 0.99f, 1.0f);
        float f11 = this.f5805b;
        int i13 = (int) ((fP * f11) + iH);
        int i14 = (int) ((fP2 * f11) - ((int) ((fH3 * i12) / 0.01f)));
        float f12 = (-f11) / 2.0f;
        if (i13 <= i14) {
            float f13 = this.f5807d;
            float f14 = i13 + f13;
            float f15 = i14 - f13;
            float f16 = f13 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f5806c);
            if (f14 >= f15) {
                h(canvas, paint, new PointF(f14 + f12, 0.0f), new PointF(f15 + f12, 0.0f), f16, this.f5806c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f5808e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f17 = f14 + f12;
            float f18 = f15 + f12;
            canvas.drawLine(f17, 0.0f, f18, 0.0f, paint);
            if (this.f5808e || this.f5807d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f14 > 0.0f) {
                f10 = f16;
                h(canvas, paint, new PointF(f17, 0.0f), null, f10, this.f5806c);
            } else {
                f10 = f16;
            }
            if (f15 < this.f5805b) {
                h(canvas, paint, new PointF(f18, 0.0f), null, f10, this.f5806c);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f3, float f7) {
        float fMin = Math.min(f7, this.f5806c);
        float f10 = f3 / 2.0f;
        float fMin2 = Math.min(f10, (this.f5807d * fMin) / this.f5806c);
        RectF rectF = new RectF((-f3) / 2.0f, (-fMin) / 2.0f, f10, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
