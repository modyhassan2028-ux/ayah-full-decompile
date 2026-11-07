package z3;

import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f24802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24803b;

    public m(BookType bookType, List list) {
        p251z9.j.e(bookType, "book");
        p251z9.j.e(list, "tafsir");
        this.f24802a = bookType;
        this.f24803b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p251z9.j.a(this.f24802a, mVar.f24802a) && p251z9.j.a(this.f24803b, mVar.f24803b);
    }

    public final int hashCode() {
        return this.f24803b.hashCode() + (this.f24802a.hashCode() * 31);
    }

    public final String toString() {
        return "TafsirEntryModel(book=" + this.f24802a + ", tafsir=" + this.f24803b + ")";
    }
}
