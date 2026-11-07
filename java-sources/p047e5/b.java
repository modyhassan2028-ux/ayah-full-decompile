package p047e5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import p134n3.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BookType f15791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, BookType bookType, int i10, boolean z10) {
        super(bookType);
        j.e(bookType, "book");
        this.f15790b = cVar;
        this.f15791c = bookType;
        this.f15792d = i10;
        this.f15793e = z10;
        this.f15794f = p123m2.c.s("downloading_", bookType.f13685a);
    }

    @Override // p047e5.j
    public final String a() {
        return this.f15794f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f15790b, bVar.f15790b) && j.a(this.f15791c, bVar.f15791c) && this.f15792d == bVar.f15792d && this.f15793e == bVar.f15793e;
    }

    public final int hashCode() {
        return ((((this.f15791c.hashCode() + (this.f15790b.f19987a.hashCode() * 31)) * 31) + this.f15792d) * 31) + (this.f15793e ? 1231 : 1237);
    }

    public final String toString() {
        return "DownloadingRow(row=" + this.f15790b + ", book=" + this.f15791c + ", progress=" + this.f15792d + ", isIndeterminate=" + this.f15793e + ")";
    }
}
