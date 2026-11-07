package i7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.measurement.R3;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class O extends I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f17038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f17039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f17040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f17042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f17043F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f17044G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f17045H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17046t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f17047u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f17049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f17050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17051y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f17052z;

    public O(C1023u0 c1023u0, long j, long j10) {
        super(c1023u0);
        this.f17044G = 0L;
        this.f17045H = null;
        this.f17052z = j;
        this.f17038A = j10;
    }

    @Override // i7.I
    public final boolean r() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0274 A[Catch: NameNotFoundException -> 0x027c, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x027c, blocks: (B:99:0x026e, B:101:0x0274), top: B:134:0x026e }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0277 A[PHI: r5 r37
      0x0277: PHI (r5v20 int) = (r5v19 int), (r5v21 int) binds: [B:105:0x027c, B:100:0x0272] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r37v2 char) = (r37v1 char), (r37v4 char) binds: [B:105:0x027c, B:100:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01da  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0203  */
    /* JADX WARN: Code duplicated, block: B:79:0x0206  */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x023a  */
    /* JADX WARN: Code duplicated, block: B:93:0x023c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0257  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final X1 s(String str) {
        String str2;
        String str3;
        char c10;
        long j;
        boolean zA;
        boolean z10;
        Class<?> clsLoadClass;
        long j10;
        Object objInvoke;
        String str4;
        long jMin;
        long jA;
        int i10;
        Boolean boolA;
        char c11;
        boolean z11;
        int i11;
        String str5;
        Boolean boolA2;
        boolean zBooleanValue;
        C1023u0 c1023u0;
        String strU;
        char c12;
        int i12;
        int i13;
        long j11;
        ApplicationInfo applicationInfo;
        F f3;
        int iK;
        o();
        String strU2 = u();
        String strV = v();
        p();
        String str6 = this.f17047u;
        p();
        long j12 = this.f17048v;
        p();
        U6.y.f(this.f17049w);
        String str7 = this.f17049w;
        C1023u0 c1023u1 = (C1023u0) this.f16104r;
        C0981g c0981g = c1023u1.f17582u;
        X x9 = c1023u1.f17584w;
        C0981g c0981g2 = c1023u1.f17582u;
        Context context = c1023u1.f17579r;
        V1 v10 = c1023u1.f17587z;
        C0985h0 c0985h0 = c1023u1.f17583v;
        c0981g.t();
        p();
        o();
        long j13 = this.f17051y;
        long jL = 0;
        if (j13 == 0) {
            C1023u0.k(v10);
            C1023u0 c1023u2 = (C1023u0) v10.f16104r;
            String packageName = context.getPackageName();
            v10.o();
            U6.y.c(packageName);
            PackageManager packageManager = context.getPackageManager();
            c10 = 0;
            MessageDigest messageDigestF = V1.F();
            long jG = -1;
            if (messageDigestF == null) {
                X x10 = c1023u2.f17584w;
                C1023u0.m(x10);
                x10.f17182w.a("Could not get MD5 instance");
                str2 = strV;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (v10.T(context, packageName)) {
                            str2 = strV;
                            str3 = str6;
                            jG = 0;
                        } else {
                            str2 = strV;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = Z6.b.a(context).b(64, c1023u2.f17579r.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        X x11 = c1023u2.f17584w;
                                        C1023u0.m(x11);
                                        x11.f17185z.a("Could not get signatures");
                                    } else {
                                        jG = V1.G(messageDigestF.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e10) {
                                    e = e10;
                                    X x12 = c1023u2.f17584w;
                                    C1023u0.m(x12);
                                    x12.f17182w.b(e, "Package name not found");
                                    j = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                e = e11;
                                str3 = str6;
                                X x13 = c1023u2.f17584w;
                                C1023u0.m(x13);
                                x13.f17182w.b(e, "Package name not found");
                                j = 0;
                                this.f17051y = j;
                                zA = c1023u1.a();
                                C1023u0.k(c0985h0);
                                boolean z12 = !c0985h0.f17392I;
                                o();
                                if (c1023u1.a()) {
                                    z10 = zA;
                                    if (c0981g2.y(null, G.f16899I0)) {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                j10 = j;
                                                try {
                                                    Class<?>[] clsArr = new Class[1];
                                                    clsArr[c10] = Context.class;
                                                    Method declaredMethod = clsLoadClass.getDeclaredMethod("getInstance", clsArr);
                                                    Object[] objArr = new Object[1];
                                                    objArr[c10] = context;
                                                    objInvoke = declaredMethod.invoke(null, objArr);
                                                    if (objInvoke == null) {
                                                        str4 = null;
                                                    } else {
                                                        try {
                                                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            C1023u0.m(x9);
                                                            x9.f17175B.a("Failed to retrieve Firebase Instance Id");
                                                            str4 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    C1023u0.m(x9);
                                                    x9.f17174A.a("Failed to obtain Firebase Analytics instance");
                                                }
                                                jMin = c1023u1.U;
                                                C1023u0.k(c0985h0);
                                                jA = c0985h0.f17403w.a();
                                                if (jA != 0) {
                                                    jMin = Math.min(jMin, jA);
                                                }
                                                p();
                                                i10 = this.f17041D;
                                                boolA = c0981g2.A("google_analytics_adid_collection_enabled");
                                                if (boolA != null) {
                                                    c11 = 1;
                                                } else {
                                                    c11 = 1;
                                                }
                                                C1023u0.k(c0985h0);
                                                c0985h0.o();
                                                String str8 = str4;
                                                long j14 = jMin;
                                                boolean z13 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
                                                if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z11);
                                                List list = this.f17039B;
                                                String strG = c0985h0.v().g();
                                                if (this.f17040C == null) {
                                                    C1023u0.k(v10);
                                                    this.f17040C = v10.i0();
                                                }
                                                String str9 = this.f17040C;
                                                if (c0985h0.v().i(G0.f16990t)) {
                                                    o();
                                                    if (this.f17044G == 0) {
                                                        i11 = i10;
                                                    } else {
                                                        c1023u1.f17564B.getClass();
                                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17044G;
                                                        i11 = i10;
                                                        if (this.f17043F != null) {
                                                            t();
                                                        }
                                                    }
                                                    if (this.f17043F == null) {
                                                        t();
                                                    }
                                                    str5 = this.f17043F;
                                                } else {
                                                    i11 = i10;
                                                    str5 = null;
                                                }
                                                boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
                                                if (boolA2 == null) {
                                                    zBooleanValue = false;
                                                } else {
                                                    zBooleanValue = boolA2.booleanValue();
                                                }
                                                C1023u0.k(v10);
                                                c1023u0 = (C1023u0) v10.f16104r;
                                                String str10 = str5;
                                                strU = u();
                                                boolean z14 = zBooleanValue;
                                                if (c1023u0.f17579r.getPackageManager() == null) {
                                                    c12 = c11;
                                                    j11 = 0;
                                                } else {
                                                    try {
                                                        c12 = c11;
                                                        i12 = 0;
                                                        try {
                                                            applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
                                                            if (applicationInfo != null) {
                                                                i13 = applicationInfo.targetSdkVersion;
                                                            } else {
                                                                i13 = i12;
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused3) {
                                                            X x14 = c1023u0.f17584w;
                                                            C1023u0.m(x14);
                                                            x14.f17176C.b(strU, "PackageManager failed to find running app: app_id");
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused4) {
                                                        c12 = c11;
                                                        i12 = 0;
                                                    }
                                                    j11 = i13;
                                                }
                                                C1023u0.k(c0985h0);
                                                int i14 = c0985h0.v().f17000b;
                                                C1023u0.k(c0985h0);
                                                c0985h0.o();
                                                String str11 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
                                                R3.a();
                                                f3 = G.f16914R0;
                                                if (c0981g2.y(null, f3)) {
                                                    C1023u0.k(v10);
                                                    iK = V1.K();
                                                } else {
                                                    iK = 0;
                                                }
                                                R3.a();
                                                if (c0981g2.y(null, f3)) {
                                                    C1023u0.k(v10);
                                                    jL = v10.L();
                                                }
                                                String str12 = c0981g2.f17359t;
                                                String strValueOf = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
                                                long j15 = c1023u1.U;
                                                C1023u0.j(c1023u1.f17574L);
                                                return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z12, str8, j14, i11, (boolean) c12, z13, boolValueOf, this.f17052z, list, strG, str9, str10, z14, j11, i14, str11, iK, jL, str12, strValueOf, j15, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
                                            }
                                        } catch (ClassNotFoundException unused5) {
                                        }
                                        str4 = null;
                                        jMin = c1023u1.U;
                                        C1023u0.k(c0985h0);
                                        jA = c0985h0.f17403w.a();
                                        if (jA != 0) {
                                            jMin = Math.min(jMin, jA);
                                        }
                                        p();
                                        i10 = this.f17041D;
                                        boolA = c0981g2.A("google_analytics_adid_collection_enabled");
                                        if (boolA != null) {
                                            c11 = 1;
                                        } else {
                                            c11 = 1;
                                        }
                                        C1023u0.k(c0985h0);
                                        c0985h0.o();
                                        String str13 = str4;
                                        long j16 = jMin;
                                        boolean z15 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
                                        if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(z11);
                                        List list2 = this.f17039B;
                                        String strG2 = c0985h0.v().g();
                                        if (this.f17040C == null) {
                                            C1023u0.k(v10);
                                            this.f17040C = v10.i0();
                                        }
                                        String str14 = this.f17040C;
                                        if (c0985h0.v().i(G0.f16990t)) {
                                            i11 = i10;
                                            str5 = null;
                                        } else {
                                            o();
                                            if (this.f17044G == 0) {
                                                i11 = i10;
                                            } else {
                                                c1023u1.f17564B.getClass();
                                                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f17044G;
                                                i11 = i10;
                                                if (this.f17043F != null) {
                                                    t();
                                                }
                                            }
                                            if (this.f17043F == null) {
                                                t();
                                            }
                                            str5 = this.f17043F;
                                        }
                                        boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
                                        if (boolA2 == null) {
                                            zBooleanValue = false;
                                        } else {
                                            zBooleanValue = boolA2.booleanValue();
                                        }
                                        C1023u0.k(v10);
                                        c1023u0 = (C1023u0) v10.f16104r;
                                        String str15 = str5;
                                        strU = u();
                                        boolean z16 = zBooleanValue;
                                        if (c1023u0.f17579r.getPackageManager() == null) {
                                            c12 = c11;
                                            j11 = 0;
                                        } else {
                                            c12 = c11;
                                            i12 = 0;
                                            applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
                                            if (applicationInfo != null) {
                                                i13 = applicationInfo.targetSdkVersion;
                                            } else {
                                                i13 = i12;
                                            }
                                            j11 = i13;
                                        }
                                        C1023u0.k(c0985h0);
                                        int i15 = c0985h0.v().f17000b;
                                        C1023u0.k(c0985h0);
                                        c0985h0.o();
                                        String str16 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
                                        R3.a();
                                        f3 = G.f16914R0;
                                        if (c0981g2.y(null, f3)) {
                                            C1023u0.k(v10);
                                            iK = V1.K();
                                        } else {
                                            iK = 0;
                                        }
                                        R3.a();
                                        if (c0981g2.y(null, f3)) {
                                            C1023u0.k(v10);
                                            jL = v10.L();
                                        }
                                        String str17 = c0981g2.f17359t;
                                        String strValueOf2 = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
                                        long j17 = c1023u1.U;
                                        C1023u0.j(c1023u1.f17574L);
                                        return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z12, str13, j16, i11, (boolean) c12, z15, boolValueOf2, this.f17052z, list2, strG2, str14, str15, z16, j11, i15, str16, iK, jL, str17, strValueOf2, j17, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
                                    }
                                    C1023u0.m(x9);
                                    x9.f17178E.a("Disabled IID for tests.");
                                } else {
                                    z10 = zA;
                                }
                                j10 = j;
                                str4 = null;
                                jMin = c1023u1.U;
                                C1023u0.k(c0985h0);
                                jA = c0985h0.f17403w.a();
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                p();
                                i10 = this.f17041D;
                                boolA = c0981g2.A("google_analytics_adid_collection_enabled");
                                if (boolA != null) {
                                    c11 = 1;
                                } else {
                                    c11 = 1;
                                }
                                C1023u0.k(c0985h0);
                                c0985h0.o();
                                String str18 = str4;
                                long j18 = jMin;
                                boolean z17 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
                                if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z11);
                                List list3 = this.f17039B;
                                String strG3 = c0985h0.v().g();
                                if (this.f17040C == null) {
                                    C1023u0.k(v10);
                                    this.f17040C = v10.i0();
                                }
                                String str19 = this.f17040C;
                                if (c0985h0.v().i(G0.f16990t)) {
                                    i11 = i10;
                                    str5 = null;
                                } else {
                                    o();
                                    if (this.f17044G == 0) {
                                        i11 = i10;
                                    } else {
                                        c1023u1.f17564B.getClass();
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.f17044G;
                                        i11 = i10;
                                        if (this.f17043F != null) {
                                            t();
                                        }
                                    }
                                    if (this.f17043F == null) {
                                        t();
                                    }
                                    str5 = this.f17043F;
                                }
                                boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
                                if (boolA2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolA2.booleanValue();
                                }
                                C1023u0.k(v10);
                                c1023u0 = (C1023u0) v10.f16104r;
                                String str110 = str5;
                                strU = u();
                                boolean z18 = zBooleanValue;
                                if (c1023u0.f17579r.getPackageManager() == null) {
                                    c12 = c11;
                                    j11 = 0;
                                } else {
                                    c12 = c11;
                                    i12 = 0;
                                    applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
                                    if (applicationInfo != null) {
                                        i13 = applicationInfo.targetSdkVersion;
                                    } else {
                                        i13 = i12;
                                    }
                                    j11 = i13;
                                }
                                C1023u0.k(c0985h0);
                                int i16 = c0985h0.v().f17000b;
                                C1023u0.k(c0985h0);
                                c0985h0.o();
                                String str111 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
                                R3.a();
                                f3 = G.f16914R0;
                                if (c0981g2.y(null, f3)) {
                                    C1023u0.k(v10);
                                    iK = V1.K();
                                } else {
                                    iK = 0;
                                }
                                R3.a();
                                if (c0981g2.y(null, f3)) {
                                    C1023u0.k(v10);
                                    jL = v10.L();
                                }
                                String str112 = c0981g2.f17359t;
                                String strValueOf3 = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j19 = c1023u1.U;
                                C1023u0.j(c1023u1.f17574L);
                                return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z12, str18, j18, i11, (boolean) c12, z17, boolValueOf3, this.f17052z, list3, strG3, str19, str110, z18, j11, i16, str111, iK, jL, str112, strValueOf3, j19, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e = e12;
                        str2 = strV;
                    }
                } else {
                    str2 = strV;
                    str3 = str6;
                }
                j = 0;
                this.f17051y = j;
            }
            j = jG;
            this.f17051y = j;
        } else {
            str2 = strV;
            str3 = str6;
            c10 = 0;
            j = j13;
        }
        zA = c1023u1.a();
        C1023u0.k(c0985h0);
        boolean z19 = !c0985h0.f17392I;
        o();
        if (c1023u1.a()) {
            z10 = zA;
        } else {
            z10 = zA;
            if (c0981g2.y(null, G.f16899I0)) {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    j10 = j;
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[c10] = Context.class;
                    Method declaredMethod2 = clsLoadClass.getDeclaredMethod("getInstance", clsArr2);
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = context;
                    objInvoke = declaredMethod2.invoke(null, objArr2);
                    if (objInvoke == null) {
                        str4 = null;
                    } else {
                        str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                    jMin = c1023u1.U;
                    C1023u0.k(c0985h0);
                    jA = c0985h0.f17403w.a();
                    if (jA != 0) {
                        jMin = Math.min(jMin, jA);
                    }
                    p();
                    i10 = this.f17041D;
                    boolA = c0981g2.A("google_analytics_adid_collection_enabled");
                    if (boolA != null || boolA.booleanValue()) {
                        c11 = 1;
                    } else {
                        c11 = c10;
                    }
                    C1023u0.k(c0985h0);
                    c0985h0.o();
                    String str113 = str4;
                    long j110 = jMin;
                    boolean z110 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
                    if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z11);
                    List list4 = this.f17039B;
                    String strG4 = c0985h0.v().g();
                    if (this.f17040C == null) {
                        C1023u0.k(v10);
                        this.f17040C = v10.i0();
                    }
                    String str114 = this.f17040C;
                    if (c0985h0.v().i(G0.f16990t)) {
                        i11 = i10;
                        str5 = null;
                    } else {
                        o();
                        if (this.f17044G == 0) {
                            i11 = i10;
                        } else {
                            c1023u1.f17564B.getClass();
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - this.f17044G;
                            i11 = i10;
                            if (this.f17043F != null && jCurrentTimeMillis4 > 86400000 && this.f17045H == null) {
                                t();
                            }
                        }
                        if (this.f17043F == null) {
                            t();
                        }
                        str5 = this.f17043F;
                    }
                    boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
                    if (boolA2 == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolA2.booleanValue();
                    }
                    C1023u0.k(v10);
                    c1023u0 = (C1023u0) v10.f16104r;
                    String str115 = str5;
                    strU = u();
                    boolean z111 = zBooleanValue;
                    if (c1023u0.f17579r.getPackageManager() == null) {
                        c12 = c11;
                        j11 = 0;
                    } else {
                        c12 = c11;
                        i12 = 0;
                        applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
                        if (applicationInfo != null) {
                            i13 = applicationInfo.targetSdkVersion;
                        } else {
                            i13 = i12;
                        }
                        j11 = i13;
                    }
                    C1023u0.k(c0985h0);
                    int i17 = c0985h0.v().f17000b;
                    C1023u0.k(c0985h0);
                    c0985h0.o();
                    String str116 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
                    R3.a();
                    f3 = G.f16914R0;
                    if (c0981g2.y(null, f3)) {
                        C1023u0.k(v10);
                        iK = V1.K();
                    } else {
                        iK = 0;
                    }
                    R3.a();
                    if (c0981g2.y(null, f3)) {
                        C1023u0.k(v10);
                        jL = v10.L();
                    }
                    String str117 = c0981g2.f17359t;
                    String strValueOf4 = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j111 = c1023u1.U;
                    C1023u0.j(c1023u1.f17574L);
                    return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z19, str113, j110, i11, (boolean) c12, z110, boolValueOf4, this.f17052z, list4, strG4, str114, str115, z111, j11, i17, str116, iK, jL, str117, strValueOf4, j111, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
                }
                str4 = null;
                jMin = c1023u1.U;
                C1023u0.k(c0985h0);
                jA = c0985h0.f17403w.a();
                if (jA != 0) {
                    jMin = Math.min(jMin, jA);
                }
                p();
                i10 = this.f17041D;
                boolA = c0981g2.A("google_analytics_adid_collection_enabled");
                if (boolA != null) {
                    c11 = 1;
                } else {
                    c11 = 1;
                }
                C1023u0.k(c0985h0);
                c0985h0.o();
                String str118 = str4;
                long j112 = jMin;
                boolean z112 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
                if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z11);
                List list5 = this.f17039B;
                String strG5 = c0985h0.v().g();
                if (this.f17040C == null) {
                    C1023u0.k(v10);
                    this.f17040C = v10.i0();
                }
                String str119 = this.f17040C;
                if (c0985h0.v().i(G0.f16990t)) {
                    i11 = i10;
                    str5 = null;
                } else {
                    o();
                    if (this.f17044G == 0) {
                        i11 = i10;
                    } else {
                        c1023u1.f17564B.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - this.f17044G;
                        i11 = i10;
                        if (this.f17043F != null) {
                            t();
                        }
                    }
                    if (this.f17043F == null) {
                        t();
                    }
                    str5 = this.f17043F;
                }
                boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
                if (boolA2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolA2.booleanValue();
                }
                C1023u0.k(v10);
                c1023u0 = (C1023u0) v10.f16104r;
                String str1110 = str5;
                strU = u();
                boolean z113 = zBooleanValue;
                if (c1023u0.f17579r.getPackageManager() == null) {
                    c12 = c11;
                    j11 = 0;
                } else {
                    c12 = c11;
                    i12 = 0;
                    applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
                    if (applicationInfo != null) {
                        i13 = applicationInfo.targetSdkVersion;
                    } else {
                        i13 = i12;
                    }
                    j11 = i13;
                }
                C1023u0.k(c0985h0);
                int i18 = c0985h0.v().f17000b;
                C1023u0.k(c0985h0);
                c0985h0.o();
                String str1111 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
                R3.a();
                f3 = G.f16914R0;
                if (c0981g2.y(null, f3)) {
                    C1023u0.k(v10);
                    iK = V1.K();
                } else {
                    iK = 0;
                }
                R3.a();
                if (c0981g2.y(null, f3)) {
                    C1023u0.k(v10);
                    jL = v10.L();
                }
                String str1112 = c0981g2.f17359t;
                String strValueOf5 = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
                long j113 = c1023u1.U;
                C1023u0.j(c1023u1.f17574L);
                return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z19, str118, j112, i11, (boolean) c12, z112, boolValueOf5, this.f17052z, list5, strG5, str119, str1110, z113, j11, i18, str1111, iK, jL, str1112, strValueOf5, j113, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
            }
            C1023u0.m(x9);
            x9.f17178E.a("Disabled IID for tests.");
        }
        j10 = j;
        str4 = null;
        jMin = c1023u1.U;
        C1023u0.k(c0985h0);
        jA = c0985h0.f17403w.a();
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        p();
        i10 = this.f17041D;
        boolA = c0981g2.A("google_analytics_adid_collection_enabled");
        if (boolA != null) {
            c11 = 1;
        } else {
            c11 = 1;
        }
        C1023u0.k(c0985h0);
        c0985h0.o();
        String str1113 = str4;
        long j114 = jMin;
        boolean z114 = c0985h0.s().getBoolean("deferred_analytics_collection", c10);
        if (c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true) != E0.f16865v) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean boolValueOf6 = Boolean.valueOf(z11);
        List list6 = this.f17039B;
        String strG6 = c0985h0.v().g();
        if (this.f17040C == null) {
            C1023u0.k(v10);
            this.f17040C = v10.i0();
        }
        String str1114 = this.f17040C;
        if (c0985h0.v().i(G0.f16990t)) {
            i11 = i10;
            str5 = null;
        } else {
            o();
            if (this.f17044G == 0) {
                i11 = i10;
            } else {
                c1023u1.f17564B.getClass();
                long jCurrentTimeMillis6 = System.currentTimeMillis() - this.f17044G;
                i11 = i10;
                if (this.f17043F != null) {
                    t();
                }
            }
            if (this.f17043F == null) {
                t();
            }
            str5 = this.f17043F;
        }
        boolA2 = c0981g2.A("google_analytics_sgtm_upload_enabled");
        if (boolA2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolA2.booleanValue();
        }
        C1023u0.k(v10);
        c1023u0 = (C1023u0) v10.f16104r;
        String str1115 = str5;
        strU = u();
        boolean z115 = zBooleanValue;
        if (c1023u0.f17579r.getPackageManager() == null) {
            c12 = c11;
            j11 = 0;
        } else {
            c12 = c11;
            i12 = 0;
            applicationInfo = ((Context) Z6.b.a(c1023u0.f17579r).f5961a).getPackageManager().getApplicationInfo(strU, 0);
            if (applicationInfo != null) {
                i13 = applicationInfo.targetSdkVersion;
            } else {
                i13 = i12;
            }
            j11 = i13;
        }
        C1023u0.k(c0985h0);
        int i19 = c0985h0.v().f17000b;
        C1023u0.k(c0985h0);
        c0985h0.o();
        String str1116 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17491b;
        R3.a();
        f3 = G.f16914R0;
        if (c0981g2.y(null, f3)) {
            C1023u0.k(v10);
            iK = V1.K();
        } else {
            iK = 0;
        }
        R3.a();
        if (c0981g2.y(null, f3)) {
            C1023u0.k(v10);
            jL = v10.L();
        }
        String str1117 = c0981g2.f17359t;
        String strValueOf6 = String.valueOf(H0.h(c0981g2.D("google_analytics_default_allow_ad_personalization_signals", true)));
        long j115 = c1023u1.U;
        C1023u0.j(c1023u1.f17574L);
        return new X1(strU2, str2, str3, j12, str7, 133005L, j10, str, z10, z19, str1113, j114, i11, (boolean) c12, z114, boolValueOf6, this.f17052z, list6, strG6, str1114, str1115, z115, j11, i19, str1116, iK, jL, str1117, strValueOf6, j115, android.support.v4.media.session.p.m(c1023u1.f17574L.t()));
    }

    public final void t() {
        String str;
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        X x9 = c1023u0.f17584w;
        C1023u0.k(c0985h0);
        if (c0985h0.v().i(G0.f16990t)) {
            byte[] bArr = new byte[16];
            V1 v10 = c1023u0.f17587z;
            C1023u0.k(v10);
            v10.n0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C1023u0.m(x9);
            x9.f17177D.a("Analytics Storage consent is not granted");
            str = null;
        }
        C1023u0.m(x9);
        x9.f17177D.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f17043F = str;
        c1023u0.f17564B.getClass();
        this.f17044G = System.currentTimeMillis();
    }

    public final String u() {
        p();
        U6.y.f(this.f17046t);
        return this.f17046t;
    }

    public final String v() {
        o();
        p();
        U6.y.f(this.f17042E);
        return this.f17042E;
    }
}
