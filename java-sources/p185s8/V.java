package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class V extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22277c;

    public V(long j, String str, String str2) {
        this.f22275a = str;
        this.f22276b = str2;
        this.f22277c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            V v10 = (V) ((z0) obj);
            if (this.f22275a.equals(v10.f22275a) && this.f22276b.equals(v10.f22276b) && this.f22277c == v10.f22277c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f22275a.hashCode() ^ 1000003) * 1000003) ^ this.f22276b.hashCode()) * 1000003;
        long j = this.f22277c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f22275a);
        sb.append(", code=");
        sb.append(this.f22276b);
        sb.append(", address=");
        return p.x(this.f22277c, "}", sb);
    }
}
