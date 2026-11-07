package p055f1;

import F9.n;
import p063g1.o;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f15924c = new r(n.B(0), n.B(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15926b;

    public r(long j, long j10) {
        this.f15925a = j;
        this.f15926b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return o.a(this.f15925a, rVar.f15925a) && o.a(this.f15926b, rVar.f15926b);
    }

    public final int hashCode() {
        return o.d(this.f15926b) + (o.d(this.f15925a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) o.e(this.f15925a)) + ", restLine=" + ((Object) o.e(this.f15926b)) + ')';
    }
}
