package R7;

import D.C0061d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class i extends Drawable implements z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Paint f7310O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f7311A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Region f7312B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Region f7313C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public o f7314D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Paint f7315E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Paint f7316F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Q7.a f7317G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p248z6.c f7318H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final q f7319I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public PorterDuffColorFilter f7320J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public PorterDuffColorFilter f7321K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f7322L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RectF f7323M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f7324N;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f7325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x[] f7326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x[] f7327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final BitSet f7328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Matrix f7330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Path f7331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Path f7332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f7333z;

    static {
        Paint paint = new Paint(1);
        f7310O = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public i() {
        this(new o());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.f7325r;
        this.f7319I.a(hVar.f7294a, hVar.f7301i, rectF, this.f7318H, path);
        if (this.f7325r.f7300h != 1.0f) {
            Matrix matrix = this.f7330w;
            matrix.reset();
            float f3 = this.f7325r.f7300h;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f7323M, true);
    }

    public final int c(int i10) {
        h hVar = this.f7325r;
        float f3 = hVar.f7304m + 0.0f + hVar.f7303l;
        D7.a aVar = hVar.f7295b;
        return aVar != null ? aVar.a(i10, f3) : i10;
    }

    public final void d(Canvas canvas) {
        if (this.f7328u.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f7325r.f7307p;
        Path path = this.f7331x;
        Q7.a aVar = this.f7317G;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f6872a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            x xVar = this.f7326s[i11];
            int i12 = this.f7325r.f7306o;
            Matrix matrix = x.f7384b;
            xVar.a(matrix, aVar, i12, canvas);
            this.f7327t[i11].a(matrix, aVar, this.f7325r.f7306o, canvas);
        }
        if (this.f7324N) {
            h hVar = this.f7325r;
            int iSin = (int) (Math.sin(Math.toRadians(hVar.f7308q)) * ((double) hVar.f7307p));
            int iH = h();
            canvas.translate(-iSin, -iH);
            canvas.drawPath(path, f7310O);
            canvas.translate(iSin, iH);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.f7320J;
        Paint paint = this.f7315E;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i10 = this.f7325r.f7302k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f7321K;
        Paint paint2 = this.f7316F;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f7325r.j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f7325r.f7302k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z10 = this.f7329v;
        Path path = this.f7331x;
        if (z10) {
            o oVarH = this.f7325r.f7294a.h(new C0061d(5, -(j() ? paint2.getStrokeWidth() / 2.0f : 0.0f)));
            this.f7314D = oVarH;
            float f3 = this.f7325r.f7301i;
            RectF rectFG = g();
            RectF rectF = this.f7311A;
            rectF.set(rectFG);
            float strokeWidth = j() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f7319I.a(oVarH, f3, rectF, null, this.f7332y);
            b(g(), path);
            this.f7329v = false;
        }
        h hVar = this.f7325r;
        int i12 = hVar.f7305n;
        if (i12 != 1 && hVar.f7306o > 0) {
            if (i12 != 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (!hVar.f7294a.f(g()) && !path.isConvex() && i13 < 29) {
                    canvas.save();
                    h hVar2 = this.f7325r;
                    canvas.translate((int) (Math.sin(Math.toRadians(hVar2.f7308q)) * ((double) hVar2.f7307p)), h());
                    if (!this.f7324N) {
                        RectF rectF2 = this.f7323M;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f7325r.f7306o * 2) + ((int) rectF2.width()) + iWidth, (this.f7325r.f7306o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f7 = (getBounds().left - this.f7325r.f7306o) - iWidth;
                        float f10 = (getBounds().top - this.f7325r.f7306o) - iHeight;
                        canvas2.translate(-f7, -f10);
                        d(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f7, f10, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        d(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                h hVar3 = this.f7325r;
                canvas.translate((int) (Math.sin(Math.toRadians(hVar3.f7308q)) * ((double) hVar3.f7307p)), h());
                if (!this.f7324N) {
                    RectF rectF3 = this.f7323M;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                d(canvas);
                canvas.restore();
            }
        }
        h hVar4 = this.f7325r;
        Paint.Style style = hVar4.f7309r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, hVar4.f7294a, g());
        }
        if (j()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, o oVar, RectF rectF) {
        if (!oVar.f(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = oVar.f7353f.a(rectF) * this.f7325r.f7301i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        o oVar = this.f7314D;
        RectF rectFG = g();
        RectF rectF = this.f7311A;
        rectF.set(rectFG);
        boolean zJ = j();
        Paint paint = this.f7316F;
        float strokeWidth = zJ ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.f7332y, oVar, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f7333z;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7325r.f7302k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7325r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        h hVar = this.f7325r;
        if (hVar.f7305n == 2) {
            return;
        }
        if (hVar.f7294a.f(g())) {
            outline.setRoundRect(getBounds(), i() * this.f7325r.f7301i);
        } else {
            RectF rectFG = g();
            Path path = this.f7331x;
            b(rectFG, path);
            A1.b.h(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f7325r.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f7312B;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f7331x;
        b(rectFG, path);
        Region region2 = this.f7313C;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final int h() {
        h hVar = this.f7325r;
        return (int) (Math.cos(Math.toRadians(hVar.f7308q)) * ((double) hVar.f7307p));
    }

    public final float i() {
        return this.f7325r.f7294a.f7352e.a(g());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f7329v = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f7325r.f7298e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f7325r.getClass();
        ColorStateList colorStateList2 = this.f7325r.f7297d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f7325r.f7296c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final boolean j() {
        Paint.Style style = this.f7325r.f7309r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f7316F.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f7325r.f7295b = new D7.a(context);
        v();
    }

    public final void l(float f3) {
        h hVar = this.f7325r;
        if (hVar.f7304m != f3) {
            hVar.f7304m = f3;
            v();
        }
    }

    public final void m(ColorStateList colorStateList) {
        h hVar = this.f7325r;
        if (hVar.f7296c != colorStateList) {
            hVar.f7296c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f7325r = new h(this.f7325r);
        return this;
    }

    public final void n(float f3) {
        h hVar = this.f7325r;
        if (hVar.f7301i != f3) {
            hVar.f7301i = f3;
            this.f7329v = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.f7325r.f7309r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f7329v = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = t(iArr) || u();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p() {
        this.f7317G.a(-12303292);
        this.f7325r.getClass();
        super.invalidateSelf();
    }

    public final void q(int i10) {
        h hVar = this.f7325r;
        if (hVar.f7305n != i10) {
            hVar.f7305n = i10;
            super.invalidateSelf();
        }
    }

    public final void r(ColorStateList colorStateList) {
        h hVar = this.f7325r;
        if (hVar.f7297d != colorStateList) {
            hVar.f7297d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f3) {
        this.f7325r.j = f3;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h hVar = this.f7325r;
        if (hVar.f7302k != i10) {
            hVar.f7302k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7325r.getClass();
        super.invalidateSelf();
    }

    @Override // R7.z
    public final void setShapeAppearanceModel(o oVar) {
        this.f7325r.f7294a = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f7325r.f7298e = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f7325r;
        if (hVar.f7299f != mode) {
            hVar.f7299f = mode;
            u();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f7325r.f7296c == null || color2 == (colorForState2 = this.f7325r.f7296c.getColorForState(iArr, (color2 = (paint2 = this.f7315E).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f7325r.f7297d == null || color == (colorForState = this.f7325r.f7297d.getColorForState(iArr, (color = (paint = this.f7316F).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f7320J;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f7321K;
        h hVar = this.f7325r;
        ColorStateList colorStateList = hVar.f7298e;
        PorterDuff.Mode mode = hVar.f7299f;
        if (colorStateList == null || mode == null) {
            int color = this.f7315E.getColor();
            int iC = c(color);
            this.f7322L = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.f7322L = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.f7320J = porterDuffColorFilter;
        this.f7325r.getClass();
        this.f7321K = null;
        this.f7325r.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f7320J) && Objects.equals(porterDuffColorFilter3, this.f7321K)) ? false : true;
    }

    public final void v() {
        h hVar = this.f7325r;
        float f3 = hVar.f7304m + 0.0f;
        hVar.f7306o = (int) Math.ceil(0.75f * f3);
        this.f7325r.f7307p = (int) Math.ceil(f3 * 0.25f);
        u();
        super.invalidateSelf();
    }

    public i(o oVar) {
        this(new h(oVar));
    }

    public i(h hVar) {
        q qVar;
        this.f7326s = new x[4];
        this.f7327t = new x[4];
        this.f7328u = new BitSet(8);
        this.f7330w = new Matrix();
        this.f7331x = new Path();
        this.f7332y = new Path();
        this.f7333z = new RectF();
        this.f7311A = new RectF();
        this.f7312B = new Region();
        this.f7313C = new Region();
        Paint paint = new Paint(1);
        this.f7315E = paint;
        Paint paint2 = new Paint(1);
        this.f7316F = paint2;
        this.f7317G = new Q7.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = p.f7358a;
        } else {
            qVar = new q();
        }
        this.f7319I = qVar;
        this.f7323M = new RectF();
        this.f7324N = true;
        this.f7325r = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        t(getState());
        this.f7318H = new p248z6.c(24, this);
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(o.d(context, attributeSet, i10, i11).a());
    }
}
