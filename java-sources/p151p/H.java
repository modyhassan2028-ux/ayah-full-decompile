package p151p;

import K7.l;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class H implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f20547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f20548s;

    public H(I i10, l lVar) {
        this.f20548s = i10;
        this.f20547r = lVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20548s.f20560Y.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20547r);
        }
    }
}
