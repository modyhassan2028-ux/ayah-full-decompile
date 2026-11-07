package H7;

import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static Rect a(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }
}
