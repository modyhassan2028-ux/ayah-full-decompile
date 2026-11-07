package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16768d;

    public c(Object obj, String str, long j, long j10) {
        j.e(str, "url");
        this.f16765a = obj;
        this.f16766b = str;
        this.f16767c = j;
        this.f16768d = j10;
    }

    @Override // i6.g
    public final int a() {
        long j = this.f16768d;
        if (j > 0) {
            return (int) (((this.f16767c * 100.0f) / j) * 1.0f);
        }
        return -1;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16765a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f16765a, cVar.f16765a) && j.a(this.f16766b, cVar.f16766b) && this.f16767c == cVar.f16767c && this.f16768d == cVar.f16768d;
    }

    public final int hashCode() {
        Object obj = this.f16765a;
        int iX = p245z2.a.x(this.f16766b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
        long j = this.f16767c;
        long j10 = this.f16768d;
        return ((iX + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Downloading(request=" + this.f16765a + ", url=" + this.f16766b + ", downloaded=" + this.f16767c + ", total=" + this.f16768d + ")";
    }
}
