package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class O1 {
    public static final Object g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile E1 f14083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f14084i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.f f14085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f14088d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f14089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14090f;

    static {
        new AtomicReference();
        f14084i = new AtomicInteger();
    }

    public /* synthetic */ O1(G1.f fVar, String str, Object obj, int i10) {
        this.f14090f = i10;
        if (((Uri) fVar.f2781s) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14085a = fVar;
        this.f14086b = str;
        this.f14087c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f14090f) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String string = obj.toString();
                String str = this.f14086b;
                StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
                sb.append("Invalid long value for ");
                sb.append(str);
                sb.append(": ");
                sb.append(string);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (A1.f13991b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (A1.f13992c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String string2 = obj.toString();
                String str3 = this.f14086b;
                StringBuilder sb2 = new StringBuilder(str3.length() + 28 + string2.length());
                sb2.append("Invalid boolean value for ");
                sb2.append(str3);
                sb2.append(": ");
                sb2.append(string2);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String string3 = obj.toString();
                String str4 = this.f14086b;
                StringBuilder sb3 = new StringBuilder(str4.length() + 27 + string3.length());
                sb3.append("Invalid double value for ");
                sb3.append(str4);
                sb3.append(": ");
                sb3.append(string3);
                Log.e("PhenotypeFlag", sb3.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 b8.b) = (r2v0 b8.b), (r2v5 b8.b), (r2v5 b8.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    public final Object b() {
        String str;
        Object objA;
        String strG;
        u.O o10;
        int i10 = f14084i.get();
        if (this.f14088d < i10) {
            synchronized (this) {
                try {
                    if (this.f14088d < i10) {
                        E1 e10 = f14083h;
                        b8.b bVar = b8.a.f13327r;
                        Object objA2 = null;
                        if (e10 != null) {
                            bVar = (b8.b) e10.f14020b.get();
                            if (bVar.b()) {
                                H1 h7 = (H1) bVar.a();
                                Uri uri = (Uri) this.f14085a.f2781s;
                                String str2 = this.f14086b;
                                if (uri != null) {
                                    o10 = (u.O) h7.f14041a.get(uri.toString());
                                } else {
                                    h7.getClass();
                                    o10 = null;
                                }
                                if (o10 == null) {
                                    str = null;
                                } else {
                                    str = (String) o10.get("".concat(str2));
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (!(e10 != null)) {
                            throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                        }
                        G1.f fVar = this.f14085a;
                        Uri uri2 = (Uri) fVar.f2781s;
                        if (uri2 == null) {
                            Context context = e10.f14019a;
                            throw null;
                        }
                        G1 g1A = M1.a(e10.f14019a, uri2) ? G1.a(e10.f14019a.getContentResolver(), uri2, P1.f14100r) : null;
                        if (g1A != null) {
                            String str3 = (String) g1A.b().get(this.f14086b);
                            if (str3 != null) {
                                objA = a(str3);
                            } else {
                                objA = null;
                            }
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!fVar.f2780r && (strG = J1.e(e10.f14019a).g(this.f14086b)) != null) {
                                objA2 = a(strG);
                            }
                            objA = objA2 == null ? this.f14087c : objA2;
                        }
                        if (bVar.b()) {
                            objA = str == null ? this.f14087c : a(str);
                        }
                        this.f14089e = objA;
                        this.f14088d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f14089e;
    }
}
