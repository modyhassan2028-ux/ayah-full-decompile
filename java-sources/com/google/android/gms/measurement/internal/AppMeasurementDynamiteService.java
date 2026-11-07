package com.google.android.gms.measurement.internal;

import H8.e;
import I1.RunnableC0250e0;
import U6.y;
import a7.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Y;
import i7.A;
import i7.C0971c1;
import i7.C0983g1;
import i7.C0992j1;
import i7.C1014r0;
import i7.C1019t;
import i7.C1022u;
import i7.C1023u0;
import i7.EnumC0977e1;
import i7.I1;
import i7.J0;
import i7.K1;
import i7.N0;
import i7.O;
import i7.O0;
import i7.P0;
import i7.R0;
import i7.RunnableC0964a0;
import i7.RunnableC1017s0;
import i7.S0;
import i7.U0;
import i7.V;
import i7.V1;
import i7.W1;
import i7.X;
import i7.Y0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p039d8.a;
import p074h0.i;
import p085i0.n;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1023u0 f14525f;
    public final C1350e g;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f14525f = null;
        this.g = new C1350e(0);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void beginAdUnitExposure(String str, long j) {
        c();
        A a9 = this.f14525f.f17567E;
        C1023u0.j(a9);
        a9.p(j, str);
    }

    public final void c() {
        if (this.f14525f == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.C(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void clearMeasurementEnabled(long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.p();
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new a(13, y10, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void endAdUnitExposure(String str, long j) {
        c();
        A a9 = this.f14525f.f17567E;
        C1023u0.j(a9);
        a9.q(j, str);
    }

    public final void g(String str, N n6) {
        c();
        V1 v10 = this.f14525f.f17587z;
        C1023u0.k(v10);
        v10.Y(str, n6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void generateEventId(N n6) {
        c();
        V1 v10 = this.f14525f.f17587z;
        C1023u0.k(v10);
        long jM0 = v10.m0();
        c();
        V1 v11 = this.f14525f.f17587z;
        C1023u0.k(v11);
        v11.Z(n6, jM0);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getAppInstanceId(N n6) {
        c();
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC1017s0(this, n6, 0));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getCachedAppInstanceId(N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        g((String) y10.f17236x.get(), n6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getConditionalUserProperties(String str, String str2, N n6) {
        c();
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC0250e0(this, n6, str, str2, 5, false));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getCurrentScreenClass(N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C0992j1 c0992j1 = ((C1023u0) y10.f16104r).f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1 = c0992j1.f17428t;
        g(c0983g1 != null ? c0983g1.f17368b : null, n6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getCurrentScreenName(N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C0992j1 c0992j1 = ((C1023u0) y10.f16104r).f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1 = c0992j1.f17428t;
        g(c0983g1 != null ? c0983g1.f17367a : null, n6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getGmpAppId(N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        g(y10.D(), n6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getMaxUserProperties(String str, N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y.c(str);
        ((C1023u0) y10.f16104r).getClass();
        c();
        V1 v10 = this.f14525f.f17587z;
        C1023u0.k(v10);
        v10.a0(n6, 25);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getSessionId(N n6) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new a(y10, n6));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getTestFlag(N n6, int i10) {
        c();
        if (i10 == 0) {
            V1 v10 = this.f14525f.f17587z;
            C1023u0.k(v10);
            Y0 y10 = this.f14525f.f17566D;
            C1023u0.l(y10);
            AtomicReference atomicReference = new AtomicReference();
            C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
            C1023u0.m(c1014r0);
            v10.Y((String) c1014r0.y(atomicReference, 15000L, "String test flag value", new R0(y10, atomicReference, 1)), n6);
            return;
        }
        if (i10 == 1) {
            V1 v11 = this.f14525f.f17587z;
            C1023u0.k(v11);
            Y0 y11 = this.f14525f.f17566D;
            C1023u0.l(y11);
            AtomicReference atomicReference2 = new AtomicReference();
            C1014r0 c1014r1 = ((C1023u0) y11.f16104r).f17585x;
            C1023u0.m(c1014r1);
            v11.Z(n6, ((Long) c1014r1.y(atomicReference2, 15000L, "long test flag value", new R0(y11, atomicReference2, 2))).longValue());
            return;
        }
        if (i10 == 2) {
            V1 v12 = this.f14525f.f17587z;
            C1023u0.k(v12);
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            AtomicReference atomicReference3 = new AtomicReference();
            C1014r0 c1014r2 = ((C1023u0) y12.f16104r).f17585x;
            C1023u0.m(c1014r2);
            double dDoubleValue = ((Double) c1014r2.y(atomicReference3, 15000L, "double test flag value", new R0(y12, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                n6.D(bundle);
                return;
            } catch (RemoteException e10) {
                X x9 = ((C1023u0) v12.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17185z.b(e10, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            V1 v13 = this.f14525f.f17587z;
            C1023u0.k(v13);
            Y0 y13 = this.f14525f.f17566D;
            C1023u0.l(y13);
            AtomicReference atomicReference4 = new AtomicReference();
            C1014r0 c1014r3 = ((C1023u0) y13.f16104r).f17585x;
            C1023u0.m(c1014r3);
            v13.a0(n6, ((Integer) c1014r3.y(atomicReference4, 15000L, "int test flag value", new R0(y13, atomicReference4, 3))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        V1 v14 = this.f14525f.f17587z;
        C1023u0.k(v14);
        Y0 y14 = this.f14525f.f17566D;
        C1023u0.l(y14);
        AtomicReference atomicReference5 = new AtomicReference();
        C1014r0 c1014r4 = ((C1023u0) y14.f16104r).f17585x;
        C1023u0.m(c1014r4);
        v14.c0(n6, ((Boolean) c1014r4.y(atomicReference5, 15000L, "boolean test flag value", new R0(y14, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void getUserProperties(String str, String str2, boolean z10, N n6) {
        c();
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new O0(this, n6, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void initForTests(Map map) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void initialize(a7.a aVar, W w9, long j) {
        C1023u0 c1023u0 = this.f14525f;
        if (c1023u0 == null) {
            Context context = (Context) b.G0(aVar);
            y.f(context);
            this.f14525f = C1023u0.s(context, w9, Long.valueOf(j));
        } else {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void isDataCollectionEnabled(N n6) {
        c();
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC1017s0(this, n6, 1));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.t(str, str2, bundle, z10, z11, j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void logEventAndBundle(String str, String str2, Bundle bundle, N n6, long j) {
        c();
        y.c(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C1022u c1022u = new C1022u(str2, new C1019t(bundle), "app", j);
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC0250e0(this, n6, c1022u, str, 2, false));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void logHealthData(int i10, String str, a7.a aVar, a7.a aVar2, a7.a aVar3) {
        c();
        Object objG0 = aVar == null ? null : b.G0(aVar);
        Object objG1 = aVar2 == null ? null : b.G0(aVar2);
        Object objG2 = aVar3 != null ? b.G0(aVar3) : null;
        X x9 = this.f14525f.f17584w;
        C1023u0.m(x9);
        x9.x(i10, true, false, str, objG0, objG1, objG2);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityCreated(a7.a aVar, Bundle bundle, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityCreatedByScionActivityInfo(Y.b(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityCreatedByScionActivityInfo(Y y10, Bundle bundle, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        U0 u8 = y11.f17232t;
        if (u8 != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
            u8.a(y10, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityDestroyed(a7.a aVar, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityDestroyedByScionActivityInfo(Y.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityDestroyedByScionActivityInfo(Y y10, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        U0 u8 = y11.f17232t;
        if (u8 != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
            u8.b(y10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityPaused(a7.a aVar, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityPausedByScionActivityInfo(Y.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityPausedByScionActivityInfo(Y y10, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        U0 u8 = y11.f17232t;
        if (u8 != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
            u8.c(y10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityResumed(a7.a aVar, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityResumedByScionActivityInfo(Y.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityResumedByScionActivityInfo(Y y10, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        U0 u8 = y11.f17232t;
        if (u8 != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
            u8.d(y10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivitySaveInstanceState(a7.a aVar, N n6, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivitySaveInstanceStateByScionActivityInfo(Y.b(activity), n6, j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivitySaveInstanceStateByScionActivityInfo(Y y10, N n6, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        U0 u8 = y11.f17232t;
        Bundle bundle = new Bundle();
        if (u8 != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
            u8.e(y10, bundle);
        }
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = this.f14525f.f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityStarted(a7.a aVar, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityStartedByScionActivityInfo(Y.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityStartedByScionActivityInfo(Y y10, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        if (y11.f17232t != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityStopped(a7.a aVar, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        onActivityStoppedByScionActivityInfo(Y.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void onActivityStoppedByScionActivityInfo(Y y10, long j) {
        c();
        Y0 y11 = this.f14525f.f17566D;
        C1023u0.l(y11);
        if (y11.f17232t != null) {
            Y0 y12 = this.f14525f.f17566D;
            C1023u0.l(y12);
            y12.H();
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void performAction(Bundle bundle, N n6, long j) {
        c();
        n6.D(null);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void registerOnMeasurementEventListener(T t2) {
        Object w9;
        c();
        C1350e c1350e = this.g;
        synchronized (c1350e) {
            try {
                w9 = (J0) c1350e.get(Integer.valueOf(t2.f()));
                if (w9 == null) {
                    w9 = new W1(this, t2);
                    c1350e.put(Integer.valueOf(t2.f()), w9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.p();
        if (y10.f17234v.add(w9)) {
            return;
        }
        X x9 = ((C1023u0) y10.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17185z.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void resetAnalyticsData(long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.f17236x.set(null);
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new P0(y10, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void retrieveAndUploadBatches(P p10) {
        EnumC0977e1 enumC0977e1;
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.p();
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        if (c1014r0.u()) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        if (Thread.currentThread() == c1014r1.f17533u) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (e.q()) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17182w.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        X x12 = c1023u0.f17584w;
        C1023u0.m(x12);
        x12.f17178E.a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            X x13 = c1023u0.f17584w;
            C1023u0.m(x13);
            x13.f17178E.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C1014r0 c1014r2 = c1023u0.f17585x;
            C1023u0.m(c1014r2);
            c1014r2.y(atomicReference, 10000L, "[sgtm] Getting upload batches", new R0(y10, atomicReference, 6, false));
            K1 k7 = (K1) atomicReference.get();
            if (k7 == null) {
                break;
            }
            List list = k7.f17026r;
            if (list.isEmpty()) {
                break;
            }
            X x14 = c1023u0.f17584w;
            C1023u0.m(x14);
            x14.f17178E.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                I1 i11 = (I1) it.next();
                try {
                    URL url = new URI(i11.f17014t).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    O oR = ((C1023u0) y10.f16104r).r();
                    oR.p();
                    y.f(oR.f17050x);
                    String str = oR.f17050x;
                    C1023u0 c1023u1 = (C1023u0) y10.f16104r;
                    X x15 = c1023u1.f17584w;
                    C1023u0.m(x15);
                    V v10 = x15.f17178E;
                    Long lValueOf = Long.valueOf(i11.f17012r);
                    v10.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, i11.f17014t, Integer.valueOf(i11.f17013s.length));
                    if (!TextUtils.isEmpty(i11.f17018x)) {
                        X x16 = c1023u1.f17584w;
                        C1023u0.m(x16);
                        x16.f17178E.c(lValueOf, i11.f17018x, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = i11.f17015u;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    C0971c1 c0971c1 = c1023u1.f17568F;
                    C1023u0.m(c0971c1);
                    byte[] bArr = i11.f17013s;
                    i iVar = new i(y10, atomicReference2, i11);
                    c0971c1.q();
                    y.f(url);
                    y.f(bArr);
                    C1014r0 c1014r3 = ((C1023u0) c0971c1.f16104r).f17585x;
                    C1023u0.m(c1014r3);
                    c1014r3.A(new RunnableC0964a0(c0971c1, str, url, bArr, map, iVar));
                    try {
                        V1 v11 = c1023u1.f17587z;
                        C1023u0.k(v11);
                        C1023u0 c1023u2 = (C1023u0) v11.f16104r;
                        c1023u2.f17564B.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    c1023u2.f17564B.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        X x17 = ((C1023u0) y10.f16104r).f17584w;
                        C1023u0.m(x17);
                        x17.f17185z.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    enumC0977e1 = atomicReference2.get() == null ? EnumC0977e1.UNKNOWN : (EnumC0977e1) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e10) {
                    X x18 = ((C1023u0) y10.f16104r).f17584w;
                    C1023u0.m(x18);
                    x18.f17182w.d("[sgtm] Bad upload url for row_id", i11.f17014t, Long.valueOf(i11.f17012r), e10);
                    enumC0977e1 = EnumC0977e1.FAILURE;
                }
                if (enumC0977e1 != EnumC0977e1.SUCCESS) {
                    if (enumC0977e1 == EnumC0977e1.BACKOFF) {
                        z10 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        X x19 = c1023u0.f17584w;
        C1023u0.m(x19);
        x19.f17178E.c(Integer.valueOf(size), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            p10.d();
        } catch (RemoteException e11) {
            C1023u0 c1023u3 = this.f14525f;
            y.f(c1023u3);
            X x20 = c1023u3.f17584w;
            C1023u0.m(x20);
            x20.f17185z.b(e11, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setConditionalUserProperty(Bundle bundle, long j) {
        c();
        if (bundle == null) {
            X x9 = this.f14525f.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Conditional user property must not be null");
        } else {
            Y0 y10 = this.f14525f.f17566D;
            C1023u0.l(y10);
            y10.B(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setConsentThirdParty(Bundle bundle, long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.I(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setCurrentScreen(a7.a aVar, String str, String str2, long j) {
        c();
        Activity activity = (Activity) b.G0(aVar);
        y.f(activity);
        setCurrentScreenByScionActivityInfo(Y.b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.Y r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.Y, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setDataCollectionEnabled(boolean z10) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.p();
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new N0(y10, z10));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new S0(y10, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setEventInterceptor(T t2) {
        c();
        n nVar = new n(5, this, t2, false);
        C1014r0 c1014r0 = this.f14525f.f17585x;
        C1023u0.m(c1014r0);
        if (!c1014r0.u()) {
            C1014r0 c1014r1 = this.f14525f.f17585x;
            C1023u0.m(c1014r1);
            c1014r1.x(new a(15, this, nVar, false));
            return;
        }
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.o();
        y10.p();
        n nVar2 = y10.f17233u;
        if (nVar != nVar2) {
            y.h("EventInterceptor already set.", nVar2 == null);
        }
        y10.f17233u = nVar;
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.V v10) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setMeasurementEnabled(boolean z10, long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        Boolean boolValueOf = Boolean.valueOf(z10);
        y10.p();
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new a(13, y10, boolValueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setMinimumSessionDuration(long j) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setSessionTimeoutDuration(long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C1014r0 c1014r0 = ((C1023u0) y10.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new P0(y10, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setSgtmDebugInfo(Intent intent) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        Uri data = intent.getData();
        if (data == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17176C.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17176C.a("[sgtm] Preview Mode was not enabled.");
            c1023u0.f17582u.f17359t = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        X x11 = c1023u0.f17584w;
        C1023u0.m(x11);
        x11.f17176C.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c1023u0.f17582u.f17359t = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setUserId(String str, long j) {
        c();
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        if (str != null && TextUtils.isEmpty(str)) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("User ID must be non-empty or null");
        } else {
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new a(16, y10, str));
            y10.y(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void setUserProperty(String str, String str2, a7.a aVar, boolean z10, long j) {
        c();
        Object objG0 = b.G0(aVar);
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.y(str, str2, objG0, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public void unregisterOnMeasurementEventListener(T t2) {
        Object w9;
        c();
        C1350e c1350e = this.g;
        synchronized (c1350e) {
            w9 = (J0) c1350e.remove(Integer.valueOf(t2.f()));
        }
        if (w9 == null) {
            w9 = new W1(this, t2);
        }
        Y0 y10 = this.f14525f.f17566D;
        C1023u0.l(y10);
        y10.p();
        if (y10.f17234v.remove(w9)) {
            return;
        }
        X x9 = ((C1023u0) y10.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17185z.a("OnEventListener had not been registered");
    }
}
