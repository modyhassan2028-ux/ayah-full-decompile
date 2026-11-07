package K6;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5249c;

    public c(long j, long j10, Set set) {
        this.f5247a = j;
        this.f5248b = j10;
        this.f5249c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f5247a == cVar.f5247a && this.f5248b == cVar.f5248b && this.f5249c.equals(cVar.f5249c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5247a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f5248b;
        return ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f5249c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f5247a + ", maxAllowedDelay=" + this.f5248b + ", flags=" + this.f5249c + "}";
    }
}
