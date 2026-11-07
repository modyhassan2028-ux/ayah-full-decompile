package R7;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class D extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f7286a;

    public D(E e10) {
        this.f7286a = e10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        E e10 = this.f7286a;
        if (e10.f7282e.isEmpty()) {
            return;
        }
        outline.setPath(e10.f7282e);
    }
}
