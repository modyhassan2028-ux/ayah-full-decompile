package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BookType f15803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BookType bookType, String str) {
        super(null);
        j.e(bookType, "book");
        this.f15803b = bookType;
        this.f15804c = str;
        this.f15805d = c.s("no_entry_", bookType.f13685a);
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15805d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f15803b, eVar.f15803b) && j.a(this.f15804c, eVar.f15804c);
    }

    public final int hashCode() {
        int iHashCode = this.f15803b.hashCode() * 31;
        String str = this.f15804c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NoEntryRow(book=" + this.f15803b + ", unavailableText=" + this.f15804c + ")";
    }
}
