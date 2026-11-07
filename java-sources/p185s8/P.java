package p185s8;

/* JADX INFO: loaded from: classes.dex */
public final class P extends K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E0 f22251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F0 f22252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0 f22253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J0 f22254f;

    public P(long j, String str, E0 e10, F0 f3, G0 g10, J0 j10) {
        this.f22249a = j;
        this.f22250b = str;
        this.f22251c = e10;
        this.f22252d = f3;
        this.f22253e = g10;
        this.f22254f = j10;
    }

    public final O a() {
        O o10 = new O();
        o10.f22242a = this.f22249a;
        o10.f22243b = this.f22250b;
        o10.f22244c = this.f22251c;
        o10.f22245d = this.f22252d;
        o10.f22246e = this.f22253e;
        o10.f22247f = this.f22254f;
        o10.g = (byte) 1;
        return o10;
    }

    public final boolean equals(Object obj) {
        G0 g10;
        J0 j10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof K0) {
            P p10 = (P) ((K0) obj);
            J0 j11 = p10.f22254f;
            G0 g11 = p10.f22253e;
            if (this.f22249a == p10.f22249a && this.f22250b.equals(p10.f22250b) && this.f22251c.equals(p10.f22251c) && this.f22252d.equals(p10.f22252d) && ((g10 = this.f22253e) != null ? g10.equals(g11) : g11 == null) && ((j10 = this.f22254f) != null ? j10.equals(j11) : j11 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22249a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22250b.hashCode()) * 1000003) ^ this.f22251c.hashCode()) * 1000003) ^ this.f22252d.hashCode()) * 1000003;
        G0 g10 = this.f22253e;
        int iHashCode2 = (iHashCode ^ (g10 == null ? 0 : g10.hashCode())) * 1000003;
        J0 j10 = this.f22254f;
        return iHashCode2 ^ (j10 != null ? j10.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f22249a + ", type=" + this.f22250b + ", app=" + this.f22251c + ", device=" + this.f22252d + ", log=" + this.f22253e + ", rollouts=" + this.f22254f + "}";
    }
}
