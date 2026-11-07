package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0841l0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14352r;

    public C0841l0(C0846m0 c0846m0) {
        this.f14352r = c0846m0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f14352r.a(new C0791b0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f14352r.a(new C0836k0(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f14352r.a(new C0836k0(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f14352r.a(new C0836k0(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        I i10 = new I();
        this.f14352r.a(new C0791b0(this, activity, i10));
        Bundle bundleC = i10.c(50L);
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f14352r.a(new C0836k0(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f14352r.a(new C0836k0(this, activity, 3));
    }
}
