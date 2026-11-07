package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17963a;

    static {
        int[] iArr = new int[g.values().length];
        f17963a = iArr;
        try {
            iArr[g.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17963a[g.QUARTER_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
