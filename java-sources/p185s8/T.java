package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class T extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22269d;

    public T(long j, long j10, String str, String str2) {
        this.f22266a = j;
        this.f22267b = j10;
        this.f22268c = str;
        this.f22269d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            T t2 = (T) ((x0) obj);
            String str2 = t2.f22269d;
            if (this.f22266a == t2.f22266a && this.f22267b == t2.f22267b && this.f22268c.equals(t2.f22268c) && ((str = this.f22269d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22266a;
        long j10 = this.f22267b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f22268c.hashCode()) * 1000003;
        String str = this.f22269d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f22266a);
        sb.append(", size=");
        sb.append(this.f22267b);
        sb.append(", name=");
        sb.append(this.f22268c);
        sb.append(", uuid=");
        return p.B(sb, this.f22269d, "}");
    }
}
