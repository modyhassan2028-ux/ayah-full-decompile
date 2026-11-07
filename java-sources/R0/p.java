package R0;

import A.M0;
import H0.a0;
import J0.AbstractC0283f;
import J0.I;
import J0.InterfaceC0290m;
import J0.j0;
import java.util.ArrayList;
import java.util.List;
import u.E;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.q f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f7118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f7119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f7121f;
    public final int g;

    public p(l0.q qVar, boolean z10, I i10, j jVar) {
        this.f7116a = qVar;
        this.f7117b = z10;
        this.f7118c = i10;
        this.f7119d = jVar;
        this.g = i10.f3926s;
    }

    public static /* synthetic */ List h(int i10, p pVar) {
        return pVar.g((i10 & 1) != 0 ? !pVar.f7117b : false, (i10 & 2) == 0);
    }

    public final p a(g gVar, p241y9.c cVar) {
        j jVar = new j();
        jVar.f7110t = false;
        jVar.f7111u = false;
        cVar.e(jVar);
        p pVar = new p(new o(cVar), false, new I(this.g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        pVar.f7120e = true;
        pVar.f7121f = this;
        return pVar;
    }

    public final void b(I i10, ArrayList arrayList) {
        p011b0.e eVarY = i10.y();
        Object[] objArr = eVarY.f13125r;
        int i11 = eVarY.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (i13.H() && !i13.f3924g0) {
                if (i13.f3914W.g(8)) {
                    arrayList.add(F9.n.b(i13, this.f7117b));
                } else {
                    b(i13, arrayList);
                }
            }
        }
    }

    public final j0 c() {
        if (this.f7120e) {
            p pVarJ = j();
            if (pVarJ != null) {
                return pVarJ.c();
            }
            return null;
        }
        InterfaceC0290m interfaceC0290mZ = F9.n.z(this.f7118c);
        if (interfaceC0290mZ == null) {
            interfaceC0290mZ = this.f7116a;
        }
        return AbstractC0283f.v(interfaceC0290mZ, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.l()) {
                arrayList2.add(pVar);
            } else if (!pVar.f7119d.f7111u) {
                pVar.d(arrayList, arrayList2);
            }
        }
    }

    public final p171r0.e e() {
        j0 j0VarC = c();
        if (j0VarC != null) {
            if (!j0VarC.E0().f19338E) {
                j0VarC = null;
            }
            if (j0VarC != null) {
                return a0.d(j0VarC).J(j0VarC, true);
            }
        }
        return p171r0.e.f21388e;
    }

    public final p171r0.e f() {
        j0 j0VarC = c();
        if (j0VarC != null) {
            if (!j0VarC.E0().f19338E) {
                j0VarC = null;
            }
            if (j0VarC != null) {
                return a0.c(j0VarC);
            }
        }
        return p171r0.e.f21388e;
    }

    public final List g(boolean z10, boolean z11) {
        if (!z10 && this.f7119d.f7111u) {
            return p120l9.r.f19440r;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final j i() {
        boolean zL = l();
        j jVar = this.f7119d;
        if (!zL) {
            return jVar;
        }
        j jVarB = jVar.b();
        n(new ArrayList(), jVarB);
        return jVarB;
    }

    public final p j() {
        I iU;
        p pVar = this.f7121f;
        if (pVar != null) {
            return pVar;
        }
        I i10 = this.f7118c;
        boolean z10 = this.f7117b;
        if (!z10) {
            iU = null;
            break;
        }
        iU = i10.u();
        while (true) {
            if (iU == null) {
                iU = null;
                break;
            }
            j jVarW = iU.w();
            if (jVarW != null && jVarW.f7110t) {
                break;
            }
            iU = iU.u();
        }
        if (iU == null) {
            for (I iU2 = i10.u(); iU2 != null; iU2 = iU2.u()) {
                if (iU2.f3914W.g(8)) {
                    iU = iU2;
                }
            }
            iU = null;
        }
        if (iU == null) {
            return null;
        }
        return F9.n.b(iU, z10);
    }

    public final j k() {
        return this.f7119d;
    }

    public final boolean l() {
        return this.f7117b && this.f7119d.f7110t;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean m() {
        if (this.f7120e || !h(4, this).isEmpty()) {
            return false;
        }
        I iU = this.f7118c.u();
        while (iU != null) {
            j jVarW = iU.w();
            if (jVarW != null && jVarW.f7110t) {
                if (iU == null) {
                    return true;
                }
                return false;
            }
            iU = iU.u();
        }
        iU = null;
        if (iU == null) {
            return true;
        }
        return false;
    }

    public final void n(ArrayList arrayList, j jVar) {
        if (this.f7119d.f7111u) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (!pVar.l()) {
                jVar.d(pVar.f7119d);
                pVar.n(arrayList, jVar);
            }
        }
    }

    public final List o(ArrayList arrayList, boolean z10) {
        if (this.f7120e) {
            return p120l9.r.f19440r;
        }
        b(this.f7118c, arrayList);
        if (z10) {
            j jVar = this.f7119d;
            E e10 = jVar.f7108r;
            Object objG = e10.g(s.f7176w);
            if (objG == null) {
                objG = null;
            }
            g gVar = (g) objG;
            if (gVar != null && jVar.f7110t && !arrayList.isEmpty()) {
                arrayList.add(a(gVar, new M0(21, gVar)));
            }
            v vVar = s.f7156a;
            if (e10.c(vVar) && !arrayList.isEmpty() && jVar.f7110t) {
                Object objG2 = e10.g(vVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) p120l9.m.g0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new n(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
