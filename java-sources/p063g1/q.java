package p063g1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16269a;

    public static long a(long j, float f3, float f7, int i10) {
        if ((i10 & 1) != 0) {
            f3 = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i10 & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(long j, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f3;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static String g(long j) {
        return "(" + b(j) + ", " + c(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f16269a == ((q) obj).f16269a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16269a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return g(this.f16269a);
    }
}
