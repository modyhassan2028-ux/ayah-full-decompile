package X;

import Z.C0672b;
import Z.C0681f0;
import Z.L0;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E implements AccessibilityManager.AccessibilityStateChangeListener, L0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0681f0 f9687r = C0672b.r(Boolean.FALSE);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D f9688s = new D();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f9689t;

    public E() {
        this.f9689t = Build.VERSION.SDK_INT >= 33 ? new C(this) : null;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && H9.o.V0(settingsActivityName, "SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // Z.L0
    public final Object getValue() {
        boolean z10 = false;
        if (((Boolean) this.f9687r.getValue()).booleanValue()) {
            D d5 = this.f9688s;
            if (d5 != null ? ((Boolean) d5.f9686a.getValue()).booleanValue() : false) {
                z10 = true;
            } else {
                C c10 = this.f9689t;
                if (c10 != null ? ((Boolean) c10.f9685a.getValue()).booleanValue() : false) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f9687r.setValue(Boolean.valueOf(z10));
    }
}
