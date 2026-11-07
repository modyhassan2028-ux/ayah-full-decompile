package p151p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends BaseAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f20569r;

    public K0(ScrollingTabContainerView scrollingTabContainerView) {
        this.f20569r = scrollingTabContainerView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f20569r.f11584s.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        ((L0) this.f20569r.f11584s.getChildAt(i10)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i10);
            throw null;
        }
        getItem(i10);
        ScrollingTabContainerView scrollingTabContainerView = this.f20569r;
        new L0(scrollingTabContainerView, scrollingTabContainerView.getContext());
        throw null;
    }
}
