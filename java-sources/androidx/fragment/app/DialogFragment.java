package androidx.fragment.app;

import E2.RunnableC0147v;
import Z0.B;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import p000a.a;
import p020c.k;
import p056f2.AbstractC0951y;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0928a;
import p056f2.C0944q;
import p056f2.C0945s;
import p056f2.DialogInterfaceOnCancelListenerC0942o;
import p056f2.DialogInterfaceOnDismissListenerC0943p;
import p056f2.I;
import p056f2.K;
import p056f2.T;
import p123m2.c;
import r.f;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends AbstractComponentCallbacksC0947u implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f12575A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f12576B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f12577C0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Handler f12579o0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f12588x0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Dialog f12590z0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC0147v f12580p0 = new RunnableC0147v(12, this);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0942o f12581q0 = new DialogInterfaceOnCancelListenerC0942o(this);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0943p f12582r0 = new DialogInterfaceOnDismissListenerC0943p(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f12583s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f12584t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f12585u0 = true;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f12586v0 = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f12587w0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final B f12589y0 = new B(8, this);

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f12578D0 = false;

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void C() {
        this.f16143V = true;
        Dialog dialog = this.f12590z0;
        if (dialog != null) {
            this.f12575A0 = true;
            dialog.setOnDismissListener(null);
            this.f12590z0.dismiss();
            if (!this.f12576B0) {
                onDismiss(this.f12590z0);
            }
            this.f12590z0 = null;
            this.f12578D0 = false;
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void D() {
        this.f16143V = true;
        if (!this.f12577C0 && !this.f12576B0) {
            this.f12576B0 = true;
        }
        z zVar = this.f16156i0;
        zVar.getClass();
        z.a("removeObserver");
        y yVar = (y) zVar.f12685b.c(this.f12589y0);
        if (yVar == null) {
            return;
        }
        yVar.a(false);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        boolean z10 = this.f12586v0;
        if (z10 && !this.f12588x0) {
            if (z10 && !this.f12578D0) {
                try {
                    this.f12588x0 = true;
                    Dialog dialogT = T(bundle);
                    this.f12590z0 = dialogT;
                    if (this.f12586v0) {
                        U(dialogT, this.f12583s0);
                        Context contextL = l();
                        if (contextL instanceof Activity) {
                            this.f12590z0.setOwnerActivity((Activity) contextL);
                        }
                        this.f12590z0.setCancelable(this.f12585u0);
                        this.f12590z0.setOnCancelListener(this.f12581q0);
                        this.f12590z0.setOnDismissListener(this.f12582r0);
                        this.f12578D0 = true;
                    } else {
                        this.f12590z0 = null;
                    }
                    this.f12588x0 = false;
                } catch (Throwable th) {
                    this.f12588x0 = false;
                    throw th;
                }
            }
            if (K.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f12590z0;
            if (dialog != null) {
                return layoutInflaterE.cloneInContext(dialog.getContext());
            }
        } else if (K.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f12586v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterE;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterE;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void F(Bundle bundle) {
        Dialog dialog = this.f12590z0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f12583s0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f12584t0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f12585u0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f12586v0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f12587w0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void G() {
        this.f16143V = true;
        Dialog dialog = this.f12590z0;
        if (dialog != null) {
            this.f12575A0 = false;
            dialog.show();
            View decorView = this.f12590z0.getWindow().getDecorView();
            androidx.lifecycle.K.g(decorView, this);
            androidx.lifecycle.K.h(decorView, this);
            a.j0(decorView, this);
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void H() {
        this.f16143V = true;
        Dialog dialog = this.f12590z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.f16143V = true;
        if (this.f12590z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f12590z0.onRestoreInstanceState(bundle2);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.f16145X != null || this.f12590z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f12590z0.onRestoreInstanceState(bundle2);
    }

    public final void S(boolean z10, boolean z11) {
        if (this.f12576B0) {
            return;
        }
        this.f12576B0 = true;
        this.f12577C0 = false;
        Dialog dialog = this.f12590z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f12590z0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f12579o0.getLooper()) {
                    onDismiss(this.f12590z0);
                } else {
                    this.f12579o0.post(this.f12580p0);
                }
            }
        }
        this.f12575A0 = true;
        if (this.f12587w0 >= 0) {
            K kO = o();
            int i10 = this.f12587w0;
            if (i10 < 0) {
                throw new IllegalArgumentException(c.r(i10, "Bad id: "));
            }
            kO.y(new I(kO, i10), z10);
            this.f12587w0 = -1;
            return;
        }
        C0928a c0928a = new C0928a(o());
        c0928a.f16063p = true;
        K k7 = this.f16137K;
        if (k7 != null && k7 != c0928a.f16065r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0928a.b(new T(3, this));
        if (z10) {
            c0928a.e(true, true);
        } else {
            c0928a.e(false, true);
        }
    }

    public Dialog T(Bundle bundle) {
        if (K.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new k(M(), this.f12584t0);
    }

    public void U(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void V(K k7, String str) {
        this.f12576B0 = false;
        this.f12577C0 = true;
        k7.getClass();
        C0928a c0928a = new C0928a(k7);
        c0928a.f16063p = true;
        c0928a.f(0, this, str, 1);
        c0928a.e(false, true);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final AbstractC0951y d() {
        return new C0944q(this, new C0945s(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f12575A0) {
            return;
        }
        if (K.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        S(true, true);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void v() {
        this.f16143V = true;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void y(Context context) {
        Object obj;
        super.y(context);
        z zVar = this.f16156i0;
        zVar.getClass();
        z.a("observeForever");
        B b5 = this.f12589y0;
        y yVar = new y(zVar, b5);
        f fVar = zVar.f12685b;
        r.c cVarB = fVar.b(b5);
        if (cVarB != null) {
            obj = cVarB.f21373s;
        } else {
            r.c cVar = new r.c(b5, yVar);
            fVar.f21382u++;
            r.c cVar2 = fVar.f21380s;
            if (cVar2 == null) {
                fVar.f21379r = cVar;
                fVar.f21380s = cVar;
            } else {
                cVar2.f21374t = cVar;
                cVar.f21375u = cVar2;
                fVar.f21380s = cVar;
            }
            obj = null;
        }
        if (((y) obj) == null) {
            yVar.a(true);
        }
        if (this.f12577C0) {
            return;
        }
        this.f12576B0 = false;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void z(Bundle bundle) {
        super.z(bundle);
        this.f12579o0 = new Handler();
        this.f12586v0 = this.f16142P == 0;
        if (bundle != null) {
            this.f12583s0 = bundle.getInt("android:style", 0);
            this.f12584t0 = bundle.getInt("android:theme", 0);
            this.f12585u0 = bundle.getBoolean("android:cancelable", true);
            this.f12586v0 = bundle.getBoolean("android:showsDialog", this.f12586v0);
            this.f12587w0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
