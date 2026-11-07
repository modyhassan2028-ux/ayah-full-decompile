package O5;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065g3.a f6494a;

    public b(p065g3.a aVar) {
        this.f6494a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f6494a, ((b) obj).f6494a);
    }

    public final int hashCode() {
        return this.f6494a.hashCode();
    }

    public final String toString() {
        return "QariInfoRow(reciterDao=" + this.f6494a + ")";
    }
}
