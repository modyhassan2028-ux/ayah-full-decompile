package i7;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17053r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f17056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17058w;

    public O0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.N n6, String str, String str2, boolean z10) {
        this.f17057v = n6;
        this.f17054s = str;
        this.f17055t = str2;
        this.f17056u = z10;
        this.f17058w = appMeasurementDynamiteService;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0107 A[Catch: RuntimeException -> 0x00e1, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0170 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0191 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        X x9;
        Bundle bundleP0;
        String str;
        X x10;
        V v10;
        Bundle bundleP1;
        switch (this.f17053r) {
            case 0:
                C1021t1 c1021t1P = ((AppMeasurementDynamiteService) this.f17058w).f14525f.p();
                com.google.android.gms.internal.measurement.N n6 = (com.google.android.gms.internal.measurement.N) this.f17057v;
                String str2 = (String) this.f17054s;
                String str3 = (String) this.f17055t;
                c1021t1P.o();
                c1021t1P.p();
                c1021t1P.C(new RunnableC0995k1(c1021t1P, str2, str3, c1021t1P.E(false), this.f17056u, n6));
                break;
            case 1:
                String str4 = (String) this.f17054s;
                String str5 = (String) this.f17055t;
                C1021t1 c1021t1P2 = ((C1023u0) ((Y0) this.f17058w).f16104r).p();
                AtomicReference atomicReference = (AtomicReference) this.f17057v;
                c1021t1P2.o();
                c1021t1P2.p();
                c1021t1P2.C(new RunnableC0995k1(c1021t1P2, atomicReference, str4, str5, c1021t1P2.E(false), this.f17056u));
                break;
            case 2:
                U0 u8 = (U0) this.f17058w;
                Y0 y10 = u8.f17155r;
                y10.o();
                C1023u0 c1023u0 = (C1023u0) y10.f16104r;
                C1020t0 c1020t0 = y10.f17226I;
                String str6 = (String) this.f17055t;
                Uri uri = (Uri) this.f17057v;
                try {
                    V1 v11 = c1023u0.f17587z;
                    X x11 = c1023u0.f17584w;
                    C1023u0.k(v11);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            x9 = x11;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    x9 = x11;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        X x12 = ((C1023u0) v11.f16104r).f17584w;
                                        C1023u0.m(x12);
                                        x12.f17177D.a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.f17054s;
                                    if (this.f17056u) {
                                        V1 v12 = c1023u0.f17587z;
                                        C1023u0.k(v12);
                                        bundleP1 = v12.p0(uri);
                                        if (bundleP1 != null) {
                                            bundleP1.putString("_cis", "intent");
                                            if (bundleP1.containsKey("gclid") && bundleP0 != null && bundleP0.containsKey("gclid")) {
                                                bundleP1.putString("_cer", "gclid=" + bundleP0.getString("gclid"));
                                            }
                                            y10.v(str, "_cmp", bundleP1);
                                            c1020t0.a(str, bundleP1);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        C1023u0.m(x9);
                                        x10 = x9;
                                        v10 = x10.f17177D;
                                        v10.b(str6, "Activity created with referrer");
                                        if (c1023u0.f17582u.y(null, G.f16897H0)) {
                                            if (bundleP0 != null) {
                                                y10.v(str, "_cmp", bundleP0);
                                                c1020t0.a(str, bundleP0);
                                            } else {
                                                C1023u0.m(x10);
                                                v10.b(str6, "Referrer does not contain valid parameters");
                                            }
                                            c1023u0.f17564B.getClass();
                                            y10.y("auto", "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            C1023u0.m(x10);
                                            v10.a(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            c1023u0.f17564B.getClass();
                                            y10.y("auto", "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    x9 = x11;
                                }
                                bundleP0 = v11.p0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleP0 != null) {
                                    bundleP0.putString("_cis", "referrer");
                                }
                                str = (String) this.f17054s;
                                if (this.f17056u) {
                                    V1 v13 = c1023u0.f17587z;
                                    C1023u0.k(v13);
                                    bundleP1 = v13.p0(uri);
                                    if (bundleP1 != null) {
                                        bundleP1.putString("_cis", "intent");
                                        if (bundleP1.containsKey("gclid")) {
                                        }
                                        y10.v(str, "_cmp", bundleP1);
                                        c1020t0.a(str, bundleP1);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    C1023u0.m(x9);
                                    x10 = x9;
                                    v10 = x10.f17177D;
                                    v10.b(str6, "Activity created with referrer");
                                    if (c1023u0.f17582u.y(null, G.f16897H0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        C1023u0.m(x10);
                                        v10.a(str7);
                                    } else {
                                        if (bundleP0 != null) {
                                            y10.v(str, "_cmp", bundleP0);
                                            c1020t0.a(str, bundleP0);
                                        } else {
                                            C1023u0.m(x10);
                                            v10.b(str6, "Referrer does not contain valid parameters");
                                        }
                                        c1023u0.f17564B.getClass();
                                        y10.y("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                                u8 = u8;
                                X x13 = ((C1023u0) u8.f17155r.f16104r).f17584w;
                                C1023u0.m(x13);
                                x13.f17182w.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleP0 = null;
                        str = (String) this.f17054s;
                        if (this.f17056u) {
                            V1 v14 = c1023u0.f17587z;
                            C1023u0.k(v14);
                            bundleP1 = v14.p0(uri);
                            if (bundleP1 != null) {
                                bundleP1.putString("_cis", "intent");
                                if (bundleP1.containsKey("gclid")) {
                                }
                                y10.v(str, "_cmp", bundleP1);
                                c1020t0.a(str, bundleP1);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            C1023u0.m(x9);
                            x10 = x9;
                            v10 = x10.f17177D;
                            v10.b(str6, "Activity created with referrer");
                            if (c1023u0.f17582u.y(null, G.f16897H0)) {
                                if (str6.contains("gclid")) {
                                }
                                C1023u0.m(x10);
                                v10.a(str7);
                            } else {
                                if (bundleP0 != null) {
                                    y10.v(str, "_cmp", bundleP0);
                                    c1020t0.a(str, bundleP0);
                                } else {
                                    C1023u0.m(x10);
                                    v10.b(str6, "Referrer does not contain valid parameters");
                                }
                                c1023u0.f17564B.getClass();
                                y10.y("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e11) {
                        e = e11;
                        X x14 = ((C1023u0) u8.f17155r.f16104r).f17584w;
                        C1023u0.m(x14);
                        x14.f17182w.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                }
                break;
            default:
                X1 x15 = (X1) this.f17057v;
                C1021t1 c1021t1 = (C1021t1) this.f17058w;
                J j = c1021t1.f17552u;
                C1023u0 c1023u1 = (C1023u0) c1021t1.f16104r;
                if (j == null) {
                    X x16 = c1023u1.f17584w;
                    C1023u0.m(x16);
                    x16.f17182w.a("Failed to send default event parameters to service");
                } else if (c1023u1.f17582u.y(null, G.f16936c1)) {
                    c1021t1.G(j, this.f17056u ? null : (C1019t) this.f17054s, x15);
                } else {
                    try {
                        j.r0((Bundle) this.f17055t, x15);
                        c1021t1.B();
                    } catch (RemoteException e13) {
                        X x17 = c1023u1.f17584w;
                        C1023u0.m(x17);
                        x17.f17182w.b(e13, "Failed to send default event parameters to service");
                    }
                }
                break;
        }
    }

    public O0(U0 u8, boolean z10, Uri uri, String str, String str2) {
        this.f17056u = z10;
        this.f17057v = uri;
        this.f17054s = str;
        this.f17055t = str2;
        this.f17058w = u8;
    }

    public O0(Y0 y10, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f17057v = atomicReference;
        this.f17054s = str;
        this.f17055t = str2;
        this.f17056u = z10;
        Objects.requireNonNull(y10);
        this.f17058w = y10;
    }

    public O0(C1021t1 c1021t1, X1 x9, boolean z10, C1019t c1019t, Bundle bundle) {
        this.f17057v = x9;
        this.f17056u = z10;
        this.f17054s = c1019t;
        this.f17055t = bundle;
        Objects.requireNonNull(c1021t1);
        this.f17058w = c1021t1;
    }
}
