package p187t0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f22573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f22574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f22575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f22576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f22577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f22578f;
    public final double g;

    public /* synthetic */ r(double d5, double d9, double d10, double d11, double d12) {
        this(d5, d9, d10, d11, d12, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f22573a, rVar.f22573a) == 0 && Double.compare(this.f22574b, rVar.f22574b) == 0 && Double.compare(this.f22575c, rVar.f22575c) == 0 && Double.compare(this.f22576d, rVar.f22576d) == 0 && Double.compare(this.f22577e, rVar.f22577e) == 0 && Double.compare(this.f22578f, rVar.f22578f) == 0 && Double.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f22573a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f22574b);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f22575c);
        int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f22576d);
        int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f22577e);
        int i13 = (i12 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f22578f);
        int i14 = (i13 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        return i14 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f22573a + ", a=" + this.f22574b + ", b=" + this.f22575c + ", c=" + this.f22576d + ", d=" + this.f22577e + ", e=" + this.f22578f + ", f=" + this.g + ')';
    }

    public r(double d5, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f22573a = d5;
        this.f22574b = d9;
        this.f22575c = d10;
        this.f22576d = d11;
        this.f22577e = d12;
        this.f22578f = d13;
        this.g = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 == -2.0d || d5 == -3.0d) {
            return;
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d5 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d5 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
