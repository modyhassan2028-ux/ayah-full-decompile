package Z;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10629b;

    public N(Integer num, Object obj) {
        this.f10628a = num;
        this.f10629b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return this.f10628a.equals(n6.f10628a) && p251z9.j.a(this.f10629b, n6.f10629b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f10628a.hashCode() * 31;
        Object obj = this.f10629b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f10628a + ", right=" + this.f10629b + ')';
    }
}
