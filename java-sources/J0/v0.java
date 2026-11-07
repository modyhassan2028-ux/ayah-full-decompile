package J0;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements s0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final H0.J f4180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P f4181s;

    public v0(H0.J j, P p10) {
        this.f4180r = j;
        this.f4181s = p10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return p251z9.j.a(this.f4180r, v0Var.f4180r) && p251z9.j.a(this.f4181s, v0Var.f4181s);
    }

    public final int hashCode() {
        return this.f4181s.hashCode() + (this.f4180r.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f4180r + ", placeable=" + this.f4181s + ')';
    }

    @Override // J0.s0
    public final boolean x() {
        return this.f4181s.k0().C();
    }
}
