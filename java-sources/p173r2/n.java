package p173r2;

import N9.AbstractC0419l;
import N9.U;
import N9.i0;
import N9.k0;
import android.os.Bundle;
import android.support.v4.media.session.p;
import android.util.Log;
import androidx.lifecycle.EnumC0767p;
import i7.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p120l9.k;
import p120l9.m;
import p120l9.r;
import p120l9.t;
import p185s8.u0;
import p197u2.f;
import p197u2.h;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f21455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f21456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f21457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U f21459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U f21460f;
    public final G g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A f21461h;

    public n(A a9, G g) {
        j.e(g, "navigator");
        this.f21461h = a9;
        this.f21455a = new C(13);
        k0 k0VarC = AbstractC0419l.c(r.f19440r);
        this.f21456b = k0VarC;
        k0 k0VarC2 = AbstractC0419l.c(t.f19442r);
        this.f21457c = k0VarC2;
        this.f21459e = new U(k0VarC);
        this.f21460f = new U(k0VarC2);
        this.g = g;
    }

    public final void a(j jVar) {
        j.e(jVar, "backStackEntry");
        synchronized (this.f21455a) {
            k0 k0Var = this.f21456b;
            ArrayList arrayListR0 = m.r0((Collection) k0Var.getValue(), jVar);
            k0Var.getClass();
            k0Var.n(null, arrayListR0);
        }
    }

    public final j b(v vVar, Bundle bundle) {
        h hVar = this.f21461h.f21412b;
        hVar.getClass();
        return C.f(hVar.f22849a.f21413c, vVar, bundle, hVar.i(), hVar.f22861o);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    public final void c(j jVar) {
        o oVar;
        androidx.lifecycle.U u8;
        j.e(jVar, "entry");
        h hVar = this.f21461h.f21412b;
        m mVar = new m(this, jVar);
        k0 k0Var = hVar.f22855h;
        String str = jVar.f21446w;
        LinkedHashMap linkedHashMap = hVar.f22869w;
        boolean zA = j.a(linkedHashMap.get(jVar), Boolean.TRUE);
        mVar.invoke();
        linkedHashMap.remove(jVar);
        k kVar = hVar.f22854f;
        if (kVar.contains(jVar)) {
            if (this.f21458d) {
                return;
            }
            hVar.s();
            k0 k0Var2 = hVar.g;
            ArrayList arrayListD0 = m.D0(kVar);
            k0Var2.getClass();
            k0Var2.n(null, arrayListD0);
            ArrayList arrayListP = hVar.p();
            k0Var.getClass();
            k0Var.n(null, arrayListP);
            return;
        }
        hVar.r(jVar);
        if (jVar.f21448y.j.f12672c.compareTo(EnumC0767p.f12663t) >= 0) {
            jVar.c(EnumC0767p.f12661r);
        }
        if (!kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (j.a(((j) it.next()).f21446w, str)) {
                }
            }
            if (!zA) {
                j.e(str, "backStackEntryId");
                u8 = (androidx.lifecycle.U) oVar.f21462b.remove(str);
                if (u8 != null) {
                    u8.a();
                }
            }
        } else if (!zA && (oVar = hVar.f22861o) != null) {
            j.e(str, "backStackEntryId");
            u8 = (androidx.lifecycle.U) oVar.f21462b.remove(str);
            if (u8 != null) {
                u8.a();
            }
        }
        hVar.s();
        ArrayList arrayListP2 = hVar.p();
        k0Var.getClass();
        k0Var.n(null, arrayListP2);
    }

    public final void d(j jVar, boolean z10) {
        h hVar = this.f21461h.f21412b;
        m mVar = new m(this, jVar, z10);
        hVar.getClass();
        G gB = hVar.f22865s.b(jVar.f21442s.f21492r);
        hVar.f22869w.put(jVar, Boolean.valueOf(z10));
        if (!gB.equals(this.g)) {
            Object obj = hVar.f22866t.get(gB);
            j.b(obj);
            ((n) obj).d(jVar, z10);
            return;
        }
        f fVar = hVar.f22868v;
        if (fVar != null) {
            fVar.e(jVar);
            mVar.invoke();
            return;
        }
        k kVar = hVar.f22854f;
        int iIndexOf = kVar.indexOf(jVar);
        if (iIndexOf < 0) {
            String str = "Ignoring pop of " + jVar + " as it was not found on the current back stack";
            j.e(str, "message");
            Log.i("NavController", str);
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != kVar.f19438t) {
            hVar.m(((j) kVar.get(i10)).f21442s.f21493s.f1641a, true, false);
        }
        h.o(hVar, jVar);
        mVar.invoke();
        hVar.f22850b.invoke();
        hVar.b();
    }

    public final void e(j jVar, boolean z10) {
        Object objPrevious;
        k0 k0Var = this.f21457c;
        Iterable iterable = (Iterable) k0Var.getValue();
        boolean z11 = iterable instanceof Collection;
        U u8 = this.f21459e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((j) it.next()) == jVar) {
                    Iterable iterable2 = (Iterable) u8.f6130r.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((j) it2.next()) == jVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        k0Var.n(null, u0.w((Set) k0Var.getValue(), jVar));
        i0 i0Var = u8.f6130r;
        i0 i0Var2 = u8.f6130r;
        List list = (List) i0Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            j jVar2 = (j) objPrevious;
            if (!j.a(jVar2, jVar) && ((List) i0Var2.getValue()).lastIndexOf(jVar2) < ((List) i0Var2.getValue()).lastIndexOf(jVar)) {
                break;
            }
        }
        j jVar3 = (j) objPrevious;
        if (jVar3 != null) {
            k0Var.n(null, u0.w((Set) k0Var.getValue(), jVar3));
        }
        d(jVar, z10);
    }

    public final void f(j jVar) {
        j.e(jVar, "backStackEntry");
        h hVar = this.f21461h.f21412b;
        hVar.getClass();
        G gB = hVar.f22865s.b(jVar.f21442s.f21492r);
        if (!gB.equals(this.g)) {
            Object obj = hVar.f22866t.get(gB);
            if (obj == null) {
                throw new IllegalStateException(p.B(new StringBuilder("NavigatorBackStack for "), jVar.f21442s.f21492r, " should already be created").toString());
            }
            ((n) obj).f(jVar);
            return;
        }
        c cVar = hVar.f22867u;
        if (cVar != null) {
            cVar.e(jVar);
            a(jVar);
            return;
        }
        String str = "Ignoring add of destination " + jVar.f21442s + " outside of the call to navigate(). ";
        j.e(str, "message");
        Log.i("NavController", str);
    }
}
