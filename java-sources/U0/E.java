package U0;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8008a = F9.n.B(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f8009b = F9.n.B(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8010c = p180s0.q.f21843f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p055f1.p f8011d;

    static {
        long j = p180s0.q.f21839b;
        f8011d = j != 16 ? new p055f1.c(j) : p055f1.n.f15918a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:104:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0177  */
    /* JADX WARN: Code duplicated, block: B:113:0x017b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158  */
    public static final C a(C c10, long j, p180s0.F f3, float f7, long j10, Y0.l lVar, Y0.j jVar, Y0.k kVar, Y0.e eVar, String str, long j11, p055f1.a aVar, p055f1.q qVar, p012b1.c cVar, long j12, p055f1.l lVar2, p180s0.I i10, u0 u0Var, p196u0.c cVar2) {
        p055f1.a aVar2;
        p180s0.I i11;
        u0 u0Var2;
        p196u0.c cVar3;
        p055f1.p cVar4;
        long j13;
        Y0.l lVar3;
        Y0.j jVar2;
        p055f1.q qVar2;
        p012b1.c cVar5;
        long j14;
        p055f1.l lVar4;
        long jD;
        Y0.k kVar2 = kVar;
        Y0.e eVar2 = eVar;
        String str2 = str;
        long j15 = j11;
        p063g1.p[] pVarArr = p063g1.o.f16265b;
        long j16 = j10 & 1095216660480L;
        if ((j16 == 0 || p063g1.o.a(j10, c10.f7995b)) && ((f3 != null || j == 16 || p180s0.q.c(j, c10.f7994a.b())) && ((jVar == null || jVar.equals(c10.f7997d)) && ((lVar == null || lVar.equals(c10.f7996c)) && ((eVar2 == null || eVar2 == c10.f7999f) && (((j15 & 1095216660480L) == 0 || p063g1.o.a(j15, c10.f8000h)) && ((lVar2 == null || lVar2.equals(c10.f8004m)) && p251z9.j.a(f3, c10.f7994a.e()) && ((f3 == null || f7 == c10.f7994a.c()) && ((kVar2 == null || kVar2.equals(c10.f7998e)) && (str2 == null || str2.equals(c10.g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(c10.f8001i)) {
                }
                cVar4 = p055f1.n.f15918a;
                if (f3 != null) {
                    if (f3 instanceof p180s0.L) {
                        jD = va.g.D(((p180s0.L) f3).f21813e, f7);
                        if (jD != 16) {
                            cVar4 = new p055f1.c(jD);
                        }
                    } else {
                        if (!(f3 instanceof p180s0.H)) {
                            throw new A6.a();
                        }
                        cVar4 = new p055f1.b((p180s0.H) f3, f7);
                    }
                } else if (j != 16) {
                    cVar4 = new p055f1.c(j);
                }
                p055f1.p pVarD = c10.f7994a.d(cVar4);
                if (eVar2 == null) {
                    eVar2 = c10.f7999f;
                }
                if (j16 == 0) {
                    j13 = c10.f7995b;
                } else {
                    j13 = j10;
                }
                if (lVar == null) {
                    lVar3 = c10.f7996c;
                } else {
                    lVar3 = lVar;
                }
                if (jVar == null) {
                    jVar2 = c10.f7997d;
                } else {
                    jVar2 = jVar;
                }
                if (kVar2 == null) {
                    kVar2 = c10.f7998e;
                }
                if (str2 == null) {
                    str2 = c10.g;
                }
                if ((j15 & 1095216660480L) == 0) {
                    j15 = c10.f8000h;
                }
                if (aVar2 == null) {
                    aVar2 = c10.f8001i;
                }
                if (qVar == null) {
                    qVar2 = c10.j;
                } else {
                    qVar2 = qVar;
                }
                if (cVar == null) {
                    cVar5 = c10.f8002k;
                } else {
                    cVar5 = cVar;
                }
                if (j12 != 16) {
                    j14 = j12;
                } else {
                    j14 = c10.f8003l;
                }
                if (lVar2 == null) {
                    lVar4 = c10.f8004m;
                } else {
                    lVar4 = lVar2;
                }
                if (i11 == null) {
                    i11 = c10.f8005n;
                }
                if (cVar3 == null) {
                    cVar3 = c10.f8006o;
                }
                return new C(pVarD, j13, lVar3, jVar2, kVar2, eVar2, str2, j15, aVar2, qVar2, cVar5, j14, lVar4, i11, u0Var2, cVar3);
            }
            aVar2 = aVar;
            if (qVar == null || qVar.equals(c10.j)) {
                if (cVar == null || cVar.equals(c10.f8002k)) {
                    if (j12 == 16 || p180s0.q.c(j12, c10.f8003l)) {
                        i11 = i10;
                        if (i11 == null || i11.equals(c10.f8005n)) {
                            u0Var2 = u0Var;
                            if (u0Var2 == null || u0Var2.equals(null)) {
                                cVar3 = cVar2;
                                if (cVar3 == null || cVar3.equals(c10.f8006o)) {
                                    return c10;
                                }
                            }
                        }
                        cVar3 = cVar2;
                    }
                    u0Var2 = u0Var;
                    cVar3 = cVar2;
                }
            }
            cVar4 = p055f1.n.f15918a;
            if (f3 != null) {
                if (f3 instanceof p180s0.L) {
                    jD = va.g.D(((p180s0.L) f3).f21813e, f7);
                    if (jD != 16) {
                        cVar4 = new p055f1.c(jD);
                    }
                } else {
                    if (!(f3 instanceof p180s0.H)) {
                        throw new A6.a();
                    }
                    cVar4 = new p055f1.b((p180s0.H) f3, f7);
                }
            } else if (j != 16) {
                cVar4 = new p055f1.c(j);
            }
            p055f1.p pVarD2 = c10.f7994a.d(cVar4);
            if (eVar2 == null) {
                eVar2 = c10.f7999f;
            }
            if (j16 == 0) {
                j13 = c10.f7995b;
            } else {
                j13 = j10;
            }
            if (lVar == null) {
                lVar3 = c10.f7996c;
            } else {
                lVar3 = lVar;
            }
            if (jVar == null) {
                jVar2 = c10.f7997d;
            } else {
                jVar2 = jVar;
            }
            if (kVar2 == null) {
                kVar2 = c10.f7998e;
            }
            if (str2 == null) {
                str2 = c10.g;
            }
            if ((j15 & 1095216660480L) == 0) {
                j15 = c10.f8000h;
            }
            if (aVar2 == null) {
                aVar2 = c10.f8001i;
            }
            if (qVar == null) {
                qVar2 = c10.j;
            } else {
                qVar2 = qVar;
            }
            if (cVar == null) {
                cVar5 = c10.f8002k;
            } else {
                cVar5 = cVar;
            }
            if (j12 != 16) {
                j14 = j12;
            } else {
                j14 = c10.f8003l;
            }
            if (lVar2 == null) {
                lVar4 = c10.f8004m;
            } else {
                lVar4 = lVar2;
            }
            if (i11 == null) {
                i11 = c10.f8005n;
            }
            if (cVar3 == null) {
                cVar3 = c10.f8006o;
            }
            return new C(pVarD2, j13, lVar3, jVar2, kVar2, eVar2, str2, j15, aVar2, qVar2, cVar5, j14, lVar4, i11, u0Var2, cVar3);
        }
        aVar2 = aVar;
        i11 = i10;
        u0Var2 = u0Var;
        cVar3 = cVar2;
        cVar4 = p055f1.n.f15918a;
        if (f3 != null) {
            if (f3 instanceof p180s0.L) {
                jD = va.g.D(((p180s0.L) f3).f21813e, f7);
                if (jD != 16) {
                    cVar4 = new p055f1.c(jD);
                }
            } else {
                if (!(f3 instanceof p180s0.H)) {
                    throw new A6.a();
                }
                cVar4 = new p055f1.b((p180s0.H) f3, f7);
            }
        } else if (j != 16) {
            cVar4 = new p055f1.c(j);
        }
        p055f1.p pVarD3 = c10.f7994a.d(cVar4);
        if (eVar2 == null) {
            eVar2 = c10.f7999f;
        }
        if (j16 == 0) {
            j13 = c10.f7995b;
        } else {
            j13 = j10;
        }
        if (lVar == null) {
            lVar3 = c10.f7996c;
        } else {
            lVar3 = lVar;
        }
        if (jVar == null) {
            jVar2 = c10.f7997d;
        } else {
            jVar2 = jVar;
        }
        if (kVar2 == null) {
            kVar2 = c10.f7998e;
        }
        if (str2 == null) {
            str2 = c10.g;
        }
        if ((j15 & 1095216660480L) == 0) {
            j15 = c10.f8000h;
        }
        if (aVar2 == null) {
            aVar2 = c10.f8001i;
        }
        if (qVar == null) {
            qVar2 = c10.j;
        } else {
            qVar2 = qVar;
        }
        if (cVar == null) {
            cVar5 = c10.f8002k;
        } else {
            cVar5 = cVar;
        }
        if (j12 != 16) {
            j14 = j12;
        } else {
            j14 = c10.f8003l;
        }
        if (lVar2 == null) {
            lVar4 = c10.f8004m;
        } else {
            lVar4 = lVar2;
        }
        if (i11 == null) {
            i11 = c10.f8005n;
        }
        if (cVar3 == null) {
            cVar3 = c10.f8006o;
        }
        return new C(pVarD3, j13, lVar3, jVar2, kVar2, eVar2, str2, j15, aVar2, qVar2, cVar5, j14, lVar4, i11, u0Var2, cVar3);
    }
}
