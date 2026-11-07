package p102k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.p;
import com.ayah.R;
import p073h.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f18882l = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f18883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18888f;
    public final Path g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18890i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18891k;

    public f(Context context) {
        Paint paint = new Paint();
        this.f18883a = paint;
        this.g = new Path();
        this.f18891k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.f16392o, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.j = (float) (Math.cos(f18882l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f18888f != z10) {
            this.f18888f = z10;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f18887e) {
            this.f18887e = fRound;
            invalidateSelf();
        }
        this.f18889h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f18885c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f18884b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f18886d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f3, float f7, float f10) {
        return p.n(f7, f3, f10, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z10 = false;
        int i10 = this.f18891k;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z10 = true;
        }
        float f3 = this.f18884b;
        float fSqrt = (float) Math.sqrt(f3 * f3 * 2.0f);
        float f7 = this.f18890i;
        float f10 = this.f18885c;
        float fA = a(f10, fSqrt, f7);
        float fA2 = a(f10, this.f18886d, this.f18890i);
        float fRound = Math.round(a(0.0f, this.j, this.f18890i));
        float fA3 = a(0.0f, f18882l, this.f18890i);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f18890i);
        double d5 = fA;
        double d9 = fA3;
        float fRound2 = Math.round(Math.cos(d9) * d5);
        float fRound3 = Math.round(Math.sin(d9) * d5);
        Path path = this.g;
        path.rewind();
        float f11 = this.f18887e;
        Paint paint = this.f18883a;
        float fA5 = a(f11 + paint.getStrokeWidth(), -this.j, this.f18890i);
        float f12 = (-fA2) / 2.0f;
        path.moveTo(f12 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f12, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f12, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f13 = this.f18887e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f13 + ((((int) (fHeight - (f13 * 2.0f))) / 4) * 2));
        if (this.f18888f) {
            canvas.rotate(fA4 * (z10 ? -1 : 1));
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18889h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18889h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f18883a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18883a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
