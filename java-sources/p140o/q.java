package p140o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f20191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f20192s;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20192s = rVar;
        this.f20191r = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f20191r.onMenuItemClick(this.f20192s.i(menuItem));
    }
}
