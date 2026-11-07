package X3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.j f9934a;

    public b(p124m3.j jVar) {
        this.f9934a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && p251z9.j.a(this.f9934a, ((b) obj).f9934a);
    }

    public final int hashCode() {
        return this.f9934a.hashCode();
    }

    public final String toString() {
        return "ShowAyahInfo(verseDao=" + this.f9934a + ")";
    }
}
