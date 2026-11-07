package p140o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f20189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f20190b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20190b = rVar;
        this.f20189a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f20189a.onMenuItemActionCollapse(this.f20190b.i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f20189a.onMenuItemActionExpand(this.f20190b.i(menuItem));
    }
}
