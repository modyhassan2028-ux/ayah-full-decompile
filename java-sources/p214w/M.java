package p214w;

import p063g1.l;
import p223x.C1411c;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1411c f23449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23450b;

    public M(C1411c c1411c, long j) {
        this.f23449a = c1411c;
        this.f23450b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return this.f23449a.equals(m10.f23449a) && l.a(this.f23450b, m10.f23450b);
    }

    public final int hashCode() {
        int iHashCode = this.f23449a.hashCode() * 31;
        long j = this.f23450b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.f23449a + ", startSize=" + ((Object) l.b(this.f23450b)) + ')';
    }
}
