package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f810b;

    public f(Object obj, String str) {
        this.f809a = str;
        this.f810b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p251z9.j.a(this.f809a, fVar.f809a) && p251z9.j.a(this.f810b, fVar.f810b);
    }

    public final int hashCode() {
        int iHashCode = this.f809a.hashCode() * 31;
        Object obj = this.f810b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "AttributeTypeAndValue(type=" + this.f809a + ", value=" + this.f810b + ')';
    }
}
