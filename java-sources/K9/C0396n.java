package K9;

/* JADX INFO: renamed from: K9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0387e f5380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p241y9.f f5381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f5383e;

    public C0396n(Object obj, C0387e c0387e, p241y9.f fVar, Object obj2, Throwable th) {
        this.f5379a = obj;
        this.f5380b = c0387e;
        this.f5381c = fVar;
        this.f5382d = obj2;
        this.f5383e = th;
    }

    public static C0396n a(C0396n c0396n, C0387e c0387e, Throwable th, int i10) {
        Object obj = c0396n.f5379a;
        if ((i10 & 2) != 0) {
            c0387e = c0396n.f5380b;
        }
        C0387e c0387e2 = c0387e;
        p241y9.f fVar = c0396n.f5381c;
        Object obj2 = c0396n.f5382d;
        if ((i10 & 16) != 0) {
            th = c0396n.f5383e;
        }
        return new C0396n(obj, c0387e2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0396n)) {
            return false;
        }
        C0396n c0396n = (C0396n) obj;
        return p251z9.j.a(this.f5379a, c0396n.f5379a) && p251z9.j.a(this.f5380b, c0396n.f5380b) && p251z9.j.a(this.f5381c, c0396n.f5381c) && p251z9.j.a(this.f5382d, c0396n.f5382d) && p251z9.j.a(this.f5383e, c0396n.f5383e);
    }

    public final int hashCode() {
        Object obj = this.f5379a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0387e c0387e = this.f5380b;
        int iHashCode2 = (iHashCode + (c0387e == null ? 0 : c0387e.hashCode())) * 31;
        p241y9.f fVar = this.f5381c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f5382d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5383e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f5379a + ", cancelHandler=" + this.f5380b + ", onCancellation=" + this.f5381c + ", idempotentResume=" + this.f5382d + ", cancelCause=" + this.f5383e + ')';
    }

    public /* synthetic */ C0396n(Object obj, C0387e c0387e, p241y9.f fVar, Throwable th, int i10) {
        this(obj, (i10 & 2) != 0 ? null : c0387e, (i10 & 4) != 0 ? null : fVar, (Object) null, (i10 & 16) != 0 ? null : th);
    }
}
