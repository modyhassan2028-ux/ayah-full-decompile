package W;

import A.EnumC0047u0;
import D.AbstractC0071n;
import D0.C0096n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import X.AbstractC0632d;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: W.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9354a = Y.o.f10222d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9356c;

    static {
        float f3 = Y.o.f10221c;
        f9355b = f3;
        f9356c = p185s8.u0.b(f3, Y.o.f10220b);
        float f7 = Y.o.f10219a;
    }

    public static final void a(float f3, p241y9.c cVar, l0.r rVar, boolean z10, p241y9.a aVar, C0569i1 c0569i1, B.j jVar, int i10, p074h0.d dVar, p074h0.d dVar2, E9.a aVar2, C0698o c0698o, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        c0698o.V(1191170377);
        int i13 = i11 | (c0698o.d(f3) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | 3072 | (c0698o.i(aVar) ? 16384 : 8192) | (c0698o.g(c0569i1) ? 131072 : 65536);
        char c10 = c0698o.g(aVar2) ? (char) 4 : (char) 2;
        if ((i13 & 306783379) == 306783378 && (c10 & 3) == 2 && c0698o.x()) {
            c0698o.N();
            z12 = z10;
            i12 = i10;
        } else {
            c0698o.P();
            boolean z13 = true;
            if ((i11 & 1) == 0 || c0698o.w()) {
                z11 = true;
            } else {
                c0698o.N();
                z11 = z10;
            }
            c0698o.q();
            if ((((c10 & 14) ^ 6) <= 4 || !c0698o.g(aVar2)) && (c10 & 6) != 4) {
                z13 = false;
            }
            Object objH = c0698o.H();
            if (z13 || objH == C0690k.f10683a) {
                i12 = i10;
                objH = new C0604u1(f3, i12, aVar, aVar2);
                c0698o.e0(objH);
            } else {
                i12 = i10;
            }
            C0604u1 c0604u1 = (C0604u1) objH;
            c0604u1.f9402s = aVar;
            c0604u1.f9405v = cVar;
            c0604u1.b(f3);
            b(c0604u1, rVar, z11, null, jVar, dVar, dVar2, c0698o, 1794480);
            z12 = z11;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0581m1(f3, cVar, rVar, z12, aVar, c0569i1, jVar, i12, dVar, dVar2, aVar2, i11);
        }
    }

    public static final void b(C0604u1 c0604u1, l0.r rVar, boolean z10, C0569i1 c0569i1, B.j jVar, p074h0.d dVar, p074h0.d dVar2, C0698o c0698o, int i10) {
        int i11;
        int i12;
        C0569i1 c0569i1B;
        C0569i1 c0569i2;
        c0698o.V(-1303883986);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(c0604u1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.g(jVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.i(dVar2) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && c0698o.x()) {
            c0698o.N();
            c0569i2 = c0569i1;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                C0578l1 c0578l1 = C0578l1.f9234a;
                i12 = i11 & (-7169);
                c0569i1B = C0578l1.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
            } else {
                c0698o.N();
                i12 = i11 & (-7169);
                c0569i1B = c0569i1;
            }
            c0698o.q();
            if (c0604u1.f9401r < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i13 = i12 >> 3;
            c(rVar, c0604u1, z10, jVar, dVar, dVar2, c0698o, (i12 & 896) | (i13 & 14) | ((i12 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            c0569i2 = c0569i1B;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new Ga.w(c0604u1, rVar, z10, c0569i2, jVar, dVar, dVar2, i10);
        }
    }

    public static final void c(l0.r rVar, C0604u1 c0604u1, boolean z10, B.j jVar, p074h0.d dVar, p074h0.d dVar2, C0698o c0698o, int i10) {
        int i11;
        l0.r suspendPointerInputElement;
        boolean z11;
        C0604u1 c0604u2 = c0604u1;
        c0698o.V(1390990089);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(c0604u2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(jVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(dVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(dVar2) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && c0698o.x()) {
            c0698o.N();
        } else {
            c0604u2.f9408y = c0698o.k(AbstractC0359n0.f5123n) == p063g1.m.f16262s;
            int i13 = 12;
            p150o9.c cVar = null;
            l0.o oVar = l0.o.f19333a;
            if (z10) {
                O9.y yVar = new O9.y(c0604u2, cVar, i13);
                C0096n c0096n = D0.I.f1055a;
                suspendPointerInputElement = new SuspendPointerInputElement(c0604u2, jVar, new D0.H(yVar), 4);
            } else {
                suspendPointerInputElement = oVar;
            }
            boolean z12 = c0604u2.f9408y;
            boolean zBooleanValue = ((Boolean) c0604u2.f9395B.getValue()).booleanValue();
            boolean zI = c0698o.i(c0604u2);
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (zI || objH == s10) {
                objH = new C0593q1(c0604u2, null, 0);
                c0698o.e0(objH);
            }
            l0.r rVarA = A.V.a(oVar, c0604u2, EnumC0047u0.f425s, z10, jVar, zBooleanValue, (p241y9.f) objH, z12);
            c0604u2 = c0604u2;
            Z.M0 m10 = D0.f8496a;
            l0.r rVarB = R0.m.a(androidx.compose.foundation.layout.c.i(rVar.b(MinimumInteractiveModifier.f11916a), f9355b, f9354a, 0.0f, 0.0f, 12), false, new C0595r1(0, c0604u2, z10)).b(AbstractC0632d.f9732b);
            float fG = c0604u2.f9404u.g();
            E9.a aVar = c0604u2.f9403t;
            l0.r rVarB2 = androidx.compose.foundation.a.e(R0.m.a(rVarB, true, new p232y.e0(fG, new E9.a(aVar.f1993a, aVar.f1994b), c0604u2.f9401r)), z10, jVar).b(suspendPointerInputElement).b(rVarA);
            boolean zI2 = c0698o.i(c0604u2);
            Object objH2 = c0698o.H();
            if (zI2 || objH2 == s10) {
                objH2 = new K.Y(1, c0604u2);
                c0698o.e0(objH2);
            }
            H0.I i14 = (H0.I) objH2;
            int i15 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarB2);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, i14, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o, i15, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            l0.r rVarR = androidx.compose.foundation.layout.c.r(androidx.compose.ui.layout.a.c(oVar, EnumC0572j1.f9191r), 3);
            boolean zI3 = c0698o.i(c0604u2);
            Object objH3 = c0698o.H();
            if (zI3 || objH3 == s10) {
                z11 = false;
                objH3 = new C0584n1(c0604u2, 0);
                c0698o.e0(objH3);
            } else {
                z11 = false;
            }
            l0.r rVarE = androidx.compose.ui.layout.a.e(rVarR, (p241y9.c) objH3);
            l0.j jVar2 = l0.c.f19313r;
            H0.I iD = AbstractC0071n.d(jVar2, z11);
            int i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            l0.r rVarC2 = l0.a.c(c0698o, rVarE);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                p123m2.c.y(i16, c0698o, i16, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            int i17 = (i12 >> 3) & 14;
            dVar.d(c0604u2, c0698o, Integer.valueOf(((i12 >> 9) & 112) | i17));
            c0698o.p(true);
            l0.r rVarC3 = androidx.compose.ui.layout.a.c(oVar, EnumC0572j1.f9192s);
            H0.I iD2 = AbstractC0071n.d(jVar2, false);
            int i18 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            l0.r rVarC4 = l0.a.c(c0698o, rVarC3);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i18))) {
                p123m2.c.y(i18, c0698o, i18, c0285h3);
            }
            C0672b.v(c0698o, rVarC4, c0285h4);
            dVar2.d(c0604u2, c0698o, Integer.valueOf(i17 | ((i12 >> 12) & 112)));
            c0698o.p(true);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0590p1(rVar, c0604u2, z10, jVar, dVar, dVar2, i10);
        }
    }

    public static final float d(float f3, float f7, float f10, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f11 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f11);
            } else {
                float fAbs = Math.abs(B9.a.L(f7, f10, f11) - f3);
                E9.d dVar = new E9.d(1, length, 1);
                int i10 = dVar.f1996s;
                int i11 = dVar.f1997t;
                boolean z10 = i11 <= 0 ? 1 >= i10 : 1 <= i10;
                int i12 = z10 ? 1 : i10;
                while (z10) {
                    if (i12 != i10) {
                        i12 += i11;
                    } else {
                        if (!z10) {
                            throw new NoSuchElementException();
                        }
                        z10 = false;
                        i12 = i12;
                    }
                    float f12 = fArr[i12];
                    float fAbs2 = Math.abs(B9.a.L(f7, f10, f12) - f3);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f11 = f12;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f11);
            }
        }
        return fValueOf != null ? B9.a.L(f7, f10, fValueOf.floatValue()) : f3;
    }
}
