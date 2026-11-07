package p134n3;

import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19990c;

    public d(String str, int i10, int i11) {
        j.e(str, "text");
        this.f19988a = i10;
        this.f19989b = str;
        this.f19990c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19988a == dVar.f19988a && j.a(this.f19989b, dVar.f19989b) && this.f19990c == dVar.f19990c;
    }

    public final int hashCode() {
        return a.x(this.f19989b, this.f19988a * 31, 31) + this.f19990c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Footnote(pageNumber=");
        sb.append(this.f19988a);
        sb.append(", text=");
        sb.append(this.f19989b);
        sb.append(", verseId=");
        return a.E(sb, this.f19990c, ")");
    }
}
