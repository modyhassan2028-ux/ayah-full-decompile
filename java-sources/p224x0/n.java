package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class n extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24260d;

    public n(float f3, float f7) {
        super(3);
        this.f24259c = f3;
        this.f24260d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f24259c, nVar.f24259c) == 0 && Float.compare(this.f24260d, nVar.f24260d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24260d) + (Float.floatToIntBits(this.f24259c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f24259c);
        sb.append(", y=");
        return c.v(sb, this.f24260d, ')');
    }
}
