package p063g1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16246a;

    public /* synthetic */ a(long j) {
        this.f16246a = j;
    }

    public static long a(long j, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j);
        }
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i10, i11, i12, i13);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final boolean c(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i10 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j >> (i11 + 15))) & i12;
        int i14 = ((int) (j >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean f(long j) {
        int i10 = (int) (3 & j);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j >> 2)) & i11;
        int i13 = ((int) (j >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int g(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int h(long j) {
        int i10 = (int) (3 & j);
        int i11 = (int) (j >> 33);
        int i12 = i11 & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int i(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j) {
        int i10 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j));
        sb.append(", maxHeight = ");
        return p245z2.a.F(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f16246a == ((a) obj).f16246a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16246a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return k(this.f16246a);
    }
}
