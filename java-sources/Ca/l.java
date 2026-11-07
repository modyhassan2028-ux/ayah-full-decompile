package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f827c;

    public l(v vVar, d dVar, k kVar) {
        this.f825a = vVar;
        this.f826b = dVar;
        this.f827c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p251z9.j.a(this.f825a, lVar.f825a) && p251z9.j.a(this.f826b, lVar.f826b) && p251z9.j.a(this.f827c, lVar.f827c);
    }

    public final int hashCode() {
        return this.f827c.hashCode() + ((this.f826b.hashCode() + (this.f825a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Certificate(tbsCertificate=" + this.f825a + ", signatureAlgorithm=" + this.f826b + ", signatureValue=" + this.f827c + ')';
    }
}
