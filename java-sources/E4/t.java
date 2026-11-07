package E4;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.j f1884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final va.g f1885b;

    public t(p124m3.j jVar, va.g gVar) {
        p251z9.j.e(jVar, "currentAyah");
        this.f1884a = jVar;
        this.f1885b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p251z9.j.a(this.f1884a, tVar.f1884a) && p251z9.j.a(this.f1885b, tVar.f1885b);
    }

    public final int hashCode() {
        return this.f1885b.hashCode() + (this.f1884a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayUntilDetailsModel(currentAyah=" + this.f1884a + ", playUntil=" + this.f1885b + ")";
    }
}
