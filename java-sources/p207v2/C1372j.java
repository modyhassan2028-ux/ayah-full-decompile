package p207v2;

/* JADX INFO: renamed from: v2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1372j extends AbstractC1373k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1372j f23255b = new C1372j(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1372j f23256c = new C1372j(false);

    public final boolean equals(Object obj) {
        if (obj instanceof C1372j) {
            return this.f23261a == ((C1372j) obj).f23261a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23261a ? 1231 : 1237;
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f23261a + ')';
    }
}
