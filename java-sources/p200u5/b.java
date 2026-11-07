package p200u5;

import Ca.h;
import W.C1;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.X;
import androidx.compose.ui.graphics.a;
import l0.o;
import l0.r;
import p056f2.AbstractC0939l;
import p074h0.d;
import p180s0.J;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.I;
import p223x.InterfaceC1433w;
import p223x.l0;
import p223x.n0;
import p223x.q0;
import p223x.t0;
import p223x.u0;
import p223x.v0;
import p223x.w0;
import p232y.j0;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22949a = 8;

    public static final void a(r rVar, I i10, X x9, j0 j0Var, J j, long j10, float f3, float f7, d dVar, C0698o c0698o, int i11) {
        InterfaceC1433w interfaceC1433w;
        u0 u0VarQ;
        boolean z10;
        boolean z11;
        u0 u0VarQ2;
        j.e(rVar, "modifier");
        j.e(x9, "transformOriginState");
        j.e(j0Var, "scrollState");
        j.e(j, "shape");
        c0698o.V(-1602555855);
        int i12 = i11 | (c0698o.g(rVar) ? 4 : 2) | (c0698o.g(i10) ? 32 : 16) | (c0698o.g(j0Var) ? 2048 : 1024) | (c0698o.g(j) ? 16384 : 8192) | (c0698o.f(j10) ? 131072 : 65536) | (c0698o.d(f3) ? 1048576 : 524288) | (c0698o.d(f7) ? 8388608 : 4194304) | (c0698o.g(null) ? 67108864 : 33554432) | (c0698o.i(dVar) ? 536870912 : 268435456);
        if (c0698o.K(i12 & 1, (306783379 & i12) != 306783378)) {
            q0 q0VarD = t0.d(i10, "DropDownMenu", c0698o, (((i12 >> 3) & 14) | 48) & 126);
            v0 v0Var = w0.f24113a;
            AbstractC0939l abstractC0939l = q0VarD.f24065a;
            C0681f0 c0681f0 = q0VarD.f24068d;
            boolean zBooleanValue = ((Boolean) abstractC0939l.i()).booleanValue();
            c0698o.T(-1785750891);
            float f10 = zBooleanValue ? 1.0f : 0.8f;
            c0698o.p(false);
            Float fValueOf = Float.valueOf(f10);
            boolean zBooleanValue2 = ((Boolean) c0681f0.getValue()).booleanValue();
            c0698o.T(-1785750891);
            float f11 = zBooleanValue2 ? 1.0f : 0.8f;
            c0698o.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            l0 l0VarF = q0VarD.f();
            j.e(l0VarF, "$this$animateFloat");
            c0698o.T(-1507127782);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (l0VarF.b(bool, bool2)) {
                z10 = false;
                u0VarQ = AbstractC1413d.q(120, 0, AbstractC1434x.f24122b, 2);
                interfaceC1433w = null;
            } else {
                interfaceC1433w = null;
                u0VarQ = AbstractC1413d.q(1, 74, null, 4);
                z10 = false;
            }
            c0698o.p(z10);
            InterfaceC1433w interfaceC1433w2 = interfaceC1433w;
            n0 n0VarC = t0.c(q0VarD, fValueOf, fValueOf2, u0VarQ, v0Var, c0698o, 196608);
            boolean zBooleanValue3 = ((Boolean) q0VarD.f24065a.i()).booleanValue();
            c0698o.T(-1704433919);
            float f12 = zBooleanValue3 ? 1.0f : 0.0f;
            c0698o.p(false);
            Float fValueOf3 = Float.valueOf(f12);
            boolean zBooleanValue4 = ((Boolean) c0681f0.getValue()).booleanValue();
            c0698o.T(-1704433919);
            float f13 = zBooleanValue4 ? 1.0f : 0.0f;
            c0698o.p(false);
            Float fValueOf4 = Float.valueOf(f13);
            l0 l0VarF2 = q0VarD.f();
            j.e(l0VarF2, "$this$animateFloat");
            c0698o.T(-1425810810);
            if (l0VarF2.b(bool, bool2)) {
                z11 = false;
                u0VarQ2 = AbstractC1413d.q(30, 0, interfaceC1433w2, 6);
            } else {
                z11 = false;
                u0VarQ2 = AbstractC1413d.q(75, 0, interfaceC1433w2, 6);
            }
            c0698o.p(z11);
            n0 n0VarC2 = t0.c(q0VarD, fValueOf3, fValueOf4, u0VarQ2, v0Var, c0698o, 196608);
            boolean zG = c0698o.g(n0VarC) | c0698o.g(n0VarC2);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new h(x9, n0VarC, n0VarC2, 8);
                c0698o.e0(objH);
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            C1.a(a.a(o.f19333a, (c) objH), j, j10, 0L, f3, f7, null, p074h0.j.d(1904886924, new A4.a(rVar, j0Var, dVar, 15), c0698o), c0698o, (i14 & 3670016) | (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14), 8);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new a(rVar, i10, x9, j0Var, j, j10, f3, f7, dVar, i11);
        }
    }
}
