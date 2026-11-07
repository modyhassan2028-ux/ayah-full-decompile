package L6;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E6.j f5541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E6.i f5542c;

    public b(long j, E6.j jVar, E6.i iVar) {
        this.f5540a = j;
        this.f5541b = jVar;
        this.f5542c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5540a == bVar.f5540a && this.f5541b.equals(bVar.f5541b) && this.f5542c.equals(bVar.f5542c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5540a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5541b.hashCode()) * 1000003) ^ this.f5542c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5540a + ", transportContext=" + this.f5541b + ", event=" + this.f5542c + "}";
    }
}
