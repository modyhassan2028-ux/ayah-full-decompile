package p172r1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterButton f21402b;

    public /* synthetic */ a(ImageFilterButton imageFilterButton, int i10) {
        this.f21401a = i10;
        this.f21402b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f21401a) {
            case 0:
                ImageFilterButton imageFilterButton = this.f21402b;
                int width = imageFilterButton.getWidth();
                int height = imageFilterButton.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f12225w) / 2.0f);
                break;
            default:
                ImageFilterButton imageFilterButton2 = this.f21402b;
                outline.setRoundRect(0, 0, imageFilterButton2.getWidth(), imageFilterButton2.getHeight(), imageFilterButton2.f12226x);
                break;
        }
    }
}
