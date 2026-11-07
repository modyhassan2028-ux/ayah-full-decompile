package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24270d;

    public q(float f3, float f7) {
        super(1);
        this.f24269c = f3;
        this.f24270d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f24269c, qVar.f24269c) == 0 && Float.compare(this.f24270d, qVar.f24270d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24270d) + (Float.floatToIntBits(this.f24269c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f24269c);
        sb.append(", y=");
        return c.v(sb, this.f24270d, ')');
    }
}
