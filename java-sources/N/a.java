package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f5886a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5887b = 0;

    public static long a(float f3, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }
}
