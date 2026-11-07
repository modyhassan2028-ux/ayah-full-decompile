package p136n5;

import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20014b;

    public c(a aVar, boolean z10) {
        j.e(aVar, "reciterDao");
        this.f20013a = aVar;
        this.f20014b = z10;
    }

    @Override // p136n5.d
    public final a a() {
        return this.f20013a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f20013a, cVar.f20013a) && this.f20014b == cVar.f20014b;
    }

    public final int hashCode() {
        return (this.f20013a.hashCode() * 31) + (this.f20014b ? 1231 : 1237);
    }

    public final String toString() {
        return "Playback(reciterDao=" + this.f20013a + ", isPlaying=" + this.f20014b + ")";
    }
}
