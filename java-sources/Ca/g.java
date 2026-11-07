package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f812b;

    public g(Long l10, boolean z10) {
        this.f811a = z10;
        this.f812b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f811a == gVar.f811a && p251z9.j.a(this.f812b, gVar.f812b);
    }

    public final int hashCode() {
        int i10 = (this.f811a ? 1231 : 1237) * 31;
        Long l10 = this.f812b;
        return i10 + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "BasicConstraints(ca=" + this.f811a + ", maxIntermediateCas=" + this.f812b + ')';
    }
}
