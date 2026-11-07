package K5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J5.b f5242a;

    public a(J5.b bVar) {
        this.f5242a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5242a == ((a) obj).f5242a;
    }

    public final int hashCode() {
        return this.f5242a.hashCode();
    }

    public final String toString() {
        return "Category(reciterCategory=" + this.f5242a + ")";
    }
}
