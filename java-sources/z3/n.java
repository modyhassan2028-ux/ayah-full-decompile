package z3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24805b;

    public n(int i10, List list) {
        p251z9.j.e(list, "tafsirEntryModels");
        this.f24804a = i10;
        this.f24805b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f24804a == nVar.f24804a && p251z9.j.a(this.f24805b, nVar.f24805b);
    }

    public final int hashCode() {
        return this.f24805b.hashCode() + (this.f24804a * 31);
    }

    public final String toString() {
        return "VerseTafsirEntriesModel(verseId=" + this.f24804a + ", tafsirEntryModels=" + this.f24805b + ")";
    }
}
