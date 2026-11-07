package C5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookType f757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f759c;

    public b(BookType bookType, boolean z10, g gVar) {
        this.f757a = bookType;
        this.f758b = z10;
        this.f759c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f757a, bVar.f757a) && this.f758b == bVar.f758b && j.a(this.f759c, bVar.f759c);
    }

    public final int hashCode() {
        return this.f759c.hashCode() + (((this.f757a.hashCode() * 31) + (this.f758b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Tafsir(book=" + this.f757a + ", isSelected=" + this.f758b + ", downloadStatus=" + this.f759c + ")";
    }
}
