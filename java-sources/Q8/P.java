package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    public static final O Companion = new O();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6909d;

    public /* synthetic */ P(int i10, String str, String str2, int i11, long j) {
        if (15 != (i10 & 15)) {
            Y9.M.e(i10, 15, N.f6905a.d());
            throw null;
        }
        this.f6906a = str;
        this.f6907b = str2;
        this.f6908c = i11;
        this.f6909d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return p251z9.j.a(this.f6906a, p10.f6906a) && p251z9.j.a(this.f6907b, p10.f6907b) && this.f6908c == p10.f6908c && this.f6909d == p10.f6909d;
    }

    public final int hashCode() {
        int iX = (p245z2.a.x(this.f6907b, this.f6906a.hashCode() * 31, 31) + this.f6908c) * 31;
        long j = this.f6909d;
        return iX + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f6906a + ", firstSessionId=" + this.f6907b + ", sessionIndex=" + this.f6908c + ", sessionStartTimestampUs=" + this.f6909d + ')';
    }

    public P(int i10, long j, String str, String str2) {
        this.f6906a = str;
        this.f6907b = str2;
        this.f6908c = i10;
        this.f6909d = j;
    }
}
