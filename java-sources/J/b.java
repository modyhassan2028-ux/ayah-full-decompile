package J;

import p063g1.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3865a;

    public b(float f3) {
        this.f3865a = f3;
    }

    @Override // J.a
    public final float a(long j, p063g1.c cVar) {
        return cVar.w(this.f3865a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f3865a, ((b) obj).f3865a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3865a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f3865a + ".dp)";
    }
}
