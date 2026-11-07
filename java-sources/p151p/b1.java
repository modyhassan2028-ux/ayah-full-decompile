package p151p;

import androidx.appcompat.widget.Toolbar;
import p140o.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Toolbar f20640s;

    public /* synthetic */ b1(Toolbar toolbar, int i10) {
        this.f20639r = i10;
        this.f20640s = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20639r) {
            case 0:
                d1 d1Var = this.f20640s.f11697g0;
                m mVar = d1Var == null ? null : d1Var.f20653s;
                if (mVar != null) {
                    mVar.collapseActionView();
                }
                break;
            default:
                this.f20640s.n();
                break;
        }
    }
}
