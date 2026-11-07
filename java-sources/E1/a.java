package E1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.window.PopupLayout;
import java.util.ArrayList;
import p180s0.F;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        j.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, p053f.a.class);
    }

    public static ArrayList c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void f(PopupLayout popupLayout, J7.c cVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!p123m2.c.D(cVar) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, cVar);
    }

    public static final void g(PopupLayout popupLayout, J7.c cVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!p123m2.c.D(cVar) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(cVar);
    }

    public static void h(Object obj, Object obj2) {
        j.e(obj, "dispatcher");
        j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static final void i(CursorAnchorInfo.Builder builder, p171r0.e eVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(F.t(eVar)).setHandwritingBounds(F.t(eVar)).build());
    }

    public static final void j(CursorAnchorInfo.Builder builder, p171r0.e eVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(F.t(eVar)).setHandwritingBounds(F.t(eVar)).build());
    }

    public static void k(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static void l(Object obj, Object obj2) {
        j.e(obj, "dispatcher");
        j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
