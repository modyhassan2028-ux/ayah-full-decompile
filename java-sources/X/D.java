package X;

import Z.C0672b;
import Z.C0681f0;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class D implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f9686a = C0672b.r(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f9686a.setValue(Boolean.valueOf(z10));
    }
}
