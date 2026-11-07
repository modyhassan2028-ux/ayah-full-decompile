package I1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: I1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0271y extends p248z6.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f3794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WindowInsetsController f3795v;

    @Override // p248z6.c
    public final void I() {
        View view = this.f3794u;
        WindowInsetsController windowInsetsController = this.f3795v;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.I();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: I1.x
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                atomicBoolean.set((i10 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // p248z6.c
    public final void L() {
        View view = this.f3794u;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f3795v;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.L();
    }
}
