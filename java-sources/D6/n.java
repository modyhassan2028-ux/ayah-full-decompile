package D6;

/* JADX INFO: loaded from: classes.dex */
public final class n extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1302a;

    public n(l lVar) {
        this.f1302a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        Object obj2 = y.f1333r;
        if (obj2.equals(obj2)) {
            return this.f1302a.equals(((n) zVar).f1302a);
        }
        return false;
    }

    public final int hashCode() {
        return ((y.f1333r.hashCode() ^ 1000003) * 1000003) ^ this.f1302a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + y.f1333r + ", androidClientInfo=" + this.f1302a + "}";
    }
}
