package Q8;

import K9.AbstractC0405x;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0 f6946r;

    public a0(f0 f0Var) {
        p251z9.j.e(f0Var, "sharedSessionRepository");
        this.f6946r = f0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        p251z9.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        p251z9.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        p251z9.j.e(activity, "activity");
        this.f6946r.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        p251z9.j.e(activity, "activity");
        f0 f0Var = this.f6946r;
        f0Var.f6991i = true;
        K k7 = f0Var.f6990h;
        if (k7 == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        p150o9.c cVar = null;
        if (k7 == null) {
            p251z9.j.k("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + f0Var.f6989f.a());
        if (f0Var.d(k7) || f0Var.c(k7)) {
            AbstractC0405x.x(AbstractC0405x.b(f0Var.g), null, new O9.y(f0Var, k7, cVar, 4), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p251z9.j.e(activity, "activity");
        p251z9.j.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        p251z9.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        p251z9.j.e(activity, "activity");
    }
}
