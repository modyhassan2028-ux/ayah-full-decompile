package p084i;

import J7.c;
import W2.n;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, x xVar) {
        Objects.requireNonNull(xVar);
        c cVar = new c(2, xVar);
        n.i(obj).registerOnBackInvokedCallback(1000000, cVar);
        return cVar;
    }

    public static void c(Object obj, Object obj2) {
        n.i(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
