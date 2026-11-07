package p072ga;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.5f, 0.5f) == 0 && Float.compare(8.0f, 8.0f) == 0 && Float.compare(1.5f, 1.5f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.5f) + c.n(c.n(c.n(31, 1.0f, 31), 0.5f, 31), 8.0f, 31);
    }

    public final String toString() {
        return "Rotation(enabled=true, speed=1.0, variance=0.5, multiplier2D=8.0, multiplier3D=1.5)";
    }
}
