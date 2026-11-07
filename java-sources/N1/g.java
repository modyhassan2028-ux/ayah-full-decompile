package N1;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(NestedScrollView nestedScrollView, float f3) {
        try {
            nestedScrollView.setFrameContentVelocity(f3);
        } catch (LinkageError unused) {
        }
    }
}
