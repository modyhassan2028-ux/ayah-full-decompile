package E4;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.k f1868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3.k f1869c;

    public g(int i10, z3.k kVar, z3.k kVar2) {
        this.f1867a = i10;
        this.f1868b = kVar;
        this.f1869c = kVar2;
    }

    @Override // E4.j
    public final int a() {
        return this.f1867a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1867a == gVar.f1867a && p251z9.j.a(this.f1868b, gVar.f1868b) && p251z9.j.a(this.f1869c, gVar.f1869c);
    }

    public final int hashCode() {
        return this.f1869c.hashCode() + ((this.f1868b.hashCode() + (this.f1867a * 31)) * 31);
    }

    public final String toString() {
        return "PlayRange(ayahId=" + this.f1867a + ", start=" + this.f1868b + ", end=" + this.f1869c + ")";
    }
}
