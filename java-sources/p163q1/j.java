package p163q1;

import W.AbstractC0607v1;
import java.util.ArrayList;
import p153p1.c;
import p153p1.d;
import p153p1.e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f21266k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f3, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f3) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f3) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f3) + 0.5f);
        int i18 = (int) ((i15 / f3) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0264  */
    /* JADX WARN: Code duplicated, block: B:118:0x0274  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // p163q1.d
    public final void a(d dVar) {
        float f3;
        int iG;
        int i10;
        int iG2;
        float f7;
        float f10;
        float f11;
        int i11;
        if (AbstractC0607v1.b(this.j) == 3) {
            e eVar = this.f21272b;
            l(eVar.f20900y, eVar.f20851A, 0);
            return;
        }
        g gVar = this.f21275e;
        boolean z10 = gVar.j;
        d dVar2 = d.f20848t;
        f fVar = this.f21277h;
        f fVar2 = this.f21278i;
        if (z10 || this.f21274d != dVar2) {
            f3 = 0.5f;
        } else {
            e eVar2 = this.f21272b;
            int i12 = eVar2.j;
            l lVar = eVar2.f20880e;
            if (i12 == 2) {
                f3 = 0.5f;
                e eVar3 = eVar2.f20861K;
                if (eVar3 != null) {
                    g gVar2 = eVar3.f20878d.f21275e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.g * eVar2.f20890o) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = eVar2.f20886k;
                if (i13 == 0 || i13 == 3) {
                    f fVar3 = lVar.f21277h;
                    f fVar4 = lVar.f21278i;
                    boolean z11 = eVar2.f20900y.f20843d != null;
                    boolean z12 = eVar2.f20901z.f20843d != null;
                    boolean z13 = eVar2.f20851A.f20843d != null;
                    boolean z14 = eVar2.f20852B.f20843d != null;
                    f3 = 0.5f;
                    int i14 = eVar2.f20865O;
                    if (z11 && z12 && z13 && z14) {
                        float f12 = eVar2.f20864N;
                        boolean z15 = fVar3.j;
                        ArrayList arrayList = fVar3.f21264l;
                        int[] iArr = f21266k;
                        if (z15 && fVar4.j) {
                            if (fVar.f21257c && fVar2.f21257c) {
                                m(iArr, ((f) fVar.f21264l.get(0)).g + fVar.f21260f, ((f) fVar2.f21264l.get(0)).g - fVar2.f21260f, fVar3.g + fVar3.f21260f, fVar4.g - fVar4.f21260f, f12, i14);
                                gVar.d(iArr[0]);
                                this.f21272b.f20880e.f21275e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.j && fVar2.j) {
                            if (!fVar3.f21257c || !fVar4.f21257c) {
                                return;
                            }
                            m(iArr, fVar.g + fVar.f21260f, fVar2.g - fVar2.f21260f, ((f) arrayList.get(0)).g + fVar3.f21260f, ((f) fVar4.f21264l.get(0)).g - fVar4.f21260f, f12, i14);
                            gVar.d(iArr[0]);
                            this.f21272b.f20880e.f21275e.d(iArr[1]);
                        }
                        if (!fVar.f21257c || !fVar2.f21257c || !fVar3.f21257c || !fVar4.f21257c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f21264l.get(0)).g + fVar.f21260f, ((f) fVar2.f21264l.get(0)).g - fVar2.f21260f, ((f) arrayList.get(0)).g + fVar3.f21260f, ((f) fVar4.f21264l.get(0)).g - fVar4.f21260f, f12, i14);
                        gVar.d(iArr[0]);
                        this.f21272b.f20880e.f21275e.d(iArr[1]);
                    } else if (z11 && z13) {
                        if (!fVar.f21257c || !fVar2.f21257c) {
                            return;
                        }
                        float f13 = eVar2.f20864N;
                        int i15 = ((f) fVar.f21264l.get(0)).g + fVar.f21260f;
                        int i16 = ((f) fVar2.f21264l.get(0)).g - fVar2.f21260f;
                        if (i14 == -1 || i14 == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * f13) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / f13) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f21272b.f20880e.f21275e.d(iG4);
                        } else if (i14 == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / f13) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * f13) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f21272b.f20880e.f21275e.d(iG6);
                        }
                    } else if (z12 && z14) {
                        if (!fVar3.f21257c || !fVar4.f21257c) {
                            return;
                        }
                        float f14 = eVar2.f20864N;
                        int i19 = ((f) fVar3.f21264l.get(0)).g + fVar3.f21260f;
                        int i20 = ((f) fVar4.f21264l.get(0)).g - fVar4.f21260f;
                        if (i14 == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f14) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f14) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f21272b.f20880e.f21275e.d(iG);
                        } else if (i14 == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * f14) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / f14) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f21272b.f20880e.f21275e.d(iG7);
                        } else if (i14 == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f14) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f14) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f21272b.f20880e.f21275e.d(iG);
                        }
                    }
                } else {
                    int i22 = eVar2.f20865O;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f11 = lVar.f21275e.g / eVar2.f20864N;
                            i11 = (int) (f11 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f7 = lVar.f21275e.g;
                            f10 = eVar2.f20864N;
                        }
                        gVar.d(i11);
                        f3 = 0.5f;
                    } else {
                        f7 = lVar.f21275e.g;
                        f10 = eVar2.f20864N;
                    }
                    f11 = f7 * f10;
                    i11 = (int) (f11 + 0.5f);
                    gVar.d(i11);
                    f3 = 0.5f;
                }
            } else {
                f3 = 0.5f;
            }
        }
        boolean z16 = fVar.f21257c;
        ArrayList arrayList2 = fVar.f21264l;
        if (z16) {
            boolean z17 = fVar2.f21257c;
            ArrayList arrayList3 = fVar2.f21264l;
            if (z17) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.f21274d == dVar2) {
                    e eVar4 = this.f21272b;
                    if (eVar4.j == 0 && !eVar4.r()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i23 = fVar5.g + fVar.f21260f;
                        int i24 = fVar6.g + fVar2.f21260f;
                        fVar.d(i23);
                        fVar2.d(i24);
                        gVar.d(i24 - i23);
                        return;
                    }
                }
                if (!gVar.j && this.f21274d == dVar2 && this.f21271a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).g + fVar2.f21260f) - (((f) arrayList2.get(0)).g + fVar.f21260f), gVar.f21265m);
                    e eVar5 = this.f21272b;
                    int i25 = eVar5.f20889n;
                    int iMax = Math.max(eVar5.f20888m, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i26 = fVar7.g;
                    int i27 = fVar.f21260f + i26;
                    int i28 = fVar8.g;
                    int i29 = fVar2.f21260f + i28;
                    float f15 = this.f21272b.U;
                    if (fVar7 == fVar8) {
                        f15 = f3;
                    } else {
                        i26 = i27;
                        i28 = i29;
                    }
                    fVar.d((int) ((((i28 - i26) - gVar.g) * f15) + i26 + f3));
                    fVar2.d(fVar.g + gVar.g);
                }
            }
        }
    }

    @Override // p163q1.m
    public final void d() {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5 = this.f21272b;
        boolean z10 = eVar5.f20872a;
        g gVar = this.f21275e;
        if (z10) {
            gVar.d(eVar5.m());
        }
        boolean z11 = gVar.j;
        ArrayList arrayList = gVar.f21263k;
        ArrayList arrayList2 = gVar.f21264l;
        d dVar = d.f20849u;
        d dVar2 = d.f20848t;
        d dVar3 = d.f20846r;
        f fVar = this.f21278i;
        f fVar2 = this.f21277h;
        if (!z11) {
            e eVar6 = this.f21272b;
            d dVar4 = eVar6.f20860J[0];
            this.f21274d = dVar4;
            if (dVar4 != dVar2) {
                if (dVar4 == dVar && (((eVar4 = eVar6.f20861K) != null && eVar4.f20860J[0] == dVar3) || eVar4.f20860J[0] == dVar)) {
                    int iM = eVar4.m();
                    j jVar = eVar4.f20878d;
                    int iC = (iM - this.f21272b.f20900y.c()) - this.f21272b.f20851A.c();
                    m.b(fVar2, jVar.f21277h, this.f21272b.f20900y.c());
                    m.b(fVar, jVar.f21278i, -this.f21272b.f20851A.c());
                    gVar.d(iC);
                    return;
                }
                if (dVar4 == dVar3) {
                    gVar.d(eVar6.m());
                }
            }
        } else if (this.f21274d == dVar && (((eVar2 = (eVar = this.f21272b).f20861K) != null && eVar2.f20860J[0] == dVar3) || eVar2.f20860J[0] == dVar)) {
            m.b(fVar2, eVar2.f20878d.f21277h, eVar.f20900y.c());
            m.b(fVar, eVar2.f20878d.f21278i, -this.f21272b.f20851A.c());
            return;
        }
        if (gVar.j) {
            e eVar7 = this.f21272b;
            if (eVar7.f20872a) {
                c[] cVarArr = eVar7.f20857G;
                c cVar = cVarArr[0];
                c cVar2 = cVar.f20843d;
                if (cVar2 != null && cVarArr[1].f20843d != null) {
                    if (eVar7.r()) {
                        fVar2.f21260f = this.f21272b.f20857G[0].c();
                        fVar.f21260f = -this.f21272b.f20857G[1].c();
                        return;
                    }
                    f fVarH = m.h(this.f21272b.f20857G[0]);
                    if (fVarH != null) {
                        m.b(fVar2, fVarH, this.f21272b.f20857G[0].c());
                    }
                    f fVarH2 = m.h(this.f21272b.f20857G[1]);
                    if (fVarH2 != null) {
                        m.b(fVar, fVarH2, -this.f21272b.f20857G[1].c());
                    }
                    fVar2.f21256b = true;
                    fVar.f21256b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = m.h(cVar);
                    if (fVarH3 != null) {
                        m.b(fVar2, fVarH3, this.f21272b.f20857G[0].c());
                        m.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                }
                c cVar3 = cVarArr[1];
                if (cVar3.f20843d != null) {
                    f fVarH4 = m.h(cVar3);
                    if (fVarH4 != null) {
                        m.b(fVar, fVarH4, -this.f21272b.f20857G[1].c());
                        m.b(fVar2, fVar, -gVar.g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof p153p1.j) || eVar7.f20861K == null || eVar7.h(7).f20843d != null) {
                    return;
                }
                e eVar8 = this.f21272b;
                m.b(fVar2, eVar8.f20861K.f20878d.f21277h, eVar8.n());
                m.b(fVar, fVar2, gVar.g);
                return;
            }
        }
        if (this.f21274d == dVar2) {
            e eVar9 = this.f21272b;
            int i10 = eVar9.j;
            l lVar = eVar9.f20880e;
            if (i10 == 2) {
                e eVar10 = eVar9.f20861K;
                if (eVar10 != null) {
                    g gVar2 = eVar10.f20880e.f21275e;
                    arrayList2.add(gVar2);
                    gVar2.f21263k.add(gVar);
                    gVar.f21256b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i10 == 3) {
                if (eVar9.f20886k == 3) {
                    fVar2.f21255a = this;
                    fVar.f21255a = this;
                    lVar.f21277h.f21255a = this;
                    lVar.f21278i.f21255a = this;
                    gVar.f21255a = this;
                    if (eVar9.s()) {
                        arrayList2.add(this.f21272b.f20880e.f21275e);
                        this.f21272b.f20880e.f21275e.f21263k.add(gVar);
                        l lVar2 = this.f21272b.f20880e;
                        lVar2.f21275e.f21255a = this;
                        arrayList2.add(lVar2.f21277h);
                        arrayList2.add(this.f21272b.f20880e.f21278i);
                        this.f21272b.f20880e.f21277h.f21263k.add(gVar);
                        this.f21272b.f20880e.f21278i.f21263k.add(gVar);
                    } else if (this.f21272b.r()) {
                        this.f21272b.f20880e.f21275e.f21264l.add(gVar);
                        arrayList.add(this.f21272b.f20880e.f21275e);
                    } else {
                        this.f21272b.f20880e.f21275e.f21264l.add(gVar);
                    }
                } else {
                    g gVar3 = lVar.f21275e;
                    arrayList2.add(gVar3);
                    gVar3.f21263k.add(gVar);
                    this.f21272b.f20880e.f21277h.f21263k.add(gVar);
                    this.f21272b.f20880e.f21278i.f21263k.add(gVar);
                    gVar.f21256b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f21264l.add(gVar);
                    fVar.f21264l.add(gVar);
                }
            }
        }
        e eVar11 = this.f21272b;
        c[] cVarArr2 = eVar11.f20857G;
        c cVar4 = cVarArr2[0];
        c cVar5 = cVar4.f20843d;
        if (cVar5 != null && cVarArr2[1].f20843d != null) {
            if (eVar11.r()) {
                fVar2.f21260f = this.f21272b.f20857G[0].c();
                fVar.f21260f = -this.f21272b.f20857G[1].c();
                return;
            }
            f fVarH5 = m.h(this.f21272b.f20857G[0]);
            f fVarH6 = m.h(this.f21272b.f20857G[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = m.h(cVar4);
            if (fVarH7 != null) {
                m.b(fVar2, fVarH7, this.f21272b.f20857G[0].c());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        c cVar6 = cVarArr2[1];
        if (cVar6.f20843d != null) {
            f fVarH8 = m.h(cVar6);
            if (fVarH8 != null) {
                m.b(fVar, fVarH8, -this.f21272b.f20857G[1].c());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((eVar11 instanceof p153p1.j) || (eVar3 = eVar11.f20861K) == null) {
            return;
        }
        m.b(fVar2, eVar3.f20878d.f21277h, eVar11.n());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // p163q1.m
    public final void e() {
        f fVar = this.f21277h;
        if (fVar.j) {
            this.f21272b.f20866P = fVar.g;
        }
    }

    @Override // p163q1.m
    public final void f() {
        this.f21273c = null;
        this.f21277h.c();
        this.f21278i.c();
        this.f21275e.c();
        this.g = false;
    }

    @Override // p163q1.m
    public final boolean k() {
        return this.f21274d != d.f20848t || this.f21272b.j == 0;
    }

    public final void n() {
        this.g = false;
        f fVar = this.f21277h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f21278i;
        fVar2.c();
        fVar2.j = false;
        this.f21275e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f21272b.f20870Y;
    }
}
