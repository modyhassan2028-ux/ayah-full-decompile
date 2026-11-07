package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p134n3.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BookType f15801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, a aVar, BookType bookType) {
        super(bookType);
        j.e(bookType, "book");
        this.f15799b = eVar;
        this.f15800c = aVar;
        this.f15801d = bookType;
        this.f15802e = "heading_" + eVar.f19991a + "_" + bookType.f13685a;
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15802e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f15799b, dVar.f15799b) && this.f15800c == dVar.f15800c && j.a(this.f15801d, dVar.f15801d);
    }

    public final int hashCode() {
        return this.f15801d.hashCode() + ((this.f15800c.hashCode() + (this.f15799b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HeadingRow(row=" + this.f15799b + ", groupedTextStyle=" + this.f15800c + ", book=" + this.f15801d + ")";
    }
}
