package B6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f642b;

    public a(Object obj, c cVar) {
        this.f641a = obj;
        this.f642b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f641a.equals(aVar.f641a) && this.f642b.equals(aVar.f642b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f642b.hashCode() ^ (((1000003 * 1000003) ^ this.f641a.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f641a + ", priority=" + this.f642b + ", productData=null, eventContext=null}";
    }
}
