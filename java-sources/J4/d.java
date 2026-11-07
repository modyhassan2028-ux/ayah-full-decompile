package J4;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.a f4326a;

    public d(p124m3.a aVar) {
        j.e(aVar, "chapterDao");
        this.f4326a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f4326a, ((d) obj).f4326a);
    }

    public final int hashCode() {
        return this.f4326a.hashCode();
    }

    public final String toString() {
        return "SuraRow(chapterDao=" + this.f4326a + ")";
    }
}
