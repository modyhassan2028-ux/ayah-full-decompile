package z3;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.a f24799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p124m3.j f24800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24801c;

    public l(p124m3.a aVar, p124m3.j jVar, int i10) {
        this.f24799a = aVar;
        this.f24800b = jVar;
        this.f24801c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p251z9.j.a(this.f24799a, lVar.f24799a) && p251z9.j.a(this.f24800b, lVar.f24800b) && this.f24801c == lVar.f24801c;
    }

    public final int hashCode() {
        return ((this.f24800b.hashCode() + (this.f24799a.hashCode() * 31)) * 31) + this.f24801c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuraWithPageNumber(sura=");
        sb.append(this.f24799a);
        sb.append(", lastAyah=");
        sb.append(this.f24800b);
        sb.append(", pageNumber=");
        return p245z2.a.E(sb, this.f24801c, ")");
    }
}
