package p050e8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15832c;

    public a(long j, long j10, long j11) {
        this.f15830a = j;
        this.f15831b = j10;
        this.f15832c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f15830a == aVar.f15830a && this.f15831b == aVar.f15831b && this.f15832c == aVar.f15832c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15830a;
        long j10 = this.f15831b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f15832c;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f15830a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f15831b);
        sb.append(", uptimeMillis=");
        return p.x(this.f15832c, "}", sb);
    }
}
