package I1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F9.n f3681a;

    public G0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3681a = new F0(windowInsetsController, new O8.c(windowInsetsController));
        } else {
            this.f3681a = new E0(windowInsetsController, new O8.c(windowInsetsController));
        }
    }

    public G0(Window window, View view) {
        O8.c cVar = new O8.c(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f3681a = new F0(window, cVar);
            return;
        }
        if (i10 >= 30) {
            this.f3681a = new E0(window, cVar);
        } else if (i10 >= 26) {
            this.f3681a = new D0(window, cVar);
        } else {
            this.f3681a = new C0(window, cVar);
        }
    }
}
