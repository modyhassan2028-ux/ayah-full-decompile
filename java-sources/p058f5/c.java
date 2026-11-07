package p058f5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f16226a;

    public c(BookType bookType) {
        j.e(bookType, "book");
        this.f16226a = bookType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f16226a, ((c) obj).f16226a);
    }

    public final int hashCode() {
        return this.f16226a.hashCode();
    }

    public final String toString() {
        return "Remove(book=" + this.f16226a + ")";
    }
}
