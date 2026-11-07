package p187t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f22505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f22506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f22507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f22508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22509e = 0;

    static {
        long j = 3;
        long j10 = j << 32;
        f22505a = (((long) 0) & 4294967295L) | j10;
        f22506b = (((long) 1) & 4294967295L) | j10;
        f22507c = j10 | (((long) 2) & 4294967295L);
        f22508d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        if (a(j, f22505a)) {
            return "Rgb";
        }
        if (a(j, f22506b)) {
            return "Xyz";
        }
        if (a(j, f22507c)) {
            return "Lab";
        }
        return a(j, f22508d) ? "Cmyk" : "Unknown";
    }
}
