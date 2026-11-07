package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18267a;

    static {
        int[] iArr = new int[Z2.values().length];
        f18267a = iArr;
        try {
            iArr[Z2.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18267a[Z2.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18267a[Z2.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18267a[Z2.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
