package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24280f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24281h;

    public s(float f3, float f7, float f10, float f11, float f12, float f13) {
        super(2);
        this.f24277c = f3;
        this.f24278d = f7;
        this.f24279e = f10;
        this.f24280f = f11;
        this.g = f12;
        this.f24281h = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f24277c, sVar.f24277c) == 0 && Float.compare(this.f24278d, sVar.f24278d) == 0 && Float.compare(this.f24279e, sVar.f24279e) == 0 && Float.compare(this.f24280f, sVar.f24280f) == 0 && Float.compare(this.g, sVar.g) == 0 && Float.compare(this.f24281h, sVar.f24281h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24281h) + c.n(c.n(c.n(c.n(Float.floatToIntBits(this.f24277c) * 31, this.f24278d, 31), this.f24279e, 31), this.f24280f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f24277c);
        sb.append(", dy1=");
        sb.append(this.f24278d);
        sb.append(", dx2=");
        sb.append(this.f24279e);
        sb.append(", dy2=");
        sb.append(this.f24280f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return c.v(sb, this.f24281h, ')');
    }
}
