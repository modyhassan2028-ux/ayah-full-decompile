package R7;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f7293t;

    public g(float f3) {
        super(0);
        this.f7293t = f3 - 0.001f;
    }

    @Override // R7.f
    public final void p(float f3, float f7, float f10, y yVar) {
        double d5 = this.f7293t;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d5) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d5, 2.0d) - Math.pow(fSqrt, 2.0d));
        yVar.e(f7 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2, 270.0f, 0.0f);
        yVar.d(f7, (float) (-((Math.sqrt(2.0d) * d5) - d5)));
        yVar.d(f7 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2);
    }
}
