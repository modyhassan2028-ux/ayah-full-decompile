package E3;

import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1836f;
    public final Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f1837h;

    public a(int i10, String str, String str2, List list, int i11, int i12, Integer num, Integer num2) {
        j.e(str, "kind");
        j.e(str2, "text");
        this.f1831a = i10;
        this.f1832b = str;
        this.f1833c = str2;
        this.f1834d = list;
        this.f1835e = i11;
        this.f1836f = i12;
        this.g = num;
        this.f1837h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1831a == aVar.f1831a && j.a(this.f1832b, aVar.f1832b) && j.a(this.f1833c, aVar.f1833c) && j.a(this.f1834d, aVar.f1834d) && this.f1835e == aVar.f1835e && this.f1836f == aVar.f1836f && j.a(this.g, aVar.g) && j.a(this.f1837h, aVar.f1837h);
    }

    public final int hashCode() {
        int iX = p245z2.a.x(this.f1833c, p245z2.a.x(this.f1832b, this.f1831a * 31, 31), 31);
        List list = this.f1834d;
        int iHashCode = (((((iX + (list == null ? 0 : list.hashCode())) * 31) + this.f1835e) * 31) + this.f1836f) * 31;
        Integer num = this.g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1837h;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BookEntry(id=" + this.f1831a + ", kind=" + this.f1832b + ", text=" + this.f1833c + ", emphases=" + this.f1834d + ", chapterNumber=" + this.f1835e + ", pageNumber=" + this.f1836f + ", verseNumber=" + this.g + ", verseId=" + this.f1837h + ")";
    }
}
