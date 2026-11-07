package U6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class H implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8209a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8210b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f8212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f8213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f8214f;
    public final /* synthetic */ J g;

    public H(J j, G g) {
        this.g = j;
        this.f8213e = g;
    }

    public static R6.b a(H h7, String str, Executor executor) {
        try {
            Intent intentA = h7.f8213e.a(h7.g.f8219b);
            h7.f8210b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(Y6.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                J j = h7.g;
                boolean zC = j.f8221d.c(j.f8219b, str, intentA, h7, 4225, executor);
                h7.f8211c = zC;
                if (zC) {
                    h7.g.f8220c.sendMessageDelayed(h7.g.f8220c.obtainMessage(1, h7.f8213e), h7.g.f8223f);
                    return R6.b.f7232v;
                }
                h7.f8210b = 2;
                try {
                    J j10 = h7.g;
                    j10.f8221d.b(j10.f8219b, h7);
                } catch (IllegalArgumentException unused) {
                }
                return new R6.b(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (z e10) {
            return e10.f8314r;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f8218a) {
            try {
                this.g.f8220c.removeMessages(1, this.f8213e);
                this.f8212d = iBinder;
                this.f8214f = componentName;
                Iterator it = this.f8209a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8210b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f8218a) {
            try {
                this.g.f8220c.removeMessages(1, this.f8213e);
                this.f8212d = null;
                this.f8214f = componentName;
                Iterator it = this.f8209a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8210b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
