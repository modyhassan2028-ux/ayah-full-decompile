package W;

import A.C0007a;
import A.C0041r0;
import A.EnumC0047u0;
import D.AbstractC0071n;
import D.C0068k;
import F.C0152a;
import J0.AbstractC0274a0;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K.C0307b;
import K0.AbstractC0359n0;
import K0.InterfaceC0340e;
import K9.InterfaceC0402u;
import Z.AbstractC0693l0;
import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0707x;
import Z.InterfaceC0687i0;
import androidx.compose.material3.MinimumInteractiveModifier;
import java.util.ArrayList;
import java.util.List;
import p223x.C1411c;
import p223x.C1422k;
import p232y.C1460n;

/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V.e f8870a = new V.e(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00f7, please report this as an issue */
    public static final void a(p241y9.a aVar, p074h0.d dVar, l0.r rVar, p241y9.e eVar, p241y9.e eVar2, p241y9.e eVar3, p180s0.J j, long j10, long j11, long j12, long j13, float f3, p104k1.n nVar, C0698o c0698o, int i10, int i11) {
        p241y9.a aVar2;
        int i12;
        p241y9.e eVar4;
        int i13;
        int i14;
        p241y9.e eVar5;
        int i15;
        l0.r rVar2;
        p241y9.e eVar6;
        long j14;
        long j15;
        float f7;
        long j16;
        p104k1.n nVar2;
        int i16;
        p180s0.J j17;
        p180s0.J j18;
        p104k1.n nVar3;
        p241y9.e eVar7;
        float f10;
        l0.r rVar3;
        long j19;
        long j20;
        long j21;
        C0699o0 c0699o0R;
        int i17;
        int i18;
        c0698o.V(-2081346864);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i12 = (c0698o.i(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.i(dVar) ? 32 : 16;
        }
        int i19 = i12 | 384;
        int i20 = i11 & 8;
        if (i20 == 0) {
            if ((i10 & 3072) == 0) {
                eVar4 = eVar;
                i19 |= c0698o.i(eVar4) ? 2048 : 1024;
            }
            i13 = i19 | 24576;
            i14 = i11 & 32;
            if (i14 != 0) {
                if ((196608 & i10) == 0) {
                    eVar5 = eVar2;
                    if (c0698o.i(eVar5)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i13 |= i15;
                }
                if ((1572864 & i10) != 0) {
                    if (c0698o.i(eVar3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((12582912 & i10) == 0) {
                    i13 |= 4194304;
                }
                if ((100663296 & i10) != 0) {
                    if (c0698o.f(j10)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i13 |= i17;
                }
                if ((805306368 & i10) == 0) {
                    i13 |= 268435456;
                }
                if ((306783379 & i13) == 306783378 || !c0698o.x()) {
                    c0698o.P();
                    if ((i10 & 1) != 0 || c0698o.w()) {
                        if (i20 != 0) {
                            eVar4 = null;
                        }
                        p241y9.e eVar8 = i14 == 0 ? eVar5 : null;
                        float f11 = AbstractC0535a.f8956a;
                        p180s0.J jA = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                        long jD = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                        int i21 = i13 & (-1908408321);
                        long jD2 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                        long jD3 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                        float f12 = AbstractC0535a.f8956a;
                        p104k1.n nVar4 = new p104k1.n(7);
                        rVar2 = l0.o.f19333a;
                        eVar6 = eVar8;
                        j14 = jD;
                        j15 = jD2;
                        f7 = f12;
                        j16 = jD3;
                        nVar2 = nVar4;
                        i16 = i21;
                        j17 = jA;
                    } else {
                        c0698o.N();
                        rVar2 = rVar;
                        j14 = j11;
                        j15 = j12;
                        j16 = j13;
                        f7 = f3;
                        nVar2 = nVar;
                        eVar6 = eVar5;
                        i16 = i13 & (-1908408321);
                        j17 = j;
                    }
                    c0698o.q();
                    int i22 = i16 & 2147483646;
                    p241y9.a aVar3 = aVar2;
                    l0.r rVar4 = rVar2;
                    AbstractC0567i.c(aVar3, dVar, rVar4, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i22, 3456);
                    eVar5 = eVar6;
                    j18 = j17;
                    nVar3 = nVar2;
                    eVar7 = eVar4;
                    f10 = f7;
                    rVar3 = rVar4;
                    j19 = j16;
                    j20 = j15;
                    j21 = j14;
                } else {
                    c0698o.N();
                    j18 = j;
                    j21 = j11;
                    j20 = j12;
                    j19 = j13;
                    f10 = f3;
                    nVar3 = nVar;
                    eVar7 = eVar4;
                    rVar3 = rVar;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new C0559g(aVar, dVar, rVar3, eVar7, eVar5, eVar3, j18, j10, j21, j20, j19, f10, nVar3, i10, i11, 1);
                }
            }
            i13 = 221184 | i19;
            eVar5 = eVar2;
            if ((1572864 & i10) != 0) {
                if (c0698o.i(eVar3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((12582912 & i10) == 0) {
                i13 |= 4194304;
            }
            if ((100663296 & i10) != 0) {
                if (c0698o.f(j10)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i13 |= i17;
            }
            if ((805306368 & i10) == 0) {
                i13 |= 268435456;
            }
            if ((306783379 & i13) == 306783378) {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f13 = AbstractC0535a.f8956a;
                    p180s0.J jA2 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD4 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i23 = i13 & (-1908408321);
                    long jD5 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD6 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f14 = AbstractC0535a.f8956a;
                    p104k1.n nVar5 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD4;
                    j15 = jD5;
                    f7 = f14;
                    j16 = jD6;
                    nVar2 = nVar5;
                    i16 = i23;
                    j17 = jA2;
                } else {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f15 = AbstractC0535a.f8956a;
                    p180s0.J jA3 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD7 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i24 = i13 & (-1908408321);
                    long jD8 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD9 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f16 = AbstractC0535a.f8956a;
                    p104k1.n nVar6 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD7;
                    j15 = jD8;
                    f7 = f16;
                    j16 = jD9;
                    nVar2 = nVar6;
                    i16 = i24;
                    j17 = jA3;
                }
                c0698o.q();
                int i25 = i16 & 2147483646;
                p241y9.a aVar4 = aVar2;
                l0.r rVar5 = rVar2;
                AbstractC0567i.c(aVar4, dVar, rVar5, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i25, 3456);
                eVar5 = eVar6;
                j18 = j17;
                nVar3 = nVar2;
                eVar7 = eVar4;
                f10 = f7;
                rVar3 = rVar5;
                j19 = j16;
                j20 = j15;
                j21 = j14;
            } else {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f17 = AbstractC0535a.f8956a;
                    p180s0.J jA4 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD10 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i26 = i13 & (-1908408321);
                    long jD11 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD12 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f18 = AbstractC0535a.f8956a;
                    p104k1.n nVar7 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD10;
                    j15 = jD11;
                    f7 = f18;
                    j16 = jD12;
                    nVar2 = nVar7;
                    i16 = i26;
                    j17 = jA4;
                } else {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f19 = AbstractC0535a.f8956a;
                    p180s0.J jA5 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD13 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i27 = i13 & (-1908408321);
                    long jD14 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD15 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f110 = AbstractC0535a.f8956a;
                    p104k1.n nVar8 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD13;
                    j15 = jD14;
                    f7 = f110;
                    j16 = jD15;
                    nVar2 = nVar8;
                    i16 = i27;
                    j17 = jA5;
                }
                c0698o.q();
                int i28 = i16 & 2147483646;
                p241y9.a aVar5 = aVar2;
                l0.r rVar6 = rVar2;
                AbstractC0567i.c(aVar5, dVar, rVar6, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i28, 3456);
                eVar5 = eVar6;
                j18 = j17;
                nVar3 = nVar2;
                eVar7 = eVar4;
                f10 = f7;
                rVar3 = rVar6;
                j19 = j16;
                j20 = j15;
                j21 = j14;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0559g(aVar, dVar, rVar3, eVar7, eVar5, eVar3, j18, j10, j21, j20, j19, f10, nVar3, i10, i11, 1);
            }
        }
        i19 = i12 | 3456;
        eVar4 = eVar;
        i13 = i19 | 24576;
        i14 = i11 & 32;
        if (i14 != 0) {
            if ((196608 & i10) == 0) {
                eVar5 = eVar2;
                if (c0698o.i(eVar5)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i13 |= i15;
            }
            if ((1572864 & i10) != 0) {
                if (c0698o.i(eVar3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((12582912 & i10) == 0) {
                i13 |= 4194304;
            }
            if ((100663296 & i10) != 0) {
                if (c0698o.f(j10)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i13 |= i17;
            }
            if ((805306368 & i10) == 0) {
                i13 |= 268435456;
            }
            if ((306783379 & i13) == 306783378) {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f111 = AbstractC0535a.f8956a;
                    p180s0.J jA6 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD16 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i29 = i13 & (-1908408321);
                    long jD17 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD18 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f112 = AbstractC0535a.f8956a;
                    p104k1.n nVar9 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD16;
                    j15 = jD17;
                    f7 = f112;
                    j16 = jD18;
                    nVar2 = nVar9;
                    i16 = i29;
                    j17 = jA6;
                } else {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f113 = AbstractC0535a.f8956a;
                    p180s0.J jA7 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD19 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i210 = i13 & (-1908408321);
                    long jD110 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD111 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f114 = AbstractC0535a.f8956a;
                    p104k1.n nVar10 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD19;
                    j15 = jD110;
                    f7 = f114;
                    j16 = jD111;
                    nVar2 = nVar10;
                    i16 = i210;
                    j17 = jA7;
                }
                c0698o.q();
                int i211 = i16 & 2147483646;
                p241y9.a aVar6 = aVar2;
                l0.r rVar7 = rVar2;
                AbstractC0567i.c(aVar6, dVar, rVar7, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i211, 3456);
                eVar5 = eVar6;
                j18 = j17;
                nVar3 = nVar2;
                eVar7 = eVar4;
                f10 = f7;
                rVar3 = rVar7;
                j19 = j16;
                j20 = j15;
                j21 = j14;
            } else {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f115 = AbstractC0535a.f8956a;
                    p180s0.J jA8 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD112 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i212 = i13 & (-1908408321);
                    long jD113 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD114 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f116 = AbstractC0535a.f8956a;
                    p104k1.n nVar11 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD112;
                    j15 = jD113;
                    f7 = f116;
                    j16 = jD114;
                    nVar2 = nVar11;
                    i16 = i212;
                    j17 = jA8;
                } else {
                    if (i20 != 0) {
                        eVar4 = null;
                    }
                    if (i14 == 0) {
                    }
                    float f117 = AbstractC0535a.f8956a;
                    p180s0.J jA9 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                    long jD115 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                    int i213 = i13 & (-1908408321);
                    long jD116 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                    long jD117 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                    float f118 = AbstractC0535a.f8956a;
                    p104k1.n nVar12 = new p104k1.n(7);
                    rVar2 = l0.o.f19333a;
                    eVar6 = eVar8;
                    j14 = jD115;
                    j15 = jD116;
                    f7 = f118;
                    j16 = jD117;
                    nVar2 = nVar12;
                    i16 = i213;
                    j17 = jA9;
                }
                c0698o.q();
                int i214 = i16 & 2147483646;
                p241y9.a aVar7 = aVar2;
                l0.r rVar8 = rVar2;
                AbstractC0567i.c(aVar7, dVar, rVar8, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i214, 3456);
                eVar5 = eVar6;
                j18 = j17;
                nVar3 = nVar2;
                eVar7 = eVar4;
                f10 = f7;
                rVar3 = rVar8;
                j19 = j16;
                j20 = j15;
                j21 = j14;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0559g(aVar, dVar, rVar3, eVar7, eVar5, eVar3, j18, j10, j21, j20, j19, f10, nVar3, i10, i11, 1);
            }
        }
        i13 = 221184 | i19;
        eVar5 = eVar2;
        if ((1572864 & i10) != 0) {
            if (c0698o.i(eVar3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        if ((100663296 & i10) != 0) {
            if (c0698o.f(j10)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i13 |= i17;
        }
        if ((805306368 & i10) == 0) {
            i13 |= 268435456;
        }
        if ((306783379 & i13) == 306783378) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    eVar4 = null;
                }
                if (i14 == 0) {
                }
                float f119 = AbstractC0535a.f8956a;
                p180s0.J jA10 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                long jD118 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                int i215 = i13 & (-1908408321);
                long jD119 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                long jD1110 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                float f1110 = AbstractC0535a.f8956a;
                p104k1.n nVar13 = new p104k1.n(7);
                rVar2 = l0.o.f19333a;
                eVar6 = eVar8;
                j14 = jD118;
                j15 = jD119;
                f7 = f1110;
                j16 = jD1110;
                nVar2 = nVar13;
                i16 = i215;
                j17 = jA10;
            } else {
                if (i20 != 0) {
                    eVar4 = null;
                }
                if (i14 == 0) {
                }
                float f1111 = AbstractC0535a.f8956a;
                p180s0.J jA11 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                long jD1111 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                int i216 = i13 & (-1908408321);
                long jD1112 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                long jD1113 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                float f1112 = AbstractC0535a.f8956a;
                p104k1.n nVar14 = new p104k1.n(7);
                rVar2 = l0.o.f19333a;
                eVar6 = eVar8;
                j14 = jD1111;
                j15 = jD1112;
                f7 = f1112;
                j16 = jD1113;
                nVar2 = nVar14;
                i16 = i216;
                j17 = jA11;
            }
            c0698o.q();
            int i217 = i16 & 2147483646;
            p241y9.a aVar8 = aVar2;
            l0.r rVar9 = rVar2;
            AbstractC0567i.c(aVar8, dVar, rVar9, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i217, 3456);
            eVar5 = eVar6;
            j18 = j17;
            nVar3 = nVar2;
            eVar7 = eVar4;
            f10 = f7;
            rVar3 = rVar9;
            j19 = j16;
            j20 = j15;
            j21 = j14;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    eVar4 = null;
                }
                if (i14 == 0) {
                }
                float f1113 = AbstractC0535a.f8956a;
                p180s0.J jA12 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                long jD1114 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                int i218 = i13 & (-1908408321);
                long jD1115 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                long jD1116 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                float f1114 = AbstractC0535a.f8956a;
                p104k1.n nVar15 = new p104k1.n(7);
                rVar2 = l0.o.f19333a;
                eVar6 = eVar8;
                j14 = jD1114;
                j15 = jD1115;
                f7 = f1114;
                j16 = jD1116;
                nVar2 = nVar15;
                i16 = i218;
                j17 = jA12;
            } else {
                if (i20 != 0) {
                    eVar4 = null;
                }
                if (i14 == 0) {
                }
                float f1115 = AbstractC0535a.f8956a;
                p180s0.J jA13 = AbstractC0537a1.a(Y.b.f10138a, c0698o);
                long jD1117 = AbstractC0568i0.d(Y.b.f10143f, c0698o);
                int i219 = i13 & (-1908408321);
                long jD1118 = AbstractC0568i0.d(Y.b.f10139b, c0698o);
                long jD1119 = AbstractC0568i0.d(Y.b.f10141d, c0698o);
                float f1116 = AbstractC0535a.f8956a;
                p104k1.n nVar16 = new p104k1.n(7);
                rVar2 = l0.o.f19333a;
                eVar6 = eVar8;
                j14 = jD1117;
                j15 = jD1118;
                f7 = f1116;
                j16 = jD1119;
                nVar2 = nVar16;
                i16 = i219;
                j17 = jA13;
            }
            c0698o.q();
            int i2110 = i16 & 2147483646;
            p241y9.a aVar9 = aVar2;
            l0.r rVar10 = rVar2;
            AbstractC0567i.c(aVar9, dVar, rVar10, eVar4, eVar6, eVar3, j17, j10, j14, j15, j16, f7, nVar2, c0698o, i2110, 3456);
            eVar5 = eVar6;
            j18 = j17;
            nVar3 = nVar2;
            eVar7 = eVar4;
            f10 = f7;
            rVar3 = rVar10;
            j19 = j16;
            j20 = j15;
            j21 = j14;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0559g(aVar, dVar, rVar3, eVar7, eVar5, eVar3, j18, j10, j21, j20, j19, f10, nVar3, i10, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void b(p074h0.d dVar, l0.r rVar, P p10, float f3, float f7, p180s0.J j, long j10, long j11, float f10, float f11, p241y9.e eVar, boolean z10, p241y9.f fVar, long j12, long j13, p074h0.d dVar2, C0698o c0698o, int i10, int i11) {
        p180s0.J jA;
        long jD;
        int i12;
        long j14;
        int i13;
        p241y9.f fVar2;
        int i14;
        long jB;
        int i15;
        float f12;
        long j15;
        long j16;
        l0.r rVar2;
        float f13;
        int i16;
        float f14;
        p180s0.J j17;
        boolean z11;
        p241y9.f fVar3;
        boolean z12;
        Object objH;
        l0.r rVar3;
        long j18;
        long j19;
        float f15;
        p180s0.J j20;
        long j21;
        long j22;
        float f16;
        float f17;
        boolean z13;
        C0699o0 c0699o0R;
        c0698o.V(-1523924135);
        int i17 = i10 | 48 | (c0698o.g(p10) ? 256 : 128);
        if ((i10 & 3072) == 0) {
            i17 |= c0698o.d(f3) ? 2048 : 1024;
        }
        int i18 = i17 | 24576;
        if ((i11 & 32) == 0) {
            jA = j;
            int i19 = c0698o.g(jA) ? 131072 : 65536;
            int i20 = i18 | i19;
            if ((i11 & 64) == 0) {
                jD = j10;
                int i21 = c0698o.f(jD) ? 1048576 : 524288;
                i12 = i20 | i21 | 910163968;
                if ((i11 & 16384) == 0) {
                    j14 = j12;
                    int i22 = c0698o.f(j14) ? 16384 : 8192;
                    i13 = i22 | 1641910;
                    if ((306783379 & i12) != 306783378 && (599187 & i13) == 599186 && c0698o.x()) {
                        c0698o.N();
                        rVar3 = rVar;
                        f15 = f7;
                        f16 = f10;
                        f17 = f11;
                        z13 = z10;
                        fVar3 = fVar;
                        j19 = j13;
                        j18 = j14;
                        j22 = j11;
                        j21 = jD;
                        j20 = jA;
                    } else {
                        c0698o.P();
                        int i23 = 0;
                        if ((i10 & 1) != 0 || c0698o.w()) {
                            float f18 = B.f8463c;
                            if ((i11 & 32) != 0) {
                                float f19 = Y.n.f10216a;
                                jA = AbstractC0537a1.a(2, c0698o);
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                float f20 = Y.n.f10216a;
                                jD = AbstractC0568i0.d(40, c0698o);
                                i12 &= -3670017;
                            }
                            long jB2 = AbstractC0568i0.b(jD, c0698o);
                            int i24 = i12 & (-29360129);
                            float f21 = 0;
                            float f22 = B.f8462b;
                            fVar2 = AbstractC0583n0.f9282a;
                            if ((i11 & 16384) != 0) {
                                j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                                i14 = 1641910;
                            } else {
                                i14 = i13;
                            }
                            jB = AbstractC0568i0.b(j14, c0698o);
                            int i25 = i14 & (-458753);
                            i15 = i24;
                            f12 = f18;
                            j15 = j14;
                            j16 = jB2;
                            rVar2 = l0.o.f19333a;
                            f13 = f22;
                            i16 = i25;
                            f14 = f21;
                            j17 = jA;
                            z11 = true;
                        } else {
                            c0698o.N();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            rVar2 = rVar;
                            f13 = f11;
                            fVar2 = fVar;
                            jB = j13;
                            i15 = i12 & (-29360129);
                            j17 = jA;
                            j15 = j14;
                            i16 = ((i11 & 16384) == 0 ? i13 : 1641910) & (-458753);
                            f12 = f7;
                            j16 = j11;
                            f14 = f10;
                            z11 = z10;
                        }
                        c0698o.q();
                        C0561g1 c0561g1 = p10.f8750a;
                        p074h0.d dVarD = p074h0.j.d(-459880832, new C(f3, i23, dVar2), c0698o);
                        int i26 = i15;
                        fVar3 = fVar2;
                        float f23 = f12;
                        boolean z14 = z11;
                        p180s0.J j23 = j17;
                        long j24 = jD;
                        long j25 = j16;
                        float f24 = f14;
                        float f25 = f13;
                        p074h0.d dVarD2 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                        p074h0.d dVarD3 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                        z12 = (((i26 & 896) ^ 384) <= 256 && c0698o.g(p10)) || (i26 & 384) == 256;
                        objH = c0698o.H();
                        if (z12 || objH == C0690k.f10683a) {
                            objH = new C0041r0(27, p10);
                            c0698o.e0(objH);
                        }
                        l0.r rVar4 = rVar2;
                        long j26 = j15;
                        long j27 = jB;
                        c(rVar4, dVarD, dVarD2, dVarD3, (p241y9.a) objH, c0561g1, j26, j27, c0698o, 28086 | ((i16 << 9) & 29360128));
                        rVar3 = rVar4;
                        j18 = j26;
                        j19 = j27;
                        f15 = f23;
                        j20 = j23;
                        j21 = j24;
                        j22 = j25;
                        f16 = f24;
                        f17 = f25;
                        z13 = z14;
                    }
                    c0699o0R = c0698o.r();
                    if (c0699o0R != null) {
                        c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
                    }
                }
                j14 = j12;
                i13 = i22 | 1641910;
                if ((306783379 & i12) != 306783378) {
                    c0698o.P();
                    int i27 = 0;
                    if ((i10 & 1) != 0) {
                        float f110 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f111 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f26 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB3 = AbstractC0568i0.b(jD, c0698o);
                        int i28 = i12 & (-29360129);
                        float f27 = 0;
                        float f28 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i29 = i14 & (-458753);
                        i15 = i28;
                        f12 = f110;
                        j15 = j14;
                        j16 = jB3;
                        rVar2 = l0.o.f19333a;
                        f13 = f28;
                        i16 = i29;
                        f14 = f27;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f112 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f113 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f29 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB4 = AbstractC0568i0.b(jD, c0698o);
                        int i210 = i12 & (-29360129);
                        float f210 = 0;
                        float f211 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i211 = i14 & (-458753);
                        i15 = i210;
                        f12 = f112;
                        j15 = j14;
                        j16 = jB4;
                        rVar2 = l0.o.f19333a;
                        f13 = f211;
                        i16 = i211;
                        f14 = f210;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g2 = p10.f8750a;
                    p074h0.d dVarD4 = p074h0.j.d(-459880832, new C(f3, i27, dVar2), c0698o);
                    int i212 = i15;
                    fVar3 = fVar2;
                    float f212 = f12;
                    boolean z15 = z11;
                    p180s0.J j28 = j17;
                    long j29 = jD;
                    long j210 = j16;
                    float f213 = f14;
                    float f214 = f13;
                    p074h0.d dVarD5 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD6 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i212 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar5 = rVar2;
                    long j211 = j15;
                    long j212 = jB;
                    c(rVar5, dVarD4, dVarD5, dVarD6, (p241y9.a) objH, c0561g2, j211, j212, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar5;
                    j18 = j211;
                    j19 = j212;
                    f15 = f212;
                    j20 = j28;
                    j21 = j29;
                    j22 = j210;
                    f16 = f213;
                    f17 = f214;
                    z13 = z15;
                } else {
                    c0698o.P();
                    int i213 = 0;
                    if ((i10 & 1) != 0) {
                        float f114 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f115 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f215 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB5 = AbstractC0568i0.b(jD, c0698o);
                        int i214 = i12 & (-29360129);
                        float f216 = 0;
                        float f217 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i215 = i14 & (-458753);
                        i15 = i214;
                        f12 = f114;
                        j15 = j14;
                        j16 = jB5;
                        rVar2 = l0.o.f19333a;
                        f13 = f217;
                        i16 = i215;
                        f14 = f216;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f116 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f117 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f218 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB6 = AbstractC0568i0.b(jD, c0698o);
                        int i216 = i12 & (-29360129);
                        float f219 = 0;
                        float f2110 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i217 = i14 & (-458753);
                        i15 = i216;
                        f12 = f116;
                        j15 = j14;
                        j16 = jB6;
                        rVar2 = l0.o.f19333a;
                        f13 = f2110;
                        i16 = i217;
                        f14 = f219;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g3 = p10.f8750a;
                    p074h0.d dVarD7 = p074h0.j.d(-459880832, new C(f3, i213, dVar2), c0698o);
                    int i218 = i15;
                    fVar3 = fVar2;
                    float f2111 = f12;
                    boolean z16 = z11;
                    p180s0.J j213 = j17;
                    long j214 = jD;
                    long j215 = j16;
                    float f2112 = f14;
                    float f2113 = f13;
                    p074h0.d dVarD8 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD9 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i218 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar6 = rVar2;
                    long j216 = j15;
                    long j217 = jB;
                    c(rVar6, dVarD7, dVarD8, dVarD9, (p241y9.a) objH, c0561g3, j216, j217, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar6;
                    j18 = j216;
                    j19 = j217;
                    f15 = f2111;
                    j20 = j213;
                    j21 = j214;
                    j22 = j215;
                    f16 = f2112;
                    f17 = f2113;
                    z13 = z16;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
                }
            }
            jD = j10;
            i12 = i20 | i21 | 910163968;
            if ((i11 & 16384) == 0) {
                j14 = j12;
                if (c0698o.f(j14)) {
                }
                i13 = i22 | 1641910;
                if ((306783379 & i12) != 306783378) {
                    c0698o.P();
                    int i219 = 0;
                    if ((i10 & 1) != 0) {
                        float f118 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f119 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f2114 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB7 = AbstractC0568i0.b(jD, c0698o);
                        int i2110 = i12 & (-29360129);
                        float f2115 = 0;
                        float f2116 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2111 = i14 & (-458753);
                        i15 = i2110;
                        f12 = f118;
                        j15 = j14;
                        j16 = jB7;
                        rVar2 = l0.o.f19333a;
                        f13 = f2116;
                        i16 = i2111;
                        f14 = f2115;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f1110 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f1111 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f2117 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB8 = AbstractC0568i0.b(jD, c0698o);
                        int i2112 = i12 & (-29360129);
                        float f2118 = 0;
                        float f2119 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2113 = i14 & (-458753);
                        i15 = i2112;
                        f12 = f1110;
                        j15 = j14;
                        j16 = jB8;
                        rVar2 = l0.o.f19333a;
                        f13 = f2119;
                        i16 = i2113;
                        f14 = f2118;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g4 = p10.f8750a;
                    p074h0.d dVarD10 = p074h0.j.d(-459880832, new C(f3, i219, dVar2), c0698o);
                    int i2114 = i15;
                    fVar3 = fVar2;
                    float f21110 = f12;
                    boolean z17 = z11;
                    p180s0.J j218 = j17;
                    long j219 = jD;
                    long j2110 = j16;
                    float f21111 = f14;
                    float f21112 = f13;
                    p074h0.d dVarD11 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD12 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i2114 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar7 = rVar2;
                    long j2111 = j15;
                    long j2112 = jB;
                    c(rVar7, dVarD10, dVarD11, dVarD12, (p241y9.a) objH, c0561g4, j2111, j2112, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar7;
                    j18 = j2111;
                    j19 = j2112;
                    f15 = f21110;
                    j20 = j218;
                    j21 = j219;
                    j22 = j2110;
                    f16 = f21111;
                    f17 = f21112;
                    z13 = z17;
                } else {
                    c0698o.P();
                    int i2115 = 0;
                    if ((i10 & 1) != 0) {
                        float f1112 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f1113 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f21113 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB9 = AbstractC0568i0.b(jD, c0698o);
                        int i2116 = i12 & (-29360129);
                        float f21114 = 0;
                        float f21115 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2117 = i14 & (-458753);
                        i15 = i2116;
                        f12 = f1112;
                        j15 = j14;
                        j16 = jB9;
                        rVar2 = l0.o.f19333a;
                        f13 = f21115;
                        i16 = i2117;
                        f14 = f21114;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f1114 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f1115 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f21116 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB10 = AbstractC0568i0.b(jD, c0698o);
                        int i2118 = i12 & (-29360129);
                        float f21117 = 0;
                        float f21118 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2119 = i14 & (-458753);
                        i15 = i2118;
                        f12 = f1114;
                        j15 = j14;
                        j16 = jB10;
                        rVar2 = l0.o.f19333a;
                        f13 = f21118;
                        i16 = i2119;
                        f14 = f21117;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g5 = p10.f8750a;
                    p074h0.d dVarD13 = p074h0.j.d(-459880832, new C(f3, i2115, dVar2), c0698o);
                    int i21110 = i15;
                    fVar3 = fVar2;
                    float f21119 = f12;
                    boolean z18 = z11;
                    p180s0.J j2113 = j17;
                    long j2114 = jD;
                    long j2115 = j16;
                    float f211110 = f14;
                    float f211111 = f13;
                    p074h0.d dVarD14 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD15 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i21110 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar8 = rVar2;
                    long j2116 = j15;
                    long j2117 = jB;
                    c(rVar8, dVarD13, dVarD14, dVarD15, (p241y9.a) objH, c0561g5, j2116, j2117, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar8;
                    j18 = j2116;
                    j19 = j2117;
                    f15 = f21119;
                    j20 = j2113;
                    j21 = j2114;
                    j22 = j2115;
                    f16 = f211110;
                    f17 = f211111;
                    z13 = z18;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
                }
            }
            j14 = j12;
            i13 = i22 | 1641910;
            if ((306783379 & i12) != 306783378) {
                c0698o.P();
                int i21111 = 0;
                if ((i10 & 1) != 0) {
                    float f1116 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1117 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f211112 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB11 = AbstractC0568i0.b(jD, c0698o);
                    int i21112 = i12 & (-29360129);
                    float f211113 = 0;
                    float f211114 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21113 = i14 & (-458753);
                    i15 = i21112;
                    f12 = f1116;
                    j15 = j14;
                    j16 = jB11;
                    rVar2 = l0.o.f19333a;
                    f13 = f211114;
                    i16 = i21113;
                    f14 = f211113;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f1118 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1119 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f211115 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB12 = AbstractC0568i0.b(jD, c0698o);
                    int i21114 = i12 & (-29360129);
                    float f211116 = 0;
                    float f211117 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21115 = i14 & (-458753);
                    i15 = i21114;
                    f12 = f1118;
                    j15 = j14;
                    j16 = jB12;
                    rVar2 = l0.o.f19333a;
                    f13 = f211117;
                    i16 = i21115;
                    f14 = f211116;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g6 = p10.f8750a;
                p074h0.d dVarD16 = p074h0.j.d(-459880832, new C(f3, i21111, dVar2), c0698o);
                int i21116 = i15;
                fVar3 = fVar2;
                float f211118 = f12;
                boolean z19 = z11;
                p180s0.J j2118 = j17;
                long j2119 = jD;
                long j21110 = j16;
                float f211119 = f14;
                float f2111110 = f13;
                p074h0.d dVarD17 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD18 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i21116 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar9 = rVar2;
                long j21111 = j15;
                long j21112 = jB;
                c(rVar9, dVarD16, dVarD17, dVarD18, (p241y9.a) objH, c0561g6, j21111, j21112, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar9;
                j18 = j21111;
                j19 = j21112;
                f15 = f211118;
                j20 = j2118;
                j21 = j2119;
                j22 = j21110;
                f16 = f211119;
                f17 = f2111110;
                z13 = z19;
            } else {
                c0698o.P();
                int i21117 = 0;
                if ((i10 & 1) != 0) {
                    float f11110 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f11111 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f2111111 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB13 = AbstractC0568i0.b(jD, c0698o);
                    int i21118 = i12 & (-29360129);
                    float f2111112 = 0;
                    float f2111113 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21119 = i14 & (-458753);
                    i15 = i21118;
                    f12 = f11110;
                    j15 = j14;
                    j16 = jB13;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111113;
                    i16 = i21119;
                    f14 = f2111112;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f11112 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f11113 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f2111114 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB14 = AbstractC0568i0.b(jD, c0698o);
                    int i211110 = i12 & (-29360129);
                    float f2111115 = 0;
                    float f2111116 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i211111 = i14 & (-458753);
                    i15 = i211110;
                    f12 = f11112;
                    j15 = j14;
                    j16 = jB14;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111116;
                    i16 = i211111;
                    f14 = f2111115;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g7 = p10.f8750a;
                p074h0.d dVarD19 = p074h0.j.d(-459880832, new C(f3, i21117, dVar2), c0698o);
                int i211112 = i15;
                fVar3 = fVar2;
                float f2111117 = f12;
                boolean z110 = z11;
                p180s0.J j21113 = j17;
                long j21114 = jD;
                long j21115 = j16;
                float f2111118 = f14;
                float f2111119 = f13;
                p074h0.d dVarD110 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD111 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i211112 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar10 = rVar2;
                long j21116 = j15;
                long j21117 = jB;
                c(rVar10, dVarD19, dVarD110, dVarD111, (p241y9.a) objH, c0561g7, j21116, j21117, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar10;
                j18 = j21116;
                j19 = j21117;
                f15 = f2111117;
                j20 = j21113;
                j21 = j21114;
                j22 = j21115;
                f16 = f2111118;
                f17 = f2111119;
                z13 = z110;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
            }
        }
        jA = j;
        int i220 = i18 | i19;
        if ((i11 & 64) == 0) {
            jD = j10;
            if (c0698o.f(jD)) {
            }
            i12 = i220 | i21 | 910163968;
            if ((i11 & 16384) == 0) {
                j14 = j12;
                if (c0698o.f(j14)) {
                }
                i13 = i22 | 1641910;
                if ((306783379 & i12) != 306783378) {
                    c0698o.P();
                    int i211113 = 0;
                    if ((i10 & 1) != 0) {
                        float f11114 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f11115 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f21111110 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB15 = AbstractC0568i0.b(jD, c0698o);
                        int i211114 = i12 & (-29360129);
                        float f21111111 = 0;
                        float f21111112 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i211115 = i14 & (-458753);
                        i15 = i211114;
                        f12 = f11114;
                        j15 = j14;
                        j16 = jB15;
                        rVar2 = l0.o.f19333a;
                        f13 = f21111112;
                        i16 = i211115;
                        f14 = f21111111;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f11116 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f11117 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f21111113 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB16 = AbstractC0568i0.b(jD, c0698o);
                        int i211116 = i12 & (-29360129);
                        float f21111114 = 0;
                        float f21111115 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i211117 = i14 & (-458753);
                        i15 = i211116;
                        f12 = f11116;
                        j15 = j14;
                        j16 = jB16;
                        rVar2 = l0.o.f19333a;
                        f13 = f21111115;
                        i16 = i211117;
                        f14 = f21111114;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g8 = p10.f8750a;
                    p074h0.d dVarD112 = p074h0.j.d(-459880832, new C(f3, i211113, dVar2), c0698o);
                    int i211118 = i15;
                    fVar3 = fVar2;
                    float f21111116 = f12;
                    boolean z111 = z11;
                    p180s0.J j21118 = j17;
                    long j21119 = jD;
                    long j211110 = j16;
                    float f21111117 = f14;
                    float f21111118 = f13;
                    p074h0.d dVarD113 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD114 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i211118 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar11 = rVar2;
                    long j211111 = j15;
                    long j211112 = jB;
                    c(rVar11, dVarD112, dVarD113, dVarD114, (p241y9.a) objH, c0561g8, j211111, j211112, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar11;
                    j18 = j211111;
                    j19 = j211112;
                    f15 = f21111116;
                    j20 = j21118;
                    j21 = j21119;
                    j22 = j211110;
                    f16 = f21111117;
                    f17 = f21111118;
                    z13 = z111;
                } else {
                    c0698o.P();
                    int i211119 = 0;
                    if ((i10 & 1) != 0) {
                        float f11118 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f11119 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f21111119 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB17 = AbstractC0568i0.b(jD, c0698o);
                        int i2111110 = i12 & (-29360129);
                        float f211111110 = 0;
                        float f211111111 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2111111 = i14 & (-458753);
                        i15 = i2111110;
                        f12 = f11118;
                        j15 = j14;
                        j16 = jB17;
                        rVar2 = l0.o.f19333a;
                        f13 = f211111111;
                        i16 = i2111111;
                        f14 = f211111110;
                        j17 = jA;
                        z11 = true;
                    } else {
                        float f111110 = B.f8463c;
                        if ((i11 & 32) != 0) {
                            float f111111 = Y.n.f10216a;
                            jA = AbstractC0537a1.a(2, c0698o);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            float f211111112 = Y.n.f10216a;
                            jD = AbstractC0568i0.d(40, c0698o);
                            i12 &= -3670017;
                        }
                        long jB18 = AbstractC0568i0.b(jD, c0698o);
                        int i2111112 = i12 & (-29360129);
                        float f211111113 = 0;
                        float f211111114 = B.f8462b;
                        fVar2 = AbstractC0583n0.f9282a;
                        if ((i11 & 16384) != 0) {
                            j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                            i14 = 1641910;
                        } else {
                            i14 = i13;
                        }
                        jB = AbstractC0568i0.b(j14, c0698o);
                        int i2111113 = i14 & (-458753);
                        i15 = i2111112;
                        f12 = f111110;
                        j15 = j14;
                        j16 = jB18;
                        rVar2 = l0.o.f19333a;
                        f13 = f211111114;
                        i16 = i2111113;
                        f14 = f211111113;
                        j17 = jA;
                        z11 = true;
                    }
                    c0698o.q();
                    C0561g1 c0561g9 = p10.f8750a;
                    p074h0.d dVarD115 = p074h0.j.d(-459880832, new C(f3, i211119, dVar2), c0698o);
                    int i2111114 = i15;
                    fVar3 = fVar2;
                    float f211111115 = f12;
                    boolean z112 = z11;
                    p180s0.J j211113 = j17;
                    long j211114 = jD;
                    long j211115 = j16;
                    float f211111116 = f14;
                    float f211111117 = f13;
                    p074h0.d dVarD116 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                    p074h0.d dVarD117 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                    if (((i2111114 & 896) ^ 384) <= 256) {
                    }
                    objH = c0698o.H();
                    if (z12) {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    } else {
                        objH = new C0041r0(27, p10);
                        c0698o.e0(objH);
                    }
                    l0.r rVar12 = rVar2;
                    long j211116 = j15;
                    long j211117 = jB;
                    c(rVar12, dVarD115, dVarD116, dVarD117, (p241y9.a) objH, c0561g9, j211116, j211117, c0698o, 28086 | ((i16 << 9) & 29360128));
                    rVar3 = rVar12;
                    j18 = j211116;
                    j19 = j211117;
                    f15 = f211111115;
                    j20 = j211113;
                    j21 = j211114;
                    j22 = j211115;
                    f16 = f211111116;
                    f17 = f211111117;
                    z13 = z112;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
                }
            }
            j14 = j12;
            i13 = i22 | 1641910;
            if ((306783379 & i12) != 306783378) {
                c0698o.P();
                int i2111115 = 0;
                if ((i10 & 1) != 0) {
                    float f111112 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f111113 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f211111118 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB19 = AbstractC0568i0.b(jD, c0698o);
                    int i2111116 = i12 & (-29360129);
                    float f211111119 = 0;
                    float f2111111110 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i2111117 = i14 & (-458753);
                    i15 = i2111116;
                    f12 = f111112;
                    j15 = j14;
                    j16 = jB19;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111111110;
                    i16 = i2111117;
                    f14 = f211111119;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f111114 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f111115 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f2111111111 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB110 = AbstractC0568i0.b(jD, c0698o);
                    int i2111118 = i12 & (-29360129);
                    float f2111111112 = 0;
                    float f2111111113 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i2111119 = i14 & (-458753);
                    i15 = i2111118;
                    f12 = f111114;
                    j15 = j14;
                    j16 = jB110;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111111113;
                    i16 = i2111119;
                    f14 = f2111111112;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g10 = p10.f8750a;
                p074h0.d dVarD118 = p074h0.j.d(-459880832, new C(f3, i2111115, dVar2), c0698o);
                int i21111110 = i15;
                fVar3 = fVar2;
                float f2111111114 = f12;
                boolean z113 = z11;
                p180s0.J j211118 = j17;
                long j211119 = jD;
                long j2111110 = j16;
                float f2111111115 = f14;
                float f2111111116 = f13;
                p074h0.d dVarD119 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD1110 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i21111110 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar13 = rVar2;
                long j2111111 = j15;
                long j2111112 = jB;
                c(rVar13, dVarD118, dVarD119, dVarD1110, (p241y9.a) objH, c0561g10, j2111111, j2111112, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar13;
                j18 = j2111111;
                j19 = j2111112;
                f15 = f2111111114;
                j20 = j211118;
                j21 = j211119;
                j22 = j2111110;
                f16 = f2111111115;
                f17 = f2111111116;
                z13 = z113;
            } else {
                c0698o.P();
                int i21111111 = 0;
                if ((i10 & 1) != 0) {
                    float f111116 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f111117 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f2111111117 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB111 = AbstractC0568i0.b(jD, c0698o);
                    int i21111112 = i12 & (-29360129);
                    float f2111111118 = 0;
                    float f2111111119 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21111113 = i14 & (-458753);
                    i15 = i21111112;
                    f12 = f111116;
                    j15 = j14;
                    j16 = jB111;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111111119;
                    i16 = i21111113;
                    f14 = f2111111118;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f111118 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f111119 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f21111111110 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB112 = AbstractC0568i0.b(jD, c0698o);
                    int i21111114 = i12 & (-29360129);
                    float f21111111111 = 0;
                    float f21111111112 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21111115 = i14 & (-458753);
                    i15 = i21111114;
                    f12 = f111118;
                    j15 = j14;
                    j16 = jB112;
                    rVar2 = l0.o.f19333a;
                    f13 = f21111111112;
                    i16 = i21111115;
                    f14 = f21111111111;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g11 = p10.f8750a;
                p074h0.d dVarD1111 = p074h0.j.d(-459880832, new C(f3, i21111111, dVar2), c0698o);
                int i21111116 = i15;
                fVar3 = fVar2;
                float f21111111113 = f12;
                boolean z114 = z11;
                p180s0.J j2111113 = j17;
                long j2111114 = jD;
                long j2111115 = j16;
                float f21111111114 = f14;
                float f21111111115 = f13;
                p074h0.d dVarD1112 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD1113 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i21111116 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar14 = rVar2;
                long j2111116 = j15;
                long j2111117 = jB;
                c(rVar14, dVarD1111, dVarD1112, dVarD1113, (p241y9.a) objH, c0561g11, j2111116, j2111117, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar14;
                j18 = j2111116;
                j19 = j2111117;
                f15 = f21111111113;
                j20 = j2111113;
                j21 = j2111114;
                j22 = j2111115;
                f16 = f21111111114;
                f17 = f21111111115;
                z13 = z114;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
            }
        }
        jD = j10;
        i12 = i220 | i21 | 910163968;
        if ((i11 & 16384) == 0) {
            j14 = j12;
            if (c0698o.f(j14)) {
            }
            i13 = i22 | 1641910;
            if ((306783379 & i12) != 306783378) {
                c0698o.P();
                int i21111117 = 0;
                if ((i10 & 1) != 0) {
                    float f1111110 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1111111 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f21111111116 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB113 = AbstractC0568i0.b(jD, c0698o);
                    int i21111118 = i12 & (-29360129);
                    float f21111111117 = 0;
                    float f21111111118 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i21111119 = i14 & (-458753);
                    i15 = i21111118;
                    f12 = f1111110;
                    j15 = j14;
                    j16 = jB113;
                    rVar2 = l0.o.f19333a;
                    f13 = f21111111118;
                    i16 = i21111119;
                    f14 = f21111111117;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f1111112 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1111113 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f21111111119 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB114 = AbstractC0568i0.b(jD, c0698o);
                    int i211111110 = i12 & (-29360129);
                    float f211111111110 = 0;
                    float f211111111111 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i211111111 = i14 & (-458753);
                    i15 = i211111110;
                    f12 = f1111112;
                    j15 = j14;
                    j16 = jB114;
                    rVar2 = l0.o.f19333a;
                    f13 = f211111111111;
                    i16 = i211111111;
                    f14 = f211111111110;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g12 = p10.f8750a;
                p074h0.d dVarD1114 = p074h0.j.d(-459880832, new C(f3, i21111117, dVar2), c0698o);
                int i211111112 = i15;
                fVar3 = fVar2;
                float f211111111112 = f12;
                boolean z115 = z11;
                p180s0.J j2111118 = j17;
                long j2111119 = jD;
                long j21111110 = j16;
                float f211111111113 = f14;
                float f211111111114 = f13;
                p074h0.d dVarD1115 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD1116 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i211111112 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar15 = rVar2;
                long j21111111 = j15;
                long j21111112 = jB;
                c(rVar15, dVarD1114, dVarD1115, dVarD1116, (p241y9.a) objH, c0561g12, j21111111, j21111112, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar15;
                j18 = j21111111;
                j19 = j21111112;
                f15 = f211111111112;
                j20 = j2111118;
                j21 = j2111119;
                j22 = j21111110;
                f16 = f211111111113;
                f17 = f211111111114;
                z13 = z115;
            } else {
                c0698o.P();
                int i211111113 = 0;
                if ((i10 & 1) != 0) {
                    float f1111114 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1111115 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f211111111115 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB115 = AbstractC0568i0.b(jD, c0698o);
                    int i211111114 = i12 & (-29360129);
                    float f211111111116 = 0;
                    float f211111111117 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i211111115 = i14 & (-458753);
                    i15 = i211111114;
                    f12 = f1111114;
                    j15 = j14;
                    j16 = jB115;
                    rVar2 = l0.o.f19333a;
                    f13 = f211111111117;
                    i16 = i211111115;
                    f14 = f211111111116;
                    j17 = jA;
                    z11 = true;
                } else {
                    float f1111116 = B.f8463c;
                    if ((i11 & 32) != 0) {
                        float f1111117 = Y.n.f10216a;
                        jA = AbstractC0537a1.a(2, c0698o);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        float f211111111118 = Y.n.f10216a;
                        jD = AbstractC0568i0.d(40, c0698o);
                        i12 &= -3670017;
                    }
                    long jB116 = AbstractC0568i0.b(jD, c0698o);
                    int i211111116 = i12 & (-29360129);
                    float f211111111119 = 0;
                    float f2111111111110 = B.f8462b;
                    fVar2 = AbstractC0583n0.f9282a;
                    if ((i11 & 16384) != 0) {
                        j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                        i14 = 1641910;
                    } else {
                        i14 = i13;
                    }
                    jB = AbstractC0568i0.b(j14, c0698o);
                    int i211111117 = i14 & (-458753);
                    i15 = i211111116;
                    f12 = f1111116;
                    j15 = j14;
                    j16 = jB116;
                    rVar2 = l0.o.f19333a;
                    f13 = f2111111111110;
                    i16 = i211111117;
                    f14 = f211111111119;
                    j17 = jA;
                    z11 = true;
                }
                c0698o.q();
                C0561g1 c0561g13 = p10.f8750a;
                p074h0.d dVarD1117 = p074h0.j.d(-459880832, new C(f3, i211111113, dVar2), c0698o);
                int i211111118 = i15;
                fVar3 = fVar2;
                float f2111111111111 = f12;
                boolean z116 = z11;
                p180s0.J j21111113 = j17;
                long j21111114 = jD;
                long j21111115 = j16;
                float f2111111111112 = f14;
                float f2111111111113 = f13;
                p074h0.d dVarD1118 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
                p074h0.d dVarD1119 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
                if (((i211111118 & 896) ^ 384) <= 256) {
                }
                objH = c0698o.H();
                if (z12) {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                } else {
                    objH = new C0041r0(27, p10);
                    c0698o.e0(objH);
                }
                l0.r rVar16 = rVar2;
                long j21111116 = j15;
                long j21111117 = jB;
                c(rVar16, dVarD1117, dVarD1118, dVarD1119, (p241y9.a) objH, c0561g13, j21111116, j21111117, c0698o, 28086 | ((i16 << 9) & 29360128));
                rVar3 = rVar16;
                j18 = j21111116;
                j19 = j21111117;
                f15 = f2111111111111;
                j20 = j21111113;
                j21 = j21111114;
                j22 = j21111115;
                f16 = f2111111111112;
                f17 = f2111111111113;
                z13 = z116;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
            }
        }
        j14 = j12;
        i13 = i22 | 1641910;
        if ((306783379 & i12) != 306783378) {
            c0698o.P();
            int i211111119 = 0;
            if ((i10 & 1) != 0) {
                float f1111118 = B.f8463c;
                if ((i11 & 32) != 0) {
                    float f1111119 = Y.n.f10216a;
                    jA = AbstractC0537a1.a(2, c0698o);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    float f2111111111114 = Y.n.f10216a;
                    jD = AbstractC0568i0.d(40, c0698o);
                    i12 &= -3670017;
                }
                long jB117 = AbstractC0568i0.b(jD, c0698o);
                int i2111111110 = i12 & (-29360129);
                float f2111111111115 = 0;
                float f2111111111116 = B.f8462b;
                fVar2 = AbstractC0583n0.f9282a;
                if ((i11 & 16384) != 0) {
                    j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                    i14 = 1641910;
                } else {
                    i14 = i13;
                }
                jB = AbstractC0568i0.b(j14, c0698o);
                int i2111111111 = i14 & (-458753);
                i15 = i2111111110;
                f12 = f1111118;
                j15 = j14;
                j16 = jB117;
                rVar2 = l0.o.f19333a;
                f13 = f2111111111116;
                i16 = i2111111111;
                f14 = f2111111111115;
                j17 = jA;
                z11 = true;
            } else {
                float f11111110 = B.f8463c;
                if ((i11 & 32) != 0) {
                    float f11111111 = Y.n.f10216a;
                    jA = AbstractC0537a1.a(2, c0698o);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    float f2111111111117 = Y.n.f10216a;
                    jD = AbstractC0568i0.d(40, c0698o);
                    i12 &= -3670017;
                }
                long jB118 = AbstractC0568i0.b(jD, c0698o);
                int i2111111112 = i12 & (-29360129);
                float f2111111111118 = 0;
                float f2111111111119 = B.f8462b;
                fVar2 = AbstractC0583n0.f9282a;
                if ((i11 & 16384) != 0) {
                    j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                    i14 = 1641910;
                } else {
                    i14 = i13;
                }
                jB = AbstractC0568i0.b(j14, c0698o);
                int i2111111113 = i14 & (-458753);
                i15 = i2111111112;
                f12 = f11111110;
                j15 = j14;
                j16 = jB118;
                rVar2 = l0.o.f19333a;
                f13 = f2111111111119;
                i16 = i2111111113;
                f14 = f2111111111118;
                j17 = jA;
                z11 = true;
            }
            c0698o.q();
            C0561g1 c0561g14 = p10.f8750a;
            p074h0.d dVarD11110 = p074h0.j.d(-459880832, new C(f3, i211111119, dVar2), c0698o);
            int i2111111114 = i15;
            fVar3 = fVar2;
            float f21111111111110 = f12;
            boolean z117 = z11;
            p180s0.J j21111118 = j17;
            long j21111119 = jD;
            long j211111110 = j16;
            float f21111111111111 = f14;
            float f21111111111112 = f13;
            p074h0.d dVarD11111 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
            p074h0.d dVarD11112 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
            if (((i2111111114 & 896) ^ 384) <= 256) {
            }
            objH = c0698o.H();
            if (z12) {
                objH = new C0041r0(27, p10);
                c0698o.e0(objH);
            } else {
                objH = new C0041r0(27, p10);
                c0698o.e0(objH);
            }
            l0.r rVar17 = rVar2;
            long j211111111 = j15;
            long j211111112 = jB;
            c(rVar17, dVarD11110, dVarD11111, dVarD11112, (p241y9.a) objH, c0561g14, j211111111, j211111112, c0698o, 28086 | ((i16 << 9) & 29360128));
            rVar3 = rVar17;
            j18 = j211111111;
            j19 = j211111112;
            f15 = f21111111111110;
            j20 = j21111118;
            j21 = j21111119;
            j22 = j211111110;
            f16 = f21111111111111;
            f17 = f21111111111112;
            z13 = z117;
        } else {
            c0698o.P();
            int i2111111115 = 0;
            if ((i10 & 1) != 0) {
                float f11111112 = B.f8463c;
                if ((i11 & 32) != 0) {
                    float f11111113 = Y.n.f10216a;
                    jA = AbstractC0537a1.a(2, c0698o);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    float f21111111111113 = Y.n.f10216a;
                    jD = AbstractC0568i0.d(40, c0698o);
                    i12 &= -3670017;
                }
                long jB119 = AbstractC0568i0.b(jD, c0698o);
                int i2111111116 = i12 & (-29360129);
                float f21111111111114 = 0;
                float f21111111111115 = B.f8462b;
                fVar2 = AbstractC0583n0.f9282a;
                if ((i11 & 16384) != 0) {
                    j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                    i14 = 1641910;
                } else {
                    i14 = i13;
                }
                jB = AbstractC0568i0.b(j14, c0698o);
                int i2111111117 = i14 & (-458753);
                i15 = i2111111116;
                f12 = f11111112;
                j15 = j14;
                j16 = jB119;
                rVar2 = l0.o.f19333a;
                f13 = f21111111111115;
                i16 = i2111111117;
                f14 = f21111111111114;
                j17 = jA;
                z11 = true;
            } else {
                float f11111114 = B.f8463c;
                if ((i11 & 32) != 0) {
                    float f11111115 = Y.n.f10216a;
                    jA = AbstractC0537a1.a(2, c0698o);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    float f21111111111116 = Y.n.f10216a;
                    jD = AbstractC0568i0.d(40, c0698o);
                    i12 &= -3670017;
                }
                long jB1110 = AbstractC0568i0.b(jD, c0698o);
                int i2111111118 = i12 & (-29360129);
                float f21111111111117 = 0;
                float f21111111111118 = B.f8462b;
                fVar2 = AbstractC0583n0.f9282a;
                if ((i11 & 16384) != 0) {
                    j14 = ((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).f9125p;
                    i14 = 1641910;
                } else {
                    i14 = i13;
                }
                jB = AbstractC0568i0.b(j14, c0698o);
                int i2111111119 = i14 & (-458753);
                i15 = i2111111118;
                f12 = f11111114;
                j15 = j14;
                j16 = jB1110;
                rVar2 = l0.o.f19333a;
                f13 = f21111111111118;
                i16 = i2111111119;
                f14 = f21111111111117;
                j17 = jA;
                z11 = true;
            }
            c0698o.q();
            C0561g1 c0561g15 = p10.f8750a;
            p074h0.d dVarD11113 = p074h0.j.d(-459880832, new C(f3, i2111111115, dVar2), c0698o);
            int i21111111110 = i15;
            fVar3 = fVar2;
            float f21111111111119 = f12;
            boolean z118 = z11;
            p180s0.J j211111113 = j17;
            long j211111114 = jD;
            long j211111115 = j16;
            float f211111111111110 = f14;
            float f211111111111111 = f13;
            p074h0.d dVarD11114 = p074h0.j.d(1961872927, new D(p10, f3, f12, z11, j17, jD, j16, f14, f13, eVar, dVar), c0698o);
            p074h0.d dVarD11115 = p074h0.j.d(88659390, new A.K(8, fVar3, p10), c0698o);
            if (((i21111111110 & 896) ^ 384) <= 256) {
            }
            objH = c0698o.H();
            if (z12) {
                objH = new C0041r0(27, p10);
                c0698o.e0(objH);
            } else {
                objH = new C0041r0(27, p10);
                c0698o.e0(objH);
            }
            l0.r rVar18 = rVar2;
            long j211111116 = j15;
            long j211111117 = jB;
            c(rVar18, dVarD11113, dVarD11114, dVarD11115, (p241y9.a) objH, c0561g15, j211111116, j211111117, c0698o, 28086 | ((i16 << 9) & 29360128));
            rVar3 = rVar18;
            j18 = j211111116;
            j19 = j211111117;
            f15 = f21111111111119;
            j20 = j211111113;
            j21 = j211111114;
            j22 = j211111115;
            f16 = f211111111111110;
            f17 = f211111111111111;
            z13 = z118;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new E(dVar, rVar3, p10, f3, f15, j20, j21, j22, f16, f17, eVar, z13, fVar3, j18, j19, dVar2, i10, i11);
        }
    }

    public static final void c(l0.r rVar, p074h0.d dVar, p074h0.d dVar2, p074h0.d dVar3, p241y9.a aVar, C0561g1 c0561g1, long j, long j10, C0698o c0698o, int i10) {
        int i11;
        p074h0.d dVar4;
        char c10;
        c0698o.V(-1651214892);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            dVar4 = dVar;
            i11 |= c0698o.i(dVar4) ? 256 : 128;
        } else {
            dVar4 = dVar;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.i(dVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(dVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.g(c0561g1) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0698o.f(j) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            c10 = 2;
            i11 |= c0698o.f(j10) ? 67108864 : 33554432;
        } else {
            c10 = 2;
        }
        char c11 = c10;
        if ((i11 & 38347923) == 38347922 && c0698o.x()) {
            c0698o.N();
        } else {
            p074h0.d dVarD = p074h0.j.d(398963586, new F(rVar, j, j10, dVar4), c0698o);
            p241y9.e[] eVarArr = new p241y9.e[4];
            eVarArr[0] = AbstractC0583n0.f9283b;
            eVarArr[1] = dVarD;
            eVarArr[c11] = dVar2;
            eVarArr[3] = dVar3;
            List listS = p120l9.l.S(eVarArr);
            boolean z10 = ((i11 & 458752) == 131072) | ((3670016 & i11) == 1048576);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (z10 || objH == obj) {
                objH = new H(c0561g1, aVar);
                c0698o.e0(objH);
            }
            H h7 = (H) objH;
            p074h0.d dVar5 = new p074h0.d(-1953651383, new A.R0(5, listS), true);
            boolean zG = c0698o.g(h7);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj) {
                objH2 = new H0.N(h7);
                c0698o.e0(objH2);
            }
            H0.I i12 = (H0.I) objH2;
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, l0.o.f19333a);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar2 = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar2);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, i12, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar5.invoke(c0698o, 0);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I(rVar, dVar, dVar2, dVar3, aVar, c0561g1, j, j10, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0197  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01da  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:151:0x0209  */
    /* JADX WARN: Code duplicated, block: B:152:0x020c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:155:0x0213  */
    /* JADX WARN: Code duplicated, block: B:157:0x0217  */
    /* JADX WARN: Code duplicated, block: B:158:0x021a  */
    /* JADX WARN: Code duplicated, block: B:160:0x021e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0221  */
    /* JADX WARN: Code duplicated, block: B:164:0x0229  */
    /* JADX WARN: Code duplicated, block: B:165:0x023e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0257  */
    /* JADX WARN: Code duplicated, block: B:170:0x025d  */
    /* JADX WARN: Code duplicated, block: B:176:0x026e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0274  */
    /* JADX WARN: Code duplicated, block: B:184:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0290  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:197:0x032d  */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    public static final void d(p241y9.a aVar, l0.r rVar, boolean z10, p180s0.J j, Q q10, W w9, C1460n c1460n, D.P p10, p241y9.f fVar, C0698o c0698o, int i10, int i11) {
        int i12;
        boolean z11;
        p180s0.J jA;
        W w10;
        int i13;
        int i14;
        int i15;
        D.P p11;
        int i16;
        int i17;
        W w11;
        C1460n c1460n2;
        C1460n c1460n3;
        p180s0.J j10;
        W w12;
        Object objH;
        Object obj;
        B.j jVar;
        long j11;
        long j12;
        Object objH2;
        p093j0.r rVar2;
        boolean zG;
        Object objH3;
        Object obj2;
        float f3;
        Object objH4;
        C1411c c1411c;
        boolean zI;
        Object objH5;
        W w13;
        boolean z12;
        C1422k c1422k;
        float f7;
        D.P p12;
        p180s0.J j13;
        C1460n c1460n4;
        boolean z13;
        W w14;
        C0699o0 c0699o0R;
        int i18;
        int i19;
        c0698o.V(650121315);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                i12 |= c0698o.h(z11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jA = j;
                    int i21 = c0698o.g(jA) ? 2048 : 1024;
                    i12 |= i21;
                } else {
                    jA = j;
                }
                i12 |= i21;
            } else {
                jA = j;
            }
            if ((i10 & 24576) == 0) {
                if (c0698o.g(q10)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i12 |= i19;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    w10 = w9;
                    int i22 = c0698o.g(w10) ? 131072 : 65536;
                    i12 |= i22;
                } else {
                    w10 = w9;
                }
                i12 |= i22;
            } else {
                w10 = w9;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0698o.g(c1460n)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
                p11 = p10;
            } else {
                p11 = p10;
                if ((i10 & 12582912) == 0) {
                    if (c0698o.g(p11)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0698o.g(null)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i12 |= i17;
            }
            if ((i10 & 805306368) == 0) {
                if (c0698o.i(fVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i12 |= i18;
            }
            if ((i12 & 306783379) == 306783378 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i20 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        D.P p13 = S.f8804a;
                        i12 &= -7169;
                        jA = AbstractC0537a1.a(Y.e.f10150b, c0698o);
                    }
                    if ((i11 & 32) != 0) {
                        D.P p14 = S.f8804a;
                        w11 = new W(Y.e.f10149a, Y.e.f10156i, Y.e.f10154f, Y.e.g, Y.e.f10152d);
                        i12 &= -458753;
                    } else {
                        w11 = w10;
                    }
                    if (i13 != 0) {
                        c1460n2 = null;
                    } else {
                        c1460n2 = c1460n;
                    }
                    if (i15 != 0) {
                        p11 = S.f8804a;
                    }
                    c1460n3 = c1460n2;
                    j10 = jA;
                    w12 = w11;
                } else {
                    c0698o.N();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    c1460n3 = c1460n;
                    w12 = w10;
                    j10 = jA;
                }
                c0698o.q();
                c0698o.T(-239156623);
                objH = c0698o.H();
                obj = C0690k.f10683a;
                if (objH == obj) {
                    objH = new B.j();
                    c0698o.e0(objH);
                }
                jVar = (B.j) objH;
                c0698o.p(false);
                D.P p15 = p11;
                if (z11) {
                    j11 = q10.f8764a;
                } else {
                    j11 = q10.f8766c;
                }
                p180s0.J j14 = j10;
                if (z11) {
                    j12 = q10.f8765b;
                } else {
                    j12 = q10.f8767d;
                }
                c0698o.T(-239150048);
                if (w12 == null) {
                    w13 = w12;
                    jVar = jVar;
                    z12 = z11;
                    c1422k = null;
                } else {
                    int i23 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objH2 = c0698o.H();
                    if (objH2 == obj) {
                        objH2 = new p093j0.r();
                        c0698o.e0(objH2);
                    }
                    rVar2 = (p093j0.r) objH2;
                    zG = c0698o.g(jVar);
                    objH3 = c0698o.H();
                    if (zG || objH3 == obj) {
                        objH3 = new U(jVar, rVar2, null, 0);
                        c0698o.e0(objH3);
                    }
                    C0672b.f(c0698o, jVar, (p241y9.e) objH3);
                    obj2 = (B.i) p120l9.m.n0(rVar2);
                    if (!z11) {
                        f3 = w12.f8889e;
                    } else if (obj2 instanceof B.l) {
                        f3 = w12.f8886b;
                    } else if (obj2 instanceof B.g) {
                        f3 = w12.f8888d;
                    } else if (obj2 instanceof B.d) {
                        f3 = w12.f8887c;
                    } else {
                        f3 = w12.f8885a;
                    }
                    objH4 = c0698o.H();
                    if (objH4 == obj) {
                        objH4 = new C1411c(new p063g1.f(f3), p223x.w0.f24115c, null, 12);
                        c0698o.e0(objH4);
                    }
                    c1411c = (C1411c) objH4;
                    p063g1.f fVar2 = new p063g1.f(f3);
                    zI = ((((i23 & 896) ^ 384) <= 256 && c0698o.g(w12)) || (i23 & 384) == 256) | c0698o.i(c1411c) | c0698o.d(f3) | ((((i23 & 14) ^ 6) <= 4 && c0698o.h(z11)) || (i23 & 6) == 4) | c0698o.i(obj2);
                    objH5 = c0698o.H();
                    if (!zI || objH5 == obj) {
                        w13 = w12;
                        boolean z14 = z11;
                        objH5 = new V(c1411c, f3, z14, w13, obj2, null, 0);
                        z12 = z14;
                        c0698o.e0(objH5);
                    } else {
                        w13 = w12;
                        z12 = z11;
                    }
                    C0672b.f(c0698o, fVar2, (p241y9.e) objH5);
                    c1422k = c1411c.f23943c;
                }
                c0698o.p(false);
                if (c1422k != null) {
                    f7 = ((p063g1.f) c1422k.f24028s.getValue()).f16252r;
                } else {
                    f7 = 0;
                }
                float f10 = f7;
                l0.r rVarA = R0.m.a(rVar, false, O.f8733t);
                p074h0.d dVarD = p074h0.j.d(956488494, new C0307b(j12, p15, fVar), c0698o);
                AbstractC0693l0 abstractC0693l0 = C1.f8484a;
                float f11 = ((p063g1.f) c0698o.k(abstractC0693l0)).f16252r + 0;
                C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(j12)), abstractC0693l0.a(new p063g1.f(f11))}, p074h0.j.d(1279702876, new A1(rVarA, j14, j11, f11, c1460n3, jVar, z12, aVar, f10, dVarD), c0698o), c0698o, 56);
                p12 = p15;
                j13 = j14;
                c1460n4 = c1460n3;
                z13 = z12;
                w14 = w13;
            } else {
                c0698o.N();
                c1460n4 = c1460n;
                p12 = p11;
                z13 = z11;
                j13 = jA;
                w14 = w10;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0152a(aVar, rVar, z13, j13, q10, w14, c1460n4, p12, fVar, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jA = j;
                if (c0698o.g(jA)) {
                }
                i12 |= i21;
            } else {
                jA = j;
            }
            i12 |= i21;
        } else {
            jA = j;
        }
        if ((i10 & 24576) == 0) {
            if (c0698o.g(q10)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                w10 = w9;
                if (c0698o.g(w10)) {
                }
                i12 |= i22;
            } else {
                w10 = w9;
            }
            i12 |= i22;
        } else {
            w10 = w9;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0698o.g(c1460n)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
            p11 = p10;
        } else {
            p11 = p10;
            if ((i10 & 12582912) == 0) {
                if (c0698o.g(p11)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0698o.g(null)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i12 |= i17;
        }
        if ((i10 & 805306368) == 0) {
            if (c0698o.i(fVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i12 |= i18;
        }
        if ((i12 & 306783379) == 306783378) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    D.P p16 = S.f8804a;
                    i12 &= -7169;
                    jA = AbstractC0537a1.a(Y.e.f10150b, c0698o);
                }
                if ((i11 & 32) != 0) {
                    D.P p17 = S.f8804a;
                    w11 = new W(Y.e.f10149a, Y.e.f10156i, Y.e.f10154f, Y.e.g, Y.e.f10152d);
                    i12 &= -458753;
                } else {
                    w11 = w10;
                }
                if (i13 != 0) {
                    c1460n2 = null;
                } else {
                    c1460n2 = c1460n;
                }
                if (i15 != 0) {
                    p11 = S.f8804a;
                }
                c1460n3 = c1460n2;
                j10 = jA;
                w12 = w11;
            } else {
                if (i20 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    D.P p18 = S.f8804a;
                    i12 &= -7169;
                    jA = AbstractC0537a1.a(Y.e.f10150b, c0698o);
                }
                if ((i11 & 32) != 0) {
                    D.P p19 = S.f8804a;
                    w11 = new W(Y.e.f10149a, Y.e.f10156i, Y.e.f10154f, Y.e.g, Y.e.f10152d);
                    i12 &= -458753;
                } else {
                    w11 = w10;
                }
                if (i13 != 0) {
                    c1460n2 = null;
                } else {
                    c1460n2 = c1460n;
                }
                if (i15 != 0) {
                    p11 = S.f8804a;
                }
                c1460n3 = c1460n2;
                j10 = jA;
                w12 = w11;
            }
            c0698o.q();
            c0698o.T(-239156623);
            objH = c0698o.H();
            obj = C0690k.f10683a;
            if (objH == obj) {
                objH = new B.j();
                c0698o.e0(objH);
            }
            jVar = (B.j) objH;
            c0698o.p(false);
            D.P p110 = p11;
            if (z11) {
                j11 = q10.f8764a;
            } else {
                j11 = q10.f8766c;
            }
            p180s0.J j15 = j10;
            if (z11) {
                j12 = q10.f8765b;
            } else {
                j12 = q10.f8767d;
            }
            c0698o.T(-239150048);
            if (w12 == null) {
                w13 = w12;
                jVar = jVar;
                z12 = z11;
                c1422k = null;
            } else {
                int i24 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                objH2 = c0698o.H();
                if (objH2 == obj) {
                    objH2 = new p093j0.r();
                    c0698o.e0(objH2);
                }
                rVar2 = (p093j0.r) objH2;
                zG = c0698o.g(jVar);
                objH3 = c0698o.H();
                if (zG) {
                    objH3 = new U(jVar, rVar2, null, 0);
                    c0698o.e0(objH3);
                } else {
                    objH3 = new U(jVar, rVar2, null, 0);
                    c0698o.e0(objH3);
                }
                C0672b.f(c0698o, jVar, (p241y9.e) objH3);
                obj2 = (B.i) p120l9.m.n0(rVar2);
                if (!z11) {
                    f3 = w12.f8889e;
                } else if (obj2 instanceof B.l) {
                    f3 = w12.f8886b;
                } else if (obj2 instanceof B.g) {
                    f3 = w12.f8888d;
                } else if (obj2 instanceof B.d) {
                    f3 = w12.f8887c;
                } else {
                    f3 = w12.f8885a;
                }
                objH4 = c0698o.H();
                if (objH4 == obj) {
                    objH4 = new C1411c(new p063g1.f(f3), p223x.w0.f24115c, null, 12);
                    c0698o.e0(objH4);
                }
                c1411c = (C1411c) objH4;
                p063g1.f fVar3 = new p063g1.f(f3);
                zI = ((((i24 & 896) ^ 384) <= 256 && c0698o.g(w12)) || (i24 & 384) == 256) | c0698o.i(c1411c) | c0698o.d(f3) | ((((i24 & 14) ^ 6) <= 4 && c0698o.h(z11)) || (i24 & 6) == 4) | c0698o.i(obj2);
                objH5 = c0698o.H();
                if (zI) {
                    w13 = w12;
                    boolean z15 = z11;
                    objH5 = new V(c1411c, f3, z15, w13, obj2, null, 0);
                    z12 = z15;
                    c0698o.e0(objH5);
                } else {
                    w13 = w12;
                    boolean z16 = z11;
                    objH5 = new V(c1411c, f3, z16, w13, obj2, null, 0);
                    z12 = z16;
                    c0698o.e0(objH5);
                }
                C0672b.f(c0698o, fVar3, (p241y9.e) objH5);
                c1422k = c1411c.f23943c;
            }
            c0698o.p(false);
            if (c1422k != null) {
                f7 = ((p063g1.f) c1422k.f24028s.getValue()).f16252r;
            } else {
                f7 = 0;
            }
            float f12 = f7;
            l0.r rVarA2 = R0.m.a(rVar, false, O.f8733t);
            p074h0.d dVarD2 = p074h0.j.d(956488494, new C0307b(j12, p110, fVar), c0698o);
            AbstractC0693l0 abstractC0693l1 = C1.f8484a;
            float f13 = ((p063g1.f) c0698o.k(abstractC0693l1)).f16252r + 0;
            C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(j12)), abstractC0693l1.a(new p063g1.f(f13))}, p074h0.j.d(1279702876, new A1(rVarA2, j15, j11, f13, c1460n3, jVar, z12, aVar, f12, dVarD2), c0698o), c0698o, 56);
            p12 = p110;
            j13 = j15;
            c1460n4 = c1460n3;
            z13 = z12;
            w14 = w13;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    D.P p111 = S.f8804a;
                    i12 &= -7169;
                    jA = AbstractC0537a1.a(Y.e.f10150b, c0698o);
                }
                if ((i11 & 32) != 0) {
                    D.P p112 = S.f8804a;
                    w11 = new W(Y.e.f10149a, Y.e.f10156i, Y.e.f10154f, Y.e.g, Y.e.f10152d);
                    i12 &= -458753;
                } else {
                    w11 = w10;
                }
                if (i13 != 0) {
                    c1460n2 = null;
                } else {
                    c1460n2 = c1460n;
                }
                if (i15 != 0) {
                    p11 = S.f8804a;
                }
                c1460n3 = c1460n2;
                j10 = jA;
                w12 = w11;
            } else {
                if (i20 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    D.P p113 = S.f8804a;
                    i12 &= -7169;
                    jA = AbstractC0537a1.a(Y.e.f10150b, c0698o);
                }
                if ((i11 & 32) != 0) {
                    D.P p114 = S.f8804a;
                    w11 = new W(Y.e.f10149a, Y.e.f10156i, Y.e.f10154f, Y.e.g, Y.e.f10152d);
                    i12 &= -458753;
                } else {
                    w11 = w10;
                }
                if (i13 != 0) {
                    c1460n2 = null;
                } else {
                    c1460n2 = c1460n;
                }
                if (i15 != 0) {
                    p11 = S.f8804a;
                }
                c1460n3 = c1460n2;
                j10 = jA;
                w12 = w11;
            }
            c0698o.q();
            c0698o.T(-239156623);
            objH = c0698o.H();
            obj = C0690k.f10683a;
            if (objH == obj) {
                objH = new B.j();
                c0698o.e0(objH);
            }
            jVar = (B.j) objH;
            c0698o.p(false);
            D.P p115 = p11;
            if (z11) {
                j11 = q10.f8764a;
            } else {
                j11 = q10.f8766c;
            }
            p180s0.J j16 = j10;
            if (z11) {
                j12 = q10.f8765b;
            } else {
                j12 = q10.f8767d;
            }
            c0698o.T(-239150048);
            if (w12 == null) {
                w13 = w12;
                jVar = jVar;
                z12 = z11;
                c1422k = null;
            } else {
                int i25 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                objH2 = c0698o.H();
                if (objH2 == obj) {
                    objH2 = new p093j0.r();
                    c0698o.e0(objH2);
                }
                rVar2 = (p093j0.r) objH2;
                zG = c0698o.g(jVar);
                objH3 = c0698o.H();
                if (zG) {
                    objH3 = new U(jVar, rVar2, null, 0);
                    c0698o.e0(objH3);
                } else {
                    objH3 = new U(jVar, rVar2, null, 0);
                    c0698o.e0(objH3);
                }
                C0672b.f(c0698o, jVar, (p241y9.e) objH3);
                obj2 = (B.i) p120l9.m.n0(rVar2);
                if (!z11) {
                    f3 = w12.f8889e;
                } else if (obj2 instanceof B.l) {
                    f3 = w12.f8886b;
                } else if (obj2 instanceof B.g) {
                    f3 = w12.f8888d;
                } else if (obj2 instanceof B.d) {
                    f3 = w12.f8887c;
                } else {
                    f3 = w12.f8885a;
                }
                objH4 = c0698o.H();
                if (objH4 == obj) {
                    objH4 = new C1411c(new p063g1.f(f3), p223x.w0.f24115c, null, 12);
                    c0698o.e0(objH4);
                }
                c1411c = (C1411c) objH4;
                p063g1.f fVar4 = new p063g1.f(f3);
                zI = ((((i25 & 896) ^ 384) <= 256 && c0698o.g(w12)) || (i25 & 384) == 256) | c0698o.i(c1411c) | c0698o.d(f3) | ((((i25 & 14) ^ 6) <= 4 && c0698o.h(z11)) || (i25 & 6) == 4) | c0698o.i(obj2);
                objH5 = c0698o.H();
                if (zI) {
                    w13 = w12;
                    boolean z17 = z11;
                    objH5 = new V(c1411c, f3, z17, w13, obj2, null, 0);
                    z12 = z17;
                    c0698o.e0(objH5);
                } else {
                    w13 = w12;
                    boolean z18 = z11;
                    objH5 = new V(c1411c, f3, z18, w13, obj2, null, 0);
                    z12 = z18;
                    c0698o.e0(objH5);
                }
                C0672b.f(c0698o, fVar4, (p241y9.e) objH5);
                c1422k = c1411c.f23943c;
            }
            c0698o.p(false);
            if (c1422k != null) {
                f7 = ((p063g1.f) c1422k.f24028s.getValue()).f16252r;
            } else {
                f7 = 0;
            }
            float f14 = f7;
            l0.r rVarA3 = R0.m.a(rVar, false, O.f8733t);
            p074h0.d dVarD3 = p074h0.j.d(956488494, new C0307b(j12, p115, fVar), c0698o);
            AbstractC0693l0 abstractC0693l2 = C1.f8484a;
            float f15 = ((p063g1.f) c0698o.k(abstractC0693l2)).f16252r + 0;
            C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(j12)), abstractC0693l2.a(new p063g1.f(f15))}, p074h0.j.d(1279702876, new A1(rVarA3, j16, j11, f15, c1460n3, jVar, z12, aVar, f14, dVarD3), c0698o), c0698o, 56);
            p12 = p115;
            j13 = j16;
            c1460n4 = c1460n3;
            z13 = z12;
            w14 = w13;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0152a(aVar, rVar, z13, j13, q10, w14, c1460n4, p12, fVar, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void e(l0.r rVar, p180s0.J j, Z z10, C0536a0 c0536a0, C1460n c1460n, p074h0.d dVar, C0698o c0698o, int i10, int i11) {
        l0.r rVar2;
        int i12;
        p180s0.J j10;
        int i13;
        C0536a0 c0536a1;
        int i14;
        int i15;
        C1460n c1460n2;
        int i16;
        int i17;
        l0.r rVar3;
        p180s0.J jA;
        C0536a0 c0536a0N;
        l0.r rVar4;
        C0536a0 c0536a2;
        p180s0.J j11;
        C1460n c1460n3;
        float f3;
        Object objH;
        p180s0.J j12;
        C1460n c1460n4;
        C0536a0 c0536a3;
        C0699o0 c0699o0R;
        c0698o.V(1179621553);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            rVar2 = rVar;
        } else if ((i10 & 6) == 0) {
            rVar2 = rVar;
            i12 = i10 | (c0698o.g(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            j10 = j;
            int i19 = c0698o.g(j10) ? 32 : 16;
            int i20 = i12 | i19;
            if (c0698o.g(z10)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            int i21 = i20 | i13;
            if ((i11 & 8) == 0) {
                c0536a1 = c0536a0;
                int i22 = c0698o.g(c0536a1) ? 2048 : 1024;
                i14 = i21 | i22;
                i15 = i11 & 16;
                if (i15 != 0) {
                    i17 = i14 | 24576;
                    c1460n2 = c1460n;
                } else {
                    c1460n2 = c1460n;
                    if (c0698o.g(c1460n2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i17 = i14 | i16;
                }
                if ((74899 & i17) == 74898 || !c0698o.x()) {
                    c0698o.P();
                    if ((i10 & 1) != 0 || c0698o.w()) {
                        if (i18 != 0) {
                            rVar3 = l0.o.f19333a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                            i17 &= -113;
                        } else {
                            jA = j10;
                        }
                        if ((i11 & 8) != 0) {
                            c0536a0N = n();
                            i17 &= -7169;
                        } else {
                            c0536a0N = c0536a1;
                        }
                        if (i15 != 0) {
                            C0536a0 c0536a4 = c0536a0N;
                            rVar4 = rVar3;
                            c0536a2 = c0536a4;
                            c1460n3 = null;
                            j11 = jA;
                        } else {
                            C0536a0 c0536a5 = c0536a0N;
                            rVar4 = rVar3;
                            c0536a2 = c0536a5;
                            j11 = jA;
                            c1460n3 = c1460n2;
                        }
                    } else {
                        c0698o.N();
                        if ((i11 & 2) != 0) {
                            i17 &= -113;
                        }
                        if ((i11 & 8) != 0) {
                            i17 &= -7169;
                        }
                        c0536a2 = c0536a1;
                        c1460n3 = c1460n2;
                        j11 = j10;
                        rVar4 = rVar2;
                    }
                    c0698o.q();
                    long j13 = z10.f8930a;
                    long j14 = z10.f8931b;
                    f3 = c0536a2.f8957a;
                    c0698o.T(-1763481333);
                    c0698o.T(-734838460);
                    objH = c0698o.H();
                    if (objH == C0690k.f10683a) {
                        objH = C0672b.r(new p063g1.f(f3));
                        c0698o.e0(objH);
                    }
                    c0698o.p(false);
                    c0698o.p(false);
                    C1.a(rVar4, j11, j13, j14, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
                    rVar2 = rVar4;
                    j12 = j11;
                    c1460n4 = c1460n3;
                    c0536a3 = c0536a2;
                } else {
                    c0698o.N();
                    j12 = j10;
                    c0536a3 = c0536a1;
                    c1460n4 = c1460n2;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new C0540b0(rVar2, j12, z10, c0536a3, c1460n4, dVar, i10, i11);
                }
            }
            c0536a1 = c0536a0;
            i14 = i21 | i22;
            i15 = i11 & 16;
            if (i15 != 0) {
                i17 = i14 | 24576;
                c1460n2 = c1460n;
            } else {
                c1460n2 = c1460n;
                if (c0698o.g(c1460n2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i17 = i14 | i16;
            }
            if ((74899 & i17) == 74898) {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a6 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a6;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a7 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a7;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a8 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a8;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a9 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a9;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                }
                c0698o.q();
                long j15 = z10.f8930a;
                long j16 = z10.f8931b;
                f3 = c0536a2.f8957a;
                c0698o.T(-1763481333);
                c0698o.T(-734838460);
                objH = c0698o.H();
                if (objH == C0690k.f10683a) {
                    objH = C0672b.r(new p063g1.f(f3));
                    c0698o.e0(objH);
                }
                c0698o.p(false);
                c0698o.p(false);
                C1.a(rVar4, j11, j15, j16, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
                rVar2 = rVar4;
                j12 = j11;
                c1460n4 = c1460n3;
                c0536a3 = c0536a2;
            } else {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a10 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a10;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a11 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a11;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a12 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a12;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a13 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a13;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                }
                c0698o.q();
                long j17 = z10.f8930a;
                long j18 = z10.f8931b;
                f3 = c0536a2.f8957a;
                c0698o.T(-1763481333);
                c0698o.T(-734838460);
                objH = c0698o.H();
                if (objH == C0690k.f10683a) {
                    objH = C0672b.r(new p063g1.f(f3));
                    c0698o.e0(objH);
                }
                c0698o.p(false);
                c0698o.p(false);
                C1.a(rVar4, j11, j17, j18, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
                rVar2 = rVar4;
                j12 = j11;
                c1460n4 = c1460n3;
                c0536a3 = c0536a2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0540b0(rVar2, j12, z10, c0536a3, c1460n4, dVar, i10, i11);
            }
        }
        j10 = j;
        int i23 = i12 | i19;
        if (c0698o.g(z10)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i24 = i23 | i13;
        if ((i11 & 8) == 0) {
            c0536a1 = c0536a0;
            if (c0698o.g(c0536a1)) {
            }
            i14 = i24 | i22;
            i15 = i11 & 16;
            if (i15 != 0) {
                i17 = i14 | 24576;
                c1460n2 = c1460n;
            } else {
                c1460n2 = c1460n;
                if (c0698o.g(c1460n2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i17 = i14 | i16;
            }
            if ((74899 & i17) == 74898) {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a14 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a14;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a15 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a15;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a16 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a16;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a17 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a17;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                }
                c0698o.q();
                long j19 = z10.f8930a;
                long j110 = z10.f8931b;
                f3 = c0536a2.f8957a;
                c0698o.T(-1763481333);
                c0698o.T(-734838460);
                objH = c0698o.H();
                if (objH == C0690k.f10683a) {
                    objH = C0672b.r(new p063g1.f(f3));
                    c0698o.e0(objH);
                }
                c0698o.p(false);
                c0698o.p(false);
                C1.a(rVar4, j11, j19, j110, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
                rVar2 = rVar4;
                j12 = j11;
                c1460n4 = c1460n3;
                c0536a3 = c0536a2;
            } else {
                c0698o.P();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a18 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a18;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a19 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a19;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                } else {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                        i17 &= -113;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 8) != 0) {
                        c0536a0N = n();
                        i17 &= -7169;
                    } else {
                        c0536a0N = c0536a1;
                    }
                    if (i15 != 0) {
                        C0536a0 c0536a110 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a110;
                        c1460n3 = null;
                        j11 = jA;
                    } else {
                        C0536a0 c0536a111 = c0536a0N;
                        rVar4 = rVar3;
                        c0536a2 = c0536a111;
                        j11 = jA;
                        c1460n3 = c1460n2;
                    }
                }
                c0698o.q();
                long j111 = z10.f8930a;
                long j112 = z10.f8931b;
                f3 = c0536a2.f8957a;
                c0698o.T(-1763481333);
                c0698o.T(-734838460);
                objH = c0698o.H();
                if (objH == C0690k.f10683a) {
                    objH = C0672b.r(new p063g1.f(f3));
                    c0698o.e0(objH);
                }
                c0698o.p(false);
                c0698o.p(false);
                C1.a(rVar4, j11, j111, j112, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
                rVar2 = rVar4;
                j12 = j11;
                c1460n4 = c1460n3;
                c0536a3 = c0536a2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0540b0(rVar2, j12, z10, c0536a3, c1460n4, dVar, i10, i11);
            }
        }
        c0536a1 = c0536a0;
        i14 = i24 | i22;
        i15 = i11 & 16;
        if (i15 != 0) {
            i17 = i14 | 24576;
            c1460n2 = c1460n;
        } else {
            c1460n2 = c1460n;
            if (c0698o.g(c1460n2)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i17 = i14 | i16;
        }
        if ((74899 & i17) == 74898) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                    i17 &= -113;
                } else {
                    jA = j10;
                }
                if ((i11 & 8) != 0) {
                    c0536a0N = n();
                    i17 &= -7169;
                } else {
                    c0536a0N = c0536a1;
                }
                if (i15 != 0) {
                    C0536a0 c0536a112 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a112;
                    c1460n3 = null;
                    j11 = jA;
                } else {
                    C0536a0 c0536a113 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a113;
                    j11 = jA;
                    c1460n3 = c1460n2;
                }
            } else {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                    i17 &= -113;
                } else {
                    jA = j10;
                }
                if ((i11 & 8) != 0) {
                    c0536a0N = n();
                    i17 &= -7169;
                } else {
                    c0536a0N = c0536a1;
                }
                if (i15 != 0) {
                    C0536a0 c0536a114 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a114;
                    c1460n3 = null;
                    j11 = jA;
                } else {
                    C0536a0 c0536a115 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a115;
                    j11 = jA;
                    c1460n3 = c1460n2;
                }
            }
            c0698o.q();
            long j113 = z10.f8930a;
            long j114 = z10.f8931b;
            f3 = c0536a2.f8957a;
            c0698o.T(-1763481333);
            c0698o.T(-734838460);
            objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = C0672b.r(new p063g1.f(f3));
                c0698o.e0(objH);
            }
            c0698o.p(false);
            c0698o.p(false);
            C1.a(rVar4, j11, j113, j114, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
            rVar2 = rVar4;
            j12 = j11;
            c1460n4 = c1460n3;
            c0536a3 = c0536a2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                    i17 &= -113;
                } else {
                    jA = j10;
                }
                if ((i11 & 8) != 0) {
                    c0536a0N = n();
                    i17 &= -7169;
                } else {
                    c0536a0N = c0536a1;
                }
                if (i15 != 0) {
                    C0536a0 c0536a116 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a116;
                    c1460n3 = null;
                    j11 = jA;
                } else {
                    C0536a0 c0536a117 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a117;
                    j11 = jA;
                    c1460n3 = c1460n2;
                }
            } else {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = AbstractC0537a1.a(Y.f.f10158b, c0698o);
                    i17 &= -113;
                } else {
                    jA = j10;
                }
                if ((i11 & 8) != 0) {
                    c0536a0N = n();
                    i17 &= -7169;
                } else {
                    c0536a0N = c0536a1;
                }
                if (i15 != 0) {
                    C0536a0 c0536a118 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a118;
                    c1460n3 = null;
                    j11 = jA;
                } else {
                    C0536a0 c0536a119 = c0536a0N;
                    rVar4 = rVar3;
                    c0536a2 = c0536a119;
                    j11 = jA;
                    c1460n3 = c1460n2;
                }
            }
            c0698o.q();
            long j115 = z10.f8930a;
            long j116 = z10.f8931b;
            f3 = c0536a2.f8957a;
            c0698o.T(-1763481333);
            c0698o.T(-734838460);
            objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = C0672b.r(new p063g1.f(f3));
                c0698o.e0(objH);
            }
            c0698o.p(false);
            c0698o.p(false);
            C1.a(rVar4, j11, j115, j116, 0.0f, ((p063g1.f) ((Z.X) objH).getValue()).f16252r, c1460n3, p074h0.j.d(664103990, new G.Z(dVar), c0698o), c0698o, (i17 & 14) | 12582912 | (i17 & 112) | ((i17 << 6) & 3670016), 16);
            rVar2 = rVar4;
            j12 = j11;
            c1460n4 = c1460n3;
            c0536a3 = c0536a2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0540b0(rVar2, j12, z10, c0536a3, c1460n4, dVar, i10, i11);
        }
    }

    public static final void f(l0.r rVar, C0698o c0698o, int i10) {
        Object obj = AbstractC0586o0.f9293a;
        c0698o.V(-1316639904);
        int i11 = 2;
        int i12 = (i10 & 6) == 0 ? (c0698o.g(null) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.i(obj) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            Object obj2 = objH;
            if (objH == C0690k.f10683a) {
                C0615y0 c0615y0 = new C0615y0();
                c0615y0.f9463a = new Object();
                c0615y0.f9464b = new ArrayList();
                c0698o.e0(c0615y0);
                obj2 = c0615y0;
            }
            C0615y0 c0615y1 = (C0615y0) obj2;
            c0698o.T(-1256811491);
            Object obj3 = c0615y1.f9463a;
            ArrayList arrayList = c0615y1.f9464b;
            if (!p251z9.j.a(null, obj3)) {
                c0615y1.f9463a = null;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C0612x0) arrayList.get(i13)).getClass();
                    arrayList2.add(null);
                }
                ArrayList arrayListD0 = p120l9.m.D0(arrayList2);
                if (!arrayListD0.contains(null)) {
                    arrayListD0.add(null);
                }
                arrayList.clear();
                ArrayList arrayList3 = new ArrayList(arrayListD0.size());
                int size2 = arrayListD0.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Object obj4 = arrayListD0.get(i14);
                    if (obj4 != null) {
                        arrayList3.add(obj4);
                    }
                }
                int size3 = arrayList3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    if (arrayList3.get(i15) != null) {
                        throw new ClassCastException();
                    }
                    arrayList.add(new C0612x0(p074h0.j.d(-1654683077, new A.M(3, arrayListD0, c0615y1), c0698o)));
                }
            }
            c0698o.p(false);
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            C0699o0 c0699o0V = c0698o.v();
            if (c0699o0V == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c0699o0V.f10746a |= 1;
            c0615y1.f9465c = c0699o0V;
            c0698o.T(1748085441);
            int size4 = arrayList.size();
            for (int i17 = 0; i17 < size4; i17++) {
                C0612x0 c0612x0 = (C0612x0) arrayList.get(i17);
                c0612x0.getClass();
                p074h0.d dVar = c0612x0.f9453a;
                c0698o.R(1201076541, null);
                p074h0.d dVar2 = AbstractC0586o0.f9293a;
                dVar.d(p074h0.j.d(-1135367807, new C0574k0(i11, 10), c0698o), c0698o, 6);
                c0698o.p(false);
            }
            c0698o.p(false);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0068k(rVar, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    public static final void g(l0.r rVar, float f3, long j, C0698o c0698o, int i10, int i11) {
        int i12;
        l0.r rVar2;
        long jD;
        boolean z10;
        Object objH;
        long j10;
        c0698o.V(75144485);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (c0698o.g(rVar) ? 4 : 2) | i10;
        }
        int i14 = i12 | (((i11 & 4) == 0 && c0698o.f(j)) ? 256 : 128);
        if ((i14 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            j10 = j;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                rVar2 = i13 != 0 ? l0.o.f19333a : rVar;
                if ((i11 & 4) != 0) {
                    int i15 = AbstractC0603u0.f9393a;
                    float f7 = Y.c.f10144a;
                    jD = AbstractC0568i0.d(25, c0698o);
                    i14 &= -897;
                }
                c0698o.q();
                l0.r rVarD = androidx.compose.foundation.layout.c.d(rVar2.b(androidx.compose.foundation.layout.c.f11826a), f3);
                z10 = (((i14 & 896) ^ 384) <= 256 && c0698o.f(jD)) || (i14 & 384) == 256;
                objH = c0698o.H();
                if (z10 || objH == C0690k.f10683a) {
                    objH = new C0606v0(jD, f3);
                    c0698o.e0(objH);
                }
                p171r0.f.a(rVarD, (p241y9.c) objH, c0698o, 0);
                j10 = jD;
            } else {
                c0698o.N();
                if ((i11 & 4) != 0) {
                    i14 &= -897;
                }
                rVar2 = rVar;
            }
            jD = j;
            c0698o.q();
            l0.r rVarD2 = androidx.compose.foundation.layout.c.d(rVar2.b(androidx.compose.foundation.layout.c.f11826a), f3);
            if (((i14 & 896) ^ 384) <= 256) {
            }
            objH = c0698o.H();
            if (z10) {
                objH = new C0606v0(jD, f3);
                c0698o.e0(objH);
            } else {
                objH = new C0606v0(jD, f3);
                c0698o.e0(objH);
            }
            p171r0.f.a(rVarD2, (p241y9.c) objH, c0698o, 0);
            j10 = jD;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0609w0(rVar2, f3, j10, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void h(p241y9.a aVar, l0.r rVar, boolean z10, C0618z0 c0618z0, p241y9.e eVar, C0698o c0698o, int i10, int i11) {
        int i12;
        l0.r rVar2;
        int i13;
        int i14;
        l0.r rVar3;
        long j;
        C0560g0 c0560g0;
        C0618z0 c0618z1;
        long j10;
        long jB;
        long j11;
        int i15;
        C0618z0 c0618z2;
        boolean z11;
        long j12;
        int i16;
        C0286i c0286i;
        C0285h c0285h;
        long j13;
        l0.r rVar4;
        boolean z12;
        C0618z0 c0618z3;
        C0699o0 c0699o0R;
        int i17;
        c0698o.V(-1142896114);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 32 : 16;
            }
            i13 = i12 | 384;
            if ((i10 & 3072) == 0) {
                i13 = i12 | 1408;
            }
            i14 = i13 | 24576;
            if ((196608 & i10) == 0) {
                if (c0698o.i(eVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i14 |= i17;
            }
            if ((74899 & i14) == 74898 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i18 != 0) {
                        rVar3 = l0.o.f19333a;
                    } else {
                        rVar3 = rVar2;
                    }
                    c0698o.T(-1519621781);
                    j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                    c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                    c0618z1 = c0560g0.f9111P;
                    if (c0618z1 == null) {
                        long j14 = p180s0.q.f21843f;
                        c0618z1 = new C0618z0(j14, j, j14, p180s0.q.b(j, 0.38f));
                        c0560g0.f9111P = c0618z1;
                    }
                    j10 = c0618z1.f9473b;
                    if (p180s0.q.c(j10, j)) {
                        c0698o.p(false);
                    } else {
                        jB = p180s0.q.b(j, 0.38f);
                        long j15 = c0618z1.f9472a;
                        long j16 = c0618z1.f9474c;
                        if (j == 16) {
                            j = j10;
                        }
                        if (jB != 16) {
                            j11 = jB;
                        } else {
                            j11 = c0618z1.f9475d;
                        }
                        C0618z0 c0618z4 = new C0618z0(j15, j, j16, j11);
                        c0698o.p(false);
                        c0618z1 = c0618z4;
                    }
                    i15 = i14 & (-7169);
                    c0618z2 = c0618z1;
                    z11 = true;
                } else {
                    c0698o.N();
                    z11 = z10;
                    i15 = i14 & (-7169);
                    rVar3 = rVar2;
                    c0618z2 = c0618z0;
                }
                c0698o.q();
                Z.M0 m10 = D0.f8496a;
                l0.r rVarB = rVar3.b(MinimumInteractiveModifier.f11916a);
                float f3 = Y.g.f10166b;
                l0.r rVarM = com.google.android.gms.internal.measurement.B1.m(androidx.compose.foundation.layout.c.j(rVarB, f3), AbstractC0537a1.a(5, c0698o));
                if (z11) {
                    j12 = c0618z2.f9472a;
                } else {
                    j12 = c0618z2.f9474c;
                }
                l0.r rVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.a.a(rVarM, j12, p180s0.F.f21774a), null, W0.c(false, f3 / 2, c0698o, 54, 4), z11, new R0.g(0), aVar, 8);
                H0.I iD = AbstractC0071n.d(l0.c.f19317v, false);
                i16 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                l0.r rVarC = l0.a.c(c0698o, rVarB2);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                    p123m2.c.y(i16, c0698o, i16, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                if (z11) {
                    j13 = c0618z2.f9473b;
                } else {
                    j13 = c0618z2.f9475d;
                }
                C0672b.a(AbstractC0592q0.f9328a.a(new p180s0.q(j13)), eVar, c0698o, ((i15 >> 12) & 112) | 8);
                c0698o.p(true);
                rVar4 = rVar3;
                z12 = z11;
                c0618z3 = c0618z2;
            } else {
                c0698o.N();
                z12 = z10;
                c0618z3 = c0618z0;
                rVar4 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new A0(aVar, rVar4, z12, c0618z3, eVar, i10, i11);
            }
        }
        i12 |= 48;
        rVar2 = rVar;
        i13 = i12 | 384;
        if ((i10 & 3072) == 0) {
            i13 = i12 | 1408;
        }
        i14 = i13 | 24576;
        if ((196608 & i10) == 0) {
            if (c0698o.i(eVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i14 |= i17;
        }
        if ((74899 & i14) == 74898) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                c0698o.T(-1519621781);
                j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                c0618z1 = c0560g0.f9111P;
                if (c0618z1 == null) {
                    long j17 = p180s0.q.f21843f;
                    c0618z1 = new C0618z0(j17, j, j17, p180s0.q.b(j, 0.38f));
                    c0560g0.f9111P = c0618z1;
                }
                j10 = c0618z1.f9473b;
                if (p180s0.q.c(j10, j)) {
                    c0698o.p(false);
                } else {
                    jB = p180s0.q.b(j, 0.38f);
                    long j18 = c0618z1.f9472a;
                    long j19 = c0618z1.f9474c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (jB != 16) {
                        j11 = jB;
                    } else {
                        j11 = c0618z1.f9475d;
                    }
                    C0618z0 c0618z5 = new C0618z0(j18, j, j19, j11);
                    c0698o.p(false);
                    c0618z1 = c0618z5;
                }
                i15 = i14 & (-7169);
                c0618z2 = c0618z1;
                z11 = true;
            } else {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                c0698o.T(-1519621781);
                j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                c0618z1 = c0560g0.f9111P;
                if (c0618z1 == null) {
                    long j110 = p180s0.q.f21843f;
                    c0618z1 = new C0618z0(j110, j, j110, p180s0.q.b(j, 0.38f));
                    c0560g0.f9111P = c0618z1;
                }
                j10 = c0618z1.f9473b;
                if (p180s0.q.c(j10, j)) {
                    c0698o.p(false);
                } else {
                    jB = p180s0.q.b(j, 0.38f);
                    long j111 = c0618z1.f9472a;
                    long j112 = c0618z1.f9474c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (jB != 16) {
                        j11 = jB;
                    } else {
                        j11 = c0618z1.f9475d;
                    }
                    C0618z0 c0618z6 = new C0618z0(j111, j, j112, j11);
                    c0698o.p(false);
                    c0618z1 = c0618z6;
                }
                i15 = i14 & (-7169);
                c0618z2 = c0618z1;
                z11 = true;
            }
            c0698o.q();
            Z.M0 m11 = D0.f8496a;
            l0.r rVarB3 = rVar3.b(MinimumInteractiveModifier.f11916a);
            float f7 = Y.g.f10166b;
            l0.r rVarM2 = com.google.android.gms.internal.measurement.B1.m(androidx.compose.foundation.layout.c.j(rVarB3, f7), AbstractC0537a1.a(5, c0698o));
            if (z11) {
                j12 = c0618z2.f9472a;
            } else {
                j12 = c0618z2.f9474c;
            }
            l0.r rVarB4 = androidx.compose.foundation.a.b(androidx.compose.foundation.a.a(rVarM2, j12, p180s0.F.f21774a), null, W0.c(false, f7 / 2, c0698o, 54, 4), z11, new R0.g(0), aVar, 8);
            H0.I iD2 = AbstractC0071n.d(l0.c.f19317v, false);
            i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            l0.r rVarC2 = l0.a.c(c0698o, rVarB4);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD2, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            } else {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            if (z11) {
                j13 = c0618z2.f9473b;
            } else {
                j13 = c0618z2.f9475d;
            }
            C0672b.a(AbstractC0592q0.f9328a.a(new p180s0.q(j13)), eVar, c0698o, ((i15 >> 12) & 112) | 8);
            c0698o.p(true);
            rVar4 = rVar3;
            z12 = z11;
            c0618z3 = c0618z2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                c0698o.T(-1519621781);
                j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                c0618z1 = c0560g0.f9111P;
                if (c0618z1 == null) {
                    long j113 = p180s0.q.f21843f;
                    c0618z1 = new C0618z0(j113, j, j113, p180s0.q.b(j, 0.38f));
                    c0560g0.f9111P = c0618z1;
                }
                j10 = c0618z1.f9473b;
                if (p180s0.q.c(j10, j)) {
                    c0698o.p(false);
                } else {
                    jB = p180s0.q.b(j, 0.38f);
                    long j114 = c0618z1.f9472a;
                    long j115 = c0618z1.f9474c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (jB != 16) {
                        j11 = jB;
                    } else {
                        j11 = c0618z1.f9475d;
                    }
                    C0618z0 c0618z7 = new C0618z0(j114, j, j115, j11);
                    c0698o.p(false);
                    c0618z1 = c0618z7;
                }
                i15 = i14 & (-7169);
                c0618z2 = c0618z1;
                z11 = true;
            } else {
                if (i18 != 0) {
                    rVar3 = l0.o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                c0698o.T(-1519621781);
                j = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                c0618z1 = c0560g0.f9111P;
                if (c0618z1 == null) {
                    long j116 = p180s0.q.f21843f;
                    c0618z1 = new C0618z0(j116, j, j116, p180s0.q.b(j, 0.38f));
                    c0560g0.f9111P = c0618z1;
                }
                j10 = c0618z1.f9473b;
                if (p180s0.q.c(j10, j)) {
                    c0698o.p(false);
                } else {
                    jB = p180s0.q.b(j, 0.38f);
                    long j117 = c0618z1.f9472a;
                    long j118 = c0618z1.f9474c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (jB != 16) {
                        j11 = jB;
                    } else {
                        j11 = c0618z1.f9475d;
                    }
                    C0618z0 c0618z8 = new C0618z0(j117, j, j118, j11);
                    c0698o.p(false);
                    c0618z1 = c0618z8;
                }
                i15 = i14 & (-7169);
                c0618z2 = c0618z1;
                z11 = true;
            }
            c0698o.q();
            Z.M0 m12 = D0.f8496a;
            l0.r rVarB5 = rVar3.b(MinimumInteractiveModifier.f11916a);
            float f10 = Y.g.f10166b;
            l0.r rVarM3 = com.google.android.gms.internal.measurement.B1.m(androidx.compose.foundation.layout.c.j(rVarB5, f10), AbstractC0537a1.a(5, c0698o));
            if (z11) {
                j12 = c0618z2.f9472a;
            } else {
                j12 = c0618z2.f9474c;
            }
            l0.r rVarB6 = androidx.compose.foundation.a.b(androidx.compose.foundation.a.a(rVarM3, j12, p180s0.F.f21774a), null, W0.c(false, f10 / 2, c0698o, 54, 4), z11, new R0.g(0), aVar, 8);
            H0.I iD3 = AbstractC0071n.d(l0.c.f19317v, false);
            i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            l0.r rVarC3 = l0.a.c(c0698o, rVarB6);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD3, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M3, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            } else {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            C0672b.v(c0698o, rVarC3, C0287j.f4117d);
            if (z11) {
                j13 = c0618z2.f9473b;
            } else {
                j13 = c0618z2.f9475d;
            }
            C0672b.a(AbstractC0592q0.f9328a.a(new p180s0.q(j13)), eVar, c0698o, ((i15 >> 12) & 112) | 8);
            c0698o.p(true);
            rVar4 = rVar3;
            z12 = z11;
            c0618z3 = c0618z2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A0(aVar, rVar4, z12, c0618z3, eVar, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void i(p241y9.a aVar, l0.r rVar, boolean z10, p180s0.J j, Q q10, C1460n c1460n, D.P p10, p074h0.d dVar, C0698o c0698o, int i10, int i11) {
        int i12;
        int i13;
        p180s0.J jA;
        int i14;
        int i15;
        l0.r rVar2;
        boolean z11;
        long jB;
        D.P p11;
        p180s0.J j10;
        C1460n c1460n2;
        int i16;
        l0.r rVar3;
        boolean z12;
        boolean z13;
        p180s0.J j11;
        D.P p12;
        l0.r rVar4;
        C1460n c1460n3;
        C0699o0 c0699o0R;
        c0698o.V(-1694808287);
        int i17 = i10 | (c0698o.i(aVar) ? 4 : 2);
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 = i17 | 48;
        } else {
            i12 = i17 | (c0698o.g(rVar) ? 32 : 16);
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i13 = i12 | 384;
        } else {
            i13 = i12 | (c0698o.h(z10) ? 256 : 128);
        }
        if ((i11 & 8) == 0) {
            jA = j;
            int i20 = c0698o.g(jA) ? 2048 : 1024;
            int i21 = i13 | i20;
            if (c0698o.g(q10)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i15 = i21 | i14 | 113967104;
            if ((306783379 & i15) == 306783378 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i18 != 0) {
                        rVar2 = l0.o.f19333a;
                    } else {
                        rVar2 = rVar;
                    }
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        D.P p13 = S.f8804a;
                        float f3 = Y.j.f10177a;
                        i15 &= -7169;
                        jA = AbstractC0537a1.a(5, c0698o);
                    }
                    D.P p14 = S.f8804a;
                    float f7 = Y.j.f10177a;
                    if (z11) {
                        c0698o.T(-855870548);
                        jB = AbstractC0568i0.d(24, c0698o);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-855783004);
                        jB = p180s0.q.b(AbstractC0568i0.d(24, c0698o), 0.12f);
                        c0698o.p(false);
                    }
                    C1460n c1460n4 = new C1460n(f7, new p180s0.L(jB));
                    p11 = S.f8804a;
                    j10 = jA;
                    c1460n2 = c1460n4;
                    i16 = i15 & (-3670017);
                    rVar3 = rVar2;
                    z12 = z11;
                } else {
                    c0698o.N();
                    if ((i11 & 8) != 0) {
                        i15 &= -7169;
                    }
                    z12 = z10;
                    p11 = p10;
                    i16 = i15 & (-3670017);
                    j10 = jA;
                    rVar3 = rVar;
                    c1460n2 = c1460n;
                }
                c0698o.q();
                d(aVar, rVar3, z12, j10, q10, null, c1460n2, p11, dVar, c0698o, i16 & 2147483646, 0);
                z13 = z12;
                j11 = j10;
                p12 = p11;
                rVar4 = rVar3;
                c1460n3 = c1460n2;
            } else {
                c0698o.N();
                rVar4 = rVar;
                z13 = z10;
                c1460n3 = c1460n;
                p12 = p10;
                j11 = jA;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new X(aVar, rVar4, z13, j11, q10, c1460n3, p12, dVar, i10, i11);
            }
        }
        jA = j;
        int i22 = i13 | i20;
        if (c0698o.g(q10)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        i15 = i22 | i14 | 113967104;
        if ((306783379 & i15) == 306783378) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar2 = l0.o.f19333a;
                } else {
                    rVar2 = rVar;
                }
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    D.P p15 = S.f8804a;
                    float f10 = Y.j.f10177a;
                    i15 &= -7169;
                    jA = AbstractC0537a1.a(5, c0698o);
                }
                D.P p16 = S.f8804a;
                float f11 = Y.j.f10177a;
                if (z11) {
                    c0698o.T(-855870548);
                    jB = AbstractC0568i0.d(24, c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(-855783004);
                    jB = p180s0.q.b(AbstractC0568i0.d(24, c0698o), 0.12f);
                    c0698o.p(false);
                }
                C1460n c1460n5 = new C1460n(f11, new p180s0.L(jB));
                p11 = S.f8804a;
                j10 = jA;
                c1460n2 = c1460n5;
                i16 = i15 & (-3670017);
                rVar3 = rVar2;
                z12 = z11;
            } else {
                if (i18 != 0) {
                    rVar2 = l0.o.f19333a;
                } else {
                    rVar2 = rVar;
                }
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    D.P p17 = S.f8804a;
                    float f12 = Y.j.f10177a;
                    i15 &= -7169;
                    jA = AbstractC0537a1.a(5, c0698o);
                }
                D.P p18 = S.f8804a;
                float f13 = Y.j.f10177a;
                if (z11) {
                    c0698o.T(-855870548);
                    jB = AbstractC0568i0.d(24, c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(-855783004);
                    jB = p180s0.q.b(AbstractC0568i0.d(24, c0698o), 0.12f);
                    c0698o.p(false);
                }
                C1460n c1460n6 = new C1460n(f13, new p180s0.L(jB));
                p11 = S.f8804a;
                j10 = jA;
                c1460n2 = c1460n6;
                i16 = i15 & (-3670017);
                rVar3 = rVar2;
                z12 = z11;
            }
            c0698o.q();
            d(aVar, rVar3, z12, j10, q10, null, c1460n2, p11, dVar, c0698o, i16 & 2147483646, 0);
            z13 = z12;
            j11 = j10;
            p12 = p11;
            rVar4 = rVar3;
            c1460n3 = c1460n2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    rVar2 = l0.o.f19333a;
                } else {
                    rVar2 = rVar;
                }
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    D.P p19 = S.f8804a;
                    float f14 = Y.j.f10177a;
                    i15 &= -7169;
                    jA = AbstractC0537a1.a(5, c0698o);
                }
                D.P p110 = S.f8804a;
                float f15 = Y.j.f10177a;
                if (z11) {
                    c0698o.T(-855870548);
                    jB = AbstractC0568i0.d(24, c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(-855783004);
                    jB = p180s0.q.b(AbstractC0568i0.d(24, c0698o), 0.12f);
                    c0698o.p(false);
                }
                C1460n c1460n7 = new C1460n(f15, new p180s0.L(jB));
                p11 = S.f8804a;
                j10 = jA;
                c1460n2 = c1460n7;
                i16 = i15 & (-3670017);
                rVar3 = rVar2;
                z12 = z11;
            } else {
                if (i18 != 0) {
                    rVar2 = l0.o.f19333a;
                } else {
                    rVar2 = rVar;
                }
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    D.P p111 = S.f8804a;
                    float f16 = Y.j.f10177a;
                    i15 &= -7169;
                    jA = AbstractC0537a1.a(5, c0698o);
                }
                D.P p112 = S.f8804a;
                float f17 = Y.j.f10177a;
                if (z11) {
                    c0698o.T(-855870548);
                    jB = AbstractC0568i0.d(24, c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(-855783004);
                    jB = p180s0.q.b(AbstractC0568i0.d(24, c0698o), 0.12f);
                    c0698o.p(false);
                }
                C1460n c1460n8 = new C1460n(f17, new p180s0.L(jB));
                p11 = S.f8804a;
                j10 = jA;
                c1460n2 = c1460n8;
                i16 = i15 & (-3670017);
                rVar3 = rVar2;
                z12 = z11;
            }
            c0698o.q();
            d(aVar, rVar3, z12, j10, q10, null, c1460n2, p11, dVar, c0698o, i16 & 2147483646, 0);
            z13 = z12;
            j11 = j10;
            p12 = p11;
            rVar4 = rVar3;
            c1460n3 = c1460n2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new X(aVar, rVar4, z13, j11, q10, c1460n3, p12, dVar, i10, i11);
        }
    }

    public static final void j(C0610w1 c0610w1, l0.r rVar, p241y9.f fVar, C0698o c0698o, int i10) {
        int i11;
        l0.r rVar2;
        c0698o.V(464178177);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(c0610w1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i12 & 147) == 146 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
        } else {
            fVar = AbstractC0586o0.f9293a;
            if (c0610w1.f9438a.getValue() != null) {
                throw new ClassCastException();
            }
            InterfaceC0340e interfaceC0340e = (InterfaceC0340e) c0698o.k(AbstractC0359n0.f5112a);
            p150o9.c cVar = null;
            boolean zG = c0698o.g(null) | c0698o.i(interfaceC0340e);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new D3.b(interfaceC0340e, cVar, 4);
                c0698o.e0(objH);
            }
            C0672b.f(c0698o, null, (p241y9.e) objH);
            if (c0610w1.f9438a.getValue() != null) {
                throw new ClassCastException();
            }
            int i13 = i12 & 1008;
            l0.o oVar = l0.o.f19333a;
            f(oVar, c0698o, i13);
            rVar2 = oVar;
        }
        p241y9.f fVar2 = fVar;
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K.v0(c0610w1, rVar2, fVar2, i10, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void k(p241y9.a aVar, l0.r rVar, boolean z10, p180s0.J j, Q q10, D.P p10, p241y9.f fVar, C0698o c0698o, int i10, int i11) {
        int i12;
        p180s0.J j10;
        Q q11;
        D.P p11;
        int i13;
        p180s0.J jA;
        Q qB;
        l0.r rVar2;
        int i14;
        Q q12;
        boolean z11;
        p180s0.J j11;
        D.P p12;
        Q q13;
        D.P p13;
        p180s0.J j12;
        boolean z12;
        l0.r rVar3;
        C0699o0 c0699o0R;
        int i15;
        c0698o.V(-2106428362);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i17 = i12 | 384;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j10 = j;
                int i18 = c0698o.g(j10) ? 2048 : 1024;
                i17 |= i18;
            } else {
                j10 = j;
            }
            i17 |= i18;
        } else {
            j10 = j;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q11 = q10;
                int i19 = c0698o.g(q11) ? 16384 : 8192;
                i17 |= i19;
            } else {
                q11 = q10;
            }
            i17 |= i19;
        } else {
            q11 = q10;
        }
        int i20 = 1769472 | i17;
        int i21 = i11 & 128;
        if (i21 == 0) {
            if ((12582912 & i10) == 0) {
                p11 = p10;
                i20 |= c0698o.g(p11) ? 8388608 : 4194304;
            }
            i13 = i20 | 100663296;
            if ((805306368 & i10) == 0) {
                if (c0698o.i(fVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((306783379 & i13) == 306783378 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i16 != 0) {
                        rVar = l0.o.f19333a;
                    }
                    if ((i11 & 8) != 0) {
                        D.P p14 = S.f8804a;
                        jA = AbstractC0537a1.a(5, c0698o);
                        i13 &= -7169;
                    } else {
                        jA = j10;
                    }
                    if ((i11 & 16) != 0) {
                        D.P p15 = S.f8804a;
                        qB = S.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
                        i13 &= -57345;
                    } else {
                        qB = q11;
                    }
                    if (i21 != 0) {
                        p11 = S.f8805b;
                    }
                    p180s0.J j13 = jA;
                    rVar2 = rVar;
                    i14 = i13;
                    q12 = qB;
                    z11 = true;
                    j11 = j13;
                    p12 = p11;
                } else {
                    c0698o.N();
                    if ((i11 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i13 &= -57345;
                    }
                    rVar2 = rVar;
                    p12 = p11;
                    i14 = i13;
                    q12 = q11;
                    j11 = j10;
                    z11 = z10;
                }
                c0698o.q();
                d(aVar, rVar2, z11, j11, q12, null, null, p12, fVar, c0698o, i14 & 2147483646, 0);
                q13 = q12;
                p13 = p12;
                j12 = j11;
                z12 = z11;
                rVar3 = rVar2;
            } else {
                c0698o.N();
                p13 = p11;
                j12 = j10;
                q13 = q11;
                rVar3 = rVar;
                z12 = z10;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0588p(aVar, rVar3, z12, j12, q13, p13, fVar, i10, i11);
            }
        }
        i20 = 14352384 | i17;
        p11 = p10;
        i13 = i20 | 100663296;
        if ((805306368 & i10) == 0) {
            if (c0698o.i(fVar)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        if ((306783379 & i13) == 306783378) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    rVar = l0.o.f19333a;
                }
                if ((i11 & 8) != 0) {
                    D.P p16 = S.f8804a;
                    jA = AbstractC0537a1.a(5, c0698o);
                    i13 &= -7169;
                } else {
                    jA = j10;
                }
                if ((i11 & 16) != 0) {
                    D.P p17 = S.f8804a;
                    qB = S.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
                    i13 &= -57345;
                } else {
                    qB = q11;
                }
                if (i21 != 0) {
                    p11 = S.f8805b;
                }
                p180s0.J j14 = jA;
                rVar2 = rVar;
                i14 = i13;
                q12 = qB;
                z11 = true;
                j11 = j14;
                p12 = p11;
            } else {
                if (i16 != 0) {
                    rVar = l0.o.f19333a;
                }
                if ((i11 & 8) != 0) {
                    D.P p18 = S.f8804a;
                    jA = AbstractC0537a1.a(5, c0698o);
                    i13 &= -7169;
                } else {
                    jA = j10;
                }
                if ((i11 & 16) != 0) {
                    D.P p19 = S.f8804a;
                    qB = S.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
                    i13 &= -57345;
                } else {
                    qB = q11;
                }
                if (i21 != 0) {
                    p11 = S.f8805b;
                }
                p180s0.J j15 = jA;
                rVar2 = rVar;
                i14 = i13;
                q12 = qB;
                z11 = true;
                j11 = j15;
                p12 = p11;
            }
            c0698o.q();
            d(aVar, rVar2, z11, j11, q12, null, null, p12, fVar, c0698o, i14 & 2147483646, 0);
            q13 = q12;
            p13 = p12;
            j12 = j11;
            z12 = z11;
            rVar3 = rVar2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    rVar = l0.o.f19333a;
                }
                if ((i11 & 8) != 0) {
                    D.P p110 = S.f8804a;
                    jA = AbstractC0537a1.a(5, c0698o);
                    i13 &= -7169;
                } else {
                    jA = j10;
                }
                if ((i11 & 16) != 0) {
                    D.P p111 = S.f8804a;
                    qB = S.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
                    i13 &= -57345;
                } else {
                    qB = q11;
                }
                if (i21 != 0) {
                    p11 = S.f8805b;
                }
                p180s0.J j16 = jA;
                rVar2 = rVar;
                i14 = i13;
                q12 = qB;
                z11 = true;
                j11 = j16;
                p12 = p11;
            } else {
                if (i16 != 0) {
                    rVar = l0.o.f19333a;
                }
                if ((i11 & 8) != 0) {
                    D.P p112 = S.f8804a;
                    jA = AbstractC0537a1.a(5, c0698o);
                    i13 &= -7169;
                } else {
                    jA = j10;
                }
                if ((i11 & 16) != 0) {
                    D.P p113 = S.f8804a;
                    qB = S.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
                    i13 &= -57345;
                } else {
                    qB = q11;
                }
                if (i21 != 0) {
                    p11 = S.f8805b;
                }
                p180s0.J j17 = jA;
                rVar2 = rVar;
                i14 = i13;
                q12 = qB;
                z11 = true;
                j11 = j17;
                p12 = p11;
            }
            c0698o.q();
            d(aVar, rVar2, z11, j11, q12, null, null, p12, fVar, c0698o, i14 & 2147483646, 0);
            q13 = q12;
            p13 = p12;
            j12 = j11;
            z12 = z11;
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0588p(aVar, rVar3, z12, j12, q13, p13, fVar, i10, i11);
        }
    }

    public static final void l(C0561g1 c0561g1, float f3, float f7, boolean z10, p180s0.J j, long j10, long j11, float f10, float f11, p241y9.e eVar, p074h0.d dVar, C0698o c0698o, int i10, int i11) {
        int i12;
        int i13;
        c0698o.V(721467526);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(c0561g1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.d(f3) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.d(f7) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.g(j) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.f(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0698o.f(j11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0698o.d(f10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0698o.d(f11) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0698o.i(eVar) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0698o.i(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i14 & 306783379) == 306783378 && (i13 & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (objH == s10) {
                C0707x c0707x = new C0707x(C0672b.m(c0698o));
                c0698o.e0(c0707x);
                objH = c0707x;
            }
            InterfaceC0402u interfaceC0402u = ((C0707x) objH).f10851r;
            float fW = ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(f3);
            c0698o.T(-1831611516);
            l0.r rVarA = l0.o.f19333a;
            if (z10) {
                boolean zG = c0698o.g(c0561g1.f9137b);
                Object objH2 = c0698o.H();
                if (zG || objH2 == s10) {
                    C0007a c0007a = new C0007a(26, interfaceC0402u, c0561g1);
                    float f12 = AbstractC0549d1.f9025a;
                    C0541b1 c0541b1 = new C0541b1(c0561g1, c0007a);
                    c0698o.e0(c0541b1);
                    objH2 = c0541b1;
                }
                rVarA = androidx.compose.ui.input.nestedscroll.a.a(rVarA, (C0.a) objH2, null);
            }
            c0698o.p(false);
            l0.r rVarB = androidx.compose.foundation.layout.c.g(((AbstractC0274a0) androidx.compose.foundation.layout.c.o(f7)).b(androidx.compose.foundation.layout.c.f11826a), f3).b(rVarA);
            X.s sVar = c0561g1.f9137b;
            boolean zD = ((i14 & 14) == 4) | c0698o.d(fW);
            Object objH3 = c0698o.H();
            if (zD || objH3 == s10) {
                objH3 = new C(fW, 1, c0561g1);
                c0698o.e0(objH3);
            }
            EnumC0047u0 enumC0047u0 = EnumC0047u0.f424r;
            int i15 = i14 >> 9;
            C1.a(androidx.compose.material3.internal.a.b(androidx.compose.material3.internal.a.d(rVarB, sVar, enumC0047u0, (p241y9.e) objH3), c0561g1.f9137b, enumC0047u0, z10), j, j10, j11, f10, f11, null, p074h0.j.d(390720907, new M(eVar, c0561g1, z10, interfaceC0402u, dVar), c0698o), c0698o, (i15 & 112) | 12582912 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 64);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N(c0561g1, f3, f7, z10, j, j10, j11, f10, f11, eVar, dVar, i10, i11);
        }
    }

    public static Z m(long j, C0698o c0698o) {
        long jB = AbstractC0568i0.b(j, c0698o);
        long j10 = p180s0.q.g;
        long jB2 = p180s0.q.b(jB, 0.38f);
        C0560g0 c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
        Z z10 = c0560g0.f9109N;
        if (z10 == null) {
            float f3 = Y.f.f10157a;
            Z z11 = new Z(AbstractC0568i0.c(c0560g0, 39), AbstractC0568i0.a(c0560g0, AbstractC0568i0.c(c0560g0, 39)), p180s0.F.k(p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.f.f10159c), Y.f.f10161e), AbstractC0568i0.c(c0560g0, 39)), p180s0.q.b(AbstractC0568i0.a(c0560g0, AbstractC0568i0.c(c0560g0, 39)), 0.38f));
            c0560g0.f9109N = z11;
            z10 = z11;
        }
        long j11 = j != 16 ? j : z10.f8930a;
        long j12 = jB != 16 ? jB : z10.f8931b;
        if (j10 == 16) {
            j10 = z10.f8932c;
        }
        long j13 = j10;
        if (jB2 == 16) {
            jB2 = z10.f8933d;
        }
        return new Z(j11, j12, j13, jB2);
    }

    public static C0536a0 n() {
        return new C0536a0(Y.f.f10157a, Y.f.f10164i, Y.f.g, Y.f.f10163h, Y.f.f10162f, Y.f.f10160d);
    }

    public static J1 o(long j, long j10, long j11, long j12, C0698o c0698o, int i10) {
        long j13 = p180s0.q.f21843f;
        float f3 = Y.q.f10227a;
        long jD = AbstractC0568i0.d(11, c0698o);
        long jD2 = (i10 & 16) != 0 ? AbstractC0568i0.d(24, c0698o) : j11;
        long jD3 = (i10 & 32) != 0 ? AbstractC0568i0.d(39, c0698o) : j12;
        long jD4 = AbstractC0568i0.d(24, c0698o);
        long jD5 = AbstractC0568i0.d(39, c0698o);
        long jB = p180s0.q.b(AbstractC0568i0.d(35, c0698o), 1.0f);
        Z.M0 m10 = AbstractC0568i0.f9172a;
        return new J1(j, j10, j13, jD, jD2, jD3, jD4, jD5, p180s0.F.k(jB, ((C0560g0) c0698o.k(m10)).f9125p), p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(18, c0698o), 0.12f), ((C0560g0) c0698o.k(m10)).f9125p), j13, p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(18, c0698o), 0.38f), ((C0560g0) c0698o.k(m10)).f9125p), p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(18, c0698o), 0.38f), ((C0560g0) c0698o.k(m10)).f9125p), p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(39, c0698o), 0.12f), ((C0560g0) c0698o.k(m10)).f9125p), p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(18, c0698o), 0.12f), ((C0560g0) c0698o.k(m10)).f9125p), p180s0.F.k(p180s0.q.b(AbstractC0568i0.d(39, c0698o), 0.38f), ((C0560g0) c0698o.k(m10)).f9125p));
    }

    public static final P p(C0561g1 c0561g1, C0698o c0698o, int i10) {
        if ((i10 & 1) != 0) {
            c0561g1 = q(0, 7, c0698o);
        }
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (objH == obj) {
            objH = new C0610w1();
            c0698o.e0(objH);
        }
        C0610w1 c0610w1 = (C0610w1) objH;
        boolean zG = c0698o.g(c0561g1) | c0698o.g(c0610w1);
        Object objH2 = c0698o.H();
        if (zG || objH2 == obj) {
            objH2 = new P(c0561g1, c0610w1);
            c0698o.e0(objH2);
        }
        return (P) objH2;
    }

    public static final C0561g1 q(int i10, int i11, C0698o c0698o) {
        Object obj;
        EnumC0565h1 enumC0565h1 = (i11 & 1) != 0 ? EnumC0565h1.f9160t : EnumC0565h1.f9158r;
        O o10 = O.f8732s;
        int i12 = 0;
        int i13 = 1;
        boolean z10 = (i11 & 4) != 0;
        int i14 = ((i10 << 3) & 7168) | ((i10 << 6) & 896);
        float f3 = AbstractC0549d1.f9025a;
        p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
        Object[] objArr = {Boolean.FALSE, o10, Boolean.valueOf(z10)};
        C0574k0 c0574k0 = C0574k0.f9205v;
        F.p pVar = new F.p(i13, cVar, o10, z10);
        p085i0.n nVar = p085i0.o.f16735a;
        p085i0.n nVar2 = new p085i0.n(i12, c0574k0, pVar);
        int i15 = (c0698o.h(false) ? 1 : 0) | (c0698o.g(cVar) ? 1 : 0) | (((((i14 & 896) ^ 384) <= 256 || !c0698o.g(enumC0565h1)) && (i14 & 384) != 256) ? 0 : 1) | (c0698o.g(o10) ? 1 : 0) | (((((i14 & 7168) ^ 3072) > 2048 && c0698o.h(z10)) || (i14 & 3072) == 2048) ? 1 : 0);
        Object objH = c0698o.H();
        if (i15 != 0 || objH == C0690k.f10683a) {
            obj = objH;
            Object c0545c1 = new C0545c1(cVar, enumC0565h1, o10, z10);
            c0698o.e0(c0545c1);
            obj = c0545c1;
        }
        obj = objH;
        return (C0561g1) va.g.H(objArr, nVar2, (p241y9.a) obj, c0698o, 0, 4);
    }
}
