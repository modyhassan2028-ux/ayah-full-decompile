package p013b2;

import Aa.a;
import B0.c;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ReplacementSpan {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f13201s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextPaint f13204v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint.FontMetricsInt f13200r = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public short f13202t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13203u = 1.0f;

    public y(x xVar) {
        c.i(xVar, "rasterizer cannot be null");
        this.f13201s = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f13204v;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f13204v = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i12, f3 + this.f13202t, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f7 = i13;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        x xVar = this.f13201s;
        a aVar = xVar.f13198b;
        Typeface typeface = (Typeface) aVar.f557u;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) aVar.f555s, xVar.f13197a * 2, 2, f3, f7, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f13200r;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x xVar = this.f13201s;
        p023c2.a aVarB = xVar.b();
        int iA = aVarB.a(14);
        this.f13203u = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f3680u).getShort(iA + aVarB.f3677r) : (short) 0);
        p023c2.a aVarB2 = xVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f3680u).getShort(iA2 + aVarB2.f3677r);
        }
        p023c2.a aVarB3 = xVar.b();
        int iA3 = aVarB3.a(12);
        short s10 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f3680u).getShort(iA3 + aVarB3.f3677r) : (short) 0) * this.f13203u);
        this.f13202t = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
