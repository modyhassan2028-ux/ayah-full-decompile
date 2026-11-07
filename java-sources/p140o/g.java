package p140o;

import Da.r;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p084i.C0956d;
import p084i.DialogInterfaceC0959g;

/* JADX INFO: loaded from: classes.dex */
public final class g implements w, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f20121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayoutInflater f20122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f20123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ExpandedMenuView f20124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f20125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f20126w;

    public g(ContextWrapper contextWrapper) {
        this.f20121r = contextWrapper;
        this.f20122s = LayoutInflater.from(contextWrapper);
    }

    @Override // p140o.w
    public final void b(k kVar, boolean z10) {
        v vVar = this.f20125v;
        if (vVar != null) {
            vVar.b(kVar, z10);
        }
    }

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f20124u.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        f fVar = this.f20126w;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
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
    public final void h(v vVar) {
        throw null;
    }

    @Override // p140o.w
    public final void i(Context context, k kVar) {
        if (this.f20121r != null) {
            this.f20121r = context;
            if (this.f20122s == null) {
                this.f20122s = LayoutInflater.from(context);
            }
        }
        this.f20123t = kVar;
        f fVar = this.f20126w;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // p140o.w
    public final boolean j() {
        return false;
    }

    @Override // p140o.w
    public final Parcelable k() {
        if (this.f20124u == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f20124u;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p140o.w
    public final boolean l(C c10) {
        boolean zHasVisibleItems = c10.hasVisibleItems();
        Context context = c10.f20134a;
        if (!zHasVisibleItems) {
            return false;
        }
        l lVar = new l();
        lVar.f20156r = c10;
        r rVar = new r(context);
        C0956d c0956d = (C0956d) rVar.f1388t;
        g gVar = new g(c0956d.f16557a);
        lVar.f20158t = gVar;
        gVar.f20125v = lVar;
        c10.b(gVar, context);
        g gVar2 = lVar.f20158t;
        if (gVar2.f20126w == null) {
            gVar2.f20126w = new f(gVar2);
        }
        c0956d.f16568n = gVar2.f20126w;
        c0956d.f16569o = lVar;
        View view = c10.f20146o;
        if (view != null) {
            c0956d.f16561e = view;
        } else {
            c0956d.f16559c = c10.f20145n;
            c0956d.f16560d = c10.f20144m;
        }
        c0956d.f16566l = lVar;
        DialogInterfaceC0959g dialogInterfaceC0959gE = rVar.e();
        lVar.f20157s = dialogInterfaceC0959gE;
        dialogInterfaceC0959gE.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f20157s.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.f20157s.show();
        v vVar = this.f20125v;
        if (vVar == null) {
            return true;
        }
        vVar.h(c10);
        return true;
    }

    @Override // p140o.w
    public final boolean m(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        this.f20123t.q(this.f20126w.getItem(i10), this, 0);
    }
}
