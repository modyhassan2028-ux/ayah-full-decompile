package p223x;

import p251z9.j;

/* JADX INFO: renamed from: x.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1410b0 implements InterfaceC1421j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1421j f23939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23940b;

    public C1410b0(InterfaceC1435y interfaceC1435y, long j) {
        this.f23939a = interfaceC1435y;
        this.f23940b = j;
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        return new C1412c0(this.f23939a.a(v0Var), this.f23940b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1410b0)) {
            return false;
        }
        C1410b0 c1410b0 = (C1410b0) obj;
        return c1410b0.f23940b == this.f23940b && j.a(c1410b0.f23939a, this.f23939a);
    }

    public final int hashCode() {
        int iHashCode = this.f23939a.hashCode() * 31;
        long j = this.f23940b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
