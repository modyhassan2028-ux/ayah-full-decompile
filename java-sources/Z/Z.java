package Z;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10647a;

    public Z(String str) {
        this.f10647a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z) && p251z9.j.a(this.f10647a, ((Z) obj).f10647a);
    }

    public final int hashCode() {
        return this.f10647a.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("OpaqueKey(key="), this.f10647a, ')');
    }
}
