package U0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f8015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f8016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8020f;
    public final p063g1.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p063g1.m f8021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y0.d f8022i;
    public final long j;

    public H(C0515g c0515g, L l10, List list, int i10, boolean z10, int i11, p063g1.c cVar, p063g1.m mVar, Y0.d dVar, long j) {
        this.f8015a = c0515g;
        this.f8016b = l10;
        this.f8017c = list;
        this.f8018d = i10;
        this.f8019e = z10;
        this.f8020f = i11;
        this.g = cVar;
        this.f8021h = mVar;
        this.f8022i = dVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h7 = (H) obj;
        return p251z9.j.a(this.f8015a, h7.f8015a) && p251z9.j.a(this.f8016b, h7.f8016b) && p251z9.j.a(this.f8017c, h7.f8017c) && this.f8018d == h7.f8018d && this.f8019e == h7.f8019e && this.f8020f == h7.f8020f && p251z9.j.a(this.g, h7.g) && this.f8021h == h7.f8021h && p251z9.j.a(this.f8022i, h7.f8022i) && p063g1.a.b(this.j, h7.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f8022i.hashCode() + ((this.f8021h.hashCode() + ((this.g.hashCode() + ((((((((this.f8017c.hashCode() + ((this.f8016b.hashCode() + (this.f8015a.hashCode() * 31)) * 31)) * 31) + this.f8018d) * 31) + (this.f8019e ? 1231 : 1237)) * 31) + this.f8020f) * 31)) * 31)) * 31)) * 31;
        long j = this.j;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f8015a);
        sb.append(", style=");
        sb.append(this.f8016b);
        sb.append(", placeholders=");
        sb.append(this.f8017c);
        sb.append(", maxLines=");
        sb.append(this.f8018d);
        sb.append(", softWrap=");
        sb.append(this.f8019e);
        sb.append(", overflow=");
        int i10 = this.f8020f;
        if (i10 == 1) {
            str = "Clip";
        } else if (i10 == 2) {
            str = "Ellipsis";
        } else if (i10 == 5) {
            str = "MiddleEllipsis";
        } else if (i10 == 3) {
            str = "Visible";
        } else {
            str = i10 == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.f8021h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f8022i);
        sb.append(", constraints=");
        sb.append((Object) p063g1.a.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
