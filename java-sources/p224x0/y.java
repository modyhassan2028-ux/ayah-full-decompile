package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class y extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24296d;

    public y(float f3, float f7) {
        super(1);
        this.f24295c = f3;
        this.f24296d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f24295c, yVar.f24295c) == 0 && Float.compare(this.f24296d, yVar.f24296d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24296d) + (Float.floatToIntBits(this.f24295c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f24295c);
        sb.append(", dy=");
        return c.v(sb, this.f24296d, ')');
    }
}
