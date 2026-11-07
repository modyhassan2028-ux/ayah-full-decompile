package oa;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f20475c;

    public /* synthetic */ r(s sVar, Throwable th, int i10) {
        this(sVar, (d) null, (i10 & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p251z9.j.a(this.f20473a, rVar.f20473a) && p251z9.j.a(this.f20474b, rVar.f20474b) && p251z9.j.a(this.f20475c, rVar.f20475c);
    }

    public final int hashCode() {
        int iHashCode = this.f20473a.hashCode() * 31;
        s sVar = this.f20474b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Throwable th = this.f20475c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f20473a + ", nextPlan=" + this.f20474b + ", throwable=" + this.f20475c + ')';
    }

    public r(s sVar, d dVar, Throwable th) {
        this.f20473a = sVar;
        this.f20474b = dVar;
        this.f20475c = th;
    }
}
