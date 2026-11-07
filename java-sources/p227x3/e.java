package p227x3;

import android.support.v4.media.session.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24373c;

    public e(long j, String str, boolean z10) {
        this.f24371a = str;
        this.f24372b = z10;
        this.f24373c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f24371a, eVar.f24371a) && this.f24372b == eVar.f24372b && this.f24373c == eVar.f24373c;
    }

    public final int hashCode() {
        int iHashCode = this.f24371a.hashCode() * 31;
        int i10 = this.f24372b ? 1231 : 1237;
        long j = this.f24373c;
        return ((iHashCode + i10) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionsResult(permission=");
        sb.append(this.f24371a);
        sb.append(", accepted=");
        sb.append(this.f24372b);
        sb.append(", timestamp=");
        return p.x(this.f24373c, ")", sb);
    }
}
