package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21387a;

    public static long a(long j, float f3, int i10) {
        float fIntBitsToFloat = (i10 & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i10 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final float c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final long g(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long h(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(long j, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f3;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static String j(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + a.f(Float.intBitsToFloat((int) (j >> 32))) + ", " + a.f(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f21387a == ((c) obj).f21387a;
        }
        return false;
    }

    public final int hashCode() {
        return f(this.f21387a);
    }

    public final String toString() {
        return j(this.f21387a);
    }
}
