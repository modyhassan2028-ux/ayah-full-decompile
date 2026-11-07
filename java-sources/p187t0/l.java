package p187t0;

import B9.a;
import p180s0.F;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f22549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f22550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f22551f;
    public static final float[] g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f22503b.f22504a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f22549d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f22550e = fArr;
        f22551f = j.f(fArrG);
        g = j.f(fArr);
    }

    @Override // p187t0.c
    public final float a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p187t0.c
    public final float b(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p187t0.c
    public final long d(float f3, float f7, float f10) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f11 = f10 <= 0.5f ? f10 : 0.5f;
        float[] fArr = g;
        float f12 = (fArr[6] * f11) + (fArr[3] * f7) + (fArr[0] * f3);
        float f13 = (fArr[7] * f11) + (fArr[4] * f7) + (fArr[1] * f3);
        float f14 = (fArr[8] * f11) + (fArr[5] * f7) + (fArr[2] * f3);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float[] fArr2 = f22551f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f17) + (fArr2[4] * f16) + (fArr2[1] * f15))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f17) + ((fArr2[3] * f16) + (fArr2[0] * f15)))) << 32);
    }

    @Override // p187t0.c
    public final float e(float f3, float f7, float f10) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f11 = f10 <= 0.5f ? f10 : 0.5f;
        float[] fArr = g;
        float f12 = (fArr[6] * f11) + (fArr[3] * f7) + (fArr[0] * f3);
        float f13 = (fArr[7] * f11) + (fArr[4] * f7) + (fArr[1] * f3);
        float f14 = (fArr[8] * f11) + (fArr[5] * f7) + (fArr[2] * f3);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float[] fArr2 = f22551f;
        return (fArr2[8] * f17) + (fArr2[5] * f16) + (fArr2[2] * f15);
    }

    @Override // p187t0.c
    public final long f(float f3, float f7, float f10, float f11, c cVar) {
        float[] fArr = f22549d;
        float f12 = (fArr[6] * f10) + (fArr[3] * f7) + (fArr[0] * f3);
        float f13 = (fArr[7] * f10) + (fArr[4] * f7) + (fArr[1] * f3);
        float f14 = (fArr[8] * f10) + (fArr[5] * f7) + (fArr[2] * f3);
        float fS = a.s(f12);
        float fS2 = a.s(f13);
        float fS3 = a.s(f14);
        float[] fArr2 = f22550e;
        return F.b((fArr2[6] * fS3) + (fArr2[3] * fS2) + (fArr2[0] * fS), (fArr2[7] * fS3) + (fArr2[4] * fS2) + (fArr2[1] * fS), (fArr2[8] * fS3) + (fArr2[5] * fS2) + (fArr2[2] * fS), f11, cVar);
    }
}
