package p226x2;

import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
