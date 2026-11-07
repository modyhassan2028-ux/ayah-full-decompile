package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import p216w1.g;
import p216w1.h;
import p216w1.i;
import p216w1.l;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap f12314w = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f12315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f12316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f12317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12318u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f12319v;

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12319v = null;
        } else {
            this.f12319v = new ArrayList();
        }
    }

    public final void a(boolean z10) {
        if (this.f12317t == null) {
            this.f12317t = new g(this);
            h hVar = this.f12316s;
            if (hVar != null && z10) {
                synchronized (hVar) {
                    try {
                        if (!hVar.f23586c) {
                            hVar.f23586c = true;
                            hVar.f23585b.acquire(600000L);
                            hVar.f23584a.release();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f12317t.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList arrayList = this.f12319v;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f12317t = null;
                    ArrayList arrayList2 = this.f12319v;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f12318u) {
                        this.f12316s.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l lVar = this.f12315r;
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f12315r = new l(this);
            this.f12316s = null;
            return;
        }
        this.f12315r = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = f12314w;
        h hVar = (h) map.get(componentName);
        if (hVar == null) {
            if (i10 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            hVar = new h(this, componentName);
            map.put(componentName, hVar);
        }
        this.f12316s = hVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f12319v;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f12318u = true;
                this.f12316s.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f12319v == null) {
            return 2;
        }
        this.f12316s.b();
        synchronized (this.f12319v) {
            ArrayList arrayList = this.f12319v;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new i(this, intent, i11));
            a(true);
        }
        return 3;
    }
}
