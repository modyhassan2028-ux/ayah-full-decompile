package M7;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final F7.f f5786B = new F7.f(Float.class, "growFraction", 6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5787A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f5788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f5789s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObjectAnimator f5791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObjectAnimator f5792v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f5793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f5795y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f5796z = new Paint();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f5790t = new a();

    public l(Context context, d dVar) {
        this.f5788r = context;
        this.f5789s = dVar;
        setAlpha(255);
    }

    public final float b() {
        d dVar = this.f5789s;
        if (dVar.f5756e == 0 && dVar.f5757f == 0) {
            return 1.0f;
        }
        return this.f5795y;
    }

    public final boolean c(boolean z10, boolean z11, boolean z12) {
        a aVar = this.f5790t;
        ContentResolver contentResolver = this.f5788r.getContentResolver();
        aVar.getClass();
        return d(z10, z11, z12 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z10, boolean z11, boolean z12) {
        ObjectAnimator objectAnimator = this.f5791u;
        int i10 = 0;
        F7.f fVar = f5786B;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, fVar, 0.0f, 1.0f);
            this.f5791u = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f5791u.setInterpolator(p137n7.a.f20016b);
            ObjectAnimator objectAnimator2 = this.f5791u;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f5791u = objectAnimator2;
            objectAnimator2.addListener(new k(this, i10));
        }
        int i11 = 1;
        if (this.f5792v == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, fVar, 1.0f, 0.0f);
            this.f5792v = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f5792v.setInterpolator(p137n7.a.f20016b);
            ObjectAnimator objectAnimator3 = this.f5792v;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f5792v = objectAnimator3;
            objectAnimator3.addListener(new k(this, i11));
        }
        if (isVisible() || z10) {
            ObjectAnimator objectAnimator4 = z10 ? this.f5791u : this.f5792v;
            ObjectAnimator objectAnimator5 = z10 ? this.f5792v : this.f5791u;
            if (!z12) {
                if (objectAnimator5.isRunning()) {
                    boolean z13 = this.f5794x;
                    this.f5794x = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f5794x = z13;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z14 = this.f5794x;
                    this.f5794x = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f5794x = z14;
                }
                return super.setVisible(z10, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z15 = !z10 || super.setVisible(z10, false);
                d dVar = this.f5789s;
                if (!z10 ? dVar.f5757f != 0 : dVar.f5756e != 0) {
                    boolean z16 = this.f5794x;
                    this.f5794x = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f5794x = z16;
                    return z15;
                }
                if (z11 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z15;
                }
                objectAnimator4.resume();
                return z15;
            }
        }
        return false;
    }

    public final void e(c cVar) {
        ArrayList arrayList = this.f5793w;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f5793w.remove(cVar);
        if (this.f5793w.isEmpty()) {
            this.f5793w = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5787A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f5791u;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f5792v;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f5787A = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5796z.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return c(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
