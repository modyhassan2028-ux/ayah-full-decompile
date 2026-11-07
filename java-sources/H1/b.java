package H1;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3242b;

    public b(Object obj, Object obj2) {
        this.f3241a = obj;
        this.f3242b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f3241a, this.f3241a) && Objects.equals(bVar.f3242b, this.f3242b);
    }

    public final int hashCode() {
        Object obj = this.f3241a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3242b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f3241a + " " + this.f3242b + "}";
    }
}
