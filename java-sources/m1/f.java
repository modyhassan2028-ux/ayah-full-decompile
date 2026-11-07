package m1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Y2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f19503f;
    public double[][] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double[][] f19504h;

    public static double o0(double d5, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d9 * d9;
        double d15 = d9 * 6.0d;
        double d16 = 6.0d * d14 * d10;
        double d17 = (d16 + ((d15 * d11) + (((-6.0d) * d14) * d11))) - (d15 * d10);
        double d18 = 3.0d * d5;
        return (d5 * d12) + (((((d18 * d12) * d14) + (((d18 * d13) * d14) + d17)) - (((2.0d * d5) * d13) * d9)) - (((4.0d * d5) * d12) * d9));
    }

    public static double p0(double d5, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d9 * d9;
        double d15 = d14 * d9;
        double d16 = 3.0d * d14;
        double d17 = d15 * 2.0d * d10;
        double d18 = ((d17 + ((d16 * d11) + (((-2.0d) * d15) * d11))) - (d16 * d10)) + d10;
        double d19 = d5 * d13;
        double d20 = (d19 * d15) + d18;
        double d21 = d5 * d12;
        return (d21 * d9) + ((((d15 * d21) + d20) - (d19 * d14)) - (((d5 * 2.0d) * d12) * d14));
    }

    @Override // Y2.a
    public final double I(double d5) {
        double[][] dArr = this.g;
        double[] dArr2 = this.f19503f;
        int length = dArr2.length;
        if (d5 <= dArr2[0]) {
            return dArr[0][0];
        }
        int i10 = length - 1;
        if (d5 >= dArr2[i10]) {
            return dArr[i10][0];
        }
        int i11 = 0;
        while (i11 < i10) {
            double d9 = dArr2[i11];
            if (d5 == d9) {
                return dArr[i11][0];
            }
            int i12 = i11 + 1;
            double d10 = dArr2[i12];
            if (d5 < d10) {
                double d11 = d10 - d9;
                double d12 = (d5 - d9) / d11;
                double d13 = dArr[i11][0];
                double d14 = dArr[i12][0];
                double[][] dArr3 = this.f19504h;
                return p0(d11, d12, d13, d14, dArr3[i11][0], dArr3[i12][0]);
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // Y2.a
    public final void J(double d5, double[] dArr) {
        double[] dArr2 = this.f19503f;
        int length = dArr2.length;
        double[][] dArr3 = this.g;
        int i10 = 0;
        int length2 = dArr3[0].length;
        if (d5 <= dArr2[0]) {
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = dArr3[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        if (d5 >= dArr2[i12]) {
            while (i10 < length2) {
                dArr[i10] = dArr3[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d5 == dArr2[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = dArr3[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d9 = dArr2[i15];
            if (d5 < d9) {
                double d10 = dArr2[i13];
                double d11 = d9 - d10;
                double d12 = (d5 - d10) / d11;
                while (i10 < length2) {
                    double d13 = dArr3[i13][i10];
                    double d14 = dArr3[i15][i10];
                    double[][] dArr4 = this.f19504h;
                    dArr[i10] = p0(d11, d12, d13, d14, dArr4[i13][i10], dArr4[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // Y2.a
    public final void K(double d5, float[] fArr) {
        double[] dArr = this.f19503f;
        int length = dArr.length;
        double[][] dArr2 = this.g;
        int i10 = 0;
        int length2 = dArr2[0].length;
        if (d5 <= dArr[0]) {
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) dArr2[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        if (d5 >= dArr[i12]) {
            while (i10 < length2) {
                fArr[i10] = (float) dArr2[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d5 == dArr[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) dArr2[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d9 = dArr[i15];
            if (d5 < d9) {
                double d10 = dArr[i13];
                double d11 = d9 - d10;
                double d12 = (d5 - d10) / d11;
                while (i10 < length2) {
                    double d13 = dArr2[i13][i10];
                    double d14 = dArr2[i15][i10];
                    double[][] dArr3 = this.f19504h;
                    fArr[i10] = (float) p0(d11, d12, d13, d14, dArr3[i13][i10], dArr3[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // Y2.a
    public final double M(double d5) {
        double[] dArr = this.f19503f;
        int length = dArr.length;
        double d9 = dArr[0];
        if (d5 >= d9) {
            d9 = dArr[length - 1];
            if (d5 < d9) {
                d9 = d5;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d10 = dArr[i11];
            if (d9 <= d10) {
                double d11 = dArr[i10];
                double d12 = d10 - d11;
                double[][] dArr2 = this.g;
                double d13 = dArr2[i10][0];
                double d14 = dArr2[i11][0];
                double[][] dArr3 = this.f19504h;
                return o0(d12, (d9 - d11) / d12, d13, d14, dArr3[i10][0], dArr3[i11][0]) / d12;
            }
            i10 = i11;
        }
        return 0.0d;
    }

    @Override // Y2.a
    public final void N(double d5, double[] dArr) {
        double[] dArr2 = this.f19503f;
        int length = dArr2.length;
        double[][] dArr3 = this.g;
        int length2 = dArr3[0].length;
        double d9 = dArr2[0];
        if (d5 > d9) {
            d9 = dArr2[length - 1];
            if (d5 < d9) {
                d9 = d5;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d10 = dArr2[i11];
            if (d9 <= d10) {
                double d11 = dArr2[i10];
                double d12 = d10 - d11;
                double d13 = (d9 - d11) / d12;
                for (int i12 = 0; i12 < length2; i12++) {
                    double d14 = dArr3[i10][i12];
                    double d15 = dArr3[i11][i12];
                    double[][] dArr4 = this.f19504h;
                    dArr[i12] = o0(d12, d13, d14, d15, dArr4[i10][i12], dArr4[i11][i12]) / d12;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // Y2.a
    public final double[] R() {
        return this.f19503f;
    }
}
