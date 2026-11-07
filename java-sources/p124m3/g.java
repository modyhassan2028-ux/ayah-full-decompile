package p124m3;

import java.util.ArrayList;
import java.util.List;
import p123m2.c;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f19572f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19574i;

    public g(int i10, int i11, String str, String str2, ArrayList arrayList, ArrayList arrayList2, List list, int i12, int i13) {
        j.e(str, "arabicTitle");
        j.e(str2, "englishTitle");
        this.f19567a = i10;
        this.f19568b = i11;
        this.f19569c = str;
        this.f19570d = str2;
        this.f19571e = arrayList;
        this.f19572f = arrayList2;
        this.g = list;
        this.f19573h = i12;
        this.f19574i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19567a == gVar.f19567a && this.f19568b == gVar.f19568b && j.a(this.f19569c, gVar.f19569c) && j.a(this.f19570d, gVar.f19570d) && this.f19571e.equals(gVar.f19571e) && this.f19572f.equals(gVar.f19572f) && this.g.equals(gVar.g) && this.f19573h == gVar.f19573h && this.f19574i == gVar.f19574i;
    }

    public final int hashCode() {
        return ((((this.g.hashCode() + ((this.f19572f.hashCode() + ((this.f19571e.hashCode() + a.x(this.f19570d, a.x(this.f19569c, ((this.f19567a * 31) + this.f19568b) * 31, 31), 31)) * 31)) * 31)) * 31) + this.f19573h) * 31) + this.f19574i;
    }

    public final String toString() {
        StringBuilder sbX = c.x("PartDao(identifier=", this.f19567a, ", number=", this.f19568b, ", arabicTitle=");
        a.I(sbX, this.f19569c, ", englishTitle=", this.f19570d, ", chapters=");
        sbX.append(this.f19571e);
        sbX.append(", quarters=");
        sbX.append(this.f19572f);
        sbX.append(", verses=");
        sbX.append(this.g);
        sbX.append(", startingAyahId=");
        sbX.append(this.f19573h);
        sbX.append(", startingAyahPageNumber=");
        return a.E(sbX, this.f19574i, ")");
    }
}
