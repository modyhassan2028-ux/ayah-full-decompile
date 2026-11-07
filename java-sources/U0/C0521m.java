package U0;

/* JADX INFO: renamed from: U0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0521m extends AbstractC0522n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f8100b;

    public C0521m(String str, J j) {
        this.f8099a = str;
        this.f8100b = j;
    }

    @Override // U0.AbstractC0522n
    public final J a() {
        return this.f8100b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521m)) {
            return false;
        }
        C0521m c0521m = (C0521m) obj;
        return p251z9.j.a(this.f8099a, c0521m.f8099a) && p251z9.j.a(this.f8100b, c0521m.f8100b);
    }

    public final int hashCode() {
        int iHashCode = this.f8099a.hashCode() * 31;
        J j = this.f8100b;
        return (iHashCode + (j != null ? j.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("LinkAnnotation.Url(url="), this.f8099a, ')');
    }
}
