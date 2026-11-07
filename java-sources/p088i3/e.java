package p088i3;

import java.util.ArrayList;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16744d;

    public e(List list, ArrayList arrayList, ArrayList arrayList2, int i10) {
        j.e(list, "bookmarks");
        this.f16741a = list;
        this.f16742b = arrayList;
        this.f16743c = arrayList2;
        this.f16744d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f16741a, eVar.f16741a) && this.f16742b.equals(eVar.f16742b) && this.f16743c.equals(eVar.f16743c) && this.f16744d == eVar.f16744d;
    }

    public final int hashCode() {
        return ((this.f16743c.hashCode() + ((this.f16742b.hashCode() + (this.f16741a.hashCode() * 31)) * 31)) * 31) + this.f16744d;
    }

    public final String toString() {
        return "Markers(bookmarks=" + this.f16741a + ", favorites=" + this.f16742b + ", ayahsWithNotes=" + this.f16743c + ", audioPlaybackAyah=" + this.f16744d + ")";
    }
}
