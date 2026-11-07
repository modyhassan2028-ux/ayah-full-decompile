package Z1;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.drawerlayout.widget.DrawerLayout;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static OnBackInvokedDispatcher a(DrawerLayout drawerLayout) {
        return drawerLayout.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new J7.c(4, runnable);
    }

    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
