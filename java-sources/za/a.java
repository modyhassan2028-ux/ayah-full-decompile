package za;

import Da.h;
import H9.o;
import java.io.EOFException;
import la.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24889a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i10, int i11, String str2, int i12) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z10 = (i12 & 8) == 0;
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        boolean z13 = (i12 & 64) == 0;
        j.e(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || o.U0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !b(str, iCharCount, length)))) || (iCodePointAt == 43 && z12)))) {
                h hVar = new h();
                hVar.e0(str, i13, iCharCount);
                h hVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i14 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            hVar.d0("+");
                        } else if (iCodePointAt2 == 43 && z12) {
                            hVar.d0(z10 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i14 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z13) && !o.U0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z10 && (!z11 || b(str, iCharCount, length))))) {
                                    hVar.f0(iCodePointAt2);
                                }
                            }
                            if (hVar2 == null) {
                                hVar2 = new h();
                            }
                            hVar2.f0(iCodePointAt2);
                            while (!hVar2.y()) {
                                byte b5 = hVar2.readByte();
                                hVar.O(37);
                                char[] cArr = f24889a;
                                hVar.O(cArr[((b5 & 255) >> 4) & 15]);
                                hVar.O(cArr[b5 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                }
                return hVar.E();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean b(String str, int i10, int i11) {
        j.e(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && c.j(str.charAt(i10 + 1)) != -1 && c.j(str.charAt(i12)) != -1;
    }

    public static String c(int i10, int i11, int i12, String str) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z10 = (i12 & 4) == 0;
        j.e(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                h hVar = new h();
                hVar.e0(str, i10, iCharCount);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iJ = c.j(str.charAt(iCharCount + 1));
                        int iJ2 = c.j(str.charAt(i13));
                        if (iJ == -1 || iJ2 == -1) {
                            hVar.f0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            hVar.O((iJ << 4) + iJ2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        hVar.O(32);
                        iCharCount++;
                    } else {
                        hVar.f0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return hVar.E();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        j.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
