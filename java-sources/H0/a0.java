package H0;

import A.C0041r0;
import A.I0;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import J0.j0;
import Z.C0672b;
import Z.C0690k;
import Z.C0694m;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0210i f3183a = new C0210i(2);

    public static final void a(d0 d0Var, l0.r rVar, p241y9.e eVar, C0698o c0698o, int i10) {
        c0698o.V(-511989831);
        int i11 = (c0698o.i(d0Var) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | (c0698o.i(eVar) ? 256 : 128);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            int i12 = c0698o.f10721P;
            C0694m c0694mT = C0672b.t(c0698o);
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            C0286i c0286i = C0286i.f4104t;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, d0Var, d0Var.f3191c);
            C0672b.v(c0698o, c0694mT, d0Var.f3192d);
            C0672b.v(c0698o, eVar, d0Var.f3193e);
            InterfaceC0288k.f4142a.getClass();
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            c0698o.p(true);
            if (c0698o.x()) {
                c0698o.T(-26267397);
                c0698o.p(false);
            } else {
                c0698o.T(-26326018);
                boolean zI = c0698o.i(d0Var);
                Object objH = c0698o.H();
                if (zI || objH == C0690k.f10683a) {
                    objH = new C0041r0(6, d0Var);
                    c0698o.e0(objH);
                }
                C0672b.h((p241y9.a) objH, c0698o);
                c0698o.p(false);
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I0(d0Var, rVar, eVar, i10, 1);
        }
    }

    public static final p171r0.e b(InterfaceC0219s interfaceC0219s) {
        InterfaceC0219s interfaceC0219sJ = interfaceC0219s.j();
        return interfaceC0219sJ != null ? interfaceC0219sJ.J(interfaceC0219s, true) : new p171r0.e(0.0f, 0.0f, (int) (interfaceC0219s.F() >> 32), (int) (interfaceC0219s.F() & 4294967295L));
    }

    public static final p171r0.e c(InterfaceC0219s interfaceC0219s) {
        InterfaceC0219s interfaceC0219sD = d(interfaceC0219s);
        float F10 = (int) (interfaceC0219sD.F() >> 32);
        float F11 = (int) (interfaceC0219sD.F() & 4294967295L);
        p171r0.e eVarJ = interfaceC0219sD.J(interfaceC0219s, true);
        float f3 = eVarJ.f21389a;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > F10) {
            f3 = F10;
        }
        float f7 = eVarJ.f21390b;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > F11) {
            f7 = F11;
        }
        float f10 = eVarJ.f21391c;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 <= F10) {
            F10 = f10;
        }
        float f11 = eVarJ.f21392d;
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        if (f12 <= F11) {
            F11 = f12;
        }
        if (f3 == F10 || f7 == F11) {
            return p171r0.e.f21388e;
        }
        long jH = interfaceC0219sD.h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
        long jH2 = interfaceC0219sD.h((((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(F10)) << 32));
        long jH3 = interfaceC0219sD.h((((long) Float.floatToRawIntBits(F10)) << 32) | (((long) Float.floatToRawIntBits(F11)) & 4294967295L));
        long jH4 = interfaceC0219sD.h((((long) Float.floatToRawIntBits(F11)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jH4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & jH3));
        return new p171r0.e(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final InterfaceC0219s d(InterfaceC0219s interfaceC0219s) {
        InterfaceC0219s interfaceC0219s2;
        InterfaceC0219s interfaceC0219sJ = interfaceC0219s.j();
        while (true) {
            InterfaceC0219s interfaceC0219s3 = interfaceC0219sJ;
            interfaceC0219s2 = interfaceC0219s;
            interfaceC0219s = interfaceC0219s3;
            if (interfaceC0219s == null) {
                break;
            }
            interfaceC0219sJ = interfaceC0219s.j();
        }
        j0 j0Var = interfaceC0219s2 instanceof j0 ? (j0) interfaceC0219s2 : null;
        if (j0Var == null) {
            return interfaceC0219s2;
        }
        j0 j0Var2 = j0Var.f4127E;
        while (true) {
            j0 j0Var3 = j0Var2;
            j0 j0Var4 = j0Var;
            j0Var = j0Var3;
            if (j0Var == null) {
                return j0Var4;
            }
            j0Var2 = j0Var.f4127E;
        }
    }

    public static final J0.Q e(J0.Q q10) {
        J0.I i10 = q10.f3972C.f4125C;
        while (true) {
            J0.I iU = i10.u();
            J0.I i11 = null;
            if ((iU != null ? iU.f3932y : null) == null) {
                J0.Q qC0 = ((j0) i10.f3914W.f4065d).C0();
                p251z9.j.b(qC0);
                return qC0;
            }
            J0.I iU2 = i10.u();
            if (iU2 != null) {
                i11 = iU2.f3932y;
            }
            p251z9.j.b(i11);
            J0.I iU3 = i10.u();
            p251z9.j.b(iU3);
            i10 = iU3.f3932y;
            p251z9.j.b(i10);
        }
    }

    public static final long f(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
