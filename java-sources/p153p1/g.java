package p153p1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20917a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f20920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f20921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f20922f;
    public c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20924i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20925k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f20932r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f20918b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20919c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20926l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20927m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20928n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20929o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20930p = 0;

    public g(h hVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f20932r = hVar;
        this.f20923h = 0;
        this.f20924i = 0;
        this.j = 0;
        this.f20925k = 0;
        this.f20931q = 0;
        this.f20917a = i10;
        this.f20920d = cVar;
        this.f20921e = cVar2;
        this.f20922f = cVar3;
        this.g = cVar4;
        this.f20923h = hVar.f20954m0;
        this.f20924i = hVar.f20950i0;
        this.j = hVar.f20955n0;
        this.f20925k = hVar.f20951j0;
        this.f20931q = i11;
    }

    public final void a(e eVar) {
        int i10 = this.f20917a;
        d dVar = d.f20848t;
        h hVar = this.f20932r;
        if (i10 == 0) {
            int iF = hVar.F(eVar, this.f20931q);
            if (eVar.f20860J[0] == dVar) {
                this.f20930p++;
                iF = 0;
            }
            this.f20926l = iF + (eVar.f20869X != 8 ? hVar.f20938F0 : 0) + this.f20926l;
            int iE = hVar.E(eVar, this.f20931q);
            if (this.f20918b == null || this.f20919c < iE) {
                this.f20918b = eVar;
                this.f20919c = iE;
                this.f20927m = iE;
            }
        } else {
            int iF2 = hVar.F(eVar, this.f20931q);
            int iE2 = hVar.E(eVar, this.f20931q);
            if (eVar.f20860J[1] == dVar) {
                this.f20930p++;
                iE2 = 0;
            }
            this.f20927m = iE2 + (eVar.f20869X != 8 ? hVar.f20939G0 : 0) + this.f20927m;
            if (this.f20918b == null || this.f20919c < iF2) {
                this.f20918b = eVar;
                this.f20919c = iF2;
                this.f20926l = iF2;
            }
        }
        this.f20929o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        h hVar;
        int i11;
        e eVar;
        char c10;
        int i12;
        int i13;
        int i14;
        int i15 = this.f20929o;
        int i16 = 0;
        while (true) {
            hVar = this.f20932r;
            if (i16 >= i15 || (i14 = this.f20928n + i16) >= hVar.f20949R0) {
                break;
            }
            e eVar2 = hVar.f20948Q0[i14];
            if (eVar2 != null) {
                eVar2.u();
            }
            i16++;
        }
        if (i15 == 0 || this.f20918b == null) {
            return;
        }
        boolean z12 = z11 && i10 == 0;
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = this.f20928n + (z10 ? (i15 - 1) - i19 : i19);
            if (i20 >= hVar.f20949R0) {
                break;
            }
            if (hVar.f20948Q0[i20].f20869X == 0) {
                if (i17 == -1) {
                    i17 = i19;
                }
                i18 = i19;
            }
        }
        if (this.f20917a != 0) {
            e eVar3 = this.f20918b;
            eVar3.f20871Z = hVar.f20961t0;
            c cVar = eVar3.f20900y;
            c cVar2 = eVar3.f20851A;
            int i21 = this.f20923h;
            if (i10 > 0) {
                i21 += hVar.f20938F0;
            }
            if (z10) {
                cVar2.a(this.f20922f, i21);
                if (z11) {
                    cVar.a(this.f20920d, this.j);
                }
                if (i10 > 0) {
                    this.f20922f.f20841b.f20900y.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f20920d, i21);
                if (z11) {
                    cVar2.a(this.f20922f, this.j);
                }
                if (i10 > 0) {
                    this.f20920d.f20841b.f20851A.a(cVar, 0);
                }
            }
            e eVar4 = null;
            int i22 = 0;
            while (i22 < i15) {
                int i23 = this.f20928n + i22;
                if (i23 >= hVar.f20949R0) {
                    return;
                }
                e eVar5 = hVar.f20948Q0[i23];
                if (i22 == 0) {
                    eVar5.e(eVar5.f20901z, this.f20921e, this.f20924i);
                    int i24 = hVar.f20962u0;
                    float f3 = hVar.f20933A0;
                    if (this.f20928n == 0) {
                        int i25 = hVar.f20964w0;
                        i11 = -1;
                        if (i25 != -1) {
                            f3 = hVar.f20935C0;
                        }
                        i24 = i25;
                        eVar5.f20873a0 = i24;
                        eVar5.f20867V = f3;
                    } else {
                        i11 = -1;
                    }
                    if (z11 && (i25 = hVar.f20966y0) != i11) {
                        f3 = hVar.f20937E0;
                        i24 = i25;
                    }
                    eVar5.f20873a0 = i24;
                    eVar5.f20867V = f3;
                }
                if (i22 == i15 - 1) {
                    eVar5.e(eVar5.f20852B, this.g, this.f20925k);
                }
                if (eVar4 != null) {
                    c cVar3 = eVar4.f20852B;
                    c cVar4 = eVar5.f20901z;
                    cVar4.a(cVar3, hVar.f20939G0);
                    if (i22 == i17) {
                        int i26 = this.f20924i;
                        if (cVar4.f()) {
                            cVar4.f20845f = i26;
                        }
                    }
                    cVar3.a(cVar4, 0);
                    if (i22 == i18 + 1) {
                        int i27 = this.f20925k;
                        if (cVar3.f()) {
                            cVar3.f20845f = i27;
                        }
                    }
                }
                if (eVar5 != eVar3) {
                    if (z10) {
                        int i28 = hVar.f20940H0;
                        if (i28 == 0) {
                            eVar5.f20851A.a(cVar2, 0);
                        } else if (i28 == 1) {
                            eVar5.f20900y.a(cVar, 0);
                        } else if (i28 == 2) {
                            eVar5.f20900y.a(cVar, 0);
                            eVar5.f20851A.a(cVar2, 0);
                        }
                    } else {
                        int i29 = hVar.f20940H0;
                        if (i29 == 0) {
                            eVar5.f20900y.a(cVar, 0);
                        } else if (i29 == 1) {
                            eVar5.f20851A.a(cVar2, 0);
                        } else if (i29 == 2) {
                            if (z12) {
                                eVar5.f20900y.a(this.f20920d, this.f20923h);
                                eVar5.f20851A.a(this.f20922f, this.j);
                            } else {
                                eVar5.f20900y.a(cVar, 0);
                                eVar5.f20851A.a(cVar2, 0);
                            }
                        }
                    }
                }
                i22++;
                eVar4 = eVar5;
            }
            return;
        }
        e eVar6 = this.f20918b;
        eVar6.f20873a0 = hVar.f20962u0;
        c cVar5 = eVar6.f20852B;
        c cVar6 = eVar6.f20901z;
        int i30 = this.f20924i;
        if (i10 > 0) {
            i30 += hVar.f20939G0;
        }
        cVar6.a(this.f20921e, i30);
        if (z11) {
            cVar5.a(this.g, this.f20925k);
        }
        if (i10 > 0) {
            this.f20921e.f20841b.f20852B.a(cVar6, 0);
        }
        if (hVar.f20941I0 != 3 || eVar6.f20898w) {
            eVar = eVar6;
            break;
        }
        int i31 = 0;
        while (true) {
            if (i31 < i15) {
                int i32 = this.f20928n + (z10 ? (i15 - 1) - i31 : i31);
                if (i32 < hVar.f20949R0) {
                    eVar = hVar.f20948Q0[i32];
                    if (eVar.f20898w) {
                        break;
                    } else {
                        i31++;
                    }
                }
            }
            eVar = eVar6;
            break;
        }
        int i33 = 0;
        e eVar7 = null;
        while (i33 < i15) {
            int i34 = z10 ? (i15 - 1) - i33 : i33;
            int i35 = this.f20928n + i34;
            if (i35 >= hVar.f20949R0) {
                return;
            }
            e eVar8 = hVar.f20948Q0[i35];
            if (i33 == 0) {
                eVar8.e(eVar8.f20900y, this.f20920d, this.f20923h);
            }
            if (i34 == 0) {
                int i36 = hVar.f20961t0;
                float f7 = hVar.f20967z0;
                if (this.f20928n == 0) {
                    int i37 = hVar.f20963v0;
                    i12 = -1;
                    if (i37 != -1) {
                        f7 = hVar.f20934B0;
                    }
                    i13 = i37;
                    eVar8.f20871Z = i13;
                    eVar8.U = f7;
                } else {
                    i12 = -1;
                }
                if (!z11 || (i37 = hVar.f20965x0) == i12) {
                    i13 = i36;
                } else {
                    f7 = hVar.f20936D0;
                    i13 = i37;
                }
                eVar8.f20871Z = i13;
                eVar8.U = f7;
            }
            if (i33 == i15 - 1) {
                eVar8.e(eVar8.f20851A, this.f20922f, this.j);
            }
            if (eVar7 != null) {
                c cVar7 = eVar7.f20851A;
                c cVar8 = eVar8.f20900y;
                cVar8.a(cVar7, hVar.f20938F0);
                if (i33 == i17) {
                    int i38 = this.f20923h;
                    if (cVar8.f()) {
                        cVar8.f20845f = i38;
                    }
                }
                cVar7.a(cVar8, 0);
                if (i33 == i18 + 1) {
                    int i39 = this.j;
                    if (cVar7.f()) {
                        cVar7.f20845f = i39;
                    }
                }
            }
            if (eVar8 != eVar6) {
                int i40 = hVar.f20941I0;
                c10 = 3;
                if (i40 == 3 && eVar.f20898w && eVar8 != eVar && eVar8.f20898w) {
                    eVar8.f20853C.a(eVar.f20853C, 0);
                } else if (i40 == 0) {
                    eVar8.f20901z.a(cVar6, 0);
                } else if (i40 == 1) {
                    eVar8.f20852B.a(cVar5, 0);
                } else if (z12) {
                    eVar8.f20901z.a(this.f20921e, this.f20924i);
                    eVar8.f20852B.a(this.g, this.f20925k);
                } else {
                    eVar8.f20901z.a(cVar6, 0);
                    eVar8.f20852B.a(cVar5, 0);
                }
            } else {
                c10 = 3;
            }
            i33++;
            eVar7 = eVar8;
        }
    }

    public final int c() {
        return this.f20917a == 1 ? this.f20927m - this.f20932r.f20939G0 : this.f20927m;
    }

    public final int d() {
        return this.f20917a == 0 ? this.f20926l - this.f20932r.f20938F0 : this.f20926l;
    }

    public final void e(int i10) {
        int i11 = this.f20930p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f20929o;
        int i13 = i10 / i11;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = this.f20928n;
            int i16 = i15 + i14;
            h hVar = this.f20932r;
            if (i16 >= hVar.f20949R0) {
                break;
            }
            e eVar = hVar.f20948Q0[i15 + i14];
            int i17 = this.f20917a;
            d dVar = d.f20846r;
            d dVar2 = d.f20848t;
            if (i17 == 0) {
                if (eVar != null) {
                    d[] dVarArr = eVar.f20860J;
                    if (dVarArr[0] == dVar2 && eVar.j == 0) {
                        hVar.G(eVar, dVar, i13, dVarArr[1], eVar.j());
                    }
                }
            } else if (eVar != null) {
                d[] dVarArr2 = eVar.f20860J;
                if (dVarArr2[1] == dVar2 && eVar.f20886k == 0) {
                    int i18 = i13;
                    hVar.G(eVar, dVarArr2[0], eVar.m(), dVar, i18);
                    i13 = i18;
                }
            }
        }
        this.f20926l = 0;
        this.f20927m = 0;
        this.f20918b = null;
        this.f20919c = 0;
        int i19 = this.f20929o;
        for (int i20 = 0; i20 < i19; i20++) {
            int i21 = this.f20928n + i20;
            h hVar2 = this.f20932r;
            if (i21 >= hVar2.f20949R0) {
                return;
            }
            e eVar2 = hVar2.f20948Q0[i21];
            if (this.f20917a == 0) {
                int iM = eVar2.m();
                int i22 = hVar2.f20938F0;
                if (eVar2.f20869X == 8) {
                    i22 = 0;
                }
                this.f20926l = iM + i22 + this.f20926l;
                int iE = hVar2.E(eVar2, this.f20931q);
                if (this.f20918b == null || this.f20919c < iE) {
                    this.f20918b = eVar2;
                    this.f20919c = iE;
                    this.f20927m = iE;
                }
            } else {
                int iF = hVar2.F(eVar2, this.f20931q);
                int iE2 = hVar2.E(eVar2, this.f20931q);
                int i23 = hVar2.f20939G0;
                if (eVar2.f20869X == 8) {
                    i23 = 0;
                }
                this.f20927m = iE2 + i23 + this.f20927m;
                if (this.f20918b == null || this.f20919c < iF) {
                    this.f20918b = eVar2;
                    this.f20919c = iF;
                    this.f20926l = iF;
                }
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f20917a = i10;
        this.f20920d = cVar;
        this.f20921e = cVar2;
        this.f20922f = cVar3;
        this.g = cVar4;
        this.f20923h = i11;
        this.f20924i = i12;
        this.j = i13;
        this.f20925k = i14;
        this.f20931q = i15;
    }
}
