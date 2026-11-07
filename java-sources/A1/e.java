package A1;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f468b;

    public e(char c10, float[] fArr) {
        this.f467a = c10;
        this.f468b = fArr;
    }

    public static void a(Path path, float f3, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11) {
        double d5;
        double d9;
        double radians = Math.toRadians(f14);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = f3;
        double d11 = f7;
        double d12 = f12;
        double d13 = ((d11 * dSin) + (d10 * dCos)) / d12;
        double d14 = f13;
        double d15 = ((d11 * dCos) + (((double) (-f3)) * dSin)) / d14;
        double d16 = f11;
        double d17 = ((d16 * dSin) + (((double) f10) * dCos)) / d12;
        double d18 = ((d16 * dCos) + (((double) (-f10)) * dSin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f3, f7, f10, f11, f12 * fSqrt, fSqrt * f13, f14, z10, z11);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = dSqrt * d19;
        double d26 = dSqrt * d20;
        if (z10 == z11) {
            d5 = d21 - d26;
            d9 = d22 + d25;
        } else {
            d5 = d21 + d26;
            d9 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d15 - d9, d13 - d5);
        double dAtan3 = Math.atan2(d18 - d9, d17 - d5) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d27 = d5 * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d12;
        double d32 = d31 * dCos2;
        double d33 = d14 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d14 * dCos2;
        double d37 = dAtan3 / ((double) iCeil);
        double d38 = (dCos3 * d36) + (dSin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i10 = 0;
        double d41 = dAtan2;
        while (i10 < iCeil) {
            double d42 = d41 + d37;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i11 = iCeil;
            double d43 = (((d12 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d44 = (d36 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d45 = (d32 * dSin4) - (d33 * dCos4);
            double d46 = (dCos4 * d36) + (dSin4 * d35);
            double d47 = d42 - d41;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d39), (float) ((d38 * dSqrt2) + d40), (float) (d43 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d43, (float) d44);
            i10++;
            d40 = d44;
            dCos2 = dCos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            iCeil = i11;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i10;
        float f3;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        e[] eVarArr2 = eVarArr;
        float[] fArr = new float[6];
        int length = eVarArr2.length;
        int i11 = 0;
        int i12 = 0;
        char c10 = 'm';
        while (i12 < length) {
            e eVar = eVarArr2[i12];
            char c11 = eVar.f467a;
            float[] fArr2 = eVar.f468b;
            float f18 = fArr[i11];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            int i13 = i11;
            float f23 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                default:
                    i10 = 2;
                    break;
            }
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i14 = i13;
            while (i14 < fArr2.length) {
                if (c11 == 'A') {
                    fArr2 = fArr2;
                    i14 = i14;
                    eVar = eVar;
                    float f28 = f27;
                    i12 = i12;
                    int i15 = i14 + 5;
                    int i16 = i14 + 6;
                    a(path, f26, f28, fArr2[i15], fArr2[i16], fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f ? 1 : i13, fArr2[i14 + 4] != 0.0f ? 1 : i13);
                    f20 = fArr2[i15];
                    f3 = fArr2[i16];
                    f21 = f3;
                    f7 = f20;
                } else if (c11 == 'C') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    eVar = eVar;
                    int i17 = i14 + 2;
                    int i18 = i14 + 3;
                    int i19 = i14 + 4;
                    int i20 = i14 + 5;
                    path.cubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                    float f29 = fArr2[i19];
                    float f30 = fArr2[i20];
                    f20 = fArr2[i17];
                    f21 = fArr2[i18];
                    f3 = f30;
                    f7 = f29;
                } else if (c11 == 'H') {
                    fArr2 = fArr2;
                    i14 = i14;
                    eVar = eVar;
                    f3 = f27;
                    i12 = i12;
                    path.lineTo(fArr2[i14], f3);
                    f7 = fArr2[i14];
                } else if (c11 == 'Q') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    eVar = eVar;
                    int i21 = i14 + 1;
                    int i22 = i14 + 2;
                    int i23 = i14 + 3;
                    path.quadTo(fArr2[i14], fArr2[i21], fArr2[i22], fArr2[i23]);
                    float f31 = fArr2[i14];
                    float f32 = fArr2[i21];
                    float f33 = fArr2[i22];
                    float f34 = fArr2[i23];
                    f20 = f31;
                    f21 = f32;
                    f7 = f33;
                    f3 = f34;
                } else if (c11 == 'V') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    eVar = eVar;
                    f7 = f26;
                    path.lineTo(f7, fArr2[i14]);
                    f3 = fArr2[i14];
                } else if (c11 != 'a') {
                    if (c11 == 'c') {
                        fArr2 = fArr2;
                        i14 = i14;
                        int i24 = i14 + 2;
                        int i25 = i14 + 3;
                        int i26 = i14 + 4;
                        int i27 = i14 + 5;
                        path.rCubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                        float f35 = fArr2[i24] + f26;
                        float f36 = fArr2[i25] + f27;
                        f26 += fArr2[i26];
                        f27 += fArr2[i27];
                        f20 = f35;
                        f21 = f36;
                    } else if (c11 != 'h') {
                        if (c11 != 'q') {
                            if (c11 != 'v') {
                                if (c11 == 'L') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    int i28 = i14 + 1;
                                    path.lineTo(fArr2[i14], fArr2[i28]);
                                    f7 = fArr2[i14];
                                    f3 = fArr2[i28];
                                } else if (c11 == 'M') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    f7 = fArr2[i14];
                                    f3 = fArr2[i14 + 1];
                                    if (i14 > 0) {
                                        path.lineTo(f7, f3);
                                    } else {
                                        path.moveTo(f7, f3);
                                        f24 = f7;
                                        f25 = f3;
                                    }
                                } else if (c11 == 'S') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f26 = (f26 * 2.0f) - f20;
                                        f27 = (f27 * 2.0f) - f21;
                                    }
                                    float f37 = f26;
                                    float f38 = f27;
                                    int i29 = i14 + 1;
                                    int i30 = i14 + 2;
                                    int i31 = i14 + 3;
                                    path.cubicTo(f37, f38, fArr2[i14], fArr2[i29], fArr2[i30], fArr2[i31]);
                                    f20 = fArr2[i14];
                                    f21 = fArr2[i29];
                                    f7 = fArr2[i30];
                                    f3 = fArr2[i31];
                                } else if (c11 == 'T') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f26 = (f26 * 2.0f) - f20;
                                        f27 = (f27 * 2.0f) - f21;
                                    }
                                    int i32 = i14 + 1;
                                    path.quadTo(f26, f27, fArr2[i14], fArr2[i32]);
                                    f7 = fArr2[i14];
                                    f3 = fArr2[i32];
                                    eVar = eVar;
                                    f20 = f26;
                                    f21 = f27;
                                } else if (c11 == 'l') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    int i33 = i14 + 1;
                                    path.rLineTo(fArr2[i14], fArr2[i33]);
                                    f26 += fArr2[i14];
                                    f13 = fArr2[i33];
                                } else if (c11 == 'm') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    float f39 = fArr2[i14];
                                    f26 += f39;
                                    float f40 = fArr2[i14 + 1];
                                    f27 += f40;
                                    if (i14 > 0) {
                                        path.rLineTo(f39, f40);
                                    } else {
                                        path.rMoveTo(f39, f40);
                                        eVar = eVar;
                                        f7 = f26;
                                        f24 = f7;
                                        f3 = f27;
                                        f25 = f3;
                                    }
                                } else if (c11 != 's') {
                                    if (c11 != 't') {
                                        f7 = f26;
                                    } else {
                                        if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                            f16 = f26 - f20;
                                            f17 = f27 - f21;
                                        } else {
                                            f17 = 0.0f;
                                            f16 = 0.0f;
                                        }
                                        int i34 = i14 + 1;
                                        path.rQuadTo(f16, f17, fArr2[i14], fArr2[i34]);
                                        float f41 = f16 + f26;
                                        float f42 = f17 + f27;
                                        float f43 = f26 + fArr2[i14];
                                        f27 += fArr2[i34];
                                        f21 = f42;
                                        f7 = f43;
                                        f20 = f41;
                                    }
                                    f3 = f27;
                                } else {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f14 = f27 - f21;
                                        f15 = f26 - f20;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i35 = i14;
                                    int i36 = i35 + 1;
                                    int i37 = i35 + 2;
                                    int i38 = i35 + 3;
                                    fArr2 = fArr2;
                                    i14 = i35;
                                    path.rCubicTo(f15, f14, fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f10 = fArr2[i14] + f26;
                                    f11 = fArr2[i36] + f27;
                                    f26 += fArr2[i37];
                                    f12 = fArr2[i38];
                                }
                                eVar = eVar;
                            } else {
                                fArr2 = fArr2;
                                i14 = i14;
                                path.rLineTo(0.0f, fArr2[i14]);
                                f13 = fArr2[i14];
                            }
                            f27 += f13;
                        } else {
                            fArr2 = fArr2;
                            i14 = i14;
                            int i39 = i14 + 1;
                            int i40 = i14 + 2;
                            int i41 = i14 + 3;
                            path.rQuadTo(fArr2[i14], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f10 = fArr2[i14] + f26;
                            f11 = fArr2[i39] + f27;
                            f26 += fArr2[i40];
                            f12 = fArr2[i41];
                        }
                        f27 += f12;
                        f20 = f10;
                        f21 = f11;
                    } else {
                        fArr2 = fArr2;
                        i14 = i14;
                        path.rLineTo(fArr2[i14], 0.0f);
                        f26 += fArr2[i14];
                    }
                    eVar = eVar;
                    f7 = f26;
                    f3 = f27;
                } else {
                    fArr2 = fArr2;
                    i14 = i14;
                    int i42 = i14 + 5;
                    float f44 = fArr2[i42] + f26;
                    int i43 = i14 + 6;
                    float f45 = fArr2[i43] + f27;
                    eVar = eVar;
                    float f46 = f26;
                    float f47 = f27;
                    i12 = i12;
                    a(path, f46, f47, f44, f45, fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f ? 1 : i13, fArr2[i14 + 4] != 0.0f ? 1 : i13);
                    f7 = f46 + fArr2[i42];
                    f3 = f47 + fArr2[i43];
                    f20 = f7;
                    f21 = f3;
                }
                i14 += i10;
                path = path;
                eVar = eVar;
                c11 = c11;
                i12 = i12;
                f26 = f7;
                f27 = f3;
                c10 = c11;
                fArr2 = fArr2;
            }
            fArr[i13] = f26;
            fArr[1] = f27;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f24;
            fArr[5] = f25;
            c10 = eVar.f467a;
            i12++;
            eVarArr2 = eVarArr;
            i11 = i13;
        }
    }

    public e(e eVar) {
        this.f467a = eVar.f467a;
        float[] fArr = eVar.f468b;
        this.f468b = B0.c.r(fArr, fArr.length);
    }
}
