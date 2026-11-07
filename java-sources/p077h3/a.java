package p077h3;

import com.ayah.common.data.dao.bookmark.BookmarkType;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BookmarkType f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16443d;

    public a(int i10, String str, BookmarkType bookmarkType, long j) {
        j.e(str, "name");
        j.e(bookmarkType, "color");
        this.f16440a = i10;
        this.f16441b = str;
        this.f16442c = bookmarkType;
        this.f16443d = j;
    }

    public static a a(a aVar, String str, long j, int i10) {
        int i11 = (i10 & 1) != 0 ? aVar.f16440a : -1;
        if ((i10 & 2) != 0) {
            str = aVar.f16441b;
        }
        String str2 = str;
        BookmarkType bookmarkType = aVar.f16442c;
        if ((i10 & 8) != 0) {
            j = aVar.f16443d;
        }
        j.e(str2, "name");
        j.e(bookmarkType, "color");
        return new a(i11, str2, bookmarkType, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16440a == aVar.f16440a && j.a(this.f16441b, aVar.f16441b) && this.f16442c == aVar.f16442c && this.f16443d == aVar.f16443d;
    }

    public final int hashCode() {
        int iHashCode = (this.f16442c.hashCode() + p245z2.a.x(this.f16441b, this.f16440a * 31, 31)) * 31;
        long j = this.f16443d;
        return iHashCode + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Bookmark(verseId=" + this.f16440a + ", name=" + this.f16441b + ", color=" + this.f16442c + ", timestampMillis=" + this.f16443d + ")";
    }
}
