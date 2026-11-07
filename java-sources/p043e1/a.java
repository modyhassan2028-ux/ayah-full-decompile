package p043e1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p196u0.c;
import p196u0.f;
import p196u0.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f15749r;

    public a(c cVar) {
        this.f15749r = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            f fVar = f.f22800b;
            c cVar = this.f15749r;
            if (j.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (cVar instanceof g) {
                textPaint.setStyle(Paint.Style.STROKE);
                g gVar = (g) cVar;
                textPaint.setStrokeWidth(gVar.f22801b);
                textPaint.setStrokeMiter(gVar.f22802c);
                int i10 = gVar.f22804e;
                if (i10 == 0) {
                    join = Paint.Join.MITER;
                } else if (i10 == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = gVar.f22803d;
                if (i11 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i11 == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            }
        }
    }
}
