package p134n3;

import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19995c;

    public f(int i10, int i11, int i12) {
        this.f19993a = i10;
        this.f19994b = i11;
        this.f19995c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19993a == fVar.f19993a && this.f19994b == fVar.f19994b && this.f19995c == fVar.f19995c;
    }

    public final int hashCode() {
        return (((this.f19993a * 31) + this.f19994b) * 31) + this.f19995c;
    }

    public final String toString() {
        return a.E(c.x("Reference(pageNumber=", this.f19993a, ", referencedAyahId=", this.f19994b, ", verseId="), this.f19995c, ")");
    }
}
