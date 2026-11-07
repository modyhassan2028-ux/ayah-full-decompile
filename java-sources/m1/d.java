package m1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f19497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f19498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f19499f;
    public final double g;

    public d(String str) {
        this.f19502a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f19497d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i10);
        this.f19498e = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
        int i11 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i11);
        this.f19499f = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
        int i12 = iIndexOf4 + 1;
        this.g = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
    }

    @Override // m1.e
    public final double a(double d5) {
        if (d5 <= 0.0d) {
            return 0.0d;
        }
        if (d5 >= 1.0d) {
            return 1.0d;
        }
        double d9 = 0.5d;
        double d10 = 0.5d;
        while (d9 > 0.01d) {
            d9 *= 0.5d;
            d10 = d(d10) < d5 ? d10 + d9 : d10 - d9;
        }
        double d11 = d10 - d9;
        double d12 = d(d11);
        double d13 = d10 + d9;
        double d14 = d(d13);
        double dE = e(d11);
        return (((d5 - d12) * (e(d13) - dE)) / (d14 - d12)) + dE;
    }

    @Override // m1.e
    public final double b(double d5) {
        double d9 = 0.5d;
        double d10 = 0.5d;
        while (d9 > 1.0E-4d) {
            d9 *= 0.5d;
            d10 = d(d10) < d5 ? d10 + d9 : d10 - d9;
        }
        double d11 = d10 - d9;
        double d12 = d10 + d9;
        return (e(d12) - e(d11)) / (d(d12) - d(d11));
    }

    public final double d(double d5) {
        double d9 = 1.0d - d5;
        double d10 = 3.0d * d9;
        double d11 = d9 * d10 * d5;
        double d12 = d10 * d5 * d5;
        return (this.f19499f * d12) + (this.f19497d * d11) + (d5 * d5 * d5);
    }

    public final double e(double d5) {
        double d9 = 1.0d - d5;
        double d10 = 3.0d * d9;
        double d11 = d9 * d10 * d5;
        double d12 = d10 * d5 * d5;
        return (this.g * d12) + (this.f19498e * d11) + (d5 * d5 * d5);
    }
}
