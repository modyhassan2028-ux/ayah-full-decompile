package p224x0;

import p123m2.c;

/* JADX INFO: renamed from: x0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1445i extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24247f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24249i;

    public C1445i(float f3, float f7, float f10, boolean z10, boolean z11, float f11, float f12) {
        super(3);
        this.f24244c = f3;
        this.f24245d = f7;
        this.f24246e = f10;
        this.f24247f = z10;
        this.g = z11;
        this.f24248h = f11;
        this.f24249i = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445i)) {
            return false;
        }
        C1445i c1445i = (C1445i) obj;
        return Float.compare(this.f24244c, c1445i.f24244c) == 0 && Float.compare(this.f24245d, c1445i.f24245d) == 0 && Float.compare(this.f24246e, c1445i.f24246e) == 0 && this.f24247f == c1445i.f24247f && this.g == c1445i.g && Float.compare(this.f24248h, c1445i.f24248h) == 0 && Float.compare(this.f24249i, c1445i.f24249i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24249i) + c.n((((c.n(c.n(Float.floatToIntBits(this.f24244c) * 31, this.f24245d, 31), this.f24246e, 31) + (this.f24247f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, this.f24248h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f24244c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f24245d);
        sb.append(", theta=");
        sb.append(this.f24246e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f24247f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.f24248h);
        sb.append(", arcStartY=");
        return c.v(sb, this.f24249i, ')');
    }
}
