package p065g3;

import java.util.List;
import p125m4.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16278f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16280i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f16281k;

    public a(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        j.e(str, "reciterId");
        j.e(str2, "category");
        j.e(str3, "arabicTitle");
        j.e(str4, "englishTitle");
        j.e(str9, "searchableText");
        this.f16273a = str;
        this.f16274b = z10;
        this.f16275c = str2;
        this.f16276d = str3;
        this.f16277e = str4;
        this.f16278f = str5;
        this.g = str6;
        this.f16279h = str7;
        this.f16280i = str8;
        this.j = str9;
        this.f16281k = list;
    }

    public final String a() {
        return b.b() ? this.f16276d : this.f16277e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f16273a, aVar.f16273a) && this.f16274b == aVar.f16274b && j.a(this.f16275c, aVar.f16275c) && j.a(this.f16276d, aVar.f16276d) && j.a(this.f16277e, aVar.f16277e) && j.a(this.f16278f, aVar.f16278f) && j.a(this.g, aVar.g) && j.a(this.f16279h, aVar.f16279h) && j.a(this.f16280i, aVar.f16280i) && j.a(this.j, aVar.j) && j.a(this.f16281k, aVar.f16281k);
    }

    public final int hashCode() {
        int iX = p245z2.a.x(this.f16277e, p245z2.a.x(this.f16276d, p245z2.a.x(this.f16275c, ((this.f16273a.hashCode() * 31) + (this.f16274b ? 1231 : 1237)) * 31, 31), 31), 31);
        String str = this.f16278f;
        int iHashCode = (iX + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16279h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16280i;
        return this.f16281k.hashCode() + p245z2.a.x(this.j, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterDao(reciterId=");
        sb.append(this.f16273a);
        sb.append(", isPrivate=");
        sb.append(this.f16274b);
        sb.append(", category=");
        p245z2.a.I(sb, this.f16275c, ", arabicTitle=", this.f16276d, ", englishTitle=");
        p245z2.a.I(sb, this.f16277e, ", arabicSubtitle=", this.f16278f, ", englishSubtitle=");
        p245z2.a.I(sb, this.g, ", arabicInfo=", this.f16279h, ", englishInfo=");
        p245z2.a.I(sb, this.f16280i, ", searchableText=", this.j, ", tracks=");
        sb.append(this.f16281k);
        sb.append(")");
        return sb.toString();
    }
}
