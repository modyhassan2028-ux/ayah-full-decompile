package O;

import K.W;
import K.g0;
import K.t0;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class I implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f6298b;

    public /* synthetic */ I(N n6, int i10) {
        this.f6297a = i10;
        this.f6298b = n6;
    }

    @Override // K.g0
    public final void a() {
        switch (this.f6297a) {
            case 0:
                N n6 = this.f6298b;
                n6.f6323r.setValue(null);
                n6.f6324s.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // K.g0
    public final void b() {
        switch (this.f6297a) {
            case 0:
                N n6 = this.f6298b;
                n6.f6323r.setValue(null);
                n6.f6324s.setValue(null);
                break;
        }
    }

    @Override // K.g0
    public final void c(long j) {
        t0 t0VarD;
        N n6;
        long j10;
        t0 t0VarD2;
        t0 t0VarD3;
        switch (this.f6297a) {
            case 0:
                N n10 = this.f6298b;
                long jA = y.a(n10.j(true));
                W w9 = n10.f6311d;
                if (w9 != null && (t0VarD = w9.d()) != null) {
                    long jE = t0VarD.e(jA);
                    n10.f6320o = jE;
                    n10.f6324s.setValue(new p171r0.c(jE));
                    n10.f6322q = 0L;
                    n10.f6323r.setValue(K.K.f4480r);
                    n10.q(false);
                    break;
                }
                break;
            default:
                N n11 = this.f6298b;
                C0681f0 c0681f0 = n11.f6323r;
                if (n11.i() && ((K.K) c0681f0.getValue()) == null) {
                    c0681f0.setValue(K.K.f4482t);
                    n11.f6325t = -1;
                    n11.l();
                    W w10 = n11.f6311d;
                    if (w10 == null || (t0VarD3 = w10.d()) == null || !t0VarD3.c(j)) {
                        n6 = n11;
                        j10 = j;
                        W w11 = n6.f6311d;
                        if (w11 != null && (t0VarD2 = w11.d()) != null) {
                            int iA = n6.f6309b.a(t0VarD2.b(j10, true));
                            Z0.y yVarC = N.c(n6.k().f10953a, va.g.e(iA, iA));
                            n6.f(false);
                            p243z0.a aVar = n6.f6316k;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            n6.f6310c.e(yVarC);
                        }
                    } else if (n11.k().f10953a.f8060s.length() != 0) {
                        n11.f(false);
                        n6 = n11;
                        j10 = j;
                        n6.f6321p = Integer.valueOf((int) (N.a(n11, Z0.y.a(n11.k(), null, U0.K.f8033b, 5), j, true, false, C0447o.f6392e, true) >> 32));
                    }
                    n6.o(K.L.f4484r);
                    n6.f6320o = j10;
                    n6.f6324s.setValue(new p171r0.c(j10));
                    n6.f6322q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // K.g0
    public final void d() {
        int i10 = this.f6297a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    @Override // K.g0
    public final void e(long j) {
        t0 t0VarD;
        p243z0.a aVar;
        t0 t0VarD2;
        Integer num;
        int iB;
        switch (this.f6297a) {
            case 0:
                N n6 = this.f6298b;
                n6.f6322q = p171r0.c.h(n6.f6322q, j);
                W w9 = n6.f6311d;
                if (w9 != null && (t0VarD = w9.d()) != null) {
                    n6.f6324s.setValue(new p171r0.c(p171r0.c.h(n6.f6320o, n6.f6322q)));
                    Z0.s sVar = n6.f6309b;
                    p171r0.c cVarG = n6.g();
                    p251z9.j.b(cVarG);
                    int iA = sVar.a(t0VarD.b(cVarG.f21387a, true));
                    long jE = va.g.e(iA, iA);
                    if (!U0.K.a(jE, n6.k().f10954b)) {
                        W w10 = n6.f6311d;
                        if ((w10 == null || ((Boolean) w10.f4567q.getValue()).booleanValue()) && (aVar = n6.f6316k) != null) {
                            aVar.a(9);
                        }
                        n6.f6310c.e(N.c(n6.k().f10953a, jE));
                        break;
                    }
                }
                break;
            default:
                J1.c cVar = C0447o.f6392e;
                N n10 = this.f6298b;
                if (n10.i() && n10.k().f10953a.f8060s.length() != 0) {
                    n10.f6322q = p171r0.c.h(n10.f6322q, j);
                    W w11 = n10.f6311d;
                    if (w11 != null && (t0VarD2 = w11.d()) != null) {
                        n10.f6324s.setValue(new p171r0.c(p171r0.c.h(n10.f6320o, n10.f6322q)));
                        if (n10.f6321p == null) {
                            p171r0.c cVarG2 = n10.g();
                            p251z9.j.b(cVarG2);
                            if (t0VarD2.c(cVarG2.f21387a)) {
                                num = n10.f6321p;
                                if (num != null) {
                                    iB = num.intValue();
                                } else {
                                    iB = t0VarD2.b(n10.f6320o, false);
                                }
                                p171r0.c cVarG3 = n10.g();
                                p251z9.j.b(cVarG3);
                                int iB2 = t0VarD2.b(cVarG3.f21387a, false);
                                if (n10.f6321p == null || iB != iB2) {
                                    Z0.y yVarK = n10.k();
                                    p171r0.c cVarG4 = n10.g();
                                    p251z9.j.b(cVarG4);
                                    N.a(n10, yVarK, cVarG4.f21387a, false, false, cVar, true);
                                }
                            } else {
                                int iA2 = n10.f6309b.a(t0VarD2.b(n10.f6320o, true));
                                Z0.s sVar2 = n10.f6309b;
                                p171r0.c cVarG5 = n10.g();
                                p251z9.j.b(cVarG5);
                                if (iA2 == sVar2.a(t0VarD2.b(cVarG5.f21387a, true))) {
                                    cVar = C0447o.f6391d;
                                }
                                Z0.y yVarK2 = n10.k();
                                p171r0.c cVarG6 = n10.g();
                                p251z9.j.b(cVarG6);
                                N.a(n10, yVarK2, cVarG6.f21387a, false, false, cVar, true);
                            }
                        } else {
                            num = n10.f6321p;
                            if (num != null) {
                                iB = num.intValue();
                            } else {
                                iB = t0VarD2.b(n10.f6320o, false);
                            }
                            p171r0.c cVarG7 = n10.g();
                            p251z9.j.b(cVarG7);
                            int iB3 = t0VarD2.b(cVarG7.f21387a, false);
                            if (n10.f6321p == null) {
                            }
                            Z0.y yVarK3 = n10.k();
                            p171r0.c cVarG8 = n10.g();
                            p251z9.j.b(cVarG8);
                            N.a(n10, yVarK3, cVarG8.f21387a, false, false, cVar, true);
                        }
                        int i10 = U0.K.f8034c;
                    }
                    n10.q(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        N n6 = this.f6298b;
        n6.f6323r.setValue(null);
        n6.f6324s.setValue(null);
        n6.q(true);
        n6.f6321p = null;
        boolean zB = U0.K.b(n6.k().f10954b);
        n6.o(zB ? K.L.f4486t : K.L.f4485s);
        W w9 = n6.f6311d;
        if (w9 != null) {
            w9.f4563m.setValue(Boolean.valueOf(!zB && p050e8.b.I(n6, true)));
        }
        W w10 = n6.f6311d;
        if (w10 != null) {
            w10.f4564n.setValue(Boolean.valueOf(!zB && p050e8.b.I(n6, false)));
        }
        W w11 = n6.f6311d;
        if (w11 == null) {
            return;
        }
        w11.f4565o.setValue(Boolean.valueOf(zB && p050e8.b.I(n6, true)));
    }

    @Override // K.g0
    public final void onCancel() {
        switch (this.f6297a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
