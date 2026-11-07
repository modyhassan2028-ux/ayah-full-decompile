package D6;

/* JADX INFO: loaded from: classes.dex */
public final class r extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1307a;

    public r(q qVar) {
        this.f1307a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        return this.f1307a.equals(((r) ((E) obj)).f1307a);
    }

    public final int hashCode() {
        return this.f1307a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f1307a + "}";
    }
}
