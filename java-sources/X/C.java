package X;

import Z.C0672b;
import Z.C0681f0;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: loaded from: classes.dex */
public final class C implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f9685a = C0672b.r(Boolean.FALSE);

    public C(E e10) {
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f9685a.setValue(Boolean.valueOf(E.b(accessibilityManager)));
    }
}
