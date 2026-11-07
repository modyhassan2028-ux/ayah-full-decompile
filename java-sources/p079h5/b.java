package p079h5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f16458a;

    public b(BookType bookType) {
        j.e(bookType, "book");
        this.f16458a = bookType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f16458a, ((b) obj).f16458a);
    }

    public final int hashCode() {
        return this.f16458a.hashCode();
    }

    public final String toString() {
        return "InstalledTafsir(book=" + this.f16458a + ")";
    }
}
