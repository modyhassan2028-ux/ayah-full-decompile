package u;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: u.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1361p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f22744a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f22745b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f22746c = new Object();

    public static final void a(P p10) {
        int i10 = p10.f22707u;
        int[] iArr = p10.f22705s;
        Object[] objArr = p10.f22706t;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f22746c) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        p10.f22704r = false;
        p10.f22707u = i11;
    }

    public static final void b(C1351f c1351f, int i10) {
        c1351f.f22724r = new int[i10];
        c1351f.f22725s = new Object[i10];
    }

    public static final int c(C1351f c1351f, Object obj, int i10) {
        int i11 = c1351f.f22726t;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = p204v.a.a(i11, i10, c1351f.f22724r);
            if (iA < 0 || p251z9.j.a(obj, c1351f.f22725s[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && c1351f.f22724r[i12] == i10) {
                if (p251z9.j.a(obj, c1351f.f22725s[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && c1351f.f22724r[i13] == i10; i13--) {
                if (p251z9.j.a(obj, c1351f.f22725s[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
