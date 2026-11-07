package ya;

import H9.m;
import H9.o;
import H9.v;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24718a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && j.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return r.f19440r;
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbW = p123m2.c.w(length2, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        long j = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i11 = i12;
                    } else {
                        j += (long) 4;
                        i11 += 2;
                    }
                }
                j += (long) i10;
            }
            i11++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        j.e(str, "host");
        m mVar = la.b.f19447a;
        m mVar2 = la.b.f19447a;
        mVar2.getClass();
        if (mVar2.f3641r.matcher(str).matches()) {
            String strB = la.b.b(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (j.a(strB, la.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            j.d(locale, "US");
            str = str.toLowerCase(locale);
            j.d(str, "toLowerCase(...)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (str.length() == 0 || v.R0(str, ".", false) || v.L0(str, "..") || lowerCase == null || lowerCase.length() == 0 || v.R0(lowerCase, ".", false) || v.L0(lowerCase, "..")) {
                    zA = false;
                } else {
                    String strConcat = !v.L0(str, ".") ? str.concat(".") : str;
                    if (!v.L0(lowerCase, ".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        j.d(locale2, "US");
                        lowerCase = lowerCase.toLowerCase(locale2);
                        j.d(lowerCase, "toLowerCase(...)");
                    }
                    if (!o.V0(lowerCase, "*")) {
                        zA = j.a(strConcat, lowerCase);
                    } else if (!v.R0(lowerCase, "*.", false) || o.b1(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        j.d(strSubstring, "substring(...)");
                        if (v.L0(strConcat, strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || o.g1(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        j.e(str, "host");
        j.e(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                j.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
