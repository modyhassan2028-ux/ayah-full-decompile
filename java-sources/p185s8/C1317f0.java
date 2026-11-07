package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1317f0 extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0 f22351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22354d;

    public C1317f0(C1319g0 c1319g0, String str, String str2, long j) {
        this.f22351a = c1319g0;
        this.f22352b = str;
        this.f22353c = str2;
        this.f22354d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I0) {
            C1317f0 c1317f0 = (C1317f0) ((I0) obj);
            if (this.f22351a.equals(c1317f0.f22351a) && this.f22352b.equals(c1317f0.f22352b) && this.f22353c.equals(c1317f0.f22353c) && this.f22354d == c1317f0.f22354d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f22351a.hashCode() ^ 1000003) * 1000003) ^ this.f22352b.hashCode()) * 1000003) ^ this.f22353c.hashCode()) * 1000003;
        long j = this.f22354d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f22351a);
        sb.append(", parameterKey=");
        sb.append(this.f22352b);
        sb.append(", parameterValue=");
        sb.append(this.f22353c);
        sb.append(", templateVersion=");
        return p.x(this.f22354d, "}", sb);
    }
}
