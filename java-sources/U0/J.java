package U0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f8030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f8031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f8032d;

    public J(C c10, C c11, C c12, C c13) {
        this.f8029a = c10;
        this.f8030b = c11;
        this.f8031c = c12;
        this.f8032d = c13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return p251z9.j.a(this.f8029a, j.f8029a) && p251z9.j.a(this.f8030b, j.f8030b) && p251z9.j.a(this.f8031c, j.f8031c) && p251z9.j.a(this.f8032d, j.f8032d);
    }

    public final int hashCode() {
        C c10 = this.f8029a;
        int iHashCode = (c10 != null ? c10.hashCode() : 0) * 31;
        C c11 = this.f8030b;
        int iHashCode2 = (iHashCode + (c11 != null ? c11.hashCode() : 0)) * 31;
        C c12 = this.f8031c;
        int iHashCode3 = (iHashCode2 + (c12 != null ? c12.hashCode() : 0)) * 31;
        C c13 = this.f8032d;
        return iHashCode3 + (c13 != null ? c13.hashCode() : 0);
    }
}
