package F7;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2476s;

    public /* synthetic */ q(int i10, Object obj) {
        this.f2475r = i10;
        this.f2476s = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f2475r) {
            case 0:
                u uVar = (u) this.f2476s;
                float rotation = uVar.f2515v.getRotation();
                if (uVar.f2508o != rotation) {
                    uVar.f2508o = rotation;
                    uVar.q();
                }
                break;
            default:
                ((CoordinatorLayout) this.f2476s).u(0);
                break;
        }
        return true;
    }
}
