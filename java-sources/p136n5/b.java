package p136n5;

import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20012a;

    public b(a aVar) {
        j.e(aVar, "reciterDao");
        this.f20012a = aVar;
    }

    @Override // p136n5.d
    public final a a() {
        return this.f20012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f20012a, ((b) obj).f20012a);
    }

    public final int hashCode() {
        return this.f20012a.hashCode();
    }

    public final String toString() {
        return "Inactive(reciterDao=" + this.f20012a + ")";
    }
}
