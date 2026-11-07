package p124m3;

import android.content.Context;
import i7.B;
import java.util.ArrayList;
import java.util.List;
import p110k9.a;
import p110k9.o;
import p114l3.b;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19590f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19592i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f19596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f19597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f19598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f19599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f19600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f19601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f19602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f19603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f19604v;

    public j(int i10, int i11, String str, String str2, String str3, String str4, String str5, int i12, int i13, int i14, int i15, int i16, int i17, a aVar, l lVar, l lVar2, ArrayList arrayList, ArrayList arrayList2, b bVar) {
        p251z9.j.e(str, "text");
        p251z9.j.e(str2, "textWithoutTashkeel");
        p251z9.j.e(str3, "uthmanicHafsText");
        p251z9.j.e(str4, "hafsSmartText");
        p251z9.j.e(str5, "searchableText");
        p251z9.j.e(aVar, "lightWeightChapterDao");
        p251z9.j.e(bVar, "pageTypeDecider");
        this.f19585a = i10;
        this.f19586b = i11;
        this.f19587c = str;
        this.f19588d = str2;
        this.f19589e = str3;
        this.f19590f = str4;
        this.g = str5;
        this.f19591h = i12;
        this.f19592i = i13;
        this.j = i14;
        this.f19593k = i15;
        this.f19594l = i16;
        this.f19595m = i17;
        this.f19596n = aVar;
        this.f19597o = lVar;
        this.f19598p = lVar2;
        this.f19599q = arrayList;
        this.f19600r = arrayList2;
        this.f19601s = bVar;
        final int i18 = 0;
        this.f19602t = a.d(new p241y9.a(this) { // from class: m3.i

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f19584s;

            {
                this.f19584s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i19 = i18;
                j jVar = this.f19584s;
                switch (i19) {
                    case 0:
                        ((B) jVar.f19601s).getClass();
                        return Integer.valueOf(jVar.f19594l);
                    case 1:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19598p;
                    default:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19600r;
                }
            }
        });
        final int i19 = 1;
        this.f19603u = a.d(new p241y9.a(this) { // from class: m3.i

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f19584s;

            {
                this.f19584s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i110 = i19;
                j jVar = this.f19584s;
                switch (i110) {
                    case 0:
                        ((B) jVar.f19601s).getClass();
                        return Integer.valueOf(jVar.f19594l);
                    case 1:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19598p;
                    default:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19600r;
                }
            }
        });
        final int i20 = 2;
        this.f19604v = a.d(new p241y9.a(this) { // from class: m3.i

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f19584s;

            {
                this.f19584s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i110 = i20;
                j jVar = this.f19584s;
                switch (i110) {
                    case 0:
                        ((B) jVar.f19601s).getClass();
                        return Integer.valueOf(jVar.f19594l);
                    case 1:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19598p;
                    default:
                        ((B) jVar.f19601s).getClass();
                        return jVar.f19600r;
                }
            }
        });
    }

    public final List a() {
        return (List) this.f19604v.getValue();
    }

    public final l b() {
        return (l) this.f19603u.getValue();
    }

    public final int c() {
        return ((Number) this.f19602t.getValue()).intValue();
    }

    public final String d(Context context) {
        p251z9.j.e(context, "context");
        String strB = this.f19596n.b();
        String str = p125m4.b.f19615b.format(Integer.valueOf(this.f19586b));
        p251z9.j.d(str, "format(...)");
        return strB + ": " + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f19585a == jVar.f19585a && this.f19586b == jVar.f19586b && p251z9.j.a(this.f19587c, jVar.f19587c) && p251z9.j.a(this.f19588d, jVar.f19588d) && p251z9.j.a(this.f19589e, jVar.f19589e) && p251z9.j.a(this.f19590f, jVar.f19590f) && p251z9.j.a(this.g, jVar.g) && this.f19591h == jVar.f19591h && this.f19592i == jVar.f19592i && this.j == jVar.j && this.f19593k == jVar.f19593k && this.f19594l == jVar.f19594l && this.f19595m == jVar.f19595m && p251z9.j.a(this.f19596n, jVar.f19596n) && this.f19597o.equals(jVar.f19597o) && this.f19598p.equals(jVar.f19598p) && this.f19599q.equals(jVar.f19599q) && this.f19600r.equals(jVar.f19600r) && p251z9.j.a(this.f19601s, jVar.f19601s);
    }

    public final int hashCode() {
        return this.f19601s.hashCode() + ((this.f19600r.hashCode() + ((this.f19599q.hashCode() + ((this.f19598p.hashCode() + ((this.f19597o.hashCode() + ((this.f19596n.hashCode() + ((((((((((((p245z2.a.x(this.g, p245z2.a.x(this.f19590f, p245z2.a.x(this.f19589e, p245z2.a.x(this.f19588d, p245z2.a.x(this.f19587c, ((this.f19585a * 31) + this.f19586b) * 31, 31), 31), 31), 31), 31) + this.f19591h) * 31) + this.f19592i) * 31) + this.j) * 31) + this.f19593k) * 31) + this.f19594l) * 31) + this.f19595m) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("VerseDao(verseId=", this.f19585a, ", number=", this.f19586b, ", text=");
        p245z2.a.I(sbX, this.f19587c, ", textWithoutTashkeel=", this.f19588d, ", uthmanicHafsText=");
        p245z2.a.I(sbX, this.f19589e, ", hafsSmartText=", this.f19590f, ", searchableText=");
        sbX.append(this.g);
        sbX.append(", partNumber=");
        sbX.append(this.f19591h);
        sbX.append(", quarterIdentifier=");
        sbX.append(this.f19592i);
        sbX.append(", sectionIdentifier=");
        sbX.append(this.j);
        sbX.append(", pageNumber1405=");
        sbX.append(this.f19593k);
        sbX.append(", pageNumber1441=");
        sbX.append(this.f19594l);
        sbX.append(", chapterNumber=");
        sbX.append(this.f19595m);
        sbX.append(", lightWeightChapterDao=");
        sbX.append(this.f19596n);
        sbX.append(", marker1405=");
        sbX.append(this.f19597o);
        sbX.append(", marker1441=");
        sbX.append(this.f19598p);
        sbX.append(", highlights1405=");
        sbX.append(this.f19599q);
        sbX.append(", highlights1441=");
        sbX.append(this.f19600r);
        sbX.append(", pageTypeDecider=");
        sbX.append(this.f19601s);
        sbX.append(")");
        return sbX.toString();
    }
}
