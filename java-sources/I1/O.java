package I1;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static G0 c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new G0(windowInsetsController);
        }
        return null;
    }

    public static void d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
