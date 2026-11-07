package Z;

/* JADX INFO: renamed from: Z.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0704u f10809a;

    public C0703t(C0704u c0704u) {
        this.f10809a = c0704u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0703t) {
            return this.f10809a.equals(((C0703t) obj).f10809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10809a.hashCode() * 31;
    }
}
