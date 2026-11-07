package V5;

import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.a f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8417b;

    public a(p124m3.a aVar, List list) {
        j.e(aVar, "chapterDao");
        this.f8416a = aVar;
        this.f8417b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f8416a, aVar.f8416a) && j.a(this.f8417b, aVar.f8417b);
    }

    public final int hashCode() {
        return this.f8417b.hashCode() + (this.f8416a.hashCode() * 31);
    }

    public final String toString() {
        return "StarredListRow(chapterDao=" + this.f8416a + ", verses=" + this.f8417b + ")";
    }
}
