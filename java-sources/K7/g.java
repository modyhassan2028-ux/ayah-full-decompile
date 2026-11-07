package K7;

import H7.y;
import W2.C0620a;
import W2.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import p140o.C;
import p140o.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NavigationBarMenuView f5291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5293t;

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
        if (parcelable instanceof f) {
            NavigationBarMenuView navigationBarMenuView = this.f5291r;
            f fVar = (f) parcelable;
            int i10 = fVar.f5289r;
            int size = navigationBarMenuView.f15059V.f20139f.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = navigationBarMenuView.f15059V.getItem(i11);
                if (i10 == item.getItemId()) {
                    navigationBarMenuView.f15066x = i10;
                    navigationBarMenuView.f15067y = i11;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f5291r.getContext();
            y yVar = fVar.f5290s;
            SparseArray sparseArray = new SparseArray(yVar.size());
            for (int i12 = 0; i12 < yVar.size(); i12++) {
                int iKeyAt = yVar.keyAt(i12);
                p159p7.b bVar = (p159p7.b) yVar.valueAt(i12);
                sparseArray.put(iKeyAt, bVar != null ? new p159p7.a(context, bVar) : null);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f5291r;
            SparseArray sparseArray2 = navigationBarMenuView2.f15052J;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int iKeyAt2 = sparseArray.keyAt(i13);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (p159p7.a) sparseArray.get(iKeyAt2));
                }
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f15065w;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    p159p7.a aVar = (p159p7.a) sparseArray2.get(navigationBarItemView.getId());
                    if (aVar != null) {
                        navigationBarItemView.setBadge(aVar);
                    }
                }
            }
        }
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        C0620a c0620a;
        if (this.f5292s) {
            return;
        }
        if (z10) {
            this.f5291r.a();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f5291r;
        p140o.k kVar = navigationBarMenuView.f15059V;
        if (kVar == null || navigationBarMenuView.f15065w == null) {
            return;
        }
        int size = kVar.f20139f.size();
        if (size != navigationBarMenuView.f15065w.length) {
            navigationBarMenuView.a();
            return;
        }
        int i10 = navigationBarMenuView.f15066x;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = navigationBarMenuView.f15059V.getItem(i11);
            if (item.isChecked()) {
                navigationBarMenuView.f15066x = item.getItemId();
                navigationBarMenuView.f15067y = i11;
            }
        }
        if (i10 != navigationBarMenuView.f15066x && (c0620a = navigationBarMenuView.f15060r) != null) {
            t.a(navigationBarMenuView, c0620a);
        }
        boolean zF = NavigationBarMenuView.f(navigationBarMenuView.f15064v, navigationBarMenuView.f15059V.l().size());
        for (int i12 = 0; i12 < size; i12++) {
            navigationBarMenuView.U.f5292s = true;
            navigationBarMenuView.f15065w[i12].setLabelVisibilityMode(navigationBarMenuView.f15064v);
            navigationBarMenuView.f15065w[i12].setShifting(zF);
            navigationBarMenuView.f15065w[i12].a((p140o.m) navigationBarMenuView.f15059V.getItem(i12));
            navigationBarMenuView.U.f5292s = false;
        }
    }

    @Override // p140o.w
    public final boolean f(p140o.m mVar) {
        return false;
    }

    @Override // p140o.w
    public final int getId() {
        return this.f5293t;
    }

    @Override // p140o.w
    public final void i(Context context, p140o.k kVar) {
        this.f5291r.f15059V = kVar;
    }

    @Override // p140o.w
    public final boolean j() {
        return false;
    }

    @Override // p140o.w
    public final Parcelable k() {
        f fVar = new f();
        fVar.f5289r = this.f5291r.getSelectedItemId();
        SparseArray<p159p7.a> badgeDrawables = this.f5291r.getBadgeDrawables();
        y yVar = new y();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int iKeyAt = badgeDrawables.keyAt(i10);
            p159p7.a aVarValueAt = badgeDrawables.valueAt(i10);
            yVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f21010v.f21040a : null);
        }
        fVar.f5290s = yVar;
        return fVar;
    }

    @Override // p140o.w
    public final boolean l(C c10) {
        return false;
    }

    @Override // p140o.w
    public final boolean m(p140o.m mVar) {
        return false;
    }

    @Override // p140o.w
    public final void b(p140o.k kVar, boolean z10) {
    }
}
