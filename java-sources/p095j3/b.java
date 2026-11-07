package p095j3;

import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18759c;

    public b(int i10, int i11, int i12) {
        this.f18757a = i10;
        this.f18758b = i11;
        this.f18759c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18757a == bVar.f18757a && this.f18758b == bVar.f18758b && this.f18759c == bVar.f18759c;
    }

    public final int hashCode() {
        return (((this.f18757a * 31) + this.f18758b) * 31) + this.f18759c;
    }

    public final String toString() {
        return a.E(c.x("KhatmahDay(dayIndex=", this.f18757a, ", fromVerseId=", this.f18758b, ", toVerseId="), this.f18759c, ")");
    }
}
