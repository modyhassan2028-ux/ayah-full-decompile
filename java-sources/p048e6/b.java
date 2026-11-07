package p048e6;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15826a;

    public b(List list) {
        this.f15826a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f15826a.equals(((b) obj).f15826a);
    }

    public final int hashCode() {
        return this.f15826a.hashCode() + 381372314;
    }

    public final String toString() {
        return "TodayItem(header=Verse of the Day, type=verse, rows=" + this.f15826a + ")";
    }
}
