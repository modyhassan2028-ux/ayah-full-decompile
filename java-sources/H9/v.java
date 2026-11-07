package H9;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends u {
    public static boolean L0(String str, String str2) {
        p251z9.j.e(str, "<this>");
        p251z9.j.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static final void M0(String str) {
        throw new NumberFormatException(p245z2.a.A('\'', "Invalid number format: '", str));
    }

    public static boolean N0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        p251z9.j.e(str, "<this>");
        p251z9.j.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String O0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        p251z9.j.b(string);
        return string;
    }

    public static String P0(String str, String str2, String str3) {
        p251z9.j.e(str, "<this>");
        int iZ0 = o.Z0(str, str2, 0, false);
        if (iZ0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, iZ0);
            sb.append(str3);
            i11 = iZ0 + length;
            if (iZ0 >= str.length()) {
                break;
            }
            iZ0 = o.Z0(str, str2, iZ0 + i10, false);
        } while (iZ0 > 0);
        sb.append((CharSequence) str, i11, str.length());
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public static boolean Q0(int i10, String str, String str2, boolean z10) {
        p251z9.j.e(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : N0(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean R0(String str, String str2, boolean z10) {
        p251z9.j.e(str, "<this>");
        p251z9.j.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : N0(0, 0, str2.length(), str, str2, z10);
    }

    public static Integer S0(String str) {
        boolean z10;
        int i10;
        int i11;
        p251z9.j.e(str, "<this>");
        F9.n.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (p251z9.j.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long T0(String str) {
        boolean z10;
        p251z9.j.e(str, "<this>");
        F9.n.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (p251z9.j.f(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j / ((long) 10);
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * ((long) 10);
            long j13 = iDigit;
            if (j12 < j + j13) {
                return null;
            }
            j10 = j12 - j13;
            i10++;
        }
        return z10 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
