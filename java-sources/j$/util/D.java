package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f18048c = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18050b;

    public D() {
        this.f18049a = false;
        this.f18050b = 0;
    }

    public D(int i10) {
        this.f18049a = true;
        this.f18050b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        boolean z10 = d5.f18049a;
        boolean z11 = this.f18049a;
        if (z11 && z10) {
            return this.f18050b == d5.f18050b;
        }
        return z11 == z10;
    }

    public final int hashCode() {
        if (this.f18049a) {
            return this.f18050b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f18049a) {
            return "OptionalInt[" + this.f18050b + "]";
        }
        return "OptionalInt.empty";
    }
}
