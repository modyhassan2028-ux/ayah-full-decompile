package i7;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f16818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B1 f16819d;

    public A1(B1 b5) {
        this.f16819d = b5;
        C1023u0 c1023u0 = (C1023u0) b5.f16104r;
        this.f16818c = new z1(this, c1023u0, 0);
        c1023u0.f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f16816a = jElapsedRealtime;
        this.f16817b = jElapsedRealtime;
    }

    public final boolean a(long j, boolean z10, boolean z11) {
        B1 b5 = this.f16819d;
        b5.o();
        b5.p();
        C1023u0 c1023u0 = (C1023u0) b5.f16104r;
        boolean zA = c1023u0.a();
        X x9 = c1023u0.f17584w;
        if (zA) {
            C0985h0 c0985h0 = c1023u0.f17583v;
            C1023u0.k(c0985h0);
            C0979f0 c0979f0 = c0985h0.f17390G;
            c1023u0.f17564B.getClass();
            c0979f0.b(System.currentTimeMillis());
        }
        long j10 = j - this.f16816a;
        if (!z10 && j10 < 1000) {
            C1023u0.m(x9);
            x9.f17178E.b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j10 = j - this.f16817b;
            this.f16817b = j;
        }
        C1023u0.m(x9);
        x9.f17178E.b(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z12 = !c1023u0.f17582u.C();
        C0992j1 c0992j1 = c1023u0.f17565C;
        C1023u0.l(c0992j1);
        V1.h0(c0992j1.u(z12), bundle, true);
        if (!z11) {
            Y0 y10 = c1023u0.f17566D;
            C1023u0.l(y10);
            y10.v("auto", "_e", bundle);
        }
        this.f16816a = j;
        z1 z1Var = this.f16818c;
        z1Var.c();
        z1Var.b(((Long) G.f16972r0.a(null)).longValue());
        return true;
    }
}
