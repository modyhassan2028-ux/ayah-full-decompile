package J4;

import p124m3.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4323a;

    public a(g gVar) {
        j.e(gVar, "partDao");
        this.f4323a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f4323a, ((a) obj).f4323a);
    }

    public final int hashCode() {
        return this.f4323a.hashCode();
    }

    public final String toString() {
        return "JuzHeader(partDao=" + this.f4323a + ")";
    }
}
