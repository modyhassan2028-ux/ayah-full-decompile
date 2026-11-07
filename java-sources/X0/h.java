package X0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9821B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9822C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f9827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9829x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9830y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9831z = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9820A = Integer.MIN_VALUE;

    public h(float f3, int i10, boolean z10, boolean z11, float f7, boolean z12) {
        this.f9823r = f3;
        this.f9824s = i10;
        this.f9825t = z10;
        this.f9826u = z11;
        this.f9827v = f7;
        this.f9828w = z12;
        if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
            p002a1.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f9824s;
        boolean z12 = this.f9826u;
        boolean z13 = this.f9825t;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f9829x == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f9823r);
            int i17 = iCeil - i16;
            if (!this.f9828w || i17 > 0) {
                float fAbs = this.f9827v;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f9831z = i19;
                int i20 = i19 - iCeil;
                this.f9830y = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f9829x = i20;
                if (z12) {
                    i19 = i18;
                }
                this.f9820A = i19;
                this.f9821B = fontMetricsInt.ascent - i20;
                this.f9822C = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f9830y = i21;
                int i22 = fontMetricsInt.descent;
                this.f9831z = i22;
                this.f9829x = i21;
                this.f9820A = i22;
                this.f9821B = 0;
                this.f9822C = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f9829x : this.f9830y;
        fontMetricsInt.descent = z11 ? this.f9820A : this.f9831z;
    }
}
