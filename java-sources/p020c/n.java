package p020c;

import B0.c;
import I1.C0;
import I1.D0;
import I1.E0;
import I1.F0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class n extends u0 {
    @Override // p185s8.u0
    public void E(H h7, H h10, Window window, View view, boolean z10, boolean z11) {
        F9.n d1;
        j.e(h7, "statusBarStyle");
        j.e(h10, "navigationBarStyle");
        j.e(window, "window");
        j.e(view, "view");
        c.d0(window, false);
        window.setStatusBarColor(z10 ? h7.f13364b : h7.f13363a);
        window.setNavigationBarColor(z11 ? h10.f13364b : h10.f13363a);
        O8.c cVar = new O8.c(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            d1 = new F0(window, cVar);
        } else if (i10 >= 30) {
            d1 = new E0(window, cVar);
        } else {
            d1 = i10 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
        }
        d1.R(!z10);
        d1.Q(!z11);
    }
}
