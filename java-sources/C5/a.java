package C5;

import com.ayah.common.data.source.json.model.booklist.BookCategory;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookCategory f756a;

    public a(BookCategory bookCategory) {
        this.f756a = bookCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f756a, ((a) obj).f756a);
    }

    public final int hashCode() {
        return this.f756a.hashCode();
    }

    public final String toString() {
        return "Header(category=" + this.f756a + ")";
    }
}
