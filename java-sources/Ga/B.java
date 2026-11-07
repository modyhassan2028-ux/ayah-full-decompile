package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2972b;

    public B(float f3, float f7) {
        this.f2971a = f3;
        this.f2972b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return Float.compare(this.f2971a, b5.f2971a) == 0 && Float.compare(this.f2972b, b5.f2972b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2972b) + (Float.floatToIntBits(this.f2971a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAreaOffsets(start=");
        sb.append(this.f2971a);
        sb.append(", end=");
        return p123m2.c.v(sb, this.f2972b, ')');
    }
}
