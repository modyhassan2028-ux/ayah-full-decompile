package p152p0;

import D.C0082z;
import H0.C0210i;
import H0.H;
import H0.J;
import H0.K;
import H0.U;
import H0.a0;
import J0.InterfaceC0293p;
import J0.InterfaceC0302z;
import J0.P;
import l0.e;
import l0.q;
import p063g1.a;
import p120l9.s;
import p151p.V;
import p171r0.i;
import p180s0.C1303l;
import p215w0.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements InterfaceC0302z, InterfaceC0293p {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f20816F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20817G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e f20818H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0210i f20819I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f20820J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1303l f20821K;

    public static boolean w0(long j) {
        return !i.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean x0(long j) {
        return !i.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // J0.InterfaceC0302z
    public final int a(P p10, H h7, int i10) {
        if (!v0()) {
            return h7.N(i10);
        }
        long jY0 = y0(p063g1.b.b(0, i10, 7));
        return Math.max(a.j(jY0), h7.N(i10));
    }

    @Override // J0.InterfaceC0302z
    public final int c(P p10, H h7, int i10) {
        if (!v0()) {
            return h7.d(i10);
        }
        long jY0 = y0(p063g1.b.b(i10, 0, 13));
        return Math.max(a.i(jY0), h7.d(i10));
    }

    @Override // J0.InterfaceC0302z
    public final int d(P p10, H h7, int i10) {
        if (!v0()) {
            return h7.H(i10);
        }
        long jY0 = y0(p063g1.b.b(0, i10, 7));
        return Math.max(a.j(jY0), h7.H(i10));
    }

    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        U uA = h7.a(y0(j));
        return k7.g0(uA.f3168r, uA.f3169s, s.f19441r, new C0082z(uA, 10));
    }

    @Override // J0.InterfaceC0302z
    public final int f(P p10, H h7, int i10) {
        if (!v0()) {
            return h7.P(i10);
        }
        long jY0 = y0(p063g1.b.b(i10, 0, 13));
        return Math.max(a.i(jY0), h7.P(i10));
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // J0.InterfaceC0293p
    public final void r(J0.K k7) {
        p196u0.b bVar = k7.f3942r;
        long jD = this.f20816F.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (bVar.f22795s.v() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(w0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (bVar.f22795s.v() & 4294967295L)))) & 4294967295L);
        long jF = (Float.intBitsToFloat((int) (bVar.f22795s.v() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.f22795s.v() & 4294967295L)) == 0.0f) ? 0L : a0.f(jFloatToRawIntBits, this.f20819I.a(jFloatToRawIntBits, bVar.f22795s.v()));
        long jA = this.f20818H.a((((long) Math.round(Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jF & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.f22795s.v() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.f22795s.v() & 4294967295L)))) & 4294967295L), k7.getLayoutDirection());
        float f3 = (int) (jA >> 32);
        float f7 = (int) (jA & 4294967295L);
        ((V) bVar.f22795s.f16422s).x(f3, f7);
        try {
            this.f20816F.c(k7, jF, this.f20820J, this.f20821K);
            ((V) bVar.f22795s.f16422s).x(-f3, -f7);
            k7.a();
        } catch (Throwable th) {
            ((V) bVar.f22795s.f16422s).x(-f3, -f7);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f20816F + ", sizeToIntrinsics=" + this.f20817G + ", alignment=" + this.f20818H + ", alpha=" + this.f20820J + ", colorFilter=" + this.f20821K + ')';
    }

    public final boolean v0() {
        return this.f20817G && this.f20816F.d() != 9205357640488583168L;
    }

    public final long y0(long j) {
        boolean z10 = false;
        boolean z11 = a.d(j) && a.c(j);
        if (a.f(j) && a.e(j)) {
            z10 = true;
        }
        if ((!v0() && z11) || z10) {
            return a.a(j, a.h(j), 0, a.g(j), 0, 10);
        }
        long jD = this.f20816F.d();
        int iRound = x0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : a.j(j);
        int iRound2 = w0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : a.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p063g1.b.f(j, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(p063g1.b.g(j, iRound))) << 32);
        if (v0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!x0(this.f20816F.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f20816F.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!w0(this.f20816F.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f20816F.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : a0.f(jFloatToRawIntBits2, this.f20819I.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return a.a(j, p063g1.b.g(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, p063g1.b.f(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }
}
