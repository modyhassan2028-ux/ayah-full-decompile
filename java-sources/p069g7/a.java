package p069g7;

import H8.e;
import I1.RunnableC0250e0;
import U6.y;
import android.os.Bundle;
import android.os.SystemClock;
import i7.A;
import i7.C0983g1;
import i7.C0992j1;
import i7.C1014r0;
import i7.C1023u0;
import i7.O0;
import i7.S1;
import i7.V1;
import i7.X;
import i7.Y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1023u0 f16327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y0 f16328b;

    public a(C1023u0 c1023u0) {
        y.f(c1023u0);
        this.f16327a = c1023u0;
        Y0 y10 = c1023u0.f17566D;
        C1023u0.l(y10);
        this.f16328b = y10;
    }

    @Override // i7.Z0
    public final void a(String str, String str2, Bundle bundle) {
        Y0 y10 = this.f16328b;
        ((C1023u0) y10.f16104r).f17564B.getClass();
        y10.t(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // i7.Z0
    public final long b() {
        V1 v10 = this.f16327a.f17587z;
        C1023u0.k(v10);
        return v10.m0();
    }

    @Override // i7.Z0
    public final void c(String str, String str2, Bundle bundle) {
        Y0 y10 = this.f16327a.f17566D;
        C1023u0.l(y10);
        y10.C(str, str2, bundle);
    }

    @Override // i7.Z0
    public final String d() {
        C0992j1 c0992j1 = ((C1023u0) this.f16328b.f16104r).f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1 = c0992j1.f17428t;
        if (c0983g1 != null) {
            return c0983g1.f17367a;
        }
        return null;
    }

    @Override // i7.Z0
    public final String e() {
        C0992j1 c0992j1 = ((C1023u0) this.f16328b.f16104r).f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1 = c0992j1.f17428t;
        if (c0983g1 != null) {
            return c0983g1.f17368b;
        }
        return null;
    }

    @Override // i7.Z0
    public final List f(String str, String str2) {
        Y0 y10 = this.f16328b;
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        X x9 = c1023u0.f17584w;
        C1023u0.m(c1014r0);
        if (c1014r0.u()) {
            C1023u0.m(x9);
            x9.f17182w.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (e.q()) {
            C1023u0.m(x9);
            x9.f17182w.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.y(atomicReference, 5000L, "get conditional user properties", new RunnableC0250e0(y10, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return V1.f0(list);
        }
        C1023u0.m(x9);
        x9.f17182w.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // i7.Z0
    public final void g(Bundle bundle) {
        Y0 y10 = this.f16328b;
        ((C1023u0) y10.f16104r).f17564B.getClass();
        y10.B(bundle, System.currentTimeMillis());
    }

    @Override // i7.Z0
    public final int h(String str) {
        Y0 y10 = this.f16328b;
        y10.getClass();
        y.c(str);
        ((C1023u0) y10.f16104r).getClass();
        return 25;
    }

    @Override // i7.Z0
    public final String i() {
        return (String) this.f16328b.f17236x.get();
    }

    @Override // i7.Z0
    public final void j(String str) {
        C1023u0 c1023u0 = this.f16327a;
        A a9 = c1023u0.f17567E;
        C1023u0.j(a9);
        c1023u0.f17564B.getClass();
        a9.q(SystemClock.elapsedRealtime(), str);
    }

    @Override // i7.Z0
    public final String k() {
        return this.f16328b.D();
    }

    @Override // i7.Z0
    public final Map l(String str, String str2, boolean z10) {
        Y0 y10 = this.f16328b;
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        X x9 = c1023u0.f17584w;
        C1023u0.m(c1014r0);
        if (c1014r0.u()) {
            C1023u0.m(x9);
            x9.f17182w.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (e.q()) {
            C1023u0.m(x9);
            x9.f17182w.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.y(atomicReference, 5000L, "get user properties", new O0(y10, atomicReference, str, str2, z10));
        List<S1> list = (List) atomicReference.get();
        if (list == null) {
            C1023u0.m(x9);
            x9.f17182w.b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C1350e c1350e = new C1350e(list.size());
        for (S1 s10 : list) {
            Object objB = s10.b();
            if (objB != null) {
                c1350e.put(s10.f17132s, objB);
            }
        }
        return c1350e;
    }

    @Override // i7.Z0
    public final void m(String str) {
        C1023u0 c1023u0 = this.f16327a;
        A a9 = c1023u0.f17567E;
        C1023u0.j(a9);
        c1023u0.f17564B.getClass();
        a9.p(SystemClock.elapsedRealtime(), str);
    }
}
