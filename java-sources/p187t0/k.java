package p187t0;

import p180s0.F;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11, long j, String str) {
        super(j, i10, str);
        this.f22548d = i11;
    }

    @Override // p187t0.c
    public final float a(int i10) {
        switch (this.f22548d) {
            case 0:
                return i10 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p187t0.c
    public final float b(int i10) {
        switch (this.f22548d) {
            case 0:
                return i10 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p187t0.c
    public final long d(float f3, float f7, float f10) {
        switch (this.f22548d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                if (f7 > 128.0f) {
                    f7 = 128.0f;
                }
                float f11 = (f3 + 16.0f) / 116.0f;
                float f12 = (f7 * 0.002f) + f11;
                float f13 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float f14 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f22547e;
                return (((long) Float.floatToRawIntBits(f14 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f13 * fArr[0])) << 32);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f7 <= 2.0f ? f7 : 2.0f)) & 4294967295L);
        }
    }

    @Override // p187t0.c
    public final float e(float f3, float f7, float f10) {
        switch (this.f22548d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f11 = ((f3 + 16.0f) / 116.0f) - (f10 * 0.005f);
                return (f11 > 0.20689656f ? f11 * f11 * f11 : 0.12841855f * (f11 - 0.13793103f)) * j.f22547e[2];
            default:
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    return 2.0f;
                }
                return f10;
        }
    }

    @Override // p187t0.c
    public final long f(float f3, float f7, float f10, float f11, c cVar) {
        switch (this.f22548d) {
            case 0:
                float[] fArr = j.f22547e;
                float f12 = f3 / fArr[0];
                float f13 = f7 / fArr[1];
                float f14 = f10 / fArr[2];
                float fCbrt = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float f15 = (116.0f * fCbrt2) - 16.0f;
                float f16 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                if (f15 > 100.0f) {
                    f15 = 100.0f;
                }
                if (f16 < -128.0f) {
                    f16 = -128.0f;
                }
                if (f16 > 128.0f) {
                    f16 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return F.b(f15, f16, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f11, cVar);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return F.b(f3, f7, f10 <= 2.0f ? f10 : 2.0f, f11, cVar);
        }
    }
}
