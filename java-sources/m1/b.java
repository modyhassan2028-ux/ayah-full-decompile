package m1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Y2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19494f = 1;
    public double[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f19495h;

    public /* synthetic */ b() {
    }

    @Override // Y2.a
    public final double I(double d5) {
        switch (this.f19494f) {
            case 0:
                a[] aVarArr = (a[]) this.f19495h;
                double d9 = aVarArr[0].f19480c;
                if (d5 < d9) {
                    d5 = d9;
                } else if (d5 > aVarArr[aVarArr.length - 1].f19481d) {
                    d5 = aVarArr[aVarArr.length - 1].f19481d;
                }
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    a aVar = aVarArr[i10];
                    if (d5 <= aVar.f19481d) {
                        if (aVar.f19493r) {
                            return aVar.b(d5);
                        }
                        aVar.d(d5);
                        a aVar2 = aVarArr[i10];
                        return (aVar2.j * aVar2.f19490o) + aVar2.f19487l;
                    }
                }
                return Double.NaN;
            default:
                double[][] dArr = (double[][]) this.f19495h;
                double[] dArr2 = this.g;
                int length = dArr2.length;
                if (d5 <= dArr2[0]) {
                    return dArr[0][0];
                }
                int i11 = length - 1;
                if (d5 >= dArr2[i11]) {
                    return dArr[i11][0];
                }
                int i12 = 0;
                while (i12 < i11) {
                    double d10 = dArr2[i12];
                    if (d5 == d10) {
                        return dArr[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d11 = dArr2[i13];
                    if (d5 < d11) {
                        double d12 = (d5 - d10) / (d11 - d10);
                        return (dArr[i13][0] * d12) + ((1.0d - d12) * dArr[i12][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
        }
    }

    @Override // Y2.a
    public final void J(double d5, double[] dArr) {
        switch (this.f19494f) {
            case 0:
                a[] aVarArr = (a[]) this.f19495h;
                double d9 = aVarArr[0].f19480c;
                if (d5 < d9) {
                    d5 = d9;
                }
                if (d5 > aVarArr[aVarArr.length - 1].f19481d) {
                    d5 = aVarArr[aVarArr.length - 1].f19481d;
                }
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    a aVar = aVarArr[i10];
                    if (d5 <= aVar.f19481d) {
                        if (aVar.f19493r) {
                            dArr[0] = aVar.b(d5);
                            dArr[1] = aVarArr[i10].c(d5);
                        } else {
                            aVar.d(d5);
                            a aVar2 = aVarArr[i10];
                            dArr[0] = (aVar2.j * aVar2.f19490o) + aVar2.f19487l;
                            dArr[1] = (aVar2.f19486k * aVar2.f19491p) + aVar2.f19488m;
                        }
                    }
                    break;
                }
                break;
            default:
                double[] dArr2 = this.g;
                int length = dArr2.length;
                double[][] dArr3 = (double[][]) this.f19495h;
                int i11 = 0;
                int length2 = dArr3[0].length;
                if (d5 <= dArr2[0]) {
                    for (int i12 = 0; i12 < length2; i12++) {
                        dArr[i12] = dArr3[0][i12];
                    }
                } else {
                    int i13 = length - 1;
                    if (d5 >= dArr2[i13]) {
                        while (i11 < length2) {
                            dArr[i11] = dArr3[i13][i11];
                            i11++;
                        }
                    } else {
                        int i14 = 0;
                        while (i14 < i13) {
                            if (d5 == dArr2[i14]) {
                                for (int i15 = 0; i15 < length2; i15++) {
                                    dArr[i15] = dArr3[i14][i15];
                                }
                            }
                            int i16 = i14 + 1;
                            double d10 = dArr2[i16];
                            if (d5 < d10) {
                                double d11 = dArr2[i14];
                                double d12 = (d5 - d11) / (d10 - d11);
                                while (i11 < length2) {
                                    dArr[i11] = (dArr3[i16][i11] * d12) + ((1.0d - d12) * dArr3[i14][i11]);
                                    i11++;
                                }
                            } else {
                                i14 = i16;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // Y2.a
    public final void K(double d5, float[] fArr) {
        switch (this.f19494f) {
            case 0:
                a[] aVarArr = (a[]) this.f19495h;
                double d9 = aVarArr[0].f19480c;
                if (d5 < d9) {
                    d5 = d9;
                } else if (d5 > aVarArr[aVarArr.length - 1].f19481d) {
                    d5 = aVarArr[aVarArr.length - 1].f19481d;
                }
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    a aVar = aVarArr[i10];
                    if (d5 <= aVar.f19481d) {
                        if (aVar.f19493r) {
                            fArr[0] = (float) aVar.b(d5);
                            fArr[1] = (float) aVarArr[i10].c(d5);
                        } else {
                            aVar.d(d5);
                            a aVar2 = aVarArr[i10];
                            fArr[0] = (float) ((aVar2.j * aVar2.f19490o) + aVar2.f19487l);
                            fArr[1] = (float) ((aVar2.f19486k * aVar2.f19491p) + aVar2.f19488m);
                        }
                    }
                    break;
                }
                break;
            default:
                double[] dArr = this.g;
                int length = dArr.length;
                double[][] dArr2 = (double[][]) this.f19495h;
                int i11 = 0;
                int length2 = dArr2[0].length;
                if (d5 <= dArr[0]) {
                    for (int i12 = 0; i12 < length2; i12++) {
                        fArr[i12] = (float) dArr2[0][i12];
                    }
                } else {
                    int i13 = length - 1;
                    if (d5 >= dArr[i13]) {
                        while (i11 < length2) {
                            fArr[i11] = (float) dArr2[i13][i11];
                            i11++;
                        }
                    } else {
                        int i14 = 0;
                        while (i14 < i13) {
                            if (d5 == dArr[i14]) {
                                for (int i15 = 0; i15 < length2; i15++) {
                                    fArr[i15] = (float) dArr2[i14][i15];
                                }
                            }
                            int i16 = i14 + 1;
                            double d10 = dArr[i16];
                            if (d5 < d10) {
                                double d11 = dArr[i14];
                                double d12 = (d5 - d11) / (d10 - d11);
                                while (i11 < length2) {
                                    fArr[i11] = (float) ((dArr2[i16][i11] * d12) + ((1.0d - d12) * dArr2[i14][i11]));
                                    i11++;
                                }
                            } else {
                                i14 = i16;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f A[PHI: r3
      0x000f: PHI (r3v9 double) = (r3v3 double), (r3v5 double) binds: [B:5:0x000d, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Y2.a
    public final double M(double d5) {
        switch (this.f19494f) {
            case 0:
                a[] aVarArr = (a[]) this.f19495h;
                double d9 = aVarArr[0].f19480c;
                if (d5 < d9) {
                    d5 = d9;
                }
                if (d5 > aVarArr[aVarArr.length - 1].f19481d) {
                    d5 = aVarArr[aVarArr.length - 1].f19481d;
                }
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    a aVar = aVarArr[i10];
                    if (d5 <= aVar.f19481d) {
                        if (aVar.f19493r) {
                            return aVar.f19487l;
                        }
                        aVar.d(d5);
                        return aVarArr[i10].a();
                    }
                }
                return Double.NaN;
            default:
                double[] dArr = this.g;
                int length = dArr.length;
                double d10 = dArr[0];
                if (d5 < d10) {
                    d5 = d10;
                } else {
                    d10 = dArr[length - 1];
                    if (d5 >= d10) {
                        d5 = d10;
                    }
                }
                int i11 = 0;
                while (i11 < length - 1) {
                    int i12 = i11 + 1;
                    double d11 = dArr[i12];
                    if (d5 <= d11) {
                        double d12 = d11 - dArr[i11];
                        double[][] dArr2 = (double[][]) this.f19495h;
                        return (dArr2[i12][0] - dArr2[i11][0]) / d12;
                    }
                    i11 = i12;
                }
                return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016 A[PHI: r5
      0x0016: PHI (r5v7 double) = (r5v1 double), (r5v3 double) binds: [B:5:0x0014, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Y2.a
    public final void N(double d5, double[] dArr) {
        switch (this.f19494f) {
            case 0:
                a[] aVarArr = (a[]) this.f19495h;
                double d9 = aVarArr[0].f19480c;
                if (d5 < d9) {
                    d5 = d9;
                } else if (d5 > aVarArr[aVarArr.length - 1].f19481d) {
                    d5 = aVarArr[aVarArr.length - 1].f19481d;
                }
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    a aVar = aVarArr[i10];
                    if (d5 <= aVar.f19481d) {
                        if (aVar.f19493r) {
                            dArr[0] = aVar.f19487l;
                            dArr[1] = aVar.f19488m;
                        } else {
                            aVar.d(d5);
                            dArr[0] = aVarArr[i10].a();
                            a aVar2 = aVarArr[i10];
                            double d10 = aVar2.j * aVar2.f19491p;
                            double d11 = (-aVar2.f19486k) * aVar2.f19490o;
                            double dHypot = aVar2.f19489n / Math.hypot(d10, d11);
                            dArr[1] = aVar2.f19492q ? (-d11) * dHypot : d11 * dHypot;
                        }
                    }
                    break;
                }
                break;
            default:
                double[] dArr2 = this.g;
                int length = dArr2.length;
                double[][] dArr3 = (double[][]) this.f19495h;
                int length2 = dArr3[0].length;
                double d12 = dArr2[0];
                if (d5 <= d12) {
                    d5 = d12;
                } else {
                    d12 = dArr2[length - 1];
                    if (d5 >= d12) {
                        d5 = d12;
                    }
                }
                int i11 = 0;
                while (i11 < length - 1) {
                    int i12 = i11 + 1;
                    double d13 = dArr2[i12];
                    if (d5 <= d13) {
                        double d14 = d13 - dArr2[i11];
                        for (int i13 = 0; i13 < length2; i13++) {
                            dArr[i13] = (dArr3[i12][i13] - dArr3[i11][i13]) / d14;
                        }
                    } else {
                        i11 = i12;
                    }
                    break;
                }
                break;
        }
    }

    @Override // Y2.a
    public final double[] R() {
        switch (this.f19494f) {
            case 0:
                break;
        }
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m1.b] */
    public b(int[] iArr, double[] dArr, double[][] dArr2) {
        int i10;
        double[] dArr3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.g = dArr4;
        int i11 = 1;
        obj.f19495h = new a[dArr4.length - 1];
        boolean z10 = false;
        int i12 = 0;
        int i13 = 1;
        int i14 = 1;
        b bVar = obj;
        while (true) {
            a[] aVarArr = (a[]) bVar.f19495h;
            if (i12 >= aVarArr.length) {
                return;
            }
            int i15 = iArr[i12];
            if (i15 == 0) {
                i14 = 3;
            } else if (i15 == i11) {
                i13 = i11;
                i14 = i13;
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        if (i13 != i11) {
                            i13 = i11;
                        }
                        i14 = i13;
                    }
                }
                i13 = 2;
                i14 = i13;
            }
            double d5 = dArr4[i12];
            int i16 = i12 + 1;
            double d9 = dArr4[i16];
            double[] dArr5 = dArr2[i12];
            double d10 = dArr5[z10 ? 1 : 0];
            boolean z11 = i11;
            int i17 = i12;
            double d11 = dArr5[z11 ? 1 : 0];
            double[] dArr6 = dArr2[i16];
            double d12 = dArr6[z10 ? 1 : 0];
            double d13 = dArr6[z11 ? 1 : 0];
            a aVar = new a();
            aVar.f19493r = z10;
            z10 = i14 == z11 ? z11 ? 1 : 0 : z10;
            aVar.f19492q = z10;
            aVar.f19480c = d5;
            aVar.f19481d = d9;
            double d14 = d9 - d5;
            double d15 = 1.0d / d14;
            aVar.f19485i = d15;
            if (3 == i14) {
                aVar.f19493r = z11;
            }
            double d16 = d12 - d10;
            int i18 = i13;
            int i19 = i14;
            double d17 = d13 - d11;
            if (aVar.f19493r || Math.abs(d16) < 0.001d || Math.abs(d17) < 0.001d) {
                i10 = 1;
                aVar.f19493r = true;
                aVar.f19482e = d10;
                aVar.f19483f = d12;
                aVar.g = d11;
                aVar.f19484h = d13;
                double dHypot = Math.hypot(d17, d16);
                aVar.f19479b = dHypot;
                aVar.f19489n = dHypot * d15;
                aVar.f19487l = d16 / d14;
                aVar.f19488m = d17 / d14;
            } else {
                double[] dArr7 = new double[101];
                aVar.f19478a = dArr7;
                aVar.j = ((double) (z10 ? -1 : 1)) * d16;
                aVar.f19486k = d17 * ((double) (z10 ? 1 : -1));
                aVar.f19487l = z10 ? d12 : d10;
                aVar.f19488m = z10 ? d11 : d13;
                double d18 = d11 - d13;
                int i20 = 0;
                double dHypot2 = 0.0d;
                double d19 = 0.0d;
                double d20 = 0.0d;
                while (true) {
                    dArr3 = a.f19477s;
                    if (i20 >= 91) {
                        break;
                    }
                    double d21 = d18;
                    int i21 = i20;
                    double radians = Math.toRadians((((double) i20) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d16;
                    double dCos = Math.cos(radians) * d21;
                    if (i21 > 0) {
                        dHypot2 += Math.hypot(dSin - d19, dCos - d20);
                        dArr3[i21] = dHypot2;
                    }
                    d20 = dCos;
                    d19 = dSin;
                    i20 = i21 + 1;
                    d18 = d21;
                }
                aVar.f19479b = dHypot2;
                for (int i22 = 0; i22 < 91; i22++) {
                    dArr3[i22] = dArr3[i22] / dHypot2;
                }
                for (int i23 = 0; i23 < 101; i23++) {
                    double d22 = ((double) i23) / ((double) 100);
                    int iBinarySearch = Arrays.binarySearch(dArr3, d22);
                    if (iBinarySearch >= 0) {
                        dArr7[i23] = iBinarySearch / 90;
                    } else if (iBinarySearch == -1) {
                        dArr7[i23] = 0.0d;
                    } else {
                        int i24 = -iBinarySearch;
                        int i25 = i24 - 2;
                        double d23 = dArr3[i25];
                        dArr7[i23] = (((d22 - d23) / (dArr3[i24 - 1] - d23)) + ((double) i25)) / ((double) 90);
                    }
                }
                aVar.f19489n = aVar.f19479b * aVar.f19485i;
                i10 = 1;
            }
            aVarArr[i17] = aVar;
            bVar = this;
            dArr4 = dArr;
            i11 = i10;
            i13 = i18;
            i12 = i16;
            i14 = i19;
            z10 = false;
        }
    }
}
