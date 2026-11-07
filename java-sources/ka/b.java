package ka;

import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f19106r = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f19107s = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f19108t = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f19126d.put(str, fVar);
        return fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static y c(String str) {
        p251z9.j.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return y.f19291v;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return y.f19290u;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return y.f19289t;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return y.f19292w;
            }
        } else if (str.equals("SSLv3")) {
            return y.f19293x;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static s d(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return s.f19247t;
        }
        if (str.equals("http/1.1")) {
            return s.f19248u;
        }
        if (str.equals("h2_prior_knowledge")) {
            return s.f19251x;
        }
        if (str.equals("h2")) {
            return s.f19250w;
        }
        if (str.equals("spdy/3.1")) {
            return s.f19249v;
        }
        if (str.equals("quic")) {
            return s.f19252y;
        }
        if (H9.v.R0(str, "h3", false)) {
            return s.f19253z;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public synchronized f b(String str) {
        f fVar;
        String strConcat;
        try {
            p251z9.j.e(str, "javaName");
            LinkedHashMap linkedHashMap = f.f19126d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (H9.v.R0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    p251z9.j.d(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (H9.v.R0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    p251z9.j.d(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                fVar = (f) linkedHashMap.get(strConcat);
                if (fVar == null) {
                    fVar = new f(str);
                }
                linkedHashMap.put(str, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
