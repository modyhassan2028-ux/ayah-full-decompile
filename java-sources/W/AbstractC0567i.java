package W;

import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: W.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0567i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9166a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9167b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9168c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f9169d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D.P f9170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D.P f9171f;
    public static final D.P g;

    static {
        float f3 = 24;
        f9170e = new D.P(f3, f3, f3, f3);
        float f7 = 16;
        androidx.compose.foundation.layout.b.b(0.0f, f7, 7);
        f9171f = androidx.compose.foundation.layout.b.b(0.0f, f7, 7);
        g = androidx.compose.foundation.layout.b.b(0.0f, f3, 7);
    }

    public static final void a(p074h0.d dVar, l0.r rVar, p241y9.e eVar, p241y9.e eVar2, p180s0.J j, long j10, float f3, long j11, long j12, long j13, long j14, C0698o c0698o, int i10) {
        l0.r rVar2;
        c0698o.V(1522575799);
        int i11 = i10 | 48 | (c0698o.i(null) ? 256 : 128) | (c0698o.i(eVar) ? 2048 : 1024) | (c0698o.i(eVar2) ? 16384 : 8192) | (c0698o.g(j) ? 131072 : 65536) | (c0698o.f(j10) ? 1048576 : 524288) | (c0698o.d(f3) ? 8388608 : 4194304) | (c0698o.f(j11) ? 67108864 : 33554432) | (c0698o.f(j12) ? 536870912 : 268435456);
        int i12 = (c0698o.f(j13) ? (char) 4 : (char) 2) | (c0698o.f(j14) ? ' ' : (char) 16);
        if ((i11 & 306783379) == 306783378 && (i12 & 19) == 18 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
        } else {
            p074h0.d dVarD = p074h0.j.d(-2126308228, new C0543c(eVar, eVar2, j12, j13, j14, j11, dVar), c0698o);
            int i13 = i11 >> 12;
            int i14 = (i13 & 896) | (i13 & 112) | 12582918 | ((i11 >> 9) & 57344);
            l0.o oVar = l0.o.f19333a;
            C1.a(oVar, j, j10, 0L, f3, 0.0f, null, dVarD, c0698o, i14, 104);
            rVar2 = oVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0547d(dVar, rVar2, eVar, eVar2, j, j10, f3, j11, j12, j13, j14, i10);
        }
    }

    public static final void b(p074h0.d dVar, C0698o c0698o, int i10) {
        c0698o.V(586821353);
        if ((i10 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new q2(2);
                c0698o.e0(objH);
            }
            H0.I i11 = (H0.I) objH;
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, l0.o.f19333a);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, i11, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar.invoke(c0698o, 6);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.Z(dVar, i10, 1);
        }
    }

    public static final void c(p241y9.a aVar, p074h0.d dVar, l0.r rVar, p241y9.e eVar, p241y9.e eVar2, p241y9.e eVar3, p180s0.J j, long j10, long j11, long j12, long j13, float f3, p104k1.n nVar, C0698o c0698o, int i10, int i11) {
        int i12;
        p074h0.d dVar2;
        p241y9.e eVar4;
        int i13;
        c0698o.V(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            dVar2 = dVar;
            i12 |= c0698o.i(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            eVar4 = eVar;
            i12 |= c0698o.i(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.i(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.i(eVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0698o.i(eVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0698o.g(j) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0698o.f(j10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0698o.f(j11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0698o.f(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0698o.f(j13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c0698o.d(f3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0698o.g(nVar) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
        } else {
            d(aVar, rVar, nVar, p074h0.j.d(-1852840226, new C0555f(eVar2, eVar3, j, j10, f3, j11, j12, j13, eVar4, dVar2), c0698o), c0698o, (i12 & 14) | 3072 | ((i12 >> 3) & 112) | ((i14 >> 3) & 896));
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0559g(aVar, dVar, rVar, eVar, eVar2, eVar3, j, j10, j11, j12, j13, f3, nVar, i10, i11, 0);
        }
    }

    public static final void d(p241y9.a aVar, l0.r rVar, p104k1.n nVar, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1922902937);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.i(dVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
        } else {
            AbstractC0813f2.a(aVar, nVar, p074h0.j.d(905289008, new O.F(rVar, dVar), c0698o), c0698o, ((i11 >> 3) & 112) | (i11 & 14) | 384);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0563h(aVar, rVar, nVar, dVar, i10);
        }
    }
}
