package p246z4;

import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p124m3.a f24824d;

    public i(a aVar, String str, String str2, p124m3.a aVar2) {
        j.e(aVar, "reciter");
        j.e(str, "url");
        this.f24821a = aVar;
        this.f24822b = str;
        this.f24823c = str2;
        this.f24824d = aVar2;
    }

    @Override // p246z4.j
    public final a a() {
        return this.f24821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return j.a(this.f24821a, iVar.f24821a) && j.a(this.f24822b, iVar.f24822b) && j.a(this.f24823c, iVar.f24823c) && j.a(this.f24824d, iVar.f24824d);
    }

    public final int hashCode() {
        return this.f24824d.hashCode() + p245z2.a.x(this.f24823c, p245z2.a.x(this.f24822b, this.f24821a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Url(reciter=" + this.f24821a + ", url=" + this.f24822b + ", path=" + this.f24823c + ", sura=" + this.f24824d + ")";
    }
}
