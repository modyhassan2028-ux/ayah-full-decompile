package p214w;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23447c;

    public J(float f3, float f7, long j) {
        this.f23445a = f3;
        this.f23446b = f7;
        this.f23447c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return Float.compare(this.f23445a, j.f23445a) == 0 && Float.compare(this.f23446b, j.f23446b) == 0 && this.f23447c == j.f23447c;
    }

    public final int hashCode() {
        int iN = c.n(Float.floatToIntBits(this.f23445a) * 31, this.f23446b, 31);
        long j = this.f23447c;
        return iN + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f23445a + ", distance=" + this.f23446b + ", duration=" + this.f23447c + ')';
    }
}
