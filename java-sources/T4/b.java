package T4;

import java.util.List;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p095j3.b f7783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f7785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7786d;

    public b(p095j3.b bVar, j jVar, j jVar2, List list) {
        p251z9.j.e(list, "chapters");
        this.f7783a = bVar;
        this.f7784b = jVar;
        this.f7785c = jVar2;
        this.f7786d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p251z9.j.a(this.f7783a, bVar.f7783a) && p251z9.j.a(this.f7784b, bVar.f7784b) && p251z9.j.a(this.f7785c, bVar.f7785c) && p251z9.j.a(this.f7786d, bVar.f7786d);
    }

    public final int hashCode() {
        return this.f7786d.hashCode() + ((this.f7785c.hashCode() + ((this.f7784b.hashCode() + (this.f7783a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "KhatmahDayInfo(khatmahDay=" + this.f7783a + ", fromAyah=" + this.f7784b + ", toAyah=" + this.f7785c + ", chapters=" + this.f7786d + ")";
    }
}
