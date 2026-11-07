package p178r8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21607f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f21603b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f21604c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f21605d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f21606e = str4;
        this.f21607f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            b bVar = (b) ((n) obj);
            if (this.f21603b.equals(bVar.f21603b) && this.f21604c.equals(bVar.f21604c) && this.f21605d.equals(bVar.f21605d) && this.f21606e.equals(bVar.f21606e) && this.f21607f == bVar.f21607f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f21603b.hashCode() ^ 1000003) * 1000003) ^ this.f21604c.hashCode()) * 1000003) ^ this.f21605d.hashCode()) * 1000003) ^ this.f21606e.hashCode()) * 1000003;
        long j = this.f21607f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f21603b);
        sb.append(", parameterKey=");
        sb.append(this.f21604c);
        sb.append(", parameterValue=");
        sb.append(this.f21605d);
        sb.append(", variantId=");
        sb.append(this.f21606e);
        sb.append(", templateVersion=");
        return p.x(this.f21607f, "}", sb);
    }
}
