package H7;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f3430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3432d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3437k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f3433e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3434f = Integer.MAX_VALUE;
    public float g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3435h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3436i = 1;
    public boolean j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f3438l = null;

    public B(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f3429a = charSequence;
        this.f3430b = textPaint;
        this.f3431c = i10;
        this.f3432d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f3429a == null) {
            this.f3429a = "";
        }
        int iMax = Math.max(0, this.f3431c);
        CharSequence charSequenceEllipsize = this.f3429a;
        int i10 = this.f3434f;
        TextPaint textPaint = this.f3430b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f3438l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f3432d);
        this.f3432d = iMin;
        if (this.f3437k && this.f3434f == 1) {
            this.f3433e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f3433e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.f3437k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3438l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f3434f);
        float f3 = this.g;
        if (f3 != 0.0f || this.f3435h != 1.0f) {
            builderObtain.setLineSpacing(f3, this.f3435h);
        }
        if (this.f3434f > 1) {
            builderObtain.setHyphenationFrequency(this.f3436i);
        }
        return builderObtain.build();
    }
}
