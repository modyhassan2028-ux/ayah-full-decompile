package K0;

import D0.C0087e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import p180s0.AbstractC1295d;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements J0.q0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final InterfaceC0365q0 f4999C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f5000D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidComposeView f5001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p241y9.e f5002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p241y9.a f5003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5004u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public N9.b0 f5008y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final H0 f5005v = new H0();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0087e f5009z = new C0087e(G.f4930u);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p180s0.p f4997A = new p180s0.p();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f4998B = p180s0.M.f21814b;

    public Q0(AndroidComposeView androidComposeView, p241y9.e eVar, p241y9.a aVar) {
        this.f5001r = androidComposeView;
        this.f5002s = eVar;
        this.f5003t = aVar;
        InterfaceC0365q0 n6 = Build.VERSION.SDK_INT >= 29 ? new N0() : new M0(androidComposeView);
        n6.J();
        n6.w(false);
        this.f4999C = n6;
    }

    @Override // J0.q0
    public final long a(long j, boolean z10) {
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        C0087e c0087e = this.f5009z;
        if (!z10) {
            return !c0087e.f1096d ? p180s0.A.b(j, c0087e.c(interfaceC0365q0)) : j;
        }
        float[] fArrB = c0087e.b(interfaceC0365q0);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !c0087e.f1096d ? p180s0.A.b(j, fArrB) : j;
    }

    @Override // J0.q0
    public final void b(p180s0.o oVar, p205v0.b bVar) {
        Canvas canvasA = AbstractC1295d.a(oVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        if (zIsHardwareAccelerated) {
            h();
            boolean z10 = interfaceC0365q0.L() > 0.0f;
            this.f5007x = z10;
            if (z10) {
                oVar.t();
            }
            interfaceC0365q0.s(canvasA);
            if (this.f5007x) {
                oVar.r();
                return;
            }
            return;
        }
        float fU = interfaceC0365q0.u();
        float fT = interfaceC0365q0.t();
        float fD = interfaceC0365q0.D();
        float fP = interfaceC0365q0.p();
        if (interfaceC0365q0.c() < 1.0f) {
            N9.b0 b0VarG = this.f5008y;
            if (b0VarG == null) {
                b0VarG = p180s0.F.g();
                this.f5008y = b0VarG;
            }
            b0VarG.c(interfaceC0365q0.c());
            canvasA.saveLayer(fU, fT, fD, fP, (Paint) b0VarG.f6165b);
        } else {
            oVar.q();
        }
        oVar.m(fU, fT);
        oVar.s(this.f5009z.c(interfaceC0365q0));
        if (interfaceC0365q0.E() || interfaceC0365q0.q()) {
            this.f5005v.a(oVar);
        }
        p241y9.e eVar = this.f5002s;
        if (eVar != null) {
            eVar.invoke(oVar, null);
        }
        oVar.n();
        l(false);
    }

    @Override // J0.q0
    public final void c(p241y9.e eVar, p241y9.a aVar) {
        C0087e c0087e = this.f5009z;
        c0087e.f1093a = false;
        c0087e.f1094b = false;
        c0087e.f1096d = true;
        c0087e.f1095c = true;
        p180s0.A.d((float[]) c0087e.g);
        p180s0.A.d((float[]) c0087e.f1099h);
        l(false);
        this.f5006w = false;
        this.f5007x = false;
        this.f4998B = p180s0.M.f21814b;
        this.f5002s = eVar;
        this.f5003t = aVar;
    }

    @Override // J0.q0
    public final void d(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        float fB = p180s0.M.b(this.f4998B) * i10;
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        interfaceC0365q0.v(fB);
        interfaceC0365q0.A(p180s0.M.c(this.f4998B) * i11);
        if (interfaceC0365q0.x(interfaceC0365q0.u(), interfaceC0365q0.t(), interfaceC0365q0.u() + i10, interfaceC0365q0.t() + i11)) {
            interfaceC0365q0.H(this.f5005v.b());
            if (!this.f5004u && !this.f5006w) {
                this.f5001r.invalidate();
                l(true);
            }
            this.f5009z.e();
        }
    }

    @Override // J0.q0
    public final void destroy() {
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        if (interfaceC0365q0.n()) {
            interfaceC0365q0.j();
        }
        this.f5002s = null;
        this.f5003t = null;
        this.f5006w = true;
        l(false);
        AndroidComposeView androidComposeView = this.f5001r;
        androidComposeView.U = true;
        androidComposeView.K(this);
    }

    @Override // J0.q0
    public final void e(float[] fArr) {
        p180s0.A.e(fArr, this.f5009z.c(this.f4999C));
    }

    @Override // J0.q0
    public final void f(float[] fArr) {
        float[] fArrB = this.f5009z.b(this.f4999C);
        if (fArrB != null) {
            p180s0.A.e(fArr, fArrB);
        }
    }

    @Override // J0.q0
    public final void g(long j) {
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        int iU = interfaceC0365q0.u();
        int iT = interfaceC0365q0.t();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (iU == i10 && iT == i11) {
            return;
        }
        if (iU != i10) {
            interfaceC0365q0.o(i10 - iU);
        }
        if (iT != i11) {
            interfaceC0365q0.F(i11 - iT);
        }
        int i12 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.f5001r;
        if (i12 >= 26) {
            s1.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.f5009z.e();
    }

    @Override // J0.q0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f5009z.c(this.f4999C);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    @Override // J0.q0
    public final void h() {
        p180s0.E e10;
        boolean z10 = this.f5004u;
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        if (z10 || !interfaceC0365q0.n()) {
            if (interfaceC0365q0.E()) {
                H0 h7 = this.f5005v;
                if (h7.g) {
                    h7.e();
                    e10 = h7.f4939e;
                } else {
                    e10 = null;
                }
            } else {
                e10 = null;
            }
            p241y9.e eVar = this.f5002s;
            if (eVar != null) {
                interfaceC0365q0.C(this.f4997A, e10, new P0(eVar, 0));
            }
            l(false);
        }
    }

    @Override // J0.q0
    public final void i(p171r0.b bVar, boolean z10) {
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        C0087e c0087e = this.f5009z;
        if (!z10) {
            float[] fArrC = c0087e.c(interfaceC0365q0);
            if (c0087e.f1096d) {
                return;
            }
            p180s0.A.c(fArrC, bVar);
            return;
        }
        float[] fArrB = c0087e.b(interfaceC0365q0);
        if (fArrB != null) {
            if (c0087e.f1096d) {
                return;
            }
            p180s0.A.c(fArrB, bVar);
        } else {
            bVar.f21383a = 0.0f;
            bVar.f21384b = 0.0f;
            bVar.f21385c = 0.0f;
            bVar.f21386d = 0.0f;
        }
    }

    @Override // J0.q0
    public final void invalidate() {
        if (this.f5004u || this.f5006w) {
            return;
        }
        this.f5001r.invalidate();
        l(true);
    }

    @Override // J0.q0
    public final boolean j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        if (interfaceC0365q0.q()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) interfaceC0365q0.b()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) interfaceC0365q0.a());
        }
        if (interfaceC0365q0.E()) {
            return this.f5005v.c(j);
        }
        return true;
    }

    @Override // J0.q0
    public final void k(p180s0.G g) {
        p241y9.a aVar;
        int i10 = g.f21787r | this.f5000D;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f4998B = g.f21780C;
        }
        InterfaceC0365q0 interfaceC0365q0 = this.f4999C;
        boolean zE = interfaceC0365q0.E();
        H0 h7 = this.f5005v;
        boolean z10 = false;
        boolean z11 = zE && h7.g;
        if ((i10 & 1) != 0) {
            interfaceC0365q0.i(g.f21788s);
        }
        if ((i10 & 2) != 0) {
            interfaceC0365q0.l(g.f21789t);
        }
        if ((i10 & 4) != 0) {
            interfaceC0365q0.e(g.f21790u);
        }
        if ((i10 & 8) != 0) {
            interfaceC0365q0.k(g.f21791v);
        }
        if ((i10 & 16) != 0) {
            interfaceC0365q0.h(g.f21792w);
        }
        if ((i10 & 32) != 0) {
            interfaceC0365q0.B(g.f21793x);
        }
        if ((i10 & 64) != 0) {
            interfaceC0365q0.z(p180s0.F.u(g.f21794y));
        }
        if ((i10 & 128) != 0) {
            interfaceC0365q0.I(p180s0.F.u(g.f21795z));
        }
        if ((i10 & 1024) != 0) {
            interfaceC0365q0.f(g.f21778A);
        }
        if ((i10 & 256) != 0) {
            interfaceC0365q0.d();
        }
        if ((i10 & 512) != 0) {
            interfaceC0365q0.g();
        }
        if ((i10 & 2048) != 0) {
            interfaceC0365q0.m(g.f21779B);
        }
        if (i11 != 0) {
            interfaceC0365q0.v(p180s0.M.b(this.f4998B) * interfaceC0365q0.b());
            interfaceC0365q0.A(p180s0.M.c(this.f4998B) * interfaceC0365q0.a());
        }
        boolean z12 = g.f21782E;
        i7.B b5 = p180s0.F.f21774a;
        boolean z13 = z12 && g.f21781D != b5;
        if ((i10 & 24576) != 0) {
            interfaceC0365q0.G(z13);
            interfaceC0365q0.w(g.f21782E && g.f21781D == b5);
        }
        if ((131072 & i10) != 0) {
            interfaceC0365q0.r();
        }
        if ((32768 & i10) != 0) {
            interfaceC0365q0.y();
        }
        boolean zD = this.f5005v.d(g.f21786I, g.f21790u, z13, g.f21793x, g.f21783F);
        if (h7.f4940f) {
            interfaceC0365q0.H(h7.b());
        }
        if (z13 && h7.g) {
            z10 = true;
        }
        AndroidComposeView androidComposeView = this.f5001r;
        if (z11 != z10 || (z10 && zD)) {
            if (!this.f5004u && !this.f5006w) {
                androidComposeView.invalidate();
                l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            s1.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        if (!this.f5007x && interfaceC0365q0.L() > 0.0f && (aVar = this.f5003t) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f5009z.e();
        }
        this.f5000D = g.f21787r;
    }

    public final void l(boolean z10) {
        if (z10 != this.f5004u) {
            this.f5004u = z10;
            this.f5001r.B(this, z10);
        }
    }
}
