package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class v extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24286d;

    public v(float f3, float f7) {
        super(3);
        this.f24285c = f3;
        this.f24286d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f24285c, vVar.f24285c) == 0 && Float.compare(this.f24286d, vVar.f24286d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24286d) + (Float.floatToIntBits(this.f24285c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f24285c);
        sb.append(", dy=");
        return c.v(sb, this.f24286d, ')');
    }
}
