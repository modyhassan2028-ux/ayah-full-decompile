package p079h5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f16460a;

    public d(BookType bookType) {
        j.e(bookType, "book");
        this.f16460a = bookType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f16460a, ((d) obj).f16460a);
    }

    public final int hashCode() {
        return this.f16460a.hashCode();
    }

    public final String toString() {
        return "Tafsir(book=" + this.f16460a + ")";
    }
}
