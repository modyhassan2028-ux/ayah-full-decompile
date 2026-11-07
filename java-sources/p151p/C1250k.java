package p151p;

import I1.AbstractC0245c;
import Z0.B;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ayah.R;
import java.util.ArrayList;
import p140o.C;
import p140o.k;
import p140o.m;
import p140o.s;
import p140o.v;
import p140o.w;
import p140o.x;
import p140o.y;

/* JADX INFO: renamed from: p.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1250k implements w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1246i f20691A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f20692B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20693C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f20694D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f20695E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f20696F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f20697G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f20698H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f20699I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1240f f20701K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C1240f f20702L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public RunnableC1244h f20703M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1242g f20704N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f20706P;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f20707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f20708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f20709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LayoutInflater f20710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f20711v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y f20714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20715z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f20712w = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f20713x = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseBooleanArray f20700J = new SparseBooleanArray();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final B f20705O = new B(29, this);

    public C1250k(Context context) {
        this.f20707r = context;
        this.f20710u = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            x xVar = view instanceof x ? (x) view : (x) this.f20710u.inflate(this.f20713x, viewGroup, false);
            xVar.a(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) xVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f20714y);
            if (this.f20704N == null) {
                this.f20704N = new C1242g(this);
            }
            actionMenuItemView.setPopupCallback(this.f20704N);
            actionView = (View) xVar;
        }
        actionView.setVisibility(mVar.f20161C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1254m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // p140o.w
    public final void b(k kVar, boolean z10) {
        d();
        C1240f c1240f = this.f20702L;
        if (c1240f != null && c1240f.b()) {
            c1240f.f20204i.dismiss();
        }
        v vVar = this.f20711v;
        if (vVar != null) {
            vVar.b(kVar, z10);
        }
    }

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C1248j) && (i10 = ((C1248j) parcelable).f20687r) > 0 && (menuItemFindItem = this.f20709t.findItem(i10)) != null) {
            l((C) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean d() {
        Object obj;
        RunnableC1244h runnableC1244h = this.f20703M;
        if (runnableC1244h != null && (obj = this.f20714y) != null) {
            ((View) obj).removeCallbacks(runnableC1244h);
            this.f20703M = null;
            return true;
        }
        C1240f c1240f = this.f20701K;
        if (c1240f == null) {
            return false;
        }
        if (c1240f.b()) {
            c1240f.f20204i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p140o.w
    public final void e(boolean z10) {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f20714y;
        ArrayList arrayList = null;
        boolean z11 = false;
        if (viewGroup != null) {
            k kVar = this.f20709t;
            if (kVar != null) {
                kVar.i();
                ArrayList arrayListL = this.f20709t.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    m mVar = (m) arrayListL.get(i11);
                    if ((mVar.f20183x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        m itemData = childAt instanceof x ? ((x) childAt).getItemData() : null;
                        View viewA = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f20714y).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f20691A) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f20714y).requestLayout();
        k kVar2 = this.f20709t;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f20141i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC0245c abstractC0245c = ((m) arrayList2.get(i12)).f20159A;
                if (abstractC0245c != null) {
                    abstractC0245c.f3714a = this;
                }
            }
        }
        k kVar3 = this.f20709t;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.j;
        }
        if (this.f20694D && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !((m) arrayList.get(0)).f20161C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f20691A == null) {
                this.f20691A = new C1246i(this, this.f20707r);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f20691A.getParent();
            if (viewGroup3 != this.f20714y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f20691A);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f20714y;
                C1246i c1246i = this.f20691A;
                actionMenuView.getClass();
                C1254m c1254mJ = ActionMenuView.j();
                c1254mJ.f20734a = true;
                actionMenuView.addView(c1246i, c1254mJ);
            }
        } else {
            C1246i c1246i2 = this.f20691A;
            if (c1246i2 != null) {
                Object parent = c1246i2.getParent();
                Object obj = this.f20714y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f20691A);
                }
            }
        }
        ((ActionMenuView) this.f20714y).setOverflowReserved(this.f20694D);
    }

    @Override // p140o.w
    public final boolean f(m mVar) {
        return false;
    }

    public final boolean g() {
        C1240f c1240f = this.f20701K;
        return c1240f != null && c1240f.b();
    }

    @Override // p140o.w
    public final int getId() {
        return this.f20715z;
    }

    @Override // p140o.w
    public final void h(v vVar) {
        throw null;
    }

    @Override // p140o.w
    public final void i(Context context, k kVar) {
        this.f20708s = context;
        LayoutInflater.from(context);
        this.f20709t = kVar;
        Resources resources = context.getResources();
        E6.k kVarB = E6.k.b(context);
        if (!this.f20695E) {
            this.f20694D = true;
        }
        this.f20696F = kVarB.f1940a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f20698H = kVarB.c();
        int measuredWidth = this.f20696F;
        if (this.f20694D) {
            if (this.f20691A == null) {
                C1246i c1246i = new C1246i(this, this.f20707r);
                this.f20691A = c1246i;
                if (this.f20693C) {
                    c1246i.setImageDrawable(this.f20692B);
                    this.f20692B = null;
                    this.f20693C = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f20691A.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f20691A.getMeasuredWidth();
        } else {
            this.f20691A = null;
        }
        this.f20697G = measuredWidth;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // p140o.w
    public final boolean j() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z10;
        C1250k c1250k = this;
        k kVar = c1250k.f20709t;
        if (kVar != null) {
            arrayListL = kVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = c1250k.f20698H;
        int i12 = c1250k.f20697G;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1250k.f20714y;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            m mVar = (m) arrayListL.get(i13);
            int i16 = mVar.f20184y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (c1250k.f20699I && mVar.f20161C) {
                i11 = 0;
            }
            i13++;
        }
        if (c1250k.f20694D && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = c1250k.f20700J;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            m mVar2 = (m) arrayListL.get(i18);
            int i20 = mVar2.f20184y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = mVar2.f20163b;
            if (z12) {
                View viewA = c1250k.a(mVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                mVar2.g(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewA2 = c1250k.a(mVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            m mVar3 = (m) arrayListL.get(i22);
                            if (mVar3.f20163b == i21) {
                                if ((mVar3.f20183x & 32) == 32) {
                                    i17++;
                                }
                                mVar3.g(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    mVar2.g(z14);
                } else {
                    mVar2.g(false);
                }
                i18++;
                i10 = 2;
                c1250k = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            c1250k = this;
            z10 = true;
        }
        return z10;
    }

    @Override // p140o.w
    public final Parcelable k() {
        C1248j c1248j = new C1248j();
        c1248j.f20687r = this.f20706P;
        return c1248j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p140o.w
    public final boolean l(C c10) {
        boolean z10;
        if (c10.hasVisibleItems()) {
            C c11 = c10;
            while (true) {
                k kVar = c11.f20075z;
                if (kVar == this.f20709t) {
                    break;
                }
                c11 = (C) kVar;
            }
            m mVar = c11.f20074A;
            ViewGroup viewGroup = (ViewGroup) this.f20714y;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof x) && ((x) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f20706P = c10.f20074A.f20162a;
                int size = c10.f20139f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = c10.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                C1240f c1240f = new C1240f(this, this.f20708s, c10, view);
                this.f20702L = c1240f;
                c1240f.g = z10;
                s sVar = c1240f.f20204i;
                if (sVar != null) {
                    sVar.q(z10);
                }
                C1240f c1240f2 = this.f20702L;
                if (!c1240f2.b()) {
                    if (c1240f2.f20201e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1240f2.d(0, 0, false, false);
                }
                v vVar = this.f20711v;
                if (vVar != null) {
                    vVar.h(c10);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p140o.w
    public final boolean m(m mVar) {
        return false;
    }

    public final boolean n() {
        k kVar;
        if (!this.f20694D || g() || (kVar = this.f20709t) == null || this.f20714y == null || this.f20703M != null) {
            return false;
        }
        kVar.i();
        if (kVar.j.isEmpty()) {
            return false;
        }
        RunnableC1244h runnableC1244h = new RunnableC1244h(0, this, new C1240f(this, this.f20708s, this.f20709t, this.f20691A));
        this.f20703M = runnableC1244h;
        ((View) this.f20714y).post(runnableC1244h);
        return true;
    }
}
