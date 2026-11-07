package r5;

import p124m3.d;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p077h3.b f21569c;

    public a(int i10, d dVar, p077h3.b bVar) {
        this.f21567a = i10;
        this.f21568b = dVar;
        this.f21569c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21567a == aVar.f21567a && j.a(this.f21568b, aVar.f21568b) && j.a(this.f21569c, aVar.f21569c);
    }

    public final int hashCode() {
        int iHashCode = (this.f21568b.hashCode() + (this.f21567a * 31)) * 31;
        p077h3.b bVar = this.f21569c;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "HistoryItem(page=" + this.f21567a + ", pageDao=" + this.f21568b + ", bookmarkInfo=" + this.f21569c + ")";
    }
}
