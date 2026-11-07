package i7;

/* JADX INFO: loaded from: classes.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1 f17067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17068b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17069c = a();

    public P1(Q1 q10) {
        this.f17067a = q10;
    }

    public final long a() {
        Q1 q10 = this.f17067a;
        U6.y.f(q10);
        long jLongValue = ((Long) G.f16979v.a(null)).longValue();
        long jLongValue2 = ((Long) G.f16981w.a(null)).longValue();
        for (int i10 = 1; i10 < this.f17068b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        q10.e().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
