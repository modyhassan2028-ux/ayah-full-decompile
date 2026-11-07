package I1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static B0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        B0 b0H = B0.h(null, rootWindowInsets);
        y0 y0Var = b0H.f3671a;
        y0Var.t(b0H);
        y0Var.d(view.getRootView());
        return b0H;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
