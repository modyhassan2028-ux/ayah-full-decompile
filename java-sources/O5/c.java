package O5;

import F9.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.a f6495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p065g3.a f6496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f6497c;

    public c(p124m3.a aVar, p065g3.a aVar2, n nVar) {
        this.f6495a = aVar;
        this.f6496b = aVar2;
        this.f6497c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f6495a, cVar.f6495a) && j.a(this.f6496b, cVar.f6496b) && j.a(this.f6497c, cVar.f6497c);
    }

    public final int hashCode() {
        return this.f6497c.hashCode() + ((this.f6496b.hashCode() + (this.f6495a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SuraRow(sura=" + this.f6495a + ", reciterDao=" + this.f6496b + ", downloadStatus=" + this.f6497c + ")";
    }
}
