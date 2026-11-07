package K0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class S implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Configuration f5010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P0.c f5011s;

    public S(Configuration configuration, P0.c cVar) {
        this.f5010r = configuration;
        this.f5011s = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f5010r;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f5011s.f6578a.entrySet().iterator();
        while (it.hasNext()) {
            P0.a aVar = (P0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f6575b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5011s.f6578a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f5011s.f6578a.clear();
    }
}
