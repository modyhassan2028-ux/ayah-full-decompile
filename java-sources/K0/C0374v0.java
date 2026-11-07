package K0;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import p180s0.C1300i;

/* JADX INFO: renamed from: K0.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374v0 implements J0.q0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5177A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f5181E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p180s0.F f5183G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f5184H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5185I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f5187K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p205v0.b f5189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p180s0.v f5190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AndroidComposeView f5191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p241y9.e f5192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p241y9.a f5193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5195x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float[] f5197z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f5196y = p180s0.A.a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p063g1.c f5178B = p050e8.b.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p063g1.m f5179C = p063g1.m.f16261r;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p196u0.b f5180D = new p196u0.b();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f5182F = p180s0.M.f21814b;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5186J = true;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final A.M0 f5188L = new A.M0(17, this);

    public C0374v0(p205v0.b bVar, p180s0.v vVar, AndroidComposeView androidComposeView, p241y9.e eVar, p241y9.a aVar) {
        this.f5189r = bVar;
        this.f5190s = vVar;
        this.f5191t = androidComposeView;
        this.f5192u = eVar;
        this.f5193v = aVar;
        long j = Integer.MAX_VALUE;
        this.f5194w = (j & 4294967295L) | (j << 32);
    }

    @Override // J0.q0
    public final long a(long j, boolean z10) {
        float[] fArrM;
        if (z10) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.f5186J ? j : p180s0.A.b(j, fArrM);
    }

    @Override // J0.q0
    public final void b(p180s0.o oVar, p205v0.b bVar) {
        h();
        this.f5187K = this.f5189r.f23004a.E() > 0.0f;
        p196u0.b bVar2 = this.f5180D;
        p074h0.i iVar = bVar2.f22795s;
        iVar.G(oVar);
        iVar.f16423t = bVar;
        p171r0.h.d(bVar2, this.f5189r);
    }

    @Override // J0.q0
    public final void c(p241y9.e eVar, p241y9.a aVar) {
        p180s0.v vVar = this.f5190s;
        if (vVar == null) {
            throw android.support.v4.media.session.p.s("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f5189r.f23020s) {
            G0.a.a("layer should have been released before reuse");
        }
        this.f5189r = vVar.b();
        this.f5195x = false;
        this.f5192u = eVar;
        this.f5193v = aVar;
        this.f5184H = false;
        this.f5185I = false;
        this.f5186J = true;
        p180s0.A.d(this.f5196y);
        float[] fArr = this.f5197z;
        if (fArr != null) {
            p180s0.A.d(fArr);
        }
        this.f5182F = p180s0.M.f21814b;
        this.f5187K = false;
        long j = Integer.MAX_VALUE;
        this.f5194w = (j & 4294967295L) | (j << 32);
        this.f5183G = null;
        this.f5181E = 0;
    }

    @Override // J0.q0
    public final void d(long j) {
        if (p063g1.l.a(j, this.f5194w)) {
            return;
        }
        this.f5194w = j;
        if (this.f5177A || this.f5195x) {
            return;
        }
        AndroidComposeView androidComposeView = this.f5191t;
        androidComposeView.invalidate();
        if (true != this.f5177A) {
            this.f5177A = true;
            androidComposeView.B(this, true);
        }
    }

    @Override // J0.q0
    public final void destroy() {
        this.f5192u = null;
        this.f5193v = null;
        this.f5195x = true;
        boolean z10 = this.f5177A;
        AndroidComposeView androidComposeView = this.f5191t;
        if (z10) {
            this.f5177A = false;
            androidComposeView.B(this, false);
        }
        p180s0.v vVar = this.f5190s;
        if (vVar != null) {
            vVar.a(this.f5189r);
            androidComposeView.K(this);
        }
    }

    @Override // J0.q0
    public final void e(float[] fArr) {
        p180s0.A.e(fArr, m());
    }

    @Override // J0.q0
    public final void f(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            p180s0.A.e(fArr, fArrL);
        }
    }

    @Override // J0.q0
    public final void g(long j) {
        p205v0.b bVar = this.f5189r;
        if (!p063g1.j.a(bVar.f23021t, j)) {
            bVar.f23021t = j;
            bVar.f23004a.B((int) (j >> 32), (int) (j & 4294967295L), bVar.f23022u);
        }
        int i10 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.f5191t;
        if (i10 >= 26) {
            s1.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // J0.q0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // J0.q0
    public final void h() {
        if (this.f5177A) {
            if (!p180s0.M.a(this.f5182F, p180s0.M.f21814b) && !p063g1.l.a(this.f5189r.f23022u, this.f5194w)) {
                p205v0.b bVar = this.f5189r;
                float fB = p180s0.M.b(this.f5182F) * ((int) (this.f5194w >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p180s0.M.c(this.f5182F) * ((int) (this.f5194w & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!p171r0.c.b(bVar.f23023v, jFloatToRawIntBits)) {
                    bVar.f23023v = jFloatToRawIntBits;
                    bVar.f23004a.I(jFloatToRawIntBits);
                }
            }
            p205v0.b bVar2 = this.f5189r;
            p063g1.c cVar = this.f5178B;
            p063g1.m mVar = this.f5179C;
            long j = this.f5194w;
            long j10 = bVar2.f23022u;
            p205v0.d dVar = bVar2.f23004a;
            if (!p063g1.l.a(j10, j)) {
                bVar2.f23022u = j;
                long j11 = bVar2.f23021t;
                dVar.B((int) (j11 >> 32), (int) (4294967295L & j11), j);
                if (bVar2.f23011i == 9205357640488583168L) {
                    bVar2.g = true;
                    bVar2.a();
                }
            }
            bVar2.f23005b = cVar;
            bVar2.f23006c = mVar;
            bVar2.f23007d = this.f5188L;
            dVar.s(cVar, mVar, bVar2, bVar2.f23008e);
            if (this.f5177A) {
                this.f5177A = false;
                this.f5191t.B(this, false);
            }
        }
    }

    @Override // J0.q0
    public final void i(p171r0.b bVar, boolean z10) {
        float[] fArrL = z10 ? l() : m();
        if (this.f5186J) {
            return;
        }
        if (fArrL != null) {
            p180s0.A.c(fArrL, bVar);
            return;
        }
        bVar.f21383a = 0.0f;
        bVar.f21384b = 0.0f;
        bVar.f21385c = 0.0f;
        bVar.f21386d = 0.0f;
    }

    @Override // J0.q0
    public final void invalidate() {
        if (this.f5177A || this.f5195x) {
            return;
        }
        AndroidComposeView androidComposeView = this.f5191t;
        androidComposeView.invalidate();
        if (true != this.f5177A) {
            this.f5177A = true;
            androidComposeView.B(this, true);
        }
    }

    @Override // J0.q0
    public final boolean j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        p205v0.b bVar = this.f5189r;
        if (bVar.f23024w) {
            return P.m(bVar.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // J0.q0
    public final void k(p180s0.G g) {
        p241y9.a aVar;
        p241y9.a aVar2;
        int i10 = g.f21787r | this.f5181E;
        this.f5179C = g.f21785H;
        this.f5178B = g.f21784G;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f5182F = g.f21780C;
        }
        if ((i10 & 1) != 0) {
            p205v0.b bVar = this.f5189r;
            float f3 = g.f21788s;
            p205v0.d dVar = bVar.f23004a;
            if (dVar.a() != f3) {
                dVar.i(f3);
            }
        }
        if ((i10 & 2) != 0) {
            p205v0.b bVar2 = this.f5189r;
            float f7 = g.f21789t;
            p205v0.d dVar2 = bVar2.f23004a;
            if (dVar2.F() != f7) {
                dVar2.l(f7);
            }
        }
        if ((i10 & 4) != 0) {
            this.f5189r.f(g.f21790u);
        }
        if ((i10 & 8) != 0) {
            p205v0.b bVar3 = this.f5189r;
            float f10 = g.f21791v;
            p205v0.d dVar3 = bVar3.f23004a;
            if (dVar3.u() != f10) {
                dVar3.k(f10);
            }
        }
        if ((i10 & 16) != 0) {
            p205v0.b bVar4 = this.f5189r;
            float f11 = g.f21792w;
            p205v0.d dVar4 = bVar4.f23004a;
            if (dVar4.o() != f11) {
                dVar4.h(f11);
            }
        }
        boolean z10 = true;
        if ((i10 & 32) != 0) {
            p205v0.b bVar5 = this.f5189r;
            float f12 = g.f21793x;
            p205v0.d dVar5 = bVar5.f23004a;
            if (dVar5.E() != f12) {
                dVar5.b(f12);
                bVar5.g = true;
                bVar5.a();
            }
            if (g.f21793x > 0.0f && !this.f5187K && (aVar2 = this.f5193v) != null) {
                aVar2.invoke();
            }
        }
        if ((i10 & 64) != 0) {
            p205v0.b bVar6 = this.f5189r;
            long j = g.f21794y;
            p205v0.d dVar6 = bVar6.f23004a;
            if (!p180s0.q.c(j, dVar6.J())) {
                dVar6.q(j);
            }
        }
        if ((i10 & 128) != 0) {
            p205v0.b bVar7 = this.f5189r;
            long j10 = g.f21795z;
            p205v0.d dVar7 = bVar7.f23004a;
            if (!p180s0.q.c(j10, dVar7.p())) {
                dVar7.z(j10);
            }
        }
        if ((i10 & 1024) != 0) {
            p205v0.b bVar8 = this.f5189r;
            float f13 = g.f21778A;
            p205v0.d dVar8 = bVar8.f23004a;
            if (dVar8.G() != f13) {
                dVar8.f(f13);
            }
        }
        if ((i10 & 256) != 0) {
            p205v0.d dVar9 = this.f5189r.f23004a;
            if (dVar9.x() != 0.0f) {
                dVar9.d();
            }
        }
        if ((i10 & 512) != 0) {
            p205v0.d dVar10 = this.f5189r.f23004a;
            if (dVar10.D() != 0.0f) {
                dVar10.g();
            }
        }
        if ((i10 & 2048) != 0) {
            p205v0.b bVar9 = this.f5189r;
            float f14 = g.f21779B;
            p205v0.d dVar11 = bVar9.f23004a;
            if (dVar11.t() != f14) {
                dVar11.m(f14);
            }
        }
        if (i11 != 0) {
            if (p180s0.M.a(this.f5182F, p180s0.M.f21814b)) {
                p205v0.b bVar10 = this.f5189r;
                if (!p171r0.c.b(bVar10.f23023v, 9205357640488583168L)) {
                    bVar10.f23023v = 9205357640488583168L;
                    bVar10.f23004a.I(9205357640488583168L);
                }
            } else {
                p205v0.b bVar11 = this.f5189r;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p180s0.M.c(this.f5182F) * ((int) (this.f5194w & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(p180s0.M.b(this.f5182F) * ((int) (this.f5194w >> 32)))) << 32);
                if (!p171r0.c.b(bVar11.f23023v, jFloatToRawIntBits)) {
                    bVar11.f23023v = jFloatToRawIntBits;
                    bVar11.f23004a.I(jFloatToRawIntBits);
                }
            }
        }
        if ((i10 & 16384) != 0) {
            p205v0.b bVar12 = this.f5189r;
            boolean z11 = g.f21782E;
            if (bVar12.f23024w != z11) {
                bVar12.f23024w = z11;
                bVar12.g = true;
                bVar12.a();
            }
        }
        if ((131072 & i10) != 0) {
            p205v0.d dVar12 = this.f5189r.f23004a;
        }
        if ((32768 & i10) != 0) {
            p205v0.d dVar13 = this.f5189r.f23004a;
            if (dVar13.w() != 0) {
                dVar13.y(0);
            }
        }
        if ((i10 & 7963) != 0) {
            this.f5184H = true;
            this.f5185I = true;
        }
        if (p251z9.j.a(this.f5183G, g.f21786I)) {
            z10 = false;
        } else {
            p180s0.F f15 = g.f21786I;
            this.f5183G = f15;
            if (f15 != null) {
                p205v0.b bVar13 = this.f5189r;
                if (f15 instanceof p180s0.C) {
                    p171r0.e eVar = ((p180s0.C) f15).f21771e;
                    float f16 = eVar.f21389a;
                    float f17 = eVar.f21390b;
                    bVar13.g((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), (((long) Float.floatToRawIntBits(eVar.f21391c - f16)) << 32) | (((long) Float.floatToRawIntBits(eVar.f21392d - f17)) & 4294967295L), 0.0f);
                } else if (f15 instanceof p180s0.B) {
                    p180s0.E e10 = ((p180s0.B) f15).f21770e;
                    bVar13.f23012k = null;
                    bVar13.f23011i = 9205357640488583168L;
                    bVar13.f23010h = 0L;
                    bVar13.j = 0.0f;
                    bVar13.g = true;
                    bVar13.f23015n = false;
                    bVar13.f23013l = e10;
                    bVar13.a();
                } else if (f15 instanceof p180s0.D) {
                    p180s0.D d5 = (p180s0.D) f15;
                    C1300i c1300i = d5.f21773f;
                    if (c1300i != null) {
                        bVar13.f23012k = null;
                        bVar13.f23011i = 9205357640488583168L;
                        bVar13.f23010h = 0L;
                        bVar13.j = 0.0f;
                        bVar13.g = true;
                        bVar13.f23015n = false;
                        bVar13.f23013l = c1300i;
                        bVar13.a();
                    } else {
                        p171r0.g gVar = d5.f21772e;
                        bVar13.g((((long) Float.floatToRawIntBits(gVar.f21393a)) << 32) | (((long) Float.floatToRawIntBits(gVar.f21394b)) & 4294967295L), (((long) Float.floatToRawIntBits(gVar.b())) << 32) | (((long) Float.floatToRawIntBits(gVar.a())) & 4294967295L), Float.intBitsToFloat((int) (gVar.f21399h >> 32)));
                    }
                }
                if ((f15 instanceof p180s0.B) && Build.VERSION.SDK_INT < 33 && (aVar = this.f5193v) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f5181E = g.f21787r;
        if (i10 != 0 || z10) {
            int i12 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.f5191t;
            if (i12 >= 26) {
                s1.a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.f5197z;
        if (fArrA == null) {
            fArrA = p180s0.A.a();
            this.f5197z = fArrA;
        }
        if (this.f5185I) {
            this.f5185I = false;
            float[] fArrM = m();
            if (this.f5186J) {
                return fArrM;
            }
            if (!P.j(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z10 = this.f5184H;
        float[] fArr = this.f5196y;
        if (z10) {
            p205v0.b bVar = this.f5189r;
            long jD = bVar.f23023v;
            p205v0.d dVar = bVar.f23004a;
            if ((9223372034707292159L & jD) == 9205357640488583168L) {
                jD = p171r0.j.d(B9.a.d0(this.f5194w));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
            float fU = dVar.u();
            float fO = dVar.o();
            float fX = dVar.x();
            float fD = dVar.D();
            float fG = dVar.G();
            float fA = dVar.a();
            float F10 = dVar.F();
            double d5 = ((double) fX) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d5);
            float fCos = (float) Math.cos(d5);
            float f3 = -fSin;
            float f7 = (fO * fCos) - (1.0f * fSin);
            float f10 = (1.0f * fCos) + (fO * fSin);
            double d9 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d9);
            float fCos2 = (float) Math.cos(d9);
            float f11 = -fSin2;
            float f12 = fSin * fSin2;
            float f13 = fSin * fCos2;
            float f14 = fCos * fSin2;
            float f15 = fCos * fCos2;
            float f16 = (f10 * fSin2) + (fU * fCos2);
            float f17 = (f10 * fCos2) + ((-fU) * fSin2);
            double d10 = ((double) fG) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d10);
            float fCos3 = (float) Math.cos(d10);
            float f18 = -fSin3;
            float f19 = (fCos3 * f12) + (f18 * fCos2);
            float f20 = (f12 * fSin3) + (fCos2 * fCos3);
            float f21 = fSin3 * fCos;
            float f22 = f20 * fA;
            float f23 = f21 * fA;
            float f24 = ((fSin3 * f13) + (fCos3 * f11)) * fA;
            float f25 = f19 * F10;
            float f26 = fCos * fCos3 * F10;
            float f27 = ((fCos3 * f13) + (f18 * f11)) * F10;
            float f28 = f14 * 1.0f;
            float f29 = f3 * 1.0f;
            float f30 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f16 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f7 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f17;
                fArr[15] = 1.0f;
            }
            this.f5184H = false;
            this.f5186J = p180s0.F.n(fArr);
        }
        return fArr;
    }
}
