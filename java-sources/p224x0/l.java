package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24256c;

    public l(float f3) {
        super(3);
        this.f24256c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f24256c, ((l) obj).f24256c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24256c);
    }

    public final String toString() {
        return c.v(new StringBuilder("HorizontalTo(x="), this.f24256c, ')');
    }
}
