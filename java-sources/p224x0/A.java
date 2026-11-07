package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24128c;

    public A(float f3) {
        super(3);
        this.f24128c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.f24128c, ((A) obj).f24128c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24128c);
    }

    public final String toString() {
        return c.v(new StringBuilder("VerticalTo(y="), this.f24128c, ')');
    }
}
