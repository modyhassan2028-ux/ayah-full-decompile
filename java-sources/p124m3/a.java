package p124m3;

import B3.f;
import java.util.List;
import p110k9.o;
import p114l3.b;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19532f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19534i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f19536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f19538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f19539o;

    public a(int i10, int i11, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, b bVar, b bVar2, List list, int i12, b bVar3) {
        j.e(str, "title");
        j.e(str2, "arabicTitle");
        j.e(str3, "englishTitle");
        j.e(str4, "titleCodePoint");
        j.e(str5, "searchableText");
        j.e(str6, "searchableKeywords");
        j.e(bVar3, "pageTypeDecider");
        this.f19527a = i10;
        this.f19528b = i11;
        this.f19529c = z10;
        this.f19530d = str;
        this.f19531e = str2;
        this.f19532f = str3;
        this.g = str4;
        this.f19533h = str5;
        this.f19534i = str6;
        this.j = bVar;
        this.f19535k = bVar2;
        this.f19536l = list;
        this.f19537m = i12;
        this.f19538n = bVar3;
        this.f19539o = p110k9.a.d(new f(17, this));
    }

    public final b a() {
        return (b) this.f19539o.getValue();
    }

    public final String b() {
        return p125m4.b.b() ? this.f19531e : this.f19532f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19527a == aVar.f19527a && this.f19528b == aVar.f19528b && this.f19529c == aVar.f19529c && j.a(this.f19530d, aVar.f19530d) && j.a(this.f19531e, aVar.f19531e) && j.a(this.f19532f, aVar.f19532f) && j.a(this.g, aVar.g) && j.a(this.f19533h, aVar.f19533h) && j.a(this.f19534i, aVar.f19534i) && this.j.equals(aVar.j) && this.f19535k.equals(aVar.f19535k) && this.f19536l.equals(aVar.f19536l) && this.f19537m == aVar.f19537m && j.a(this.f19538n, aVar.f19538n);
    }

    public final int hashCode() {
        return this.f19538n.hashCode() + ((((this.f19536l.hashCode() + ((this.f19535k.hashCode() + ((this.j.hashCode() + p245z2.a.x(this.f19534i, p245z2.a.x(this.f19533h, p245z2.a.x(this.g, p245z2.a.x(this.f19532f, p245z2.a.x(this.f19531e, p245z2.a.x(this.f19530d, ((((this.f19527a * 31) + this.f19528b) * 31) + (this.f19529c ? 1231 : 1237)) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31) + this.f19537m) * 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("ChapterDao(identifier=", this.f19527a, ", number=", this.f19528b, ", isMakki=");
        sbX.append(this.f19529c);
        sbX.append(", title=");
        sbX.append(this.f19530d);
        sbX.append(", arabicTitle=");
        p245z2.a.I(sbX, this.f19531e, ", englishTitle=", this.f19532f, ", titleCodePoint=");
        p245z2.a.I(sbX, this.g, ", searchableText=", this.f19533h, ", searchableKeywords=");
        sbX.append(this.f19534i);
        sbX.append(", header1405=");
        sbX.append(this.j);
        sbX.append(", header1441=");
        sbX.append(this.f19535k);
        sbX.append(", verses=");
        sbX.append(this.f19536l);
        sbX.append(", verseCount=");
        sbX.append(this.f19537m);
        sbX.append(", pageTypeDecider=");
        sbX.append(this.f19538n);
        sbX.append(")");
        return sbX.toString();
    }
}
