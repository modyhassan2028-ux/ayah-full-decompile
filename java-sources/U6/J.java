package U6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static final Object g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static J f8216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HandlerThread f8217i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8218a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile com.google.android.gms.internal.measurement.H f8220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X6.a f8221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8223f;

    public J(Context context, Looper looper) {
        I i10 = new I(this);
        this.f8219b = context.getApplicationContext();
        com.google.android.gms.internal.measurement.H h7 = new com.google.android.gms.internal.measurement.H(looper, i10);
        Looper.getMainLooper();
        this.f8220c = h7;
        this.f8221d = X6.a.a();
        this.f8222e = 5000L;
        this.f8223f = 300000L;
    }

    public static J a(Context context) {
        synchronized (g) {
            try {
                if (f8216h == null) {
                    f8216h = new J(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8216h;
    }

    public static HandlerThread b() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = f8217i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f8217i = handlerThread2;
                handlerThread2.start();
                return f8217i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R6.b c(G g10, C c10, String str, Executor executor) {
        synchronized (this.f8218a) {
            try {
                H h7 = (H) this.f8218a.get(g10);
                R6.b bVarA = null;
                if (executor == null) {
                    executor = null;
                }
                if (h7 == null) {
                    h7 = new H(this, g10);
                    h7.f8209a.put(c10, c10);
                    bVarA = H.a(h7, str, executor);
                    this.f8218a.put(g10, h7);
                } else {
                    this.f8220c.removeMessages(0, g10);
                    if (h7.f8209a.containsKey(c10)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g10.toString()));
                    }
                    h7.f8209a.put(c10, c10);
                    int i10 = h7.f8210b;
                    if (i10 == 1) {
                        c10.onServiceConnected(h7.f8214f, h7.f8212d);
                    } else if (i10 == 2) {
                        bVarA = H.a(h7, str, executor);
                    }
                }
                if (h7.f8211c) {
                    return R6.b.f7232v;
                }
                if (bVarA == null) {
                    bVarA = new R6.b(-1);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z10) {
        G g10 = new G(str, z10);
        y.g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8218a) {
            try {
                H h7 = (H) this.f8218a.get(g10);
                if (h7 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g10.toString()));
                }
                if (!h7.f8209a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g10.toString()));
                }
                h7.f8209a.remove(serviceConnection);
                if (h7.f8209a.isEmpty()) {
                    this.f8220c.sendMessageDelayed(this.f8220c.obtainMessage(0, g10), this.f8222e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
