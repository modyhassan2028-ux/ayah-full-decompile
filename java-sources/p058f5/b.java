package p058f5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f16224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16225b;

    public b(BookType bookType, int i10) {
        j.e(bookType, "book");
        this.f16224a = bookType;
        this.f16225b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f16224a, bVar.f16224a) && this.f16225b == bVar.f16225b;
    }

    public final int hashCode() {
        return (this.f16224a.hashCode() * 31) + this.f16225b;
    }

    public final String toString() {
        return "Move(book=" + this.f16224a + ", toPosition=" + this.f16225b + ")";
    }
}
