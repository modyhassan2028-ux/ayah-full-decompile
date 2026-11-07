package p140o;

import K0.ViewOnAttachStateChangeListenerC0381z;
import K7.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ayah.R;
import p151p.C1261p0;
import p151p.C1279z;
import p151p.E0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PopupWindow.OnDismissListener f20056B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f20057C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f20058D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public v f20059E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ViewTreeObserver f20060F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20061G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f20062H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f20063I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f20065K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f20066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f20067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f20068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f20069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f20070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f20071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final E0 f20072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f20073z = new l(2, this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0381z f20055A = new ViewOnAttachStateChangeListenerC0381z(7, this);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f20064J = 0;

    public B(Context context, k kVar, View view, int i10, boolean z10) {
        this.f20066s = context;
        this.f20067t = kVar;
        this.f20069v = z10;
        this.f20068u = new h(kVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f20071x = i10;
        Resources resources = context.getResources();
        this.f20070w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20057C = view;
        this.f20072y = new E0(context, null, i10, 0);
        kVar.b(this, context);
    }

    @Override // p140o.A
    public final boolean a() {
        return !this.f20061G && this.f20072y.Q.isShowing();
    }

    @Override // p140o.w
    public final void b(k kVar, boolean z10) {
        if (kVar != this.f20067t) {
            return;
        }
        dismiss();
        v vVar = this.f20059E;
        if (vVar != null) {
            vVar.b(kVar, z10);
        }
    }

    @Override // p140o.A
    public final void d() {
        View view;
        if (a()) {
            return;
        }
        if (this.f20061G || (view = this.f20057C) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f20058D = view;
        E0 e10 = this.f20072y;
        C1279z c1279z = e10.Q;
        C1279z c1279z2 = e10.Q;
        c1279z.setOnDismissListener(this);
        e10.f20514G = this;
        e10.f20523P = true;
        c1279z2.setFocusable(true);
        View view2 = this.f20058D;
        boolean z10 = this.f20060F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f20060F = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f20073z);
        }
        view2.addOnAttachStateChangeListener(this.f20055A);
        e10.f20513F = view2;
        e10.f20510C = this.f20064J;
        boolean z11 = this.f20062H;
        Context context = this.f20066s;
        h hVar = this.f20068u;
        if (!z11) {
            this.f20063I = s.o(hVar, context, this.f20070w);
            this.f20062H = true;
        }
        e10.r(this.f20063I);
        c1279z2.setInputMethodMode(2);
        Rect rect = this.f20195r;
        e10.f20522O = rect != null ? new Rect(rect) : null;
        e10.d();
        C1261p0 c1261p0 = e10.f20526t;
        c1261p0.setOnKeyListener(this);
        if (this.f20065K) {
            k kVar = this.f20067t;
            if (kVar.f20144m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1261p0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.f20144m);
                }
                frameLayout.setEnabled(false);
                c1261p0.addHeaderView(frameLayout, null, false);
            }
        }
        e10.p(hVar);
        e10.d();
    }

    @Override // p140o.A
    public final void dismiss() {
        if (a()) {
            this.f20072y.dismiss();
        }
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        this.f20062H = false;
        h hVar = this.f20068u;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // p140o.A
    public final C1261p0 g() {
        return this.f20072y.f20526t;
    }

    @Override // p140o.w
    public final void h(v vVar) {
        this.f20059E = vVar;
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
        boolean z10;
        if (c10.hasVisibleItems()) {
            u uVar = new u(this.f20066s, c10, this.f20058D, this.f20069v, this.f20071x, 0);
            v vVar = this.f20059E;
            uVar.f20203h = vVar;
            s sVar = uVar.f20204i;
            if (sVar != null) {
                sVar.h(vVar);
            }
            int size = c10.f20139f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = c10.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            uVar.g = z10;
            s sVar2 = uVar.f20204i;
            if (sVar2 != null) {
                sVar2.q(z10);
            }
            uVar.j = this.f20056B;
            this.f20056B = null;
            this.f20067t.c(false);
            E0 e10 = this.f20072y;
            int width = e10.f20529w;
            int iN = e10.n();
            if ((Gravity.getAbsoluteGravity(this.f20064J, this.f20057C.getLayoutDirection()) & 7) == 5) {
                width += this.f20057C.getWidth();
            }
            if (!uVar.b()) {
                if (uVar.f20201e != null) {
                    uVar.d(width, iN, true, true);
                }
            }
            v vVar2 = this.f20059E;
            if (vVar2 != null) {
                vVar2.h(c10);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f20061G = true;
        this.f20067t.c(true);
        ViewTreeObserver viewTreeObserver = this.f20060F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f20060F = this.f20058D.getViewTreeObserver();
            }
            this.f20060F.removeGlobalOnLayoutListener(this.f20073z);
            this.f20060F = null;
        }
        this.f20058D.removeOnAttachStateChangeListener(this.f20055A);
        PopupWindow.OnDismissListener onDismissListener = this.f20056B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f20057C = view;
    }

    @Override // p140o.s
    public final void q(boolean z10) {
        this.f20068u.f20129t = z10;
    }

    @Override // p140o.s
    public final void r(int i10) {
        this.f20064J = i10;
    }

    @Override // p140o.s
    public final void s(int i10) {
        this.f20072y.f20529w = i10;
    }

    @Override // p140o.s
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f20056B = onDismissListener;
    }

    @Override // p140o.s
    public final void u(boolean z10) {
        this.f20065K = z10;
    }

    @Override // p140o.s
    public final void v(int i10) {
        this.f20072y.j(i10);
    }

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
    }

    @Override // p140o.s
    public final void n(k kVar) {
    }
}
