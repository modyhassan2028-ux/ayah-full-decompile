package p088i3;

import F9.n;
import p065g3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f16747c;

    public f(a aVar, int i10, n nVar) {
        this.f16745a = aVar;
        this.f16746b = i10;
        this.f16747c = nVar;
    }

    public static f a(f fVar, n nVar) {
        a aVar = fVar.f16745a;
        int i10 = fVar.f16746b;
        fVar.getClass();
        return new f(aVar, i10, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f16745a, fVar.f16745a) && this.f16746b == fVar.f16746b && j.a(this.f16747c, fVar.f16747c);
    }

    public final int hashCode() {
        return this.f16747c.hashCode() + (((this.f16745a.hashCode() * 31) + this.f16746b) * 31);
    }

    public final String toString() {
        return "QariDownloadStatus(qari=" + this.f16745a + ", sura=" + this.f16746b + ", downloadStatus=" + this.f16747c + ")";
    }
}
