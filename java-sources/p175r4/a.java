package p175r4;

import java.io.Serializable;
import p251z9.j;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f21553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f21554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f21556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f21557v;

    public a(k kVar, k kVar2, String str, int i10, int i11) {
        j.e(kVar, "startAyah");
        j.e(kVar2, "endAyah");
        j.e(str, "reciterId");
        this.f21553r = kVar;
        this.f21554s = kVar2;
        this.f21555t = str;
        this.f21556u = i10;
        this.f21557v = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f21553r, aVar.f21553r) && j.a(this.f21554s, aVar.f21554s) && j.a(this.f21555t, aVar.f21555t) && this.f21556u == aVar.f21556u && this.f21557v == aVar.f21557v;
    }

    public final int hashCode() {
        return ((p245z2.a.x(this.f21555t, (this.f21554s.hashCode() + (this.f21553r.hashCode() * 31)) * 31, 31) + this.f21556u) * 31) + this.f21557v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRequest(startAyah=");
        sb.append(this.f21553r);
        sb.append(", endAyah=");
        sb.append(this.f21554s);
        sb.append(", reciterId=");
        sb.append(this.f21555t);
        sb.append(", playCount=");
        sb.append(this.f21556u);
        sb.append(", rangePlayCount=");
        return p245z2.a.E(sb, this.f21557v, ")");
    }
}
