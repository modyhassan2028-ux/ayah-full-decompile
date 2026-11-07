package p185s8;

import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22291e;

    public Y(long j, String str, String str2, long j10, int i10) {
        this.f22287a = j;
        this.f22288b = str;
        this.f22289c = str2;
        this.f22290d = j10;
        this.f22291e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            Y y10 = (Y) ((A0) obj);
            String str2 = y10.f22289c;
            if (this.f22287a == y10.f22287a && this.f22288b.equals(y10.f22288b) && ((str = this.f22289c) != null ? str.equals(str2) : str2 == null) && this.f22290d == y10.f22290d && this.f22291e == y10.f22291e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22287a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22288b.hashCode()) * 1000003;
        String str = this.f22289c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f22290d;
        return ((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f22291e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f22287a);
        sb.append(", symbol=");
        sb.append(this.f22288b);
        sb.append(", file=");
        sb.append(this.f22289c);
        sb.append(", offset=");
        sb.append(this.f22290d);
        sb.append(", importance=");
        return a.E(sb, this.f22291e, "}");
    }
}
