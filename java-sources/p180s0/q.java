package p180s0;

import p110k9.a;
import p187t0.c;
import p187t0.d;
import p187t0.g;
import p187t0.h;
import p187t0.j;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f21839b = F.d(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f21840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f21841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f21842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f21843f;
    public static final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f21844h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21845a;

    static {
        F.d(4282664004L);
        F.d(4287137928L);
        F.d(4291611852L);
        f21840c = F.d(4294967295L);
        f21841d = F.d(4294901760L);
        F.d(4278255360L);
        f21842e = F.d(4278190335L);
        F.d(4294967040L);
        F.d(4278255615L);
        F.d(4294902015L);
        f21843f = F.c(0);
        g = F.b(0.0f, 0.0f, 0.0f, 0.0f, d.f22531u);
    }

    public /* synthetic */ q(long j) {
        this.f21845a = j;
    }

    public static final long a(long j, c cVar) {
        g gVarE;
        c cVarF = f(j);
        int i10 = cVarF.f22512c;
        int i11 = cVar.f22512c;
        if ((i10 | i11) < 0) {
            gVarE = j.e(cVarF, cVar);
        } else {
            t tVar = h.f22542a;
            int i12 = i10 | (i11 << 6);
            Object objB = tVar.b(i12);
            if (objB == null) {
                objB = j.e(cVarF, cVar);
                tVar.h(i12, objB);
            }
            gVarE = (g) objB;
        }
        return gVarE.a(j);
    }

    public static long b(long j, float f3) {
        return F.b(h(j), g(j), e(j), f3, f(j));
    }

    public static final boolean c(long j, long j10) {
        return j == j10;
    }

    public static final float d(long j) {
        float f3;
        float f7;
        if ((63 & j) == 0) {
            f3 = (float) a.f((j >>> 56) & 255);
            f7 = 255.0f;
        } else {
            f3 = (float) a.f((j >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return f3 / f7;
    }

    public static final float e(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) a.f((j >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - u.f21848a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final c f(long j) {
        float[] fArr = d.f22513a;
        return d.f22535y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) a.f((j >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - u.f21848a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) a.f((j >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - u.f21848a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return p245z2.a.F(sb, f(j).f22510a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f21845a == ((q) obj).f21845a;
        }
        return false;
    }

    public final int hashCode() {
        return p110k9.t.a(this.f21845a);
    }

    public final String toString() {
        return i(this.f21845a);
    }
}
