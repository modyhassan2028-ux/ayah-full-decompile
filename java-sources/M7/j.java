package M7;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final i f5778H = new i(17);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final n f5779C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p003a2.f f5780D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p003a2.e f5781E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final m f5782F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5783G;

    public j(Context context, d dVar, n nVar) {
        super(context, dVar);
        this.f5783G = false;
        this.f5779C = nVar;
        this.f5782F = new m();
        p003a2.f fVar = new p003a2.f();
        this.f5780D = fVar;
        fVar.f11154b = 1.0f;
        fVar.f11155c = false;
        fVar.a(50.0f);
        p003a2.e eVar = new p003a2.e(this);
        this.f5781E = eVar;
        eVar.f11150m = fVar;
        if (this.f5795y != 1.0f) {
            this.f5795y = 1.0f;
            invalidateSelf();
        }
    }

    @Override // M7.l
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean zD = super.d(z10, z11, z12);
        a aVar = this.f5790t;
        ContentResolver contentResolver = this.f5788r.getContentResolver();
        aVar.getClass();
        float f3 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f3 == 0.0f) {
            this.f5783G = true;
            return zD;
        }
        this.f5783G = false;
        this.f5780D.a(50.0f / f3);
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f5791u;
            boolean z10 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f5792v;
            boolean z11 = objectAnimator2 != null && objectAnimator2.isRunning();
            n nVar = this.f5779C;
            nVar.f5801a.a();
            nVar.a(canvas, bounds, fB, z10, z11);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f5796z;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            d dVar = this.f5789s;
            int i10 = dVar.f5754c[0];
            m mVar = this.f5782F;
            mVar.f5799c = i10;
            int iH = dVar.g;
            if (iH > 0) {
                if (!(this.f5779C instanceof p)) {
                    iH = (int) ((B9.a.h(mVar.f5798b, 0.0f, 0.01f) * iH) / 0.01f);
                }
                this.f5779C.d(canvas, paint, mVar.f5798b, 1.0f, dVar.f5755d, this.f5787A, iH);
            } else {
                this.f5779C.d(canvas, paint, 0.0f, 1.0f, dVar.f5755d, this.f5787A, 0);
            }
            this.f5779C.c(canvas, paint, mVar, this.f5787A);
            this.f5779C.b(canvas, paint, dVar.f5754c[0], this.f5787A);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5779C.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5779C.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f5781E.b();
        this.f5782F.f5798b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.f5783G;
        m mVar = this.f5782F;
        p003a2.e eVar = this.f5781E;
        if (z10) {
            eVar.b();
            mVar.f5798b = i10 / 10000.0f;
            invalidateSelf();
        } else {
            eVar.f11141b = mVar.f5798b * 10000.0f;
            eVar.f11142c = true;
            float f3 = i10;
            if (eVar.f11145f) {
                eVar.f11151n = f3;
            } else {
                if (eVar.f11150m == null) {
                    eVar.f11150m = new p003a2.f(f3);
                }
                p003a2.f fVar = eVar.f11150m;
                double d5 = f3;
                fVar.f11160i = d5;
                double d9 = (float) d5;
                if (d9 > eVar.g) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d9 < eVar.f11146h) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(eVar.j * 0.75f);
                fVar.f11156d = dAbs;
                fVar.f11157e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z11 = eVar.f11145f;
                if (!z11 && !z11) {
                    eVar.f11145f = true;
                    if (!eVar.f11142c) {
                        eVar.f11141b = eVar.f11144e.A(eVar.f11143d);
                    }
                    float f7 = eVar.f11141b;
                    if (f7 > eVar.g || f7 < eVar.f11146h) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal threadLocal = p003a2.b.f11125f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new p003a2.b());
                    }
                    p003a2.b bVar = (p003a2.b) threadLocal.get();
                    ArrayList arrayList = bVar.f11127b;
                    if (arrayList.size() == 0) {
                        if (bVar.f11129d == null) {
                            bVar.f11129d = new android.support.v4.media.session.r(bVar.f11128c);
                        }
                        android.support.v4.media.session.r rVar = bVar.f11129d;
                        ((Choreographer) rVar.f11365t).postFrameCallback((p003a2.a) rVar.f11366u);
                    }
                    if (!arrayList.contains(eVar)) {
                        arrayList.add(eVar);
                    }
                }
            }
        }
        return true;
    }
}
