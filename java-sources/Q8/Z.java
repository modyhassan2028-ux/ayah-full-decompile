package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0464k f6939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6940f;
    public final String g;

    public Z(String str, String str2, int i10, long j, C0464k c0464k, String str3, String str4) {
        p251z9.j.e(str, "sessionId");
        p251z9.j.e(str2, "firstSessionId");
        p251z9.j.e(str4, "firebaseAuthenticationToken");
        this.f6935a = str;
        this.f6936b = str2;
        this.f6937c = i10;
        this.f6938d = j;
        this.f6939e = c0464k;
        this.f6940f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return p251z9.j.a(this.f6935a, z10.f6935a) && p251z9.j.a(this.f6936b, z10.f6936b) && this.f6937c == z10.f6937c && this.f6938d == z10.f6938d && p251z9.j.a(this.f6939e, z10.f6939e) && p251z9.j.a(this.f6940f, z10.f6940f) && p251z9.j.a(this.g, z10.g);
    }

    public final int hashCode() {
        int iX = (p245z2.a.x(this.f6936b, this.f6935a.hashCode() * 31, 31) + this.f6937c) * 31;
        long j = this.f6938d;
        return this.g.hashCode() + p245z2.a.x(this.f6940f, (this.f6939e.hashCode() + ((iX + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f6935a);
        sb.append(", firstSessionId=");
        sb.append(this.f6936b);
        sb.append(", sessionIndex=");
        sb.append(this.f6937c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f6938d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f6939e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f6940f);
        sb.append(", firebaseAuthenticationToken=");
        return p245z2.a.F(sb, this.g, ')');
    }
}
