package X3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9941a;

    public j(int i10) {
        this.f9941a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f9941a == ((j) obj).f9941a;
    }

    public final int hashCode() {
        return this.f9941a;
    }

    public final String toString() {
        return p245z2.a.B(this.f9941a, "SelectSura(suraNumber=", ")");
    }
}
