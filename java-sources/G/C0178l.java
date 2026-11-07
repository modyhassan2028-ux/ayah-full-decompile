package G;

/* JADX INFO: renamed from: G.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0178l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2709b;

    public C0178l(int i10, int i11) {
        this.f2708a = i10;
        this.f2709b = i11;
        if (!(i10 >= 0)) {
            C.a.a("negative start index");
        }
        if (i11 >= i10) {
            return;
        }
        C.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0178l)) {
            return false;
        }
        C0178l c0178l = (C0178l) obj;
        return this.f2708a == c0178l.f2708a && this.f2709b == c0178l.f2709b;
    }

    public final int hashCode() {
        return (this.f2708a * 31) + this.f2709b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f2708a);
        sb.append(", end=");
        return android.support.v4.media.session.p.A(sb, this.f2709b, ')');
    }
}
