package V0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f8375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8377d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8378e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f8379f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f8380h;

    public l(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f8374a = charSequence;
        this.f8375b = textPaint;
        this.f8376c = i10;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.g) {
            TextDirectionHeuristic textDirectionHeuristicA = s.a(this.f8376c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f8374a;
            TextPaint textPaint = this.f8375b;
            if (i10 >= 33) {
                metricsIsBoring = d.a(charSequence, textPaint, textDirectionHeuristicA);
            } else {
                metricsIsBoring = !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f8379f = metricsIsBoring;
            this.g = true;
        }
        return this.f8379f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f8380h;
        if (charSequence != null) {
            p251z9.j.b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f8374a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (o.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f8380h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float c() {
        if (!Float.isNaN(this.f8377d)) {
            return this.f8377d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f8375b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f8374a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (o.f(spanned, X0.f.class) || o.f(spanned, X0.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f8377d = fCeil;
        return fCeil;
    }
}
