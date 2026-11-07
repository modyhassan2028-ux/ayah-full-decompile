package D6;

/* JADX INFO: loaded from: classes.dex */
public final class o extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1303a;

    public o(r rVar) {
        A a9 = A.f1239r;
        this.f1303a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        if (!this.f1303a.equals(((o) ((B) obj)).f1303a)) {
            return false;
        }
        Object obj2 = A.f1239r;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f1303a.hashCode() ^ 1000003) * 1000003) ^ A.f1239r.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f1303a + ", productIdOrigin=" + A.f1239r + "}";
    }
}
