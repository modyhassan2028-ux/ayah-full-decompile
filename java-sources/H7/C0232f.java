package H7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: H7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f3536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f3537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3538d;

    public C0232f(Drawable drawable, Drawable drawable2) {
        this.f3535a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f3536b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f3537c = new float[2];
    }

    public final void a(float f3) {
        if (this.f3538d != f3) {
            this.f3538d = f3;
            float[] fArr = this.f3537c;
            H.a(f3, fArr);
            this.f3535a.setAlpha((int) (fArr[0] * 255.0f));
            this.f3536b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f3535a.draw(canvas);
        this.f3536b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f3535a.getIntrinsicHeight(), this.f3536b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f3535a.getIntrinsicWidth(), this.f3536b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f3535a.getMinimumHeight(), this.f3536b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f3535a.getMinimumWidth(), this.f3536b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f3535a.isStateful() || this.f3536b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        float f3 = this.f3538d;
        Drawable drawable = this.f3536b;
        Drawable drawable2 = this.f3535a;
        if (f3 <= 0.5f) {
            drawable2.setAlpha(i10);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f3535a.setBounds(i10, i11, i12, i13);
        this.f3536b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3535a.setColorFilter(colorFilter);
        this.f3536b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f3535a.setState(iArr) || this.f3536b.setState(iArr);
    }
}
