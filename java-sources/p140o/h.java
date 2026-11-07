package p140o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f20127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20128s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f20130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f20131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f20132w;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f20130u = z10;
        this.f20131v = layoutInflater;
        this.f20127r = kVar;
        this.f20132w = i10;
        a();
    }

    public final void a() {
        k kVar = this.f20127r;
        m mVar = kVar.f20153v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f20128s = i10;
                    return;
                }
            }
        }
        this.f20128s = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i10) {
        ArrayList arrayListL;
        boolean z10 = this.f20130u;
        k kVar = this.f20127r;
        if (z10) {
            kVar.i();
            arrayListL = kVar.j;
        } else {
            arrayListL = kVar.l();
        }
        int i11 = this.f20128s;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.f20130u;
        k kVar = this.f20127r;
        if (z10) {
            kVar.i();
            arrayListL = kVar.j;
        } else {
            arrayListL = kVar.l();
        }
        return this.f20128s < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f20131v.inflate(this.f20132w, viewGroup, false);
        }
        int i11 = getItem(i10).f20163b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f20163b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f20127r.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        x xVar = (x) view;
        if (this.f20129t) {
            listMenuItemView.setForceShowIcon(true);
        }
        xVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
