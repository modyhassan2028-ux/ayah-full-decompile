package p058f5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f16223a;

    public a(BookType bookType) {
        j.e(bookType, "book");
        this.f16223a = bookType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f16223a, ((a) obj).f16223a);
    }

    public final int hashCode() {
        return this.f16223a.hashCode();
    }

    public final String toString() {
        return "Install(book=" + this.f16223a + ")";
    }
}
