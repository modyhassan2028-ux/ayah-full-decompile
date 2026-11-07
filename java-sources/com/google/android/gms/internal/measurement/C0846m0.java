package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846m0 {
    public static volatile C0846m0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f14357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z0.B f14358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile L f14362f;

    public C0846m0(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0821h0(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14357a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f14358b = new Z0.B(10, this);
        this.f14359c = new ArrayList();
        int i10 = 0;
        try {
            if (i7.I0.b(context, i7.I0.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0846m0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f14361e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new C0791b0(this, context, bundle, i10));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0841l0(this));
        }
    }

    public static C0846m0 c(Context context, Bundle bundle) {
        U6.y.f(context);
        if (g == null) {
            synchronized (C0846m0.class) {
                try {
                    if (g == null) {
                        g = new C0846m0(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final void a(AbstractRunnableC0826i0 abstractRunnableC0826i0) {
        this.f14357a.execute(abstractRunnableC0826i0);
    }

    public final void b(Exception exc, boolean z10, boolean z11) {
        this.f14361e |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(new Z(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }
}
