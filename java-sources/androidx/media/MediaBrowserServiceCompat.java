package androidx.media;

import E6.u;
import F9.n;
import X4.c;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.session.i;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import p143o2.f;
import p143o2.g;
import p143o2.j;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f12700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f12701s = new c(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f12702t = new f(this, "android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f12703u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1350e f12704v = new C1350e(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f12705w;

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public MediaBrowserServiceCompat() {
        i iVar = new i(2);
        iVar.f11345b = this;
        this.f12705w = iVar;
    }

    public abstract n a();

    public abstract void b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((g) this.f12700r.f1961c).onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f12700r = new j(this);
        } else if (i10 >= 26) {
            this.f12700r = new p143o2.i(this);
        } else {
            this.f12700r = new u(this);
        }
        this.f12700r.v();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f12705w.f11345b = null;
    }
}
