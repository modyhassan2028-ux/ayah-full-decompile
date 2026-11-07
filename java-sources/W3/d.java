package W3;

import F9.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9597f;
    public final float g;

    public d(float f3, float f7) {
        this.f9597f = f3;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f9597f, dVar.f9597f) == 0 && Float.compare(this.g, dVar.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + (Float.floatToIntBits(this.f9597f) * 31);
    }

    public final String toString() {
        return "Press(x=" + this.f9597f + ", y=" + this.g + ")";
    }
}
