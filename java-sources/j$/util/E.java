package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f18051c = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18053b;

    public E() {
        this.f18052a = false;
        this.f18053b = 0L;
    }

    public E(long j) {
        this.f18052a = true;
        this.f18053b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        boolean z10 = e10.f18052a;
        boolean z11 = this.f18052a;
        if (z11 && z10) {
            return this.f18053b == e10.f18053b;
        }
        return z11 == z10;
    }

    public final int hashCode() {
        if (!this.f18052a) {
            return 0;
        }
        long j = this.f18053b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.f18052a) {
            return "OptionalLong[" + this.f18053b + "]";
        }
        return "OptionalLong.empty";
    }
}
