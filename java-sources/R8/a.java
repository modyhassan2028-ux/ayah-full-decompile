package R8;

import p160p8.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S9.c f7393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f7394b = null;

    public a(S9.c cVar) {
        this.f7393a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7393a.equals(aVar.f7393a) && p251z9.j.a(this.f7394b, aVar.f7394b);
    }

    public final int hashCode() {
        int iHashCode = this.f7393a.hashCode() * 31;
        j jVar = this.f7394b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f7393a + ", subscriber=" + this.f7394b + ')';
    }
}
