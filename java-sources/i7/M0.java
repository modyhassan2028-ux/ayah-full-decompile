package i7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends AbstractC1002n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y0 f17031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Y0 y10, D0 d1, int i10) {
        super(d1);
        this.f17030e = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(y10);
                this.f17031f = y10;
                super(d1);
                break;
            case 2:
                Objects.requireNonNull(y10);
                this.f17031f = y10;
                super(d1);
                break;
            case 3:
                this.f17031f = y10;
                super(d1);
                break;
            default:
                Objects.requireNonNull(y10);
                this.f17031f = y10;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:76:0x0203  */
    /* JADX WARN: Code duplicated, block: B:77:0x0205  */
    /* JADX WARN: Code duplicated, block: B:82:0x0293 A[Catch: IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, TryCatch #5 {IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, blocks: (B:80:0x024b, B:82:0x0293, B:87:0x029e, B:89:0x02a4, B:91:0x02ac, B:92:0x02b2, B:93:0x02b6), top: B:116:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02a4 A[Catch: IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, TryCatch #5 {IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, blocks: (B:80:0x024b, B:82:0x0293, B:87:0x029e, B:89:0x02a4, B:91:0x02ac, B:92:0x02b2, B:93:0x02b6), top: B:116:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ac A[Catch: IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, TryCatch #5 {IllegalArgumentException -> 0x029a, MalformedURLException -> 0x029c, blocks: (B:80:0x024b, B:82:0x0293, B:87:0x029e, B:89:0x02a4, B:91:0x02ac, B:92:0x02b2, B:93:0x02b6), top: B:116:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d0  */
    @Override // i7.AbstractC1002n
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C1021t1 c1021t1P;
        C1023u0 c1023u0;
        J j;
        C0987i c0987iM0;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i10;
        String str2;
        String string;
        C1023u0 c1023u1;
        URL url;
        String strConcat;
        switch (this.f17030e) {
            case 0:
                Y0 y10 = ((C1023u0) this.f17031f.f16104r).f17566D;
                C1023u0.l(y10);
                new Thread(new L0(y10, 0)).start();
                break;
            case 1:
                this.f17031f.N();
                break;
            case 2:
                this.f17031f.u();
                break;
            default:
                Y0 y11 = this.f17031f;
                C1023u0 c1023u2 = (C1023u0) y11.f16104r;
                C0985h0 c0985h0 = c1023u2.f17583v;
                X x9 = c1023u2.f17584w;
                C1014r0 c1014r0 = c1023u2.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                C0971c1 c0971c1 = c1023u2.f17568F;
                C1023u0.m(c0971c1);
                C1023u0 c1023u3 = (C1023u0) c0971c1.f16104r;
                C1023u0.m(c0971c1);
                String strU = c1023u2.r().u();
                Boolean boolA = c1023u2.f17582u.A("google_analytics_adid_collection_enabled");
                boolean z10 = false;
                if (boolA == null || boolA.booleanValue()) {
                    C1023u0.k(c0985h0);
                    C1023u0 c1023u4 = (C1023u0) c0985h0.f16104r;
                    c0985h0.o();
                    if (c0985h0.v().i(G0.f16989s)) {
                        c1023u4.f17564B.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = c0985h0.f17405y;
                        if (str3 == null || jElapsedRealtime >= c0985h0.f17384A) {
                            c0985h0.f17384A = c1023u4.f17582u.v(strU, G.f16931b) + jElapsedRealtime;
                            try {
                                F2.v vVarA = P6.a.a(c1023u4.f17579r);
                                c0985h0.f17405y = "";
                                String str4 = vVarA.f2330b;
                                if (str4 != null) {
                                    c0985h0.f17405y = str4;
                                }
                                c0985h0.f17406z = vVarA.f2331c;
                            } catch (Exception e10) {
                                X x10 = c1023u4.f17584w;
                                C1023u0.m(x10);
                                x10.f17177D.b(e10, "Unable to get advertising id");
                                c0985h0.f17405y = "";
                            }
                            pair = new Pair(c0985h0.f17405y, Boolean.valueOf(c0985h0.f17406z));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(c0985h0.f17406z));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        C1023u0.m(c0971c1);
                        c0971c1.q();
                        ConnectivityManager connectivityManager = (ConnectivityManager) c1023u3.f17579r.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            C1021t1 c1021t1P2 = c1023u2.p();
                            c1021t1P2.o();
                            c1021t1P2.p();
                            if (!c1021t1P2.v()) {
                                Y0 y12 = c1023u2.f17566D;
                                C1023u0.l(y12);
                                C1023u0 c1023u5 = (C1023u0) y12.f16104r;
                                y12.o();
                                c1021t1P = c1023u5.p();
                                c1023u0 = (C1023u0) c1021t1P.f16104r;
                                c1021t1P.o();
                                c1021t1P.p();
                                j = c1021t1P.f17552u;
                                if (j == null) {
                                    c1021t1P.u();
                                    X x11 = c1023u0.f17584w;
                                    C1023u0.m(x11);
                                    x11.f17177D.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        c0987iM0 = j.m0(c1021t1P.E(false));
                                        c1021t1P.B();
                                    } catch (RemoteException e11) {
                                        X x12 = c1023u0.f17584w;
                                        C1023u0.m(x12);
                                        x12.f17182w.b(e11, "Failed to get consents; remote exception");
                                        c0987iM0 = null;
                                    }
                                    if (c0987iM0 != null) {
                                        bundle = c0987iM0.f17412r;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = c1023u2.S;
                                        c1023u2.S = i10 + 1;
                                        z10 = i10 < 10;
                                        C1023u0.m(x9);
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        V v10 = x9.f17177D;
                                        StringBuilder sb2 = new StringBuilder(str2.length() + 60);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        sb2.append(str2);
                                        sb2.append(" retryCount");
                                        v10.b(Integer.valueOf(c1023u2.S), sb2.toString());
                                    } else {
                                        H0 h0B = H0.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(h0B.f());
                                        C1005o c1005oC = C1005o.c(100, bundle);
                                        str = c1005oC.f17493d;
                                        sb.append("&dma=");
                                        Boolean bool2 = c1005oC.f17492c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = H0.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i11 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i11);
                                        C1023u0.m(x9);
                                        x9.f17178E.b(sb, "Consent query parameters to Bow");
                                        V1 v11 = c1023u2.f17587z;
                                        C1023u0.k(v11);
                                        ((C1023u0) c1023u2.r().f16104r).f17582u.t();
                                        String str5 = (String) pair.first;
                                        long jA = c0985h0.f17395L.a() - 1;
                                        string = sb.toString();
                                        c1023u1 = (C1023u0) v11.f16104r;
                                        try {
                                            U6.y.c(str5);
                                            U6.y.c(strU);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v11.W()) + "&rdid=" + str5 + "&bundleid=" + strU + "&retry=" + jA;
                                            if (strU.equals(c1023u1.f17582u.s("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e12) {
                                            e = e12;
                                            X x13 = c1023u1.f17584w;
                                            C1023u0.m(x13);
                                            x13.f17182w.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e13) {
                                            e = e13;
                                            X x14 = c1023u1.f17584w;
                                            C1023u0.m(x14);
                                            x14.f17182w.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            C1023u0.m(c0971c1);
                                            C1020t0 c1020t0 = new C1020t0(c1023u2);
                                            c0971c1.q();
                                            C1014r0 c1014r1 = c1023u3.f17585x;
                                            C1023u0.m(c1014r1);
                                            c1014r1.A(new RunnableC0964a0(c0971c1, strU, url, (byte[]) null, (HashMap) null, c1020t0));
                                        }
                                    }
                                }
                                c0987iM0 = null;
                                if (c0987iM0 != null) {
                                    bundle = c0987iM0.f17412r;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i10 = c1023u2.S;
                                    c1023u2.S = i10 + 1;
                                    if (i10 < 10) {
                                    }
                                    C1023u0.m(x9);
                                    if (i10 < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    V v12 = x9.f17177D;
                                    StringBuilder sb3 = new StringBuilder(str2.length() + 60);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    sb3.append(str2);
                                    sb3.append(" retryCount");
                                    v12.b(Integer.valueOf(c1023u2.S), sb3.toString());
                                } else {
                                    H0 h0B2 = H0.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(h0B2.f());
                                    C1005o c1005oC2 = C1005o.c(100, bundle);
                                    str = c1005oC2.f17493d;
                                    sb.append("&dma=");
                                    Boolean bool3 = c1005oC2.f17492c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = H0.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i12 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i12);
                                    C1023u0.m(x9);
                                    x9.f17178E.b(sb, "Consent query parameters to Bow");
                                    V1 v13 = c1023u2.f17587z;
                                    C1023u0.k(v13);
                                    ((C1023u0) c1023u2.r().f16104r).f17582u.t();
                                    String str6 = (String) pair.first;
                                    long jA2 = c0985h0.f17395L.a() - 1;
                                    string = sb.toString();
                                    c1023u1 = (C1023u0) v13.f16104r;
                                    U6.y.c(str6);
                                    U6.y.c(strU);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v13.W()) + "&rdid=" + str6 + "&bundleid=" + strU + "&retry=" + jA2;
                                    if (strU.equals(c1023u1.f17582u.s("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C1023u0.m(c0971c1);
                                        C1020t0 c1020t1 = new C1020t0(c1023u2);
                                        c0971c1.q();
                                        C1014r0 c1014r2 = c1023u3.f17585x;
                                        C1023u0.m(c1014r2);
                                        c1014r2.A(new RunnableC0964a0(c0971c1, strU, url, (byte[]) null, (HashMap) null, c1020t1));
                                    }
                                }
                                break;
                            } else {
                                V1 v14 = ((C1023u0) c1021t1P2.f16104r).f17587z;
                                C1023u0.k(v14);
                                if (v14.W() >= 234200) {
                                    Y0 y13 = c1023u2.f17566D;
                                    C1023u0.l(y13);
                                    C1023u0 c1023u6 = (C1023u0) y13.f16104r;
                                    y13.o();
                                    c1021t1P = c1023u6.p();
                                    c1023u0 = (C1023u0) c1021t1P.f16104r;
                                    c1021t1P.o();
                                    c1021t1P.p();
                                    j = c1021t1P.f17552u;
                                    if (j == null) {
                                        c1021t1P.u();
                                        X x15 = c1023u0.f17584w;
                                        C1023u0.m(x15);
                                        x15.f17177D.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        c0987iM0 = j.m0(c1021t1P.E(false));
                                        c1021t1P.B();
                                        if (c0987iM0 != null) {
                                            bundle = c0987iM0.f17412r;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i10 = c1023u2.S;
                                            c1023u2.S = i10 + 1;
                                            if (i10 < 10) {
                                            }
                                            C1023u0.m(x9);
                                            if (i10 < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            V v15 = x9.f17177D;
                                            StringBuilder sb4 = new StringBuilder(str2.length() + 60);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            sb4.append(str2);
                                            sb4.append(" retryCount");
                                            v15.b(Integer.valueOf(c1023u2.S), sb4.toString());
                                        } else {
                                            H0 h0B3 = H0.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(h0B3.f());
                                            C1005o c1005oC3 = C1005o.c(100, bundle);
                                            str = c1005oC3.f17493d;
                                            sb.append("&dma=");
                                            Boolean bool4 = c1005oC3.f17492c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = H0.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i13 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i13);
                                            C1023u0.m(x9);
                                            x9.f17178E.b(sb, "Consent query parameters to Bow");
                                            V1 v16 = c1023u2.f17587z;
                                            C1023u0.k(v16);
                                            ((C1023u0) c1023u2.r().f16104r).f17582u.t();
                                            String str7 = (String) pair.first;
                                            long jA3 = c0985h0.f17395L.a() - 1;
                                            string = sb.toString();
                                            c1023u1 = (C1023u0) v16.f16104r;
                                            U6.y.c(str7);
                                            U6.y.c(strU);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v16.W()) + "&rdid=" + str7 + "&bundleid=" + strU + "&retry=" + jA3;
                                            if (strU.equals(c1023u1.f17582u.s("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                C1023u0.m(c0971c1);
                                                C1020t0 c1020t2 = new C1020t0(c1023u2);
                                                c0971c1.q();
                                                C1014r0 c1014r3 = c1023u3.f17585x;
                                                C1023u0.m(c1014r3);
                                                c1014r3.A(new RunnableC0964a0(c0971c1, strU, url, (byte[]) null, (HashMap) null, c1020t2));
                                            }
                                        }
                                    }
                                    c0987iM0 = null;
                                    if (c0987iM0 != null) {
                                        bundle = c0987iM0.f17412r;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = c1023u2.S;
                                        c1023u2.S = i10 + 1;
                                        if (i10 < 10) {
                                        }
                                        C1023u0.m(x9);
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        V v17 = x9.f17177D;
                                        StringBuilder sb5 = new StringBuilder(str2.length() + 60);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        sb5.append(str2);
                                        sb5.append(" retryCount");
                                        v17.b(Integer.valueOf(c1023u2.S), sb5.toString());
                                    } else {
                                        H0 h0B4 = H0.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(h0B4.f());
                                        C1005o c1005oC4 = C1005o.c(100, bundle);
                                        str = c1005oC4.f17493d;
                                        sb.append("&dma=");
                                        Boolean bool5 = c1005oC4.f17492c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = H0.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i14 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i14);
                                        C1023u0.m(x9);
                                        x9.f17178E.b(sb, "Consent query parameters to Bow");
                                        V1 v18 = c1023u2.f17587z;
                                        C1023u0.k(v18);
                                        ((C1023u0) c1023u2.r().f16104r).f17582u.t();
                                        String str8 = (String) pair.first;
                                        long jA4 = c0985h0.f17395L.a() - 1;
                                        string = sb.toString();
                                        c1023u1 = (C1023u0) v18.f16104r;
                                        U6.y.c(str8);
                                        U6.y.c(strU);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v18.W()) + "&rdid=" + str8 + "&bundleid=" + strU + "&retry=" + jA4;
                                        if (strU.equals(c1023u1.f17582u.s("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            C1023u0.m(c0971c1);
                                            C1020t0 c1020t3 = new C1020t0(c1023u2);
                                            c0971c1.q();
                                            C1014r0 c1014r4 = c1023u3.f17585x;
                                            C1023u0.m(c1014r4);
                                            c1014r4.A(new RunnableC0964a0(c0971c1, strU, url, (byte[]) null, (HashMap) null, c1020t3));
                                        }
                                    }
                                } else {
                                    V1 v19 = c1023u2.f17587z;
                                    C1023u0.k(v19);
                                    ((C1023u0) c1023u2.r().f16104r).f17582u.t();
                                    String str9 = (String) pair.first;
                                    long jA5 = c0985h0.f17395L.a() - 1;
                                    string = sb.toString();
                                    c1023u1 = (C1023u0) v19.f16104r;
                                    U6.y.c(str9);
                                    U6.y.c(strU);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v19.W()) + "&rdid=" + str9 + "&bundleid=" + strU + "&retry=" + jA5;
                                    if (strU.equals(c1023u1.f17582u.s("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C1023u0.m(c0971c1);
                                        C1020t0 c1020t4 = new C1020t0(c1023u2);
                                        c0971c1.q();
                                        C1014r0 c1014r5 = c1023u3.f17585x;
                                        C1023u0.m(c1014r5);
                                        c1014r5.A(new RunnableC0964a0(c0971c1, strU, url, (byte[]) null, (HashMap) null, c1020t4));
                                    }
                                }
                            }
                        } else {
                            C1023u0.m(x9);
                            x9.f17185z.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        C1023u0.m(x9);
                        x9.f17178E.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    C1023u0.m(x9);
                    x9.f17178E.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (z10) {
                    y11.f17228K.b(2000L);
                }
                break;
        }
    }
}
