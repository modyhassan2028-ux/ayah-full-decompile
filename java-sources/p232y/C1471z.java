package p232y;

import B.d;
import B.e;
import B.j;
import D0.C0086d;
import F9.f;
import G.H;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0;
import J0.C0280d0;
import J0.I;
import J0.InterfaceC0289l;
import J0.InterfaceC0294q;
import J0.j0;
import J0.n0;
import J0.y0;
import J0.z0;
import K0.C0362p;
import K9.AbstractC0405x;
import K9.a0;
import K9.r;
import R0.a;
import R0.i;
import R0.s;
import R0.u;
import W.C0557f1;
import X.C0641m;
import X.L;
import l0.q;
import p162q0.t;
import p241y9.c;
import p251z9.v;

/* JADX INFO: renamed from: y.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1471z extends AbstractC0291n implements y0, InterfaceC0294q, InterfaceC0289l, n0, C0 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final D f24607O = new D(4);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j f24608H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final c f24609I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public d f24610J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public H f24611K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public j0 f24612L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f24613M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0557f1 f24614N;

    public C1471z(j jVar, int i10, E5.c cVar) {
        this.f24608H = jVar;
        this.f24609I = cVar;
        t tVar = new t(i10, new C0362p(2, this, C1471z.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 14), 4);
        v0(tVar);
        this.f24613M = tVar;
    }

    @Override // J0.n0
    public final void A() {
        v vVar = new v();
        AbstractC0283f.t(this, new C0086d(26, vVar, this));
        H h7 = (H) vVar.f24886r;
        if (this.f24613M.x0().a()) {
            H h10 = this.f24611K;
            if (h10 != null) {
                h10.b();
            }
            if (h7 != null) {
                h7.a();
            } else {
                h7 = null;
            }
            this.f24611K = h7;
        }
    }

    public final void A0(j jVar) {
        d dVar;
        if (p251z9.j.a(this.f24608H, jVar)) {
            return;
        }
        j jVar2 = this.f24608H;
        if (jVar2 != null && (dVar = this.f24610J) != null) {
            jVar2.b(new e(dVar));
        }
        this.f24610J = null;
        this.f24608H = jVar;
    }

    @Override // J0.InterfaceC0294q
    public final void H(j0 j0Var) {
        A aZ0;
        this.f24612L = j0Var;
        if (this.f24613M.x0().a()) {
            if (!j0Var.E0().f19338E) {
                A aZ1 = z0();
                if (aZ1 != null) {
                    aZ1.v0(null);
                    return;
                }
                return;
            }
            j0 j0Var2 = this.f24612L;
            if (j0Var2 == null || !j0Var2.E0().f19338E || (aZ0 = z0()) == null) {
                return;
            }
            aZ0.v0(this.f24612L);
        }
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        boolean zA = this.f24613M.x0().a();
        f[] fVarArr = u.f7181a;
        R0.v vVar = s.f7164k;
        f fVar = u.f7181a[4];
        vVar.a(jVar, Boolean.valueOf(zA));
        if (this.f24614N == null) {
            this.f24614N = new C0557f1(22, this);
        }
        jVar.e(i.f7103v, new a(null, this.f24614N));
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // J0.C0
    public final Object p() {
        return f24607O;
    }

    @Override // l0.q
    public final void p0() {
        H h7 = this.f24611K;
        if (h7 != null) {
            h7.b();
        }
        this.f24611K = null;
    }

    public final void y0(j jVar, B.i iVar) {
        if (!this.f19338E) {
            jVar.b(iVar);
            return;
        }
        a0 a0Var = (a0) ((P9.d) h0()).f6772r.i(r.f5392s);
        AbstractC0405x.x(h0(), null, new C0641m(jVar, iVar, a0Var != null ? a0Var.s(new L(24, jVar, iVar)) : null, null, 20), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final A z0() {
        C0 c10;
        C0280d0 c0280d0;
        if (this.f19338E) {
            if (!this.f19339r.f19338E) {
                G0.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.f19339r.f19343v;
            I iX = AbstractC0283f.x(this);
            loop0: while (true) {
                if (iX == null) {
                    c10 = null;
                    break;
                }
                if ((((q) iX.f3914W.f4067f).f19342u & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.f19341t & 262144) != 0) {
                            ?? F10 = qVar;
                            ?? eVar = 0;
                            while (F10 != 0) {
                                if (F10 instanceof C0) {
                                    c10 = (C0) F10;
                                    if (A.f24409G.equals(c10.p())) {
                                        break loop0;
                                    }
                                } else if ((F10.f19341t & 262144) != 0 && (F10 instanceof AbstractC0291n)) {
                                    q qVar2 = ((AbstractC0291n) F10).f4151G;
                                    int i10 = 0;
                                    F10 = F10;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.f19341t & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                eVar = eVar;
                                                F10 = qVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p011b0.e(new q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.f19344w;
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar = qVar.f19343v;
                    }
                }
                iX = iX.u();
                qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
            if (c10 instanceof A) {
                return (A) c10;
            }
        }
        return null;
    }
}
