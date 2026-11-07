package p077h3;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16445b;

    public b(a aVar, int i10) {
        this.f16444a = aVar;
        this.f16445b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f16444a, bVar.f16444a) && this.f16445b == bVar.f16445b;
    }

    public final int hashCode() {
        return (this.f16444a.hashCode() * 31) + this.f16445b;
    }

    public final String toString() {
        return "BookmarkPageWrapper(bookmark=" + this.f16444a + ", page=" + this.f16445b + ")";
    }
}
