package p239y6;

import B3.f;
import F2.t;
import F2.x;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f24649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f24650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f24651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24652d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24653e;

    public a(f fVar, t tVar, t tVar2) {
        this.f24649a = fVar;
        this.f24650b = tVar;
        this.f24651c = tVar2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) throws Exception {
        j.e(menuItem, "item");
        int i10 = 0;
        this.f24653e = false;
        ArrayList arrayList = this.f24652d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MenuItem) obj).setVisible(true);
        }
        this.f24651c.invoke();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) throws Exception {
        j.e(menuItem, "item");
        ArrayList arrayList = this.f24652d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MenuItem) obj).setVisible(false);
        }
        this.f24650b.invoke();
        View actionView = menuItem.getActionView();
        if (actionView == null) {
            return true;
        }
        actionView.post(new x(17, this, menuItem));
        return true;
    }
}
