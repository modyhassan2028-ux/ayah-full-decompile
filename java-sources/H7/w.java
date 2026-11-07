package H7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.ayah.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p140o.w {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f3560B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f3561C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Drawable f3562D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public RippleDrawable f3563E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3564F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3565G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f3566H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f3567I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f3568J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f3569K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f3570L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f3571M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f3572N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f3574P;
    public int Q;
    public int R;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NavigationMenuView f3575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f3576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p140o.k f3577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f3579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayoutInflater f3580w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f3582y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3581x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3583z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3559A = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f3573O = true;
    public int S = -1;
    public final ViewOnClickListenerC0238l T = new ViewOnClickListenerC0238l(0, this);

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
        p140o.m mVar;
        View actionView;
        y yVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f3575r.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                o oVar = this.f3579v;
                ArrayList arrayList = oVar.f3550u;
                int i10 = bundle2.getInt("android:menu:checked", 0);
                if (i10 != 0) {
                    oVar.f3552w = true;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        q qVar = (q) arrayList.get(i11);
                        if (qVar instanceof s) {
                            p140o.m mVar2 = ((s) qVar).f3556a;
                            if (mVar2.f20162a == i10) {
                                oVar.k(mVar2);
                                break;
                            }
                        }
                    }
                    oVar.f3552w = false;
                    oVar.j();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        q qVar2 = (q) arrayList.get(i12);
                        if ((qVar2 instanceof s) && (actionView = (mVar = ((s) qVar2).f3556a).getActionView()) != null && (yVar = (y) sparseParcelableArray2.get(mVar.f20162a)) != null) {
                            actionView.restoreHierarchyState(yVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f3576s.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        o oVar = this.f3579v;
        if (oVar != null) {
            oVar.j();
            oVar.d();
        }
    }

    @Override // p140o.w
    public final boolean f(p140o.m mVar) {
        return false;
    }

    @Override // p140o.w
    public final int getId() {
        return this.f3578u;
    }

    @Override // p140o.w
    public final void i(Context context, p140o.k kVar) {
        this.f3580w = LayoutInflater.from(context);
        this.f3577t = kVar;
        this.R = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // p140o.w
    public final boolean j() {
        return false;
    }

    @Override // p140o.w
    public final Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.f3575r != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3575r.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        o oVar = this.f3579v;
        if (oVar != null) {
            ArrayList arrayList = oVar.f3550u;
            Bundle bundle2 = new Bundle();
            p140o.m mVar = oVar.f3551v;
            if (mVar != null) {
                bundle2.putInt("android:menu:checked", mVar.f20162a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) arrayList.get(i10);
                if (qVar instanceof s) {
                    p140o.m mVar2 = ((s) qVar).f3556a;
                    View actionView = mVar2 != null ? mVar2.getActionView() : null;
                    if (actionView != null) {
                        y yVar = new y();
                        actionView.saveHierarchyState(yVar);
                        sparseArray2.put(mVar2.f20162a, yVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f3576s != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f3576s.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // p140o.w
    public final boolean l(p140o.C c10) {
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
