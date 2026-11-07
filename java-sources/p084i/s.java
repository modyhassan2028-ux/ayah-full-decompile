package p084i;

import Aa.a;
import I1.G;
import I1.S;
import I1.Z;
import L5.c;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.ayah.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p050e8.b;
import p130n.d;
import p130n.l;
import p130n.m;
import p140o.k;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Window.Callback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Window.Callback f16623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D f16624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f16628w;

    public s(x xVar, Window.Callback callback) {
        this.f16628w = xVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f16623r = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f16625t = true;
            callback.onContentChanged();
        } finally {
            this.f16625t = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f16623r.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f16623r.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        l.a(this.f16623r, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f16623r.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f16626u;
        Window.Callback callback = this.f16623r;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f16628w.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f16623r.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            x xVar = this.f16628w;
            xVar.C();
            b bVar = xVar.f16656F;
            if (bVar == null || !bVar.N(keyCode, keyEvent)) {
                w wVar = xVar.f16675d0;
                if (wVar == null || !xVar.H(wVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (xVar.f16675d0 == null) {
                        w wVarB = xVar.B(0);
                        xVar.I(wVarB, keyEvent);
                        boolean zH = xVar.H(wVarB, keyEvent.getKeyCode(), keyEvent);
                        wVarB.f16642k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                w wVar2 = xVar.f16675d0;
                if (wVar2 != null) {
                    wVar2.f16643l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f16623r.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f16623r.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f16623r.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f16623r.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f16623r.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f16623r.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f16625t) {
            this.f16623r.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof k)) {
            return this.f16623r.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        D d5 = this.f16624s;
        if (d5 != null) {
            View view = i10 == 0 ? new View(d5.f16505r.f16506e.f20674a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f16623r.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f16623r.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f16623r.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        b(i10, menu);
        x xVar = this.f16628w;
        if (i10 == 108) {
            xVar.C();
            b bVar = xVar.f16656F;
            if (bVar != null) {
                bVar.r(true);
            }
        } else {
            xVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f16627v) {
            this.f16623r.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        x xVar = this.f16628w;
        if (i10 == 108) {
            xVar.C();
            b bVar = xVar.f16656F;
            if (bVar != null) {
                bVar.r(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            w wVarB = xVar.B(i10);
            if (wVarB.f16644m) {
                xVar.s(wVarB, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        m.a(this.f16623r, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        k kVar = menu instanceof k ? (k) menu : null;
        if (i10 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f20155x = true;
        }
        D d5 = this.f16624s;
        if (d5 != null && i10 == 0) {
            E e10 = d5.f16505r;
            if (!e10.f16508h) {
                e10.f16506e.f20683l = true;
                e10.f16508h = true;
            }
        }
        boolean zOnPreparePanel = this.f16623r.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.f20155x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        k kVar = this.f16628w.B(0).f16640h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return p130n.k.a(this.f16623r, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f16623r.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f16623r.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        if (i10 != 0) {
            return p130n.k.b(this.f16623r, callback, i10);
        }
        x xVar = this.f16628w;
        Context context = xVar.f16652B;
        a aVar = new a();
        aVar.f555s = context;
        aVar.f554r = callback;
        aVar.f556t = new ArrayList();
        aVar.f557u = new O(0);
        p130n.a aVar2 = xVar.f16662L;
        if (aVar2 != null) {
            aVar2.a();
        }
        c cVar = new c(29, xVar, aVar);
        xVar.C();
        b bVar = xVar.f16656F;
        if (bVar != null) {
            xVar.f16662L = bVar.c0(cVar);
        }
        if (xVar.f16662L == null) {
            Z z10 = xVar.f16666P;
            if (z10 != null) {
                z10.b();
            }
            p130n.a aVar3 = xVar.f16662L;
            if (aVar3 != null) {
                aVar3.a();
            }
            int i11 = 1;
            if (xVar.f16663M == null) {
                if (xVar.f16671Z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        p130n.c cVar2 = new p130n.c(context, 0);
                        cVar2.getTheme().setTo(themeNewTheme);
                        context = cVar2;
                    }
                    xVar.f16663M = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    xVar.f16664N = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    xVar.f16664N.setContentView(xVar.f16663M);
                    xVar.f16664N.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    xVar.f16663M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    xVar.f16664N.setHeight(-2);
                    xVar.f16665O = new l(xVar, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) xVar.R.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        xVar.C();
                        b bVar2 = xVar.f16656F;
                        Context contextB = bVar2 != null ? bVar2.B() : null;
                        if (contextB != null) {
                            context = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        xVar.f16663M = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (xVar.f16663M != null) {
                Z z11 = xVar.f16666P;
                if (z11 != null) {
                    z11.b();
                }
                xVar.f16663M.e();
                Context context2 = xVar.f16663M.getContext();
                ActionBarContextView actionBarContextView = xVar.f16663M;
                d dVar = new d();
                dVar.f19732t = context2;
                dVar.f19733u = actionBarContextView;
                dVar.f19734v = cVar;
                k kVar = new k(actionBarContextView.getContext());
                kVar.f20143l = 1;
                dVar.f19737y = kVar;
                kVar.f20138e = dVar;
                if (aVar.E(dVar, kVar)) {
                    dVar.g();
                    xVar.f16663M.c(dVar);
                    xVar.f16662L = dVar;
                    if (xVar.Q && (viewGroup = xVar.R) != null && viewGroup.isLaidOut()) {
                        xVar.f16663M.setAlpha(0.0f);
                        Z zA = S.a(xVar.f16663M);
                        zA.a(1.0f);
                        xVar.f16666P = zA;
                        zA.d(new o(i11, xVar));
                    } else {
                        xVar.f16663M.setAlpha(1.0f);
                        xVar.f16663M.setVisibility(0);
                        if (xVar.f16663M.getParent() instanceof View) {
                            View view = (View) xVar.f16663M.getParent();
                            WeakHashMap weakHashMap = S.f3689a;
                            G.c(view);
                        }
                    }
                    if (xVar.f16664N != null) {
                        xVar.f16653C.getDecorView().post(xVar.f16665O);
                    }
                } else {
                    xVar.f16662L = null;
                }
            }
            xVar.K();
            xVar.f16662L = xVar.f16662L;
        }
        xVar.K();
        p130n.a aVar4 = xVar.f16662L;
        if (aVar4 != null) {
            return aVar.p(aVar4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f16623r.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
