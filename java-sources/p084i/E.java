package p084i;

import E2.RunnableC0147v;
import G1.f;
import I1.S;
import X4.c;
import Y2.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.p;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p050e8.b;
import p140o.m;
import p151p.C1250k;
import p151p.d1;
import p151p.i1;

/* JADX INFO: loaded from: classes.dex */
public final class E extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f16506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Window.Callback f16507f;
    public final D g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16509i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16510k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RunnableC0147v f16511l = new RunnableC0147v(15, this);

    public E(Toolbar toolbar, CharSequence charSequence, s sVar) {
        D d5 = new D(this);
        toolbar.getClass();
        i1 i1Var = new i1(toolbar, false);
        this.f16506e = i1Var;
        sVar.getClass();
        this.f16507f = sVar;
        i1Var.f20682k = sVar;
        toolbar.setOnMenuItemClickListener(d5);
        if (!i1Var.g) {
            i1Var.f20680h = charSequence;
            if ((i1Var.f20675b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (i1Var.g) {
                    S.p(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.g = new D(this);
    }

    @Override // p050e8.b
    public final Context B() {
        return this.f16506e.f20674a.getContext();
    }

    @Override // p050e8.b
    public final boolean D() {
        i1 i1Var = this.f16506e;
        Toolbar toolbar = i1Var.f20674a;
        RunnableC0147v runnableC0147v = this.f16511l;
        toolbar.removeCallbacks(runnableC0147v);
        Toolbar toolbar2 = i1Var.f20674a;
        WeakHashMap weakHashMap = S.f3689a;
        toolbar2.postOnAnimation(runnableC0147v);
        return true;
    }

    @Override // p050e8.b
    public final void M() {
        this.f16506e.f20674a.removeCallbacks(this.f16511l);
    }

    @Override // p050e8.b
    public final boolean N(int i10, KeyEvent keyEvent) {
        Menu menuF0 = f0();
        if (menuF0 == null) {
            return false;
        }
        menuF0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuF0.performShortcut(i10, keyEvent, 0);
    }

    @Override // p050e8.b
    public final boolean O(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            P();
        }
        return true;
    }

    @Override // p050e8.b
    public final boolean P() {
        return this.f16506e.f20674a.v();
    }

    @Override // p050e8.b
    public final void V(boolean z10) {
        i1 i1Var = this.f16506e;
        i1Var.a((i1Var.f20675b & (-5)) | 4);
    }

    @Override // p050e8.b
    public final void W() {
        i1 i1Var = this.f16506e;
        i1Var.a(i1Var.f20675b & (-9));
    }

    @Override // p050e8.b
    public final void X() {
        i1 i1Var = this.f16506e;
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
    public final void b0(CharSequence charSequence) {
        i1 i1Var = this.f16506e;
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

    public final Menu f0() {
        boolean z10 = this.f16509i;
        i1 i1Var = this.f16506e;
        if (!z10) {
            i1Var.f20674a.setMenuCallbacks(new f(this), new c(this));
            this.f16509i = true;
        }
        return i1Var.f20674a.getMenu();
    }

    @Override // p050e8.b
    public final boolean m() {
        C1250k c1250k;
        ActionMenuView actionMenuView = this.f16506e.f20674a.f11705r;
        return (actionMenuView == null || (c1250k = actionMenuView.f11479K) == null || !c1250k.d()) ? false : true;
    }

    @Override // p050e8.b
    public final boolean n() {
        m mVar;
        d1 d1Var = this.f16506e.f20674a.f11697g0;
        if (d1Var == null || (mVar = d1Var.f20653s) == null) {
            return false;
        }
        if (d1Var == null) {
            mVar = null;
        }
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // p050e8.b
    public final void r(boolean z10) {
        if (z10 == this.j) {
            return;
        }
        this.j = z10;
        ArrayList arrayList = this.f16510k;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
    }

    @Override // p050e8.b
    public final int w() {
        return this.f16506e.f20675b;
    }

    @Override // p050e8.b
    public final void L() {
    }

    @Override // p050e8.b
    public final void U(boolean z10) {
    }

    @Override // p050e8.b
    public final void a0(boolean z10) {
    }
}
