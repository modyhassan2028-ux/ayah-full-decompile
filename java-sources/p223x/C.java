package p223x;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC1421j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1432v f23820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23821b;

    public C(InterfaceC1432v interfaceC1432v, long j) {
        this.f23820a = interfaceC1432v;
        this.f23821b = j;
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        return new B0(this.f23820a.a(v0Var), this.f23821b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return c10.f23820a.equals(this.f23820a) && c10.f23821b == this.f23821b;
    }

    public final int hashCode() {
        int iHashCode = (N.f23862r.hashCode() + (this.f23820a.hashCode() * 31)) * 31;
        long j = this.f23821b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
