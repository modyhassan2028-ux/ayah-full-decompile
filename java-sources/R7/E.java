package R7;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class E extends A {
    public E(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new D(this));
    }

    @Override // R7.A
    public final void a(FrameLayout frameLayout) {
        frameLayout.setClipToOutline(!this.f7278a);
        if (this.f7278a) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // R7.A
    public final boolean b() {
        return this.f7278a;
    }
}
