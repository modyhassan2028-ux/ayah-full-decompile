package X0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9813s;

    public /* synthetic */ a(int i10, float f3) {
        this.f9812r = i10;
        this.f9813s = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9812r) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f9813s);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f9813s);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f9812r) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f9813s);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f9813s);
                break;
        }
    }
}
