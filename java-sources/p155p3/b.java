package p155p3;

import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20982c;

    public b(int i10, a aVar, String str) {
        j.e(str, "root");
        j.e(aVar, "reciterDao");
        this.f20980a = str;
        this.f20981b = aVar;
        this.f20982c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f20980a, bVar.f20980a) && j.a(this.f20981b, bVar.f20981b) && this.f20982c == bVar.f20982c;
    }

    public final int hashCode() {
        return ((this.f20981b.hashCode() + (this.f20980a.hashCode() * 31)) * 31) + this.f20982c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QariDownloadRequest(root=");
        sb.append(this.f20980a);
        sb.append(", reciterDao=");
        sb.append(this.f20981b);
        sb.append(", sura=");
        return p245z2.a.E(sb, this.f20982c, ")");
    }
}
