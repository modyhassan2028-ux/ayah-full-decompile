package p162q0;

import A0.c;
import D0.C0086d;
import I0.b;
import I0.d;
import I0.f;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.I;
import J0.InterfaceC0289l;
import J0.InterfaceC0290m;
import J0.n0;
import J0.z0;
import K0.AbstractC0359n0;
import android.os.Trace;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import l0.q;
import p241y9.e;
import p245z2.a;
import p251z9.j;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q implements InterfaceC0289l, n0, d, InterfaceC0290m {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final e f21233F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f21234G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f21235H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f21236I;

    public t(int i10, e eVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        this.f21233F = (i11 & 2) != 0 ? null : eVar;
        this.f21236I = i10;
    }

    @Override // J0.n0
    public final void A() {
        y0();
    }

    @Override // I0.e
    public final /* synthetic */ Object Z(f fVar) {
        return a.b(this, fVar);
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // I0.d
    public final /* synthetic */ AbstractC0813f2 j() {
        return b.f3654s;
    }

    @Override // l0.q
    public final void n0() {
        int iOrdinal = x0().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            k kVar = (k) AbstractC0283f.y(this).getFocusOwner();
            kVar.b(8, true, false);
            g gVar = kVar.g;
            if (gVar.f21198f) {
                return;
            }
            gVar.f21193a.e(new F2.t(0, gVar, g.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 19));
            gVar.f21198f = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void v0(s sVar, s sVar2) {
        C0280d0 c0280d0;
        e eVar;
        k kVar = (k) AbstractC0283f.y(this).getFocusOwner();
        t tVar = kVar.f21209l;
        if (!sVar.equals(sVar2) && (eVar = this.f21233F) != null) {
            eVar.invoke(sVar, sVar2);
        }
        q qVar = this.f19339r;
        if (!qVar.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = this.f19339r;
        I iX = AbstractC0283f.x(this);
        while (iX != null) {
            if ((((q) iX.f3914W.f4067f).f19342u & 5120) != 0) {
                while (qVar2 != null) {
                    int i10 = qVar2.f19341t;
                    if ((i10 & 5120) != 0) {
                        if (qVar2 != qVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? F10 = qVar2;
                            ?? eVar2 = 0;
                            while (F10 != 0) {
                                if (F10 instanceof e) {
                                    e eVar3 = (e) F10;
                                    if (tVar == kVar.f21209l) {
                                        eVar3.D(sVar2);
                                    }
                                } else if ((F10.f19341t & 4096) != 0 && (F10 instanceof AbstractC0291n)) {
                                    q qVar3 = ((AbstractC0291n) F10).f4151G;
                                    int i11 = 0;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                    while (qVar3 != null) {
                                        if ((qVar3.f19341t & 4096) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                eVar2 = eVar2;
                                                F10 = qVar3;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p011b0.e(new q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar2.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar2.b(qVar3);
                                            }
                                        }
                                        qVar3 = qVar3.f19344w;
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar2);
                            }
                        }
                    }
                    qVar2 = qVar2.f19343v;
                }
            }
            iX = iX.u();
            qVar2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final n w0() {
        boolean z10;
        C0280d0 c0280d0;
        n nVar = new n();
        nVar.f21214a = true;
        p pVar = p.f21223b;
        nVar.f21215b = pVar;
        nVar.f21216c = pVar;
        nVar.f21217d = pVar;
        nVar.f21218e = pVar;
        nVar.f21219f = pVar;
        nVar.g = pVar;
        nVar.f21220h = pVar;
        nVar.f21221i = pVar;
        nVar.j = m.f21210s;
        nVar.f21222k = m.f21211t;
        int i10 = this.f21236I;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((A0.a) ((c) ((A0.b) AbstractC0283f.i(this, AbstractC0359n0.f5122m))).f459a.getValue()).f458a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        nVar.f21214a = z10;
        q qVar = this.f19339r;
        if (!qVar.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = this.f19339r;
        I iX = AbstractC0283f.x(this);
        loop0: while (iX != null) {
            if ((((q) iX.f3914W.f4067f).f19342u & 3072) != 0) {
                while (qVar2 != null) {
                    int i11 = qVar2.f19341t;
                    if ((i11 & 3072) != 0) {
                        if (qVar2 != qVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            ?? F10 = qVar2;
                            ?? eVar = 0;
                            while (F10 != 0) {
                                if (F10 instanceof o) {
                                    ((o) F10).N(nVar);
                                } else if ((F10.f19341t & 2048) != 0 && (F10 instanceof AbstractC0291n)) {
                                    q qVar3 = ((AbstractC0291n) F10).f4151G;
                                    int i12 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.f19341t & 2048) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                F10 = F10;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F10 = qVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p011b0.e(new q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        } else {
                                            F10 = F10;
                                            eVar = eVar;
                                        }
                                        qVar3 = qVar3.f19344w;
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                        F10 = F10;
                                        eVar = eVar;
                                    } else {
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar);
                            }
                        }
                    }
                    qVar2 = qVar2.f19343v;
                }
            }
            iX = iX.u();
            qVar2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
        }
        return nVar;
    }

    public final s x0() {
        k kVar;
        t tVar;
        C0280d0 c0280d0;
        boolean z10 = this.f19338E;
        s sVar = s.f21231u;
        if (!z10 || (tVar = (kVar = (k) AbstractC0283f.y(this).getFocusOwner()).f21209l) == null) {
            return sVar;
        }
        if (this == tVar) {
            kVar.getClass();
            return s.f21228r;
        }
        if (tVar.f19338E) {
            if (!tVar.f19339r.f19338E) {
                G0.a.b("visitAncestors called on an unattached node");
            }
            q qVar = tVar.f19339r.f19343v;
            I iX = AbstractC0283f.x(tVar);
            while (iX != null) {
                if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f19341t & 1024) != 0) {
                            q qVarF = qVar;
                            p011b0.e eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    if (this == ((t) qVarF)) {
                                        return s.f21229s;
                                    }
                                } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i10 = 0;
                                    for (q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                        if ((qVar2.f19341t & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p011b0.e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar = qVar.f19343v;
                    }
                }
                iX = iX.u();
                qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
        }
        return sVar;
    }

    public final void y0() {
        int iOrdinal = x0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            v vVar = new v();
            AbstractC0283f.t(this, new C0086d(23, vVar, this));
            Object obj = vVar.f24886r;
            if (obj == null) {
                j.k("focusProperties");
                throw null;
            }
            if (((l) obj).b()) {
                return;
            }
            ((k) AbstractC0283f.y(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean z0(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zW = false;
            if (!w0().f21214a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = f.v(this, i10).ordinal();
            if (iOrdinal == 0) {
                zW = f.w(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zW = true;
                } else if (iOrdinal != 3) {
                    throw new A6.a();
                }
            }
            Trace.endSection();
            return zW;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // l0.q
    public final void l0() {
    }
}
