package p130n;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static void a(Window.Callback callback, boolean z10) {
        callback.onPointerCaptureChanged(z10);
    }
}
