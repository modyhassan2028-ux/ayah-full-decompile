package p036d4;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Typeface f15690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f15692t;

    public a(int i10, float f3) {
        Typeface typeface = Typeface.DEFAULT;
        j.e(typeface, "typeface");
        this.f15690r = typeface;
        this.f15691s = i10;
        this.f15692t = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.e(textPaint, "tp");
        textPaint.setTypeface(this.f15690r);
        textPaint.setTextSize(this.f15692t);
        textPaint.setColor(this.f15691s);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        j.e(textPaint, "textPaint");
        textPaint.setTypeface(this.f15690r);
        textPaint.setTextSize(this.f15692t);
        textPaint.setColor(this.f15691s);
    }
}
