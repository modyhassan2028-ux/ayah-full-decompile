package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class m extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24258d;

    public m(float f3, float f7) {
        super(3);
        this.f24257c = f3;
        this.f24258d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f24257c, mVar.f24257c) == 0 && Float.compare(this.f24258d, mVar.f24258d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24258d) + (Float.floatToIntBits(this.f24257c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f24257c);
        sb.append(", y=");
        return c.v(sb, this.f24258d, ')');
    }
}
