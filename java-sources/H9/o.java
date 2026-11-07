package H9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends v {
    public static boolean U0(CharSequence charSequence, char c10) {
        p251z9.j.e(charSequence, "<this>");
        return b1(charSequence, c10, 0, 2) >= 0;
    }

    public static boolean V0(CharSequence charSequence, CharSequence charSequence2) {
        p251z9.j.e(charSequence, "<this>");
        p251z9.j.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (c1(charSequence, (String) charSequence2, 0, 2) >= 0) {
                return true;
            }
        } else if (a1(charSequence, charSequence2, 0, charSequence.length(), false, false) >= 0) {
            return true;
        }
        return false;
    }

    public static String W0(int i10, String str) {
        p251z9.j.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean X0(CharSequence charSequence, String str) {
        p251z9.j.e(charSequence, "<this>");
        return charSequence instanceof String ? v.L0((String) charSequence, str) : i1(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int Y0(CharSequence charSequence) {
        p251z9.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Z0(CharSequence charSequence, String str, int i10, boolean z10) {
        p251z9.j.e(charSequence, "<this>");
        p251z9.j.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? a1(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int a1(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        E9.b bVar;
        if (z11) {
            int iY0 = Y0(charSequence);
            if (i10 > iY0) {
                i10 = iY0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            bVar = new E9.b(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            bVar = new E9.d(i10, i11, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = bVar.f1997t;
        int i13 = bVar.f1996s;
        int i14 = bVar.f1995r;
        if (!z12 || !(charSequence2 instanceof String)) {
            boolean z13 = z10;
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (i1(charSequence4, 0, charSequence3, i14, charSequence2.length(), z14)) {
                        return i14;
                    }
                    if (i14 != i13) {
                        i14 += i12;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            int i15 = i14;
            while (true) {
                String str = (String) charSequence2;
                boolean z15 = z10;
                if (v.N0(0, i15, str.length(), str, (String) charSequence, z15)) {
                    return i15;
                }
                if (i15 != i13) {
                    i15 += i12;
                    z10 = z15;
                }
            }
        }
        return -1;
    }

    public static int b1(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        p251z9.j.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? d1(charSequence, new char[]{c10}, i10, false) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int c1(CharSequence charSequence, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return Z0(charSequence, str, i10, false);
    }

    public static final int d1(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        p251z9.j.e(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iY0 = Y0(charSequence);
        if (i10 > iY0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c10 : cArr) {
                if (F9.n.u(c10, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iY0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean e1(CharSequence charSequence) {
        p251z9.j.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!F9.n.I(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static char f1(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(Y0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int g1(String str, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = Y0(str);
        }
        return str.lastIndexOf(c10, i10);
    }

    public static String h1(int i10, String str) {
        CharSequence charSequenceSubSequence;
        p251z9.j.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean i1(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        p251z9.j.e(charSequence, "<this>");
        p251z9.j.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!F9.n.u(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String j1(String str, String str2) {
        p251z9.j.e(str, "<this>");
        if (!v.R0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String k1(String str, String str2) {
        p251z9.j.e(str, "<this>");
        if (!X0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List l1(CharSequence charSequence, String str) {
        int iZ0 = Z0(charSequence, str, 0, false);
        if (iZ0 == -1) {
            return AbstractC0813f2.K(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iZ0).toString());
            length = str.length() + iZ0;
            iZ0 = Z0(charSequence, str, length, false);
        } while (iZ0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List m1(String str, char[] cArr) {
        p251z9.j.e(str, "<this>");
        if (cArr.length == 1) {
            return l1(str, String.valueOf(cArr[0]));
        }
        G9.n nVar = new G9.n(0, new G9.g(str, new G4.m(1, cArr)));
        ArrayList arrayList = new ArrayList(p120l9.n.a0(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            E9.d dVar = (E9.d) bVar.next();
            p251z9.j.e(dVar, "range");
            arrayList.add(str.subSequence(dVar.f1995r, dVar.f1996s + 1).toString());
        }
    }

    public static List n1(String str, String[] strArr) {
        p251z9.j.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return l1(str, str2);
            }
        }
        G9.n nVar = new G9.n(0, new G9.g(str, new G4.m(2, p120l9.l.S(strArr))));
        ArrayList arrayList = new ArrayList(p120l9.n.a0(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            E9.d dVar = (E9.d) bVar.next();
            p251z9.j.e(dVar, "range");
            arrayList.add(str.subSequence(dVar.f1995r, dVar.f1996s + 1).toString());
        }
    }

    public static boolean o1(String str, char c10) {
        return str.length() > 0 && F9.n.u(str.charAt(0), c10, false);
    }

    public static String p1(char c10, String str, String str2) {
        int iB1 = b1(str, c10, 0, 6);
        if (iB1 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iB1 + 1, str.length());
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String q1(String str, String str2) {
        p251z9.j.e(str2, "delimiter");
        int iC1 = c1(str, str2, 0, 6);
        if (iC1 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iC1, str.length());
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String r1(String str, String str2) {
        p251z9.j.e(str, "<this>");
        p251z9.j.e(str, "missingDelimiterValue");
        int iC1 = c1(str, str2, 0, 6);
        if (iC1 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iC1);
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String s1(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence t1(String str) {
        p251z9.j.e(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zI = F9.n.I(str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1);
    }
}
