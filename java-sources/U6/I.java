package U6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f8215a;

    public /* synthetic */ I(J j) {
        this.f8215a = j;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f8215a.f8218a) {
                try {
                    G g = (G) message.obj;
                    H h7 = (H) this.f8215a.f8218a.get(g);
                    if (h7 != null && h7.f8209a.isEmpty()) {
                        if (h7.f8211c) {
                            h7.g.f8220c.removeMessages(1, h7.f8213e);
                            J j = h7.g;
                            j.f8221d.b(j.f8219b, h7);
                            h7.f8211c = false;
                            h7.f8210b = 2;
                        }
                        this.f8215a.f8218a.remove(g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f8215a.f8218a) {
            try {
                G g10 = (G) message.obj;
                H h10 = (H) this.f8215a.f8218a.get(g10);
                if (h10 != null && h10.f8210b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g10)), new Exception());
                    ComponentName componentName = h10.f8214f;
                    if (componentName == null) {
                        g10.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = g10.f8207b;
                        y.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    h10.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
