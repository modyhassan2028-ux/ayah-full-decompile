package D;

/* JADX INFO: renamed from: D.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0066i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0059b f977a = new C0059b(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0059b f978b = new C0059b(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0059b f979c = new C0059b(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0059b f980d = new C0059b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0061d f981e = new C0061d(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0061d f982f = new C0061d(3);
    public static final C0061d g = new C0061d(2);

    static {
        new C0061d(1);
    }

    public static void a(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f3 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f3);
                f3 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f3);
            f3 += i16;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public static void c(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = iArr.length == 0 ? 0.0f : (i10 - i12) / iArr.length;
        float f3 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f3);
                f3 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i16 + length;
        }
    }

    public static void e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f3 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f3);
                f3 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f3);
            f3 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f7 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f7);
            f7 += i16 + length;
            i11++;
            i15++;
        }
    }
}
