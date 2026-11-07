package Ea;

import Da.w;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2005a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final int b(w wVar, int i10) {
        int i11;
        int[] iArr = wVar.f1405w;
        int i12 = i10 + 1;
        int length = wVar.f1404v.length;
        j.e(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }
}
