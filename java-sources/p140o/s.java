package p140o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements A, w, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f20195r;

    public static int o(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override // p140o.w
    public final boolean f(m mVar) {
        return false;
    }

    @Override // p140o.w
    public final int getId() {
        return 0;
    }

    @Override // p140o.w
    public final boolean m(m mVar) {
        return false;
    }

    public abstract void n(k kVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (h) listAdapter).f20127r.q((MenuItem) listAdapter.getItem(i10), this, !(this instanceof e) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z10);

    public abstract void r(int i10);

    public abstract void s(int i10);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z10);

    public abstract void v(int i10);

    @Override // p140o.w
    public final void i(Context context, k kVar) {
    }
}
