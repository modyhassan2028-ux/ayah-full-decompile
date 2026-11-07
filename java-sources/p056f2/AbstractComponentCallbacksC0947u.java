package p056f2;

import B3.f;
import E2.RunnableC0147v;
import K0.RunnableC0354l;
import L5.c;
import M2.e;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.w;
import androidx.lifecycle.z;
import androidx.preference.PreferenceFragmentCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.a;
import p064g2.b;
import p064g2.d;
import p251z9.j;

/* JADX INFO: renamed from: f2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0947u implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0771u, V, InterfaceC0762k, e {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Object f16126n0 = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f16128B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f16129C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f16130D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16131E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f16132F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f16133G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f16134H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16135I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f16136J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public K f16137K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0949w f16138L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public AbstractComponentCallbacksC0947u f16140N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f16141O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f16142P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f16143V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ViewGroup f16144W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public View f16145X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f16146Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0946t f16148a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f16149b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public LayoutInflater f16150c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f16151d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f16152e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EnumC0767p f16153f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public w f16154g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public U f16155h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final z f16156i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public N f16157j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c f16158k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ArrayList f16159l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final r f16160m0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f16162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SparseArray f16163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bundle f16164u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bundle f16166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0947u f16167x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16169z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16161r = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f16165v = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f16168y = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Boolean f16127A = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public L f16139M = new L();
    public final boolean U = true;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f16147Z = true;

    public AbstractComponentCallbacksC0947u() {
        new RunnableC0147v(13, this);
        this.f16153f0 = EnumC0767p.f12665v;
        this.f16156i0 = new z();
        new AtomicInteger();
        this.f16159l0 = new ArrayList();
        this.f16160m0 = new r(this);
        r();
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void B() {
        this.f16143V = true;
    }

    public void C() {
        this.f16143V = true;
    }

    public void D() {
        this.f16143V = true;
    }

    public LayoutInflater E(Bundle bundle) {
        C0949w c0949w = this.f16138L;
        if (c0949w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = c0949w.f16176v;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.f16139M.f15967f);
        return layoutInflaterCloneInContext;
    }

    public abstract void F(Bundle bundle);

    public void G() {
        this.f16143V = true;
    }

    public void H() {
        this.f16143V = true;
    }

    public void J(Bundle bundle) {
        this.f16143V = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16139M.Q();
        this.f16135I = true;
        this.f16155h0 = new U(this, g(), new RunnableC0354l(18, this));
        View viewA = A(layoutInflater, viewGroup, bundle);
        this.f16145X = viewA;
        if (viewA == null) {
            if (this.f16155h0.f16033v != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f16155h0 = null;
            return;
        }
        this.f16155h0.d();
        if (K.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f16145X + " for Fragment " + this);
        }
        K.g(this.f16145X, this.f16155h0);
        K.h(this.f16145X, this.f16155h0);
        a.j0(this.f16145X, this.f16155h0);
        this.f16156i0.d(this.f16155h0);
    }

    public final FragmentActivity L() {
        FragmentActivity fragmentActivityJ = j();
        if (fragmentActivityJ != null) {
            return fragmentActivityJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context M() {
        Context contextL = l();
        if (contextL != null) {
            return contextL;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View N() {
        View view = this.f16145X;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void O(int i10, int i11, int i12, int i13) {
        if (this.f16148a0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        i().f16118b = i10;
        i().f16119c = i11;
        i().f16120d = i12;
        i().f16121e = i13;
    }

    public final void P(Bundle bundle) {
        K k7 = this.f16137K;
        if (k7 != null && (k7.f15953H || k7.f15954I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f16166w = bundle;
    }

    public final void Q(PreferenceFragmentCompat preferenceFragmentCompat) {
        if (preferenceFragmentCompat != null) {
            b bVar = p064g2.c.f16271a;
            p064g2.c.b(new d(this, "Attempting to set target fragment " + preferenceFragmentCompat + " with request code 0 for fragment " + this));
            p064g2.c.a(this).getClass();
        }
        K k7 = this.f16137K;
        K k10 = preferenceFragmentCompat != null ? preferenceFragmentCompat.f16137K : null;
        if (k7 != null && k10 != null && k7 != k10) {
            throw new IllegalArgumentException("Fragment " + preferenceFragmentCompat + " must share the same FragmentManager to be set as a target fragment");
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uQ = preferenceFragmentCompat; abstractComponentCallbacksC0947uQ != null; abstractComponentCallbacksC0947uQ = abstractComponentCallbacksC0947uQ.q(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + preferenceFragmentCompat + " as the target of " + this + " would create a target cycle");
            }
        }
        if (preferenceFragmentCompat == null) {
            this.f16168y = null;
            this.f16167x = null;
        } else if (this.f16137K == null || preferenceFragmentCompat.f16137K == null) {
            this.f16168y = null;
            this.f16167x = preferenceFragmentCompat;
        } else {
            this.f16168y = preferenceFragmentCompat.f16165v;
            this.f16167x = null;
        }
        this.f16169z = 0;
    }

    public final void R(Intent intent) {
        C0949w c0949w = this.f16138L;
        if (c0949w != null) {
            j.e(intent, "intent");
            c0949w.f16173s.startActivity(intent, null);
        } else {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
    }

    @Override // M2.e
    public final c b() {
        return (c) this.f16158k0.f5533t;
    }

    public AbstractC0951y d() {
        return new C0945s(this);
    }

    public S e() {
        Application application;
        if (this.f16137K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f16157j0 == null) {
            Context applicationContext = M().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && K.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + M().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f16157j0 = new N(application, this, this.f16166w);
        }
        return this.f16157j0;
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public final p105k2.d f() {
        Application application;
        Context applicationContext = M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && K.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + M().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p105k2.d dVar = new p105k2.d(0);
        LinkedHashMap linkedHashMap = dVar.f18958a;
        if (application != null) {
            linkedHashMap.put(Q.f12642e, application);
        }
        linkedHashMap.put(K.f12625a, this);
        linkedHashMap.put(K.f12626b, this);
        Bundle bundle = this.f16166w;
        if (bundle != null) {
            linkedHashMap.put(K.f12627c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.V
    public final U g() {
        if (this.f16137K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (n() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f16137K.f15960O.f15997d;
        U u8 = (U) map.get(this.f16165v);
        if (u8 != null) {
            return u8;
        }
        U u10 = new U();
        map.put(this.f16165v, u10);
        return u10;
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        return this.f16154g0;
    }

    public final C0946t i() {
        if (this.f16148a0 == null) {
            C0946t c0946t = new C0946t();
            Object obj = f16126n0;
            c0946t.g = obj;
            c0946t.f16123h = obj;
            c0946t.f16124i = obj;
            c0946t.j = 1.0f;
            c0946t.f16125k = null;
            this.f16148a0 = c0946t;
        }
        return this.f16148a0;
    }

    public final FragmentActivity j() {
        C0949w c0949w = this.f16138L;
        if (c0949w == null) {
            return null;
        }
        return c0949w.f16172r;
    }

    public final K k() {
        if (this.f16138L != null) {
            return this.f16139M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context l() {
        C0949w c0949w = this.f16138L;
        if (c0949w == null) {
            return null;
        }
        return c0949w.f16173s;
    }

    public final LayoutInflater m() {
        LayoutInflater layoutInflater = this.f16150c0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterE = E(null);
        this.f16150c0 = layoutInflaterE;
        return layoutInflaterE;
    }

    public final int n() {
        EnumC0767p enumC0767p = this.f16153f0;
        return (enumC0767p == EnumC0767p.f12662s || this.f16140N == null) ? enumC0767p.ordinal() : Math.min(enumC0767p.ordinal(), this.f16140N.n());
    }

    public final K o() {
        K k7 = this.f16137K;
        if (k7 != null) {
            return k7;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f16143V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        L().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f16143V = true;
    }

    public final Resources p() {
        return M().getResources();
    }

    public final AbstractComponentCallbacksC0947u q(boolean z10) {
        String str;
        if (z10) {
            b bVar = p064g2.c.f16271a;
            p064g2.c.b(new d(this, "Attempting to get target fragment from fragment " + this));
            p064g2.c.a(this).getClass();
        }
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16167x;
        if (abstractComponentCallbacksC0947u != null) {
            return abstractComponentCallbacksC0947u;
        }
        K k7 = this.f16137K;
        if (k7 == null || (str = this.f16168y) == null) {
            return null;
        }
        return k7.f15964c.m(str);
    }

    public final void r() {
        this.f16154g0 = new w(this);
        this.f16158k0 = new c(new O2.b(this, new f(3, this)), 2);
        this.f16157j0 = null;
        ArrayList arrayList = this.f16159l0;
        r rVar = this.f16160m0;
        if (arrayList.contains(rVar)) {
            return;
        }
        if (this.f16161r >= 0) {
            rVar.a();
        } else {
            arrayList.add(rVar);
        }
    }

    public final void s() {
        r();
        this.f16152e0 = this.f16165v;
        this.f16165v = UUID.randomUUID().toString();
        this.f16128B = false;
        this.f16129C = false;
        this.f16131E = false;
        this.f16132F = false;
        this.f16134H = false;
        this.f16136J = 0;
        this.f16137K = null;
        this.f16139M = new L();
        this.f16138L = null;
        this.f16141O = 0;
        this.f16142P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final boolean t() {
        if (this.R) {
            return true;
        }
        K k7 = this.f16137K;
        if (k7 != null) {
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16140N;
            k7.getClass();
            if (abstractComponentCallbacksC0947u == null ? false : abstractComponentCallbacksC0947u.t()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f16165v);
        if (this.f16141O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f16141O));
        }
        if (this.Q != null) {
            sb.append(" tag=");
            sb.append(this.Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.f16136J > 0;
    }

    public void v() {
        this.f16143V = true;
    }

    public void w(int i10, int i11, Intent intent) {
        if (K.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void x(Activity activity) {
        this.f16143V = true;
    }

    public void y(Context context) {
        this.f16143V = true;
        C0949w c0949w = this.f16138L;
        FragmentActivity fragmentActivity = c0949w == null ? null : c0949w.f16172r;
        if (fragmentActivity != null) {
            this.f16143V = false;
            x(fragmentActivity);
        }
    }

    public void z(Bundle bundle) {
        Bundle bundle2;
        this.f16143V = true;
        Bundle bundle3 = this.f16162s;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f16139M.W(bundle2);
            L l10 = this.f16139M;
            l10.f15953H = false;
            l10.f15954I = false;
            l10.f15960O.g = false;
            l10.u(1);
        }
        L l11 = this.f16139M;
        if (l11.f15981v >= 1) {
            return;
        }
        l11.f15953H = false;
        l11.f15954I = false;
        l11.f15960O.g = false;
        l11.u(1);
    }

    public void I(Bundle bundle) {
    }
}
