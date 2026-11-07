package p163q1;

import W.AbstractC0607v1;
import java.util.ArrayList;
import p153p1.c;
import p153p1.d;
import p153p1.e;
import p153p1.j;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f21269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f21270l;

    @Override // p163q1.d
    public final void a(d dVar) {
        float f3;
        float f7;
        float f10;
        int i10;
        if (AbstractC0607v1.b(this.j) == 3) {
            e eVar = this.f21272b;
            l(eVar.f20901z, eVar.f20852B, 1);
            return;
        }
        g gVar = this.f21275e;
        boolean z10 = gVar.f21257c;
        d dVar2 = d.f20848t;
        if (z10 && !gVar.j && this.f21274d == dVar2) {
            e eVar2 = this.f21272b;
            int i11 = eVar2.f20886k;
            if (i11 == 2) {
                e eVar3 = eVar2.f20861K;
                if (eVar3 != null) {
                    g gVar2 = eVar3.f20880e.f21275e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.g * eVar2.f20893r) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                g gVar3 = eVar2.f20878d.f21275e;
                if (gVar3.j) {
                    int i12 = eVar2.f20865O;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f10 = gVar3.g * eVar2.f20864N;
                            i10 = (int) (f10 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f3 = gVar3.g;
                            f7 = eVar2.f20864N;
                        }
                        gVar.d(i10);
                    } else {
                        f3 = gVar3.g;
                        f7 = eVar2.f20864N;
                    }
                    f10 = f3 / f7;
                    i10 = (int) (f10 + 0.5f);
                    gVar.d(i10);
                }
            }
        }
        f fVar = this.f21277h;
        boolean z11 = fVar.f21257c;
        ArrayList arrayList = fVar.f21264l;
        if (z11) {
            f fVar2 = this.f21278i;
            boolean z12 = fVar2.f21257c;
            ArrayList arrayList2 = fVar2.f21264l;
            if (z12) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.f21274d == dVar2) {
                    e eVar4 = this.f21272b;
                    if (eVar4.j == 0 && !eVar4.s()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i13 = fVar3.g + fVar.f21260f;
                        int i14 = fVar4.g + fVar2.f21260f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.j && this.f21274d == dVar2 && this.f21271a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i15 = (((f) arrayList2.get(0)).g + fVar2.f21260f) - (fVar5.g + fVar.f21260f);
                    int i16 = gVar.f21265m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i17 = fVar6.g;
                    int i18 = fVar.f21260f + i17;
                    int i19 = fVar7.g;
                    int i20 = fVar2.f21260f + i19;
                    float f11 = this.f21272b.f20867V;
                    if (fVar6 == fVar7) {
                        f11 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.g) * f11) + i17 + 0.5f));
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
        f fVar = this.f21269k;
        e eVar5 = this.f21272b;
        boolean z10 = eVar5.f20872a;
        g gVar = this.f21275e;
        if (z10) {
            gVar.d(eVar5.j());
        }
        boolean z11 = gVar.j;
        ArrayList arrayList = gVar.f21263k;
        ArrayList arrayList2 = gVar.f21264l;
        d dVar = d.f20849u;
        d dVar2 = d.f20846r;
        d dVar3 = d.f20848t;
        f fVar2 = this.f21278i;
        f fVar3 = this.f21277h;
        if (!z11) {
            e eVar6 = this.f21272b;
            this.f21274d = eVar6.f20860J[1];
            if (eVar6.f20898w) {
                this.f21270l = new a(this);
            }
            d dVar4 = this.f21274d;
            if (dVar4 != dVar3) {
                if (dVar4 == dVar && (eVar4 = this.f21272b.f20861K) != null) {
                    l lVar = eVar4.f20880e;
                    if (eVar4.f20860J[1] == dVar2) {
                        int iJ = (eVar4.j() - this.f21272b.f20901z.c()) - this.f21272b.f20852B.c();
                        m.b(fVar3, lVar.f21277h, this.f21272b.f20901z.c());
                        m.b(fVar2, lVar.f21278i, -this.f21272b.f20852B.c());
                        gVar.d(iJ);
                        return;
                    }
                }
                if (dVar4 == dVar2) {
                    gVar.d(this.f21272b.j());
                }
            }
        } else if (this.f21274d == dVar && (eVar2 = (eVar = this.f21272b).f20861K) != null) {
            l lVar2 = eVar2.f20880e;
            if (eVar2.f20860J[1] == dVar2) {
                m.b(fVar3, lVar2.f21277h, eVar.f20901z.c());
                m.b(fVar2, lVar2.f21278i, -this.f21272b.f20852B.c());
                return;
            }
        }
        boolean z12 = gVar.j;
        if (z12) {
            e eVar7 = this.f21272b;
            if (eVar7.f20872a) {
                c[] cVarArr = eVar7.f20857G;
                c cVar = cVarArr[2];
                c cVar2 = cVar.f20843d;
                if (cVar2 != null && cVarArr[3].f20843d != null) {
                    if (eVar7.s()) {
                        fVar3.f21260f = this.f21272b.f20857G[2].c();
                        fVar2.f21260f = -this.f21272b.f20857G[3].c();
                    } else {
                        f fVarH = m.h(this.f21272b.f20857G[2]);
                        if (fVarH != null) {
                            m.b(fVar3, fVarH, this.f21272b.f20857G[2].c());
                        }
                        f fVarH2 = m.h(this.f21272b.f20857G[3]);
                        if (fVarH2 != null) {
                            m.b(fVar2, fVarH2, -this.f21272b.f20857G[3].c());
                        }
                        fVar3.f21256b = true;
                        fVar2.f21256b = true;
                    }
                    e eVar8 = this.f21272b;
                    if (eVar8.f20898w) {
                        m.b(fVar, fVar3, eVar8.R);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = m.h(cVar);
                    if (fVarH3 != null) {
                        m.b(fVar3, fVarH3, this.f21272b.f20857G[2].c());
                        m.b(fVar2, fVar3, gVar.g);
                        e eVar9 = this.f21272b;
                        if (eVar9.f20898w) {
                            m.b(fVar, fVar3, eVar9.R);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c cVar3 = cVarArr[3];
                if (cVar3.f20843d != null) {
                    f fVarH4 = m.h(cVar3);
                    if (fVarH4 != null) {
                        m.b(fVar2, fVarH4, -this.f21272b.f20857G[3].c());
                        m.b(fVar3, fVar2, -gVar.g);
                    }
                    e eVar10 = this.f21272b;
                    if (eVar10.f20898w) {
                        m.b(fVar, fVar3, eVar10.R);
                        return;
                    }
                    return;
                }
                c cVar4 = cVarArr[4];
                if (cVar4.f20843d != null) {
                    f fVarH5 = m.h(cVar4);
                    if (fVarH5 != null) {
                        m.b(fVar, fVarH5, 0);
                        m.b(fVar3, fVar, -this.f21272b.R);
                        m.b(fVar2, fVar3, gVar.g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof j) || eVar7.f20861K == null || eVar7.h(7).f20843d != null) {
                    return;
                }
                e eVar11 = this.f21272b;
                m.b(fVar3, eVar11.f20861K.f20880e.f21277h, eVar11.o());
                m.b(fVar2, fVar3, gVar.g);
                e eVar12 = this.f21272b;
                if (eVar12.f20898w) {
                    m.b(fVar, fVar3, eVar12.R);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f21274d != dVar3) {
            gVar.b(this);
        } else {
            e eVar13 = this.f21272b;
            int i10 = eVar13.f20886k;
            if (i10 == 2) {
                e eVar14 = eVar13.f20861K;
                if (eVar14 != null) {
                    g gVar2 = eVar14.f20880e.f21275e;
                    arrayList2.add(gVar2);
                    gVar2.f21263k.add(gVar);
                    gVar.f21256b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i10 == 3 && !eVar13.s()) {
                e eVar15 = this.f21272b;
                if (eVar15.j != 3) {
                    g gVar3 = eVar15.f20878d.f21275e;
                    arrayList2.add(gVar3);
                    gVar3.f21263k.add(gVar);
                    gVar.f21256b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        e eVar16 = this.f21272b;
        c[] cVarArr2 = eVar16.f20857G;
        c cVar5 = cVarArr2[2];
        c cVar6 = cVar5.f20843d;
        if (cVar6 != null && cVarArr2[3].f20843d != null) {
            if (eVar16.s()) {
                fVar3.f21260f = this.f21272b.f20857G[2].c();
                fVar2.f21260f = -this.f21272b.f20857G[3].c();
            } else {
                f fVarH6 = m.h(this.f21272b.f20857G[2]);
                f fVarH7 = m.h(this.f21272b.f20857G[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.j = 4;
            }
            if (this.f21272b.f20898w) {
                c(fVar, fVar3, 1, this.f21270l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = m.h(cVar5);
            if (fVarH8 != null) {
                m.b(fVar3, fVarH8, this.f21272b.f20857G[2].c());
                c(fVar2, fVar3, 1, gVar);
                if (this.f21272b.f20898w) {
                    c(fVar, fVar3, 1, this.f21270l);
                }
                if (this.f21274d == dVar3) {
                    e eVar17 = this.f21272b;
                    if (eVar17.f20864N > 0.0f) {
                        j jVar = eVar17.f20878d;
                        if (jVar.f21274d == dVar3) {
                            jVar.f21275e.f21263k.add(gVar);
                            arrayList2.add(this.f21272b.f20878d.f21275e);
                            gVar.f21255a = this;
                        }
                    }
                }
            }
        } else {
            c cVar7 = cVarArr2[3];
            if (cVar7.f20843d != null) {
                f fVarH9 = m.h(cVar7);
                if (fVarH9 != null) {
                    m.b(fVar2, fVarH9, -this.f21272b.f20857G[3].c());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f21272b.f20898w) {
                        c(fVar, fVar3, 1, this.f21270l);
                    }
                }
            } else {
                c cVar8 = cVarArr2[4];
                if (cVar8.f20843d != null) {
                    f fVarH10 = m.h(cVar8);
                    if (fVarH10 != null) {
                        m.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f21270l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(eVar16 instanceof j) && (eVar3 = eVar16.f20861K) != null) {
                    m.b(fVar3, eVar3.f20880e.f21277h, eVar16.o());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f21272b.f20898w) {
                        c(fVar, fVar3, 1, this.f21270l);
                    }
                    if (this.f21274d == dVar3) {
                        e eVar18 = this.f21272b;
                        if (eVar18.f20864N > 0.0f) {
                            j jVar2 = eVar18.f20878d;
                            if (jVar2.f21274d == dVar3) {
                                jVar2.f21275e.f21263k.add(gVar);
                                arrayList2.add(this.f21272b.f20878d.f21275e);
                                gVar.f21255a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f21257c = true;
        }
    }

    @Override // p163q1.m
    public final void e() {
        f fVar = this.f21277h;
        if (fVar.j) {
            this.f21272b.Q = fVar.g;
        }
    }

    @Override // p163q1.m
    public final void f() {
        this.f21273c = null;
        this.f21277h.c();
        this.f21278i.c();
        this.f21269k.c();
        this.f21275e.c();
        this.g = false;
    }

    @Override // p163q1.m
    public final boolean k() {
        return this.f21274d != d.f20848t || this.f21272b.f20886k == 0;
    }

    public final void m() {
        this.g = false;
        f fVar = this.f21277h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f21278i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.f21269k;
        fVar3.c();
        fVar3.j = false;
        this.f21275e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f21272b.f20870Y;
    }
}
