package O;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K.K f6426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f6428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6429d;

    public x(K.K k7, long j, w wVar, boolean z10) {
        this.f6426a = k7;
        this.f6427b = j;
        this.f6428c = wVar;
        this.f6429d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f6426a == xVar.f6426a && p171r0.c.b(this.f6427b, xVar.f6427b) && this.f6428c == xVar.f6428c && this.f6429d == xVar.f6429d;
    }

    public final int hashCode() {
        return ((this.f6428c.hashCode() + ((p171r0.c.f(this.f6427b) + (this.f6426a.hashCode() * 31)) * 31)) * 31) + (this.f6429d ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f6426a + ", position=" + ((Object) p171r0.c.j(this.f6427b)) + ", anchor=" + this.f6428c + ", visible=" + this.f6429d + ')';
    }
}
