package i7;

import android.os.Bundle;
import java.util.Iterator;
import u.C1347b;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class A extends E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1350e f16807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1350e f16808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16809u;

    public A(C1023u0 c1023u0) {
        super(c1023u0);
        this.f16808t = new C1350e(0);
        this.f16807s = new C1350e(0);
    }

    public final void p(long j, String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str == null || str.length() == 0) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Ad unit id must be a non-empty string");
        } else {
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new RunnableC0963a(this, str, j, 0));
        }
    }

    public final void q(long j, String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str == null || str.length() == 0) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Ad unit id must be a non-empty string");
        } else {
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new RunnableC0963a(this, str, j, 1));
        }
    }

    public final void r(long j) {
        C0992j1 c0992j1 = ((C1023u0) this.f16104r).f17565C;
        C1023u0.l(c0992j1);
        C0983g1 c0983g1U = c0992j1.u(false);
        C1350e c1350e = this.f16807s;
        for (String str : (C1347b) c1350e.keySet()) {
            t(str, j - ((Long) c1350e.get(str)).longValue(), c0983g1U);
        }
        if (!c1350e.isEmpty()) {
            s(j - this.f16809u, c0983g1U);
        }
        u(j);
    }

    public final void s(long j, C0983g1 c0983g1) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (c0983g1 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17178E.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            V1.h0(c0983g1, bundle, true);
            Y0 y10 = c1023u0.f17566D;
            C1023u0.l(y10);
            y10.v("am", "_xa", bundle);
        }
    }

    public final void t(String str, long j, C0983g1 c0983g1) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (c0983g1 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17178E.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            V1.h0(c0983g1, bundle, true);
            Y0 y10 = c1023u0.f17566D;
            C1023u0.l(y10);
            y10.v("am", "_xu", bundle);
        }
    }

    public final void u(long j) {
        C1350e c1350e = this.f16807s;
        Iterator it = ((C1347b) c1350e.keySet()).iterator();
        while (it.hasNext()) {
            c1350e.put((String) it.next(), Long.valueOf(j));
        }
        if (c1350e.isEmpty()) {
            return;
        }
        this.f16809u = j;
    }
}
