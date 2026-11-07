package p216w1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import p169q7.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f23570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Activity f23571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f23572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23573u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23574v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23575w = false;

    public c(Activity activity) {
        this.f23571s = activity;
        this.f23572t = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f23571s == activity) {
            this.f23571s = null;
            this.f23574v = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f23574v || this.f23575w || this.f23573u) {
            return;
        }
        Object obj = this.f23570r;
        try {
            Object obj2 = d.f23578c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f23572t) {
                d.g.postAtFrontOfQueue(new b(3, d.f23577b.get(activity), obj2));
                this.f23575w = true;
                this.f23570r = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f23571s == activity) {
            this.f23573u = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
