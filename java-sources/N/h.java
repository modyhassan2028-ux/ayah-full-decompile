package N;

import A.C0041r0;
import D.C0082z;
import F9.n;
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
import U0.C0515g;
import U0.I;
import U0.L;
import U0.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l0.q;
import p055f1.l;
import p063g1.m;
import p180s0.F;
import p180s0.o;
import p180s0.r;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q implements InterfaceC0302z, InterfaceC0293p, y0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0515g f5933F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public L f5934G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Y0.d f5935H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p241y9.c f5936I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f5937J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f5938K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f5939L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5940M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public List f5941N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public p241y9.c f5942O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public r f5943P;
    public p241y9.c Q;
    public Map R;
    public d S;
    public g T;
    public f U;

    @Override // J0.y0
    public final void L(R0.j jVar) {
        g gVar = this.T;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.T = gVar;
        }
        C0515g c0515g = this.f5933F;
        F9.f[] fVarArr = u.f7181a;
        jVar.e(s.f7179z, AbstractC0813f2.K(c0515g));
        f fVar = this.U;
        if (fVar != null) {
            C0515g c0515g2 = fVar.f5928b;
            v vVar = s.f7143A;
            F9.f[] fVarArr2 = u.f7181a;
            F9.f fVar2 = fVarArr2[14];
            vVar.a(jVar, c0515g2);
            boolean z10 = fVar.f5929c;
            v vVar2 = s.f7144B;
            F9.f fVar3 = fVarArr2[15];
            vVar2.a(jVar, Boolean.valueOf(z10));
        }
        jVar.e(R0.i.f7092k, new R0.a(null, new g(this, 1)));
        jVar.e(R0.i.f7093l, new R0.a(null, new g(this, 2)));
        jVar.e(R0.i.f7094m, new R0.a(null, new C0041r0(20, this)));
        u.c(jVar, gVar);
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

    @Override // J0.InterfaceC0302z
    public final int a(P p10, H h7, int i10) {
        return T.p(w0(p10).d(p10.getLayoutDirection()).h());
    }

    @Override // J0.InterfaceC0302z
    public final int c(P p10, H h7, int i10) {
        return w0(p10).a(i10, p10.getLayoutDirection());
    }

    @Override // J0.InterfaceC0302z
    public final int d(P p10, H h7, int i10) {
        return T.p(w0(p10).d(p10.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        d dVarW0 = w0(k7);
        m layoutDirection = k7.getLayoutDirection();
        boolean z10 = true;
        if (dVarW0.f5902f > 1) {
            b bVar = dVarW0.f5903h;
            L l10 = dVarW0.f5905k;
            p063g1.c cVar = dVarW0.j;
            p251z9.j.b(cVar);
            b bVarW = B9.a.w(bVar, layoutDirection, l10, cVar, dVarW0.f5898b);
            dVarW0.f5903h = bVarW;
            j = bVarW.a(j, dVarW0.f5902f);
        }
        I i10 = dVarW0.f5908n;
        if (i10 == null) {
            dVarW0.f5908n = dVarW0.e(layoutDirection, j, dVarW0.b(j, layoutDirection));
        } else {
            p pVar = i10.f8024b;
            U0.H h10 = i10.f8023a;
            if (pVar.f8106a.c()) {
                dVarW0.f5908n = dVarW0.e(layoutDirection, j, dVarW0.b(j, layoutDirection));
            } else {
                m mVar = h10.f8021h;
                long j10 = h10.j;
                if (layoutDirection == mVar && (p063g1.a.b(j, j10) || (p063g1.a.h(j) == p063g1.a.h(j10) && p063g1.a.j(j) == p063g1.a.j(j10) && p063g1.a.g(j) >= pVar.f8110e && !pVar.f8108c))) {
                    I i11 = dVarW0.f5908n;
                    p251z9.j.b(i11);
                    if (p063g1.a.b(j, i11.f8023a.j)) {
                        z10 = false;
                    } else {
                        I i12 = dVarW0.f5908n;
                        p251z9.j.b(i12);
                        dVarW0.f5908n = dVarW0.e(layoutDirection, j, i12.f8024b);
                    }
                } else {
                    dVarW0.f5908n = dVarW0.e(layoutDirection, j, dVarW0.b(j, layoutDirection));
                }
            }
        }
        I i13 = dVarW0.f5908n;
        if (i13 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        long j11 = i13.f8025c;
        i13.f8024b.f8106a.c();
        if (z10) {
            AbstractC0283f.v(this, 2).L0();
            p241y9.c cVar2 = this.f5936I;
            if (cVar2 != null) {
                cVar2.e(i13);
            }
            Map linkedHashMap = this.R;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AbstractC0204c.f3185a, Integer.valueOf(Math.round(i13.f8026d)));
            linkedHashMap.put(AbstractC0204c.f3186b, Integer.valueOf(Math.round(i13.f8027e)));
            this.R = linkedHashMap;
        }
        p241y9.c cVar3 = this.f5942O;
        if (cVar3 != null) {
            cVar3.e(i13.f8028f);
        }
        int i14 = (int) (j11 >> 32);
        int i15 = (int) (j11 & 4294967295L);
        U uA = h7.a(AbstractC0813f2.A(i14, i14, i15, i15));
        Map map = this.R;
        p251z9.j.b(map);
        return k7.g0(i14, i15, map, new C0082z(uA, 7));
    }

    @Override // J0.InterfaceC0302z
    public final int f(P p10, H h7, int i10) {
        return w0(p10).a(i10, p10.getLayoutDirection());
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // J0.InterfaceC0293p
    public final void r(J0.K k7) {
        if (this.f19338E) {
            o oVarP = k7.f3942r.f22795s.p();
            I i10 = w0(k7).f5908n;
            if (i10 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            p pVar = i10.f8024b;
            long j = i10.f8025c;
            boolean z10 = true;
            boolean z11 = (((float) ((int) (j >> 32))) < pVar.f8109d || pVar.f8108c || ((float) ((int) (j & 4294967295L))) < pVar.f8110e) && this.f5937J != 3;
            if (z11) {
                p171r0.e eVarD = p171r0.f.d(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))));
                oVarP.q();
                oVarP.a(eVarD);
            }
            try {
                C c10 = this.f5934G.f8037a;
                l lVar = c10.f8004m;
                if (lVar == null) {
                    lVar = l.f15913b;
                }
                l lVar2 = lVar;
                p180s0.I i11 = c10.f8005n;
                if (i11 == null) {
                    i11 = p180s0.I.f21798d;
                }
                p180s0.I i12 = i11;
                p196u0.c cVar = c10.f8006o;
                if (cVar == null) {
                    cVar = p196u0.f.f22800b;
                }
                p196u0.c cVar2 = cVar;
                F fE = c10.f7994a.e();
                if (fE != null) {
                    p.j(pVar, oVarP, fE, this.f5934G.f8037a.f7994a.c(), i12, lVar2, cVar2);
                } else {
                    r rVar = this.f5943P;
                    long jA = rVar != null ? rVar.a() : p180s0.q.g;
                    if (jA == 16) {
                        jA = this.f5934G.b() != 16 ? this.f5934G.b() : p180s0.q.f21839b;
                    }
                    p.i(pVar, oVarP, jA, i12, lVar2, cVar2);
                }
                if (z11) {
                    oVarP.n();
                }
                f fVar = this.U;
                if (!((fVar == null || !fVar.f5929c) ? n.D(this.f5933F) : false)) {
                    List list = this.f5941N;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                k7.a();
            } catch (Throwable th) {
                if (!z11) {
                    throw th;
                }
                oVarP.n();
                throw th;
            }
        }
    }

    public final d v0() {
        if (this.S == null) {
            this.S = new d(this.f5933F, this.f5934G, this.f5935H, this.f5937J, this.f5938K, this.f5939L, this.f5940M, this.f5941N);
        }
        d dVar = this.S;
        p251z9.j.b(dVar);
        return dVar;
    }

    public final d w0(p063g1.c cVar) {
        d dVar;
        f fVar = this.U;
        if (fVar != null && fVar.f5929c && (dVar = fVar.f5930d) != null) {
            dVar.c(cVar);
            return dVar;
        }
        d dVarV0 = v0();
        dVarV0.c(cVar);
        return dVarV0;
    }
}
