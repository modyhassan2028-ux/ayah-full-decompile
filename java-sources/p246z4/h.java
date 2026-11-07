package p246z4;

import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24820c;

    public h(int i10, a aVar, String str) {
        j.e(aVar, "reciter");
        this.f24818a = aVar;
        this.f24819b = str;
        this.f24820c = i10;
    }

    @Override // p246z4.j
    public final a a() {
        return this.f24818a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j.a(this.f24818a, hVar.f24818a) && j.a(this.f24819b, hVar.f24819b) && this.f24820c == hVar.f24820c;
    }

    public final int hashCode() {
        return p245z2.a.x(this.f24819b, this.f24818a.hashCode() * 31, 31) + this.f24820c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalFile(reciter=");
        sb.append(this.f24818a);
        sb.append(", path=");
        sb.append(this.f24819b);
        sb.append(", timestamp=");
        return p245z2.a.E(sb, this.f24820c, ")");
    }
}
