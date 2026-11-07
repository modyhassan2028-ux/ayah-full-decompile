package p223x;

import Aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC1436z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f23812b;

    public A(float f3, float f7, float f10) {
        this.f23811a = f10;
        Z z10 = new Z();
        z10.f23923a = 1.0f;
        z10.f23924b = Math.sqrt(50.0d);
        z10.f23925c = 1.0f;
        if (f3 < 0.0f) {
            M.a("Damping ratio must be non-negative");
        }
        z10.f23925c = f3;
        double d5 = z10.f23924b;
        if (((float) (d5 * d5)) <= 0.0f) {
            M.a("Spring stiffness constant must be positive.");
        }
        z10.f23924b = Math.sqrt(f7);
        this.f23812b = z10;
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        return new a((InterfaceC1436z) this);
    }

    @Override // p223x.InterfaceC1436z
    public final float b(long j, float f3, float f7, float f10) {
        Z z10 = this.f23812b;
        z10.f23923a = f7;
        return Float.intBitsToFloat((int) (z10.a(f3, f10, j / 1000000) >> 32));
    }

    @Override // p223x.InterfaceC1436z
    public final float c(long j, float f3, float f7, float f10) {
        Z z10 = this.f23812b;
        z10.f23923a = f7;
        return Float.intBitsToFloat((int) (z10.a(f3, f10, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    @Override // p223x.InterfaceC1436z
    public final long d(float f3, float f7, float f10) {
        double dLog;
        long j;
        Z z10 = this.f23812b;
        double d5 = z10.f23924b;
        float f11 = (float) (d5 * d5);
        float f12 = z10.f23925c;
        float f13 = this.f23811a;
        float f14 = (f3 - f7) / f13;
        float f15 = f10 / f13;
        if (f12 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d9 = f11;
            double d10 = f12;
            double d11 = f15;
            double d12 = f14;
            double d13 = 1.0f;
            double dSqrt = d10 * 2.0d * Math.sqrt(d9);
            double d14 = (dSqrt * dSqrt) - (d9 * 4.0d);
            double dSqrt2 = d14 < 0.0d ? 0.0d : Math.sqrt(d14);
            double d15 = -dSqrt;
            double d16 = (d15 + dSqrt2) * 0.5d;
            double dSqrt3 = (d14 < 0.0d ? Math.sqrt(Math.abs(d14)) : 0.0d) * 0.5d;
            double d17 = (d15 - dSqrt2) * 0.5d;
            if (d12 == 0.0d && d11 == 0.0d) {
                j = 0;
            } else {
                if (d12 < 0.0d) {
                    d11 = -d11;
                }
                double dAbs = Math.abs(d12);
                double dAbs2 = Double.MAX_VALUE;
                if (d10 > 1.0d) {
                    double d18 = (d16 * dAbs) - d11;
                    double d19 = d16 - d17;
                    double d20 = d18 / d19;
                    double d21 = dAbs - d20;
                    dLog = Math.log(Math.abs(d13 / d21)) / d16;
                    double dLog2 = Math.log(Math.abs(d13 / d20)) / d17;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d22 = d21 * d16;
                    double dLog3 = Math.log(d22 / ((-d20) * d17)) / (d17 - d16);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d13 = -d13;
                    } else if (dLog3 <= 0.0d) {
                        dLog = Math.log((-((d20 * d17) * d17)) / (d22 * d16)) / d19;
                    } else if ((-((Math.exp(dLog3 * d17) * d20) + (Math.exp(d16 * dLog3) * d21))) < d13) {
                        d13 = -d13;
                        dLog = (d20 <= 0.0d || d21 >= 0.0d) ? dLog : 0.0d;
                    } else {
                        dLog = Math.log((-((d20 * d17) * d17)) / (d22 * d16)) / d19;
                    }
                    double d23 = d20 * d17;
                    if (Math.abs((Math.exp(d17 * dLog) * d23) + (Math.exp(d16 * dLog) * d22)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d24 = d16 * dLog;
                            double d25 = d17 * dLog;
                            double dExp = dLog - ((((Math.exp(d25) * d20) + (Math.exp(d24) * d21)) + d13) / ((Math.exp(d25) * d23) + (Math.exp(d24) * d22)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d10 < 1.0d) {
                    double d26 = (d11 - (d16 * dAbs)) / dSqrt3;
                    dLog = Math.log(d13 / Math.sqrt((d26 * d26) + (dAbs * dAbs))) / d16;
                } else {
                    double d27 = d16 * dAbs;
                    double d28 = d11 - d27;
                    double dLog4 = Math.log(Math.abs(d13 / dAbs)) / d16;
                    double dLog5 = Math.log(Math.abs(d13 / d28));
                    double dLog6 = dLog5;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d16));
                    }
                    double d29 = dLog6 / d16;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d29;
                    } else if ((Double.doubleToRawLongBits(d29) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d29);
                    }
                    double d30 = (-(d27 + d28)) / (d16 * d28);
                    double d31 = d16 * d30;
                    double dExp2 = (Math.exp(d31) * d28 * d30) + (Math.exp(d31) * dAbs);
                    if (Double.isNaN(d30) || d30 <= 0.0d) {
                        d13 = -d13;
                    } else if (d30 <= 0.0d || (-dExp2) >= d13) {
                        dLog4 = (-(2.0d / d16)) - (dAbs / d28);
                    } else {
                        if (d28 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d13 = -d13;
                    }
                    dLog = dLog4;
                    int i12 = 0;
                    while (dAbs2 > 0.001d && i12 < 100) {
                        i12++;
                        double d32 = d16 * dLog;
                        double dExp3 = dLog - (((Math.exp(d32) * ((d28 * dLog) + dAbs)) + d13) / (Math.exp(d32) * (((((double) 1) + d32) * d28) + d27)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // p223x.InterfaceC1436z
    public final float e(float f3, float f7, float f10) {
        return 0.0f;
    }
}
