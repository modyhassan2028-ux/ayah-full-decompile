package K;

import H0.InterfaceC0219s;
import K0.X0;
import U0.AbstractC0517i;
import U0.C0515g;
import Z.C0672b;
import Z.C0681f0;
import Z.C0699o0;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0681f0 f4552A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f4553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0699o0 f4554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X0 f4555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L5.c f4556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z0.E f4557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0681f0 f4558f;
    public final C0681f0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0219s f4559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0681f0 f4560i;
    public C0515g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0681f0 f4561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0681f0 f4562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0681f0 f4563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0681f0 f4564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0681f0 f4565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0681f0 f4567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final android.support.v4.media.session.r f4568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f4569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f4570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p241y9.c f4571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B f4572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final B f4573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final N9.b0 f4574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4575y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0681f0 f4576z;

    public W(f0 f0Var, C0699o0 c0699o0, X0 x9) {
        this.f4553a = f0Var;
        this.f4554b = c0699o0;
        this.f4555c = x9;
        L5.c cVar = new L5.c(16, false);
        C0515g c0515g = AbstractC0517i.f8088a;
        long j = U0.K.f8033b;
        Z0.y yVar = new Z0.y(c0515g, j, (U0.K) null);
        cVar.f5532s = yVar;
        cVar.f5533t = new Z0.h(c0515g, yVar.f10954b);
        this.f4556d = cVar;
        Boolean bool = Boolean.FALSE;
        this.f4558f = C0672b.r(bool);
        this.g = C0672b.r(new p063g1.f(0));
        this.f4560i = C0672b.r(null);
        this.f4561k = C0672b.r(L.f4484r);
        this.f4562l = C0672b.r(bool);
        this.f4563m = C0672b.r(bool);
        this.f4564n = C0672b.r(bool);
        this.f4565o = C0672b.r(bool);
        this.f4566p = true;
        this.f4567q = C0672b.r(Boolean.TRUE);
        this.f4568r = new android.support.v4.media.session.r(x9);
        this.f4569s = C0672b.r(bool);
        this.f4570t = C0672b.r(bool);
        this.f4571u = C0317k.f4672w;
        this.f4572v = new B(this, 3);
        this.f4573w = new B(this, 2);
        this.f4574x = p180s0.F.g();
        this.f4575y = p180s0.q.g;
        this.f4576z = C0672b.r(new U0.K(j));
        this.f4552A = C0672b.r(new U0.K(j));
    }

    public final L a() {
        return (L) this.f4561k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f4558f.getValue()).booleanValue();
    }

    public final InterfaceC0219s c() {
        InterfaceC0219s interfaceC0219s = this.f4559h;
        if (interfaceC0219s == null || !interfaceC0219s.C()) {
            return null;
        }
        return interfaceC0219s;
    }

    public final t0 d() {
        return (t0) this.f4560i.getValue();
    }

    public final void e(long j) {
        this.f4552A.setValue(new U0.K(j));
    }

    public final void f(long j) {
        this.f4576z.setValue(new U0.K(j));
    }
}
