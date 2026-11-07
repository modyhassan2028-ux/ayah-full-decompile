package p050e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import u.C1349d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f15839b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15840a;

    public e(Context context) {
        this.f15840a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f15841k) {
            try {
                Iterator it = ((C1349d) f.f15842l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15840a.unregisterReceiver(this);
    }
}
