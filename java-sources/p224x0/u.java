package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class u extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24284d;

    public u(float f3, float f7) {
        super(3);
        this.f24283c = f3;
        this.f24284d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f24283c, uVar.f24283c) == 0 && Float.compare(this.f24284d, uVar.f24284d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24284d) + (Float.floatToIntBits(this.f24283c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f24283c);
        sb.append(", dy=");
        return c.v(sb, this.f24284d, ')');
    }
}
