package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class t extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24282c;

    public t(float f3) {
        super(3);
        this.f24282c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f24282c, ((t) obj).f24282c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24282c);
    }

    public final String toString() {
        return c.v(new StringBuilder("RelativeHorizontalTo(dx="), this.f24282c, ')');
    }
}
