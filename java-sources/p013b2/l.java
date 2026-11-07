package p013b2;

import B0.c;
import B9.a;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ThreadPoolExecutor;
import p056f2.C0933f;
import p056f2.X;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13170u;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        this.f13167r = i10;
        this.f13168s = obj;
        this.f13169t = obj2;
        this.f13170u = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13167r) {
            case 0:
                n nVar = (n) this.f13168s;
                a aVar = (a) this.f13169t;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f13170u;
                try {
                    t tVarS = c.s(nVar.f13172a);
                    if (tVarS == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) tVarS.f1626b);
                    synchronized (sVar.f13185d) {
                        sVar.f13187f = threadPoolExecutor;
                        break;
                    }
                    ((i) tVarS.f1626b).a(new m(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.N(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ViewGroup viewGroup = (ViewGroup) this.f13168s;
                View view = (View) this.f13169t;
                C0933f c0933f = (C0933f) this.f13170u;
                j.e(viewGroup, "$container");
                j.e(c0933f, "this$0");
                viewGroup.endViewTransition(view);
                ((X) c0933f.f16091c.f16104r).c(c0933f);
                return;
        }
    }
}
