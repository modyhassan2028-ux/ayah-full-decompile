package i7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H0 f16998c = new H0(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f16999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17000b;

    public H0(int i10) {
        EnumMap enumMap = new EnumMap(G0.class);
        this.f16999a = enumMap;
        G0 g10 = G0.f16989s;
        E0 e10 = E0.f16862s;
        enumMap.put(g10, e10);
        enumMap.put(G0.f16990t, e10);
        this.f17000b = i10;
    }

    public static String a(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static H0 b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new H0(i10);
        }
        EnumMap enumMap = new EnumMap(G0.class);
        for (G0 g10 : F0.STORAGE.f16878r) {
            enumMap.put(g10, d(bundle.getString(g10.f16994r)));
        }
        return new H0(enumMap, i10);
    }

    public static H0 c(int i10, String str) {
        EnumMap enumMap = new EnumMap(G0.class);
        G0[] g0Arr = F0.STORAGE.f16878r;
        for (int i11 = 0; i11 < g0Arr.length; i11++) {
            String str2 = str == null ? "" : str;
            G0 g10 = g0Arr[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(g10, e(str2.charAt(i12)));
            } else {
                enumMap.put(g10, E0.f16862s);
            }
        }
        return new H0(enumMap, i10);
    }

    public static E0 d(String str) {
        E0 e10 = E0.f16862s;
        if (str == null) {
            return e10;
        }
        if (str.equals("granted")) {
            return E0.f16865v;
        }
        return str.equals("denied") ? E0.f16864u : e10;
    }

    public static E0 e(char c10) {
        if (c10 == '+') {
            return E0.f16863t;
        }
        if (c10 != '0') {
            return c10 != '1' ? E0.f16862s : E0.f16865v;
        }
        return E0.f16864u;
    }

    public static char h(E0 e10) {
        if (e10 == null) {
            return '-';
        }
        int iOrdinal = e10.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h7 = (H0) obj;
        for (G0 g10 : F0.STORAGE.f16878r) {
            if (this.f16999a.get(g10) != h7.f16999a.get(g10)) {
                return false;
            }
        }
        return this.f17000b == h7.f17000b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (G0 g10 : F0.STORAGE.f16878r) {
            E0 e10 = (E0) this.f16999a.get(g10);
            char c10 = '-';
            if (e10 != null && (iOrdinal = e10.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb.append(c10);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (G0 g10 : F0.STORAGE.f16878r) {
            sb.append(h((E0) this.f16999a.get(g10)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f16999a.values().iterator();
        int iHashCode = this.f17000b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((E0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(G0 g10) {
        return ((E0) this.f16999a.get(g10)) != E0.f16864u;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final H0 j(H0 h7) {
        EnumMap enumMap = new EnumMap(G0.class);
        for (G0 g10 : F0.STORAGE.f16878r) {
            E0 e10 = (E0) this.f16999a.get(g10);
            E0 e11 = (E0) h7.f16999a.get(g10);
            if (e10 == null) {
                e10 = e11;
            } else if (e11 != null) {
                E0 e12 = E0.f16862s;
                if (e10 == e12) {
                    e10 = e11;
                } else if (e11 != e12) {
                    E0 e13 = E0.f16863t;
                    if (e10 == e13) {
                        e10 = e11;
                    } else if (e11 != e13) {
                        E0 e14 = E0.f16864u;
                        e10 = (e10 == e14 || e11 == e14) ? e14 : E0.f16865v;
                    }
                }
            }
            if (e10 != null) {
                enumMap.put(g10, e10);
            }
        }
        return new H0(enumMap, 100);
    }

    public final H0 k(H0 h7) {
        EnumMap enumMap = new EnumMap(G0.class);
        for (G0 g10 : F0.STORAGE.f16878r) {
            E0 e10 = (E0) this.f16999a.get(g10);
            if (e10 == E0.f16862s) {
                e10 = (E0) h7.f16999a.get(g10);
            }
            if (e10 != null) {
                enumMap.put(g10, e10);
            }
        }
        return new H0(enumMap, this.f17000b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.f17000b));
        for (G0 g10 : F0.STORAGE.f16878r) {
            sb.append(",");
            sb.append(g10.f16994r);
            sb.append("=");
            E0 e10 = (E0) this.f16999a.get(g10);
            if (e10 == null) {
                e10 = E0.f16862s;
            }
            sb.append(e10);
        }
        return sb.toString();
    }

    public H0(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(G0.class);
        this.f16999a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17000b = i10;
    }
}
