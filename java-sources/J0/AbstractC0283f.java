package J0;

import H0.C0214m;
import H0.InterfaceC0215n;
import Z.AbstractC0693l0;
import Z.C0672b;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: renamed from: J0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0283f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f4083a = new p0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [J0.C0, J0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [y9.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [l0.q] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void A(C0 c10, p241y9.c cVar) {
        C0280d0 c0280d0;
        l0.q qVar = (l0.q) c10;
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        l0.q qVar2 = qVar.f19339r.f19343v;
        I iX = x(c10);
        while (iX != null) {
            if ((((l0.q) iX.f3914W.f4067f).f19342u & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f19341t & 262144) != 0) {
                        ?? F10 = qVar2;
                        ?? eVar = 0;
                        while (F10 != 0) {
                            boolean zBooleanValue = true;
                            if (F10 instanceof C0) {
                                C0 c11 = (C0) F10;
                                if (p251z9.j.a(c10.p(), c11.p()) && c10.getClass() == c11.getClass()) {
                                    zBooleanValue = ((Boolean) cVar.e(c11)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F10.f19341t & 262144) != 0) && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar3 = ((AbstractC0291n) F10).f4151G;
                                    int i10 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.f19341t & 262144) != 0) {
                                            F10 = F10;
                                            eVar = eVar;
                                            i10++;
                                            if (i10 == 1) {
                                                F10 = F10;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F10 = qVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p011b0.e(new l0.q[16]);
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
                                            F10 = F10;
                                            eVar = eVar;
                                        }
                                        qVar3 = qVar3.f19344w;
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                        F10 = F10;
                                        eVar = eVar;
                                    } else {
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                }
                            }
                            F10 = f(eVar);
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
    /* JADX WARN: Type inference failed for: r12v0, types: [J0.C0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [y9.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void B(C0 c10, p241y9.c cVar) {
        l0.q qVar = (l0.q) c10;
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        p011b0.e eVar = new p011b0.e(new l0.q[16]);
        l0.q qVar2 = qVar.f19339r;
        l0.q qVar3 = qVar2.f19344w;
        if (qVar3 == null) {
            b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i10 = eVar.f13127t;
            if (i10 == 0) {
                return;
            }
            l0.q qVar4 = (l0.q) eVar.l(i10 - 1);
            if ((qVar4.f19342u & 262144) != 0) {
                l0.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null) {
                        if ((qVar5.f19341t & 262144) != 0) {
                            ?? F10 = qVar5;
                            ?? eVar2 = 0;
                            while (F10 != 0) {
                                if (F10 instanceof C0) {
                                    C0 c11 = (C0) F10;
                                    B0 b5 = (p251z9.j.a(c10.p(), c11.p()) && c10.getClass() == c11.getClass()) ? (B0) cVar.e(c11) : B0.f3878r;
                                    if (b5 != B0.f3880t) {
                                        if (b5 == B0.f3879s) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F10.f19341t & 262144) != 0 && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar6 = ((AbstractC0291n) F10).f4151G;
                                    int i11 = 0;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.f19341t & 262144) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                eVar2 = eVar2;
                                                F10 = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p011b0.e(new l0.q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar2.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f19344w;
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                F10 = f(eVar2);
                            }
                        }
                        qVar5 = qVar5.f19344w;
                    }
                }
            }
            b(eVar, qVar4);
        }
    }

    public static final long a(float f3, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
    }

    public static final void b(p011b0.e eVar, l0.q qVar) {
        p011b0.e eVarZ = x(qVar).z();
        int i10 = eVarZ.f13127t - 1;
        Object[] objArr = eVarZ.f13125r;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b((l0.q) ((I) objArr[i10]).f3914W.f4067f);
                i10--;
            }
        }
    }

    public static final int c(P p10, C0214m c0214m) {
        P pJ0 = p10.j0();
        if (pJ0 == null) {
            G0.a.b("Child of " + p10 + " cannot be null when calculating alignment line");
        }
        if (p10.n0().c().containsKey(c0214m)) {
            Integer num = (Integer) p10.n0().c().get(c0214m);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iR = pJ0.R(c0214m);
            if (iR != Integer.MIN_VALUE) {
                pJ0.f3969x = true;
                p10.f3970y = true;
                p10.r0();
                pJ0.f3969x = false;
                p10.f3970y = false;
                return iR + ((int) (c0214m instanceof C0214m ? pJ0.p0() & 4294967295L : pJ0.p0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(C0277c c0277c) {
        z0 z0Var = (z0) x(c0277c).f3914W.f4066e;
        p251z9.j.c(z0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return z0Var.f4190F;
    }

    public static final l0.q e(InterfaceC0290m interfaceC0290m, int i10) {
        l0.q qVar = ((l0.q) interfaceC0290m).f19339r.f19344w;
        if (qVar == null || (qVar.f19342u & i10) == 0) {
            return null;
        }
        while (qVar != null) {
            int i11 = qVar.f19341t;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return qVar;
            }
            qVar = qVar.f19344w;
        }
        return null;
    }

    public static final l0.q f(p011b0.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.f13127t) == 0) {
            return null;
        }
        return (l0.q) eVar.l(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0302z g(l0.q qVar) {
        if ((qVar.f19341t & 2) != 0) {
            if (qVar instanceof InterfaceC0302z) {
                return (InterfaceC0302z) qVar;
            }
            if (qVar instanceof AbstractC0291n) {
                l0.q qVar2 = ((AbstractC0291n) qVar).f4151G;
                while (qVar2 != 0) {
                    if (qVar2 instanceof InterfaceC0302z) {
                        return (InterfaceC0302z) qVar2;
                    }
                    qVar2 = (!(qVar2 instanceof AbstractC0291n) || (qVar2.f19341t & 2) == 0) ? qVar2.f19344w : ((AbstractC0291n) qVar2).f4151G;
                }
            }
        }
        return null;
    }

    public static final int h(long j, long j10) {
        boolean zQ = q(j);
        if (zQ != q(j10)) {
            return zQ ? -1 : 1;
        }
        int iSignum = (int) Math.signum(l(j) - l(j10));
        if (Math.min(l(j), l(j10)) >= 0.0f && p(j) != p(j10)) {
            return p(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC0289l interfaceC0289l, AbstractC0693l0 abstractC0693l0) {
        if (!((l0.q) interfaceC0289l).f19339r.f19338E) {
            G0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        p074h0.h hVar = (p074h0.h) x(interfaceC0289l).S;
        hVar.getClass();
        return C0672b.s(hVar, abstractC0693l0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [J0.C0, J0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [l0.q] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final C0 j(C0 c10) {
        C0280d0 c0280d0;
        l0.q qVar = (l0.q) c10;
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        l0.q qVar2 = qVar.f19339r.f19343v;
        I iX = x(c10);
        while (iX != null) {
            if ((((l0.q) iX.f3914W.f4067f).f19342u & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f19341t & 262144) != 0) {
                        ?? F10 = qVar2;
                        ?? eVar = 0;
                        while (F10 != 0) {
                            if (F10 instanceof C0) {
                                C0 c11 = (C0) F10;
                                if (p251z9.j.a(c10.p(), c11.p()) && c10.getClass() == c11.getClass()) {
                                    return c11;
                                }
                            } else if ((F10.f19341t & 262144) != 0 && (F10 instanceof AbstractC0291n)) {
                                l0.q qVar3 = ((AbstractC0291n) F10).f4151G;
                                int i10 = 0;
                                F10 = F10;
                                eVar = eVar;
                                while (qVar3 != null) {
                                    if ((qVar3.f19341t & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            eVar = eVar;
                                            F10 = qVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new p011b0.e(new l0.q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar.b(F10);
                                                F10 = 0;
                                            }
                                            eVar.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f19344w;
                                    F10 = F10;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F10 = f(eVar);
                        }
                    }
                    qVar2 = qVar2.f19343v;
                }
            }
            iX = iX.u();
            qVar2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
        }
        return null;
    }

    public static final ArrayList k(InterfaceC0215n interfaceC0215n) {
        p251z9.j.c(interfaceC0215n, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        I iM0 = ((P) interfaceC0215n).m0();
        boolean zR = r(iM0);
        p011b0.b bVar = (p011b0.b) iM0.p();
        p011b0.e eVar = bVar.f13119r;
        ArrayList arrayList = new ArrayList(eVar.f13127t);
        int i10 = eVar.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            I i12 = (I) bVar.get(i11);
            arrayList.add(zR ? i12.m() : i12.n());
        }
        return arrayList;
    }

    public static final float l(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(InterfaceC0293p interfaceC0293p) {
        if (((l0.q) interfaceC0293p).f19339r.f19338E) {
            v(interfaceC0293p, 1).L0();
        }
    }

    public static final void n(InterfaceC0302z interfaceC0302z) {
        x(interfaceC0302z).E();
    }

    public static final void o(y0 y0Var) {
        x(y0Var).F();
    }

    public static final boolean p(long j) {
        return (j & 2) != 0;
    }

    public static final boolean q(long j) {
        return (j & 1) != 0;
    }

    public static final boolean r(I i10) {
        int iOrdinal = i10.f3915X.f3948d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new A6.a();
                }
                I iU = i10.u();
                if (iU != null) {
                    return r(iU);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean s(I i10) {
        if (i10.f3932y == null) {
            return false;
        }
        I iU = i10.u();
        return (iU != null ? iU.f3932y : null) == null || i10.f3915X.f3946b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(l0.q qVar, p241y9.a aVar) {
        o0 o0Var = qVar.f19345x;
        if (o0Var == null) {
            o0Var = new o0((n0) qVar);
            qVar.f19345x = o0Var;
        }
        y(qVar).getSnapshotObserver().a(o0Var, C0281e.f4078w, aVar);
    }

    public static final void u(InterfaceC0290m interfaceC0290m) {
        p122m0.d dVar;
        I iX = x(interfaceC0290m);
        if (iX.f3907K) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) L.a(iX);
        if (!AndroidComposeView.h() || (dVar = androidComposeView.T) == null) {
            return;
        }
        dVar.f19465d.f7456a.n(iX.f3926s, new p122m0.c(dVar, iX));
    }

    public static final j0 v(InterfaceC0290m interfaceC0290m, int i10) {
        j0 j0Var = ((l0.q) interfaceC0290m).f19339r.f19346y;
        p251z9.j.b(j0Var);
        if (j0Var.E0() != interfaceC0290m || !k0.g(i10)) {
            return j0Var;
        }
        j0 j0Var2 = j0Var.f4126D;
        p251z9.j.b(j0Var2);
        return j0Var2;
    }

    public static final j0 w(InterfaceC0290m interfaceC0290m) {
        if (!((l0.q) interfaceC0290m).f19339r.f19338E) {
            G0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        j0 j0VarV = v(interfaceC0290m, 2);
        if (!j0VarV.E0().f19338E) {
            G0.a.b("LayoutCoordinates is not attached.");
        }
        return j0VarV;
    }

    public static final I x(InterfaceC0290m interfaceC0290m) {
        j0 j0Var = ((l0.q) interfaceC0290m).f19339r.f19346y;
        if (j0Var != null) {
            return j0Var.f4125C;
        }
        throw android.support.v4.media.session.p.s("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final r0 y(InterfaceC0290m interfaceC0290m) {
        r0 r0Var = x(interfaceC0290m).f3901E;
        if (r0Var != null) {
            return r0Var;
        }
        throw android.support.v4.media.session.p.s("This node does not have an owner.");
    }

    public static final View z(InterfaceC0290m interfaceC0290m) {
        if (!((l0.q) interfaceC0290m).f19339r.f19338E) {
            G0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) L.a(x(interfaceC0290m));
    }
}
