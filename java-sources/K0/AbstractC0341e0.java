package K0;

import android.content.ClipboardManager;
import androidx.compose.ui.platform.ViewLayer;

/* JADX INFO: renamed from: K0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0341e0 {
    public static final void a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static void b(ViewLayer viewLayer, int i10) {
        viewLayer.setOutlineAmbientShadowColor(i10);
    }

    public static void c(ViewLayer viewLayer, int i10) {
        viewLayer.setOutlineSpotShadowColor(i10);
    }
}
