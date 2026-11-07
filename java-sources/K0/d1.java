package K0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.ViewLayer;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5071a;

    public /* synthetic */ d1(int i10) {
        this.f5071a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f5071a) {
            case 0:
                p251z9.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline outlineB = ((ViewLayer) view).f12088v.b();
                p251z9.j.b(outlineB);
                outline.set(outlineB);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof androidx.compose.ui.graphics.layer.ViewLayer) && (outline2 = ((androidx.compose.ui.graphics.layer.ViewLayer) view).f11960v) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
        }
    }
}
