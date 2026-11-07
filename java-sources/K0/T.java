package K0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class T implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P0.d f5012r;

    public T(P0.d dVar) {
        this.f5012r = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        P0.d dVar = this.f5012r;
        synchronized (dVar) {
            dVar.f6579a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        P0.d dVar = this.f5012r;
        synchronized (dVar) {
            dVar.f6579a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        P0.d dVar = this.f5012r;
        synchronized (dVar) {
            dVar.f6579a.c();
        }
    }
}
