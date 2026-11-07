package N1;

import E2.RunnableC0147v;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import p151p.C1261p0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f5974I = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f5975A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float[] f5976B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5977C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5978D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5979E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5980F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5981G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1261p0 f5982H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f5983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccelerateInterpolator f5984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1261p0 f5985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RunnableC0147v f5986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f5987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f5988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5990y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float[] f5991z;

    public e(C1261p0 c1261p0) {
        a aVar = new a();
        aVar.f5968e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f5969f = 0L;
        this.f5983r = aVar;
        this.f5984s = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5987v = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5988w = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5991z = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5975A = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5976B = fArr5;
        this.f5985t = c1261p0;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f10 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f5989x = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5990y = f5974I;
        aVar.f5964a = 500;
        aVar.f5965b = 500;
        this.f5982H = c1261p0;
    }

    public static float b(float f3, float f7, float f10) {
        if (f3 > f10) {
            return f10;
        }
        return f3 < f7 ? f7 : f3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f3, float f7, float f10, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.f5987v[i10] * f7, 0.0f, this.f5988w[i10]);
        float fC = c(f7 - f3, fB2) - c(f3, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f5984s;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f11 = this.f5991z[i10];
            float f12 = this.f5975A[i10];
            float f13 = this.f5976B[i10];
            float f14 = f11 * f10;
            return fB > 0.0f ? b(fB * f14, f12, f13) : -b((-fB) * f14, f12, f13);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f15 = this.f5991z[i10];
        float f16 = this.f5975A[i10];
        float f17 = this.f5976B[i10];
        float f18 = f15 * f10;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f3, float f7) {
        if (f7 != 0.0f) {
            int i10 = this.f5989x;
            if (i10 == 0 || i10 == 1) {
                if (f3 < f7) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f7);
                    }
                    if (this.f5980F && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f3 < 0.0f) {
                return f3 / (-f7);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f5978D) {
            this.f5980F = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f5983r;
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f5968e);
        int i12 = aVar.f5965b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f5971i = i10;
        aVar.f5970h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C1261p0 c1261p0;
        int count;
        a aVar = this.f5983r;
        float f3 = aVar.f5967d;
        int iAbs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f5966c);
        if (iAbs != 0 && (count = (c1261p0 = this.f5982H).getCount()) != 0) {
            int childCount = c1261p0.getChildCount();
            int firstVisiblePosition = c1261p0.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1261p0.getChildAt(0).getTop() >= 0)) : !(i10 >= count && c1261p0.getChildAt(childCount - 1).getBottom() <= c1261p0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5981G
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.f5979E = r2
            r7.f5977C = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.p0 r4 = r7.f5985t
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            N1.a r9 = r7.f5983r
            r9.f5966c = r0
            r9.f5967d = r8
            boolean r8 = r7.f5980F
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            E2.v r8 = r7.f5986u
            if (r8 != 0) goto L61
            E2.v r8 = new E2.v
            r9 = 4
            r8.<init>(r9, r7)
            r7.f5986u = r8
        L61:
            r7.f5980F = r2
            r7.f5978D = r2
            boolean r8 = r7.f5977C
            if (r8 != 0) goto L76
            int r8 = r7.f5990y
            if (r8 <= 0) goto L76
            E2.v r9 = r7.f5986u
            long r5 = (long) r8
            java.util.WeakHashMap r8 = I1.S.f3689a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            E2.v r8 = r7.f5986u
            r8.run()
        L7b:
            r7.f5977C = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
