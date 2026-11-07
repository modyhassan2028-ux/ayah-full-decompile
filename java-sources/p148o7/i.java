package p148o7;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f20369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20370s = 0;

    public i() {
    }

    @Override // u1.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        x(coordinatorLayout, view, i10);
        if (this.f20369r == null) {
            this.f20369r = new j(view);
        }
        j jVar = this.f20369r;
        View view2 = jVar.f20371a;
        jVar.f20372b = view2.getTop();
        jVar.f20373c = view2.getLeft();
        this.f20369r.a();
        int i11 = this.f20370s;
        if (i11 == 0) {
            return true;
        }
        this.f20369r.b(i11);
        this.f20370s = 0;
        return true;
    }

    public final int w() {
        j jVar = this.f20369r;
        if (jVar != null) {
            return jVar.f20374d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.v(i10, view);
    }

    public i(int i10) {
    }
}
