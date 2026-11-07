package X;

import H0.C0220t;
import U0.C0515g;
import W.C0539b;
import W.G2;
import W.H2;
import W.L1;
import W.W1;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.G0;
import Z.S;
import p056f2.AbstractC0939l;
import p214w.C1390c;
import p223x.AbstractC1413d;
import p223x.InterfaceC1435y;
import p223x.n0;
import p223x.q0;
import p223x.t0;
import p223x.u0;
import p223x.v0;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9711b;
    public static final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f9716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0.r f9717i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9710a = p063g1.b.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9712c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f9713d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f9714e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f9715f = 24;

    static {
        float f3 = 16;
        f9711b = f3;
        g = f3;
        f9716h = f3;
        float f7 = 48;
        f9717i = androidx.compose.foundation.layout.c.a(l0.o.f19333a, f7, f7);
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0312  */
    /* JADX WARN: Code duplicated, block: B:224:0x033a  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:245:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:249:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:252:0x0407  */
    /* JADX WARN: Code duplicated, block: B:254:0x040d  */
    /* JADX WARN: Code duplicated, block: B:257:0x042b  */
    /* JADX WARN: Code duplicated, block: B:258:0x042e  */
    /* JADX WARN: Code duplicated, block: B:262:0x046f  */
    /* JADX WARN: Code duplicated, block: B:265:0x04db  */
    /* JADX WARN: Code duplicated, block: B:268:0x0501  */
    public static final void a(String str, p241y9.e eVar, W2.n nVar, boolean z10, boolean z11, B.j jVar, D.P p10, L1 l10, p241y9.e eVar2, C0698o c0698o, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        y yVar;
        long j;
        float f3;
        C0681f0 c0681f0;
        float f7;
        long j10;
        int iOrdinal;
        float f10;
        int iOrdinal2;
        boolean z12;
        float f11;
        n0 n0VarC;
        int iOrdinal3;
        int iOrdinal4;
        n0 n0VarC2;
        y yVar2;
        int[] iArr;
        long j11;
        p187t0.c cVarF;
        boolean zG;
        Object objH;
        y yVar3;
        long j12;
        y yVar4;
        long j13;
        p187t0.c cVarF2;
        boolean zG2;
        Object objH2;
        Object objH3;
        Object objH4;
        C0698o c0698o2 = c0698o;
        Float fValueOf = Float.valueOf(1.0f);
        c0698o2.V(1514469103);
        if ((i10 & 6) == 0) {
            i12 = (c0698o2.g(N.f9718r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o2.g(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o2.i(eVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            obj = nVar;
            i12 |= c0698o2.g(obj) ? 2048 : 1024;
        } else {
            obj = nVar;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o2.i(null) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c0698o2.i(null) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0698o2.i(null) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0698o2.i(null) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0698o2.i(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0698o2.i(null) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0698o2.i(null) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0698o2.h(z10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c0698o2.h(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0698o2.h(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0698o2.g(jVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= c0698o2.g(p10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0698o2.g(l10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0698o2.i(eVar2) ? 8388608 : 4194304;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 4793491) == 4793490 && c0698o2.x()) {
            c0698o2.N();
        } else {
            boolean z13 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32);
            Object objH5 = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (z13 || objH5 == s10) {
                C0515g c0515g = new C0515g(6, str, null);
                obj.getClass();
                Z0.F f12 = new Z0.F(c0515g, Z0.r.f10939a);
                c0698o2.e0(f12);
                objH5 = f12;
            }
            String str2 = ((Z0.F) objH5).f10891a.f8060s;
            boolean zBooleanValue = ((Boolean) p000a.a.r(jVar, c0698o2, (i13 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                yVar = y.f9806r;
            } else {
                yVar = str2.length() == 0 ? y.f9807s : y.f9808t;
            }
            if (z11) {
                j = zBooleanValue ? l10.f8678x : l10.f8679y;
            } else {
                j = l10.f8680z;
            }
            G2 g10 = (G2) c0698o2.k(H2.f8580a);
            U0.L l11 = g10.j;
            U0.L l12 = g10.f8566l;
            long jB = l11.b();
            int i14 = i12;
            long j14 = p180s0.q.g;
            boolean z14 = (p180s0.q.c(jB, j14) && !p180s0.q.c(l12.b(), j14)) || (!p180s0.q.c(l11.b(), j14) && p180s0.q.c(l12.b(), j14));
            long jB2 = l12.b();
            long j15 = (z14 && jB2 == 16) ? j : jB2;
            long jB3 = l11.b();
            long j16 = (z14 && jB3 == 16) ? j : jB3;
            q0 q0VarE = t0.e(yVar, "TextFieldInputState", c0698o2, 48);
            AbstractC0939l abstractC0939l = q0VarE.f24065a;
            C0681f0 c0681f1 = q0VarE.f24068d;
            v0 v0Var = w0.f24113a;
            y yVar5 = (y) abstractC0939l.i();
            c0698o2.T(-2036730335);
            int iOrdinal5 = yVar5.ordinal();
            if (iOrdinal5 == 0) {
                f3 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    throw new A6.a();
                }
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            c0698o2.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            y yVar6 = (y) c0681f1.getValue();
            c0698o2.T(-2036730335);
            int iOrdinal6 = yVar6.ordinal();
            if (iOrdinal6 != 0) {
                c0681f0 = c0681f1;
                if (iOrdinal6 == 1) {
                    f7 = 0.0f;
                } else if (iOrdinal6 != 2) {
                    throw new A6.a();
                }
                c0698o2.p(false);
                Float fValueOf3 = Float.valueOf(f7);
                q0VarE.f();
                c0698o2.T(1276209157);
                j10 = j16;
                u0 u0VarQ = AbstractC1413d.q(150, 0, null, 6);
                c0698o2.p(false);
                n0 n0VarC3 = t0.c(q0VarE, fValueOf2, fValueOf3, u0VarQ, v0Var, c0698o2, 196608);
                C0630b c0630b = C0630b.f9728t;
                y yVar7 = (y) abstractC0939l.i();
                c0698o2.T(1435837472);
                iOrdinal = yVar7.ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    f10 = 1.0f;
                } else {
                    if (iOrdinal != 2) {
                        throw new A6.a();
                    }
                    f10 = 0.0f;
                }
                c0698o2.p(false);
                Float fValueOf4 = Float.valueOf(f10);
                y yVar8 = (y) c0681f0.getValue();
                c0698o2.T(1435837472);
                iOrdinal2 = yVar8.ordinal();
                if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                    z12 = false;
                    f11 = 1.0f;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new A6.a();
                    }
                    f11 = 0.0f;
                    z12 = false;
                }
                c0698o2.p(z12);
                n0VarC = t0.c(q0VarE, fValueOf4, Float.valueOf(f11), (InterfaceC1435y) c0630b.d(q0VarE.f(), c0698o2, 0), v0Var, c0698o2, 196608);
                y yVar9 = (y) abstractC0939l.i();
                c0698o2.T(1128033978);
                iOrdinal3 = yVar9.ordinal();
                if (iOrdinal3 == 0 && iOrdinal3 != 1 && iOrdinal3 != 2) {
                    throw new A6.a();
                }
                c0698o2.p(false);
                y yVar10 = (y) c0681f0.getValue();
                c0698o2.T(1128033978);
                iOrdinal4 = yVar10.ordinal();
                if (iOrdinal4 == 0 && iOrdinal4 != 1 && iOrdinal4 != 2) {
                    throw new A6.a();
                }
                c0698o2.p(false);
                q0VarE.f();
                c0698o2.T(-1868044898);
                u0 u0VarQ2 = AbstractC1413d.q(150, 0, null, 6);
                c0698o2.p(false);
                n0VarC2 = t0.c(q0VarE, fValueOf, fValueOf, u0VarQ2, v0Var, c0698o2, 196608);
                yVar2 = (y) c0681f0.getValue();
                c0698o2.T(-107432127);
                iArr = K.f9706a;
                if (iArr[yVar2.ordinal()] == 1) {
                    j11 = j15;
                } else {
                    j11 = j10;
                }
                c0698o2.p(false);
                cVarF = p180s0.q.f(j11);
                zG = c0698o2.g(cVarF);
                objH = c0698o2.H();
                if (zG || objH == s10) {
                    v0 v0Var2 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF));
                    c0698o2.e0(v0Var2);
                    objH = v0Var2;
                }
                v0 v0Var3 = (v0) objH;
                yVar3 = (y) abstractC0939l.i();
                c0698o2.T(-107432127);
                if (iArr[yVar3.ordinal()] == 1) {
                    j12 = j15;
                } else {
                    j12 = j10;
                }
                c0698o2.p(false);
                p180s0.q qVar = new p180s0.q(j12);
                yVar4 = (y) c0681f0.getValue();
                c0698o2.T(-107432127);
                if (iArr[yVar4.ordinal()] == 1) {
                    j13 = j15;
                } else {
                    j13 = j10;
                }
                c0698o2.p(false);
                p180s0.q qVar2 = new p180s0.q(j13);
                q0VarE.f();
                c0698o2.T(1528582156);
                u0 u0VarQ3 = AbstractC1413d.q(150, 0, null, 6);
                c0698o2.p(false);
                t0.c(q0VarE, qVar, qVar2, u0VarQ3, v0Var3, c0698o2, 196608);
                c0698o2.T(1023351670);
                c0698o2.p(false);
                cVarF2 = p180s0.q.f(j);
                zG2 = c0698o2.g(cVarF2);
                objH2 = c0698o2.H();
                if (zG2 || objH2 == s10) {
                    v0 v0Var4 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF2));
                    c0698o2.e0(v0Var4);
                    objH2 = v0Var4;
                }
                c0698o2.T(1023351670);
                c0698o2.p(false);
                long j17 = j;
                p180s0.q qVar3 = new p180s0.q(j17);
                c0698o2.T(1023351670);
                c0698o2.p(false);
                p180s0.q qVar4 = new p180s0.q(j17);
                q0VarE.f();
                c0698o2.T(-543659263);
                u0 u0VarQ4 = AbstractC1413d.q(150, 0, null, 6);
                c0698o2.p(false);
                t0.c(q0VarE, qVar3, qVar4, u0VarQ4, (v0) objH2, c0698o2, 196608);
                float fFloatValue = ((Number) n0VarC3.f24044A.getValue()).floatValue();
                c0698o2.T(-156998101);
                c0698o2.p(false);
                objH3 = c0698o2.H();
                if (objH3 == s10) {
                    S s11 = S.f10643w;
                    O.A a9 = new O.A(n0VarC, 2);
                    p074h0.i iVar = G0.f10597a;
                    Z.C c10 = new Z.C(a9, s11);
                    c0698o2.e0(c10);
                    objH3 = c10;
                }
                c0698o2.T(-156965270);
                c0698o2.p(false);
                objH4 = c0698o2.H();
                int i15 = 3;
                if (objH4 == s10) {
                    S s12 = S.f10643w;
                    O.A a10 = new O.A(n0VarC2, 3);
                    p074h0.i iVar2 = G0.f10597a;
                    Z.C c11 = new Z.C(a10, s12);
                    c0698o2.e0(c11);
                    objH4 = c11;
                }
                c0698o2.T(-156940524);
                c0698o2.p(false);
                c0698o2.T(-156921964);
                c0698o2.p(false);
                c0698o2.T(-156902962);
                c0698o2.p(false);
                c0698o2.T(-156893937);
                c0698o2.p(false);
                c0698o2.T(-156884470);
                c0698o2.p(false);
                c0698o2.T(-568105095);
                W1.c(eVar, null, null, null, null, null, null, z10, fFloatValue, p074h0.j.d(1750327932, new C0539b(eVar2, i15), c0698o2), null, p10, c0698o, ((i14 >> 3) & 112) | 6 | ((i13 << 21) & 234881024), ((i13 >> 9) & 896) | 6);
                c0698o2 = c0698o;
                c0698o2.p(false);
            } else {
                c0681f0 = c0681f1;
            }
            f7 = 1.0f;
            c0698o2.p(false);
            Float fValueOf5 = Float.valueOf(f7);
            q0VarE.f();
            c0698o2.T(1276209157);
            j10 = j16;
            u0 u0VarQ5 = AbstractC1413d.q(150, 0, null, 6);
            c0698o2.p(false);
            n0 n0VarC4 = t0.c(q0VarE, fValueOf2, fValueOf5, u0VarQ5, v0Var, c0698o2, 196608);
            C0630b c0630b2 = C0630b.f9728t;
            y yVar11 = (y) abstractC0939l.i();
            c0698o2.T(1435837472);
            iOrdinal = yVar11.ordinal();
            if (iOrdinal != 0) {
                f10 = 1.0f;
            } else {
                f10 = 1.0f;
            }
            c0698o2.p(false);
            Float fValueOf6 = Float.valueOf(f10);
            y yVar12 = (y) c0681f0.getValue();
            c0698o2.T(1435837472);
            iOrdinal2 = yVar12.ordinal();
            if (iOrdinal2 != 0) {
                z12 = false;
                f11 = 1.0f;
            } else {
                z12 = false;
                f11 = 1.0f;
            }
            c0698o2.p(z12);
            n0VarC = t0.c(q0VarE, fValueOf6, Float.valueOf(f11), (InterfaceC1435y) c0630b2.d(q0VarE.f(), c0698o2, 0), v0Var, c0698o2, 196608);
            y yVar13 = (y) abstractC0939l.i();
            c0698o2.T(1128033978);
            iOrdinal3 = yVar13.ordinal();
            if (iOrdinal3 == 0) {
            }
            c0698o2.p(false);
            y yVar14 = (y) c0681f0.getValue();
            c0698o2.T(1128033978);
            iOrdinal4 = yVar14.ordinal();
            if (iOrdinal4 == 0) {
            }
            c0698o2.p(false);
            q0VarE.f();
            c0698o2.T(-1868044898);
            u0 u0VarQ6 = AbstractC1413d.q(150, 0, null, 6);
            c0698o2.p(false);
            n0VarC2 = t0.c(q0VarE, fValueOf, fValueOf, u0VarQ6, v0Var, c0698o2, 196608);
            yVar2 = (y) c0681f0.getValue();
            c0698o2.T(-107432127);
            iArr = K.f9706a;
            if (iArr[yVar2.ordinal()] == 1) {
                j11 = j15;
            } else {
                j11 = j10;
            }
            c0698o2.p(false);
            cVarF = p180s0.q.f(j11);
            zG = c0698o2.g(cVarF);
            objH = c0698o2.H();
            if (zG) {
                v0 v0Var5 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF));
                c0698o2.e0(v0Var5);
                objH = v0Var5;
            } else {
                v0 v0Var6 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF));
                c0698o2.e0(v0Var6);
                objH = v0Var6;
            }
            v0 v0Var7 = (v0) objH;
            yVar3 = (y) abstractC0939l.i();
            c0698o2.T(-107432127);
            if (iArr[yVar3.ordinal()] == 1) {
                j12 = j15;
            } else {
                j12 = j10;
            }
            c0698o2.p(false);
            p180s0.q qVar5 = new p180s0.q(j12);
            yVar4 = (y) c0681f0.getValue();
            c0698o2.T(-107432127);
            if (iArr[yVar4.ordinal()] == 1) {
                j13 = j15;
            } else {
                j13 = j10;
            }
            c0698o2.p(false);
            p180s0.q qVar6 = new p180s0.q(j13);
            q0VarE.f();
            c0698o2.T(1528582156);
            u0 u0VarQ7 = AbstractC1413d.q(150, 0, null, 6);
            c0698o2.p(false);
            t0.c(q0VarE, qVar5, qVar6, u0VarQ7, v0Var7, c0698o2, 196608);
            c0698o2.T(1023351670);
            c0698o2.p(false);
            cVarF2 = p180s0.q.f(j);
            zG2 = c0698o2.g(cVarF2);
            objH2 = c0698o2.H();
            if (zG2) {
                v0 v0Var8 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF2));
                c0698o2.e0(v0Var8);
                objH2 = v0Var8;
            } else {
                v0 v0Var9 = new v0(C1390c.f23481w, new p085i0.f(11, cVarF2));
                c0698o2.e0(v0Var9);
                objH2 = v0Var9;
            }
            c0698o2.T(1023351670);
            c0698o2.p(false);
            long j18 = j;
            p180s0.q qVar7 = new p180s0.q(j18);
            c0698o2.T(1023351670);
            c0698o2.p(false);
            p180s0.q qVar8 = new p180s0.q(j18);
            q0VarE.f();
            c0698o2.T(-543659263);
            u0 u0VarQ8 = AbstractC1413d.q(150, 0, null, 6);
            c0698o2.p(false);
            t0.c(q0VarE, qVar7, qVar8, u0VarQ8, (v0) objH2, c0698o2, 196608);
            float fFloatValue2 = ((Number) n0VarC4.f24044A.getValue()).floatValue();
            c0698o2.T(-156998101);
            c0698o2.p(false);
            objH3 = c0698o2.H();
            if (objH3 == s10) {
                S s13 = S.f10643w;
                O.A a11 = new O.A(n0VarC, 2);
                p074h0.i iVar3 = G0.f10597a;
                Z.C c12 = new Z.C(a11, s13);
                c0698o2.e0(c12);
                objH3 = c12;
            }
            c0698o2.T(-156965270);
            c0698o2.p(false);
            objH4 = c0698o2.H();
            int i16 = 3;
            if (objH4 == s10) {
                S s14 = S.f10643w;
                O.A a12 = new O.A(n0VarC2, 3);
                p074h0.i iVar4 = G0.f10597a;
                Z.C c13 = new Z.C(a12, s14);
                c0698o2.e0(c13);
                objH4 = c13;
            }
            c0698o2.T(-156940524);
            c0698o2.p(false);
            c0698o2.T(-156921964);
            c0698o2.p(false);
            c0698o2.T(-156902962);
            c0698o2.p(false);
            c0698o2.T(-156893937);
            c0698o2.p(false);
            c0698o2.T(-156884470);
            c0698o2.p(false);
            c0698o2.T(-568105095);
            W1.c(eVar, null, null, null, null, null, null, z10, fFloatValue2, p074h0.j.d(1750327932, new C0539b(eVar2, i16), c0698o2), null, p10, c0698o, ((i14 >> 3) & 112) | 6 | ((i13 << 21) & 234881024), ((i13 >> 9) & 896) | 6);
            c0698o2 = c0698o;
            c0698o2.p(false);
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new J(str, eVar, nVar, z10, z11, jVar, p10, l10, eVar2, i10, i11);
        }
    }

    public static final Object b(H0.H h7) {
        Object objI = h7.i();
        C0220t c0220t = objI instanceof C0220t ? (C0220t) objI : null;
        if (c0220t != null) {
            return c0220t.f3221F;
        }
        return null;
    }
}
