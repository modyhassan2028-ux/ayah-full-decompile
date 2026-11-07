package p151p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1232b implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f20638s;

    public /* synthetic */ RunnableC1232b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f20637r = i10;
        this.f20638s = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20637r) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20638s;
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.f11463N = actionBarOverlayLayout.f11469u.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f11464O);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20638s;
                actionBarOverlayLayout2.d();
                actionBarOverlayLayout2.f11463N = actionBarOverlayLayout2.f11469u.animate().translationY(-actionBarOverlayLayout2.f11469u.getHeight()).setListener(actionBarOverlayLayout2.f11464O);
                break;
        }
    }
}
