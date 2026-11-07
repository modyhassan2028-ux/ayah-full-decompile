package G1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f2775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2778d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f2775a = textPaint;
        this.f2776b = textDirectionHeuristic;
        this.f2777c = i10;
        this.f2778d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (this.f2777c != cVar.f2777c || this.f2778d != cVar.f2778d) {
            return false;
        }
        TextPaint textPaint = this.f2775a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = cVar.f2775a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
            return false;
        }
        if (i10 >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f2776b == cVar.f2776b;
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f2776b;
        int i11 = this.f2778d;
        int i12 = this.f2777c;
        TextPaint textPaint = this.f2775a;
        return i10 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2775a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f2776b);
        sb.append(", breakStrategy=" + this.f2777c);
        sb.append(", hyphenationFrequency=" + this.f2778d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f2775a = params.getTextPaint();
        this.f2776b = params.getTextDirection();
        this.f2777c = params.getBreakStrategy();
        this.f2778d = params.getHyphenationFrequency();
    }
}
