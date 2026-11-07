package ka;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f19121c = new d(p120l9.m.G0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p186s9.b f19123b;

    public d(Set set, p186s9.b bVar) {
        this.f19122a = set;
        this.f19123b = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p251z9.j.a(dVar.f19122a, this.f19122a) && p251z9.j.a(dVar.f19123b, this.f19123b);
    }

    public final int hashCode() {
        int iHashCode = (this.f19122a.hashCode() + 1517) * 41;
        p186s9.b bVar = this.f19123b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
