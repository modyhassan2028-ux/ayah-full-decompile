package p162q0;

import A.C0009b;
import A.C0023i;
import A.EnumC0047u0;
import D.C0075s;
import E9.d;
import F.A;
import F.C0155d;
import F.r;
import F.s;
import G.C0178l;
import G.C0180n;
import G.C0181o;
import G0.a;
import H0.AbstractC0207f;
import H0.a0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.I;
import J0.j0;
import J0.r0;
import J0.z0;
import W.C0557f1;
import Z.C0675c0;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import l0.q;
import p011b0.e;
import p120l9.m;
import p241y9.c;
import p251z9.j;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21192a = new int[2];

    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    public static final Object A(t tVar, int i10, c cVar) {
        int i11;
        int i12;
        Object objE;
        q qVarF;
        C0181o c0181o;
        int i13;
        int iMax;
        int i14;
        C0280d0 c0280d0;
        if (!tVar.f19339r.f19338E) {
            a.b("visitAncestors called on an unattached node");
        }
        q qVar = tVar.f19339r.f19343v;
        I iX = AbstractC0283f.x(tVar);
        loop0: while (true) {
            i11 = 0;
            i12 = 1;
            objE = null;
            if (iX == null) {
                qVarF = null;
                break;
            }
            if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                while (qVar != null) {
                    if ((qVar.f19341t & 1024) != 0) {
                        qVarF = qVar;
                        e eVar = null;
                        while (qVarF != null) {
                            if (qVarF instanceof t) {
                                break loop0;
                            }
                            if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                int i15 = 0;
                                for (q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                    if ((qVar2.f19341t & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            qVarF = qVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new e(new q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar.b(qVarF);
                                                qVarF = null;
                                            }
                                            eVar.b(qVar2);
                                        }
                                    }
                                }
                                if (i15 == 1) {
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
        t tVar2 = (t) qVarF;
        if (tVar2 != null) {
            I0.f fVar = AbstractC0207f.f3197a;
            if (!j.a((C0181o) p245z2.a.b(tVar2, fVar), (C0181o) p245z2.a.b(tVar, fVar))) {
                c0181o = (C0181o) p245z2.a.b(tVar, AbstractC0207f.f3197a);
                if (c0181o != null) {
                    i13 = 5;
                    if (i10 != 5) {
                        i13 = 6;
                        if (i10 != 6) {
                            i13 = 3;
                            if (i10 != 3) {
                                i13 = 4;
                                if (i10 != 4) {
                                    if (i10 == 1) {
                                        i13 = 2;
                                    } else {
                                        if (i10 == 2) {
                                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                        }
                                        i13 = 1;
                                    }
                                }
                            }
                        }
                    }
                    if (c0181o.f2714F.f2045a.g().f2106n > 0 || c0181o.f2714F.f2045a.g().f2103k.isEmpty() || !c0181o.f19338E) {
                        return cVar.e(C0181o.f2713I);
                    }
                    if (c0181o.w0(i13)) {
                        C0155d c0155d = c0181o.f2714F;
                        iMax = Math.min(c0155d.f2045a.g().f2106n - 1, ((s) m.m0(c0155d.f2045a.g().f2103k)).f2110a);
                    } else {
                        iMax = Math.max(0, ((C0675c0) c0181o.f2714F.f2045a.f2012d.f1158s).g());
                    }
                    v vVar = new v();
                    C0009b c0009b = c0181o.f2715G;
                    c0009b.getClass();
                    C0178l c0178l = new C0178l(iMax, iMax);
                    c0009b.f188a.b(c0178l);
                    vVar.f24886r = c0178l;
                    A a9 = c0181o.f2714F.f2045a;
                    if (a9.g().f2103k.isEmpty()) {
                        i12 = 0;
                    } else {
                        r rVarG = a9.g();
                        int iG = (int) (rVarG.f2107o == EnumC0047u0.f424r ? rVarG.g() & 4294967295L : rVarG.g() >> 32);
                        int iM0 = Y2.a.m0(a9.g());
                        if (iM0 != 0 && (i14 = iG / iM0) >= 1) {
                            i12 = i14;
                        }
                    }
                    int i16 = i12 * 2;
                    int i17 = c0181o.f2714F.f2045a.g().f2106n;
                    if (i16 > i17) {
                        i16 = i17;
                    }
                    while (objE == null && c0181o.v0((C0178l) vVar.f24886r, i13) && i11 < i16) {
                        C0178l c0178l2 = (C0178l) vVar.f24886r;
                        int i18 = c0178l2.f2708a;
                        int i19 = c0178l2.f2709b;
                        if (c0181o.w0(i13)) {
                            i19++;
                        } else {
                            i18--;
                        }
                        C0009b c0009b2 = c0181o.f2715G;
                        c0009b2.getClass();
                        C0178l c0178l3 = new C0178l(i18, i19);
                        c0009b2.f188a.b(c0178l3);
                        c0181o.f2715G.f188a.k((C0178l) vVar.f24886r);
                        vVar.f24886r = c0178l3;
                        i11++;
                        AbstractC0283f.x(c0181o).l();
                        objE = cVar.e(new C0180n(c0181o, vVar, i13));
                    }
                    c0181o.f2715G.f188a.k((C0178l) vVar.f24886r);
                    AbstractC0283f.x(c0181o).l();
                    return objE;
                }
            }
        } else {
            c0181o = (C0181o) p245z2.a.b(tVar, AbstractC0207f.f3197a);
            if (c0181o != null) {
                i13 = 5;
                if (i10 != 5) {
                    i13 = 6;
                    if (i10 != 6) {
                        i13 = 3;
                        if (i10 != 3) {
                            i13 = 4;
                            if (i10 != 4) {
                                if (i10 == 1) {
                                    i13 = 2;
                                } else {
                                    if (i10 == 2) {
                                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                    }
                                    i13 = 1;
                                }
                            }
                        }
                    }
                }
                if (c0181o.f2714F.f2045a.g().f2106n > 0) {
                }
                return cVar.e(C0181o.f2713I);
            }
        }
        return null;
    }

    public static final boolean B(int i10, C0023i c0023i, t tVar, p171r0.e eVar) {
        t tVarH;
        e eVar2 = new e(new t[16]);
        if (!tVar.f19339r.f19338E) {
            a.b("visitChildren called on an unattached node");
        }
        e eVar3 = new e(new q[16]);
        q qVar = tVar.f19339r;
        q qVar2 = qVar.f19344w;
        if (qVar2 == null) {
            AbstractC0283f.b(eVar3, qVar);
        } else {
            eVar3.b(qVar2);
        }
        while (true) {
            int i11 = eVar3.f13127t;
            if (i11 == 0) {
                break;
            }
            q qVarF = (q) eVar3.l(i11 - 1);
            if ((qVarF.f19342u & 1024) == 0) {
                AbstractC0283f.b(eVar3, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f19341t & 1024) != 0) {
                        e eVar4 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof t) {
                                t tVar2 = (t) qVarF;
                                if (tVar2.f19338E) {
                                    eVar2.b(tVar2);
                                }
                            } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                int i12 = 0;
                                for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                    if ((qVar3.f19341t & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar4 == null) {
                                                eVar4 = new e(new q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar4.b(qVarF);
                                                qVarF = null;
                                            }
                                            eVar4.b(qVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            qVarF = AbstractC0283f.f(eVar4);
                        }
                        break;
                    }
                    qVarF = qVarF.f19344w;
                }
            }
        }
        while (eVar2.f13127t != 0 && (tVarH = h(eVar2, eVar, i10)) != null) {
            if (tVarH.w0().f21214a) {
                return ((Boolean) c0023i.e(tVarH)).booleanValue();
            }
            if (l(i10, c0023i, tVarH, eVar)) {
                return true;
            }
            eVar2.k(tVarH);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v15 l0.q) = (r13v9 l0.q), (r13v16 l0.q) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean C(t tVar, t tVar2, int i10, C0023i c0023i) {
        q qVar;
        q qVar2;
        I iX;
        C0280d0 c0280d0;
        q qVarF;
        e eVar;
        if (tVar.x0() != s.f21229s) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new t[16];
        if (!tVar.f19339r.f19338E) {
            a.b("visitChildren called on an unattached node");
        }
        e eVar2 = new e(new q[16]);
        q qVar3 = tVar.f19339r;
        q qVar4 = qVar3.f19344w;
        if (qVar4 == null) {
            AbstractC0283f.b(eVar2, qVar3);
        } else {
            eVar2.b(qVar4);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar2.f13127t;
            qVar = null;
            if (i12 == 0) {
                break;
            }
            q qVarF2 = (q) eVar2.l(i12 - 1);
            if ((qVarF2.f19342u & 1024) == 0) {
                AbstractC0283f.b(eVar2, qVarF2);
            } else {
                while (qVarF2 != null) {
                    if ((qVarF2.f19341t & 1024) != 0) {
                        e eVar3 = null;
                        while (qVarF2 != null) {
                            if (qVarF2 instanceof t) {
                                t tVar3 = (t) qVarF2;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = tVar3;
                                i11 = i13;
                            } else if ((qVarF2.f19341t & 1024) != 0 && (qVarF2 instanceof AbstractC0291n)) {
                                int i14 = 0;
                                for (q qVar5 = ((AbstractC0291n) qVarF2).f4151G; qVar5 != null; qVar5 = qVar5.f19344w) {
                                    if ((qVar5.f19341t & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVarF2 = qVar5;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new e(new q[16]);
                                            }
                                            if (qVarF2 != null) {
                                                eVar3.b(qVarF2);
                                                qVarF2 = null;
                                            }
                                            eVar3.b(qVar5);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            qVarF2 = AbstractC0283f.f(eVar3);
                        }
                        break;
                    }
                    qVarF2 = qVarF2.f19344w;
                }
            }
        }
        Arrays.sort(objArr, 0, i11, v.f21237a);
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            d dVarI0 = B0.c.i0(0, i11);
            int i15 = dVarI0.f1995r;
            int i16 = dVarI0.f1996s;
            if (i15 <= i16) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        t tVar4 = (t) objArr[i16];
                        if (s(tVar4) && a(tVar4, c0023i)) {
                            return true;
                        }
                    }
                    if (j.a(objArr[i16], tVar2)) {
                        z10 = true;
                    }
                    if (i16 == i15) {
                        break;
                    }
                    i16--;
                }
            }
            if (i10 != 1) {
                if (!tVar.f19339r.f19338E) {
                    a.b("visitAncestors called on an unattached node");
                }
                qVar2 = tVar.f19339r.f19343v;
                iX = AbstractC0283f.x(tVar);
                loop5: while (iX != null) {
                    if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                        while (qVar2 != null) {
                            if ((qVar2.f19341t & 1024) != 0) {
                                qVarF = qVar2;
                                eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof t) {
                                        qVar = qVarF;
                                        break loop5;
                                    }
                                    if ((qVarF.f19341t & 1024) == 0) {
                                    }
                                    qVarF = AbstractC0283f.f(eVar);
                                }
                            }
                            qVar2 = qVar2.f19343v;
                        }
                    }
                    iX = iX.u();
                    if (iX != null) {
                    }
                }
                if (qVar != null) {
                    return ((Boolean) c0023i.e(tVar)).booleanValue();
                }
            }
            return false;
        }
        d dVarI1 = B0.c.i0(0, i11);
        int i17 = dVarI1.f1995r;
        int i18 = dVarI1.f1996s;
        if (i17 <= i18) {
            boolean z11 = false;
            while (true) {
                if (z11) {
                    t tVar5 = (t) objArr[i17];
                    if (s(tVar5) && k(tVar5, c0023i)) {
                        return true;
                    }
                }
                if (j.a(objArr[i17], tVar2)) {
                    z11 = true;
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        if (i10 != 1 && tVar.w0().f21214a) {
            if (!tVar.f19339r.f19338E) {
                a.b("visitAncestors called on an unattached node");
            }
            qVar2 = tVar.f19339r.f19343v;
            iX = AbstractC0283f.x(tVar);
            loop5: while (iX != null) {
                if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f19341t & 1024) != 0) {
                            qVarF = qVar2;
                            eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    qVar = qVarF;
                                    break loop5;
                                }
                                if ((qVarF.f19341t & 1024) == 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i19 = 0;
                                    for (q qVar6 = ((AbstractC0291n) qVarF).f4151G; qVar6 != null; qVar6 = qVar6.f19344w) {
                                        if ((qVar6.f19341t & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                qVarF = qVar6;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.b(qVar6);
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar2 = qVar2.f19343v;
                    }
                }
                iX = iX.u();
                qVar2 = (iX != null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
            if (qVar != null) {
                return ((Boolean) c0023i.e(tVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer D(int i10) {
        if (i10 == 5) {
            return 33;
        }
        if (i10 == 6) {
            return 130;
        }
        if (i10 == 3) {
            return 17;
        }
        if (i10 == 4) {
            return 66;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10 == 2 ? 1 : null;
    }

    public static final d E(int i10) {
        if (i10 == 1) {
            return new d(2);
        }
        if (i10 == 2) {
            return new d(1);
        }
        if (i10 == 17) {
            return new d(3);
        }
        if (i10 == 33) {
            return new d(5);
        }
        if (i10 == 66) {
            return new d(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new d(6);
    }

    public static final Boolean F(int i10, C0023i c0023i, t tVar, p171r0.e eVar) {
        int iOrdinal = tVar.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t tVarN = n(tVar);
                if (tVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = tVarN.x0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolF = F(i10, c0023i, tVarN, eVar);
                        if (!j.a(boolF, Boolean.FALSE)) {
                            return boolF;
                        }
                        if (eVar == null) {
                            if (tVarN.x0() != s.f21229s) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            t tVarG = g(tVarN);
                            if (tVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            eVar = j(tVarG);
                        }
                        return Boolean.valueOf(l(i10, c0023i, tVar, eVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new A6.a();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (eVar == null) {
                    eVar = j(tVarN);
                }
                return Boolean.valueOf(l(i10, c0023i, tVar, eVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new A6.a();
                }
                if (tVar.w0().f21214a) {
                    return (Boolean) c0023i.e(tVar);
                }
                return eVar == null ? Boolean.valueOf(i(tVar, i10, c0023i)) : Boolean.valueOf(B(i10, c0023i, tVar, eVar));
            }
        }
        return Boolean.valueOf(i(tVar, i10, c0023i));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[RETURN] */
    public static final boolean a(t tVar, C0023i c0023i) {
        int iOrdinal = tVar.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t tVarN = n(tVar);
                if (tVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = tVarN.x0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(tVarN, c0023i) || m(tVar, tVarN, 2, c0023i) || (tVarN.w0().f21214a && ((Boolean) c0023i.e(tVarN)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new A6.a();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return m(tVar, tVarN, 2, c0023i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new A6.a();
                }
                if (!x(tVar, c0023i)) {
                    if (!(tVar.w0().f21214a ? ((Boolean) c0023i.e(tVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return x(tVar, c0023i);
    }

    public static final boolean b(p171r0.e eVar, p171r0.e eVar2, p171r0.e eVar3, int i10) {
        float f3;
        float f7;
        boolean zC = c(i10, eVar3, eVar);
        float f10 = eVar3.f21390b;
        float f11 = eVar3.f21392d;
        float f12 = eVar3.f21389a;
        float f13 = eVar3.f21391c;
        float f14 = eVar.f21392d;
        float f15 = eVar.f21390b;
        float f16 = eVar.f21391c;
        float f17 = eVar.f21389a;
        if (zC || !c(i10, eVar2, eVar)) {
            return false;
        }
        if (i10 == 3) {
            if (f17 < f13) {
                return true;
            }
        } else if (i10 == 4) {
            if (f16 > f12) {
                return true;
            }
        } else if (i10 == 5) {
            if (f15 < f11) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f14 > f10) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f3 = f17 - eVar2.f21391c;
        } else if (i10 == 4) {
            f3 = eVar2.f21389a - f16;
        } else if (i10 == 5) {
            f3 = f15 - eVar2.f21392d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f3 = eVar2.f21390b - f14;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (i10 == 3) {
            f7 = f17 - f12;
        } else if (i10 == 4) {
            f7 = f13 - f16;
        } else if (i10 == 5) {
            f7 = f15 - f10;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = f11 - f14;
        }
        if (f7 < 1.0f) {
            f7 = 1.0f;
        }
        return f3 < f7;
    }

    public static final boolean c(int i10, p171r0.e eVar, p171r0.e eVar2) {
        if (i10 == 3 || i10 == 4) {
            return eVar.f21392d > eVar2.f21390b && eVar.f21390b < eVar2.f21392d;
        }
        if (i10 == 5 || i10 == 6) {
            return eVar.f21391c > eVar2.f21389a && eVar.f21389a < eVar2.f21391c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final p171r0.e d(View view, AndroidComposeView androidComposeView) {
        int[] iArr = f21192a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f3 = i10 - iArr[0];
        float f7 = i11 - iArr[1];
        return new p171r0.e(f3, f7, view.getWidth() + f3, view.getHeight() + f7);
    }

    public static final boolean e(t tVar, boolean z10) {
        int iOrdinal = tVar.x0().ordinal();
        s sVar = s.f21231u;
        if (iOrdinal == 0) {
            ((k) AbstractC0283f.y(tVar).getFocusOwner()).f(null);
            tVar.v0(s.f21228r, sVar);
            return true;
        }
        if (iOrdinal == 1) {
            t tVarN = n(tVar);
            if (!(tVarN != null ? e(tVarN, z10) : true)) {
                return false;
            }
            tVar.v0(s.f21229s, sVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new A6.a();
        }
        if (z10) {
            ((k) AbstractC0283f.y(tVar).getFocusOwner()).f(null);
            tVar.v0(s.f21230t, sVar);
        }
        return z10;
    }

    public static final void f(t tVar, e eVar) {
        if (!tVar.f19339r.f19338E) {
            a.b("visitChildren called on an unattached node");
        }
        e eVar2 = new e(new q[16]);
        q qVar = tVar.f19339r;
        q qVar2 = qVar.f19344w;
        if (qVar2 == null) {
            AbstractC0283f.b(eVar2, qVar);
        } else {
            eVar2.b(qVar2);
        }
        while (true) {
            int i10 = eVar2.f13127t;
            if (i10 == 0) {
                return;
            }
            q qVarF = (q) eVar2.l(i10 - 1);
            if ((qVarF.f19342u & 1024) == 0) {
                AbstractC0283f.b(eVar2, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f19341t & 1024) != 0) {
                        e eVar3 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof t) {
                                t tVar2 = (t) qVarF;
                                if (tVar2.f19338E && !AbstractC0283f.x(tVar2).f3924g0) {
                                    if (tVar2.w0().f21214a) {
                                        eVar.b(tVar2);
                                    } else {
                                        f(tVar2, eVar);
                                    }
                                }
                            } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                int i11 = 0;
                                for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                    if ((qVar3.f19341t & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new e(new q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar3.b(qVarF);
                                                qVarF = null;
                                            }
                                            eVar3.b(qVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            qVarF = AbstractC0283f.f(eVar3);
                        }
                        break;
                    }
                    qVarF = qVarF.f19344w;
                }
            }
        }
    }

    public static final t g(t tVar) {
        t tVar2 = ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21209l;
        if (tVar2 == null || !tVar2.f19338E) {
            return null;
        }
        return tVar2;
    }

    public static final t h(e eVar, p171r0.e eVar2, int i10) {
        p171r0.e eVarG;
        if (i10 == 3) {
            eVarG = eVar2.g((eVar2.f21391c - eVar2.f21389a) + 1, 0.0f);
        } else if (i10 == 4) {
            eVarG = eVar2.g(-((eVar2.f21391c - eVar2.f21389a) + 1), 0.0f);
        } else if (i10 == 5) {
            eVarG = eVar2.g(0.0f, (eVar2.f21392d - eVar2.f21390b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            eVarG = eVar2.g(0.0f, -((eVar2.f21392d - eVar2.f21390b) + 1));
        }
        Object[] objArr = eVar.f13125r;
        int i11 = eVar.f13127t;
        t tVar = null;
        for (int i12 = 0; i12 < i11; i12++) {
            t tVar2 = (t) objArr[i12];
            if (s(tVar2)) {
                p171r0.e eVarJ = j(tVar2);
                if (p(eVarJ, eVarG, eVar2, i10)) {
                    tVar = tVar2;
                    eVarG = eVarJ;
                }
            }
        }
        return tVar;
    }

    public static final boolean i(t tVar, int i10, c cVar) {
        p171r0.e eVar;
        e eVar2 = new e(new t[16]);
        f(tVar, eVar2);
        int i11 = eVar2.f13127t;
        if (i11 <= 1) {
            t tVar2 = (t) (i11 == 0 ? null : eVar2.f13125r[0]);
            if (tVar2 != null) {
                return ((Boolean) cVar.e(tVar2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                p171r0.e eVarJ = j(tVar);
                float f3 = eVarJ.f21389a;
                float f7 = eVarJ.f21390b;
                eVar = new p171r0.e(f3, f7, f3, f7);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                p171r0.e eVarJ2 = j(tVar);
                float f10 = eVarJ2.f21391c;
                float f11 = eVarJ2.f21392d;
                eVar = new p171r0.e(f10, f11, f10, f11);
            }
            t tVarH = h(eVar2, eVar, i10);
            if (tVarH != null) {
                return ((Boolean) cVar.e(tVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final p171r0.e j(t tVar) {
        j0 j0Var = tVar.f19346y;
        return j0Var != null ? a0.d(j0Var).J(j0Var, false) : p171r0.e.f21388e;
    }

    public static final boolean k(t tVar, C0023i c0023i) {
        int iOrdinal = tVar.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t tVarN = n(tVar);
                if (tVarN != null) {
                    return k(tVarN, c0023i) || m(tVar, tVarN, 1, c0023i);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return tVar.w0().f21214a ? ((Boolean) c0023i.e(tVar)).booleanValue() : y(tVar, c0023i);
                }
                throw new A6.a();
            }
        }
        return y(tVar, c0023i);
    }

    public static final boolean l(int i10, C0023i c0023i, t tVar, p171r0.e eVar) {
        if (B(i10, c0023i, tVar, eVar)) {
            return true;
        }
        u uVar = ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21206h;
        uVar.getClass();
        Boolean bool = (Boolean) A(tVar, i10, new C0075s(uVar, ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21209l, tVar, eVar, i10, c0023i, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(t tVar, t tVar2, int i10, C0023i c0023i) {
        if (C(tVar, tVar2, i10, c0023i)) {
            return true;
        }
        u uVar = ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21206h;
        uVar.getClass();
        Boolean bool = (Boolean) A(tVar, i10, new C0075s(uVar, ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21209l, tVar, tVar2, i10, c0023i, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final t n(t tVar) {
        int iOrdinal;
        boolean z10 = tVar.f19339r.f19338E;
        if (z10) {
            if (!z10) {
                a.b("visitChildren called on an unattached node");
            }
            e eVar = new e(new q[16]);
            q qVar = tVar.f19339r;
            q qVar2 = qVar.f19344w;
            if (qVar2 == null) {
                AbstractC0283f.b(eVar, qVar);
            } else {
                eVar.b(qVar2);
            }
            while (true) {
                int i10 = eVar.f13127t;
                if (i10 == 0) {
                    break;
                }
                q qVarF = (q) eVar.l(i10 - 1);
                if ((qVarF.f19342u & 1024) == 0) {
                    AbstractC0283f.b(eVar, qVarF);
                } else {
                    while (qVarF != null) {
                        if ((qVarF.f19341t & 1024) != 0) {
                            e eVar2 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    t tVar2 = (t) qVarF;
                                    if (tVar2.f19339r.f19338E && ((iOrdinal = tVar2.x0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                        return tVar2;
                                    }
                                } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i11 = 0;
                                    for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                        if ((qVar3.f19341t & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarF = qVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar2.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar2.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
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
        return null;
    }

    public static final void o(t tVar) {
        I i10;
        r0 r0Var;
        j0 j0Var = tVar.f19339r.f19346y;
        if (j0Var == null || (i10 = j0Var.f4125C) == null || (r0Var = i10.f3901E) == null) {
            return;
        }
        r0Var.getFocusOwner();
    }

    public static final boolean p(p171r0.e eVar, p171r0.e eVar2, p171r0.e eVar3, int i10) {
        if (!q(i10, eVar, eVar3)) {
            return false;
        }
        if (q(i10, eVar2, eVar3) && !b(eVar3, eVar, eVar2, i10)) {
            return !b(eVar3, eVar2, eVar, i10) && r(i10, eVar3, eVar) < r(i10, eVar3, eVar2);
        }
        return true;
    }

    public static final boolean q(int i10, p171r0.e eVar, p171r0.e eVar2) {
        float f3 = eVar.f21390b;
        float f7 = eVar.f21392d;
        float f10 = eVar.f21389a;
        float f11 = eVar.f21391c;
        if (i10 == 3) {
            float f12 = eVar2.f21391c;
            float f13 = eVar2.f21389a;
            return (f12 > f11 || f13 >= f11) && f13 > f10;
        }
        if (i10 == 4) {
            float f14 = eVar2.f21389a;
            float f15 = eVar2.f21391c;
            return (f14 < f10 || f15 <= f10) && f15 < f11;
        }
        if (i10 == 5) {
            float f16 = eVar2.f21392d;
            float f17 = eVar2.f21390b;
            return (f16 > f7 || f17 >= f7) && f17 > f3;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f18 = eVar2.f21390b;
        float f19 = eVar2.f21392d;
        return (f18 < f3 || f19 <= f3) && f19 < f7;
    }

    public static final long r(int i10, p171r0.e eVar, p171r0.e eVar2) {
        float f3;
        float f7;
        float f10 = eVar2.f21390b;
        float f11 = eVar2.f21392d;
        float f12 = eVar2.f21389a;
        float f13 = eVar2.f21391c;
        if (i10 == 3) {
            f3 = eVar.f21389a - f13;
        } else if (i10 == 4) {
            f3 = f12 - eVar.f21391c;
        } else if (i10 == 5) {
            f3 = eVar.f21390b - f11;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f3 = f10 - eVar.f21392d;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        long j = (long) f3;
        if (i10 == 3 || i10 == 4) {
            float f14 = eVar.f21390b;
            float f15 = 2;
            f7 = (((eVar.f21392d - f14) / f15) + f14) - (((f11 - f10) / f15) + f10);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f16 = eVar.f21389a;
            float f17 = 2;
            f7 = (((eVar.f21391c - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        }
        long j10 = (long) f7;
        return (j10 * j10) + (((long) 13) * j * j);
    }

    public static final boolean s(t tVar) {
        I i10;
        j0 j0Var;
        I i11;
        j0 j0Var2 = tVar.f19346y;
        return (j0Var2 == null || (i10 = j0Var2.f4125C) == null || !i10.I() || (j0Var = tVar.f19346y) == null || (i11 = j0Var.f4125C) == null || !i11.H()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [y9.c, z9.k] */
    public static final b t(t tVar, int i10) {
        int iOrdinal = tVar.x0().ordinal();
        b bVar = b.f21185r;
        if (iOrdinal != 0) {
            b bVar2 = b.f21186s;
            if (iOrdinal == 1) {
                t tVarN = n(tVar);
                if (tVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarT = t(tVarN, i10);
                if (bVarT == bVar) {
                    bVarT = null;
                }
                if (bVarT != null) {
                    return bVarT;
                }
                if (tVar.f21234G) {
                    return bVar;
                }
                tVar.f21234G = true;
                try {
                    n nVarW0 = tVar.w0();
                    a aVar = new a(i10);
                    o(tVar);
                    j focusOwner = AbstractC0283f.y(tVar).getFocusOwner();
                    t tVar2 = ((k) focusOwner).f21209l;
                    nVarW0.f21222k.e(aVar);
                    t tVar3 = ((k) focusOwner).f21209l;
                    if (aVar.f21184b) {
                        p pVar = p.f21223b;
                        return bVar2;
                    }
                    if (tVar2 == tVar3 || tVar3 == null) {
                        return bVar;
                    }
                    return p.f21225d == p.f21224c ? bVar2 : b.f21187t;
                } finally {
                    tVar.f21234G = false;
                }
            }
            if (iOrdinal == 2) {
                return bVar2;
            }
            if (iOrdinal != 3) {
                throw new A6.a();
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y9.c, z9.k] */
    public static final b u(t tVar, int i10) {
        if (!tVar.f21235H) {
            tVar.f21235H = true;
            try {
                n nVarW0 = tVar.w0();
                a aVar = new a(i10);
                o(tVar);
                j focusOwner = AbstractC0283f.y(tVar).getFocusOwner();
                t tVar2 = ((k) focusOwner).f21209l;
                nVarW0.j.e(aVar);
                t tVar3 = ((k) focusOwner).f21209l;
                boolean z10 = aVar.f21184b;
                b bVar = b.f21186s;
                if (z10) {
                    p pVar = p.f21223b;
                    return bVar;
                }
                if (tVar2 != tVar3 && tVar3 != null) {
                    return p.f21225d == p.f21224c ? bVar : b.f21187t;
                }
            } finally {
                tVar.f21235H = false;
            }
        }
        return b.f21185r;
    }

    public static final b v(t tVar, int i10) {
        q qVarF;
        C0280d0 c0280d0;
        int iOrdinal = tVar.x0().ordinal();
        b bVar = b.f21185r;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t tVarN = n(tVar);
                if (tVarN != null) {
                    return t(tVarN, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new A6.a();
                }
                if (!tVar.f19339r.f19338E) {
                    a.b("visitAncestors called on an unattached node");
                }
                q qVar = tVar.f19339r.f19343v;
                I iX = AbstractC0283f.x(tVar);
                loop0: while (true) {
                    if (iX == null) {
                        qVarF = null;
                        break;
                    }
                    if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                        while (qVar != null) {
                            if ((qVar.f19341t & 1024) != 0) {
                                qVarF = qVar;
                                e eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof t) {
                                        break loop0;
                                    }
                                    if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                        int i11 = 0;
                                        for (q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                            if ((qVar2.f19341t & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    qVarF = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.b(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
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
                t tVar2 = (t) qVarF;
                if (tVar2 == null) {
                    return bVar;
                }
                int iOrdinal2 = tVar2.x0().ordinal();
                if (iOrdinal2 == 0) {
                    return u(tVar2, i10);
                }
                if (iOrdinal2 == 1) {
                    return v(tVar2, i10);
                }
                if (iOrdinal2 == 2) {
                    return b.f21186s;
                }
                if (iOrdinal2 != 3) {
                    throw new A6.a();
                }
                b bVarV = v(tVar2, i10);
                b bVar2 = bVarV != bVar ? bVarV : null;
                return bVar2 == null ? u(tVar2, i10) : bVar2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fe A[ADDED_TO_REGION, LOOP:9: B:139:0x01fe->B:146:0x020e, LOOP_START, PHI: r12
      0x01fe: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:138:0x01fc, B:146:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0200  */
    /* JADX WARN: Code duplicated, block: B:143:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x020b  */
    /* JADX WARN: Code duplicated, block: B:145:0x020d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0214  */
    /* JADX WARN: Code duplicated, block: B:150:0x0219  */
    /* JADX WARN: Code duplicated, block: B:154:0x0222 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:182:0x01a9 A[SYNTHETIC] */
    public static final boolean w(t tVar) {
        e eVar;
        int i10;
        int length;
        s sVar;
        t tVar2;
        s sVar2;
        C0280d0 c0280d0;
        char c10;
        C0280d0 c0280d1;
        k kVar = (k) AbstractC0283f.y(tVar).getFocusOwner();
        t tVar3 = kVar.f21209l;
        s sVarX0 = tVar.x0();
        if (tVar3 == tVar) {
            tVar.v0(sVarX0, sVarX0);
            return true;
        }
        e eVar2 = null;
        int i11 = 0;
        if (tVar3 == null && !((Boolean) ((k) AbstractC0283f.y(tVar).getFocusOwner()).f21200a.invoke(null, null)).booleanValue()) {
            return false;
        }
        char c11 = 16;
        if (tVar3 != null) {
            eVar = new e(new t[16]);
            if (!tVar3.f19339r.f19338E) {
                a.b("visitAncestors called on an unattached node");
            }
            q qVar = tVar3.f19339r.f19343v;
            I iX = AbstractC0283f.x(tVar3);
            while (iX != null) {
                if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f19341t & 1024) != 0) {
                            e eVar3 = eVar2;
                            q qVarF = qVar;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    eVar.b((t) qVarF);
                                } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i12 = 0;
                                    for (q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                        if ((qVar2.f19341t & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar3.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar3.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar3);
                            }
                        }
                        qVar = qVar.f19343v;
                        eVar2 = null;
                    }
                }
                iX = iX.u();
                qVar = (iX == null || (c0280d1 = iX.f3914W) == null) ? null : (z0) c0280d1.f4066e;
                eVar2 = null;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new t[16];
        if (!tVar.f19339r.f19338E) {
            a.b("visitAncestors called on an unattached node");
        }
        q qVar3 = tVar.f19339r.f19343v;
        I iX2 = AbstractC0283f.x(tVar);
        int i13 = 1;
        int i14 = 0;
        while (iX2 != null) {
            if ((((q) iX2.f3914W.f4067f).f19342u & 1024) != 0) {
                while (qVar3 != null) {
                    if ((qVar3.f19341t & 1024) != 0) {
                        q qVarF2 = qVar3;
                        e eVar4 = null;
                        while (qVarF2 != null) {
                            if (qVarF2 instanceof t) {
                                t tVar4 = (t) qVarF2;
                                Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.k(tVar4)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i15 = i14 + 1;
                                    if (objArr.length < i15) {
                                        int length2 = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i15, length2 * 2)];
                                        System.arraycopy(objArr, i11, objArr2, i11, length2);
                                        objArr = objArr2;
                                    }
                                    objArr[i14] = tVar4;
                                    i14 = i15;
                                }
                                if (tVar4 == tVar3) {
                                    i13 = i11;
                                }
                            } else {
                                if ((qVarF2.f19341t & 1024) != 0 && (qVarF2 instanceof AbstractC0291n)) {
                                    int i16 = i11;
                                    for (q qVar4 = ((AbstractC0291n) qVarF2).f4151G; qVar4 != null; qVar4 = qVar4.f19344w) {
                                        if ((qVar4.f19341t & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                qVarF2 = qVar4;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new e(new q[16]);
                                                }
                                                if (qVarF2 != null) {
                                                    eVar4.b(qVarF2);
                                                    qVarF2 = null;
                                                }
                                                eVar4.b(qVar4);
                                            }
                                        }
                                    }
                                    c10 = 16;
                                    if (i16 == 1) {
                                        c11 = 16;
                                    }
                                    i11 = 0;
                                }
                                qVarF2 = AbstractC0283f.f(eVar4);
                                c11 = c10;
                                i11 = 0;
                            }
                            c10 = 16;
                            qVarF2 = AbstractC0283f.f(eVar4);
                            c11 = c10;
                            i11 = 0;
                        }
                    }
                    qVar3 = qVar3.f19343v;
                    c11 = c11;
                    i11 = 0;
                }
            }
            char c12 = c11;
            iX2 = iX2.u();
            qVar3 = (iX2 == null || (c0280d0 = iX2.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            c11 = c12;
            i11 = 0;
        }
        if (i13 == 0 || tVar3 == null || e(tVar3, false)) {
            AbstractC0283f.t(tVar, new C0557f1(15, tVar));
            int iOrdinal = tVar.x0().ordinal();
            if (iOrdinal == 1 || iOrdinal == 3) {
                ((k) AbstractC0283f.y(tVar).getFocusOwner()).f(tVar);
            }
            s sVar3 = s.f21231u;
            s sVar4 = s.f21229s;
            if (eVar != null) {
                int i17 = eVar.f13127t - 1;
                Object[] objArr3 = eVar.f13125r;
                if (i17 < objArr3.length) {
                    while (i17 >= 0) {
                        t tVar5 = (t) objArr3[i17];
                        if (kVar.f21209l == tVar) {
                            tVar5.v0(sVar4, sVar3);
                            i17--;
                        }
                    }
                    i10 = i14 - 1;
                    length = objArr.length;
                    sVar = s.f21228r;
                    if (i10 < length) {
                        while (i10 >= 0) {
                            tVar2 = (t) objArr[i10];
                            if (kVar.f21209l == tVar) {
                                if (tVar2 == tVar3) {
                                    sVar2 = sVar;
                                } else {
                                    sVar2 = sVar3;
                                }
                                tVar2.v0(sVar2, sVar4);
                                i10--;
                            }
                        }
                        if (kVar.f21209l == tVar) {
                            tVar.v0(sVarX0, sVar);
                            if (kVar.f21209l != tVar) {
                                return true;
                            }
                        }
                    } else if (kVar.f21209l == tVar) {
                        tVar.v0(sVarX0, sVar);
                        if (kVar.f21209l != tVar) {
                            return true;
                        }
                    }
                } else {
                    i10 = i14 - 1;
                    length = objArr.length;
                    sVar = s.f21228r;
                    if (i10 < length) {
                        while (i10 >= 0) {
                            tVar2 = (t) objArr[i10];
                            if (kVar.f21209l == tVar) {
                                if (tVar2 == tVar3) {
                                    sVar2 = sVar;
                                } else {
                                    sVar2 = sVar3;
                                }
                                tVar2.v0(sVar2, sVar4);
                                i10--;
                            }
                        }
                        if (kVar.f21209l == tVar) {
                            tVar.v0(sVarX0, sVar);
                            if (kVar.f21209l != tVar) {
                                return true;
                            }
                        }
                    } else if (kVar.f21209l == tVar) {
                        tVar.v0(sVarX0, sVar);
                        if (kVar.f21209l != tVar) {
                            return true;
                        }
                    }
                }
            } else {
                i10 = i14 - 1;
                length = objArr.length;
                sVar = s.f21228r;
                if (i10 < length) {
                    while (i10 >= 0) {
                        tVar2 = (t) objArr[i10];
                        if (kVar.f21209l == tVar) {
                            if (tVar2 == tVar3) {
                                sVar2 = sVar;
                            } else {
                                sVar2 = sVar3;
                            }
                            tVar2.v0(sVar2, sVar4);
                            i10--;
                        }
                    }
                    if (kVar.f21209l == tVar) {
                        tVar.v0(sVarX0, sVar);
                        if (kVar.f21209l != tVar) {
                            return true;
                        }
                    }
                } else if (kVar.f21209l == tVar) {
                    tVar.v0(sVarX0, sVar);
                    if (kVar.f21209l != tVar) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean x(t tVar, C0023i c0023i) {
        Object[] objArr = new t[16];
        if (!tVar.f19339r.f19338E) {
            a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new q[16]);
        q qVar = tVar.f19339r;
        q qVar2 = qVar.f19344w;
        if (qVar2 == null) {
            AbstractC0283f.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f13127t;
            if (i11 == 0) {
                break;
            }
            q qVarF = (q) eVar.l(i11 - 1);
            if ((qVarF.f19342u & 1024) == 0) {
                AbstractC0283f.b(eVar, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f19341t & 1024) != 0) {
                        e eVar2 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof t) {
                                t tVar2 = (t) qVarF;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = tVar2;
                                i10 = i12;
                            } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                int i13 = 0;
                                for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                    if ((qVar3.f19341t & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar2.b(qVarF);
                                                qVarF = null;
                                            }
                                            eVar2.b(qVar3);
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
        Arrays.sort(objArr, 0, i10, v.f21237a);
        int i14 = i10 - 1;
        if (i14 < objArr.length) {
            while (i14 >= 0) {
                t tVar3 = (t) objArr[i14];
                if (s(tVar3) && a(tVar3, c0023i)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    public static final boolean y(t tVar, C0023i c0023i) {
        Object[] objArr = new t[16];
        if (!tVar.f19339r.f19338E) {
            a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new q[16]);
        q qVar = tVar.f19339r;
        q qVar2 = qVar.f19344w;
        if (qVar2 == null) {
            AbstractC0283f.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f13127t;
            if (i11 == 0) {
                break;
            }
            q qVarF = (q) eVar.l(i11 - 1);
            if ((qVarF.f19342u & 1024) == 0) {
                AbstractC0283f.b(eVar, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f19341t & 1024) != 0) {
                        e eVar2 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof t) {
                                t tVar2 = (t) qVarF;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = tVar2;
                                i10 = i12;
                            } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                int i13 = 0;
                                for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                    if ((qVar3.f19341t & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar2.b(qVarF);
                                                qVarF = null;
                                            }
                                            eVar2.b(qVar3);
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
        Arrays.sort(objArr, 0, i10, v.f21237a);
        for (int i14 = 0; i14 < i10; i14++) {
            t tVar3 = (t) objArr[i14];
            if (s(tVar3) && k(tVar3, c0023i)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
