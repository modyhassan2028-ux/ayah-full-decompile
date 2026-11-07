package p172r1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterView f21404b;

    public /* synthetic */ b(ImageFilterView imageFilterView, int i10) {
        this.f21403a = i10;
        this.f21404b = imageFilterView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f21403a) {
            case 0:
                ImageFilterView imageFilterView = this.f21404b;
                int width = imageFilterView.getWidth();
                int height = imageFilterView.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f12236x) / 2.0f);
                break;
            default:
                ImageFilterView imageFilterView2 = this.f21404b;
                outline.setRoundRect(0, 0, imageFilterView2.getWidth(), imageFilterView2.getHeight(), imageFilterView2.f12237y);
                break;
        }
    }
}
