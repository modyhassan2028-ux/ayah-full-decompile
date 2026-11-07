package U0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0510b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8012a;

    public /* synthetic */ F(String str) {
        this.f8012a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            return p251z9.j.a(this.f8012a, ((F) obj).f8012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8012a.hashCode();
    }

    public final String toString() {
        return p245z2.a.A(')', "StringAnnotation(value=", this.f8012a);
    }
}
