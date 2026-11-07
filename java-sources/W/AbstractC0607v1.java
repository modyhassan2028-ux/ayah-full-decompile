package W;

/* JADX INFO: renamed from: W.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0607v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9424a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static /* synthetic */ boolean a(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f9424a, 0, iArr, 0, i10);
        return iArr;
    }
}
