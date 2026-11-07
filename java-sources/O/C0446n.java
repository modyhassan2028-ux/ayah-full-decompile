package O;

/* JADX INFO: renamed from: O.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0445m f6386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0445m f6387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6388c;

    public C0446n(C0445m c0445m, C0445m c0445m2, boolean z10) {
        this.f6386a = c0445m;
        this.f6387b = c0445m2;
        this.f6388c = z10;
    }

    public static C0446n a(C0446n c0446n, C0445m c0445m, C0445m c0445m2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            c0445m = c0446n.f6386a;
        }
        if ((i10 & 2) != 0) {
            c0445m2 = c0446n.f6387b;
        }
        c0446n.getClass();
        return new C0446n(c0445m, c0445m2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0446n)) {
            return false;
        }
        C0446n c0446n = (C0446n) obj;
        return p251z9.j.a(this.f6386a, c0446n.f6386a) && p251z9.j.a(this.f6387b, c0446n.f6387b) && this.f6388c == c0446n.f6388c;
    }

    public final int hashCode() {
        return ((this.f6387b.hashCode() + (this.f6386a.hashCode() * 31)) * 31) + (this.f6388c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.f6386a + ", end=" + this.f6387b + ", handlesCrossed=" + this.f6388c + ')';
    }
}
