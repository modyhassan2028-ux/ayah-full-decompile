package E4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M3.a f1856d;

    public b(int i10, int i11, String str, M3.a aVar) {
        p251z9.j.e(str, "name");
        p251z9.j.e(aVar, "bookmarkColor");
        this.f1853a = i10;
        this.f1854b = i11;
        this.f1855c = str;
        this.f1856d = aVar;
    }

    @Override // E4.j
    public final int a() {
        return this.f1853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1853a == bVar.f1853a && this.f1854b == bVar.f1854b && p251z9.j.a(this.f1855c, bVar.f1855c) && this.f1856d == bVar.f1856d;
    }

    public final int hashCode() {
        return this.f1856d.hashCode() + p245z2.a.x(this.f1855c, ((this.f1853a * 31) + this.f1854b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbX = p123m2.c.x("Bookmark(ayahId=", this.f1853a, ", bookmarkedAyahId=", this.f1854b, ", name=");
        sbX.append(this.f1855c);
        sbX.append(", bookmarkColor=");
        sbX.append(this.f1856d);
        sbX.append(")");
        return sbX.toString();
    }
}
