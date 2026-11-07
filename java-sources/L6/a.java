package L6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5534f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5539e;

    public a(long j, int i10, int i11, long j10, int i12) {
        this.f5535a = j;
        this.f5536b = i10;
        this.f5537c = i11;
        this.f5538d = j10;
        this.f5539e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5535a == aVar.f5535a && this.f5536b == aVar.f5536b && this.f5537c == aVar.f5537c && this.f5538d == aVar.f5538d && this.f5539e == aVar.f5539e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5535a;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5536b) * 1000003) ^ this.f5537c) * 1000003;
        long j10 = this.f5538d;
        return ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f5539e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f5535a);
        sb.append(", loadBatchSize=");
        sb.append(this.f5536b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f5537c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f5538d);
        sb.append(", maxBlobByteSizePerRow=");
        return p245z2.a.E(sb, this.f5539e, "}");
    }
}
