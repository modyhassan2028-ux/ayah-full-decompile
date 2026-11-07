package p163q1;

import android.support.v4.media.session.p;
import java.util.ArrayList;
import p153p1.d;
import p153p1.e;
import p153p1.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f21246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21247l;

    public c(e eVar, int i10) {
        e eVar2;
        super(eVar);
        ArrayList arrayList = new ArrayList();
        this.f21246k = arrayList;
        this.f21276f = i10;
        e eVar3 = this.f21272b;
        e eVarL = eVar3.l(i10);
        while (true) {
            eVar2 = eVar3;
            eVar3 = eVarL;
            if (eVar3 == null) {
                break;
            } else {
                eVarL = eVar3.l(this.f21276f);
            }
        }
        this.f21272b = eVar2;
        int i11 = this.f21276f;
        arrayList.add(i11 == 0 ? eVar2.f20878d : i11 == 1 ? eVar2.f20880e : null);
        e eVarK = eVar2.k(this.f21276f);
        while (eVarK != null) {
            int i12 = this.f21276f;
            arrayList.add(i12 == 0 ? eVarK.f20878d : i12 == 1 ? eVarK.f20880e : null);
            eVarK = eVarK.k(this.f21276f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            m mVar = (m) obj;
            int i14 = this.f21276f;
            if (i14 == 0) {
                mVar.f21272b.f20874b = this;
            } else if (i14 == 1) {
                mVar.f21272b.f20876c = this;
            }
        }
        if (this.f21276f == 0 && ((f) this.f21272b.f20861K).f20906k0 && arrayList.size() > 1) {
            this.f21272b = ((m) p123m2.c.q(1, arrayList)).f21272b;
        }
        this.f21247l = this.f21276f == 0 ? this.f21272b.f20871Z : this.f21272b.f20873a0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01c2 A[PHI: r1 r27
      0x01c2: PHI (r1v58 int) = (r1v56 int), (r1v61 int) binds: [B:121:0x01c0, B:112:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r27v1 int) = (r27v0 int), (r27v3 int) binds: [B:121:0x01c0, B:112:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8 A[ADDED_TO_REGION] */
    @Override // p163q1.d
    public final void a(d dVar) {
        int i10;
        int i11;
        d dVar2;
        boolean z10;
        float f3;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        int i18;
        int i19;
        int iMax;
        int i20;
        int i21;
        float f10;
        f fVar = this.f21277h;
        if (fVar.j) {
            f fVar2 = this.f21278i;
            if (fVar2.j) {
                e eVar = this.f21272b.f20861K;
                boolean z11 = (eVar == null || !(eVar instanceof f)) ? false : ((f) eVar).f20906k0;
                int i22 = fVar2.g - fVar.g;
                ArrayList arrayList = this.f21246k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (((m) arrayList.get(i23)).f21272b.f20869X != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                for (int i25 = i24; i25 >= 0; i25--) {
                    if (((m) arrayList.get(i25)).f21272b.f20869X != 8) {
                        i10 = i25;
                        break;
                    }
                }
                int i26 = 0;
                while (true) {
                    dVar2 = d.f20848t;
                    if (i26 >= 2) {
                        z10 = z11;
                        f3 = 0.0f;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        break;
                    }
                    f3 = 0.0f;
                    int i27 = 0;
                    i14 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i27 < size) {
                        m mVar = (m) arrayList.get(i27);
                        boolean z12 = z11;
                        e eVar2 = mVar.f21272b;
                        int i30 = i26;
                        if (eVar2.f20869X != i11) {
                            i29++;
                            if (i27 > 0 && i27 >= i23) {
                                i14 += mVar.f21277h.f21260f;
                            }
                            g gVar = mVar.f21275e;
                            int i31 = gVar.g;
                            boolean z13 = mVar.f21274d != dVar2;
                            if (z13) {
                                int i32 = this.f21276f;
                                if (i32 == 0 && !eVar2.f20878d.f21275e.j) {
                                    return;
                                }
                                if (i32 == 1 && !eVar2.f20880e.f21275e.j) {
                                    return;
                                } else {
                                    i20 = i14;
                                }
                            } else {
                                i20 = i14;
                                if (mVar.f21271a == 1 && i30 == 0) {
                                    i21 = gVar.f21265m;
                                    i28++;
                                } else {
                                    if (gVar.j) {
                                        i21 = i31;
                                    }
                                    if (z13) {
                                        i14 = i20 + i21;
                                    } else {
                                        i28++;
                                        f10 = eVar2.f20875b0[this.f21276f];
                                        if (f10 >= 0.0f) {
                                            f3 += f10;
                                        }
                                        i14 = i20;
                                    }
                                    if (i27 >= i24 && i27 < i10) {
                                        i14 += -mVar.f21278i.f21260f;
                                    }
                                }
                                z13 = true;
                                if (z13) {
                                    i28++;
                                    f10 = eVar2.f20875b0[this.f21276f];
                                    if (f10 >= 0.0f) {
                                        f3 += f10;
                                    }
                                    i14 = i20;
                                } else {
                                    i14 = i20 + i21;
                                }
                                if (i27 >= i24) {
                                }
                            }
                            i21 = i31;
                            if (z13) {
                                i28++;
                                f10 = eVar2.f20875b0[this.f21276f];
                                if (f10 >= 0.0f) {
                                    f3 += f10;
                                }
                                i14 = i20;
                            } else {
                                i14 = i20 + i21;
                            }
                            if (i27 >= i24) {
                            }
                        }
                        i27++;
                        z11 = z12;
                        i26 = i30;
                        i11 = 8;
                    }
                    z10 = z11;
                    int i33 = i26;
                    if (i14 < i22 || i28 == 0) {
                        i12 = i28;
                        i13 = i29;
                        break;
                    } else {
                        i26 = i33 + 1;
                        z11 = z10;
                        i11 = 8;
                    }
                }
                int i34 = fVar.g;
                if (z10) {
                    i34 = fVar2.g;
                }
                float f11 = 0.5f;
                if (i14 > i22) {
                    i34 = z10 ? i34 + ((int) (((i14 - i22) / 2.0f) + 0.5f)) : i34 - ((int) (((i14 - i22) / 2.0f) + 0.5f));
                }
                if (i12 > 0) {
                    float f12 = i22 - i14;
                    int i35 = (int) ((f12 / i12) + 0.5f);
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < size) {
                        float f13 = f11;
                        m mVar2 = (m) arrayList.get(i36);
                        int i38 = i34;
                        e eVar3 = mVar2.f21272b;
                        int i39 = i12;
                        g gVar2 = mVar2.f21275e;
                        float f14 = f12;
                        int i40 = i35;
                        if (eVar3.f20869X == 8 || mVar2.f21274d != dVar2 || gVar2.j) {
                            i19 = i36;
                        } else {
                            int i41 = f3 > 0.0f ? (int) (((eVar3.f20875b0[this.f21276f] * f14) / f3) + f13) : i40;
                            if (this.f21276f == 0) {
                                int i42 = eVar3.f20889n;
                                i19 = i36;
                                iMax = Math.max(eVar3.f20888m, mVar2.f21271a == 1 ? Math.min(i41, gVar2.f21265m) : i41);
                                if (i42 > 0) {
                                    iMax = Math.min(i42, iMax);
                                }
                                if (iMax != i41) {
                                    i37++;
                                    i41 = iMax;
                                }
                            } else {
                                i19 = i36;
                                int i43 = eVar3.f20892q;
                                iMax = Math.max(eVar3.f20891p, mVar2.f21271a == 1 ? Math.min(i41, gVar2.f21265m) : i41);
                                if (i43 > 0) {
                                    iMax = Math.min(i43, iMax);
                                }
                                if (iMax != i41) {
                                    i37++;
                                    i41 = iMax;
                                }
                            }
                            gVar2.d(i41);
                        }
                        i36 = i19 + 1;
                        i34 = i38;
                        f11 = f13;
                        i12 = i39;
                        f12 = f14;
                        i35 = i40;
                    }
                    i15 = i34;
                    f7 = f11;
                    int i44 = i12;
                    if (i37 > 0) {
                        i12 = i44 - i37;
                        i14 = 0;
                        for (int i45 = 0; i45 < size; i45++) {
                            m mVar3 = (m) arrayList.get(i45);
                            if (mVar3.f21272b.f20869X != 8) {
                                if (i45 > 0 && i45 >= i23) {
                                    i14 += mVar3.f21277h.f21260f;
                                }
                                i14 += mVar3.f21275e.g;
                                if (i45 < i24 && i45 < i10) {
                                    i14 += -mVar3.f21278i.f21260f;
                                }
                            }
                        }
                    } else {
                        i12 = i44;
                    }
                    i17 = 2;
                    if (this.f21247l == 2 && i37 == 0) {
                        i16 = 0;
                        this.f21247l = 0;
                    } else {
                        i16 = 0;
                    }
                } else {
                    i15 = i34;
                    f7 = 0.5f;
                    i16 = 0;
                    i17 = 2;
                }
                if (i14 > i22) {
                    this.f21247l = i17;
                }
                if (i13 > 0 && i12 == 0 && i23 == i10) {
                    this.f21247l = i17;
                }
                int i46 = this.f21247l;
                if (i46 == 1) {
                    int i47 = i13 > 1 ? (i22 - i14) / (i13 - 1) : i13 == 1 ? (i22 - i14) / 2 : i16;
                    if (i12 > 0) {
                        i47 = i16;
                    }
                    int i48 = i15;
                    for (int i49 = i16; i49 < size; i49++) {
                        m mVar4 = (m) arrayList.get(z10 ? size - (i49 + 1) : i49);
                        e eVar4 = mVar4.f21272b;
                        f fVar3 = mVar4.f21278i;
                        f fVar4 = mVar4.f21277h;
                        if (eVar4.f20869X == 8) {
                            fVar4.d(i48);
                            fVar3.d(i48);
                        } else {
                            if (i49 > 0) {
                                i48 = z10 ? i48 - i47 : i48 + i47;
                            }
                            if (i49 > 0 && i49 >= i23) {
                                i48 = z10 ? i48 - fVar4.f21260f : i48 + fVar4.f21260f;
                            }
                            if (z10) {
                                fVar3.d(i48);
                            } else {
                                fVar4.d(i48);
                            }
                            g gVar3 = mVar4.f21275e;
                            int i50 = gVar3.g;
                            if (mVar4.f21274d == dVar2) {
                                i18 = i48;
                                if (mVar4.f21271a == 1) {
                                    i50 = gVar3.f21265m;
                                }
                            } else {
                                i18 = i48;
                            }
                            i48 = z10 ? i18 - i50 : i18 + i50;
                            if (z10) {
                                fVar4.d(i48);
                            } else {
                                fVar3.d(i48);
                            }
                            mVar4.g = true;
                            if (i49 < i24 && i49 < i10) {
                                i48 = z10 ? i48 - (-fVar3.f21260f) : i48 + (-fVar3.f21260f);
                            }
                        }
                    }
                    return;
                }
                if (i46 == 0) {
                    int i51 = (i22 - i14) / (i13 + 1);
                    if (i12 > 0) {
                        i51 = i16;
                    }
                    int i52 = i15;
                    for (int i53 = i16; i53 < size; i53++) {
                        m mVar5 = (m) arrayList.get(z10 ? size - (i53 + 1) : i53);
                        e eVar5 = mVar5.f21272b;
                        f fVar5 = mVar5.f21278i;
                        f fVar6 = mVar5.f21277h;
                        if (eVar5.f20869X == 8) {
                            fVar6.d(i52);
                            fVar5.d(i52);
                        } else {
                            int i54 = z10 ? i52 - i51 : i52 + i51;
                            if (i53 > 0 && i53 >= i23) {
                                i54 = z10 ? i54 - fVar6.f21260f : i54 + fVar6.f21260f;
                            }
                            if (z10) {
                                fVar5.d(i54);
                            } else {
                                fVar6.d(i54);
                            }
                            g gVar4 = mVar5.f21275e;
                            int iMin = gVar4.g;
                            if (mVar5.f21274d == dVar2 && mVar5.f21271a == 1) {
                                iMin = Math.min(iMin, gVar4.f21265m);
                            }
                            i52 = z10 ? i54 - iMin : i54 + iMin;
                            if (z10) {
                                fVar6.d(i52);
                            } else {
                                fVar5.d(i52);
                            }
                            if (i53 < i24 && i53 < i10) {
                                i52 = z10 ? i52 - (-fVar5.f21260f) : i52 + (-fVar5.f21260f);
                            }
                        }
                    }
                    return;
                }
                if (i46 == 2) {
                    float f15 = this.f21276f == 0 ? this.f21272b.U : this.f21272b.f20867V;
                    if (z10) {
                        f15 = 1.0f - f15;
                    }
                    int i55 = (int) (((i22 - i14) * f15) + f7);
                    if (i55 < 0 || i12 > 0) {
                        i55 = i16;
                    }
                    int i56 = z10 ? i15 - i55 : i15 + i55;
                    for (int i57 = i16; i57 < size; i57++) {
                        m mVar6 = (m) arrayList.get(z10 ? size - (i57 + 1) : i57);
                        e eVar6 = mVar6.f21272b;
                        f fVar7 = mVar6.f21278i;
                        f fVar8 = mVar6.f21277h;
                        if (eVar6.f20869X == 8) {
                            fVar8.d(i56);
                            fVar7.d(i56);
                        } else {
                            if (i57 > 0 && i57 >= i23) {
                                i56 = z10 ? i56 - fVar8.f21260f : i56 + fVar8.f21260f;
                            }
                            if (z10) {
                                fVar7.d(i56);
                            } else {
                                fVar8.d(i56);
                            }
                            g gVar5 = mVar6.f21275e;
                            int i58 = gVar5.g;
                            if (mVar6.f21274d == dVar2 && mVar6.f21271a == 1) {
                                i58 = gVar5.f21265m;
                            }
                            i56 = z10 ? i56 - i58 : i56 + i58;
                            if (z10) {
                                fVar8.d(i56);
                            } else {
                                fVar7.d(i56);
                            }
                            if (i57 < i24 && i57 < i10) {
                                i56 = z10 ? i56 - (-fVar7.f21260f) : i56 + (-fVar7.f21260f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p163q1.m
    public final void d() {
        ArrayList arrayList = this.f21246k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        e eVar = ((m) arrayList.get(0)).f21272b;
        e eVar2 = ((m) arrayList.get(size2 - 1)).f21272b;
        int i11 = this.f21276f;
        f fVar = this.f21278i;
        f fVar2 = this.f21277h;
        if (i11 == 0) {
            p153p1.c cVar = eVar.f20900y;
            p153p1.c cVar2 = eVar2.f20851A;
            f fVarI = m.i(cVar, 0);
            int iC = cVar.c();
            e eVarM = m();
            if (eVarM != null) {
                iC = eVarM.f20900y.c();
            }
            if (fVarI != null) {
                m.b(fVar2, fVarI, iC);
            }
            f fVarI2 = m.i(cVar2, 0);
            int iC2 = cVar2.c();
            e eVarN = n();
            if (eVarN != null) {
                iC2 = eVarN.f20851A.c();
            }
            if (fVarI2 != null) {
                m.b(fVar, fVarI2, -iC2);
            }
        } else {
            p153p1.c cVar3 = eVar.f20901z;
            p153p1.c cVar4 = eVar2.f20852B;
            f fVarI3 = m.i(cVar3, 1);
            int iC3 = cVar3.c();
            e eVarM2 = m();
            if (eVarM2 != null) {
                iC3 = eVarM2.f20901z.c();
            }
            if (fVarI3 != null) {
                m.b(fVar2, fVarI3, iC3);
            }
            f fVarI4 = m.i(cVar4, 1);
            int iC4 = cVar4.c();
            e eVarN2 = n();
            if (eVarN2 != null) {
                iC4 = eVarN2.f20852B.c();
            }
            if (fVarI4 != null) {
                m.b(fVar, fVarI4, -iC4);
            }
        }
        fVar2.f21255a = this;
        fVar.f21255a = this;
    }

    @Override // p163q1.m
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21246k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // p163q1.m
    public final void f() {
        this.f21273c = null;
        ArrayList arrayList = this.f21246k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).f();
        }
    }

    @Override // p163q1.m
    public final long j() {
        ArrayList arrayList = this.f21246k;
        int size = arrayList.size();
        long j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            j = ((long) mVar.f21278i.f21260f) + mVar.j() + j + ((long) mVar.f21277h.f21260f);
        }
        return j;
    }

    @Override // p163q1.m
    public final boolean k() {
        ArrayList arrayList = this.f21246k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((m) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final e m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21246k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = ((m) arrayList.get(i10)).f21272b;
            if (eVar.f20869X != 8) {
                return eVar;
            }
            i10++;
        }
    }

    public final e n() {
        ArrayList arrayList = this.f21246k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = ((m) arrayList.get(size)).f21272b;
            if (eVar.f20869X != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f21276f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f21246k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            strConcat = p.z(p.z(strConcat, "<") + ((m) obj), "> ");
        }
        return strConcat;
    }
}
