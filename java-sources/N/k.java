package N;

import A.C0041r0;
import D.C0082z;
import H0.AbstractC0204c;
import H0.H;
import H0.J;
import H0.K;
import H0.U;
import J0.AbstractC0283f;
import J0.InterfaceC0293p;
import J0.InterfaceC0302z;
import J0.P;
import J0.y0;
import K.T;
import R0.s;
import R0.u;
import R0.v;
import U0.C;
import U0.C0509a;
import U0.C0515g;
import U0.L;
import U0.t;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.HashMap;
import l0.q;
import p055f1.l;
import p063g1.m;
import p180s0.F;
import p180s0.I;
import p180s0.o;
import p180s0.r;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q implements InterfaceC0302z, InterfaceC0293p, y0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f5950F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public L f5951G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Y0.d f5952H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f5953I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5954J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f5955K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f5956L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public r f5957M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public HashMap f5958N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public e f5959O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public j f5960P;
    public i Q;

    @Override // J0.y0
    public final void L(R0.j jVar) {
        j jVar2 = this.f5960P;
        if (jVar2 == null) {
            jVar2 = new j(this, 0);
            this.f5960P = jVar2;
        }
        C0515g c0515g = new C0515g(this.f5950F);
        F9.f[] fVarArr = u.f7181a;
        jVar.e(s.f7179z, AbstractC0813f2.K(c0515g));
        i iVar = this.Q;
        if (iVar != null) {
            boolean z10 = iVar.f5946c;
            v vVar = s.f7144B;
            F9.f[] fVarArr2 = u.f7181a;
            F9.f fVar = fVarArr2[15];
            vVar.a(jVar, Boolean.valueOf(z10));
            C0515g c0515g2 = new C0515g(iVar.f5945b);
            v vVar2 = s.f7143A;
            F9.f fVar2 = fVarArr2[14];
            vVar2.a(jVar, c0515g2);
        }
        jVar.e(R0.i.f7092k, new R0.a(null, new j(this, 1)));
        jVar.e(R0.i.f7093l, new R0.a(null, new j(this, 2)));
        jVar.e(R0.i.f7094m, new R0.a(null, new C0041r0(21, this)));
        u.c(jVar, jVar2);
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // J0.InterfaceC0302z
    public final int a(P p10, H h7, int i10) {
        e eVarV0;
        i iVar = this.Q;
        if (iVar == null) {
            eVarV0 = v0();
        } else {
            if (!iVar.f5946c) {
                iVar = null;
            }
            if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                eVarV0 = v0();
            }
        }
        eVarV0.c(p10);
        return T.p(eVarV0.d(p10.getLayoutDirection()).h());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // J0.InterfaceC0302z
    public final int c(P p10, H h7, int i10) {
        e eVarV0;
        i iVar = this.Q;
        if (iVar == null) {
            eVarV0 = v0();
        } else {
            if (!iVar.f5946c) {
                iVar = null;
            }
            if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                eVarV0 = v0();
            }
        }
        eVarV0.c(p10);
        return eVarV0.a(i10, p10.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // J0.InterfaceC0302z
    public final int d(P p10, H h7, int i10) {
        e eVarV0;
        i iVar = this.Q;
        if (iVar == null) {
            eVarV0 = v0();
        } else {
            if (!iVar.f5946c) {
                iVar = null;
            }
            if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                eVarV0 = v0();
            }
        }
        eVarV0.c(p10);
        return T.p(eVarV0.d(p10.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        e eVarV0;
        t tVar;
        long j10;
        boolean z10;
        t tVar2;
        V0.r rVar;
        HashMap map;
        i iVar = this.Q;
        if (iVar == null) {
            eVarV0 = v0();
        } else {
            if (!iVar.f5946c) {
                iVar = null;
            }
            if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                eVarV0 = v0();
            }
        }
        eVarV0.c(k7);
        m layoutDirection = k7.getLayoutDirection();
        long jE = eVarV0.g > 1 ? e.e(eVarV0, j, layoutDirection) : j;
        C0509a c0509a = eVarV0.j;
        if (c0509a != null && (tVar = eVarV0.f5922n) != null && !tVar.c() && layoutDirection == eVarV0.f5923o) {
            if (!p063g1.a.b(jE, eVarV0.f5924p)) {
                j10 = 4294967295L;
                if (p063g1.a.h(jE) == p063g1.a.h(eVarV0.f5924p) && p063g1.a.j(jE) == p063g1.a.j(eVarV0.f5924p) && p063g1.a.g(jE) >= c0509a.b() && !c0509a.f8045d.f8387d) {
                }
                tVar2 = eVarV0.f5922n;
                if (tVar2 != null) {
                    tVar2.c();
                }
                C0509a c0509a2 = eVarV0.j;
                p251z9.j.b(c0509a2);
                rVar = c0509a2.f8045d;
                long j11 = eVarV0.f5920l;
                if (z10) {
                    AbstractC0283f.v(this, 2).L0();
                    map = this.f5958N;
                    if (map == null) {
                        map = new HashMap(2);
                        this.f5958N = map;
                    }
                    map.put(AbstractC0204c.f3185a, Integer.valueOf(Math.round(rVar.d(0))));
                    map.put(AbstractC0204c.f3186b, Integer.valueOf(Math.round(rVar.d(rVar.g - 1))));
                }
                int i10 = (int) (j11 >> 32);
                int i11 = (int) (j11 & j10);
                U uA = h7.a(AbstractC0813f2.A(i10, i10, i11, i11));
                HashMap map2 = this.f5958N;
                p251z9.j.b(map2);
                return k7.g0(i10, i11, map2, new C0082z(uA, 8));
            }
            j10 = 4294967295L;
            if (!p063g1.a.b(jE, eVarV0.f5924p)) {
                C0509a c0509a3 = eVarV0.j;
                p251z9.j.b(c0509a3);
                long jD = p063g1.b.d(jE, (((long) T.p(c0509a3.b())) & j10) | (((long) T.p(Math.min(c0509a3.f8042a.f13425i.c(), c0509a3.d()))) << 32));
                eVarV0.f5920l = jD;
                eVarV0.f5919k = eVarV0.f5914d != 3 && (((float) ((int) (jD >> 32))) < c0509a3.d() || ((float) ((int) (jD & j10))) < c0509a3.b());
                eVarV0.f5924p = jE;
            }
            z10 = false;
            tVar2 = eVarV0.f5922n;
            if (tVar2 != null) {
                tVar2.c();
            }
            C0509a c0509a4 = eVarV0.j;
            p251z9.j.b(c0509a4);
            rVar = c0509a4.f8045d;
            long j12 = eVarV0.f5920l;
            if (z10) {
                AbstractC0283f.v(this, 2).L0();
                map = this.f5958N;
                if (map == null) {
                    map = new HashMap(2);
                    this.f5958N = map;
                }
                map.put(AbstractC0204c.f3185a, Integer.valueOf(Math.round(rVar.d(0))));
                map.put(AbstractC0204c.f3186b, Integer.valueOf(Math.round(rVar.d(rVar.g - 1))));
            }
            int i12 = (int) (j12 >> 32);
            int i13 = (int) (j12 & j10);
            U uA2 = h7.a(AbstractC0813f2.A(i12, i12, i13, i13));
            HashMap map3 = this.f5958N;
            p251z9.j.b(map3);
            return k7.g0(i12, i13, map3, new C0082z(uA2, 8));
        }
        j10 = 4294967295L;
        t tVarD = eVarV0.d(layoutDirection);
        long jX = B0.c.x(jE, eVarV0.f5915e, eVarV0.f5914d, tVarD.h());
        boolean z11 = eVarV0.f5915e;
        int i14 = eVarV0.f5914d;
        int i15 = eVarV0.f5916f;
        C0509a c0509a5 = new C0509a((p022c1.c) tVarD, ((z11 || !(i14 == 2 || i14 == 4 || i14 == 5)) && i15 >= 1) ? i15 : 1, i14, jX);
        eVarV0.f5924p = jE;
        long jD2 = p063g1.b.d(jE, (((long) T.p(c0509a5.b())) & j10) | (((long) T.p(c0509a5.d())) << 32));
        eVarV0.f5920l = jD2;
        eVarV0.f5919k = eVarV0.f5914d != 3 && (((float) ((int) (jD2 >> 32))) < c0509a5.d() || ((float) ((int) (jD2 & j10))) < c0509a5.b());
        eVarV0.j = c0509a5;
        z10 = true;
        tVar2 = eVarV0.f5922n;
        if (tVar2 != null) {
            tVar2.c();
        }
        C0509a c0509a6 = eVarV0.j;
        p251z9.j.b(c0509a6);
        rVar = c0509a6.f8045d;
        long j13 = eVarV0.f5920l;
        if (z10) {
            AbstractC0283f.v(this, 2).L0();
            map = this.f5958N;
            if (map == null) {
                map = new HashMap(2);
                this.f5958N = map;
            }
            map.put(AbstractC0204c.f3185a, Integer.valueOf(Math.round(rVar.d(0))));
            map.put(AbstractC0204c.f3186b, Integer.valueOf(Math.round(rVar.d(rVar.g - 1))));
        }
        int i16 = (int) (j13 >> 32);
        int i17 = (int) (j13 & j10);
        U uA3 = h7.a(AbstractC0813f2.A(i16, i16, i17, i17));
        HashMap map4 = this.f5958N;
        p251z9.j.b(map4);
        return k7.g0(i16, i17, map4, new C0082z(uA3, 8));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // J0.InterfaceC0302z
    public final int f(P p10, H h7, int i10) {
        e eVarV0;
        i iVar = this.Q;
        if (iVar == null) {
            eVarV0 = v0();
        } else {
            if (!iVar.f5946c) {
                iVar = null;
            }
            if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                eVarV0 = v0();
            }
        }
        eVarV0.c(p10);
        return eVarV0.a(i10, p10.getLayoutDirection());
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // J0.InterfaceC0293p
    public final void r(J0.K k7) {
        e eVarV0;
        if (this.f19338E) {
            i iVar = this.Q;
            if (iVar == null) {
                eVarV0 = v0();
            } else {
                if (!iVar.f5946c) {
                    iVar = null;
                }
                if (iVar == null || (eVarV0 = iVar.f5947d) == null) {
                    eVarV0 = v0();
                }
            }
            C0509a c0509a = eVarV0.j;
            if (c0509a == null) {
                C.a.b("no paragraph (layoutCache=" + this.f5959O + ", textSubstitution=" + this.Q + ')');
                throw new A6.a();
            }
            o oVarP = k7.f3942r.f22795s.p();
            boolean z10 = eVarV0.f5919k;
            if (z10) {
                long j = eVarV0.f5920l;
                oVarP.q();
                oVarP.l(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                C c10 = this.f5951G.f8037a;
                l lVar = c10.f8004m;
                if (lVar == null) {
                    lVar = l.f15913b;
                }
                l lVar2 = lVar;
                I i10 = c10.f8005n;
                if (i10 == null) {
                    i10 = I.f21798d;
                }
                I i11 = i10;
                p196u0.c cVar = c10.f8006o;
                if (cVar == null) {
                    cVar = p196u0.f.f22800b;
                }
                p196u0.c cVar2 = cVar;
                F fE = c10.f7994a.e();
                if (fE != null) {
                    c0509a.g(oVarP, fE, this.f5951G.f8037a.f7994a.c(), i11, lVar2, cVar2);
                } else {
                    r rVar = this.f5957M;
                    long jA = rVar != null ? rVar.a() : p180s0.q.g;
                    if (jA == 16) {
                        jA = this.f5951G.b() != 16 ? this.f5951G.b() : p180s0.q.f21839b;
                    }
                    c0509a.f(oVarP, jA, i11, lVar2, cVar2);
                }
            } finally {
                if (z10) {
                    oVarP.n();
                }
            }
        }
    }

    public final e v0() {
        if (this.f5959O == null) {
            this.f5959O = new e(this.f5950F, this.f5951G, this.f5952H, this.f5953I, this.f5954J, this.f5955K, this.f5956L);
        }
        e eVar = this.f5959O;
        p251z9.j.b(eVar);
        return eVar;
    }
}
