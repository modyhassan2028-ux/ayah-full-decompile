package p180s0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f21814b = F.h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21815c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21816a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M) {
            return this.f21816a == ((M) obj).f21816a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21816a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d(this.f21816a);
    }
}
