package U0;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC0510b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8040a;

    public M(String str) {
        this.f8040a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return p251z9.j.a(this.f8040a, ((M) obj).f8040a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8040a.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("UrlAnnotation(url="), this.f8040a, ')');
    }
}
