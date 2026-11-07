package U0;

/* JADX INFO: renamed from: U0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0520l extends AbstractC0522n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f8098b;

    public C0520l(String str, J j) {
        this.f8097a = str;
        this.f8098b = j;
    }

    @Override // U0.AbstractC0522n
    public final J a() {
        return this.f8098b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0520l)) {
            return false;
        }
        C0520l c0520l = (C0520l) obj;
        return p251z9.j.a(this.f8097a, c0520l.f8097a) && p251z9.j.a(this.f8098b, c0520l.f8098b);
    }

    public final int hashCode() {
        int iHashCode = this.f8097a.hashCode() * 31;
        J j = this.f8098b;
        return (iHashCode + (j != null ? j.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f8097a, ')');
    }
}
