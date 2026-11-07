package p018b9;

import Y2.a;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f13342a = new HashSet();

    public final void a() {
        if (a.f10379e == null) {
            a.f10379e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != a.f10379e) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f13342a.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
    }
}
