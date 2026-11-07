package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p134n3.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BookType f15817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, a aVar, BookType bookType) {
        super(bookType);
        j.e(bookType, "book");
        this.f15815b = gVar;
        this.f15816c = aVar;
        this.f15817d = bookType;
        this.f15818e = "text_" + gVar.f19996a + "_" + gVar.f19998c + "_" + gVar.f19999d + "_" + bookType.f13685a;
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15818e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j.a(this.f15815b, hVar.f15815b) && this.f15816c == hVar.f15816c && j.a(this.f15817d, hVar.f15817d);
    }

    public final int hashCode() {
        return this.f15817d.hashCode() + ((this.f15816c.hashCode() + (this.f15815b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextRow(row=" + this.f15815b + ", groupedTextStyle=" + this.f15816c + ", book=" + this.f15817d + ")";
    }
}
