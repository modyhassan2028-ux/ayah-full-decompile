package I2;

import H9.o;
import java.io.IOException;
import java.util.Locale;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Q2.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R2.a f3798r;

    public a(R2.a aVar) {
        j.e(aVar, "db");
        this.f3798r = aVar;
    }

    @Override // Q2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g a0(String str) {
        String strSubstring;
        int i10;
        j.e(str, "sql");
        R2.a aVar = this.f3798r;
        j.e(aVar, "db");
        String upperCase = o.t1(str).toString().toUpperCase(Locale.ROOT);
        j.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i11 = -1;
        if (length >= 0) {
            int iB1 = 0;
            loop0: while (iB1 < length) {
                char cCharAt = upperCase.charAt(iB1);
                if (j.f(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iB2 = iB1 + 1;
                            if (upperCase.charAt(iB2) == '*') {
                                do {
                                    iB2 = o.b1(upperCase, '*', iB2 + 1, 4);
                                    if (iB2 >= 0) {
                                        i10 = iB2 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i10) != '/');
                                iB1 = iB2 + 2;
                            }
                        }
                        i11 = iB1;
                        break;
                    }
                    if (upperCase.charAt(iB1 + 1) == '-') {
                        iB1 = o.b1(upperCase, '\n', iB1 + 2, 4);
                        if (iB1 < 0) {
                            break;
                        }
                    } else {
                        i11 = iB1;
                        break;
                    }
                }
                iB1++;
            }
        }
        if (i11 < 0 || i11 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i11, Math.min(i11 + 3, upperCase.length()));
            j.d(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new f(aVar, str);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new f(aVar, str);
        }
        e eVar = new e(aVar, str);
        eVar.f3806u = new int[0];
        eVar.f3807v = new long[0];
        eVar.f3808w = new double[0];
        eVar.f3809x = new String[0];
        eVar.f3810y = new byte[0][];
        return eVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3798r.close();
    }
}
