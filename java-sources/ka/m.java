package ka;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19179a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19182d;
    public ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f19185h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19180b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19181c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19183e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f19184f = AbstractC0813f2.M("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iB1 = H9.o.b1(str, '&', i10, 4);
            if (iB1 == -1) {
                iB1 = str.length();
            }
            int iB2 = H9.o.b1(str, '=', i10, 4);
            if (iB2 == -1 || iB2 > iB1) {
                String strSubstring = str.substring(i10, iB1);
                p251z9.j.d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iB2);
                p251z9.j.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iB2 + 1, iB1);
                p251z9.j.d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i10 = iB1 + 1;
        }
        return arrayList;
    }

    public final n a() {
        ArrayList arrayList;
        String str = this.f19179a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strC = za.a.c(0, 0, 7, this.f19180b);
        String strC2 = za.a.c(0, 0, 7, this.f19181c);
        String str2 = this.f19182d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f19184f;
        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList3.add(za.a.c(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(p120l9.n.a0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList4.get(i11);
                i11++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? za.a.c(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f19185h;
        return new n(str, strC, strC2, str2, iB, arrayList3, arrayList, str4 != null ? za.a.c(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i10 = this.f19183e;
        if (i10 != -1) {
            return i10;
        }
        String str = this.f19179a;
        p251z9.j.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0025  */
    public final void c(n nVar, String str) {
        int i10;
        int iB;
        int i11;
        char cCharAt;
        byte[] bArr = la.c.f19448a;
        int iF = la.c.f(str, 0, str.length());
        int iG = la.c.g(str, iF, str.length());
        if (iG - iF < 2) {
            i10 = -1;
            break;
        }
        char cCharAt2 = str.charAt(iF);
        if ((p251z9.j.f(cCharAt2, 97) < 0 || p251z9.j.f(cCharAt2, 122) > 0) && (p251z9.j.f(cCharAt2, 65) < 0 || p251z9.j.f(cCharAt2, 90) > 0)) {
            i10 = -1;
            break;
        }
        i10 = iF + 1;
        while (true) {
            if (i10 < iG) {
                char cCharAt3 = str.charAt(i10);
                if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                }
                i10++;
            }
            i10 = -1;
            break;
        }
        if (i10 == -1) {
            if (nVar == null) {
                throw new IllegalArgumentException(p123m2.c.s("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? H9.o.s1(6, str).concat("...") : str));
            }
            this.f19179a = nVar.f19186a;
        } else if (H9.v.Q0(iF, str, "https:", true)) {
            this.f19179a = "https";
            iF += 6;
        } else {
            if (!H9.v.Q0(iF, str, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = str.substring(0, i10);
                p251z9.j.d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f19179a = "http";
            iF += 5;
        }
        int i12 = 0;
        for (int i13 = iF; i13 < iG && ((cCharAt = str.charAt(i13)) == '/' || cCharAt == '\\'); i13++) {
            i12++;
        }
        ArrayList arrayList = this.f19184f;
        char c10 = '#';
        if (i12 >= 2 || nVar == null || !p251z9.j.a(nVar.f19186a, this.f19179a)) {
            int i14 = iF + i12;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                iB = la.c.b(i14, iG, str, "@/\\?#");
                byte bCharAt = iB != iG ? str.charAt(iB) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z10) {
                        this.f19181c += "%40" + za.a.a(str, i14, iB, " \"':;<=>@[]^`{}|/\\?#", 112);
                        z10 = z10;
                    } else {
                        boolean z12 = z10;
                        int iC = la.c.c(str, ':', i14, iB);
                        String strA = za.a.a(str, i14, iC, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (z11) {
                            strA = this.f19180b + "%40" + strA;
                        }
                        this.f19180b = strA;
                        if (iC != iB) {
                            this.f19181c = za.a.a(str, iC + 1, iB, " \"':;<=>@[]^`{}|/\\?#", 112);
                            z10 = true;
                        } else {
                            z10 = z12;
                        }
                        z11 = true;
                    }
                    i14 = iB + 1;
                    c10 = '#';
                }
            }
            int i15 = i14;
            while (true) {
                if (i15 >= iB) {
                    i15 = iB;
                    break;
                }
                char cCharAt4 = str.charAt(i15);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i15++;
                        if (i15 >= iB) {
                            break;
                        }
                    } while (str.charAt(i15) != ']');
                }
                i15++;
            }
            int i16 = i15 + 1;
            if (i16 < iB) {
                this.f19182d = la.b.b(za.a.c(i14, i15, 4, str));
                try {
                    i11 = Integer.parseInt(za.a.a(str, i16, iB, "", 120));
                    if (1 > i11 || i11 >= 65536) {
                        i11 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f19183e = i11;
                if (i11 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i16, iB);
                    p251z9.j.d(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f19182d = la.b.b(za.a.c(i14, i15, 4, str));
                String str2 = this.f19179a;
                p251z9.j.b(str2);
                this.f19183e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.f19182d == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i14, i15);
                p251z9.j.d(strSubstring3, "substring(...)");
                sb3.append(strSubstring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            iF = iB;
        } else {
            this.f19180b = nVar.e();
            this.f19181c = nVar.a();
            this.f19182d = nVar.f19189d;
            this.f19183e = nVar.f19190e;
            arrayList.clear();
            arrayList.addAll(nVar.c());
            if (iF == iG || str.charAt(iF) == '#') {
                String strD = nVar.d();
                this.g = strD != null ? d(za.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iB2 = la.c.b(iF, iG, str, "?#");
        if (iF != iB2) {
            char cCharAt5 = str.charAt(iF);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iF++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iF < iB2) {
                int iB3 = la.c.b(iF, iB2, str, "/\\");
                boolean z13 = iB3 < iB2;
                String strA2 = za.a.a(str, iF, iB3, " \"<>^`{}|/\\?#", 112);
                if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                    if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) p123m2.c.q(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strA2);
                        } else {
                            arrayList.add(strA2);
                        }
                        if (z13) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iF = z13 ? iB3 + 1 : iB3;
            }
        }
        if (iB2 < iG && str.charAt(iB2) == '?') {
            int iC2 = la.c.c(str, '#', iB2, iG);
            this.g = d(za.a.a(str, iB2 + 1, iC2, " \"'<>#", 80));
            iB2 = iC2;
        }
        if (iB2 >= iG || str.charAt(iB2) != '#') {
            return;
        }
        this.f19185h = za.a.a(str, iB2 + 1, iG, "", 48);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f19179a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f19180b.length() > 0 || this.f19181c.length() > 0) {
            sb.append(this.f19180b);
            if (this.f19181c.length() > 0) {
                sb.append(':');
                sb.append(this.f19181c);
            }
            sb.append('@');
        }
        String str2 = this.f19182d;
        if (str2 != null) {
            if (H9.o.U0(str2, ':')) {
                sb.append('[');
                sb.append(this.f19182d);
                sb.append(']');
            } else {
                sb.append(this.f19182d);
            }
        }
        int i10 = -1;
        if (this.f19183e != -1 || this.f19179a != null) {
            int iB = b();
            String str3 = this.f19179a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i10 = 80;
                } else if (str3.equals("https")) {
                    i10 = 443;
                }
                if (iB != i10) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        ArrayList arrayList = this.f19184f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb.append('/');
            sb.append((String) arrayList.get(i11));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            p251z9.j.b(arrayList2);
            E9.b bVarG0 = B0.c.g0(B0.c.i0(0, arrayList2.size()), 2);
            int i12 = bVarG0.f1995r;
            int i13 = bVarG0.f1996s;
            int i14 = bVarG0.f1997t;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i12);
                    String str5 = (String) arrayList2.get(i12 + 1);
                    if (i12 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
        }
        if (this.f19185h != null) {
            sb.append('#');
            sb.append(this.f19185h);
        }
        return sb.toString();
    }
}
