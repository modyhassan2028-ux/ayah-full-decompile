package p223x;

import B9.a;
import p123m2.c;
import p180s0.F;

/* JADX INFO: renamed from: x.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1429s implements InterfaceC1433w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f24092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f24093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f24094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f24095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f24096v;

    public C1429s(float f3, float f7, float f10) {
        int iW;
        this.f24092r = f3;
        this.f24093s = f7;
        this.f24094t = f10;
        if (Float.isNaN(f3) || Float.isNaN(0.0f) || Float.isNaN(f7) || Float.isNaN(f10)) {
            M.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", 0.0, " + f7 + ", " + f10 + '.');
        }
        float[] fArr = new float[5];
        float f11 = (f10 - 0.0f) * 3.0f;
        float f12 = (1.0f - f10) * 3.0f;
        double d5 = 0.0f;
        double d9 = f11;
        double d10 = f12;
        double d11 = d9 * 2.0d;
        double d12 = (d5 - d11) + d10;
        if (d12 == 0.0d) {
            iW = d9 == d10 ? 0 : F.w((float) ((d11 - d10) / (d11 - (d10 * 2.0d))), fArr, 0);
        } else {
            double d13 = -Math.sqrt((d9 * d9) - (d10 * d5));
            double d14 = (-d5) + d9;
            int iW2 = F.w((float) ((-(d13 + d14)) / d12), fArr, 0);
            iW = F.w((float) ((d13 - d14) / d12), fArr, iW2) + iW2;
            if (iW > 1) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                if (f13 > f14) {
                    fArr[0] = f14;
                    fArr[1] = f13;
                } else if (f13 == f14) {
                    iW--;
                }
            }
        }
        float f15 = (f11 - 0.0f) * 2.0f;
        int iW3 = F.w((-f15) / (((f12 - f11) * 2.0f) - f15), fArr, iW) + iW;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iW3; i10++) {
            float f16 = fArr[i10];
            float f17 = (((((((((0.0f - f10) * 3.0f) + 1.0f) - 0.0f) * f16) + (((f10 - 0.0f) + 0.0f) * 3.0f)) * f16) + 0.0f) * f16) + 0.0f;
            fMin = Math.min(fMin, f17);
            fMax = Math.max(fMax, f17);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f24095u = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f24096v = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e A[PHI: r3
      0x008e: PHI (r3v26 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v30 float), (r3v36 float) binds: [B:123:0x022b, B:113:0x01fd, B:89:0x01b5, B:45:0x00df, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[PHI: r12
      0x015e: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x015c, B:79:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p223x.InterfaceC1433w
    public final float a(float f3) {
        float f7;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return f3;
        }
        float fMax = Math.max(f3, 1.1920929E-7f);
        float f10 = 0.0f - fMax;
        float f11 = this.f24092r;
        float f12 = f11 - fMax;
        float f13 = this.f24093s;
        float f14 = f13 - fMax;
        double d5 = f10;
        double d9 = ((d5 - (((double) f12) * 2.0d)) + ((double) f14)) * 3.0d;
        double d10 = ((double) (f12 - f10)) * 3.0d;
        double d11 = (((double) (f12 - f14)) * 3.0d) + ((double) (-f10)) + ((double) (1.0f - fMax));
        float f15 = Float.NaN;
        if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double d12 = d9 / d11;
            double d13 = d10 / d11;
            double d14 = d5 / d11;
            double d15 = ((d13 * 3.0d) - (d12 * d12)) / 9.0d;
            double d16 = ((d14 * 27.0d) + ((((2.0d * d12) * d12) * d12) - ((9.0d * d12) * d13))) / 54.0d;
            double d17 = d15 * d15 * d15;
            double d18 = (d16 * d16) + d17;
            double d19 = d12 / 3.0d;
            if (d18 < 0.0d) {
                double dSqrt = Math.sqrt(-d17);
                double d20 = (-d16) / dSqrt;
                if (d20 < -1.0d) {
                    d20 = -1.0d;
                }
                if (d20 > 1.0d) {
                    d20 = 1.0d;
                }
                double dAcos = Math.acos(d20);
                double dS = a.s((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dS) - d19);
                float f16 = fCos < 0.0f ? 0.0f : fCos;
                if (f16 > 1.0f) {
                    f16 = 1.0f;
                }
                if (Math.abs(f16 - fCos) > 1.05E-6f) {
                    f16 = Float.NaN;
                }
                if (Float.isNaN(f16)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dS) - d19);
                    f16 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f16 > 1.0f) {
                        f16 = 1.0f;
                    }
                    if (Math.abs(f16 - fCos2) > 1.05E-6f) {
                        f16 = Float.NaN;
                    }
                    if (Float.isNaN(f16)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dS) - d19);
                        f7 = fCos3 < 0.0f ? 0.0f : fCos3;
                        if (f7 > 1.0f) {
                            f7 = 1.0f;
                        }
                        if (Math.abs(f7 - fCos3) <= 1.05E-6f) {
                            f15 = f7;
                        }
                    } else {
                        f15 = f16;
                    }
                } else {
                    f15 = f16;
                }
            } else if (d18 == 0.0d) {
                float f17 = -a.s((float) d16);
                float f18 = (float) d19;
                float f19 = (2.0f * f17) - f18;
                float f20 = f19 < 0.0f ? 0.0f : f19;
                if (f20 > 1.0f) {
                    f20 = 1.0f;
                }
                if (Math.abs(f20 - f19) > 1.05E-6f) {
                    f20 = Float.NaN;
                }
                if (Float.isNaN(f20)) {
                    float f21 = (-f17) - f18;
                    f7 = f21 < 0.0f ? 0.0f : f21;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - f21) <= 1.05E-6f) {
                        f15 = f7;
                    }
                } else {
                    f15 = f20;
                }
            } else {
                double dSqrt2 = Math.sqrt(d18);
                float fS = (float) (((double) (a.s((float) ((-d16) + dSqrt2)) - a.s((float) (d16 + dSqrt2)))) - d19);
                f7 = fS < 0.0f ? 0.0f : fS;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - fS) <= 1.05E-6f) {
                    f15 = f7;
                }
            }
        } else if (Math.abs(d9 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d10 * d10) - ((4.0d * d9) * d5));
            double d21 = d9 * 2.0d;
            float f22 = (float) ((dSqrt3 - d10) / d21);
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > 1.05E-6f) {
                f23 = Float.NaN;
            }
            if (Float.isNaN(f23)) {
                float f24 = (float) (((-d10) - dSqrt3) / d21);
                f7 = f24 < 0.0f ? 0.0f : f24;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - f24) <= 1.05E-6f) {
                    f15 = f7;
                }
            } else {
                f15 = f23;
            }
        } else if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
            float f25 = (float) ((-d5) / d10);
            f7 = f25 < 0.0f ? 0.0f : f25;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (Math.abs(f7 - f25) <= 1.05E-6f) {
                f15 = f7;
            }
        }
        boolean zIsNaN = Float.isNaN(f15);
        float f26 = this.f24094t;
        if (!zIsNaN) {
            float f27 = ((((((0.0f - f26) + 0.33333334f) * f15) + (f26 - 0.0f)) * f15) + 0.0f) * 3.0f * f15;
            float f28 = this.f24095u;
            if (f27 < f28) {
                f27 = f28;
            }
            float f29 = this.f24096v;
            return f27 > f29 ? f29 : f27;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f11 + ", 0.0, " + f13 + ", " + f26 + ") has no solution at " + f3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1429s)) {
            return false;
        }
        C1429s c1429s = (C1429s) obj;
        return this.f24092r == c1429s.f24092r && this.f24093s == c1429s.f24093s && this.f24094t == c1429s.f24094t;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24094t) + c.n(c.n(Float.floatToIntBits(this.f24092r) * 31, 0.0f, 31), this.f24093s, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f24092r);
        sb.append(", b=0.0, c=");
        sb.append(this.f24093s);
        sb.append(", d=");
        return c.v(sb, this.f24094t, ')');
    }
}
