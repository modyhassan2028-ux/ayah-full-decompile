package F7;

import R7.InterfaceC0482d;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2432b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2438i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2441m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public R7.o f2443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f2444p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R7.q f2431a = R7.p.f7358a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f2433c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2434d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f2435e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f2436f = new RectF();
    public final c g = new c(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2442n = true;

    public d(R7.o oVar) {
        this.f2443o = oVar;
        Paint paint = new Paint(1);
        this.f2432b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f2442n;
        Rect rect = this.f2434d;
        Paint paint = this.f2432b;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f2437h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{A1.a.c(this.f2438i, this.f2441m), A1.a.c(this.j, this.f2441m), A1.a.c(A1.a.e(this.j, 0), this.f2441m), A1.a.c(A1.a.e(this.f2440l, 0), this.f2441m), A1.a.c(this.f2440l, this.f2441m), A1.a.c(this.f2439k, this.f2441m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f2442n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f2435e;
        rectF.set(rect);
        InterfaceC0482d interfaceC0482d = this.f2443o.f7352e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f2436f;
        rectF2.set(bounds);
        float fMin = Math.min(interfaceC0482d.a(rectF2), rectF.width() / 2.0f);
        R7.o oVar = this.f2443o;
        rectF2.set(getBounds());
        if (oVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f2437h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        R7.o oVar = this.f2443o;
        Rect bounds = getBounds();
        RectF rectF = this.f2436f;
        rectF.set(bounds);
        if (oVar.f(rectF)) {
            InterfaceC0482d interfaceC0482d = this.f2443o.f7352e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC0482d.a(rectF));
            return;
        }
        Rect rect = this.f2434d;
        copyBounds(rect);
        RectF rectF2 = this.f2435e;
        rectF2.set(rect);
        R7.o oVar2 = this.f2443o;
        R7.q qVar = this.f2431a;
        Path path = this.f2433c;
        qVar.a(oVar2, 1.0f, rectF2, null, path);
        A1.b.h(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        R7.o oVar = this.f2443o;
        Rect bounds = getBounds();
        RectF rectF = this.f2436f;
        rectF.set(bounds);
        if (!oVar.f(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f2437h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f2444p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2442n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f2444p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f2441m)) != this.f2441m) {
            this.f2442n = true;
            this.f2441m = colorForState;
        }
        if (this.f2442n) {
            invalidateSelf();
        }
        return this.f2442n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f2432b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2432b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
