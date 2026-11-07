package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21400a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        long j10 = (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1)))) & j;
        return (((j10 & 4294967295L) & (j10 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public static String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + a.f(Float.intBitsToFloat((int) (j >> 32))) + ", " + a.f(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f21400a == ((i) obj).f21400a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21400a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return f(this.f21400a);
    }
}
