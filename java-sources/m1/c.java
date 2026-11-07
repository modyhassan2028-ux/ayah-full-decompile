package m1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Y2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f19496f;
    public double[] g;

    @Override // Y2.a
    public final double I(double d5) {
        return this.g[0];
    }

    @Override // Y2.a
    public final void J(double d5, double[] dArr) {
        double[] dArr2 = this.g;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // Y2.a
    public final void K(double d5, float[] fArr) {
        int i10 = 0;
        while (true) {
            double[] dArr = this.g;
            if (i10 >= dArr.length) {
                return;
            }
            fArr[i10] = (float) dArr[i10];
            i10++;
        }
    }

    @Override // Y2.a
    public final double M(double d5) {
        return 0.0d;
    }

    @Override // Y2.a
    public final void N(double d5, double[] dArr) {
        for (int i10 = 0; i10 < this.g.length; i10++) {
            dArr[i10] = 0.0d;
        }
    }

    @Override // Y2.a
    public final double[] R() {
        return new double[]{this.f19496f};
    }
}
