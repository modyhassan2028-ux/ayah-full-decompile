package X0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f9815s;

    public /* synthetic */ b(int i10, Object obj) {
        this.f9814r = i10;
        this.f9815s = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9814r) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f9815s);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f9815s);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f9814r) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f9815s);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f9815s);
                break;
        }
    }
}
