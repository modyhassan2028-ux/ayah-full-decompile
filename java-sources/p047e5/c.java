package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p134n3.d;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BookType f15797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, a aVar, BookType bookType) {
        super(bookType);
        j.e(bookType, "book");
        this.f15795b = dVar;
        this.f15796c = aVar;
        this.f15797d = bookType;
        int i10 = dVar.f19988a;
        int i11 = dVar.f19990c;
        String str = bookType.f13685a;
        StringBuilder sbX = p123m2.c.x("footnote_", i10, "_", i11, "_");
        sbX.append(str);
        this.f15798e = sbX.toString();
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15798e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f15795b, cVar.f15795b) && this.f15796c == cVar.f15796c && j.a(this.f15797d, cVar.f15797d);
    }

    public final int hashCode() {
        return this.f15797d.hashCode() + ((this.f15796c.hashCode() + (this.f15795b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FootnoteRow(row=" + this.f15795b + ", groupedTextStyle=" + this.f15796c + ", book=" + this.f15797d + ")";
    }
}
