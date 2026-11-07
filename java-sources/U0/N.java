package U0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0510b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8041a;

    public N(String str) {
        this.f8041a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return p251z9.j.a(this.f8041a, ((N) obj).f8041a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8041a.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f8041a, ')');
    }
}
