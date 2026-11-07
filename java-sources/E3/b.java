package E3;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1840c;

    public b(int i10, int i11, long j) {
        this.f1838a = i10;
        this.f1839b = i11;
        this.f1840c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1838a == bVar.f1838a && this.f1839b == bVar.f1839b && this.f1840c == bVar.f1840c;
    }

    public final int hashCode() {
        int i10 = ((this.f1838a * 31) + this.f1839b) * 31;
        long j = this.f1840c;
        return i10 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return p.x(this.f1840c, ")", p123m2.c.x("Favorite(id=", this.f1838a, ", ayahId=", this.f1839b, ", timestamp="));
    }
}
