package p003a2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f11153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f11154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f11156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f11157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11158f;
    public double g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f11159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f11160i;
    public final d j;

    public f() {
        this.f11153a = Math.sqrt(1500.0d);
        this.f11154b = 0.5d;
        this.f11155c = false;
        this.f11160i = Double.MAX_VALUE;
        this.j = new d();
    }

    public final void a(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f11153a = Math.sqrt(f3);
        this.f11155c = false;
    }

    public final d b(double d5, double d9, long j) {
        double dSin;
        double dCos;
        if (!this.f11155c) {
            if (this.f11160i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.f11154b;
            if (d10 > 1.0d) {
                double d11 = this.f11153a;
                this.f11158f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.f11154b;
                double d13 = this.f11153a;
                this.g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f11159h = Math.sqrt(1.0d - (d10 * d10)) * this.f11153a;
            }
            this.f11155c = true;
        }
        double d14 = j / 1000.0d;
        double d15 = d5 - this.f11160i;
        double d16 = this.f11154b;
        if (d16 > 1.0d) {
            double d17 = this.g;
            double d18 = ((d17 * d15) - d9) / (d17 - this.f11158f);
            double d19 = d15 - d18;
            dSin = (Math.pow(2.718281828459045d, this.f11158f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.g;
            double dPow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f11158f;
            dCos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + dPow;
        } else if (d16 == 1.0d) {
            double d22 = this.f11153a;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double dPow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f11153a) * d14) * d24;
            double d25 = -this.f11153a;
            dCos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (dPow3 * d25);
            dSin = dPow2;
        } else {
            double d26 = 1.0d / this.f11159h;
            double d27 = this.f11153a;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            dSin = ((Math.sin(this.f11159h * d14) * d28) + (Math.cos(this.f11159h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f11153a;
            double d30 = this.f11154b;
            double d31 = (-d29) * dSin * d30;
            double dPow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.f11159h;
            double dSin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.f11159h;
            dCos = (((Math.cos(d33 * d14) * d28 * d33) + dSin2) * dPow4) + d31;
        }
        float f3 = (float) (dSin + this.f11160i);
        d dVar = this.j;
        dVar.f11132a = f3;
        dVar.f11133b = (float) dCos;
        return dVar;
    }

    public f(float f3) {
        this.f11153a = Math.sqrt(1500.0d);
        this.f11154b = 0.5d;
        this.f11155c = false;
        this.j = new d();
        this.f11160i = f3;
    }
}
