package p132n1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ View f19918r;

    public p(View view) {
        this.f19918r = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19918r.setNestedScrollingEnabled(true);
    }
}
