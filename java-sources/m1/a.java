package m1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f19477s = new double[91];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f19478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f19479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f19480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f19481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f19482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f19483f;
    public double g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f19484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f19485i;
    public double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f19486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f19487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f19488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f19489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f19490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f19491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19493r;

    public final double a() {
        double d5 = this.j * this.f19491p;
        double dHypot = this.f19489n / Math.hypot(d5, (-this.f19486k) * this.f19490o);
        return this.f19492q ? (-d5) * dHypot : d5 * dHypot;
    }

    public final double b(double d5) {
        double d9 = (d5 - this.f19480c) * this.f19485i;
        double d10 = this.f19482e;
        return ((this.f19483f - d10) * d9) + d10;
    }

    public final double c(double d5) {
        double d9 = (d5 - this.f19480c) * this.f19485i;
        double d10 = this.g;
        return ((this.f19484h - d10) * d9) + d10;
    }

    public final void d(double d5) {
        double d9 = (this.f19492q ? this.f19481d - d5 : d5 - this.f19480c) * this.f19485i;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            d10 = 1.0d;
            if (d9 < 1.0d) {
                double[] dArr = this.f19478a;
                double length = d9 * ((double) (dArr.length - 1));
                int i10 = (int) length;
                double d11 = dArr[i10];
                d10 = ((dArr[i10 + 1] - d11) * (length - ((double) i10))) + d11;
            }
        }
        double d12 = d10 * 1.5707963267948966d;
        this.f19490o = Math.sin(d12);
        this.f19491p = Math.cos(d12);
    }
}
