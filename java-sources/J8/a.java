package J8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4389c;

    public a(String str, long j, long j10) {
        this.f4387a = str;
        this.f4388b = j;
        this.f4389c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4387a.equals(aVar.f4387a) && this.f4388b == aVar.f4388b && this.f4389c == aVar.f4389c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4387a.hashCode() ^ 1000003) * 1000003;
        long j = this.f4388b;
        long j10 = this.f4389c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f4387a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f4388b);
        sb.append(", tokenCreationTimestamp=");
        return p.x(this.f4389c, "}", sb);
    }
}
