package M9;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5874a;

    public j(Throwable th) {
        this.f5874a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return p251z9.j.a(this.f5874a, ((j) obj).f5874a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f5874a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // M9.k
    public final String toString() {
        return "Closed(" + this.f5874a + ')';
    }
}
