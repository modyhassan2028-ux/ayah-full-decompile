package i7;

import E2.C0140p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f17218A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public M0 f17219B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public M0 f17220C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PriorityQueue f17221D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17222E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public H0 f17223F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final AtomicLong f17224G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f17225H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1020t0 f17226I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f17227J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public M0 f17228K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public X0 f17229L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public M0 f17230M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final X4.c f17231N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public U0 f17232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p085i0.n f17233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f17234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference f17236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f17237y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17238z;

    public Y0(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17234v = new CopyOnWriteArraySet();
        this.f17237y = new Object();
        this.f17238z = false;
        this.f17218A = 1;
        this.f17227J = true;
        this.f17231N = new X4.c(this);
        this.f17236x = new AtomicReference();
        this.f17223F = H0.f16998c;
        this.f17225H = -1L;
        this.f17224G = new AtomicLong(0L);
        this.f17226I = new C1020t0(c1023u0);
    }

    public final void A() {
        o();
        p();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (c1023u0.h()) {
            C0981g c0981g = c1023u0.f17582u;
            ((C1023u0) c0981g.f16104r).getClass();
            Boolean boolA = c0981g.A("google_analytics_deferred_deep_link_enabled");
            if (boolA != null && boolA.booleanValue()) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17177D.a("Deferred Deep Link feature enabled.");
                C1014r0 c1014r0 = c1023u0.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.x(new L0(this, 2));
            }
            C1021t1 c1021t1P = c1023u0.p();
            c1021t1P.o();
            c1021t1P.p();
            X1 x1E = c1021t1P.E(true);
            c1021t1P.A();
            C1023u0 c1023u1 = (C1023u0) c1021t1P.f16104r;
            c1023u1.f17582u.y(null, G.f16936c1);
            c1023u1.o().v(3, new byte[0]);
            c1021t1P.C(new RunnableC1007o1(c1021t1P, x1E, 1));
            this.f17227J = false;
            C0985h0 c0985h0 = c1023u0.f17583v;
            C1023u0.k(c0985h0);
            c0985h0.o();
            String string = c0985h0.s().getString("previous_os_version", null);
            ((C1023u0) c0985h0.f16104r).q().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c0985h0.s().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1023u0.q().q();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            v("auto", "_ou", bundle);
        }
    }

    public final void B(Bundle bundle, long j) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.f(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        I0.e(bundle2, "app_id", String.class, null);
        I0.e(bundle2, "origin", String.class, null);
        I0.e(bundle2, "name", String.class, null);
        I0.e(bundle2, "value", Object.class, null);
        I0.e(bundle2, "trigger_event_name", String.class, null);
        I0.e(bundle2, "trigger_timeout", Long.class, 0L);
        I0.e(bundle2, "timed_out_event_name", String.class, null);
        I0.e(bundle2, "timed_out_event_params", Bundle.class, null);
        I0.e(bundle2, "triggered_event_name", String.class, null);
        I0.e(bundle2, "triggered_event_params", Bundle.class, null);
        I0.e(bundle2, "time_to_live", Long.class, 0L);
        I0.e(bundle2, "expired_event_name", String.class, null);
        I0.e(bundle2, "expired_event_params", Bundle.class, null);
        U6.y.c(bundle2.getString("name"));
        U6.y.c(bundle2.getString("origin"));
        U6.y.f(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        V1 v10 = c1023u0.f17587z;
        S s10 = c1023u0.f17563A;
        X x10 = c1023u0.f17584w;
        C1023u0.k(v10);
        if (v10.v0(string) != 0) {
            C1023u0.m(x10);
            x10.f17182w.b(s10.c(string), "Invalid conditional user property name");
            return;
        }
        C1023u0.k(v10);
        if (v10.B(obj, string) != 0) {
            C1023u0.m(x10);
            x10.f17182w.c(s10.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objC = v10.C(obj, string);
        if (objC == null) {
            C1023u0.m(x10);
            x10.f17182w.c(s10.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        I0.c(bundle2, objC);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            C1023u0.m(x10);
            x10.f17182w.c(s10.c(string), Long.valueOf(j10), "Invalid conditional user property timeout");
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 > 15552000000L || j11 < 1) {
            C1023u0.m(x10);
            x10.f17182w.c(s10.c(string), Long.valueOf(j11), "Invalid conditional user property time to live");
        } else {
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new S0(this, bundle2, 0));
        }
    }

    public final void C(String str, String str2, Bundle bundle) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        c1023u0.f17564B.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        U6.y.c(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new S0(this, bundle2, 1));
    }

    public final String D() {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        try {
            return I0.b(c1023u0.f17579r, c1023u0.f17569G);
        } catch (IllegalStateException e10) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(e10, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void E(H0 h7, long j, boolean z10) {
        int i10 = h7.f17000b;
        o();
        p();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        X x9 = c1023u0.f17584w;
        C1023u0.k(c0985h0);
        H0 h0V = c0985h0.v();
        if (j <= this.f17225H && H0.l(h0V.f17000b, i10)) {
            C1023u0.m(x9);
            x9.f17176C.b(h7, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C0985h0 c0985h1 = c1023u0.f17583v;
        C1023u0.k(c0985h1);
        c0985h1.o();
        if (!H0.l(i10, c0985h1.s().getInt("consent_source", 100))) {
            C1023u0.m(x9);
            x9.f17176C.b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c0985h1.s().edit();
        editorEdit.putString("consent_settings", h7.g());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        C1023u0.m(x9);
        x9.f17178E.b(h7, "Setting storage consent(FE)");
        this.f17225H = j;
        if (c1023u0.p().y()) {
            C1021t1 c1021t1P = c1023u0.p();
            c1021t1P.o();
            c1021t1P.p();
            c1021t1P.C(new RunnableC1015r1(c1021t1P, 2));
        } else {
            C1021t1 c1021t1P2 = c1023u0.p();
            c1021t1P2.o();
            c1021t1P2.p();
            if (c1021t1P2.x()) {
                c1021t1P2.C(new RunnableC1007o1(c1021t1P2, c1021t1P2.E(false)));
            }
        }
        if (z10) {
            c1023u0.p().s(new AtomicReference());
        }
    }

    public final void F(Boolean bool, boolean z10) {
        o();
        p();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17177D.b(bool, "Setting app measurement enabled (FE)");
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        c0985h0.o();
        SharedPreferences.Editor editorEdit = c0985h0.s().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            c0985h0.o();
            SharedPreferences.Editor editorEdit2 = c0985h0.s().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        if (c1023u0.Q || !(bool == null || bool.booleanValue())) {
            G();
        }
    }

    public final void G() {
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        X x9 = c1023u0.f17584w;
        Y6.a aVar = c1023u0.f17564B;
        C1023u0.k(c0985h0);
        String strJ = c0985h0.f17387D.j();
        if (strJ != null) {
            if ("unset".equals(strJ)) {
                aVar.getClass();
                z("app", "_npa", System.currentTimeMillis(), null);
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strJ) ? 0L : 1L);
                aVar.getClass();
                z("app", "_npa", System.currentTimeMillis(), lValueOf);
            }
        }
        if (!c1023u0.a() || !this.f17227J) {
            C1023u0.m(x9);
            x9.f17177D.a("Updating Scion state (FE)");
            C1021t1 c1021t1P = c1023u0.p();
            c1021t1P.o();
            c1021t1P.p();
            c1021t1P.C(new RunnableC1007o1(c1021t1P, c1021t1P.E(true), 3));
            return;
        }
        C1023u0.m(x9);
        x9.f17177D.a("Recording app launch after enabling measurement for the first time (FE)");
        A();
        B1 b5 = c1023u0.f17586y;
        C1023u0.l(b5);
        b5.f16834v.s();
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new L0(this, 1));
    }

    public final void H() {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (!(c1023u0.f17579r.getApplicationContext() instanceof Application) || this.f17232t == null) {
            return;
        }
        ((Application) c1023u0.f17579r.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f17232t);
    }

    public final void I(Bundle bundle, int i10, long j) {
        Boolean bool;
        String string;
        E0 e10;
        Boolean bool2;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        p();
        H0 h7 = H0.f16998c;
        G0[] g0Arr = F0.STORAGE.f16878r;
        int length = g0Arr.length;
        int i11 = 0;
        while (true) {
            bool = null;
            if (i11 >= length) {
                string = null;
                break;
            }
            String str = g0Arr[i11].f16994r;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i11++;
        }
        if (string != null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17175B.b(string, "Ignoring invalid consent setting");
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17175B.a("Valid consent values are 'granted', 'denied'");
        }
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        boolean zU = c1014r0.u();
        H0 h0B = H0.b(i10, bundle);
        Iterator it = h0B.f16999a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            e10 = E0.f16862s;
            if (!zHasNext) {
                break;
            } else if (((E0) it.next()) != e10) {
                K(h0B, zU);
                break;
            }
        }
        C1005o c1005oC = C1005o.c(i10, bundle);
        Iterator it2 = c1005oC.f17494e.values().iterator();
        while (it2.hasNext()) {
            if (((E0) it2.next()) != e10) {
                J(c1005oC, zU);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = H0.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zU) {
                z(str2, "allow_personalized_ads", j, bool.toString());
            } else {
                y(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void J(C1005o c1005o, boolean z10) {
        p039d8.a aVar = new p039d8.a(14, this, c1005o, false);
        if (z10) {
            o();
            aVar.run();
        } else {
            C1014r0 c1014r0 = ((C1023u0) this.f16104r).f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(aVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void K(i7.H0 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.Y0.K(i7.H0, boolean):void");
    }

    public final void L() {
        R3.a();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        C1014r0 c1014r0 = c1023u0.f17585x;
        X x9 = c1023u0.f17584w;
        if (c0981g.y(null, G.f16914R0)) {
            C1023u0.m(c1014r0);
            if (c1014r0.u()) {
                C1023u0.m(x9);
                x9.f17182w.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (H8.e.q()) {
                C1023u0.m(x9);
                x9.f17182w.a("Cannot get trigger URIs from main thread");
                return;
            }
            p();
            C1023u0.m(x9);
            x9.f17178E.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C1023u0.m(c1014r0);
            c1014r0.y(atomicReference, 10000L, "get trigger URIs", new R0(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                C1023u0.m(x9);
                x9.f17184y.a("Timed out waiting for get trigger URIs");
            } else {
                C1023u0.m(c1014r0);
                c1014r0.x(new Runnable() { // from class: i7.V0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Y0 y10 = this.f17160r;
                        y10.o();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        C0985h0 c0985h0 = ((C1023u0) y10.f16104r).f17583v;
                        C1023u0.k(c0985h0);
                        SparseArray sparseArrayU = c0985h0.u();
                        for (F1 f3 : list) {
                            int i10 = f3.f16881t;
                            if (!sparseArrayU.contains(i10) || ((Long) sparseArrayU.get(i10)).longValue() < f3.f16880s) {
                                y10.M().add(f3);
                            }
                        }
                        y10.N();
                    }
                });
            }
        }
    }

    public final PriorityQueue M() {
        if (this.f17221D == null) {
            this.f17221D = new PriorityQueue(Comparator.CC.comparing(W0.f17171a, C0140p.f1748b));
        }
        return this.f17221D;
    }

    public final void N() {
        F1 f3;
        o();
        this.f17222E = false;
        if (M().isEmpty() || this.f17238z || (f3 = (F1) M().poll()) == null) {
            return;
        }
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        V1 v10 = c1023u0.f17587z;
        C1023u0.k(v10);
        A2.a aVarJ = v10.J();
        if (aVarJ != null) {
            this.f17238z = true;
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            V v11 = x9.f17178E;
            String str = f3.f16879r;
            v11.b(str, "Registering trigger URI");
            p039d8.b bVarE = aVarJ.e(Uri.parse(str));
            if (bVarE != null) {
                bVarE.a(new p039d8.a(0, bVarE, new p085i0.n(3, this, f3, false)), new E6.s(1, this));
            } else {
                this.f17238z = false;
                M().add(f3);
            }
        }
    }

    @Override // i7.I
    public final boolean r() {
        return false;
    }

    public final void s(H0 h7) {
        o();
        boolean z10 = (h7.i(G0.f16990t) && h7.i(G0.f16989s)) || ((C1023u0) this.f16104r).p().x();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        if (z10 != c1023u0.Q) {
            C1014r0 c1014r1 = c1023u0.f17585x;
            C1023u0.m(c1014r1);
            c1014r1.o();
            c1023u0.Q = z10;
            C0985h0 c0985h0 = ((C1023u0) this.f16104r).f17583v;
            C1023u0.k(c0985h0);
            c0985h0.o();
            Boolean boolValueOf = c0985h0.s().contains("measurement_enabled_from_api") ? Boolean.valueOf(c0985h0.s().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                F(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.Y0.t(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void u() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        C1 c10;
        C1 c11;
        Y0 y10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        G.a0 a0Var;
        p029c8.q qVarL;
        com.google.android.gms.internal.measurement.S1 s10;
        p029c8.n nVarC;
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        X x9 = c1023u0.f17584w;
        Y6.a aVar = c1023u0.f17564B;
        C1023u0.m(x9);
        x9.f17177D.a("Handle tcf update.");
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        SharedPreferences sharedPreferencesT = c0985h0.t();
        HashMap map = new HashMap();
        F f3 = G.f16930a1;
        int i19 = 2;
        int i20 = 1;
        if (((Boolean) f3.a(null)).booleanValue()) {
            p029c8.i iVar = E1.f16868a;
            com.google.android.gms.internal.measurement.R1 r10 = com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            D1 d1 = D1.f16859r;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(r10, d1);
            com.google.android.gms.internal.measurement.R1 r11 = com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            D1 d5 = D1.f16860s;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(r11, d5);
            com.google.android.gms.internal.measurement.R1 r12 = com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(r12, d1);
            com.google.android.gms.internal.measurement.R1 r13 = com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(r13, d1);
            com.google.android.gms.internal.measurement.R1 r14 = com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(r14, d5), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, d5), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, d5));
            G.a0 a0Var2 = new G.a0(listAsList != null ? listAsList.size() : 4);
            a0Var2.l(listAsList);
            p029c8.n nVarC2 = a0Var2.c();
            int i21 = p029c8.g.f13552t;
            p029c8.p pVar = new p029c8.p("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesT.contains("IABTCF_TCString");
            try {
                try {
                    try {
                        try {
                            try {
                                i14 = sharedPreferencesT.getInt("IABTCF_CmpSdkID", -1);
                                while (true) {
                                    boolean zHasNext = qVarL.hasNext();
                                    s10 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_UNDEFINED;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.R1 r15 = (com.google.android.gms.internal.measurement.R1) qVarL.next();
                                    int iA = r15.a();
                                    p029c8.q qVar = qVarL;
                                    p029c8.n nVar = nVarC2;
                                    StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 28);
                                    sb.append("IABTCF_PublisherRestrictions");
                                    sb.append(iA);
                                    String strA = E1.a(sharedPreferencesT, sb.toString());
                                    if (!TextUtils.isEmpty(strA) && strA.length() >= 755) {
                                        int iDigit = Character.digit(strA.charAt(754), 10);
                                        com.google.android.gms.internal.measurement.S1 s11 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_NOT_ALLOWED;
                                        if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.S1.values().length || iDigit == 0) {
                                            s10 = s11;
                                        } else if (iDigit == i20) {
                                            s10 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                        } else if (iDigit == i19) {
                                            s10 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                        }
                                    }
                                    a0Var.k(r15, s10);
                                    qVarL = qVar;
                                    nVarC2 = nVar;
                                    i19 = 2;
                                    i20 = 1;
                                }
                            } catch (ClassCastException unused) {
                                i14 = -1;
                            }
                            i17 = sharedPreferencesT.getInt("IABTCF_PurposeOneTreatment", -1);
                        } catch (ClassCastException unused2) {
                            i17 = -1;
                        }
                        i15 = sharedPreferencesT.getInt("IABTCF_PolicyVersion", -1);
                    } catch (ClassCastException unused3) {
                        i15 = -1;
                    }
                    i18 = sharedPreferencesT.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                } catch (ClassCastException unused4) {
                    i18 = -1;
                }
                i16 = sharedPreferencesT.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused5) {
                i16 = -1;
            }
            int i22 = i15;
            String strA2 = E1.a(sharedPreferencesT, "IABTCF_PublisherCC");
            int i23 = i14;
            a0Var = new G.a0(4);
            p029c8.l lVar = nVarC2.f13550s;
            if (lVar == null) {
                p029c8.l lVar2 = new p029c8.l(nVarC2, new p029c8.m(nVarC2.f13570v, 0, nVarC2.f13571w));
                nVarC2.f13550s = lVar2;
                lVar = lVar2;
            }
            qVarL = lVar.iterator();
            p029c8.n nVar2 = nVarC2;
            p029c8.n nVarC3 = a0Var.c();
            String strA3 = E1.a(sharedPreferencesT, "IABTCF_PurposeConsents");
            String strA4 = E1.a(sharedPreferencesT, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = E1.a(sharedPreferencesT, "IABTCF_PurposeLegitimateInterests");
            String strA6 = E1.a(sharedPreferencesT, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                com.google.android.gms.internal.measurement.S1 s12 = (com.google.android.gms.internal.measurement.S1) nVarC3.get(r10);
                com.google.android.gms.internal.measurement.S1 s13 = (com.google.android.gms.internal.measurement.S1) nVarC3.get(r12);
                com.google.android.gms.internal.measurement.S1 s14 = (com.google.android.gms.internal.measurement.S1) nVarC3.get(r13);
                com.google.android.gms.internal.measurement.S1 s15 = (com.google.android.gms.internal.measurement.S1) nVarC3.get(r14);
                G.a0 a0Var3 = new G.a0(4);
                a0Var3.k("Version", "2");
                boolean z12 = z10;
                a0Var3.k("VendorConsent", true != z10 ? "0" : "1");
                boolean z13 = z11;
                a0Var3.k("VendorLegitimateInterest", true != z11 ? "0" : "1");
                a0Var3.k("gdprApplies", i16 != 1 ? "0" : "1");
                int i24 = i18;
                a0Var3.k("EnableAdvertiserConsentMode", i24 != 1 ? "0" : "1");
                a0Var3.k("PolicyVersion", String.valueOf(i22));
                a0Var3.k("CmpSdkID", String.valueOf(i23));
                int i25 = i17;
                a0Var3.k("PurposeOneTreatment", i25 != 1 ? "0" : "1");
                a0Var3.k("PublisherCC", strA2);
                a0Var3.k("PublisherRestrictions1", String.valueOf(s12 != null ? s12.a() : s10.a()));
                a0Var3.k("PublisherRestrictions3", String.valueOf(s13 != null ? s13.a() : s10.a()));
                a0Var3.k("PublisherRestrictions4", String.valueOf(s14 != null ? s14.a() : s10.a()));
                a0Var3.k("PublisherRestrictions7", String.valueOf(s15 != null ? s15.a() : s10.a()));
                String strD = E1.d(r10, strA3, strA5);
                String strD2 = E1.d(r12, strA3, strA5);
                String strD3 = E1.d(r13, strA3, strA5);
                String strD4 = E1.d(r14, strA3, strA5);
                F9.n.k("Purpose1", strD);
                F9.n.k("Purpose3", strD2);
                F9.n.k("Purpose4", strD3);
                F9.n.k("Purpose7", strD4);
                a0Var3.l(p029c8.n.a(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                int i26 = i16;
                a0Var3.l(p029c8.n.a(5, new Object[]{"AuthorizePurpose1", true != E1.b(r10, nVar2, nVarC3, pVar, cArr, i24, i26, i25, strA2, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose3", true != E1.b(r12, nVar2, nVarC3, pVar, cArr, i24, i26, i25, strA2, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose4", true != E1.b(r13, nVar2, nVarC3, pVar, cArr, i24, i26, i25, strA2, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose7", true != E1.b(r14, nVar2, nVarC3, pVar, cArr, i24, i26, i25, strA2, strA3, strA5, z12, z13) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                nVarC = a0Var3.c();
            } else {
                nVarC = p029c8.n.f13568x;
            }
            c10 = new C1(nVarC);
            str = "";
        } else {
            String strA7 = E1.a(sharedPreferencesT, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i10 = sharedPreferencesT.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i10 = -1;
            }
            if (i10 != -1) {
                map.put("gdprApplies", String.valueOf(i10));
            }
            try {
                i11 = sharedPreferencesT.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i11 = -1;
            }
            if (i11 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i11));
            }
            try {
                i12 = sharedPreferencesT.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i12 = -1;
            }
            if (i12 != -1) {
                map.put("PolicyVersion", String.valueOf(i12));
            }
            String strA8 = E1.a(sharedPreferencesT, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i13 = sharedPreferencesT.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i13 = -1;
            }
            if (i13 != -1) {
                map.put("CmpSdkID", String.valueOf(i13));
            }
            c10 = new C1(map);
        }
        C1023u0.m(x9);
        V v10 = x9.f17178E;
        v10.b(c10, "Tcf preferences read");
        if (!c1023u0.f17582u.y(null, f3)) {
            if (c0985h0.w(c10)) {
                Bundle bundleB = c10.b();
                C1023u0.m(x9);
                v10.b(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    I(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c10.c());
                v("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        c0985h0.o();
        String string = c0985h0.s().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c11 = new C1(map2);
        } else {
            for (String str2 : string.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length >= 2 && E1.f16868a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            c11 = new C1(map2);
        }
        if (c0985h0.w(c10)) {
            Bundle bundleB2 = c10.b();
            C1023u0.m(x9);
            v10.b(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                y10 = this;
                y10.I(bundleB2, -30, System.currentTimeMillis());
            } else {
                y10 = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = c11.f16848a;
            String str3 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = c10.b();
            Bundle bundleB4 = c11.b();
            bundle2.putString("_tcfm", str3.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str4 = (String) c10.f16848a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str4)) {
                str4 = "200000";
            }
            bundle2.putString("_tcfd2", str4);
            bundle2.putString("_tcfd", c10.c());
            y10.v("auto", "_tcf", bundle2);
        }
    }

    public final void v(String str, String str2, Bundle bundle) {
        o();
        ((C1023u0) this.f16104r).f17564B.getClass();
        w(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void w(long j, Bundle bundle, String str, String str2) {
        o();
        boolean z10 = true;
        if (this.f17233u != null && !V1.O(str2)) {
            z10 = false;
        }
        x(str, str2, j, bundle, true, z10, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:110:0x0296  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309  */
    /* JADX WARN: Code duplicated, block: B:135:0x031f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0328  */
    /* JADX WARN: Code duplicated, block: B:143:0x038b  */
    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:161:0x040a  */
    /* JADX WARN: Code duplicated, block: B:163:0x040d  */
    /* JADX WARN: Code duplicated, block: B:168:0x041a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0422  */
    /* JADX WARN: Code duplicated, block: B:172:0x0427  */
    /* JADX WARN: Code duplicated, block: B:175:0x042f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0472  */
    /* JADX WARN: Code duplicated, block: B:180:0x0486  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b2 A[LOOP:2: B:184:0x04ac->B:186:0x04b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0201  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final void x(String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        int i10;
        Y6.a aVar;
        int i11;
        C0985h0 c0985h0;
        X4.c cVar;
        boolean z13;
        C1023u0 c1023u0;
        int iU0;
        Bundle bundleW;
        String str3;
        long j10;
        String str4;
        String strJ;
        ArrayList arrayList;
        boolean zA;
        long j11;
        Y0 y10;
        ArrayList arrayList2;
        int size;
        int i12;
        int i13;
        Bundle bundleR;
        String str5;
        Bundle bundle2;
        Q qO;
        byte[] bArrMarshall;
        boolean zV;
        Iterator it;
        String str6;
        Object obj;
        Bundle[] bundleArr;
        int length;
        int i14;
        U6.y.c(str);
        U6.y.f(bundle);
        o();
        p();
        C1023u0 c1023u1 = (C1023u0) this.f16104r;
        boolean zA2 = c1023u1.a();
        B1 b5 = c1023u1.f17586y;
        C0981g c0981g = c1023u1.f17582u;
        Context context = c1023u1.f17579r;
        V1 v10 = c1023u1.f17587z;
        X x9 = c1023u1.f17584w;
        if (!zA2) {
            C1023u0.m(x9);
            x9.f17177D.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = c1023u1.r().f17039B;
        if (list != null && !list.contains(str2)) {
            C1023u0.m(x9);
            x9.f17177D.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (this.f17235w) {
            i10 = 0;
        } else {
            this.f17235w = true;
            try {
                i10 = 0;
                try {
                    (!c1023u1.f17580s ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e10) {
                    try {
                        C1023u0.m(x9);
                        x9.f17185z.b(e10, "Failed to invoke Tag Manager's initialize() method");
                    } catch (ClassNotFoundException unused) {
                        C1023u0.m(x9);
                        x9.f17176C.a("Tag Manager is not found and thus will not be used");
                    }
                }
            } catch (ClassNotFoundException unused2) {
                i10 = 0;
            }
        }
        S s10 = c1023u1.f17563A;
        C0985h0 c0985h1 = c1023u1.f17583v;
        Y6.a aVar2 = c1023u1.f17564B;
        if (!c0981g.y(null, G.f16946g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar2.getClass();
            aVar = aVar2;
            i11 = i10;
            z("auto", "_lgclid", System.currentTimeMillis(), string);
        } else {
            aVar = aVar2;
            i11 = i10;
        }
        if (!z10 || V1.f17162A[i11].equals(str2)) {
            c0985h0 = c0985h1;
        } else {
            C1023u0.k(v10);
            C1023u0.k(c0985h1);
            c0985h0 = c0985h1;
            v10.z(bundle, c0985h0.f17399P.L());
        }
        X4.c cVar2 = this.f17231N;
        if (!z12 && !"_iap".equals(str2)) {
            C1023u0.k(v10);
            if (!v10.q0("event", str2)) {
                i14 = 2;
            } else if (v10.s0("event", I0.f17003a, I0.f17004b, str2)) {
                ((C1023u0) v10.f16104r).getClass();
                if (v10.t0(40, "event", str2)) {
                    i14 = i11;
                } else {
                    i14 = 2;
                }
            } else {
                i14 = 13;
            }
            if (i14 != 0) {
                C1023u0.m(x9);
                x9.f17184y.b(s10.a(str2), "Invalid public event name. Event will not be logged (FE)");
                C1023u0.k(v10);
                V1.E(cVar2, null, i14, "_ev", V1.t(40, str2, true), str2 != null ? str2.length() : i11);
                return;
            }
        }
        C0992j1 c0992j1 = c1023u1.f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1U = c0992j1.u(i11);
        if (c0983g1U != null && !bundle.containsKey("_sc")) {
            c0983g1U.f17370d = true;
        }
        V1.h0(c0983g1U, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str);
        boolean zO = V1.O(str2);
        if (z10) {
            cVar = cVar2;
            if (this.f17233u != null && !zO) {
                if (!zEquals) {
                    C1023u0.m(x9);
                    x9.f17177D.c(s10.a(str2), s10.e(bundle), "Passing event to registered event handler (FE)");
                    U6.y.f(this.f17233u);
                    p085i0.n nVar = this.f17233u;
                    nVar.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.T) nVar.f16733s).P(j, bundle, str, str2);
                        return;
                    } catch (RemoteException e11) {
                        C1023u0 c1023u2 = ((AppMeasurementDynamiteService) nVar.f16734t).f14525f;
                        if (c1023u2 != null) {
                            X x10 = c1023u2.f17584w;
                            C1023u0.m(x10);
                            x10.f17185z.b(e11, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z13 = true;
            }
            if (c1023u1.h()) {
                C1023u0.k(v10);
                c1023u0 = (C1023u0) v10.f16104r;
                iU0 = v10.u0(str2);
                if (iU0 != 0) {
                    C1023u0.m(x9);
                    x9.f17184y.b(s10.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String strT = V1.t(40, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    C1023u0.k(v10);
                    V1.E(cVar, null, iU0, "_ev", strT, length);
                    return;
                }
                bundleW = v10.w(str2, bundle, DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
                U6.y.f(bundleW);
                C1023u0.l(c0992j1);
                if (c0992j1.u(false) == null && "_ae".equals(str2)) {
                    C1023u0.l(b5);
                    A1 a9 = b5.f16835w;
                    ((C1023u0) a9.f16819d.f16104r).f17564B.getClass();
                    j10 = 0;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    str3 = "_o";
                    long j12 = jElapsedRealtime - a9.f16817b;
                    a9.f16817b = jElapsedRealtime;
                    if (j12 > 0) {
                        v10.X(bundleW, j12);
                    }
                } else {
                    str3 = "_o";
                    j10 = 0;
                }
                str4 = str;
                if ("auto".equals(str4) && "_ssr".equals(str2)) {
                    String string2 = bundleW.getString("_ffr");
                    int i15 = Y6.d.f10447a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    C0985h0 c0985h2 = c1023u0.f17583v;
                    C1023u0.k(c0985h2);
                    if (Objects.equals(string2, c0985h2.f17396M.j())) {
                        X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17177D.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        C0985h0 c0985h3 = c1023u0.f17583v;
                        C1023u0.k(c0985h3);
                        c0985h3.f17396M.k(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    C0985h0 c0985h4 = c1023u0.f17583v;
                    C1023u0.k(c0985h4);
                    strJ = c0985h4.f17396M.j();
                    if (!TextUtils.isEmpty(strJ)) {
                        bundleW.putString("_ffr", strJ);
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleW);
                if (c0981g.y(null, G.f16919V0)) {
                    C1023u0.l(b5);
                    b5.o();
                    zA = b5.f16833u;
                } else {
                    C1023u0.k(c0985h0);
                    zA = c0985h0.f17393J.a();
                }
                C1023u0.k(c0985h0);
                if (c0985h0.f17390G.a() <= j10 && c0985h0.y(j) && zA) {
                    C1023u0.m(x9);
                    x9.f17178E.a("Current session is expired, remove the session number, ID, and engagement time");
                    aVar.getClass();
                    j11 = j10;
                    z("auto", "_sid", System.currentTimeMillis(), null);
                    aVar.getClass();
                    z("auto", "_sno", System.currentTimeMillis(), null);
                    aVar.getClass();
                    z("auto", "_se", System.currentTimeMillis(), null);
                    y10 = this;
                    c0985h0.f17391H.b(j11);
                } else {
                    j11 = j10;
                    y10 = this;
                }
                if (bundleW.getLong("extend_session", j11) == 1) {
                    C1023u0.m(x9);
                    x9.f17178E.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    C1023u0.l(b5);
                    b5.f16834v.t(j);
                }
                arrayList2 = new ArrayList(bundleW.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                for (i12 = 0; i12 < size; i12++) {
                    str6 = (String) arrayList2.get(i12);
                    if (str6 != null) {
                        C1023u0.k(v10);
                        obj = bundleW.get(str6);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            bundleW.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                i13 = 0;
                while (i13 < arrayList.size()) {
                    bundleR = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str5 = "_ep";
                    } else {
                        str5 = str2;
                    }
                    String str7 = str3;
                    bundleR.putString(str7, str4);
                    if (z11) {
                        bundleR = v10.R(bundleR);
                    }
                    bundle2 = bundleR;
                    C1022u c1022u = new C1022u(str5, new C1019t(bundle2), str4, j);
                    C1021t1 c1021t1P = c1023u1.p();
                    c1021t1P.getClass();
                    c1021t1P.o();
                    c1021t1P.p();
                    c1021t1P.A();
                    qO = ((C1023u0) c1021t1P.f16104r).o();
                    qO.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    p053f.h.a(c1022u, parcelObtain, 0);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        X x12 = ((C1023u0) qO.f16104r).f17584w;
                        C1023u0.m(x12);
                        x12.f17183x.a("Event is too long for local database. Sending event directly to service");
                        zV = false;
                    } else {
                        zV = qO.v(0, bArrMarshall);
                    }
                    c1021t1P.C(new RunnableC1004n1(c1021t1P, c1021t1P.E(true), zV, c1022u, 1));
                    if (!z13) {
                        it = y10.f17234v.iterator();
                        while (it.hasNext()) {
                            ((J0) it.next()).a(j, new Bundle(bundle2), str, str2);
                        }
                    }
                    i13++;
                    str4 = str;
                    str3 = str7;
                }
                C1023u0.l(c0992j1);
                if (c0992j1.u(false) == null && "_ae".equals(str2)) {
                    C1023u0.l(b5);
                    aVar.getClass();
                    b5.f16835w.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
            return;
        }
        cVar = cVar2;
        z13 = zEquals;
        if (c1023u1.h()) {
            return;
        }
        C1023u0.k(v10);
        c1023u0 = (C1023u0) v10.f16104r;
        iU0 = v10.u0(str2);
        if (iU0 != 0) {
            C1023u0.m(x9);
            x9.f17184y.b(s10.a(str2), "Invalid event name. Event will not be logged (FE)");
            String strT2 = V1.t(40, str2, true);
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            C1023u0.k(v10);
            V1.E(cVar, null, iU0, "_ev", strT2, length);
            return;
        }
        bundleW = v10.w(str2, bundle, DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
        U6.y.f(bundleW);
        C1023u0.l(c0992j1);
        if (c0992j1.u(false) == null) {
            str3 = "_o";
            j10 = 0;
        } else {
            str3 = "_o";
            j10 = 0;
        }
        str4 = str;
        if ("auto".equals(str4)) {
            if ("_ae".equals(str2)) {
                C0985h0 c0985h5 = c1023u0.f17583v;
                C1023u0.k(c0985h5);
                strJ = c0985h5.f17396M.j();
                if (!TextUtils.isEmpty(strJ)) {
                    bundleW.putString("_ffr", strJ);
                }
            }
        } else if ("_ae".equals(str2)) {
            C0985h0 c0985h6 = c1023u0.f17583v;
            C1023u0.k(c0985h6);
            strJ = c0985h6.f17396M.j();
            if (!TextUtils.isEmpty(strJ)) {
                bundleW.putString("_ffr", strJ);
            }
        }
        arrayList = new ArrayList();
        arrayList.add(bundleW);
        if (c0981g.y(null, G.f16919V0)) {
            C1023u0.l(b5);
            b5.o();
            zA = b5.f16833u;
        } else {
            C1023u0.k(c0985h0);
            zA = c0985h0.f17393J.a();
        }
        C1023u0.k(c0985h0);
        if (c0985h0.f17390G.a() <= j10) {
            j11 = j10;
            y10 = this;
        } else {
            j11 = j10;
            y10 = this;
        }
        if (bundleW.getLong("extend_session", j11) == 1) {
            C1023u0.m(x9);
            x9.f17178E.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            C1023u0.l(b5);
            b5.f16834v.t(j);
        }
        arrayList2 = new ArrayList(bundleW.keySet());
        Collections.sort(arrayList2);
        size = arrayList2.size();
        while (i12 < size) {
            str6 = (String) arrayList2.get(i12);
            if (str6 != null) {
                C1023u0.k(v10);
                obj = bundleW.get(str6);
                if (obj instanceof Bundle) {
                    bundleArr = new Bundle[]{(Bundle) obj};
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList4 = (ArrayList) obj;
                    bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                } else {
                    bundleArr = null;
                }
                if (bundleArr != null) {
                    bundleW.putParcelableArray(str6, bundleArr);
                }
            }
        }
        i13 = 0;
        while (i13 < arrayList.size()) {
            bundleR = (Bundle) arrayList.get(i13);
            if (i13 != 0) {
                str5 = "_ep";
            } else {
                str5 = str2;
            }
            String str8 = str3;
            bundleR.putString(str8, str4);
            if (z11) {
                bundleR = v10.R(bundleR);
            }
            bundle2 = bundleR;
            C1022u c1022u2 = new C1022u(str5, new C1019t(bundle2), str4, j);
            C1021t1 c1021t1P2 = c1023u1.p();
            c1021t1P2.getClass();
            c1021t1P2.o();
            c1021t1P2.p();
            c1021t1P2.A();
            qO = ((C1023u0) c1021t1P2.f16104r).o();
            qO.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            p053f.h.a(c1022u2, parcelObtain2, 0);
            bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            if (bArrMarshall.length > 131072) {
                X x13 = ((C1023u0) qO.f16104r).f17584w;
                C1023u0.m(x13);
                x13.f17183x.a("Event is too long for local database. Sending event directly to service");
                zV = false;
            } else {
                zV = qO.v(0, bArrMarshall);
            }
            c1021t1P2.C(new RunnableC1004n1(c1021t1P2, c1021t1P2.E(true), zV, c1022u2, 1));
            if (!z13) {
                it = y10.f17234v.iterator();
                while (it.hasNext()) {
                    ((J0) it.next()).a(j, new Bundle(bundle2), str, str2);
                }
            }
            i13++;
            str4 = str;
            str3 = str8;
        }
        C1023u0.l(c0992j1);
        if (c0992j1.u(false) == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void y(String str, String str2, Object obj, boolean z10, long j) {
        int iV0;
        int length;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (z10) {
            V1 v10 = c1023u0.f17587z;
            C1023u0.k(v10);
            iV0 = v10.v0(str2);
        } else {
            V1 v11 = c1023u0.f17587z;
            C1023u0.k(v11);
            if (!v11.q0("user property", str2)) {
                iV0 = 6;
            } else if (v11.s0("user property", I0.f17010i, null, str2)) {
                ((C1023u0) v11.f16104r).getClass();
                if (v11.t0(24, "user property", str2)) {
                    iV0 = 0;
                } else {
                    iV0 = 6;
                }
            } else {
                iV0 = 15;
            }
        }
        X4.c cVar = this.f17231N;
        if (iV0 != 0) {
            C1023u0.k(c1023u0.f17587z);
            String strT = V1.t(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            C1023u0.k(c1023u0.f17587z);
            V1.E(cVar, null, iV0, "_ev", strT, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new RunnableC1032x0(this, str3, str2, null, j, 1));
            return;
        }
        V1 v12 = c1023u0.f17587z;
        C1023u0.k(v12);
        int iB = v12.B(obj, str2);
        if (iB != 0) {
            C1023u0.k(v12);
            String strT2 = V1.t(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C1023u0.k(c1023u0.f17587z);
            V1.E(cVar, null, iB, "_ev", strT2, length);
            return;
        }
        C1023u0.k(v12);
        Object objC = v12.C(obj, str2);
        if (objC != null) {
            C1014r0 c1014r1 = c1023u0.f17585x;
            C1023u0.m(c1014r1);
            c1014r1.x(new RunnableC1032x0(this, str3, str2, objC, j, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public final void z(String str, String str2, long j, Object obj) {
        String str3;
        boolean zV;
        Object objValueOf = obj;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        U6.y.c(str2);
        o();
        p();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j10 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j10);
                    C0985h0 c0985h0 = c1023u0.f17583v;
                    C1023u0.k(c0985h0);
                    c0985h0.f17387D.k(j10 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    C0985h0 c0985h1 = c1023u0.f17583v;
                    C1023u0.k(c0985h1);
                    c0985h1.f17387D.k("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                C0985h0 c0985h2 = c1023u0.f17583v;
                C1023u0.k(c0985h2);
                c0985h2.f17387D.k("unset");
            } else {
                str4 = str2;
            }
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!c1023u0.a()) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17178E.a("User property not set since app measurement is disabled");
            return;
        }
        if (c1023u0.h()) {
            S1 s10 = new S1(str3, str, j, obj2);
            C1021t1 c1021t1P = c1023u0.p();
            c1021t1P.o();
            c1021t1P.p();
            c1021t1P.A();
            Q qO = ((C1023u0) c1021t1P.f16104r).o();
            qO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            p053f.h.b(s10, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                X x11 = ((C1023u0) qO.f16104r).f17584w;
                C1023u0.m(x11);
                x11.f17183x.a("User property too long for local database. Sending directly to service");
                zV = false;
            } else {
                zV = qO.v(1, bArrMarshall);
            }
            c1021t1P.C(new RunnableC1004n1(c1021t1P, c1021t1P.E(true), zV, s10, 0));
        }
    }
}
