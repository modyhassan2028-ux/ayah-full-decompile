package J1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.c f4222a;

    public h(O8.c cVar) {
        this.f4222a = cVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        g gVarK = this.f4222a.k(i10);
        if (gVarK == null) {
            return null;
        }
        return gVarK.f4219a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f4222a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        g gVarO = this.f4222a.o(i10);
        if (gVarO == null) {
            return null;
        }
        return gVarO.f4219a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f4222a.C(i10, i11, bundle);
    }
}
