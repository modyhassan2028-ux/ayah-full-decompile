package p153p1;

import Aa.a;
import java.util.ArrayList;
import java.util.Arrays;
import p074h0.i;
import p142o1.g;
import p142o1.h;
import p163q1.b;
import p163q1.c;
import p163q1.e;
import p163q1.j;
import p163q1.l;
import p163q1.m;
import s1.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList f20902g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final i f20903h0 = new i(this);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final e f20904i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public d f20905j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f20906k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final p142o1.e f20907l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f20908m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f20909n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f20910o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20911p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b[] f20912q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public b[] f20913r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f20914s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f20915t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f20916u0;

    public f() {
        e eVar = new e();
        eVar.f21249b = true;
        eVar.f21250c = true;
        eVar.f21252e = new ArrayList();
        new ArrayList();
        eVar.f21253f = null;
        eVar.g = new b();
        eVar.f21254h = new ArrayList();
        eVar.f21248a = this;
        eVar.f21251d = this;
        this.f20904i0 = eVar;
        this.f20905j0 = null;
        this.f20906k0 = false;
        this.f20907l0 = new p142o1.e();
        this.f20910o0 = 0;
        this.f20911p0 = 0;
        this.f20912q0 = new b[4];
        this.f20913r0 = new b[4];
        this.f20914s0 = 263;
        this.f20915t0 = false;
        this.f20916u0 = false;
    }

    @Override // p153p1.e
    public final void A(boolean z10, boolean z11) {
        super.A(z10, z11);
        int size = this.f20902g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f20902g0.get(i10)).A(z10, z11);
        }
    }

    public final void C(e eVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f20910o0 + 1;
            b[] bVarArr = this.f20913r0;
            if (i11 >= bVarArr.length) {
                this.f20913r0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f20913r0;
            int i12 = this.f20910o0;
            bVarArr2[i12] = new b(eVar, 0, this.f20906k0);
            this.f20910o0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f20911p0 + 1;
            b[] bVarArr3 = this.f20912q0;
            if (i13 >= bVarArr3.length) {
                this.f20912q0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f20912q0;
            int i14 = this.f20911p0;
            bVarArr4[i14] = new b(eVar, 1, this.f20906k0);
            this.f20911p0 = i14 + 1;
        }
    }

    public final void D(p142o1.e eVar) {
        int i10;
        int i11;
        a(eVar);
        int size = this.f20902g0.size();
        char c10 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            i10 = 1;
            if (i12 >= size) {
                break;
            }
            e eVar2 = (e) this.f20902g0.get(i12);
            boolean[] zArr = eVar2.f20859I;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar2 instanceof a) {
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            for (int i13 = 0; i13 < size; i13++) {
                e eVar3 = (e) this.f20902g0.get(i13);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    for (int i14 = 0; i14 < aVar.f20974h0; i14++) {
                        e eVar4 = aVar.f20973g0[i14];
                        int i15 = aVar.f20822i0;
                        if (i15 == 0 || i15 == 1) {
                            eVar4.f20859I[0] = true;
                        } else if (i15 == 2 || i15 == 3) {
                            eVar4.f20859I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < size; i16++) {
            e eVar5 = (e) this.f20902g0.get(i16);
            eVar5.getClass();
            if ((eVar5 instanceof h) || (eVar5 instanceof i)) {
                eVar5.a(eVar);
            }
        }
        int i17 = 0;
        while (i17 < size) {
            e eVar6 = (e) this.f20902g0.get(i17);
            boolean z11 = eVar6 instanceof f;
            d dVar = d.f20847s;
            if (z11) {
                d[] dVarArr = eVar6.f20860J;
                d dVar2 = dVarArr[c10];
                d dVar3 = dVarArr[i10];
                d dVar4 = d.f20846r;
                if (dVar2 == dVar) {
                    eVar6.x(dVar4);
                }
                if (dVar3 == dVar) {
                    eVar6.y(dVar4);
                }
                eVar6.a(eVar);
                if (dVar2 == dVar) {
                    eVar6.x(dVar2);
                }
                if (dVar3 == dVar) {
                    eVar6.y(dVar3);
                }
                i11 = i10;
            } else {
                eVar6.f20884h = -1;
                c cVar = eVar6.f20853C;
                c cVar2 = eVar6.f20852B;
                c cVar3 = eVar6.f20901z;
                c cVar4 = eVar6.f20851A;
                c cVar5 = eVar6.f20900y;
                eVar6.f20885i = -1;
                d dVar5 = this.f20860J[c10];
                d dVar6 = d.f20849u;
                if (dVar5 == dVar || eVar6.f20860J[c10] != dVar6) {
                    i11 = i10;
                } else {
                    int i18 = cVar5.f20844e;
                    i11 = i10;
                    int iM = m() - cVar4.f20844e;
                    cVar5.g = eVar.j(cVar5);
                    cVar4.g = eVar.j(cVar4);
                    eVar.d(cVar5.g, i18);
                    eVar.d(cVar4.g, iM);
                    eVar6.f20884h = 2;
                    eVar6.f20866P = i18;
                    int i19 = iM - i18;
                    eVar6.f20862L = i19;
                    int i20 = eVar6.S;
                    if (i19 < i20) {
                        eVar6.f20862L = i20;
                    }
                }
                if (this.f20860J[i11] != dVar && eVar6.f20860J[i11] == dVar6) {
                    int i21 = cVar3.f20844e;
                    int iJ = j() - cVar2.f20844e;
                    cVar3.g = eVar.j(cVar3);
                    cVar2.g = eVar.j(cVar2);
                    eVar.d(cVar3.g, i21);
                    eVar.d(cVar2.g, iJ);
                    if (eVar6.R > 0 || eVar6.f20869X == 8) {
                        h hVarJ = eVar.j(cVar);
                        cVar.g = hVarJ;
                        eVar.d(hVarJ, eVar6.R + i21);
                    }
                    eVar6.f20885i = 2;
                    eVar6.Q = i21;
                    int i22 = iJ - i21;
                    eVar6.f20863M = i22;
                    int i23 = eVar6.T;
                    if (i22 < i23) {
                        eVar6.f20863M = i23;
                    }
                }
                if (!(eVar6 instanceof h) && !(eVar6 instanceof i)) {
                    eVar6.a(eVar);
                }
            }
            i17++;
            i10 = i11;
            c10 = 0;
        }
        int i24 = i10;
        if (this.f20910o0 > 0) {
            k.a(this, eVar, 0);
        }
        if (this.f20911p0 > 0) {
            k.a(this, eVar, i24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        d dVar;
        boolean z13;
        e eVar = this.f20904i0;
        ArrayList arrayList = eVar.f21252e;
        f fVar = eVar.f21248a;
        d dVarI = fVar.i(0);
        l lVar = fVar.f20880e;
        j jVar = fVar.f20878d;
        d dVarI2 = fVar.i(1);
        int iN = fVar.n();
        int iO = fVar.o();
        d dVar2 = d.f20846r;
        if (z10 && (dVarI == (dVar = d.f20847s) || dVarI2 == dVar)) {
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z13 = z10;
                    break;
                }
                Object obj = arrayList.get(i13);
                i13++;
                m mVar = (m) obj;
                if (mVar.f21276f == i10 && !mVar.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && dVarI == dVar) {
                    fVar.x(dVar2);
                    fVar.z(eVar.d(fVar, 0));
                    jVar.f21275e.d(fVar.m());
                }
            } else if (z13 && dVarI2 == dVar) {
                fVar.y(dVar2);
                fVar.w(eVar.d(fVar, 1));
                lVar.f21275e.d(fVar.j());
            }
        }
        d dVar3 = d.f20849u;
        if (i10 == 0) {
            i11 = 0;
            d dVar4 = fVar.f20860J[0];
            if (dVar4 == dVar2 || dVar4 == dVar3) {
                int iM = fVar.m() + iN;
                jVar.f21278i.d(iM);
                jVar.f21275e.d(iM - iN);
                i12 = 1;
                z11 = true;
            } else {
                z11 = true;
                i12 = i11;
            }
        } else {
            i11 = 0;
            z11 = true;
            d dVar5 = fVar.f20860J[1];
            if (dVar5 == dVar2 || dVar5 == dVar3) {
                int iJ = fVar.j() + iO;
                lVar.f21278i.d(iJ);
                lVar.f21275e.d(iJ - iO);
                i12 = 1;
            } else {
                i12 = i11;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i14 = i11;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            m mVar2 = (m) obj2;
            if (mVar2.f21276f == i10 && (mVar2.f21272b != fVar || mVar2.g)) {
                mVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i15 = i11;
        while (i15 < size3) {
            Object obj3 = arrayList.get(i15);
            i15++;
            m mVar3 = (m) obj3;
            if (mVar3.f21276f == i10 && (i12 != 0 || mVar3.f21272b != fVar)) {
                if (!mVar3.f21277h.j || !mVar3.f21278i.j || (!(mVar3 instanceof c) && !mVar3.f21275e.j)) {
                    z12 = i11;
                    fVar.x(dVarI);
                    fVar.y(dVarI2);
                    return z12;
                }
            }
        }
        z12 = z11;
        fVar.x(dVarI);
        fVar.y(dVarI2);
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0200 A[PHI: r0 r14
      0x0200: PHI (r0v18 ??) = (r0v17 ??), (r0v20 ??), (r0v20 ??), (r0v20 ??) binds: [B:89:0x01c6, B:98:0x01ea, B:99:0x01ec, B:101:0x01f2] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r14v5 boolean) = (r14v4 boolean), (r14v7 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:89:0x01c6, B:98:0x01ea, B:99:0x01ec, B:101:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[LOOP:3: B:59:0x0103->B:60:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a A[LOOP:5: B:62:0x0118->B:63:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v39 */
    public final void F() {
        boolean z10;
        ?? r17;
        ?? r13;
        boolean[] zArr;
        int i10;
        ?? r10;
        int iMax;
        int iM;
        d dVar;
        boolean z11;
        ?? r11;
        int iMax2;
        boolean z12;
        ?? r12;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r18;
        int size;
        int i11;
        ?? r19;
        boolean z13 = false;
        this.f20866P = 0;
        this.Q = 0;
        int iMax3 = Math.max(0, m());
        int iMax4 = Math.max(0, j());
        this.f20915t0 = false;
        this.f20916u0 = false;
        int i12 = this.f20914s0;
        boolean z14 = true;
        boolean z15 = (i12 & 64) == 64 || (i12 & 128) == 128;
        p142o1.e eVar = this.f20907l0;
        eVar.getClass();
        eVar.f20234f = false;
        if (this.f20914s0 != 0 && z15) {
            eVar.f20234f = true;
        }
        d[] dVarArr = this.f20860J;
        d dVar2 = dVarArr[1];
        d dVar3 = dVarArr[0];
        ArrayList arrayList = this.f20902g0;
        d dVar4 = d.f20847s;
        boolean z16 = dVar3 == dVar4 || dVar2 == dVar4;
        this.f20910o0 = 0;
        this.f20911p0 = 0;
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            e eVar2 = (e) this.f20902g0.get(i13);
            if (eVar2 instanceof f) {
                ((f) eVar2).F();
            }
        }
        int i14 = 0;
        boolean z17 = false;
        ?? r110 = 1;
        boolean z18 = z16;
        while (r110 != 0) {
            int i15 = i14 + 1;
            try {
                eVar.r();
                this.f20910o0 = z13 ? 1 : 0;
                this.f20911p0 = z13 ? 1 : 0;
                g(eVar);
                int i16 = z13 ? 1 : 0;
                while (i16 < size2) {
                    z10 = z13;
                    try {
                        ((e) this.f20902g0.get(i16)).g(eVar);
                        i16++;
                        z13 = z10 ? 1 : 0;
                    } catch (Exception e10) {
                        e = e10;
                        r19 = r110;
                        e.printStackTrace();
                        r17 = z14;
                        System.out.println("EXCEPTION : " + e);
                        r13 = r19;
                        zArr = k.f20975a;
                        if (r13 != 0) {
                            zArr[2] = z10;
                            B(eVar);
                            size = this.f20902g0.size();
                            for (i11 = z10 ? 1 : 0; i11 < size; i11++) {
                                ((e) this.f20902g0.get(i11)).B(eVar);
                            }
                        } else {
                            B(eVar);
                            for (i10 = z10 ? 1 : 0; i10 < size2; i10++) {
                                ((e) this.f20902g0.get(i10)).B(eVar);
                            }
                        }
                        if (z18 == 0) {
                            r10 = z10 ? 1 : 0;
                        } else {
                            r10 = z10 ? 1 : 0;
                        }
                        r10 = r18;
                        r10 = r18;
                        iMax = Math.max(this.S, m());
                        iM = m();
                        dVar = d.f20846r;
                        r11 = r10;
                        z11 = z17;
                        if (iMax > iM) {
                            z(iMax);
                            this.f20860J[z10 ? 1 : 0] = dVar;
                            ?? r20 = r17;
                            z11 = r20 == true ? 1 : 0;
                            r11 = r20;
                        }
                        iMax2 = Math.max(this.T, j());
                        r12 = r11;
                        z12 = z11;
                        if (iMax2 > j()) {
                            w(iMax2);
                            this.f20860J[r17] = dVar;
                            r16 = r17;
                            z12 = r16 == true ? 1 : 0;
                        }
                        if (z12) {
                            r12 = r16;
                            r14 = r12;
                        } else {
                            if (this.f20860J[z10 ? 1 : 0] == dVar4) {
                                r12 = r16;
                                r15 = r17;
                                r12 = r12;
                                z12 = z12;
                            } else {
                                r12 = r16;
                                r15 = r17;
                                r12 = r12;
                                z12 = z12;
                            }
                            if (this.f20860J[r15] == dVar4) {
                                r12 = r16;
                                r14 = r12;
                            } else {
                                r12 = r16;
                                r14 = r12;
                            }
                        }
                        i14 = i15;
                        z13 = z10 ? 1 : 0;
                        z18 = z18;
                        z14 = true;
                        r110 = r14;
                        z17 = z12;
                    }
                }
                z10 = z13;
                D(eVar);
                try {
                    g gVar = eVar.f20230b;
                    if (eVar.f20234f) {
                        int i17 = z10 ? 1 : 0;
                        while (true) {
                            if (i17 >= eVar.f20236i) {
                                for (int i18 = z10 ? 1 : 0; i18 < eVar.f20236i; i18++) {
                                    p142o1.c cVar = eVar.f20233e[i18];
                                    cVar.f20222a.f20250e = cVar.f20223b;
                                }
                                break;
                            }
                            if (!eVar.f20233e[i17].f20226e) {
                                eVar.o(gVar);
                                break;
                            }
                            i17++;
                        }
                    } else {
                        eVar.o(gVar);
                    }
                    boolean z19 = z14;
                    r17 = z19 ? 1 : 0;
                    r13 = z19;
                } catch (Exception e11) {
                    e = e11;
                    r19 = z14;
                    e.printStackTrace();
                    r17 = z14;
                    System.out.println("EXCEPTION : " + e);
                    r13 = r19;
                }
            } catch (Exception e12) {
                e = e12;
                z10 = z13 ? 1 : 0;
                r19 = r110;
            }
            zArr = k.f20975a;
            if (r13 != 0) {
                zArr[2] = z10;
                B(eVar);
                size = this.f20902g0.size();
                while (i11 < size) {
                    ((e) this.f20902g0.get(i11)).B(eVar);
                }
            } else {
                B(eVar);
                while (i10 < size2) {
                    ((e) this.f20902g0.get(i10)).B(eVar);
                }
            }
            if (z18 == 0 && i15 < 8 && zArr[2]) {
                int i19 = z10 ? 1 : 0;
                int iMax5 = i19;
                int iMax6 = iMax5;
                while (i19 < size2) {
                    e eVar3 = (e) this.f20902g0.get(i19);
                    iMax5 = Math.max(iMax5, eVar3.m() + eVar3.f20866P);
                    iMax6 = Math.max(iMax6, eVar3.j() + eVar3.Q);
                    i19++;
                }
                int iMax7 = Math.max(this.S, iMax5);
                int iMax8 = Math.max(this.T, iMax6);
                if (dVar3 != dVar4 || m() >= iMax7) {
                    r10 = z10 ? 1 : 0;
                    z17 = z17;
                } else {
                    z(iMax7);
                    this.f20860J[z10 ? 1 : 0] = dVar4;
                    r18 = r17;
                    z17 = r18 == true ? 1 : 0;
                }
                if (dVar2 == dVar4 && j() < iMax8) {
                    r10 = r18;
                    w(iMax8);
                    this.f20860J[r17] = dVar4;
                    r10 = r17;
                    z17 = r10 == true ? 1 : 0;
                }
            } else {
                r10 = z10 ? 1 : 0;
            }
            r10 = r18;
            r10 = r18;
            iMax = Math.max(this.S, m());
            iM = m();
            dVar = d.f20846r;
            r11 = r10;
            z11 = z17;
            if (iMax > iM) {
                z(iMax);
                this.f20860J[z10 ? 1 : 0] = dVar;
                ?? r21 = r17;
                z11 = r21 == true ? 1 : 0;
                r11 = r21;
            }
            iMax2 = Math.max(this.T, j());
            r12 = r11;
            z12 = z11;
            if (iMax2 > j()) {
                w(iMax2);
                this.f20860J[r17] = dVar;
                r16 = r17;
                z12 = r16 == true ? 1 : 0;
            }
            if (z12) {
                r12 = r16;
                r14 = r12;
            } else {
                if (this.f20860J[z10 ? 1 : 0] == dVar4 || iMax3 <= 0 || m() <= iMax3) {
                    r12 = r16;
                    r15 = r17;
                    r12 = r12;
                    z12 = z12;
                } else {
                    ?? r22 = r17;
                    this.f20915t0 = r22;
                    this.f20860J[z10 ? 1 : 0] = dVar;
                    z(iMax3);
                    boolean z20 = r22 == true ? 1 : 0;
                    z12 = z20 ? 1 : 0;
                    r12 = z20;
                    r15 = r22;
                }
                if (this.f20860J[r15] == dVar4 || iMax4 <= 0 || j() <= iMax4) {
                    r12 = r16;
                    r14 = r12;
                } else {
                    this.f20916u0 = r15;
                    this.f20860J[r15] = dVar;
                    w(iMax4);
                    r14 = 1;
                    z12 = true;
                }
            }
            i14 = i15;
            z13 = z10 ? 1 : 0;
            z18 = z18;
            z14 = true;
            r110 = r14;
            z17 = z12;
        }
        boolean z21 = z13 ? 1 : 0;
        this.f20902g0 = arrayList;
        if (z17) {
            d[] dVarArr2 = this.f20860J;
            dVarArr2[z21 ? 1 : 0] = dVar3;
            dVarArr2[1] = dVar2;
        }
        v(eVar.f20237k);
    }

    public final void G() {
        d dVar;
        d dVar2;
        ArrayList arrayList = (ArrayList) this.f20903h0.f16422s;
        arrayList.clear();
        int size = this.f20902g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f20902g0.get(i10);
            d[] dVarArr = eVar.f20860J;
            d dVar3 = dVarArr[0];
            d dVar4 = d.f20848t;
            if (dVar3 == dVar4 || dVar3 == (dVar = d.f20849u) || (dVar2 = dVarArr[1]) == dVar4 || dVar2 == dVar) {
                arrayList.add(eVar);
            }
        }
        this.f20904i0.f21249b = true;
    }

    @Override // p153p1.e
    public final void t() {
        this.f20907l0.r();
        this.f20908m0 = 0;
        this.f20909n0 = 0;
        this.f20902g0.clear();
        super.t();
    }

    @Override // p153p1.e
    public final void v(a aVar) {
        super.v(aVar);
        int size = this.f20902g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f20902g0.get(i10)).v(aVar);
        }
    }
}
