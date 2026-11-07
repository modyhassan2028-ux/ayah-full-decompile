package p104k1;

import android.graphics.Rect;
import androidx.compose.ui.window.PopupLayout;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {
    @Override // p104k1.r
    public final void a(PopupLayout popupLayout, int i10, int i11) {
        popupLayout.setSystemGestureExclusionRects(AbstractC0813f2.M(new Rect(0, 0, i10, i11)));
    }
}
