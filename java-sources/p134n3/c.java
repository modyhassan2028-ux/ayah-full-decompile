package p134n3;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f19987a;

    public c(BookType bookType) {
        j.e(bookType, "bookType");
        this.f19987a = bookType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f19987a, ((c) obj).f19987a);
    }

    public final int hashCode() {
        return this.f19987a.hashCode();
    }

    public final String toString() {
        return "Downloading(bookType=" + this.f19987a + ")";
    }
}
