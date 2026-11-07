package T4;

import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p095j3.a f7781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7782b;

    public a(p095j3.a aVar, List list) {
        j.e(aVar, "khatmah");
        j.e(list, "khatmahDays");
        this.f7781a = aVar;
        this.f7782b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f7781a, aVar.f7781a) && j.a(this.f7782b, aVar.f7782b);
    }

    public final int hashCode() {
        return this.f7782b.hashCode() + (this.f7781a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentKhatmahInfo(khatmah=" + this.f7781a + ", khatmahDays=" + this.f7782b + ")";
    }
}
