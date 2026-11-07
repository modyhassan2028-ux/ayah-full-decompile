package p020c;

import B3.f;
import K0.RunnableC0354l;
import L5.c;
import M2.e;
import O2.b;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.w;
import com.ayah.R;
import p000a.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class k extends Dialog implements InterfaceC0771u, F, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f13391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f13392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f13393t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i10) {
        super(context, i10);
        j.e(context, "context");
        this.f13392s = new c(new b(this, new f(3, this)), 2);
        this.f13393t = new D(new RunnableC0354l(16, this));
    }

    public static void c(k kVar) {
        super.onBackPressed();
    }

    @Override // p020c.F
    public final D a() {
        return this.f13393t;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // M2.e
    public final c b() {
        return (c) this.f13392s.f5533t;
    }

    public final void d() {
        Window window = getWindow();
        j.b(window);
        View decorView = window.getDecorView();
        j.d(decorView, "window!!.decorView");
        K.g(decorView, this);
        Window window2 = getWindow();
        j.b(window2);
        View decorView2 = window2.getDecorView();
        j.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        j.b(window3);
        View decorView3 = window3.getDecorView();
        j.d(decorView3, "window!!.decorView");
        a.j0(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        w wVar = this.f13391r;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        this.f13391r = wVar2;
        return wVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f13393t.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            j.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            D d5 = this.f13393t;
            d5.f13358e = onBackInvokedDispatcher;
            d5.d(d5.g);
        }
        this.f13392s.I(bundle);
        w wVar = this.f13391r;
        if (wVar == null) {
            wVar = new w(this);
            this.f13391r = wVar;
        }
        wVar.d(EnumC0766o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        j.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f13392s.J(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        w wVar = this.f13391r;
        if (wVar == null) {
            wVar = new w(this);
            this.f13391r = wVar;
        }
        wVar.d(EnumC0766o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        w wVar = this.f13391r;
        if (wVar == null) {
            wVar = new w(this);
            this.f13391r = wVar;
        }
        wVar.d(EnumC0766o.ON_DESTROY);
        this.f13391r = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        j.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
