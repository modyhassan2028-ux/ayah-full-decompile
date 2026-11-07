package p048e6;

import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15828a;

    public d(int i10) {
        this.f15828a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f15828a == ((d) obj).f15828a;
    }

    public final int hashCode() {
        return this.f15828a;
    }

    public final String toString() {
        return a.B(this.f15828a, "JumpToLibrary(ayahId=", ")");
    }
}
