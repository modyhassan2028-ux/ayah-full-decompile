package W;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V.e f8849b;

    public U0(long j, V.e eVar) {
        this.f8848a = j;
        this.f8849b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u8 = (U0) obj;
        return p180s0.q.c(this.f8848a, u8.f8848a) && p251z9.j.a(this.f8849b, u8.f8849b);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        int iA = p110k9.t.a(this.f8848a) * 31;
        V.e eVar = this.f8849b;
        return iA + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        p123m2.c.A(this.f8848a, ", rippleAlpha=", sb);
        sb.append(this.f8849b);
        sb.append(')');
        return sb.toString();
    }
}
