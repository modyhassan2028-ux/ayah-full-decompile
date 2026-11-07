package p204v;

import java.util.NoSuchElementException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f22998a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f22999b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f23000c = new Object[0];

    public static final int a(int i10, int i11, int[] iArr) {
        j.e(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j) {
        j.e(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = jArr[i13];
            if (j10 < j) {
                i12 = i13 + 1;
            } else {
                if (j10 <= j) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        j.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        j.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        j.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
