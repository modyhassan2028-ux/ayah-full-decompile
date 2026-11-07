package I1;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;
import android.media.session.MediaSession;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n0 {
    public static /* synthetic */ BlendModeColorFilter a(int i10, BlendMode blendMode) {
        return new BlendModeColorFilter(i10, blendMode);
    }

    public static /* synthetic */ RenderNode b() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ MediaSession c(Context context) {
        return new MediaSession(context, "QuranMediaSession", null);
    }

    public static /* synthetic */ WindowInsets.Builder d() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder e(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ RenderNode g() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }
}
