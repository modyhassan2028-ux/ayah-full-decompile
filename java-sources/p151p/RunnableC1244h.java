package p151p;

import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;
import p140o.i;
import p140o.k;

/* JADX INFO: renamed from: p.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1244h implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f20663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f20664t;

    public /* synthetic */ RunnableC1244h(int i10, Object obj, Object obj2) {
        this.f20662r = i10;
        this.f20664t = obj;
        this.f20663s = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        switch (this.f20662r) {
            case 0:
                C1240f c1240f = (C1240f) this.f20663s;
                C1250k c1250k = (C1250k) this.f20664t;
                k kVar = c1250k.f20709t;
                if (kVar != null && (iVar = kVar.f20138e) != null) {
                    iVar.z(kVar);
                }
                View view = (View) c1250k.f20714y;
                if (view != null && view.getWindowToken() != null) {
                    if (c1240f.b()) {
                        c1250k.f20701K = c1240f;
                    } else if (c1240f.f20201e != null) {
                        c1240f.d(0, 0, false, false);
                        c1250k.f20701K = c1240f;
                    }
                }
                c1250k.f20703M = null;
                break;
            default:
                View view2 = (View) this.f20663s;
                int left = view2.getLeft();
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.f20664t;
                scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view2.getWidth()) / 2), 0);
                scrollingTabContainerView.f11583r = null;
                break;
        }
    }
}
