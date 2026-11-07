package J7;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f4374a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new c(0, bVar);
    }

    public void b(b bVar, View view, boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f4374a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackA = a(bVar);
            this.f4374a = onBackInvokedCallbackA;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackA);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4374a);
        this.f4374a = null;
    }
}
