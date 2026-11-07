package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f854c;

    public s(String str, boolean z10, Object obj) {
        this.f852a = str;
        this.f853b = z10;
        this.f854c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p251z9.j.a(this.f852a, sVar.f852a) && this.f853b == sVar.f853b && p251z9.j.a(this.f854c, sVar.f854c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f852a.hashCode() * 31) + (this.f853b ? 1231 : 1237)) * 31;
        Object obj = this.f854c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Extension(id=" + this.f852a + ", critical=" + this.f853b + ", value=" + this.f854c + ')';
    }
}
