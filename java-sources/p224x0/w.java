package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class w extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24290f;

    public w(float f3, float f7, float f10, float f11) {
        super(1);
        this.f24287c = f3;
        this.f24288d = f7;
        this.f24289e = f10;
        this.f24290f = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f24287c, wVar.f24287c) == 0 && Float.compare(this.f24288d, wVar.f24288d) == 0 && Float.compare(this.f24289e, wVar.f24289e) == 0 && Float.compare(this.f24290f, wVar.f24290f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24290f) + c.n(c.n(Float.floatToIntBits(this.f24287c) * 31, this.f24288d, 31), this.f24289e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f24287c);
        sb.append(", dy1=");
        sb.append(this.f24288d);
        sb.append(", dx2=");
        sb.append(this.f24289e);
        sb.append(", dy2=");
        return c.v(sb, this.f24290f, ')');
    }
}
