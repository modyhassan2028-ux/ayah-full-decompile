package p151p;

import android.widget.AbsListView;

/* JADX INFO: renamed from: p.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1278y0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f20804a;

    public C1278y0(A0 a9) {
        this.f20804a = a9;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        A0 a9 = this.f20804a;
        RunnableC1276x0 runnableC1276x0 = a9.f20516I;
        C1279z c1279z = a9.Q;
        if (i10 != 1 || c1279z.getInputMethodMode() == 2 || c1279z.getContentView() == null) {
            return;
        }
        a9.f20520M.removeCallbacks(runnableC1276x0);
        runnableC1276x0.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
