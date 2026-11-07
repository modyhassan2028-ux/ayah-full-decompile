package T6;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f7809v = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f7810r = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f7811s = new AtomicBoolean();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f7812t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7813u = false;

    public static void b(Application application) {
        c cVar = f7809v;
        synchronized (cVar) {
            try {
                if (!cVar.f7813u) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f7813u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(b bVar) {
        synchronized (f7809v) {
            this.f7812t.add(bVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f7809v) {
            try {
                ArrayList arrayList = this.f7812t;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((b) obj).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f7810r.compareAndSet(true, false);
        this.f7811s.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f7810r.compareAndSet(true, false);
        this.f7811s.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f7810r.compareAndSet(false, true)) {
            this.f7811s.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
