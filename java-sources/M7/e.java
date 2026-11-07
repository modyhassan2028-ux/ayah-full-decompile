package M7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5762f;

    @Override // M7.n
    public final void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11) {
        float fWidth = rect.width() / i();
        float fHeight = rect.height() / i();
        h hVar = (h) this.f5801a;
        float f7 = (hVar.f5776h / 2.0f) + hVar.f5777i;
        canvas.translate((f7 * fWidth) + rect.left, (f7 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (hVar.j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f10 = -f7;
        canvas.clipRect(f10, f10, f7, f7);
        int i10 = hVar.f5752a;
        int i11 = i10 / 2;
        int i12 = hVar.f5753b;
        this.f5761e = i11 <= i12;
        this.f5758b = i10 * f3;
        this.f5759c = Math.min(i10 / 2, i12) * f3;
        int i13 = hVar.f5776h;
        int i14 = hVar.f5752a;
        float f11 = (i13 - i14) / 2.0f;
        this.f5760d = f11;
        if (z10 || z11) {
            if ((z10 && hVar.f5756e == 2) || (z11 && hVar.f5757f == 1)) {
                this.f5760d = (((1.0f - f3) * i14) / 2.0f) + f11;
            } else if ((z10 && hVar.f5756e == 1) || (z11 && hVar.f5757f == 2)) {
                this.f5760d = f11 - (((1.0f - f3) * i14) / 2.0f);
            }
        }
        if (z11 && hVar.f5757f == 3) {
            this.f5762f = f3;
        } else {
            this.f5762f = 1.0f;
        }
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
        return i();
    }

    @Override // M7.n
    public final int f() {
        return i();
    }

    public final void g(Canvas canvas, Paint paint, float f3, float f7, int i10, int i11, int i12) {
        float f10 = f7 >= f3 ? f7 - f3 : (f7 + 1.0f) - f3;
        float f11 = f3 % 1.0f;
        if (this.f5762f < 1.0f) {
            float f12 = f11 + f10;
            if (f12 > 1.0f) {
                g(canvas, paint, f11, 1.0f, i10, i11, 0);
                g(canvas, paint, 1.0f, f12, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f5759c / this.f5760d);
        if (f11 == 0.0f && f10 >= 0.99f) {
            f10 += (((degrees * 2.0f) / 360.0f) * (f10 - 0.99f)) / 0.01f;
        }
        float fP = p000a.a.P(1.0f - this.f5762f, 1.0f, f11);
        float fP2 = p000a.a.P(0.0f, this.f5762f, f10);
        float degrees2 = (float) Math.toDegrees(i11 / this.f5760d);
        float degrees3 = ((fP2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f5760d));
        float f13 = (fP * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f5758b);
        float f14 = degrees * 2.0f;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, (degrees * f15) + f13, this.f5759c * 2.0f, this.f5758b, f15);
            return;
        }
        float f16 = this.f5760d;
        float f17 = -f16;
        RectF rectF = new RectF(f17, f17, f16, f16);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f5761e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f18 = f13 + degrees;
        canvas.drawArc(rectF, f18, degrees3 - f14, false, paint);
        if (this.f5761e || this.f5759c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, f18, this.f5759c * 2.0f, this.f5758b, 1.0f);
        h(canvas, paint, (f13 + degrees3) - degrees, this.f5759c * 2.0f, this.f5758b, 1.0f);
    }

    public final void h(Canvas canvas, Paint paint, float f3, float f7, float f10, float f11) {
        float fMin = (int) Math.min(f10, this.f5758b);
        float f12 = f7 / 2.0f;
        float fMin2 = Math.min(f12, (this.f5759c * fMin) / this.f5758b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f7) / 2.0f, fMin / 2.0f, f12);
        canvas.save();
        double d5 = f3;
        canvas.translate((float) (Math.cos(Math.toRadians(d5)) * ((double) this.f5760d)), (float) (Math.sin(Math.toRadians(d5)) * ((double) this.f5760d)));
        canvas.rotate(f3);
        canvas.scale(f11, f11);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int i() {
        d dVar = this.f5801a;
        return (((h) dVar).f5777i * 2) + ((h) dVar).f5776h;
    }

    @Override // M7.n
    public final void b(Canvas canvas, Paint paint, int i10, int i11) {
    }
}
