package t;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f22494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f22495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f22496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22497e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f22499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f22500i;
    public ColorStateList j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22498f = false;
    public boolean g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f22501k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f3) {
        this.f22493a = f3;
        Paint paint = new Paint(5);
        this.f22494b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f22499h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f22499h.getDefaultColor()));
        this.f22495c = new RectF();
        this.f22496d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f3 = rect.left;
        float f7 = rect.top;
        float f10 = rect.right;
        float f11 = rect.bottom;
        RectF rectF = this.f22495c;
        rectF.set(f3, f7, f10, f11);
        Rect rect2 = this.f22496d;
        rect2.set(rect);
        if (this.f22498f) {
            rect2.inset((int) Math.ceil(b.a(this.f22497e, this.f22493a, this.g)), (int) Math.ceil(b.b(this.f22497e, this.f22493a, this.g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f22500i;
        Paint paint = this.f22494b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f22500i);
            z10 = true;
        }
        RectF rectF = this.f22495c;
        float f3 = this.f22493a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f22496d, this.f22493a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f22499h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f22499h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f22494b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f22501k) == null) {
            return z10;
        }
        this.f22500i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f22494b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22494b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f22500i = a(colorStateList, this.f22501k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f22501k = mode;
        this.f22500i = a(this.j, mode);
        invalidateSelf();
    }
}
