package J;

import p171r0.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3866a;

    public c(float f3) {
        this.f3866a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            C.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // J.a
    public final float a(long j, p063g1.c cVar) {
        return (this.f3866a / 100.0f) * i.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f3866a, ((c) obj).f3866a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3866a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f3866a + "%)";
    }
}
