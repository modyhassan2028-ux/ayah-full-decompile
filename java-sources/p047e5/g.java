package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BookType f15811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BookType bookType, boolean z10, boolean z11) {
        super(bookType);
        j.e(bookType, "book");
        this.f15811b = bookType;
        this.f15812c = z10;
        this.f15813d = z11;
        this.f15814e = c.s("tafsir_header_", bookType.f13685a);
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15814e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j.a(this.f15811b, gVar.f15811b) && this.f15812c == gVar.f15812c && this.f15813d == gVar.f15813d;
    }

    public final int hashCode() {
        return (((this.f15811b.hashCode() * 31) + (this.f15812c ? 1231 : 1237)) * 31) + (this.f15813d ? 1231 : 1237);
    }

    public final String toString() {
        return "TafsirHeaderRow(book=" + this.f15811b + ", hideSharing=" + this.f15812c + ", canShareImage=" + this.f15813d + ")";
    }
}
