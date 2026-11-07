package p180s0;

import A6.a;
import N9.b0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import i7.B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p063g1.k;
import p171r0.e;
import p171r0.g;
import p187t0.b;
import p187t0.c;
import p187t0.d;
import p187t0.m;
import p187t0.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f21774a = new B(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f21775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f21776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f21777d;

    public static final C1294c a(C1297f c1297f) {
        Canvas canvas = AbstractC1295d.f21821a;
        C1294c c1294c = new C1294c();
        c1294c.f21818a = new Canvas(AbstractC1298g.a(c1297f));
        return c1294c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    public static final long b(float f3, float f7, float f10, float f11, c cVar) {
        int i10;
        int i11;
        int i12;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f12;
        if (cVar.c()) {
            float f13 = f11 < 0.0f ? 0.0f : f11;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i29 = ((int) ((f13 * 255.0f) + 0.5f)) << 24;
            float f14 = f3 < 0.0f ? 0.0f : f3;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i30 = i29 | (((int) ((f14 * 255.0f) + 0.5f)) << 16);
            float f15 = f7 < 0.0f ? 0.0f : f7;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i31 = i30 | (((int) ((f15 * 255.0f) + 0.5f)) << 8);
            f12 = f10 >= 0.0f ? f10 : 0.0f;
            long j = ((long) (i31 | ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i32 = q.f21844h;
            return j;
        }
        long j10 = cVar.f22511b;
        int i33 = b.f22509e;
        if (((int) (j10 >> 32)) != 3) {
            y.a("Color only works with ColorSpaces with 3 components");
        }
        int i34 = cVar.f22512c;
        if (i34 == -1) {
            y.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i35 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f3 >= fB3) {
            fB3 = f3;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i36 = iFloatToRawIntBits3 >>> 31;
        int i37 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i38 = iFloatToRawIntBits3 & 8388607;
        if (i37 == 255) {
            i11 = i38 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i37 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i39 = i38 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i39) + 1) | (i36 << 15);
                    } else {
                        i11 = i39;
                    }
                    short s10 = (short) i12;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f7 >= fB) {
                        fB = f7;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f10 >= fB2) {
                                    fB2 = f10;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i26 = i23 != 0 ? 512 : 0;
                                    i35 = 31;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i26 = 0;
                                        i35 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i26 = i25;
                                                i35 = i24;
                                            }
                                            short s12 = (short) i27;
                                            f12 = f11 >= 0.0f ? f11 : 0.0f;
                                            long j11 = (((long) i34) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i40 = q.f21844h;
                                            return j11;
                                        }
                                        if (i24 >= -10) {
                                            i28 = (i23 | 8388608) >> (1 - i24);
                                            if ((i28 & 4096) != 0) {
                                                i28 += 8192;
                                            }
                                            i26 = i28 >> 13;
                                        } else {
                                            i26 = 0;
                                        }
                                    }
                                }
                                i27 = i26 | (i21 << 15) | (i35 << 10);
                                short s13 = (short) i27;
                                if (f11 >= 0.0f) {
                                }
                                long j12 = (((long) i34) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i41 = q.f21844h;
                                return j12;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s14 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f10 >= fB2) {
                        fB2 = f10;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i35 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i35 = i24;
                                }
                                short s15 = (short) i27;
                                if (f11 >= 0.0f) {
                                }
                                long j13 = (((long) i34) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i42 = q.f21844h;
                                return j13;
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i35 << 10);
                    short s16 = (short) i27;
                    if (f11 >= 0.0f) {
                    }
                    long j14 = (((long) i34) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i43 = q.f21844h;
                    return j14;
                }
                if (i10 >= -10) {
                    int i44 = (i38 | 8388608) >> (1 - i10);
                    if ((i44 & 4096) != 0) {
                        i44 += 8192;
                    }
                    i11 = i44 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i36 << 15) | (i10 << 10);
        short s17 = (short) i12;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f7 >= fB) {
            fB = f7;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s18 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f10 >= fB2) {
                        fB2 = f10;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i35 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i35 = i24;
                                }
                                short s19 = (short) i27;
                                if (f11 >= 0.0f) {
                                }
                                long j15 = (((long) i34) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i45 = q.f21844h;
                                return j15;
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i35 << 10);
                    short s110 = (short) i27;
                    if (f11 >= 0.0f) {
                    }
                    long j16 = (((long) i34) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i46 = q.f21844h;
                    return j16;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s111 = (short) i19;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f10 >= fB2) {
            fB2 = f10;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i26 = i23 != 0 ? 512 : 0;
            i35 = 31;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i26 = 0;
                i35 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i26 = i25;
                        i35 = i24;
                    }
                    short s112 = (short) i27;
                    if (f11 >= 0.0f) {
                    }
                    long j17 = (((long) i34) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i47 = q.f21844h;
                    return j17;
                }
                if (i24 >= -10) {
                    i28 = (i23 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                } else {
                    i26 = 0;
                }
            }
        }
        i27 = i26 | (i21 << 15) | (i35 << 10);
        short s113 = (short) i27;
        if (f11 >= 0.0f) {
        }
        long j18 = (((long) i34) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16) | ((((long) ((int) (((f12 <= 1.0f ? f12 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i48 = q.f21844h;
        return j18;
    }

    public static final long c(int i10) {
        long j = ((long) i10) << 32;
        int i11 = q.f21844h;
        return j;
    }

    public static final long d(long j) {
        long j10 = j << 32;
        int i10 = q.f21844h;
        return j10;
    }

    public static long e(int i10, int i11, int i12) {
        return c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static C1297f f(int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        q qVar = d.f22517e;
        Bitmap.Config configC = AbstractC1298g.c(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC1298g.b(i10, i11, i12, qVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configC);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C1297f(bitmapCreateBitmap);
    }

    public static final b0 g() {
        return new b0(new Paint(7));
    }

    public static final long h(float f3, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i10 = M.f21815c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long i(float f3, float f7, float f10, float f11, c cVar) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (cVar.c()) {
            long j = ((long) ((((((int) ((f11 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16)) | (((int) ((f7 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f10) + 0.5f)))) << 32;
            int i27 = q.f21844h;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
        int i28 = iFloatToRawIntBits3 >>> 31;
        int i29 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i30 = iFloatToRawIntBits3 & 8388607;
        int i31 = 49;
        int i32 = 0;
        if (i29 == 255) {
            i11 = i30 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i29 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i33 = i30 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i33) + 1) | (i28 << 15);
                    } else {
                        i11 = i33;
                    }
                    short s10 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f7);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i24 = i22 - 112;
                                    if (i24 < 31) {
                                        if (i24 <= 0) {
                                            i32 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                            } else {
                                                i31 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i31 = 0;
                                            i32 = i26 >> 13;
                                        } else {
                                            i31 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                                    int i34 = q.f21844h;
                                    return jMax;
                                }
                                i32 = i23 == 0 ? 0 : 512;
                                i31 = 31;
                                i25 = (i21 << 15) | (i31 << 10) | i32;
                                long jMax2 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                                int i35 = q.f21844h;
                                return jMax2;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i31 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i31 = 0;
                                i32 = i26 >> 13;
                            } else {
                                i31 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                        int i36 = q.f21844h;
                        return jMax3;
                    }
                    i32 = i23 == 0 ? 0 : 512;
                    i31 = 31;
                    i25 = (i21 << 15) | (i31 << 10) | i32;
                    long jMax4 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                    int i37 = q.f21844h;
                    return jMax4;
                }
                if (i10 >= -10) {
                    int i38 = (i30 | 8388608) >> (1 - i10);
                    if ((i38 & 4096) != 0) {
                        i38 += 8192;
                    }
                    i11 = i38 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i28 << 15) | (i10 << 10);
        short s13 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f7);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s14 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i31 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i31 = 0;
                                i32 = i26 >> 13;
                            } else {
                                i31 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                        int i39 = q.f21844h;
                        return jMax5;
                    }
                    i32 = i23 == 0 ? 0 : 512;
                    i31 = 31;
                    i25 = (i21 << 15) | (i31 << 10) | i32;
                    long jMax6 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
                    int i310 = q.f21844h;
                    return jMax6;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s15 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i24 = i22 - 112;
            if (i24 < 31) {
                if (i24 <= 0) {
                    i32 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                    } else {
                        i31 = i24;
                    }
                } else if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i31 = 0;
                    i32 = i26 >> 13;
                } else {
                    i31 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
            int i311 = q.f21844h;
            return jMax7;
        }
        i32 = i23 == 0 ? 0 : 512;
        i31 = 31;
        i25 = (i21 << 15) | (i31 << 10) | i32;
        long jMax8 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f22512c) & 63);
        int i312 = q.f21844h;
        return jMax8;
    }

    public static final long k(long j, long j10) {
        float f3;
        float f7;
        long jA = q.a(j, q.f(j10));
        float fD = q.d(j10);
        float fD2 = q.d(jA);
        float f10 = 1.0f - fD2;
        float f11 = (fD * f10) + fD2;
        float fH = q.h(jA);
        float fH2 = q.h(j10);
        float f12 = 0.0f;
        if (f11 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fH2 * fD) * f10) + (fH * fD2)) / f11;
        }
        float fG = q.g(jA);
        float fG2 = q.g(j10);
        if (f11 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((fG2 * fD) * f10) + (fG * fD2)) / f11;
        }
        float fE = q.e(jA);
        float fE2 = q.e(j10);
        if (f11 != 0.0f) {
            f12 = (((fE2 * fD) * f10) + (fE * fD2)) / f11;
        }
        return i(f3, f7, f12, f11, q.f(j10));
    }

    public static void l(p196u0.d dVar, F f3, long j) {
        if (f3 instanceof C) {
            e eVar = ((C) f3).f21771e;
            dVar.f0(3, j, (((long) Float.floatToRawIntBits(eVar.f21389a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(eVar.f21390b))), (((long) Float.floatToRawIntBits(eVar.f21391c - eVar.f21389a)) << 32) | (((long) Float.floatToRawIntBits(eVar.f21392d - eVar.f21390b)) & 4294967295L));
            return;
        }
        if (!(f3 instanceof D)) {
            if (!(f3 instanceof B)) {
                throw new a();
            }
            dVar.k(((B) f3).f21770e, j);
            return;
        }
        D d5 = (D) f3;
        C1300i c1300i = d5.f21773f;
        if (c1300i != null) {
            dVar.k(c1300i, j);
            return;
        }
        g gVar = d5.f21772e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f21399h >> 32));
        float f7 = gVar.f21393a;
        dVar.u(j, (((long) Float.floatToRawIntBits(gVar.f21394b)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(gVar.b())) << 32) | (((long) Float.floatToRawIntBits(gVar.a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static void m(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            AbstractC1293b.a(canvas, z10);
            return;
        }
        if (!f21777d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f21775b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f21776c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f21775b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f21776c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f21775b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f21776c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f21777d = true;
        }
        if (z10) {
            try {
                Method method4 = f21775b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f21776c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean n(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final float o(long j) {
        c cVarF = q.f(j);
        if (!b.a(cVarF.f22511b, b.f22505a)) {
            y.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b.b(cVarF.f22511b)));
        }
        m mVar = ((q) cVarF).f22571p;
        double dB = mVar.b(q.h(j));
        float fB = (float) ((mVar.b(q.e(j)) * 0.0722d) + (mVar.b(q.g(j)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final void p(Matrix matrix, float[] fArr) {
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f12;
        fArr[2] = f17;
        fArr[3] = f7;
        fArr[4] = f13;
        fArr[5] = f18;
        fArr[6] = f11;
        fArr[7] = f15;
        fArr[8] = f19;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f7;
        fArr[2] = f10;
        fArr[3] = f11;
        fArr[4] = f12;
        fArr[5] = f13;
        fArr[6] = f14;
        fArr[7] = f15;
        fArr[8] = f16;
    }

    public static final void q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f11;
        fArr[2] = 0.0f;
        fArr[3] = f14;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = 0.0f;
        fArr[7] = f15;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f10;
        fArr[13] = f13;
        fArr[14] = 0.0f;
        fArr[15] = f16;
    }

    public static final Rect r(k kVar) {
        return new Rect(kVar.f16256a, kVar.f16257b, kVar.f16258c, kVar.f16259d);
    }

    public static final Rect s(e eVar) {
        return new Rect((int) eVar.f21389a, (int) eVar.f21390b, (int) eVar.f21391c, (int) eVar.f21392d);
    }

    public static final RectF t(e eVar) {
        return new RectF(eVar.f21389a, eVar.f21390b, eVar.f21391c, eVar.f21392d);
    }

    public static final int u(long j) {
        float[] fArr = d.f22513a;
        return (int) (q.a(j, d.f22517e) >>> 32);
    }

    public static final e v(RectF rectF) {
        return new e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final int w(float f3, float[] fArr, int i10) {
        float f7 = f3 >= 0.0f ? f3 : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f3) > 1.05E-6f) {
            f7 = Float.NaN;
        }
        fArr[i10] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }

    public abstract void j(float f3, long j, b0 b0Var);
}
