package p223x;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23925c;

    public final long a(float f3, float f7, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f10 = f3 - this.f23923a;
        double d5 = j / 1000.0d;
        float f11 = this.f23925c;
        double d9 = ((double) f11) * ((double) f11);
        double d10 = this.f23924b;
        double d11 = ((double) (-f11)) * d10;
        if (f11 <= 1.0f) {
            if (f11 == 1.0f) {
                double d12 = f10;
                double d13 = (d10 * d12) + ((double) f7);
                double d14 = (-d10) * d5;
                double d15 = (d5 * d13) + d12;
                dSin = Math.exp(d14) * d15;
                dExp = Math.exp(d14) * d15 * (-this.f23924b);
                dExp2 = Math.exp(d14) * d13;
            } else {
                double d16 = 1;
                double dSqrt = Math.sqrt(d16 - d9) * d10;
                double d17 = f10;
                double d18 = (((-d11) * d17) + ((double) f7)) * (d16 / dSqrt);
                double d19 = dSqrt * d5;
                double d20 = d5 * d11;
                dSin = ((Math.sin(d19) * d18) + (Math.cos(d19) * d17)) * Math.exp(d20);
                dCos = (((Math.cos(d19) * dSqrt * d18) + (Math.sin(d19) * (-dSqrt) * d17)) * Math.exp(d20)) + (d11 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f23923a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d9 - ((double) 1)) * d10;
        double d21 = d11 + dSqrt2;
        double d22 = d11 - dSqrt2;
        double d23 = f10;
        double d24 = ((d22 * d23) - ((double) f7)) / (d22 - d21);
        double d25 = d23 - d24;
        double d26 = d22 * d5;
        double d27 = d5 * d21;
        dSin = (Math.exp(d27) * d24) + (Math.exp(d26) * d25);
        dExp = Math.exp(d26) * d25 * d22;
        dExp2 = Math.exp(d27) * d24 * d21;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f23923a))) << 32);
    }
}
