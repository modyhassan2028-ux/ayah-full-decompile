package B1;

import android.app.Activity;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import p180s0.C1300i;
import p180s0.E;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static Rect b(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        j.d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets d(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void e(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z10);
    }

    public static void f(Window window, boolean z10) {
        window.setDecorFitsSystemWindows(z10);
    }

    public static void g(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void h(Outline outline, E e10) {
        if (!(e10 instanceof C1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1300i) e10).f21829a);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
