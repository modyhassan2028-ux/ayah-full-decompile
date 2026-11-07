package j$.time.zone;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18018a;

    static {
        int[] iArr = new int[d.values().length];
        f18018a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18018a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
