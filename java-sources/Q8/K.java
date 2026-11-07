package Q8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public static final J Companion = new J();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U9.a[] f6898d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f6900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6901c;

    static {
        Y9.Z z10 = Y9.Z.f10495a;
        f6898d = new U9.a[]{null, null, new Y9.D(B.f6882a)};
    }

    public /* synthetic */ K(int i10, P p10, j0 j0Var, Map map) {
        if (1 != (i10 & 1)) {
            Y9.M.e(i10, 1, I.f6897a.d());
            throw null;
        }
        this.f6899a = p10;
        if ((i10 & 2) == 0) {
            this.f6900b = null;
        } else {
            this.f6900b = j0Var;
        }
        if ((i10 & 4) == 0) {
            this.f6901c = null;
        } else {
            this.f6901c = map;
        }
    }

    public static K a(K k7, P p10, j0 j0Var, Map map, int i10) {
        if ((i10 & 1) != 0) {
            p10 = k7.f6899a;
        }
        if ((i10 & 2) != 0) {
            j0Var = k7.f6900b;
        }
        if ((i10 & 4) != 0) {
            map = k7.f6901c;
        }
        k7.getClass();
        p251z9.j.e(p10, "sessionDetails");
        return new K(p10, j0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return p251z9.j.a(this.f6899a, k7.f6899a) && p251z9.j.a(this.f6900b, k7.f6900b) && p251z9.j.a(this.f6901c, k7.f6901c);
    }

    public final int hashCode() {
        int iHashCode = this.f6899a.hashCode() * 31;
        j0 j0Var = this.f6900b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        Map map = this.f6901c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f6899a + ", backgroundTime=" + this.f6900b + ", processDataMap=" + this.f6901c + ')';
    }

    public K(P p10, j0 j0Var, Map map) {
        p251z9.j.e(p10, "sessionDetails");
        this.f6899a = p10;
        this.f6900b = j0Var;
        this.f6901c = map;
    }
}
