package L8;

import W.AbstractC0607v1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5568c;

    public b(long j, int i10, String str) {
        this.f5566a = str;
        this.f5567b = j;
        this.f5568c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f5568c;
        String str = bVar.f5566a;
        String str2 = this.f5566a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f5567b != bVar.f5567b) {
            return false;
        }
        int i11 = this.f5568c;
        if (i11 == 0) {
            return i10 == 0;
        }
        return AbstractC0607v1.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f5566a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f5567b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i11 = this.f5568c;
        return (i11 != 0 ? AbstractC0607v1.b(i11) : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f5566a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f5567b);
        sb.append(", responseCode=");
        int i10 = this.f5568c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
