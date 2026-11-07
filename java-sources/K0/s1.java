package K0;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static void a(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
