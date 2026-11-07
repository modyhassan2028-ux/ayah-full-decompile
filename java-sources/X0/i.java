package X0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint.FontMetricsInt f9832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9835u;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f9832r;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p251z9.j.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f9835u) {
            p002a1.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f9834t;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f9835u = true;
        paint.getTextSize();
        this.f9832r = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            p002a1.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f9833s = (int) Math.ceil(0.0f);
        this.f9834t = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f9835u) {
            p002a1.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f9833s;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
    }
}
