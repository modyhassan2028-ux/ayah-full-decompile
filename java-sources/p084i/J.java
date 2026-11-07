package p084i;

import E6.k;
import I1.G;
import I1.I;
import I1.S;
import I1.Y;
import I1.Z;
import X4.c;
import Y2.a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.p;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p050e8.b;
import p130n.i;
import p130n.j;
import p140o.m;
import p151p.InterfaceC1234c;
import p151p.InterfaceC1241f0;
import p151p.d1;
import p151p.i1;

/* JADX INFO: loaded from: classes.dex */
public final class J extends b implements InterfaceC1234c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AccelerateInterpolator f16526C = new AccelerateInterpolator();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final DecelerateInterpolator f16527D = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final H f16528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f16529B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f16530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f16531f;
    public ActionBarOverlayLayout g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionBarContainer f16532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1241f0 f16533i;
    public ActionBarContextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f16534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public I f16536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I f16537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L5.c f16538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f16540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16544u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f16546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16548y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final H f16549z;

    public J(Activity activity, boolean z10) {
        new ArrayList();
        this.f16540q = new ArrayList();
        this.f16541r = 0;
        this.f16542s = true;
        this.f16545v = true;
        this.f16549z = new H(this, 0);
        this.f16528A = new H(this, 1);
        this.f16529B = new c(this);
        View decorView = activity.getWindow().getDecorView();
        g0(decorView);
        if (z10) {
            return;
        }
        this.f16534k = decorView.findViewById(R.id.content);
    }

    @Override // p050e8.b
    public final Context B() {
        if (this.f16531f == null) {
            TypedValue typedValue = new TypedValue();
            this.f16530e.getTheme().resolveAttribute(com.ayah.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f16531f = new ContextThemeWrapper(this.f16530e, i10);
            } else {
                this.f16531f = this.f16530e;
            }
        }
        return this.f16531f;
    }

    @Override // p050e8.b
    public final void L() {
        h0(k.b(this.f16530e).f1940a.getResources().getBoolean(com.ayah.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p050e8.b
    public final boolean N(int i10, KeyEvent keyEvent) {
        p140o.k kVar;
        I i11 = this.f16536m;
        if (i11 == null || (kVar = i11.f16522u) == null) {
            return false;
        }
        kVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return kVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // p050e8.b
    public final void U(boolean z10) {
        if (this.f16535l) {
            return;
        }
        V(z10);
    }

    @Override // p050e8.b
    public final void V(boolean z10) {
        int i10 = z10 ? 4 : 0;
        i1 i1Var = (i1) this.f16533i;
        int i11 = i1Var.f20675b;
        this.f16535l = true;
        i1Var.a((i10 & 4) | (i11 & (-5)));
    }

    @Override // p050e8.b
    public final void W() {
        i1 i1Var = (i1) this.f16533i;
        i1Var.a(i1Var.f20675b & (-9));
    }

    @Override // p050e8.b
    public final void X() {
        i1 i1Var = (i1) this.f16533i;
        Toolbar toolbar = i1Var.f20674a;
        Drawable drawableE = a.E(toolbar.getContext(), 2131230940);
        i1Var.f20679f = drawableE;
        if ((i1Var.f20675b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableE == null) {
            drawableE = i1Var.f20686o;
        }
        toolbar.setNavigationIcon(drawableE);
    }

    @Override // p050e8.b
    public final void a0(boolean z10) {
        j jVar;
        this.f16547x = z10;
        if (z10 || (jVar = this.f16546w) == null) {
            return;
        }
        jVar.a();
    }

    @Override // p050e8.b
    public final void b0(CharSequence charSequence) {
        i1 i1Var = (i1) this.f16533i;
        if (i1Var.g) {
            return;
        }
        Toolbar toolbar = i1Var.f20674a;
        i1Var.f20680h = charSequence;
        if ((i1Var.f20675b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i1Var.g) {
                S.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p050e8.b
    public final p130n.a c0(L5.c cVar) {
        I i10 = this.f16536m;
        if (i10 != null) {
            i10.a();
        }
        this.g.setHideOnContentScrollEnabled(false);
        this.j.e();
        I i11 = new I(this, this.j.getContext(), cVar);
        p140o.k kVar = i11.f16522u;
        kVar.y();
        try {
            boolean zE = ((Aa.a) i11.f16523v.f5532s).E(i11, kVar);
            kVar.x();
            if (!zE) {
                return null;
            }
            this.f16536m = i11;
            i11.g();
            this.j.c(i11);
            f0(true);
            return i11;
        } catch (Throwable th) {
            kVar.x();
            throw th;
        }
    }

    public final void f0(boolean z10) {
        Z zI;
        Z zI2;
        if (z10) {
            if (!this.f16544u) {
                this.f16544u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                i0(false);
            }
        } else if (this.f16544u) {
            this.f16544u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            i0(false);
        }
        if (!this.f16532h.isLaidOut()) {
            if (z10) {
                ((i1) this.f16533i).f20674a.setVisibility(4);
                this.j.setVisibility(0);
                return;
            } else {
                ((i1) this.f16533i).f20674a.setVisibility(0);
                this.j.setVisibility(8);
                return;
            }
        }
        if (z10) {
            i1 i1Var = (i1) this.f16533i;
            zI = S.a(i1Var.f20674a);
            zI.a(0.0f);
            zI.c(100L);
            zI.d(new i(i1Var, 4));
            zI2 = this.j.i(200L, 0);
        } else {
            i1 i1Var2 = (i1) this.f16533i;
            Z zA = S.a(i1Var2.f20674a);
            zA.a(1.0f);
            zA.c(200L);
            zA.d(new i(i1Var2, 0));
            zI = this.j.i(100L, 8);
            zI2 = zA;
        }
        j jVar = new j();
        ArrayList arrayList = jVar.f19782a;
        arrayList.add(zI);
        View view = (View) zI.f3707a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) zI2.f3707a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zI2);
        jVar.b();
    }

    public final void g0(View view) {
        InterfaceC1241f0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.ayah.R.id.decor_content_parent);
        this.g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.ayah.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1241f0) {
            wrapper = (InterfaceC1241f0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f16533i = wrapper;
        this.j = (ActionBarContextView) view.findViewById(com.ayah.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.ayah.R.id.action_bar_container);
        this.f16532h = actionBarContainer;
        InterfaceC1241f0 interfaceC1241f0 = this.f16533i;
        if (interfaceC1241f0 == null || this.j == null || actionBarContainer == null) {
            throw new IllegalStateException(J.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((i1) interfaceC1241f0).f20674a.getContext();
        this.f16530e = context;
        if ((((i1) this.f16533i).f20675b & 4) != 0) {
            this.f16535l = true;
        }
        Context context2 = k.b(context).f1940a;
        int i10 = context2.getApplicationInfo().targetSdkVersion;
        this.f16533i.getClass();
        h0(context2.getResources().getBoolean(com.ayah.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f16530e.obtainStyledAttributes(null, p073h.a.f16380a, com.ayah.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.g;
            if (!actionBarOverlayLayout2.f11472x) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f16548y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f16532h;
            WeakHashMap weakHashMap = S.f3689a;
            I.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void h0(boolean z10) {
        if (z10) {
            this.f16532h.setTabContainer(null);
            ((i1) this.f16533i).getClass();
        } else {
            ((i1) this.f16533i).getClass();
            this.f16532h.setTabContainer(null);
        }
        this.f16533i.getClass();
        ((i1) this.f16533i).f20674a.setCollapsible(false);
        this.g.setHasNonEmbeddedTabs(false);
    }

    public final void i0(boolean z10) {
        boolean z11 = this.f16543t;
        boolean z12 = this.f16544u;
        c cVar = this.f16529B;
        View view = this.f16534k;
        if (!z12 && z11) {
            if (this.f16545v) {
                this.f16545v = false;
                j jVar = this.f16546w;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f16541r;
                H h7 = this.f16549z;
                if (i10 != 0 || (!this.f16547x && !z10)) {
                    h7.a();
                    return;
                }
                this.f16532h.setAlpha(1.0f);
                this.f16532h.setTransitioning(true);
                j jVar2 = new j();
                float f3 = -this.f16532h.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f16532h.getLocationInWindow(iArr);
                    f3 -= iArr[1];
                }
                Z zA = S.a(this.f16532h);
                zA.e(f3);
                View view2 = (View) zA.f3707a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new Y(cVar, view2) : null);
                }
                boolean z13 = jVar2.f19786e;
                ArrayList arrayList = jVar2.f19782a;
                if (!z13) {
                    arrayList.add(zA);
                }
                if (this.f16542s && view != null) {
                    Z zA2 = S.a(view);
                    zA2.e(f3);
                    if (!jVar2.f19786e) {
                        arrayList.add(zA2);
                    }
                }
                boolean z14 = jVar2.f19786e;
                if (!z14) {
                    jVar2.f19784c = f16526C;
                }
                if (!z14) {
                    jVar2.f19783b = 250L;
                }
                if (!z14) {
                    jVar2.f19785d = h7;
                }
                this.f16546w = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f16545v) {
            return;
        }
        this.f16545v = true;
        j jVar3 = this.f16546w;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f16532h.setVisibility(0);
        int i11 = this.f16541r;
        H h10 = this.f16528A;
        if (i11 == 0 && (this.f16547x || z10)) {
            this.f16532h.setTranslationY(0.0f);
            float f7 = -this.f16532h.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f16532h.getLocationInWindow(iArr2);
                f7 -= iArr2[1];
            }
            this.f16532h.setTranslationY(f7);
            j jVar4 = new j();
            Z zA3 = S.a(this.f16532h);
            zA3.e(0.0f);
            View view3 = (View) zA3.f3707a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new Y(cVar, view3) : null);
            }
            boolean z15 = jVar4.f19786e;
            ArrayList arrayList2 = jVar4.f19782a;
            if (!z15) {
                arrayList2.add(zA3);
            }
            if (this.f16542s && view != null) {
                view.setTranslationY(f7);
                Z zA4 = S.a(view);
                zA4.e(0.0f);
                if (!jVar4.f19786e) {
                    arrayList2.add(zA4);
                }
            }
            boolean z16 = jVar4.f19786e;
            if (!z16) {
                jVar4.f19784c = f16527D;
            }
            if (!z16) {
                jVar4.f19783b = 250L;
            }
            if (!z16) {
                jVar4.f19785d = h10;
            }
            this.f16546w = jVar4;
            jVar4.b();
        } else {
            this.f16532h.setAlpha(1.0f);
            this.f16532h.setTranslationY(0.0f);
            if (this.f16542s && view != null) {
                view.setTranslationY(0.0f);
            }
            h10.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f3689a;
            G.c(actionBarOverlayLayout);
        }
    }

    @Override // p050e8.b
    public final boolean n() {
        d1 d1Var;
        InterfaceC1241f0 interfaceC1241f0 = this.f16533i;
        if (interfaceC1241f0 == null || (d1Var = ((i1) interfaceC1241f0).f20674a.f11697g0) == null || d1Var.f20653s == null) {
            return false;
        }
        d1 d1Var2 = ((i1) interfaceC1241f0).f20674a.f11697g0;
        m mVar = d1Var2 == null ? null : d1Var2.f20653s;
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // p050e8.b
    public final void r(boolean z10) {
        if (z10 == this.f16539p) {
            return;
        }
        this.f16539p = z10;
        ArrayList arrayList = this.f16540q;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
    }

    @Override // p050e8.b
    public final int w() {
        return ((i1) this.f16533i).f20675b;
    }

    public J(Dialog dialog) {
        new ArrayList();
        this.f16540q = new ArrayList();
        this.f16541r = 0;
        this.f16542s = true;
        this.f16545v = true;
        this.f16549z = new H(this, 0);
        this.f16528A = new H(this, 1);
        this.f16529B = new c(this);
        g0(dialog.getWindow().getDecorView());
    }
}
