package p072ga;

import ia.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16356f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f16357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16358i;

    public a(float f3, float f7, float f10, float f11, int i10, float f12, float f13, c cVar, int i11) {
        j.e(cVar, "shape");
        this.f16351a = f3;
        this.f16352b = f7;
        this.f16353c = f10;
        this.f16354d = f11;
        this.f16355e = i10;
        this.f16356f = f12;
        this.g = f13;
        this.f16357h = cVar;
        this.f16358i = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f16351a, aVar.f16351a) == 0 && Float.compare(this.f16352b, aVar.f16352b) == 0 && Float.compare(this.f16353c, aVar.f16353c) == 0 && Float.compare(this.f16354d, aVar.f16354d) == 0 && this.f16355e == aVar.f16355e && Float.compare(this.f16356f, aVar.f16356f) == 0 && Float.compare(this.g, aVar.g) == 0 && j.a(this.f16357h, aVar.f16357h) && this.f16358i == aVar.f16358i;
    }

    public final int hashCode() {
        return ((this.f16357h.hashCode() + p123m2.c.n(p123m2.c.n((p123m2.c.n(p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f16351a) * 31, this.f16352b, 31), this.f16353c, 31), this.f16354d, 31) + this.f16355e) * 31, this.f16356f, 31), this.g, 31)) * 31) + this.f16358i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(x=");
        sb.append(this.f16351a);
        sb.append(", y=");
        sb.append(this.f16352b);
        sb.append(", width=");
        sb.append(this.f16353c);
        sb.append(", height=");
        sb.append(this.f16354d);
        sb.append(", color=");
        sb.append(this.f16355e);
        sb.append(", rotation=");
        sb.append(this.f16356f);
        sb.append(", scaleX=");
        sb.append(this.g);
        sb.append(", shape=");
        sb.append(this.f16357h);
        sb.append(", alpha=");
        return p245z2.a.E(sb, this.f16358i, ")");
    }
}
