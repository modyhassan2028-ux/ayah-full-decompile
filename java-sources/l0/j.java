package l0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19327b;

    public j(float f3, float f7) {
        this.f19326a = f3;
        this.f19327b = f7;
    }

    @Override // l0.e
    public final long a(long j, long j10, p063g1.m mVar) {
        float f3 = (((int) (j10 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f7 = (((int) (j10 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        p063g1.m mVar2 = p063g1.m.f16261r;
        float f10 = this.f19326a;
        if (mVar != mVar2) {
            f10 *= -1;
        }
        float f11 = 1;
        float f12 = (f10 + f11) * f3;
        return (((long) Math.round((f11 + this.f19327b) * f7)) & 4294967295L) | (((long) Math.round(f12)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f19326a, jVar.f19326a) == 0 && Float.compare(this.f19327b, jVar.f19327b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19327b) + (Float.floatToIntBits(this.f19326a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f19326a);
        sb.append(", verticalBias=");
        return p123m2.c.v(sb, this.f19327b, ')');
    }
}
