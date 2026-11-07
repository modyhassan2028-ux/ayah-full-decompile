package p153p1;

import java.util.ArrayList;
import p142o1.c;
import p142o1.e;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f20975a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:174:0x0276  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:219:0x0357  */
    /* JADX WARN: Code duplicated, block: B:221:0x0373  */
    /* JADX WARN: Code duplicated, block: B:223:0x0378  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:238:0x040c  */
    /* JADX WARN: Code duplicated, block: B:390:0x068c  */
    /* JADX WARN: Code duplicated, block: B:391:0x068f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0695  */
    /* JADX WARN: Code duplicated, block: B:395:0x0698  */
    /* JADX WARN: Code duplicated, block: B:397:0x069c  */
    /* JADX WARN: Code duplicated, block: B:399:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:402:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:404:0x06b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:413:0x06ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    public static void a(f fVar, e eVar, int i10) {
        int i11;
        b[] bVarArr;
        int i12;
        c[] cVarArr;
        float f3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar2;
        e eVar3;
        h hVar;
        c cVar;
        h hVar2;
        int i13;
        c cVar2;
        h hVar3;
        h hVar4;
        e eVar4;
        int i14;
        c[] cVarArr2;
        int i15;
        c cVar3;
        c cVar4;
        h hVar5;
        c cVar5;
        h hVar6;
        int size;
        ArrayList arrayList;
        float f7;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        c cVarK;
        float f10;
        c cVar6;
        e eVar5;
        int i16;
        int i17;
        e eVar6;
        float f11;
        f fVar2 = fVar;
        if (i10 == 0) {
            i11 = fVar2.f20910o0;
            bVarArr = fVar2.f20913r0;
            i12 = 0;
        } else {
            i11 = fVar2.f20911p0;
            bVarArr = fVar2.f20912q0;
            i12 = 2;
        }
        int i18 = i11;
        b[] bVarArr2 = bVarArr;
        int i19 = 0;
        while (i19 < i18) {
            b bVar = bVarArr2[i19];
            boolean z14 = bVar.f20839q;
            e eVar7 = bVar.f20825a;
            c[] cVarArr3 = eVar7.f20857G;
            d dVar = d.f20848t;
            int i20 = 8;
            if (z14) {
                cVarArr = cVarArr3;
                f3 = 0.0f;
            } else {
                int i21 = bVar.f20834l;
                int i22 = i21 * 2;
                e eVar8 = eVar7;
                e eVar9 = eVar8;
                boolean z15 = false;
                f3 = 0.0f;
                while (!z15) {
                    bVar.f20832i++;
                    e[] eVarArr = eVar8.f20879d0;
                    c[] cVarArr4 = eVar8.f20857G;
                    eVarArr[i21] = null;
                    eVar8.f20877c0[i21] = null;
                    if (eVar8.f20869X != i20) {
                        eVar8.i(i21);
                        cVarArr4[i22].c();
                        int i23 = i22 + 1;
                        cVarArr4[i23].c();
                        cVarArr4[i22].c();
                        cVarArr4[i23].c();
                        if (bVar.f20826b == null) {
                            bVar.f20826b = eVar8;
                        }
                        bVar.f20828d = eVar8;
                        d dVar2 = eVar8.f20860J[i21];
                        if (dVar2 == dVar) {
                            int i24 = eVar8.f20887l[i21];
                            i17 = i21;
                            if (i24 == 0 || i24 == 3 || i24 == 2) {
                                bVar.j++;
                                float f12 = eVar8.f20875b0[i17];
                                if (f12 > 0.0f) {
                                    f11 = f12;
                                    bVar.f20833k += f11;
                                } else {
                                    f11 = f12;
                                }
                                if (eVar8.f20869X != 8 && dVar2 == dVar && (i24 == 0 || i24 == 3)) {
                                    if (f11 < 0.0f) {
                                        bVar.f20836n = true;
                                    } else {
                                        bVar.f20837o = true;
                                    }
                                    if (bVar.f20831h == null) {
                                        bVar.f20831h = new ArrayList();
                                    }
                                    bVar.f20831h.add(eVar8);
                                }
                                if (bVar.f20830f == null) {
                                    bVar.f20830f = eVar8;
                                }
                                e eVar10 = bVar.g;
                                if (eVar10 != null) {
                                    eVar10.f20877c0[i17] = eVar8;
                                }
                                bVar.g = eVar8;
                            }
                            if (i17 == 0) {
                                if (eVar8.j == 0 && eVar8.f20888m == 0) {
                                    int i25 = eVar8.f20889n;
                                }
                            } else if (eVar8.f20886k == 0 && eVar8.f20891p == 0) {
                                int i26 = eVar8.f20892q;
                            }
                        } else {
                            i17 = i21;
                            cVarArr3 = cVarArr3;
                        }
                    } else {
                        i17 = i21;
                        cVarArr3 = cVarArr3;
                    }
                    if (eVar9 != eVar8) {
                        eVar9.f20879d0[i17] = eVar8;
                    }
                    c cVar7 = cVarArr4[i22 + 1].f20843d;
                    if (cVar7 != null) {
                        eVar6 = cVar7.f20841b;
                        c cVar8 = eVar6.f20857G[i22].f20843d;
                        if (cVar8 == null || cVar8.f20841b != eVar8) {
                            eVar6 = null;
                        }
                    } else {
                        eVar6 = null;
                    }
                    if (eVar6 == null) {
                        eVar6 = eVar8;
                        z15 = true;
                    }
                    eVar9 = eVar8;
                    cVarArr3 = cVarArr3;
                    i20 = 8;
                    eVar8 = eVar6;
                    i21 = i17;
                }
                int i27 = i21;
                cVarArr = cVarArr3;
                e eVar11 = bVar.f20826b;
                if (eVar11 != null) {
                    eVar11.f20857G[i22].c();
                }
                e eVar12 = bVar.f20828d;
                if (eVar12 != null) {
                    eVar12.f20857G[i22 + 1].c();
                }
                bVar.f20827c = eVar8;
                if (i27 == 0 && bVar.f20835m) {
                    bVar.f20829e = eVar8;
                } else {
                    bVar.f20829e = eVar7;
                }
                bVar.f20838p = bVar.f20837o && bVar.f20836n;
            }
            bVar.f20839q = true;
            e eVar13 = bVar.f20827c;
            e eVar14 = bVar.f20826b;
            e eVar15 = bVar.f20828d;
            e eVar16 = bVar.f20829e;
            float f13 = bVar.f20833k;
            d[] dVarArr = fVar2.f20860J;
            c[] cVarArr5 = fVar2.f20857G;
            float f14 = f13;
            boolean z16 = dVarArr[i10] == d.f20847s;
            if (i10 == 0) {
                int i28 = eVar16.f20871Z;
                boolean z17 = i28 == 0;
                boolean z18 = i28 == 1;
                z11 = i28 == 2;
                z12 = z18;
                z13 = false;
                z10 = z17;
            } else {
                int i29 = eVar16.f20873a0;
                z10 = i29 == 0;
                boolean z19 = i29 == 1;
                z11 = i29 == 2;
                z12 = z19;
                z13 = false;
            }
            while (!z13) {
                c[] cVarArr6 = eVar7.f20857G;
                c cVar9 = cVarArr6[i12];
                int i30 = z11 ? 1 : 4;
                int iC = cVar9.c();
                boolean z20 = z11;
                boolean z21 = eVar7.f20860J[i10] == dVar && eVar7.f20887l[i10] == 0;
                c cVar10 = cVar9.f20843d;
                if (cVar10 != null && eVar7 != eVar7) {
                    iC = cVar10.c() + iC;
                }
                int i31 = iC;
                if (z20 && eVar7 != eVar7 && eVar7 != eVar14) {
                    i30 = 5;
                }
                e eVar17 = eVar7;
                c cVar11 = cVar9.f20843d;
                if (cVar11 != null) {
                    if (eVar7 == eVar14) {
                        eVar.f(cVar9.g, cVar11.g, i31, 6);
                    } else {
                        eVar.f(cVar9.g, cVar11.g, i31, 8);
                    }
                    eVar.e(cVar9.g, cVar9.f20843d.g, i31, (!z21 || z20) ? i30 : 5);
                } else {
                    i18 = i18;
                    bVarArr2 = bVarArr2;
                }
                if (z16) {
                    if (eVar7.f20869X == 8 || eVar7.f20860J[i10] != dVar) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                        eVar.f(cVarArr6[i12 + 1].g, cVarArr6[i12].g, 0, 5);
                    }
                    eVar.f(cVarArr6[i12].g, cVarArr5[i12].g, i16, 8);
                }
                c cVar12 = cVarArr6[i12 + 1].f20843d;
                if (cVar12 != null) {
                    eVar5 = cVar12.f20841b;
                    c cVar13 = eVar5.f20857G[i12].f20843d;
                    if (cVar13 == null || cVar13.f20841b != eVar7) {
                        eVar5 = null;
                    }
                } else {
                    eVar5 = null;
                }
                if (eVar5 != null) {
                    eVar7 = eVar5;
                } else {
                    z13 = true;
                }
                eVar7 = eVar17;
                z11 = z20;
                i18 = i18;
                bVarArr2 = bVarArr2;
            }
            boolean z22 = z11;
            int i32 = i18;
            b[] bVarArr3 = bVarArr2;
            if (eVar15 != null) {
                int i33 = i12 + 1;
                if (eVar13.f20857G[i33].f20843d != null) {
                    c cVar14 = eVar15.f20857G[i33];
                    if (eVar15.f20860J[i10] == dVar && eVar15.f20887l[i10] == 0 && !z22) {
                        c cVar15 = cVar14.f20843d;
                        if (cVar15.f20841b == fVar2) {
                            eVar.e(cVar14.g, cVar15.g, -cVar14.c(), 5);
                        } else if (z22) {
                            cVar6 = cVar14.f20843d;
                            if (cVar6.f20841b == fVar2) {
                                eVar.e(cVar14.g, cVar6.g, -cVar14.c(), 4);
                            }
                        }
                    } else if (z22) {
                        cVar6 = cVar14.f20843d;
                        if (cVar6.f20841b == fVar2) {
                            eVar.e(cVar14.g, cVar6.g, -cVar14.c(), 4);
                        }
                    }
                    eVar.g(cVar14.g, eVar13.f20857G[i33].f20843d.g, -cVar14.c(), 6);
                }
            }
            if (z16 != 0) {
                int i34 = i12 + 1;
                h hVar11 = cVarArr5[i34].g;
                c cVar16 = eVar13.f20857G[i34];
                eVar.f(hVar11, cVar16.g, cVar16.c(), 8);
            }
            ArrayList arrayList2 = bVar.f20831h;
            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                if (bVar.f20836n && !bVar.f20838p) {
                    f14 = bVar.j;
                }
                e eVar18 = null;
                float f15 = f3;
                int i35 = 0;
                while (i35 < size) {
                    e eVar19 = (e) arrayList2.get(i35);
                    float[] fArr = eVar19.f20875b0;
                    c[] cVarArr7 = eVar19.f20857G;
                    float f16 = fArr[i10];
                    if (f16 >= f3) {
                        arrayList = arrayList2;
                        if (f16 == f3) {
                            eVar.e(cVarArr7[i12 + 1].g, cVarArr7[i12].g, 0, 8);
                            size = size;
                            i35 = i35;
                            f7 = f3;
                            f15 = f15;
                        } else {
                            float f17 = f15;
                            if (eVar18 != null) {
                                c[] cVarArr8 = eVar18.f20857G;
                                hVar7 = cVarArr8[i12].g;
                                int i36 = i12 + 1;
                                hVar8 = cVarArr8[i36].g;
                                hVar9 = cVarArr7[i12].g;
                                hVar10 = cVarArr7[i36].g;
                                cVarK = eVar.k();
                                f10 = f3;
                                cVarK.f20223b = f10;
                                f7 = f10;
                                if (f14 != f10 || f17 == f16) {
                                    cVarK.f20225d.e(hVar7, 1.0f);
                                    cVarK.f20225d.e(hVar8, -1.0f);
                                    cVarK.f20225d.e(hVar10, 1.0f);
                                    cVarK.f20225d.e(hVar9, -1.0f);
                                } else if (f17 == f7) {
                                    cVarK.f20225d.e(hVar7, 1.0f);
                                    cVarK.f20225d.e(hVar8, -1.0f);
                                } else if (f16 == f3) {
                                    cVarK.f20225d.e(hVar9, 1.0f);
                                    cVarK.f20225d.e(hVar10, -1.0f);
                                } else {
                                    float f18 = (f17 / f14) / (f16 / f14);
                                    cVarK.f20225d.e(hVar7, 1.0f);
                                    cVarK.f20225d.e(hVar8, -1.0f);
                                    cVarK.f20225d.e(hVar10, f18);
                                    cVarK.f20225d.e(hVar9, -f18);
                                }
                                eVar.c(cVarK);
                            } else {
                                i35 = i35;
                                f7 = f3;
                                f16 = f16;
                            }
                            f15 = f16;
                            eVar18 = eVar19;
                        }
                    } else {
                        if (bVar.f20838p) {
                            arrayList = arrayList2;
                            eVar.e(cVarArr7[i12 + 1].g, cVarArr7[i12].g, 0, 4);
                        } else {
                            f16 = 1.0f;
                            arrayList = arrayList2;
                            if (f16 == f3) {
                                eVar.e(cVarArr7[i12 + 1].g, cVarArr7[i12].g, 0, 8);
                            } else {
                                float f19 = f15;
                                if (eVar18 != null) {
                                    c[] cVarArr9 = eVar18.f20857G;
                                    hVar7 = cVarArr9[i12].g;
                                    int i37 = i12 + 1;
                                    hVar8 = cVarArr9[i37].g;
                                    hVar9 = cVarArr7[i12].g;
                                    hVar10 = cVarArr7[i37].g;
                                    cVarK = eVar.k();
                                    f10 = f3;
                                    cVarK.f20223b = f10;
                                    f7 = f10;
                                    if (f14 != f10) {
                                        cVarK.f20225d.e(hVar7, 1.0f);
                                        cVarK.f20225d.e(hVar8, -1.0f);
                                        cVarK.f20225d.e(hVar10, 1.0f);
                                        cVarK.f20225d.e(hVar9, -1.0f);
                                    } else {
                                        cVarK.f20225d.e(hVar7, 1.0f);
                                        cVarK.f20225d.e(hVar8, -1.0f);
                                        cVarK.f20225d.e(hVar10, 1.0f);
                                        cVarK.f20225d.e(hVar9, -1.0f);
                                    }
                                    eVar.c(cVarK);
                                } else {
                                    i35 = i35;
                                    f7 = f3;
                                    f16 = f16;
                                }
                                f15 = f16;
                                eVar18 = eVar19;
                            }
                        }
                        size = size;
                        i35 = i35;
                        f7 = f3;
                        f15 = f15;
                    }
                    i35++;
                    arrayList2 = arrayList;
                    size = size;
                    f3 = f7;
                }
            }
            if (eVar14 == null || !(eVar14 == eVar15 || z22)) {
                eVar2 = eVar15;
                if (!z10 || eVar14 == null) {
                    int i38 = 8;
                    if (z12 && eVar14 != null) {
                        int i39 = bVar.j;
                        boolean z23 = i39 > 0 && bVar.f20832i == i39;
                        e eVar20 = eVar14;
                        e eVar21 = eVar20;
                        while (eVar21 != null) {
                            c[] cVarArr10 = eVar21.f20857G;
                            e eVar22 = eVar21.f20879d0[i10];
                            while (eVar22 != null && eVar22.f20869X == i38) {
                                eVar22 = eVar22.f20879d0[i10];
                            }
                            if (eVar21 == eVar14 || eVar21 == eVar2 || eVar22 == null) {
                                eVar20 = eVar20;
                            } else {
                                if (eVar22 == eVar2) {
                                    eVar22 = null;
                                }
                                c cVar17 = cVarArr10[i12];
                                h hVar12 = cVar17.g;
                                int i40 = i12 + 1;
                                h hVar13 = eVar20.f20857G[i40].g;
                                int iC2 = cVar17.c();
                                int iC3 = cVarArr10[i40].c();
                                if (eVar22 != null) {
                                    cVar = eVar22.f20857G[i12];
                                    hVar2 = cVar.g;
                                    c cVar18 = cVar.f20843d;
                                    hVar = cVar18 != null ? cVar18.g : null;
                                } else {
                                    c cVar19 = eVar2.f20857G[i12];
                                    h hVar14 = cVar19 != null ? cVar19.g : null;
                                    hVar = cVarArr10[i40].g;
                                    cVar = cVar19;
                                    hVar2 = hVar14;
                                }
                                if (cVar != null) {
                                    iC3 += cVar.c();
                                }
                                int iC4 = iC2 + eVar20.f20857G[i40].c();
                                int i41 = z23 ? 8 : 4;
                                if (hVar12 != null && hVar13 != null && hVar2 != null && hVar != null) {
                                    eVar.b(hVar12, hVar13, iC4, 0.5f, hVar2, hVar, iC3, i41);
                                }
                                eVar22 = eVar22;
                            }
                            if (eVar21.f20869X != 8) {
                                eVar20 = eVar21;
                            }
                            eVar21 = eVar22;
                            eVar20 = eVar20;
                            i38 = 8;
                        }
                        eVar3 = eVar;
                        c cVar20 = eVar14.f20857G[i12];
                        c cVar21 = cVarArr[i12].f20843d;
                        int i42 = i12 + 1;
                        c cVar22 = eVar2.f20857G[i42];
                        c cVar23 = eVar13.f20857G[i42].f20843d;
                        if (cVar21 != null) {
                            if (eVar14 != eVar2) {
                                eVar3.e(cVar20.g, cVar21.g, cVar20.c(), 5);
                            } else if (cVar23 != null) {
                                eVar3.b(cVar20.g, cVar21.g, cVar20.c(), 0.5f, cVar22.g, cVar23.g, cVar22.c(), 5);
                            }
                        }
                        if (cVar23 != null && eVar14 != eVar2) {
                            eVar3.e(cVar22.g, cVar23.g, -cVar22.c(), 5);
                        }
                    }
                    if ((z10 || z12) && eVar14 != null && eVar14 != eVar2) {
                        cVarArr2 = eVar14.f20857G;
                        c cVar24 = cVarArr2[i12];
                        i15 = i12 + 1;
                        cVar3 = eVar2.f20857G[i15];
                        cVar4 = cVar24.f20843d;
                        if (cVar4 != null) {
                            hVar5 = cVar4.g;
                        } else {
                            hVar5 = null;
                        }
                        cVar5 = cVar3.f20843d;
                        if (cVar5 != null) {
                            hVar6 = cVar5.g;
                        } else {
                            hVar6 = null;
                        }
                        if (eVar13 != eVar2) {
                            c cVar25 = eVar13.f20857G[i15].f20843d;
                            hVar6 = cVar25 != null ? cVar25.g : null;
                        }
                        if (eVar14 == eVar2) {
                            cVar3 = cVarArr2[i15];
                        }
                        if (hVar5 == null && hVar6 != null) {
                            eVar3.b(cVar24.g, hVar5, cVar24.c(), 0.5f, hVar6, cVar3.g, eVar2.f20857G[i15].c(), 5);
                        }
                    }
                    i19++;
                    fVar2 = fVar;
                    i18 = i32;
                    bVarArr2 = bVarArr3;
                } else {
                    int i43 = bVar.j;
                    boolean z24 = i43 > 0 && bVar.f20832i == i43;
                    e eVar23 = eVar14;
                    e eVar24 = eVar23;
                    while (eVar23 != null) {
                        c[] cVarArr11 = eVar23.f20857G;
                        e eVar25 = eVar23.f20879d0[i10];
                        while (true) {
                            if (eVar25 == null) {
                                i13 = 8;
                                break;
                            }
                            i13 = 8;
                            if (eVar25.f20869X != 8) {
                                break;
                            } else {
                                eVar25 = eVar25.f20879d0[i10];
                            }
                        }
                        if (eVar25 != null || eVar23 == eVar2) {
                            c cVar26 = cVarArr11[i12];
                            h hVar15 = cVar26.g;
                            c cVar27 = cVar26.f20843d;
                            h hVar16 = cVar27 != null ? cVar27.g : null;
                            if (eVar24 != eVar23) {
                                hVar16 = eVar24.f20857G[i12 + 1].g;
                            } else if (eVar23 == eVar14 && eVar24 == eVar23) {
                                c cVar28 = cVarArr[i12].f20843d;
                                hVar16 = cVar28 != null ? cVar28.g : null;
                            }
                            int iC5 = cVar26.c();
                            int i44 = i12 + 1;
                            int iC6 = cVarArr11[i44].c();
                            if (eVar25 != null) {
                                cVar2 = eVar25.f20857G[i12];
                                hVar3 = cVar2.g;
                                hVar4 = cVarArr11[i44].g;
                            } else {
                                cVar2 = eVar13.f20857G[i44].f20843d;
                                hVar3 = cVar2 != null ? cVar2.g : null;
                                hVar4 = cVarArr11[i44].g;
                            }
                            if (cVar2 != null) {
                                iC6 += cVar2.c();
                            }
                            if (eVar24 != null) {
                                iC5 += eVar24.f20857G[i44].c();
                            }
                            if (hVar15 == null || hVar16 == null || hVar3 == null || hVar4 == null) {
                                eVar4 = eVar25;
                                i14 = 8;
                            } else {
                                if (eVar23 == eVar14) {
                                    iC5 = eVar14.f20857G[i12].c();
                                }
                                if (eVar23 == eVar2) {
                                    iC6 = eVar2.f20857G[i44].c();
                                }
                                eVar4 = eVar25;
                                i14 = 8;
                                eVar.b(hVar15, hVar16, iC5, 0.5f, hVar3, hVar4, iC6, z24 ? 8 : 5);
                            }
                        } else {
                            eVar4 = eVar25;
                            i14 = i13;
                        }
                        if (eVar23.f20869X != i14) {
                            eVar24 = eVar23;
                        }
                        eVar23 = eVar4;
                        eVar24 = eVar24;
                    }
                }
            } else {
                c cVar29 = cVarArr[i12];
                int i45 = i12 + 1;
                c cVar30 = eVar13.f20857G[i45];
                c cVar31 = cVar29.f20843d;
                h hVar17 = cVar31 != null ? cVar31.g : null;
                c cVar32 = cVar30.f20843d;
                h hVar18 = cVar32 != null ? cVar32.g : null;
                c cVar33 = eVar14.f20857G[i12];
                c cVar34 = eVar15.f20857G[i45];
                if (hVar17 == null || hVar18 == null) {
                    eVar2 = eVar15;
                } else {
                    h hVar19 = hVar17;
                    eVar2 = eVar15;
                    eVar.b(cVar33.g, hVar19, cVar33.c(), i10 == 0 ? eVar16.U : eVar16.f20867V, hVar18, cVar34.g, cVar34.c(), 7);
                }
            }
            eVar3 = eVar;
            if (z10) {
                cVarArr2 = eVar14.f20857G;
                c cVar210 = cVarArr2[i12];
                i15 = i12 + 1;
                cVar3 = eVar2.f20857G[i15];
                cVar4 = cVar210.f20843d;
                if (cVar4 != null) {
                    hVar5 = cVar4.g;
                } else {
                    hVar5 = null;
                }
                cVar5 = cVar3.f20843d;
                if (cVar5 != null) {
                    hVar6 = cVar5.g;
                } else {
                    hVar6 = null;
                }
                if (eVar13 != eVar2) {
                    c cVar211 = eVar13.f20857G[i15].f20843d;
                    hVar6 = cVar211 != null ? cVar211.g : null;
                }
                if (eVar14 == eVar2) {
                    cVar3 = cVarArr2[i15];
                }
                if (hVar5 == null) {
                }
            } else {
                cVarArr2 = eVar14.f20857G;
                c cVar212 = cVarArr2[i12];
                i15 = i12 + 1;
                cVar3 = eVar2.f20857G[i15];
                cVar4 = cVar212.f20843d;
                if (cVar4 != null) {
                    hVar5 = cVar4.g;
                } else {
                    hVar5 = null;
                }
                cVar5 = cVar3.f20843d;
                if (cVar5 != null) {
                    hVar6 = cVar5.g;
                } else {
                    hVar6 = null;
                }
                if (eVar13 != eVar2) {
                    c cVar213 = eVar13.f20857G[i15].f20843d;
                    hVar6 = cVar213 != null ? cVar213.g : null;
                }
                if (eVar14 == eVar2) {
                    cVar3 = cVarArr2[i15];
                }
                if (hVar5 == null) {
                }
            }
            i19++;
            fVar2 = fVar;
            i18 = i32;
            bVarArr2 = bVarArr3;
        }
    }
}
