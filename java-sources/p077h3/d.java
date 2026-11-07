package p077h3;

import com.ayah.common.data.dao.bookmark.BookmarkType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BookmarkType f16449b;

    public d(String str, BookmarkType bookmarkType) {
        j.e(str, "bookmarkName");
        j.e(bookmarkType, "bookmarkType");
        this.f16448a = str;
        this.f16449b = bookmarkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f16448a, dVar.f16448a) && this.f16449b == dVar.f16449b;
    }

    public final int hashCode() {
        return this.f16449b.hashCode() + (this.f16448a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedColor(bookmarkName=" + this.f16448a + ", bookmarkType=" + this.f16449b + ")";
    }
}
