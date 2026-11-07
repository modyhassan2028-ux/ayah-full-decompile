package E3;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1844d;

    public c(int i10, int i11, long j, String str) {
        j.e(str, "note");
        this.f1841a = i10;
        this.f1842b = i11;
        this.f1843c = str;
        this.f1844d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1841a == cVar.f1841a && this.f1842b == cVar.f1842b && j.a(this.f1843c, cVar.f1843c) && this.f1844d == cVar.f1844d;
    }

    public final int hashCode() {
        int iX = p245z2.a.x(this.f1843c, ((this.f1841a * 31) + this.f1842b) * 31, 31);
        long j = this.f1844d;
        return iX + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbX = p123m2.c.x("Note(id=", this.f1841a, ", ayahId=", this.f1842b, ", note=");
        sbX.append(this.f1843c);
        sbX.append(", timestamp=");
        sbX.append(this.f1844d);
        sbX.append(")");
        return sbX.toString();
    }
}
