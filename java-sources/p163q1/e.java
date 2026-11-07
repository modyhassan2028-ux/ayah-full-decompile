package p163q1;

import android.support.v4.media.session.p;
import java.util.ArrayList;
import java.util.HashSet;
import p153p1.c;
import p153p1.f;
import p153p1.i;
import p153p1.j;
import s1.d;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f21248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f21251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f21252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f21253f;
    public b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f21254h;

    public final void a(f fVar, int i10, ArrayList arrayList, k kVar) {
        m mVar = fVar.f21258d;
        k kVar2 = mVar.f21273c;
        f fVar2 = mVar.f21278i;
        f fVar3 = mVar.f21277h;
        if (kVar2 == null) {
            f fVar4 = this.f21248a;
            if (mVar == fVar4.f20878d || mVar == fVar4.f20880e) {
                return;
            }
            if (kVar == null) {
                kVar = new k();
                kVar.f21267a = null;
                kVar.f21268b = new ArrayList();
                kVar.f21267a = mVar;
                arrayList.add(kVar);
            }
            mVar.f21273c = kVar;
            kVar.f21268b.add(mVar);
            ArrayList arrayList2 = fVar3.f21263k;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i10, arrayList, kVar);
                }
            }
            ArrayList arrayList3 = fVar2.f21263k;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, arrayList, kVar);
                }
            }
            if (i10 == 1 && (mVar instanceof l)) {
                ArrayList arrayList4 = ((l) mVar).f21269k.f21263k;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, arrayList, kVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f21264l;
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList5.get(i15);
                i15++;
                a((f) obj4, i10, arrayList, kVar);
            }
            ArrayList arrayList6 = fVar2.f21264l;
            int size5 = arrayList6.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                a((f) obj5, i10, arrayList, kVar);
            }
            if (i10 == 1 && (mVar instanceof l)) {
                ArrayList arrayList7 = ((l) mVar).f21269k.f21264l;
                int size6 = arrayList7.size();
                while (i11 < size6) {
                    Object obj6 = arrayList7.get(i11);
                    i11++;
                    a((f) obj6, i10, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ed  */
    public final void b(f fVar) {
        int i10;
        c[] cVarArr;
        g gVar;
        g gVar2;
        p153p1.d dVar;
        p153p1.d dVar2;
        int iM;
        int iJ;
        p153p1.d dVar3;
        p153p1.d dVar4;
        p153p1.d dVar5;
        p153p1.d dVar6;
        int i11;
        p153p1.d dVar7;
        p153p1.d[] dVarArr;
        p153p1.d dVar8;
        p153p1.d dVar9;
        ArrayList arrayList = fVar.f20902g0;
        int size = arrayList.size();
        char c10 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            p153p1.e eVar = (p153p1.e) obj;
            p153p1.d[] dVarArr2 = eVar.f20860J;
            c[] cVarArr2 = eVar.f20857G;
            c cVar = eVar.f20852B;
            c cVar2 = eVar.f20901z;
            c cVar3 = eVar.f20851A;
            c cVar4 = eVar.f20900y;
            l lVar = eVar.f20880e;
            j jVar = eVar.f20878d;
            p153p1.d dVar10 = dVarArr2[c10];
            p153p1.d dVar11 = dVarArr2[1];
            c10 = c10;
            arrayList = arrayList;
            if (eVar.f20869X == 8) {
                eVar.f20872a = true;
            } else {
                float f3 = eVar.f20890o;
                p153p1.d dVar12 = p153p1.d.f20848t;
                if (f3 < 1.0f && dVar10 == dVar12) {
                    eVar.j = 2;
                }
                float f7 = eVar.f20893r;
                if (f7 < 1.0f && dVar11 == dVar12) {
                    eVar.f20886k = 2;
                }
                float f10 = eVar.f20864N;
                p153p1.d dVar13 = p153p1.d.f20847s;
                int i13 = size;
                p153p1.d dVar14 = p153p1.d.f20846r;
                if (f10 <= 0.0f) {
                    i10 = i12;
                } else if (dVar10 == dVar12 && (dVar11 == dVar13 || dVar11 == dVar14)) {
                    i10 = i12;
                    eVar.j = 3;
                } else {
                    i10 = i12;
                    if (dVar11 == dVar12 && (dVar10 == dVar13 || dVar10 == dVar14)) {
                        eVar.f20886k = 3;
                    } else {
                        if (dVar10 == dVar12 && dVar11 == dVar12) {
                            cVarArr = cVarArr2;
                            if (eVar.j == 0) {
                                eVar.j = 3;
                            }
                            if (eVar.f20886k == 0) {
                                eVar.f20886k = 3;
                            }
                        }
                        if (dVar10 == dVar12 && eVar.j == 1 && (cVar4.f20843d == null || cVar3.f20843d == null)) {
                            dVar10 = dVar13;
                        }
                        if (dVar11 == dVar12 && eVar.f20886k == 1 && (cVar2.f20843d == null || cVar.f20843d == null)) {
                            dVar11 = dVar13;
                        }
                        jVar.f21274d = dVar10;
                        gVar = jVar.f21275e;
                        int i14 = eVar.j;
                        jVar.f21271a = i14;
                        lVar.f21274d = dVar11;
                        gVar2 = lVar.f21275e;
                        int i15 = eVar.f20886k;
                        lVar.f21271a = i15;
                        dVar = p153p1.d.f20849u;
                        if ((dVar10 != dVar || dVar10 == dVar14 || dVar10 == dVar13) && (dVar11 == dVar || dVar11 == dVar14 || dVar11 == dVar13)) {
                            dVar2 = dVar10;
                            iM = eVar.m();
                            if (dVar2 == dVar) {
                                iM = (fVar.m() - cVar4.f20844e) - cVar3.f20844e;
                                dVar2 = dVar14;
                            }
                            iJ = eVar.j();
                            if (dVar11 == dVar) {
                                iJ = (fVar.j() - cVar2.f20844e) - cVar.f20844e;
                                dVar3 = dVar14;
                            } else {
                                dVar3 = dVar11;
                            }
                            f(eVar, dVar2, iM, dVar3, iJ);
                            gVar.d(eVar.m());
                            gVar2.d(eVar.j());
                            eVar.f20872a = true;
                        } else {
                            if (dVar10 != dVar12 || (dVar11 != dVar13 && dVar11 != dVar14)) {
                                dVar4 = dVar13;
                                dVar5 = dVar11;
                            } else if (i14 == 3) {
                                if (dVar11 == dVar13) {
                                    f(eVar, dVar13, 0, dVar13, 0);
                                }
                                int iJ2 = eVar.j();
                                f(eVar, dVar14, (int) ((iJ2 * eVar.f20864N) + 0.5f), dVar14, iJ2);
                                gVar.d(eVar.m());
                                gVar2.d(eVar.j());
                                eVar.f20872a = true;
                            } else {
                                dVar4 = dVar13;
                                if (i14 == 1) {
                                    f(eVar, dVar4, 0, dVar11, 0);
                                    gVar.f21265m = eVar.m();
                                } else {
                                    p153p1.d dVar15 = dVar11;
                                    if (i14 == 2) {
                                        p153p1.d dVar16 = fVar.f20860J[c10];
                                        if (dVar16 == dVar14 || dVar16 == dVar) {
                                            f(eVar, dVar14, (int) ((fVar.m() * f3) + 0.5f), dVar15, eVar.j());
                                            gVar.d(eVar.m());
                                            gVar2.d(eVar.j());
                                            eVar.f20872a = true;
                                        } else {
                                            dVar5 = dVar15;
                                        }
                                    } else {
                                        dVar5 = dVar15;
                                        if (cVarArr[c10].f20843d == null || cVarArr[1].f20843d == null) {
                                            dVar14 = dVar14;
                                            dVar14 = dVar14;
                                            f(eVar, dVar4, 0, dVar5, 0);
                                            gVar.d(eVar.m());
                                            gVar2.d(eVar.j());
                                            eVar.f20872a = true;
                                        }
                                    }
                                }
                            }
                            if (dVar5 != dVar12 || (dVar10 != dVar4 && dVar10 != dVar14)) {
                                dVar14 = dVar14;
                                dVar6 = dVar4;
                                i11 = 1;
                                dVar14 = dVar14;
                                dVar7 = dVar10;
                            } else if (i15 == 3) {
                                if (dVar10 == dVar4) {
                                    f(eVar, dVar4, 0, dVar4, 0);
                                }
                                int iM2 = eVar.m();
                                float f11 = eVar.f20864N;
                                if (eVar.f20865O == -1) {
                                    f11 = 1.0f / f11;
                                }
                                f(eVar, dVar14, iM2, dVar14, (int) ((iM2 * f11) + 0.5f));
                                gVar.d(eVar.m());
                                gVar2.d(eVar.j());
                                eVar.f20872a = true;
                            } else if (i15 == 1) {
                                f(eVar, dVar10, 0, dVar4, 0);
                                gVar2.f21265m = eVar.j();
                            } else {
                                dVar6 = dVar4;
                                p153p1.d dVar17 = dVar10;
                                if (i15 == 2) {
                                    p153p1.d dVar18 = fVar.f20860J[1];
                                    if (dVar18 == dVar14 || dVar18 == dVar) {
                                        f(eVar, dVar17, eVar.m(), dVar14, (int) ((f7 * fVar.j()) + 0.5f));
                                        gVar.d(eVar.m());
                                        gVar2.d(eVar.j());
                                        eVar.f20872a = true;
                                    } else {
                                        dVar7 = dVar17;
                                        i11 = 1;
                                    }
                                } else {
                                    dVar7 = dVar17;
                                    if (cVarArr[2].f20843d == null || cVarArr[3].f20843d == null) {
                                        f(eVar, dVar6, 0, dVar5, 0);
                                        gVar.d(eVar.m());
                                        gVar2.d(eVar.j());
                                        eVar.f20872a = true;
                                    } else {
                                        i11 = 1;
                                    }
                                }
                            }
                            if (dVar7 == dVar12 && dVar5 == dVar12) {
                                if (i14 == i11 || i15 == i11) {
                                    p153p1.d dVar19 = dVar6;
                                    f(eVar, dVar19, 0, dVar19, 0);
                                    gVar.f21265m = eVar.m();
                                    gVar2.f21265m = eVar.j();
                                } else if (i15 == 2 && i14 == 2 && (((dVar8 = (dVarArr = fVar.f20860J)[c10]) == dVar14 || dVar8 == dVar14) && ((dVar9 = dVarArr[i11]) == dVar14 || dVar9 == dVar14))) {
                                    f(eVar, dVar14, (int) ((fVar.m() * f3) + 0.5f), dVar14, (int) ((f7 * fVar.j()) + 0.5f));
                                    gVar.d(eVar.m());
                                    gVar2.d(eVar.j());
                                    eVar.f20872a = true;
                                }
                            }
                        }
                        i12 = i10;
                        size = i13;
                    }
                }
                cVarArr = cVarArr2;
                if (dVar10 == dVar12) {
                    dVar10 = dVar13;
                }
                if (dVar11 == dVar12) {
                    dVar11 = dVar13;
                }
                jVar.f21274d = dVar10;
                gVar = jVar.f21275e;
                int i16 = eVar.j;
                jVar.f21271a = i16;
                lVar.f21274d = dVar11;
                gVar2 = lVar.f21275e;
                int i17 = eVar.f20886k;
                lVar.f21271a = i17;
                dVar = p153p1.d.f20849u;
                if (dVar10 != dVar) {
                    dVar2 = dVar10;
                    iM = eVar.m();
                    if (dVar2 == dVar) {
                        iM = (fVar.m() - cVar4.f20844e) - cVar3.f20844e;
                        dVar2 = dVar14;
                    }
                    iJ = eVar.j();
                    if (dVar11 == dVar) {
                        iJ = (fVar.j() - cVar2.f20844e) - cVar.f20844e;
                        dVar3 = dVar14;
                    } else {
                        dVar3 = dVar11;
                    }
                    f(eVar, dVar2, iM, dVar3, iJ);
                    gVar.d(eVar.m());
                    gVar2.d(eVar.j());
                    eVar.f20872a = true;
                } else {
                    dVar2 = dVar10;
                    iM = eVar.m();
                    if (dVar2 == dVar) {
                        iM = (fVar.m() - cVar4.f20844e) - cVar3.f20844e;
                        dVar2 = dVar14;
                    }
                    iJ = eVar.j();
                    if (dVar11 == dVar) {
                        iJ = (fVar.j() - cVar2.f20844e) - cVar.f20844e;
                        dVar3 = dVar14;
                    } else {
                        dVar3 = dVar11;
                    }
                    f(eVar, dVar2, iM, dVar3, iJ);
                    gVar.d(eVar.m());
                    gVar2.d(eVar.j());
                    eVar.f20872a = true;
                }
                i12 = i10;
                size = i13;
            }
        }
    }

    public final void c() {
        f fVar = this.f21248a;
        ArrayList arrayList = this.f21254h;
        ArrayList arrayList2 = this.f21252e;
        arrayList2.clear();
        f fVar2 = this.f21251d;
        fVar2.f20878d.f();
        l lVar = fVar2.f20880e;
        lVar.f();
        arrayList2.add(fVar2.f20878d);
        arrayList2.add(lVar);
        ArrayList arrayList3 = fVar2.f20902g0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            p153p1.e eVar = (p153p1.e) obj;
            if (eVar instanceof i) {
                h hVar = new h(eVar);
                eVar.f20878d.f();
                eVar.f20880e.f();
                hVar.f21276f = ((i) eVar).f20972k0;
                arrayList2.add(hVar);
            } else {
                if (eVar.r()) {
                    if (eVar.f20874b == null) {
                        eVar.f20874b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f20874b);
                } else {
                    arrayList2.add(eVar.f20878d);
                }
                if (eVar.s()) {
                    if (eVar.f20876c == null) {
                        eVar.f20876c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f20876c);
                } else {
                    arrayList2.add(eVar.f20880e);
                }
                if (eVar instanceof j) {
                    arrayList2.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ((m) obj2).f();
        }
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            m mVar = (m) obj3;
            if (mVar.f21272b != fVar2) {
                mVar.d();
            }
        }
        arrayList.clear();
        e(fVar.f20878d, 0, arrayList);
        e(fVar.f20880e, 1, arrayList);
        this.f21249b = false;
    }

    public final int d(f fVar, int i10) {
        ArrayList arrayList;
        int i11;
        long j;
        float f3;
        long j10;
        ArrayList arrayList2 = this.f21254h;
        int size = arrayList2.size();
        long j11 = 0;
        int i12 = 0;
        long jMax = 0;
        while (i12 < size) {
            m mVar = ((k) arrayList2.get(i12)).f21267a;
            if (!(mVar instanceof c) ? !(i10 != 0 ? (mVar instanceof l) : (mVar instanceof j)) : ((c) mVar).f21276f != i10) {
                f fVar2 = (i10 == 0 ? fVar.f20878d : fVar.f20880e).f21277h;
                f fVar3 = (i10 == 0 ? fVar.f20878d : fVar.f20880e).f21278i;
                f fVar4 = mVar.f21277h;
                f fVar5 = mVar.f21278i;
                boolean zContains = fVar4.f21264l.contains(fVar2);
                boolean zContains2 = fVar5.f21264l.contains(fVar3);
                long j12 = mVar.j();
                if (zContains && zContains2) {
                    long jB = k.b(fVar4, j11);
                    long jA = k.a(fVar5, j11);
                    long j13 = jB - j12;
                    int i13 = fVar5.f21260f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j13 >= (-i13)) {
                        j13 += (long) i13;
                    }
                    long j14 = fVar4.f21260f;
                    long j15 = ((-jA) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    p153p1.e eVar = mVar.f21272b;
                    if (i10 == 0) {
                        f3 = eVar.U;
                    } else if (i10 == 1) {
                        f3 = eVar.f20867V;
                    } else {
                        eVar.getClass();
                        f3 = -1.0f;
                    }
                    if (f3 > 0.0f) {
                        j10 = (long) ((j13 / (1.0f - f3)) + (j15 / f3));
                    } else {
                        j10 = 0;
                    }
                    float f7 = j10;
                    j = (((long) fVar4.f21260f) + ((((long) ((f7 * f3) + 0.5f)) + j12) + ((long) p.n(1.0f, f3, f7, 0.5f)))) - ((long) fVar5.f21260f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (zContains) {
                        j = Math.max(k.b(fVar4, fVar4.f21260f), ((long) fVar4.f21260f) + j12);
                    } else if (zContains2) {
                        j = Math.max(-k.a(fVar5, fVar5.f21260f), ((long) (-fVar5.f21260f)) + j12);
                    } else {
                        j = (mVar.j() + ((long) fVar4.f21260f)) - ((long) fVar5.f21260f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                j = j11;
            }
            jMax = Math.max(jMax, j);
            i12++;
            arrayList2 = arrayList;
            size = i11;
            j11 = 0;
        }
        return (int) jMax;
    }

    public final void e(m mVar, int i10, ArrayList arrayList) {
        f fVar = mVar.f21277h;
        f fVar2 = mVar.f21278i;
        ArrayList arrayList2 = fVar.f21263k;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i10, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f21277h, i10, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f21263k;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f21278i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            ArrayList arrayList4 = ((l) mVar).f21269k.f21263k;
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void f(p153p1.e eVar, p153p1.d dVar, int i10, p153p1.d dVar2, int i11) {
        b bVar = this.g;
        bVar.f21238a = dVar;
        bVar.f21239b = dVar2;
        bVar.f21240c = i10;
        bVar.f21241d = i11;
        this.f21253f.a(eVar, bVar);
        eVar.z(bVar.f21242e);
        eVar.w(bVar.f21243f);
        eVar.f20898w = bVar.f21244h;
        int i12 = bVar.g;
        eVar.R = i12;
        eVar.f20898w = i12 > 0;
    }

    public final void g() {
        a aVar;
        ArrayList arrayList = this.f21248a.f20902g0;
        int size = arrayList.size();
        char c10 = 0;
        int i10 = 0;
        while (i10 < size) {
            i10++;
            p153p1.e eVar = (p153p1.e) arrayList.get(i10);
            boolean z10 = eVar.f20872a;
            j jVar = eVar.f20878d;
            l lVar = eVar.f20880e;
            if (!z10) {
                p153p1.d[] dVarArr = eVar.f20860J;
                p153p1.d dVar = dVarArr[c10];
                p153p1.d dVar2 = dVarArr[1];
                int i11 = eVar.j;
                int i12 = eVar.f20886k;
                p153p1.d dVar3 = p153p1.d.f20848t;
                p153p1.d dVar4 = p153p1.d.f20847s;
                char c11 = (dVar == dVar4 || (dVar == dVar3 && i11 == 1)) ? (char) 1 : c10;
                char c12 = (dVar2 == dVar4 || (dVar2 == dVar3 && i12 == 1)) ? (char) 1 : c10;
                g gVar = jVar.f21275e;
                g gVar2 = jVar.f21275e;
                boolean z11 = gVar.j;
                g gVar3 = lVar.f21275e;
                ArrayList arrayList2 = arrayList;
                g gVar4 = lVar.f21275e;
                boolean z12 = gVar3.j;
                char c13 = c11;
                p153p1.d dVar5 = p153p1.d.f20846r;
                if (z11 && z12) {
                    f(eVar, dVar5, gVar.g, dVar5, gVar3.g);
                    eVar.f20872a = true;
                } else if (z11 && c12 != 0) {
                    f(eVar, dVar5, gVar.g, dVar4, gVar3.g);
                    if (dVar2 == dVar3) {
                        gVar4.f21265m = eVar.j();
                    } else {
                        gVar4.d(eVar.j());
                        eVar.f20872a = true;
                    }
                } else if (z12 && c13 != 0) {
                    f(eVar, dVar4, gVar.g, dVar5, gVar3.g);
                    if (dVar == dVar3) {
                        gVar2.f21265m = eVar.m();
                    } else {
                        gVar2.d(eVar.m());
                        eVar.f20872a = true;
                    }
                }
                if (eVar.f20872a && (aVar = lVar.f21270l) != null) {
                    aVar.d(eVar.R);
                }
                c10 = 0;
                arrayList = arrayList2;
            }
        }
    }
}
