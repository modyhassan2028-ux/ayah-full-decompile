package p134n3;

import java.util.List;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f19998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f19999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20001f;

    public g(int i10, String str, Integer num, Integer num2, List list, String str2) {
        j.e(str, "text");
        this.f19996a = i10;
        this.f19997b = str;
        this.f19998c = num;
        this.f19999d = num2;
        this.f20000e = list;
        this.f20001f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19996a == gVar.f19996a && j.a(this.f19997b, gVar.f19997b) && this.f19998c.equals(gVar.f19998c) && j.a(this.f19999d, gVar.f19999d) && this.f20000e.equals(gVar.f20000e) && j.a(this.f20001f, gVar.f20001f);
    }

    public final int hashCode() {
        int iHashCode = (this.f19998c.hashCode() + a.x(this.f19997b, this.f19996a * 31, 31)) * 31;
        Integer num = this.f19999d;
        int iHashCode2 = (this.f20000e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.f20001f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Text(pageNumber=" + this.f19996a + ", text=" + this.f19997b + ", chapterNumber=" + this.f19998c + ", verseId=" + this.f19999d + ", emphases=" + this.f20000e + ", footnotePattern=" + this.f20001f + ")";
    }
}
