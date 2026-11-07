package androidx.activity;

import B3.f;
import K0.C0368s0;
import L5.c;
import M2.e;
import O2.b;
import R6.i;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.r;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.w;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p020c.C0780e;
import p020c.C0782g;
import p020c.D;
import p020c.F;
import p020c.RunnableC0778c;
import p020c.ViewTreeObserverOnDrawListenerC0783h;
import p020c.j;
import p053f.g;
import p056f2.C;
import p105k2.d;
import p110k9.a;
import p110k9.o;
import p216w1.m;
import p216w1.v;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements V, InterfaceC0762k, e, F {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f11367K = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArrayList f11368A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f11369B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CopyOnWriteArrayList f11370C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final CopyOnWriteArrayList f11371D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f11372E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final CopyOnWriteArrayList f11373F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f11374G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f11375H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final o f11376I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final o f11377J;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f11378s = new i();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f11379t = new r(new RunnableC0778c(this, 0));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f11380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public U f11381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0783h f11382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f11383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicInteger f11384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p020c.i f11385z;

    public ComponentActivity() {
        c cVar = new c(new b(this, new f(3, this)), 2);
        this.f11380u = cVar;
        this.f11382w = new ViewTreeObserverOnDrawListenerC0783h(this);
        this.f11383x = a.d(new j(this, 2));
        this.f11384y = new AtomicInteger();
        this.f11385z = new p020c.i(this);
        this.f11368A = new CopyOnWriteArrayList();
        this.f11369B = new CopyOnWriteArrayList();
        this.f11370C = new CopyOnWriteArrayList();
        this.f11371D = new CopyOnWriteArrayList();
        this.f11372E = new CopyOnWriteArrayList();
        this.f11373F = new CopyOnWriteArrayList();
        w wVar = this.f12313r;
        if (wVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        wVar.a(new InterfaceC0769s(this) { // from class: c.d

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f13372s;

            {
                this.f13372s = this;
            }

            @Override // androidx.lifecycle.InterfaceC0769s
            public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        ComponentActivity componentActivity = this.f13372s;
                        int i11 = ComponentActivity.f11367K;
                        if (enumC0766o == EnumC0766o.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity componentActivity2 = this.f13372s;
                        int i12 = ComponentActivity.f11367K;
                        if (enumC0766o == EnumC0766o.ON_DESTROY) {
                            componentActivity2.f11378s.f7254b = null;
                            if (!componentActivity2.isChangingConfigurations()) {
                                componentActivity2.g().a();
                            }
                            ViewTreeObserverOnDrawListenerC0783h viewTreeObserverOnDrawListenerC0783h = componentActivity2.f11382w;
                            ComponentActivity componentActivity3 = viewTreeObserverOnDrawListenerC0783h.f13381u;
                            componentActivity3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0783h);
                            componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0783h);
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f12313r.a(new InterfaceC0769s(this) { // from class: c.d

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f13372s;

            {
                this.f13372s = this;
            }

            @Override // androidx.lifecycle.InterfaceC0769s
            public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        ComponentActivity componentActivity = this.f13372s;
                        int i12 = ComponentActivity.f11367K;
                        if (enumC0766o == EnumC0766o.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity componentActivity2 = this.f13372s;
                        int i13 = ComponentActivity.f11367K;
                        if (enumC0766o == EnumC0766o.ON_DESTROY) {
                            componentActivity2.f11378s.f7254b = null;
                            if (!componentActivity2.isChangingConfigurations()) {
                                componentActivity2.g().a();
                            }
                            ViewTreeObserverOnDrawListenerC0783h viewTreeObserverOnDrawListenerC0783h = componentActivity2.f11382w;
                            ComponentActivity componentActivity3 = viewTreeObserverOnDrawListenerC0783h.f13381u;
                            componentActivity3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0783h);
                            componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0783h);
                        }
                        break;
                }
            }
        });
        this.f12313r.a(new M2.b(i11, this));
        cVar.H();
        K.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f12313r.a(new p020c.w(this));
        }
        ((c) cVar.f5533t).L("android:support:activity-result", new C0368s0(1, this));
        int i12 = 0;
        k(new C0780e(this, i12));
        this.f11376I = a.d(new j(this, i12));
        this.f11377J = a.d(new j(this, 3));
    }

    @Override // p020c.F
    public final D a() {
        return (D) this.f11377J.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        View decorView = getWindow().getDecorView();
        p251z9.j.d(decorView, "window.decorView");
        this.f11382w.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // M2.e
    public final c b() {
        return (c) this.f11380u.f5533t;
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public S e() {
        return (S) this.f11376I.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public final d f() {
        d dVar = new d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f18958a;
        if (application != null) {
            Application application2 = getApplication();
            p251z9.j.d(application2, "application");
            linkedHashMap.put(Q.f12642e, application2);
        }
        linkedHashMap.put(K.f12625a, this);
        linkedHashMap.put(K.f12626b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(K.f12627c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.V
    public final U g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f11381v == null) {
            C0782g c0782g = (C0782g) getLastNonConfigurationInstance();
            if (c0782g != null) {
                this.f11381v = c0782g.f13377a;
            }
            if (this.f11381v == null) {
                this.f11381v = new U();
            }
        }
        U u8 = this.f11381v;
        p251z9.j.b(u8);
        return u8;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC0771u
    public final w h() {
        return this.f12313r;
    }

    public final void j(H1.a aVar) {
        p251z9.j.e(aVar, "listener");
        this.f11368A.add(aVar);
    }

    public final void k(p041e.a aVar) {
        i iVar = this.f11378s;
        iVar.getClass();
        ComponentActivity componentActivity = (ComponentActivity) iVar.f7254b;
        if (componentActivity != null) {
            aVar.a(componentActivity);
        }
        ((CopyOnWriteArraySet) iVar.f7253a).add(aVar);
    }

    public final void l() {
        View decorView = getWindow().getDecorView();
        p251z9.j.d(decorView, "window.decorView");
        K.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        p251z9.j.d(decorView2, "window.decorView");
        K.h(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        p251z9.j.d(decorView3, "window.decorView");
        p000a.a.j0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        p251z9.j.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        p251z9.j.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final g m(final p056f2.F f3, final p053f.b bVar) {
        final p020c.i iVar = this.f11385z;
        p251z9.j.e(iVar, "registry");
        final String str = "activity_rq#" + this.f11384y.getAndIncrement();
        LinkedHashMap linkedHashMap = iVar.f13384c;
        p251z9.j.e(str, "key");
        w wVar = this.f12313r;
        if (wVar.f12672c.compareTo(EnumC0767p.f12664u) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + wVar.f12672c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        iVar.d(str);
        p053f.e eVar = (p053f.e) linkedHashMap.get(str);
        if (eVar == null) {
            eVar = new p053f.e(wVar);
        }
        InterfaceC0769s interfaceC0769s = new InterfaceC0769s() { // from class: f.c
            @Override // androidx.lifecycle.InterfaceC0769s
            public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
                EnumC0766o enumC0766o2 = EnumC0766o.ON_START;
                p020c.i iVar2 = iVar;
                String str2 = str;
                if (enumC0766o2 != enumC0766o) {
                    if (EnumC0766o.ON_STOP == enumC0766o) {
                        iVar2.f13386e.remove(str2);
                        return;
                    } else {
                        if (EnumC0766o.ON_DESTROY == enumC0766o) {
                            iVar2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = iVar2.f13386e;
                Bundle bundle = iVar2.g;
                LinkedHashMap linkedHashMap3 = iVar2.f13387f;
                b bVar2 = bVar;
                p056f2.F f7 = f3;
                linkedHashMap2.put(str2, new d(bVar2, f7));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.d(obj);
                }
                a aVar = (a) B1.D(str2, bundle);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.d(f7.c0(aVar.f15870s, aVar.f15869r));
                }
            }
        };
        eVar.f15877a.a(interfaceC0769s);
        eVar.f15878b.add(interfaceC0769s);
        linkedHashMap.put(str, eVar);
        return new g(iVar, str, f3, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f11385z.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        p251z9.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f11368A.iterator();
        while (it.hasNext()) {
            ((H1.a) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f11380u.I(bundle);
        i iVar = this.f11378s;
        iVar.getClass();
        iVar.f7254b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f7253a).iterator();
        while (it.hasNext()) {
            ((p041e.a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = G.f12616s;
        E.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        p251z9.j.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f11379t.f11365t).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f15936a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        p251z9.j.e(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f11379t.f11365t).iterator();
            while (it.hasNext()) {
                if (((C) it.next()).f15936a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f11374G) {
            return;
        }
        Iterator it = this.f11371D.iterator();
        while (it.hasNext()) {
            ((H1.a) it.next()).accept(new m(z10));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        p251z9.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f11370C.iterator();
        while (it.hasNext()) {
            ((H1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        p251z9.j.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f11379t.f11365t).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f15936a.q();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f11375H) {
            return;
        }
        Iterator it = this.f11372E.iterator();
        while (it.hasNext()) {
            ((H1.a) it.next()).accept(new v(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        p251z9.j.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f11379t.f11365t).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f15936a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        p251z9.j.e(strArr, "permissions");
        p251z9.j.e(iArr, "grantResults");
        if (this.f11385z.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0782g c0782g;
        U u8 = this.f11381v;
        if (u8 == null && (c0782g = (C0782g) getLastNonConfigurationInstance()) != null) {
            u8 = c0782g.f13377a;
        }
        if (u8 == null) {
            return null;
        }
        C0782g c0782g2 = new C0782g();
        c0782g2.f13377a = u8;
        return c0782g2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p251z9.j.e(bundle, "outState");
        w wVar = this.f12313r;
        if (wVar != null) {
            p251z9.j.c(wVar, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            wVar.g(EnumC0767p.f12663t);
        }
        super.onSaveInstanceState(bundle);
        this.f11380u.J(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f11369B.iterator();
        while (it.hasNext()) {
            ((H1.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f11373F.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Y2.a.U()) {
                Y2.a.n("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p020c.r rVar = (p020c.r) this.f11383x.getValue();
            synchronized (rVar.f13397b) {
                try {
                    rVar.f13398c = true;
                    ArrayList arrayList = rVar.f13399d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p241y9.a) obj).invoke();
                    }
                    rVar.f13399d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        l();
        View decorView = getWindow().getDecorView();
        p251z9.j.d(decorView, "window.decorView");
        this.f11382w.a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        p251z9.j.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        p251z9.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        p251z9.j.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        p251z9.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        p251z9.j.e(configuration, "newConfig");
        this.f11374G = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f11374G = false;
            Iterator it = this.f11371D.iterator();
            while (it.hasNext()) {
                ((H1.a) it.next()).accept(new m(z10));
            }
        } catch (Throwable th) {
            this.f11374G = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        p251z9.j.e(configuration, "newConfig");
        this.f11375H = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f11375H = false;
            Iterator it = this.f11372E.iterator();
            while (it.hasNext()) {
                ((H1.a) it.next()).accept(new v(z10));
            }
        } catch (Throwable th) {
            this.f11375H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        l();
        View decorView = getWindow().getDecorView();
        p251z9.j.d(decorView, "window.decorView");
        this.f11382w.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        View decorView = getWindow().getDecorView();
        p251z9.j.d(decorView, "window.decorView");
        this.f11382w.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
