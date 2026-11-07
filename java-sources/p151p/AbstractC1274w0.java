package p151p;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: p.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1274w0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z10) {
        popupWindow.setIsClippedToScreen(z10);
    }
}
