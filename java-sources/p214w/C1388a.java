package p214w;

import p123m2.c;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1388a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23471b;

    public C1388a(float f3, float f7) {
        this.f23470a = f3;
        this.f23471b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1388a)) {
            return false;
        }
        C1388a c1388a = (C1388a) obj;
        return Float.compare(this.f23470a, c1388a.f23470a) == 0 && Float.compare(this.f23471b, c1388a.f23471b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23471b) + (Float.floatToIntBits(this.f23470a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f23470a);
        sb.append(", velocityCoefficient=");
        return c.v(sb, this.f23471b, ')');
    }
}
