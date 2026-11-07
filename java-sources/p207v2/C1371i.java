package p207v2;

/* JADX INFO: renamed from: v2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1371i extends AbstractC1373k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1371i f23250b = new C1371i(false);

    public final boolean equals(Object obj) {
        if (obj instanceof C1371i) {
            return this.f23261a == ((C1371i) obj).f23261a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23261a ? 1231 : 1237;
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f23261a + ')';
    }
}
