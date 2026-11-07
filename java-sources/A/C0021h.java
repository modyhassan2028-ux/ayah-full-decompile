package A;

import K9.C0389g;
import K9.C0401t;

/* JADX INFO: renamed from: A.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.d f246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0389g f247b;

    public C0021h(H.d dVar, C0389g c0389g) {
        this.f246a = dVar;
        this.f247b = c0389g;
    }

    public final String toString() {
        String strD;
        C0389g c0389g = this.f247b;
        C0401t c0401t = (C0401t) c0389g.f5365v.i(C0401t.f5395t);
        String str = c0401t != null ? c0401t.f5396s : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        F9.n.n(16);
        String string = Integer.toString(iHashCode, 16);
        p251z9.j.d(string, "toString(...)");
        sb.append(string);
        if (str == null || (strD = p245z2.a.D("[", str, "](")) == null) {
            strD = "(";
        }
        sb.append(strD);
        sb.append("currentBounds()=");
        sb.append(this.f246a.invoke());
        sb.append(", continuation=");
        sb.append(c0389g);
        sb.append(')');
        return sb.toString();
    }
}
