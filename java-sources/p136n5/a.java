package p136n5;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065g3.a f20011a;

    public a(p065g3.a aVar) {
        j.e(aVar, "reciterDao");
        this.f20011a = aVar;
    }

    @Override // p136n5.d
    public final p065g3.a a() {
        return this.f20011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f20011a, ((a) obj).f20011a);
    }

    public final int hashCode() {
        return this.f20011a.hashCode();
    }

    public final String toString() {
        return "Downloading(reciterDao=" + this.f20011a + ")";
    }
}
