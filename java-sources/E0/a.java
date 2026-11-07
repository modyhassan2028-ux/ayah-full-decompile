package E0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1407b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1406a == aVar.f1406a && Float.compare(this.f1407b, aVar.f1407b) == 0;
    }

    public final int hashCode() {
        long j = this.f1406a;
        return Float.floatToIntBits(this.f1407b) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f1406a);
        sb.append(", dataPoint=");
        return p123m2.c.v(sb, this.f1407b, ')');
    }
}
