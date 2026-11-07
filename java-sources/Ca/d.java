package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f803b;

    public d(Object obj, String str) {
        this.f802a = str;
        this.f803b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p251z9.j.a(this.f802a, dVar.f802a) && p251z9.j.a(this.f803b, dVar.f803b);
    }

    public final int hashCode() {
        int iHashCode = this.f802a.hashCode() * 31;
        Object obj = this.f803b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "AlgorithmIdentifier(algorithm=" + this.f802a + ", parameters=" + this.f803b + ')';
    }
}
