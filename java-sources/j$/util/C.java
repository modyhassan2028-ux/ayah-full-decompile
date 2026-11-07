package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f18045c = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f18047b;

    public C() {
        this.f18046a = false;
        this.f18047b = Double.NaN;
    }

    public C(double d5) {
        this.f18046a = true;
        this.f18047b = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        boolean z10 = c10.f18046a;
        boolean z11 = this.f18046a;
        if (z11 && z10) {
            return Double.compare(this.f18047b, c10.f18047b) == 0;
        }
        return z11 == z10;
    }

    public final int hashCode() {
        if (!this.f18046a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f18047b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f18046a) {
            return "OptionalDouble[" + this.f18047b + "]";
        }
        return "OptionalDouble.empty";
    }
}
