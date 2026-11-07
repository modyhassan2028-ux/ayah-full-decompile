package p020c;

import E1.a;
import F2.t;
import J7.c;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import java.util.Iterator;
import java.util.ListIterator;
import p120l9.k;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f13354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13355b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f13356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f13357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f13358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13359f;
    public boolean g;

    public D(Runnable runnable) {
        this.f13354a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f13357d = i10 >= 34 ? new A(new y(this, 0), new y(this, 1), new z(this, 0), new z(this, 1)) : new c(1, new z(this, 2));
        }
    }

    public final void a(InterfaceC0771u interfaceC0771u, x xVar) {
        j.e(interfaceC0771u, "owner");
        j.e(xVar, "onBackPressedCallback");
        w wVarH = interfaceC0771u.h();
        if (wVarH.f12672c == EnumC0767p.f12661r) {
            return;
        }
        xVar.f13408b.add(new B(this, wVarH, xVar));
        e();
        xVar.f13409c = new t(0, this, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 4);
    }

    public final void b() {
        Object objPrevious;
        x xVar = this.f13356c;
        if (xVar == null) {
            k kVar = this.f13355b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f13407a);
            xVar = (x) objPrevious;
        }
        this.f13356c = null;
        if (xVar != null) {
            xVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        x xVar = this.f13356c;
        if (xVar == null) {
            k kVar = this.f13355b;
            ListIterator listIterator = kVar.listIterator(kVar.b());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f13407a);
            xVar = (x) objPrevious;
        }
        this.f13356c = null;
        if (xVar != null) {
            xVar.b();
        } else {
            this.f13354a.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13358e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f13357d) == null) {
            return;
        }
        if (z10 && !this.f13359f) {
            a.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13359f = true;
        } else {
            if (z10 || !this.f13359f) {
                return;
            }
            a.l(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13359f = false;
        }
    }

    public final void e() {
        boolean z10 = this.g;
        boolean z11 = false;
        k kVar = this.f13355b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (((x) it.next()).f13407a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }
}
