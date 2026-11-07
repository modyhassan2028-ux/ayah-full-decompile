package p246z4;

import p251z9.j;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f24806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24809d;

    public a(k kVar, String str, int i10, int i11) {
        j.e(kVar, "ayah");
        j.e(str, "reciterId");
        this.f24806a = kVar;
        this.f24807b = str;
        this.f24808c = i10;
        this.f24809d = i11;
    }

    public static a a(a aVar, k kVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            kVar = aVar.f24806a;
        }
        String str = aVar.f24807b;
        if ((i12 & 8) != 0) {
            i11 = aVar.f24809d;
        }
        j.e(kVar, "ayah");
        j.e(str, "reciterId");
        return new a(kVar, str, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f24806a, aVar.f24806a) && j.a(this.f24807b, aVar.f24807b) && this.f24808c == aVar.f24808c && this.f24809d == aVar.f24809d;
    }

    public final int hashCode() {
        return ((p245z2.a.x(this.f24807b, this.f24806a.hashCode() * 31, 31) + this.f24808c) * 31) + this.f24809d;
    }

    public final String toString() {
        return "CurrentPlayback(ayah=" + this.f24806a + ", reciterId=" + this.f24807b + ", currentAyahPlayCount=" + this.f24808c + ", rangePlayCount=" + this.f24809d + ")";
    }
}
