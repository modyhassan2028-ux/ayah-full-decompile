package A;

import D0.C0096n;
import D0.EnumC0097o;
import J0.AbstractC0291n;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC0291n implements J0.w0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EnumC0047u0 f141H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p251z9.k f142I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f143J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public B.j f144K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public M9.e f145L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public B.b f146M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f147N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public D0.O f148O;

    /* JADX WARN: Multi-variable type inference failed */
    public T(p241y9.c cVar, boolean z10, B.j jVar, EnumC0047u0 enumC0047u0) {
        this.f141H = enumC0047u0;
        this.f142I = (p251z9.k) cVar;
        this.f143J = z10;
        this.f144K = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A0(T t2, C0050w c0050w, q9.c cVar) throws Throwable {
        Q q10;
        if (cVar instanceof Q) {
            q10 = (Q) cVar;
            int i10 = q10.f122v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q10.f122v = i10 - Integer.MIN_VALUE;
            } else {
                q10 = new Q(t2, cVar);
            }
        } else {
            q10 = new Q(t2, cVar);
        }
        Object obj = q10.f120t;
        int i11 = q10.f122v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            B.b bVar = t2.f146M;
            if (bVar != null) {
                B.j jVar = t2.f144K;
                if (jVar != null) {
                    B.c cVar2 = new B.c(bVar);
                    q10.f118r = t2;
                    q10.f119s = c0050w;
                    q10.f122v = 1;
                    Object objA = jVar.a(cVar2, q10);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
            }
            t2.E0(c0050w.f432a);
            return p110k9.y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0050w = q10.f119s;
        t2 = q10.f118r;
        p110k9.a.e(obj);
        t2.f146M = null;
        t2.E0(c0050w.f432a);
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y0(T t2, q9.c cVar) throws Throwable {
        O o10;
        if (cVar instanceof O) {
            o10 = (O) cVar;
            int i10 = o10.f105u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o10.f105u = i10 - Integer.MIN_VALUE;
            } else {
                o10 = new O(t2, cVar);
            }
        } else {
            o10 = new O(t2, cVar);
        }
        Object obj = o10.f103s;
        int i11 = o10.f105u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            B.b bVar = t2.f146M;
            if (bVar != null) {
                B.j jVar = t2.f144K;
                if (jVar != null) {
                    B.a aVar = new B.a(bVar);
                    o10.f102r = t2;
                    o10.f105u = 1;
                    Object objA = jVar.a(aVar, o10);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                }
            }
            t2.E0(0L);
            return p110k9.y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t2 = o10.f102r;
        p110k9.a.e(obj);
        t2.f146M = null;
        t2.E0(0L);
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z0(T t2, C0048v c0048v, q9.c cVar) {
        P p10;
        B.j jVar;
        B.b bVar;
        T t10;
        B.b bVar2;
        if (cVar instanceof P) {
            p10 = (P) cVar;
            int i10 = p10.f115w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p10.f115w = i10 - Integer.MIN_VALUE;
            } else {
                p10 = new P(t2, cVar);
            }
        } else {
            p10 = new P(t2, cVar);
        }
        Object obj = p10.f113u;
        int i11 = p10.f115w;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            B.b bVar3 = t2.f146M;
            if (bVar3 != null && (jVar = t2.f144K) != null) {
                B.a aVar2 = new B.a(bVar3);
                p10.f110r = t2;
                p10.f111s = c0048v;
                p10.f115w = 1;
                if (jVar.a(aVar2, p10) != aVar) {
                }
                return aVar;
            }
            t2.f146M = bVar;
            t2.D0(c0048v.f427a);
            return p110k9.y.f19095a;
        }
        if (i11 == 1) {
            c0048v = p10.f111s;
            t2 = p10.f110r;
            p110k9.a.e(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = p10.f112t;
            c0048v = p10.f111s;
            t10 = p10.f110r;
            p110k9.a.e(obj);
        }
        bVar = bVar2;
        t2 = t10;
        t2.f146M = bVar;
        t2.D0(c0048v.f427a);
        return p110k9.y.f19095a;
        bVar = new B.b();
        B.j jVar2 = t2.f144K;
        if (jVar2 != null) {
            p10.f110r = t2;
            p10.f111s = c0048v;
            p10.f112t = bVar;
            p10.f115w = 2;
            if (jVar2.a(bVar, p10) != aVar) {
                t10 = t2;
                bVar2 = bVar;
                bVar = bVar2;
                t2 = t10;
            }
            return aVar;
        }
        t2.f146M = bVar;
        t2.D0(c0048v.f427a);
        return p110k9.y.f19095a;
    }

    public final void B0() {
        B.b bVar = this.f146M;
        if (bVar != null) {
            B.j jVar = this.f144K;
            if (jVar != null) {
                jVar.b(new B.a(bVar));
            }
            this.f146M = null;
        }
    }

    public void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        if (this.f143J && this.f148O == null) {
            N n6 = new N(0, this);
            C0096n c0096n2 = D0.I.f1055a;
            D0.O o10 = new D0.O(null, null, n6);
            v0(o10);
            this.f148O = o10;
        }
        D0.O o11 = this.f148O;
        if (o11 != null) {
            o11.C(c0096n, enumC0097o, j);
        }
    }

    public abstract Object C0(S s10, S s11);

    public abstract void D0(long j);

    public abstract void E0(long j);

    public abstract boolean F0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(p241y9.c cVar, boolean z10, B.j jVar, EnumC0047u0 enumC0047u0, boolean z11) {
        D0.O o10;
        this.f142I = (p251z9.k) cVar;
        boolean z12 = true;
        if (this.f143J != z10) {
            this.f143J = z10;
            if (!z10) {
                B0();
                D0.O o11 = this.f148O;
                if (o11 != null) {
                    w0(o11);
                }
                this.f148O = null;
            }
            z11 = true;
        }
        if (!p251z9.j.a(this.f144K, jVar)) {
            B0();
            this.f144K = jVar;
        }
        if (this.f141H != enumC0047u0) {
            this.f141H = enumC0047u0;
        } else {
            z12 = z11;
        }
        if (!z12 || (o10 = this.f148O) == null) {
            return;
        }
        o10.x0();
    }

    @Override // J0.w0
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // J0.w0
    public final void P() {
        R();
    }

    @Override // J0.w0
    public final void R() {
        D0.O o10 = this.f148O;
        if (o10 != null) {
            o10.R();
        }
    }

    @Override // J0.w0
    public final /* synthetic */ void a0() {
    }

    @Override // l0.q
    public void m0() {
        R();
    }

    @Override // l0.q
    public final void n0() {
        this.f147N = false;
        B0();
    }

    @Override // J0.w0
    public final long q() {
        return J0.A0.f3873a;
    }
}
