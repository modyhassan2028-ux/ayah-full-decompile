package Z7;

import H7.D;
import H7.E;
import K7.b;
import R7.g;
import R7.i;
import R7.j;
import R7.m;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements D {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f11027P;
    public final Context Q;
    public final Paint.FontMetrics R;
    public final E S;
    public final b T;
    public final Rect U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f11028V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f11029W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f11030X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f11031Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f11032Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f11033a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f11034b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f11035c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f11036d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f11037e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f11038f0;

    public a(Context context, int i10) {
        super(context, null, 0, i10);
        this.R = new Paint.FontMetrics();
        E e10 = new E(this);
        this.S = e10;
        this.T = new b(1, this);
        this.U = new Rect();
        this.f11035c0 = 1.0f;
        this.f11036d0 = 1.0f;
        this.f11037e0 = 0.5f;
        this.f11038f0 = 1.0f;
        this.Q = context;
        float f3 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = e10.f3441a;
        textPaint.density = f3;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fW = w();
        float f3 = (float) (-((Math.sqrt(2.0d) * ((double) this.f11033a0)) - ((double) this.f11033a0)));
        canvas.scale(this.f11035c0, this.f11036d0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f11037e0) + getBounds().top);
        canvas.translate(fW, f3);
        super.draw(canvas);
        if (this.f11027P == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            E e10 = this.S;
            TextPaint textPaint = e10.f3441a;
            Paint.FontMetrics fontMetrics = this.R;
            textPaint.getFontMetrics(fontMetrics);
            int i10 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (e10.g != null) {
                textPaint.drawableState = getState();
                e10.g.e(this.Q, e10.f3441a, e10.f3442b);
                textPaint.setAlpha((int) (this.f11038f0 * 255.0f));
            }
            CharSequence charSequence = this.f11027P;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i10, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.S.f3441a.getTextSize(), this.f11030X);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f3 = this.f11028V * 2;
        CharSequence charSequence = this.f11027P;
        return (int) Math.max(f3 + (charSequence == null ? 0.0f : this.S.a(charSequence.toString())), this.f11029W);
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f11032Z) {
            m mVarG = this.f7325r.f7294a.g();
            mVarG.f7345k = x();
            setShapeAppearanceModel(mVarG.a());
        }
    }

    public final float w() {
        int i10;
        Rect rect = this.U;
        if (((rect.right - getBounds().right) - this.f11034b0) - this.f11031Y < 0) {
            i10 = ((rect.right - getBounds().right) - this.f11034b0) - this.f11031Y;
        } else {
            if (((rect.left - getBounds().left) - this.f11034b0) + this.f11031Y <= 0) {
                return 0.0f;
            }
            i10 = ((rect.left - getBounds().left) - this.f11034b0) + this.f11031Y;
        }
        return i10;
    }

    public final j x() {
        float f3 = -w();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f11033a0)))) / 2.0f;
        return new j(new g(this.f11033a0), Math.min(Math.max(f3, -fWidth), fWidth));
    }
}
