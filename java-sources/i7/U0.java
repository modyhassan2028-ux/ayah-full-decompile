package i7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y0 f17155r;

    public U0(Y0 y10) {
        this.f17155r = y10;
    }

    public final void a(com.google.android.gms.internal.measurement.Y y10, Bundle bundle) {
        C0992j1 c0992j1;
        C1023u0 c1023u0;
        Uri uri;
        Y0 y11 = this.f17155r;
        try {
            try {
                C1023u0 c1023u1 = (C1023u0) y11.f16104r;
                X x9 = c1023u1.f17584w;
                C1023u0.m(x9);
                x9.f17178E.a("onActivityCreated");
                Intent intent = y10.f14177t;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        C1023u0.k(c1023u1.f17587z);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z10 = bundle == null;
                        C1014r0 c1014r0 = c1023u1.f17585x;
                        C1023u0.m(c1014r0);
                        c1014r0.x(new O0(this, z10, uri, str, queryParameter));
                        c1023u0 = (C1023u0) y11.f16104r;
                    }
                    c0992j1 = c1023u0.f17565C;
                }
                c1023u0 = (C1023u0) y11.f16104r;
            } catch (RuntimeException e10) {
                X x10 = ((C1023u0) y11.f16104r).f17584w;
                C1023u0.m(x10);
                x10.f17182w.b(e10, "Throwable caught in onActivityCreated");
            }
            c0992j1 = c1023u0.f17565C;
        } finally {
            c0992j1 = ((C1023u0) y11.f16104r).f17565C;
            C1023u0.l(c0992j1);
            c0992j1.w(y10, bundle);
        }
    }

    public final void b(com.google.android.gms.internal.measurement.Y y10) {
        C0992j1 c0992j1 = ((C1023u0) this.f17155r.f16104r).f17565C;
        C1023u0.l(c0992j1);
        synchronized (c0992j1.f17427C) {
            try {
                if (Objects.equals(c0992j1.f17432x, y10)) {
                    c0992j1.f17432x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C1023u0) c0992j1.f16104r).f17582u.C()) {
            c0992j1.f17431w.remove(Integer.valueOf(y10.f14175r));
        }
    }

    public final void c(com.google.android.gms.internal.measurement.Y y10) {
        C1023u0 c1023u0 = (C1023u0) this.f17155r.f16104r;
        C0992j1 c0992j1 = c1023u0.f17565C;
        C1023u0.l(c0992j1);
        synchronized (c0992j1.f17427C) {
            c0992j1.f17426B = false;
            c0992j1.f17433y = true;
        }
        C1023u0 c1023u1 = (C1023u0) c0992j1.f16104r;
        c1023u1.f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1023u1.f17582u.C()) {
            C0983g1 c0983g1T = c0992j1.t(y10);
            c0992j1.f17429u = c0992j1.f17428t;
            c0992j1.f17428t = null;
            C1014r0 c1014r0 = c1023u1.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new RunnableC0963a(c0992j1, c0983g1T, jElapsedRealtime));
        } else {
            c0992j1.f17428t = null;
            C1014r0 c1014r1 = c1023u1.f17585x;
            C1023u0.m(c1014r1);
            c1014r1.x(new RunnableC1037z(c0992j1, jElapsedRealtime));
        }
        B1 b5 = c1023u0.f17586y;
        C1023u0.l(b5);
        C1023u0 c1023u2 = (C1023u0) b5.f16104r;
        c1023u2.f17564B.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C1014r0 c1014r2 = c1023u2.f17585x;
        C1023u0.m(c1014r2);
        c1014r2.x(new RunnableC1033x1(b5, jElapsedRealtime2, 1));
    }

    public final void d(com.google.android.gms.internal.measurement.Y y10) {
        C1023u0 c1023u0 = (C1023u0) this.f17155r.f16104r;
        B1 b5 = c1023u0.f17586y;
        C1023u0.l(b5);
        C1023u0 c1023u1 = (C1023u0) b5.f16104r;
        c1023u1.f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1014r0 c1014r0 = c1023u1.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC1033x1(b5, jElapsedRealtime, 0));
        C0992j1 c0992j1 = c1023u0.f17565C;
        C1023u0.l(c0992j1);
        Object obj = c0992j1.f17427C;
        synchronized (obj) {
            c0992j1.f17426B = true;
            if (!Objects.equals(y10, c0992j1.f17432x)) {
                synchronized (obj) {
                    c0992j1.f17432x = y10;
                    c0992j1.f17433y = false;
                    C1023u0 c1023u2 = (C1023u0) c0992j1.f16104r;
                    if (c1023u2.f17582u.C()) {
                        c0992j1.f17434z = null;
                        C1014r0 c1014r1 = c1023u2.f17585x;
                        C1023u0.m(c1014r1);
                        c1014r1.x(new RunnableC0989i1(c0992j1, 1));
                    }
                }
            }
        }
        C1023u0 c1023u3 = (C1023u0) c0992j1.f16104r;
        if (!c1023u3.f17582u.C()) {
            c0992j1.f17428t = c0992j1.f17434z;
            C1014r0 c1014r2 = c1023u3.f17585x;
            C1023u0.m(c1014r2);
            c1014r2.x(new RunnableC0989i1(c0992j1, 0));
            return;
        }
        c0992j1.x(y10.f14176s, c0992j1.t(y10), false);
        A a9 = ((C1023u0) c0992j1.f16104r).f17567E;
        C1023u0.j(a9);
        C1023u0 c1023u4 = (C1023u0) a9.f16104r;
        c1023u4.f17564B.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C1014r0 c1014r3 = c1023u4.f17585x;
        C1023u0.m(c1014r3);
        c1014r3.x(new RunnableC1037z(a9, jElapsedRealtime2));
    }

    public final void e(com.google.android.gms.internal.measurement.Y y10, Bundle bundle) {
        C0983g1 c0983g1;
        C0992j1 c0992j1 = ((C1023u0) this.f17155r.f16104r).f17565C;
        C1023u0.l(c0992j1);
        if (!((C1023u0) c0992j1.f16104r).f17582u.C() || bundle == null || (c0983g1 = (C0983g1) c0992j1.f17431w.get(Integer.valueOf(y10.f14175r))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c0983g1.f17369c);
        bundle2.putString("name", c0983g1.f17367a);
        bundle2.putString("referrer_name", c0983g1.f17368b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(com.google.android.gms.internal.measurement.Y.b(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.Y.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(com.google.android.gms.internal.measurement.Y.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.Y.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(com.google.android.gms.internal.measurement.Y.b(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
