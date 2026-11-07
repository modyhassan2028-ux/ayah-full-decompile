package K0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y f5034r;

    public X(Y y10) {
        this.f5034r = y10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5034r.f5041u.removeCallbacks(this);
        Y.g0(this.f5034r);
        Y y10 = this.f5034r;
        synchronized (y10.f5042v) {
            if (y10.f5037A) {
                y10.f5037A = false;
                ArrayList arrayList = y10.f5044x;
                y10.f5044x = y10.f5045y;
                y10.f5045y = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y.g0(this.f5034r);
        Y y10 = this.f5034r;
        synchronized (y10.f5042v) {
            if (y10.f5044x.isEmpty()) {
                y10.f5040t.removeFrameCallback(this);
                y10.f5037A = false;
            }
        }
    }
}
