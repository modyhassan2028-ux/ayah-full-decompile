package la;

import Da.k;
import H9.o;
import I1.V;
import R7.f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19448a = new byte[0];

    static {
        k kVar = k.f1363u;
        p000a.a.R(f.j("efbbbf"), f.j("feff"), f.j("fffe0000"), f.j("fffe"), f.j("0000feff"));
    }

    public static final void a(Closeable closeable) {
        j.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final int b(int i10, int i11, String str, String str2) {
        j.e(str, "<this>");
        while (i10 < i11) {
            if (o.U0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int c(String str, char c10, int i10, int i11) {
        j.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator comparator) {
        j.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                V vH = j.h(strArr2);
                while (vH.hasNext()) {
                    if (comparator.compare(str, (String) vH.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int e(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (j.f(cCharAt, 31) <= 0 || j.f(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int f(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int g(String str, int i10, int i11) {
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] h(String[] strArr, String[] strArr2, Comparator comparator) {
        j.e(strArr, "<this>");
        j.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String str) {
        j.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int j(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int k(Da.j jVar) {
        j.e(jVar, "<this>");
        return (jVar.readByte() & 255) | ((jVar.readByte() & 255) << 16) | ((jVar.readByte() & 255) << 8);
    }

    public static final int l(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String m(String str, int i10, int i11) {
        int iF = f(str, i10, i11);
        String strSubstring = str.substring(iF, g(str, iF, i11));
        j.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
