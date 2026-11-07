package k3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f18973a;

    public f(a aVar) {
        this.f18973a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f18973a == ((f) obj).f18973a;
    }

    public final int hashCode() {
        return this.f18973a.hashCode();
    }

    public final String toString() {
        return "AppType(type=" + this.f18973a + ")";
    }
}
