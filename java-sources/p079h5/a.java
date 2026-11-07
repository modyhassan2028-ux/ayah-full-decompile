package p079h5;

import com.ayah.common.data.source.json.model.booklist.BookCategory;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookCategory f16457a;

    public a(BookCategory bookCategory) {
        this.f16457a = bookCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f16457a, ((a) obj).f16457a);
    }

    public final int hashCode() {
        return this.f16457a.hashCode();
    }

    public final String toString() {
        return "Header(category=" + this.f16457a + ")";
    }
}
