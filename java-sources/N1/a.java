package N1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5969f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5971i;

    public final float a(long j) {
        long j10 = this.f5968e;
        if (j < j10) {
            return 0.0f;
        }
        long j11 = this.g;
        if (j11 < 0 || j < j11) {
            return e.b((j - j10) / this.f5964a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f5970h;
        return (e.b((j - j11) / this.f5971i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
