package p140o;

import K0.ViewOnAttachStateChangeListenerC0381z;
import K7.l;
import Z0.B;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ayah.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p123m2.c;
import p151p.C0;
import p151p.C1261p0;
import p151p.C1279z;
import p151p.D0;
import p151p.E0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f20099E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f20100F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f20101G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f20102H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f20103I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f20104J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f20105K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f20107M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public v f20108N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ViewTreeObserver f20109O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public PopupWindow.OnDismissListener f20110P;
    public boolean Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f20111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f20114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f20115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f20116x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f20117y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f20118z = new l(1, this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0381z f20095A = new ViewOnAttachStateChangeListenerC0381z(6, this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final B f20096B = new B(23, this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f20097C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f20098D = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f20106L = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.f20111s = context;
        this.f20099E = view;
        this.f20113u = i10;
        this.f20114v = z10;
        this.f20101G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f20112t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20115w = new Handler();
    }

    @Override // p140o.A
    public final boolean a() {
        ArrayList arrayList = this.f20117y;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f20092a.Q.isShowing();
    }

    @Override // p140o.w
    public final void b(k kVar, boolean z10) {
        ArrayList arrayList = this.f20117y;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((d) arrayList.get(i10)).f20093b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f20093b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        k kVar2 = dVar.f20093b;
        E0 e10 = dVar.f20092a;
        C1279z c1279z = e10.Q;
        kVar2.r(this);
        if (this.Q) {
            C0.b(c1279z, null);
            c1279z.setAnimationStyle(0);
        }
        e10.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f20101G = ((d) arrayList.get(size2 - 1)).f20094c;
        } else {
            this.f20101G = this.f20099E.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f20093b.c(false);
                return;
            }
            return;
        }
        dismiss();
        v vVar = this.f20108N;
        if (vVar != null) {
            vVar.b(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f20109O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f20109O.removeGlobalOnLayoutListener(this.f20118z);
            }
            this.f20109O = null;
        }
        this.f20100F.removeOnAttachStateChangeListener(this.f20095A);
        this.f20110P.onDismiss();
    }

    @Override // p140o.A
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f20116x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w((k) obj);
        }
        arrayList.clear();
        View view = this.f20099E;
        this.f20100F = view;
        if (view != null) {
            boolean z10 = this.f20109O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f20109O = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f20118z);
            }
            this.f20100F.addOnAttachStateChangeListener(this.f20095A);
        }
    }

    @Override // p140o.A
    public final void dismiss() {
        ArrayList arrayList = this.f20117y;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f20092a.Q.isShowing()) {
                    dVar.f20092a.dismiss();
                }
            }
        }
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        ArrayList arrayList = this.f20117y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f20092a.f20526t.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // p140o.A
    public final C1261p0 g() {
        ArrayList arrayList = this.f20117y;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) c.q(1, arrayList)).f20092a.f20526t;
    }

    @Override // p140o.w
    public final void h(v vVar) {
        this.f20108N = vVar;
    }

    @Override // p140o.w
    public final boolean j() {
        return false;
    }

    @Override // p140o.w
    public final Parcelable k() {
        return null;
    }

    @Override // p140o.w
    public final boolean l(C c10) {
        ArrayList arrayList = this.f20117y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (c10 == dVar.f20093b) {
                dVar.f20092a.f20526t.requestFocus();
                return true;
            }
        }
        if (!c10.hasVisibleItems()) {
            return false;
        }
        n(c10);
        v vVar = this.f20108N;
        if (vVar != null) {
            vVar.h(c10);
        }
        return true;
    }

    @Override // p140o.s
    public final void n(k kVar) {
        kVar.b(this, this.f20111s);
        if (a()) {
            w(kVar);
        } else {
            this.f20116x.add(kVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f20117y;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f20092a.Q.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f20093b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p140o.s
    public final void p(View view) {
        if (this.f20099E != view) {
            this.f20099E = view;
            this.f20098D = Gravity.getAbsoluteGravity(this.f20097C, view.getLayoutDirection());
        }
    }

    @Override // p140o.s
    public final void q(boolean z10) {
        this.f20106L = z10;
    }

    @Override // p140o.s
    public final void r(int i10) {
        if (this.f20097C != i10) {
            this.f20097C = i10;
            this.f20098D = Gravity.getAbsoluteGravity(i10, this.f20099E.getLayoutDirection());
        }
    }

    @Override // p140o.s
    public final void s(int i10) {
        this.f20102H = true;
        this.f20104J = i10;
    }

    @Override // p140o.s
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f20110P = onDismissListener;
    }

    @Override // p140o.s
    public final void u(boolean z10) {
        this.f20107M = z10;
    }

    @Override // p140o.s
    public final void v(int i10) {
        this.f20103I = true;
        this.f20105K = i10;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(k kVar) {
        boolean z10;
        char c10;
        View childAt;
        d dVar;
        int i10;
        int i11;
        int i12;
        int width;
        MenuItem item;
        h hVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f20111s;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(kVar, layoutInflaterFrom, this.f20114v, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f20106L) {
            hVar2.f20129t = true;
        } else if (a()) {
            int size = kVar.f20139f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = kVar.getItem(i13);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            hVar2.f20129t = z10;
        }
        int iO = s.o(hVar2, context, this.f20112t);
        E0 e10 = new E0(context, null, this.f20113u, 0);
        e10.U = this.f20096B;
        e10.f20514G = this;
        C1279z c1279z = e10.Q;
        c1279z.setOnDismissListener(this);
        e10.f20513F = this.f20099E;
        e10.f20510C = this.f20098D;
        e10.f20523P = true;
        c1279z.setFocusable(true);
        c1279z.setInputMethodMode(2);
        e10.p(hVar2);
        e10.r(iO);
        e10.f20510C = this.f20098D;
        ArrayList arrayList = this.f20117y;
        if (arrayList.size() > 0) {
            dVar = (d) c.q(1, arrayList);
            k kVar2 = dVar.f20093b;
            int size2 = kVar2.f20139f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    item = null;
                    break;
                }
                item = kVar2.getItem(i14);
                if (item.hasSubMenu() && kVar == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                c10 = 0;
                childAt = null;
            } else {
                C1261p0 c1261p0 = dVar.f20092a.f20526t;
                ListAdapter adapter = c1261p0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                int i15 = 0;
                c10 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == hVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                childAt = (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - c1261p0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1261p0.getChildCount()) ? c1261p0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            childAt = null;
            dVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = E0.f20539V;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(c1279z, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                D0.a(c1279z, c10);
            }
            C0.a(c1279z, null);
            C1261p0 c1261p1 = ((d) arrayList.get(arrayList.size() - 1)).f20092a.f20526t;
            int[] iArr = new int[2];
            c1261p1.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f20100F.getWindowVisibleDisplayFrame(rect);
            if (this.f20101G == 1) {
                if (c1261p1.getWidth() + iArr[0] + iO > rect.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z11 = i10 == 1;
            this.f20101G = i10;
            if (Build.VERSION.SDK_INT >= 26) {
                e10.f20513F = childAt;
                i11 = 0;
                i12 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f20099E.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f20098D & 7) == 5) {
                    iArr2[0] = this.f20099E.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i16 = iArr3[0] - iArr2[0];
                i11 = iArr3[1] - iArr2[1];
                i12 = i16;
            }
            if ((this.f20098D & 5) != 5) {
                width = z11 ? i12 + childAt.getWidth() : i12 - iO;
            } else if (z11) {
                width = i12 + iO;
            } else {
                iO = childAt.getWidth();
            }
            e10.f20529w = width;
            e10.f20509B = true;
            e10.f20508A = true;
            e10.j(i11);
        } else {
            if (this.f20102H) {
                e10.f20529w = this.f20104J;
            }
            if (this.f20103I) {
                e10.j(this.f20105K);
            }
            Rect rect2 = this.f20195r;
            e10.f20522O = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(e10, kVar, this.f20101G));
        e10.d();
        C1261p0 c1261p2 = e10.f20526t;
        c1261p2.setOnKeyListener(this);
        if (dVar == null && this.f20107M && kVar.f20144m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1261p2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.f20144m);
            c1261p2.addHeaderView(frameLayout, null, false);
            e10.d();
        }
    }

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
    }
}
