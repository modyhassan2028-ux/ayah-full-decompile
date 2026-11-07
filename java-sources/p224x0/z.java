package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24297c;

    public z(float f3) {
        super(3);
        this.f24297c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f24297c, ((z) obj).f24297c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24297c);
    }

    public final String toString() {
        return c.v(new StringBuilder("RelativeVerticalTo(dy="), this.f24297c, ')');
    }
}
