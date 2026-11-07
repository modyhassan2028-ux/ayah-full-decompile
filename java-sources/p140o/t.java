package p140o;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f20196r;

    public t(u uVar) {
        this.f20196r = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f20196r.c();
    }
}
