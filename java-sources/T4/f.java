package T4;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p095j3.c f7795a;

    public f(p095j3.c cVar) {
        j.e(cVar, "plan");
        this.f7795a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f7795a == ((f) obj).f7795a;
    }

    public final int hashCode() {
        return this.f7795a.hashCode();
    }

    public final String toString() {
        return "KhatmahEntry(plan=" + this.f7795a + ")";
    }
}
