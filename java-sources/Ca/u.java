package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f859b;

    public u(d dVar, k kVar) {
        this.f858a = dVar;
        this.f859b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p251z9.j.a(this.f858a, uVar.f858a) && p251z9.j.a(this.f859b, uVar.f859b);
    }

    public final int hashCode() {
        return this.f859b.hashCode() + (this.f858a.hashCode() * 31);
    }

    public final String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.f858a + ", subjectPublicKey=" + this.f859b + ')';
    }
}
