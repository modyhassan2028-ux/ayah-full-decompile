package C2;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p084i.AbstractC0961i;
import p084i.AbstractC0962j;
import p084i.x;
import u.C1346a;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f711s;

    public /* synthetic */ g(Context context, int i10) {
        this.f710r = i10;
        this.f711s = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    @Override // java.lang.Runnable
    public final void run() {
        E1.e eVar;
        Object systemService;
        Context context;
        switch (this.f710r) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f711s, 1));
                break;
            case 1:
                e.t(this.f711s, new B2.c(0), e.f700a, false);
                break;
            default:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    Context context2 = this.f711s;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i10 >= 33) {
                            C1351f c1351f = p084i.k.f16614x;
                            c1351f.getClass();
                            C1346a c1346a = new C1346a(c1351f);
                            while (true) {
                                if (c1346a.hasNext()) {
                                    p084i.k kVar = (p084i.k) ((WeakReference) c1346a.next()).get();
                                    if (kVar != null && (context = ((x) kVar).f16652B) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                eVar = new E1.e(new E1.h(AbstractC0962j.a(systemService)));
                            } else {
                                eVar = E1.e.f1425b;
                            }
                        } else {
                            eVar = p084i.k.f16610t;
                            if (eVar == null) {
                                eVar = E1.e.f1425b;
                            }
                        }
                        if (eVar.f1426a.isEmpty()) {
                            String strE = p216w1.e.e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC0962j.b(systemService2, AbstractC0961i.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                p084i.k.f16613w = true;
                break;
        }
    }
}
