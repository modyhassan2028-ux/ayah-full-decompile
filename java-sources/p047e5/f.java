package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p123m2.c;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.f f15806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BookType f15808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f15809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p134n3.f fVar, a aVar, BookType bookType, j jVar) {
        super(bookType);
        p251z9.j.e(fVar, "row");
        p251z9.j.e(aVar, "groupedTextStyle");
        p251z9.j.e(bookType, "book");
        p251z9.j.e(jVar, "referencedAyah");
        this.f15806b = fVar;
        this.f15807c = aVar;
        this.f15808d = bookType;
        this.f15809e = jVar;
        int i10 = fVar.f19993a;
        int i11 = fVar.f19995c;
        int i12 = fVar.f19994b;
        String str = bookType.f13685a;
        StringBuilder sbX = c.x("reference_", i10, "_", i11, "_");
        sbX.append(i12);
        sbX.append("_");
        sbX.append(str);
        this.f15810f = sbX.toString();
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15810f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p251z9.j.a(this.f15806b, fVar.f15806b) && this.f15807c == fVar.f15807c && p251z9.j.a(this.f15808d, fVar.f15808d) && p251z9.j.a(this.f15809e, fVar.f15809e);
    }

    public final int hashCode() {
        return this.f15809e.hashCode() + ((this.f15808d.hashCode() + ((this.f15807c.hashCode() + (this.f15806b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReferenceRow(row=" + this.f15806b + ", groupedTextStyle=" + this.f15807c + ", book=" + this.f15808d + ", referencedAyah=" + this.f15809e + ")";
    }
}
