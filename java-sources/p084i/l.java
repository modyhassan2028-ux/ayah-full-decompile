package p084i;

import I1.S;
import I1.Z;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f16618s;

    public /* synthetic */ l(x xVar, int i10) {
        this.f16617r = i10;
        this.f16618s = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f16617r) {
            case 0:
                x xVar = this.f16618s;
                if ((xVar.f16688q0 & 1) != 0) {
                    xVar.v(0);
                }
                if ((xVar.f16688q0 & 4096) != 0) {
                    xVar.v(108);
                }
                xVar.f16687p0 = false;
                xVar.f16688q0 = 0;
                break;
            default:
                x xVar2 = this.f16618s;
                xVar2.f16664N.showAtLocation(xVar2.f16663M, 55, 0, 0);
                Z z10 = xVar2.f16666P;
                if (z10 != null) {
                    z10.b();
                }
                if (xVar2.Q && (viewGroup = xVar2.R) != null && viewGroup.isLaidOut()) {
                    xVar2.f16663M.setAlpha(0.0f);
                    Z zA = S.a(xVar2.f16663M);
                    zA.a(1.0f);
                    xVar2.f16666P = zA;
                    zA.d(new o(0, this));
                } else {
                    xVar2.f16663M.setAlpha(1.0f);
                    xVar2.f16663M.setVisibility(0);
                }
                break;
        }
    }
}
