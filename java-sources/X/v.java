package X;

import A.C0023i;
import A.EnumC0047u0;
import D0.C0086d;
import H0.U;
import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public s f9788F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p241y9.e f9789G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EnumC0047u0 f9790H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9791I;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        U uA = h7.a(j);
        if (!k7.t() || !this.f9791I) {
            p110k9.j jVar = (p110k9.j) this.f9789G.invoke(new p063g1.l((((long) uA.f3169s) & 4294967295L) | (((long) uA.f3168r) << 32)), new p063g1.a(j));
            s sVar = this.f9788F;
            F f3 = (F) jVar.f19077r;
            Object obj = jVar.f19078s;
            if (!p251z9.j.a(sVar.d(), f3)) {
                sVar.f9784l.setValue(f3);
                A a9 = sVar.f9779e;
                C0086d c0086d = new C0086d(20, sVar, obj);
                S9.c cVar = a9.f9684b;
                boolean zG = cVar.g();
                if (zG) {
                    try {
                        c0086d.invoke();
                        cVar.b(null);
                    } catch (Throwable th) {
                        cVar.b(null);
                        throw th;
                    }
                }
                if (!zG) {
                    sVar.h(obj);
                }
            }
        }
        this.f9791I = k7.t() || this.f9791I;
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0023i(k7, this, uA, 14));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }

    @Override // l0.q
    public final void n0() {
        this.f9791I = false;
    }
}
