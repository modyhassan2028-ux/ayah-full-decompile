package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p123m2.c;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BookType f15820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, BookType bookType) {
        super(bookType);
        p251z9.j.e(jVar, "verse");
        p251z9.j.e(bookType, "book");
        this.f15819b = jVar;
        this.f15820c = bookType;
        this.f15821d = c.r(jVar.f19585a, "verse_");
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15821d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p251z9.j.a(this.f15819b, iVar.f15819b) && p251z9.j.a(this.f15820c, iVar.f15820c);
    }

    public final int hashCode() {
        return this.f15820c.hashCode() + (this.f15819b.hashCode() * 31);
    }

    public final String toString() {
        return "VerseRow(verse=" + this.f15819b + ", book=" + this.f15820c + ")";
    }
}
