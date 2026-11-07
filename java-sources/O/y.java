package O;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R0.v f6432c = new R0.v("SelectionHandleInfo");

    static {
        float f3 = 25;
        f6430a = f3;
        f6431b = f3;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
