package K6;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.a f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5246b;

    public b(N6.a aVar, HashMap map) {
        this.f5245a = aVar;
        this.f5246b = map;
    }

    public final long a(B6.c cVar, long j, int i10) {
        long jE = j - this.f5245a.e();
        c cVar2 = (c) this.f5246b.get(cVar);
        long j10 = cVar2.f5247a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11)))), jE), cVar2.f5248b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5245a.equals(bVar.f5245a) && this.f5246b.equals(bVar.f5246b);
    }

    public final int hashCode() {
        return ((this.f5245a.hashCode() ^ 1000003) * 1000003) ^ this.f5246b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f5245a + ", values=" + this.f5246b + "}";
    }
}
