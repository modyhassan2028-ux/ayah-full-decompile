package p151p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: p.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1257n0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f20748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20749s;

    public final void a(Canvas canvas) {
        this.f20748r.draw(canvas);
    }

    public final void b(float f3, float f7) {
        this.f20748r.setHotspot(f3, f7);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        this.f20748r.setHotspotBounds(i10, i11, i12, i13);
    }

    public final boolean d(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f20748r.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f20749s) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f20748r.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f20748r.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20748r.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20748r.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f20748r.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f20748r.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f20748r.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f20748r.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f20748r.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f20748r.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f20748r.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f20748r.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f20748r.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f20748r.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f20748r.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f20748r.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        this.f20748r.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f20748r.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20748r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f20748r.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f20748r.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f7) {
        if (this.f20749s) {
            b(f3, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f20749s) {
            c(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f20749s) {
            return this.f20748r.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f20748r.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f20748r.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f20748r.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f20749s) {
            return d(z10, z11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
