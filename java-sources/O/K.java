package O;

import K.W;
import K.g0;
import K.t0;

/* JADX INFO: loaded from: classes.dex */
public final class K implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f6302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6303b;

    public K(N n6, boolean z10) {
        this.f6302a = n6;
        this.f6303b = z10;
    }

    @Override // K.g0
    public final void a() {
        N n6 = this.f6302a;
        n6.f6323r.setValue(null);
        n6.f6324s.setValue(null);
        n6.q(true);
    }

    @Override // K.g0
    public final void b() {
        N n6 = this.f6302a;
        n6.f6323r.setValue(null);
        n6.f6324s.setValue(null);
        n6.q(true);
    }

    @Override // K.g0
    public final void d() {
        t0 t0VarD;
        boolean z10 = this.f6303b;
        K.K k7 = z10 ? K.K.f4481s : K.K.f4482t;
        N n6 = this.f6302a;
        n6.f6323r.setValue(k7);
        long jA = y.a(n6.j(z10));
        W w9 = n6.f6311d;
        if (w9 == null || (t0VarD = w9.d()) == null) {
            return;
        }
        long jE = t0VarD.e(jA);
        n6.f6320o = jE;
        n6.f6324s.setValue(new p171r0.c(jE));
        n6.f6322q = 0L;
        n6.f6325t = -1;
        W w10 = n6.f6311d;
        if (w10 != null) {
            w10.f4567q.setValue(Boolean.TRUE);
        }
        n6.q(false);
    }

    @Override // K.g0
    public final void e(long j) {
        N n6 = this.f6302a;
        long jH = p171r0.c.h(n6.f6322q, j);
        n6.f6322q = jH;
        n6.f6324s.setValue(new p171r0.c(p171r0.c.h(n6.f6320o, jH)));
        Z0.y yVarK = n6.k();
        p171r0.c cVarG = n6.g();
        p251z9.j.b(cVarG);
        N.a(n6, yVarK, cVarG.f21387a, false, this.f6303b, C0447o.g, true);
        n6.q(false);
    }

    @Override // K.g0
    public final void onCancel() {
    }

    @Override // K.g0
    public final void c(long j) {
    }
}
