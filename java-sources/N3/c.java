package N3;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M3.a f6008b;

    public c(String str, M3.a aVar) {
        j.e(str, "name");
        this.f6007a = str;
        this.f6008b = aVar;
    }

    @Override // N3.a
    public final M3.a a() {
        return this.f6008b;
    }

    @Override // N3.a
    public final String b() {
        return this.f6007a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f6007a, cVar.f6007a) && this.f6008b == cVar.f6008b;
    }

    public final int hashCode() {
        return this.f6008b.hashCode() + (this.f6007a.hashCode() * 31);
    }

    public final String toString() {
        return "NonBookmarkedRow(name=" + this.f6007a + ", color=" + this.f6008b + ")";
    }
}
