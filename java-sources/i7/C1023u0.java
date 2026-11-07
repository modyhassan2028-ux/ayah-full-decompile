package i7;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0902x2;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p056f2.AbstractC0939l;

/* JADX INFO: renamed from: i7.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023u0 implements D0 {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static volatile C1023u0 f17562V;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final S f17563A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Y6.a f17564B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0992j1 f17565C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Y0 f17566D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final A f17567E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0971c1 f17568F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f17569G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Q f17570H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1021t1 f17571I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1008p f17572J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public O f17573K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0974d1 f17574L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Boolean f17576N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f17577O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public volatile Boolean f17578P;
    public volatile boolean Q;
    public int R;
    public int S;
    public final long U;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f17579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f17580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final H8.e f17581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0981g f17582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0985h0 f17583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X f17584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1014r0 f17585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B1 f17586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V1 f17587z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f17575M = false;
    public final AtomicInteger T = new AtomicInteger(0);

    public C1023u0(K0 k7) {
        b8.d eVar;
        Context context = k7.f17020a;
        H8.e eVar2 = new H8.e(29);
        this.f17581t = eVar2;
        I0.f17011k = eVar2;
        this.f17579r = context;
        this.f17580s = k7.f17024e;
        this.f17578P = k7.f17021b;
        this.f17569G = k7.g;
        this.Q = true;
        if (com.google.android.gms.internal.measurement.O1.f14083h == null && context != null) {
            Object obj = com.google.android.gms.internal.measurement.O1.g;
            synchronized (obj) {
                try {
                    if (com.google.android.gms.internal.measurement.O1.f14083h == null) {
                        synchronized (obj) {
                            try {
                                com.google.android.gms.internal.measurement.E1 e10 = com.google.android.gms.internal.measurement.O1.f14083h;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext == null) {
                                    applicationContext = context;
                                }
                                if (e10 == null || e10.f14019a != applicationContext) {
                                    if (e10 != null) {
                                        com.google.android.gms.internal.measurement.G1.c();
                                        com.google.android.gms.internal.measurement.Q1.a();
                                        com.google.android.gms.internal.measurement.J1.i();
                                    }
                                    C0902x2 c0902x2 = new C0902x2(applicationContext);
                                    if (c0902x2 instanceof Serializable) {
                                        eVar = new b8.e(c0902x2);
                                    } else {
                                        b8.f fVar = new b8.f();
                                        fVar.f13332r = c0902x2;
                                        eVar = fVar;
                                    }
                                    com.google.android.gms.internal.measurement.O1.f14083h = new com.google.android.gms.internal.measurement.E1(applicationContext, eVar);
                                    com.google.android.gms.internal.measurement.O1.f14084i.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f17564B = Y6.a.f10437a;
        Long l10 = k7.f17025f;
        this.U = l10 != null ? l10.longValue() : System.currentTimeMillis();
        C0981g c0981g = new C0981g(this);
        c0981g.f17360u = R7.f.f7291s;
        this.f17582u = c0981g;
        C0985h0 c0985h0 = new C0985h0(this);
        c0985h0.r();
        this.f17583v = c0985h0;
        X x9 = new X(this);
        x9.r();
        this.f17584w = x9;
        V1 v10 = new V1(this);
        v10.r();
        this.f17587z = v10;
        this.f17563A = new S(new C0991j0(k7, this));
        this.f17567E = new A(this);
        C0992j1 c0992j1 = new C0992j1(this);
        c0992j1.q();
        this.f17565C = c0992j1;
        Y0 y10 = new Y0(this);
        y10.q();
        this.f17566D = y10;
        B1 b5 = new B1(this);
        b5.q();
        this.f17586y = b5;
        C0971c1 c0971c1 = new C0971c1(this);
        c0971c1.r();
        this.f17568F = c0971c1;
        C1014r0 c1014r0 = new C1014r0(this);
        c1014r0.r();
        this.f17585x = c1014r0;
        com.google.android.gms.internal.measurement.W w9 = k7.f17023d;
        boolean z10 = w9 == null || w9.f14147s == 0;
        if (context.getApplicationContext() instanceof Application) {
            l(y10);
            if (((C1023u0) y10.f16104r).f17579r.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C1023u0) y10.f16104r).f17579r.getApplicationContext();
                if (y10.f17232t == null) {
                    y10.f17232t = new U0(y10);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(y10.f17232t);
                    application.registerActivityLifecycleCallbacks(y10.f17232t);
                    X x10 = ((C1023u0) y10.f16104r).f17584w;
                    m(x10);
                    x10.f17178E.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(x9);
            x9.f17185z.a("Application context is not an Application");
        }
        c1014r0.x(new p039d8.a(10, this, k7, false));
    }

    public static final void j(E e10) {
        if (e10 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(AbstractC0939l abstractC0939l) {
        if (abstractC0939l == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void l(I i10) {
        if (i10 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!i10.f17002s) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(i10.getClass())));
        }
    }

    public static final void m(C0 c10) {
        if (c10 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!c10.f16847s) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c10.getClass())));
        }
    }

    public static C1023u0 s(Context context, com.google.android.gms.internal.measurement.W w9, Long l10) {
        Bundle bundle;
        if (w9 != null) {
            Bundle bundle2 = w9.f14149u;
            w9 = new com.google.android.gms.internal.measurement.W(w9.f14146r, w9.f14147s, w9.f14148t, bundle2, null);
        }
        U6.y.f(context);
        U6.y.f(context.getApplicationContext());
        if (f17562V == null) {
            synchronized (C1023u0.class) {
                try {
                    if (f17562V == null) {
                        f17562V = new C1023u0(new K0(context, w9, l10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (w9 != null && (bundle = w9.f14149u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            U6.y.f(f17562V);
            f17562V.f17578P = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        U6.y.f(f17562V);
        return f17562V;
    }

    public final boolean a() {
        return g() == 0;
    }

    @Override // i7.D0
    public final X b() {
        X x9 = this.f17584w;
        m(x9);
        return x9;
    }

    @Override // i7.D0
    public final C1014r0 c() {
        C1014r0 c1014r0 = this.f17585x;
        m(c1014r0);
        return c1014r0;
    }

    @Override // i7.D0
    public final Context d() {
        return this.f17579r;
    }

    @Override // i7.D0
    public final Y6.a e() {
        return this.f17564B;
    }

    @Override // i7.D0
    public final H8.e f() {
        return this.f17581t;
    }

    public final int g() {
        C1014r0 c1014r0 = this.f17585x;
        m(c1014r0);
        c1014r0.o();
        C0981g c0981g = this.f17582u;
        if (c0981g.B()) {
            return 1;
        }
        m(c1014r0);
        c1014r0.o();
        if (!this.Q) {
            return 8;
        }
        C0985h0 c0985h0 = this.f17583v;
        k(c0985h0);
        c0985h0.o();
        Boolean boolValueOf = c0985h0.s().contains("measurement_enabled") ? Boolean.valueOf(c0985h0.s().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        H8.e eVar = ((C1023u0) c0981g.f16104r).f17581t;
        Boolean boolA = c0981g.A("firebase_analytics_collection_enabled");
        if (boolA != null) {
            return boolA.booleanValue() ? 0 : 4;
        }
        return (this.f17578P == null || this.f17578P.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        V1 v10;
        boolean z10;
        Context context;
        if (!this.f17575M) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C1014r0 c1014r0 = this.f17585x;
        m(c1014r0);
        c1014r0.o();
        Boolean bool = this.f17576N;
        Y6.a aVar = this.f17564B;
        if (bool == null || this.f17577O == 0) {
            aVar.getClass();
            this.f17577O = SystemClock.elapsedRealtime();
            v10 = this.f17587z;
            k(v10);
            z10 = false;
            if (v10.N("android.permission.INTERNET") && v10.N("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f17579r;
                if (Z6.b.a(context).c() || this.f17582u.r() || (V1.g0(context) && V1.H(context))) {
                    z10 = true;
                }
            }
            this.f17576N = Boolean.valueOf(z10);
            if (z10) {
                this.f17576N = Boolean.valueOf(v10.s(r().v()));
            }
        } else if (!bool.booleanValue()) {
            aVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f17577O) > 1000) {
                aVar.getClass();
                this.f17577O = SystemClock.elapsedRealtime();
                v10 = this.f17587z;
                k(v10);
                z10 = false;
                if (v10.N("android.permission.INTERNET")) {
                    context = this.f17579r;
                    if (Z6.b.a(context).c()) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                }
                this.f17576N = Boolean.valueOf(z10);
                if (z10) {
                    this.f17576N = Boolean.valueOf(v10.s(r().v()));
                }
            }
        }
        return this.f17576N.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i10, Throwable th, byte[] bArr) {
        X x9;
        X x10;
        int i11 = i10;
        X x11 = this.f17584w;
        if (i11 == 200 || i11 == 204) {
            if (th == null) {
                C0985h0 c0985h0 = this.f17583v;
                k(c0985h0);
                c0985h0.f17394K.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(x11);
                    x11.f17177D.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        m(x11);
                        x11.f17177D.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    V1 v10 = this.f17587z;
                    k(v10);
                    C1023u0 c1023u0 = (C1023u0) v10.f16104r;
                    if (TextUtils.isEmpty(strOptString)) {
                        x10 = x11;
                    } else {
                        Context context = c1023u0.f17579r;
                        x10 = x11;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.f17566D.v("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = c1023u0.f17579r;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e10) {
                                    X x12 = ((C1023u0) v10.f16104r).f17584w;
                                    m(x12);
                                    x12.f17182w.b(e10, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            x9 = x10;
                            m(x9);
                            x9.f17182w.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    m(x10);
                    x9 = x10;
                    try {
                        x9.f17185z.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e12) {
                        e = e12;
                        m(x9);
                        x9.f17182w.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    x9 = x11;
                }
            }
        } else if (i11 == 304) {
            i11 = 304;
            if (th == null) {
                C0985h0 c0985h1 = this.f17583v;
                k(c0985h1);
                c0985h1.f17394K.b(true);
                if (bArr != null) {
                }
                m(x11);
                x11.f17177D.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(x11);
        x11.f17185z.c(Integer.valueOf(i11), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final S n() {
        return this.f17563A;
    }

    public final Q o() {
        l(this.f17570H);
        return this.f17570H;
    }

    public final C1021t1 p() {
        l(this.f17571I);
        return this.f17571I;
    }

    public final C1008p q() {
        m(this.f17572J);
        return this.f17572J;
    }

    public final O r() {
        l(this.f17573K);
        return this.f17573K;
    }
}
