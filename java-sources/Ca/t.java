package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Da.k f857c;

    public t(long j, d dVar, Da.k kVar) {
        this.f855a = j;
        this.f856b = dVar;
        this.f857c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f855a == tVar.f855a && p251z9.j.a(this.f856b, tVar.f856b) && p251z9.j.a(this.f857c, tVar.f857c);
    }

    public final int hashCode() {
        return this.f857c.hashCode() + ((this.f856b.hashCode() + (((int) this.f855a) * 31)) * 31);
    }

    public final String toString() {
        return "PrivateKeyInfo(version=" + this.f855a + ", algorithmIdentifier=" + this.f856b + ", privateKey=" + this.f857c + ')';
    }
}
