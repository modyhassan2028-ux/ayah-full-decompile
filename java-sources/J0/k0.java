package J0;

import G.C0171e;
import H0.InterfaceC0221u;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u.z f4143a;

    static {
        u.z zVar = u.J.f22695a;
        f4143a = new u.z();
    }

    public static final void a(l0.q qVar, int i10, int i11) {
        if (!(qVar instanceof AbstractC0291n)) {
            b(qVar, i10 & qVar.f19341t, i11);
            return;
        }
        AbstractC0291n abstractC0291n = (AbstractC0291n) qVar;
        int i12 = abstractC0291n.f4150F;
        b(qVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (l0.q qVar2 = abstractC0291n.f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
            a(qVar2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l0.q qVar, int i10, int i11) {
        if (i11 != 0 || qVar.i0()) {
            if ((i10 & 2) != 0 && (qVar instanceof InterfaceC0302z)) {
                AbstractC0283f.n((InterfaceC0302z) qVar);
                if (i11 == 2) {
                    j0 j0VarV = AbstractC0283f.v(qVar, 2);
                    j0VarV.f4128F = true;
                    j0VarV.U.invoke();
                    if (j0VarV.f4140W != null) {
                        if (j0VarV.f4141X != null) {
                            j0VarV.f4141X = null;
                        }
                        j0VarV.a1(null, false);
                        j0VarV.f4125C.V(false);
                    }
                }
            }
            if ((i10 & 128) != 0 && (qVar instanceof InterfaceC0301y) && i11 != 2) {
                AbstractC0283f.x(qVar).E();
            }
            if ((i10 & 256) != 0 && (qVar instanceof InterfaceC0294q) && i11 != 2) {
                I iX = AbstractC0283f.x(qVar);
                if (!iX.q() && !iX.r() && !iX.f3923f0) {
                    AndroidComposeView androidComposeView = (AndroidComposeView) L.a(iX);
                    ((p011b0.e) androidComposeView.f12032g0.f4015e.f5618s).b(iX);
                    iX.f3923f0 = true;
                    androidComposeView.L(null);
                }
            }
            if ((i10 & 4) != 0 && (qVar instanceof InterfaceC0293p)) {
                AbstractC0283f.m((InterfaceC0293p) qVar);
            }
            if ((i10 & 8) != 0 && (qVar instanceof y0)) {
                AbstractC0283f.x(qVar).f3905I = true;
            }
            if ((i10 & 64) != 0 && (qVar instanceof u0)) {
                M m10 = AbstractC0283f.x((u0) qVar).f3915X;
                m10.f3958p.f4029I = true;
                V v10 = m10.f3959q;
                if (v10 != null) {
                    v10.f4001N = true;
                }
            }
            if ((i10 & 2048) != 0 && (qVar instanceof p162q0.o)) {
                p162q0.o oVar = (p162q0.o) qVar;
                C0284g.f4086b = null;
                oVar.N(C0284g.f4085a);
                if (C0284g.f4086b != null) {
                    l0.q qVar2 = (l0.q) oVar;
                    if (!qVar2.f19339r.f19338E) {
                        G0.a.b("visitChildren called on an unattached node");
                    }
                    p011b0.e eVar = new p011b0.e(new l0.q[16]);
                    l0.q qVar3 = qVar2.f19339r;
                    l0.q qVar4 = qVar3.f19344w;
                    if (qVar4 == null) {
                        AbstractC0283f.b(eVar, qVar3);
                    } else {
                        eVar.b(qVar4);
                    }
                    while (true) {
                        int i12 = eVar.f13127t;
                        if (i12 == 0) {
                            break;
                        }
                        l0.q qVarF = (l0.q) eVar.l(i12 - 1);
                        if ((qVarF.f19342u & 1024) == 0) {
                            AbstractC0283f.b(eVar, qVarF);
                        } else {
                            while (qVarF != null) {
                                if ((qVarF.f19341t & 1024) != 0) {
                                    p011b0.e eVar2 = null;
                                    while (qVarF != null) {
                                        if (qVarF instanceof p162q0.t) {
                                            p162q0.t tVar = (p162q0.t) qVarF;
                                            p162q0.g gVar = ((p162q0.k) AbstractC0283f.y(tVar).getFocusOwner()).g;
                                            if (gVar.f21196d.a(tVar) && !gVar.f21198f) {
                                                gVar.f21193a.e(new F2.t(0, gVar, p162q0.g.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 19));
                                                gVar.f21198f = true;
                                            }
                                        } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                            int i13 = 0;
                                            for (l0.q qVar5 = ((AbstractC0291n) qVarF).f4151G; qVar5 != null; qVar5 = qVar5.f19344w) {
                                                if ((qVar5.f19341t & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        qVarF = qVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new p011b0.e(new l0.q[16]);
                                                        }
                                                        if (qVarF != null) {
                                                            eVar2.b(qVarF);
                                                            qVarF = null;
                                                        }
                                                        eVar2.b(qVar5);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        qVarF = AbstractC0283f.f(eVar2);
                                    }
                                    break;
                                }
                                qVarF = qVarF.f19344w;
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(qVar instanceof p162q0.e)) {
                return;
            }
            p162q0.e eVar3 = (p162q0.e) qVar;
            p162q0.g gVar2 = ((p162q0.k) AbstractC0283f.y(eVar3).getFocusOwner()).g;
            if (!gVar2.f21197e.a(eVar3) || gVar2.f21198f) {
                return;
            }
            gVar2.f21193a.e(new F2.t(0, gVar2, p162q0.g.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 19));
            gVar2.f21198f = true;
        }
    }

    public static final void c(l0.q qVar) {
        if (!qVar.f19338E) {
            G0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qVar, -1, 0);
    }

    public static final int d(l0.p pVar) {
        int i10 = pVar instanceof InterfaceC0221u ? 3 : 1;
        if (pVar instanceof p232y.M) {
            i10 |= 4;
        }
        if (pVar instanceof R0.l) {
            i10 |= 8;
        }
        if (pVar instanceof D0.C) {
            i10 |= 16;
        }
        if ((pVar instanceof D.F) || (pVar instanceof D.F)) {
            i10 |= 32;
        }
        if (pVar instanceof C0171e) {
            i10 |= 256;
        }
        if (pVar instanceof H0.Q) {
            i10 |= 64;
        }
        return pVar instanceof O0.a ? 524288 | i10 : i10;
    }

    public static final int e(l0.q qVar) {
        int i10 = qVar.f19341t;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = qVar.getClass();
        u.z zVar = f4143a;
        int iD = zVar.d(cls);
        if (iD >= 0) {
            return zVar.f22786c[iD];
        }
        int i11 = qVar instanceof InterfaceC0302z ? 3 : 1;
        if (qVar instanceof InterfaceC0293p) {
            i11 |= 4;
        }
        if (qVar instanceof y0) {
            i11 |= 8;
        }
        if (qVar instanceof w0) {
            i11 |= 16;
        }
        if (qVar instanceof I0.d) {
            i11 |= 32;
        }
        if (qVar instanceof u0) {
            i11 |= 64;
        }
        if (qVar instanceof InterfaceC0301y) {
            i11 |= 128;
        }
        if (qVar instanceof InterfaceC0294q) {
            i11 |= 256;
        }
        if (qVar instanceof p162q0.t) {
            i11 |= 1024;
        }
        if (qVar instanceof p162q0.o) {
            i11 |= 2048;
        }
        if (qVar instanceof p162q0.e) {
            i11 |= 4096;
        }
        if (qVar instanceof B0.d) {
            i11 |= 8192;
        }
        if (qVar instanceof F0.a) {
            i11 |= 16384;
        }
        if (qVar instanceof InterfaceC0289l) {
            i11 |= 32768;
        }
        if (qVar instanceof C0) {
            i11 |= 262144;
        }
        if (qVar instanceof O0.a) {
            i11 |= 524288;
        }
        zVar.g(i11, cls);
        return i11;
    }

    public static final int f(l0.q qVar) {
        if (!(qVar instanceof AbstractC0291n)) {
            return e(qVar);
        }
        AbstractC0291n abstractC0291n = (AbstractC0291n) qVar;
        int iF = abstractC0291n.f4150F;
        for (l0.q qVar2 = abstractC0291n.f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
            iF |= f(qVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
