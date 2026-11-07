package l0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19323a;

    public g(float f3) {
        this.f19323a = f3;
    }

    @Override // l0.e
    public final long a(long j, long j10, p063g1.m mVar) {
        long j11 = (((long) (((int) (j10 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f3 = 1;
        float f7 = (this.f19323a + f3) * (((int) (j11 >> 32)) / 2.0f);
        return (((long) Math.round((f3 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f7)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f19323a, ((g) obj).f19323a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f19323a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f19323a + ", verticalBias=-1.0)";
    }
}
