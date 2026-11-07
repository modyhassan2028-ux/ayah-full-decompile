package X3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p124m3.a f9935a;

    public c(p124m3.a aVar) {
        this.f9935a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p251z9.j.a(this.f9935a, ((c) obj).f9935a);
    }

    public final int hashCode() {
        return this.f9935a.hashCode();
    }

    public final String toString() {
        return "ShowSuraInfo(chapterDao=" + this.f9935a + ")";
    }
}
