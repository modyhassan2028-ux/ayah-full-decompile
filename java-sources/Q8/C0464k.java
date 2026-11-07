package Q8;

/* JADX INFO: renamed from: Q8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0464k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0463j f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0463j f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f7034c;

    public C0464k(EnumC0463j enumC0463j, EnumC0463j enumC0463j2, double d5) {
        this.f7032a = enumC0463j;
        this.f7033b = enumC0463j2;
        this.f7034c = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0464k)) {
            return false;
        }
        C0464k c0464k = (C0464k) obj;
        return this.f7032a == c0464k.f7032a && this.f7033b == c0464k.f7033b && Double.compare(this.f7034c, c0464k.f7034c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f7033b.hashCode() + (this.f7032a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f7034c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f7032a + ", crashlytics=" + this.f7033b + ", sessionSamplingRate=" + this.f7034c + ')';
    }
}
