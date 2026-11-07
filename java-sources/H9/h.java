package H9;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E9.d f3631b;

    public h(String str, E9.d dVar) {
        this.f3630a = str;
        this.f3631b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p251z9.j.a(this.f3630a, hVar.f3630a) && p251z9.j.a(this.f3631b, hVar.f3631b);
    }

    public final int hashCode() {
        return this.f3631b.hashCode() + (this.f3630a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f3630a + ", range=" + this.f3631b + ')';
    }
}
