package A;

import D0.C0096n;
import D0.EnumC0097o;
import J0.AbstractC0283f;
import J0.InterfaceC0289l;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import p223x.C1431u;
import p232y.C1452f;
import p232y.C1470y;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends T implements B0.d, J0.y0, InterfaceC0289l {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1452f f135P;
    public C0037p Q;
    public final C0.d R;
    public final D0 S;
    public final C0037p T;
    public final b1 U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final L0 f136V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0031m f137W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public R0 f138X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public O0 f139Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0045t0 f140Z;

    public S0(C0037p c0037p, EnumC0047u0 enumC0047u0, T0 t2, B.j jVar, C1452f c1452f, boolean z10, boolean z11) {
        super(C0017f.f235w, z10, jVar, enumC0047u0);
        this.f135P = c1452f;
        this.Q = c0037p;
        C0.d dVar = new C0.d();
        this.R = dVar;
        D0 d1 = new D0();
        d1.f27F = z10;
        v0(d1);
        this.S = d1;
        C0037p c0037p2 = new C0037p(new C1431u(new p151p.V((p063g1.c) androidx.compose.foundation.gestures.a.f11799c)));
        this.T = c0037p2;
        C1452f c1452f2 = this.f135P;
        C0037p c0037p3 = this.Q;
        b1 b1Var = new b1(t2, c1452f2, c0037p3 == null ? c0037p2 : c0037p3, enumC0047u0, z11, dVar, new C0041r0(1, this));
        this.U = b1Var;
        L0 l10 = new L0(b1Var, z10);
        this.f136V = l10;
        C0031m c0031m = new C0031m(enumC0047u0, b1Var, z11);
        v0(c0031m);
        this.f137W = c0031m;
        v0(new C0.g(l10, dVar));
        v0(new p162q0.t(2, null, 4));
        H.f fVar = new H.f();
        fVar.f3126F = c0031m;
        v0(fVar);
        M0 m10 = new M0(0, this);
        p232y.A a9 = new p232y.A();
        a9.f24410F = m10;
        v0(a9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [y9.c, z9.k] */
    @Override // A.T, J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        long j10;
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) this.f142I.e((D0.v) r10.get(i10))).booleanValue()) {
                super.C(c0096n, enumC0097o, j);
                break;
            }
        }
        if (this.f143J) {
            if (enumC0097o == EnumC0097o.f1123r && c0096n.f1122d == 6) {
                if (this.f140Z == null) {
                    this.f140Z = new C0045t0(this.U, new O8.c(ViewConfiguration.get(AbstractC0283f.z(this).getContext())), new N0(2, this, S0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), AbstractC0283f.x(this).f3912P);
                }
                C0045t0 c0045t0 = this.f140Z;
                if (c0045t0 != null) {
                    InterfaceC0402u interfaceC0402uH0 = h0();
                    if (((K9.A) c0045t0.g) == null) {
                        c0045t0.g = AbstractC0405x.x(interfaceC0402uH0, null, new C0030l0(c0045t0, (p150o9.c) null, 1), 3);
                    }
                }
            }
            C0045t0 c0045t1 = this.f140Z;
            if (c0045t1 == null || enumC0097o != EnumC0097o.f1124s) {
                return;
            }
            int i11 = c0096n.f1122d;
            ?? r11 = c0096n.f1119a;
            if (i11 == 6) {
                int size2 = r11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (((D0.v) r11.get(i12)).b()) {
                        return;
                    }
                }
                O8.c cVar = (O8.c) c0045t1.f418c;
                p063g1.c cVar2 = (p063g1.c) c0045t1.f420e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) cVar.f6511r;
                int i13 = Build.VERSION.SDK_INT;
                float f3 = -(i13 > 26 ? s1.b(viewConfiguration) : cVar2.w(64));
                float f7 = -(i13 > 26 ? s1.a(viewConfiguration) : cVar2.w(64));
                p171r0.c cVar3 = new p171r0.c(0L);
                int size3 = r11.size();
                int i14 = 0;
                while (true) {
                    j10 = cVar3.f21387a;
                    if (i14 >= size3) {
                        break;
                    }
                    cVar3 = new p171r0.c(p171r0.c.h(j10, ((D0.v) r11.get(i14)).j));
                    i14++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f7)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f3)));
                b1 b1Var = (b1) c0045t1.f417b;
                float fG = b1Var.g(b1Var.e(jFloatToRawIntBits));
                if (fG == 0.0f ? false : fG > 0.0f ? b1Var.f193a.d() : b1Var.f193a.b() ? !(((M9.e) c0045t1.f421f).k(new C0026j0(jFloatToRawIntBits, ((D0.v) p120l9.m.f0(r11)).f1133b, false)) instanceof M9.k) : c0045t1.f416a) {
                    int size4 = r11.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        ((D0.v) r11.get(i15)).a();
                    }
                }
            }
        }
    }

    @Override // A.T
    public final Object C0(S s10, S s11) {
        b1 b1Var = this.U;
        Object objF = b1Var.f(p232y.T.f24455s, new C0039q(s10, b1Var, (p150o9.c) null, 3), s11);
        return objF == p161p9.a.f21156r ? objF : p110k9.y.f19095a;
    }

    @Override // A.T
    public final void E0(long j) {
        AbstractC0405x.x(this.R.c(), null, new O0(this, j, null, 0), 3);
    }

    @Override // B0.d
    public final boolean F(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f143J) {
            return false;
        }
        if ((!B0.a.a(B0.c.H(keyEvent), B0.a.f582l) && !B0.a.a(p017b7.g.C(keyEvent.getKeyCode()), B0.a.f581k)) || B0.c.O(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        EnumC0047u0 enumC0047u0 = this.U.f196d;
        EnumC0047u0 enumC0047u1 = EnumC0047u0.f424r;
        C0031m c0031m = this.f137W;
        if (enumC0047u0 == enumC0047u1) {
            int i10 = (int) (c0031m.f322M & 4294967295L);
            float f3 = B0.a.a(p017b7.g.C(keyEvent.getKeyCode()), B0.a.f581k) ? i10 : -i10;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        } else {
            int i11 = (int) (c0031m.f322M >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(B0.a.a(p017b7.g.C(keyEvent.getKeyCode()), B0.a.f581k) ? i11 : -i11);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AbstractC0405x.x(h0(), null, new O0(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // A.T
    public final boolean F0() {
        b1 b1Var = this.U;
        if (b1Var.f193a.c()) {
            return true;
        }
        C1452f c1452f = b1Var.f194b;
        if (c1452f == null) {
            return false;
        }
        C1470y c1470y = c1452f.f24505c;
        EdgeEffect edgeEffect = c1470y.f24601d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? N7.f.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1470y.f24602e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? N7.f.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1470y.f24603f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? N7.f.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1470y.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? N7.f.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void H0(C0037p c0037p, EnumC0047u0 enumC0047u0, T0 t2, B.j jVar, C1452f c1452f, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f143J != z10) {
            this.f136V.f93s = z10;
            this.S.f27F = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        C0037p c0037p2 = c0037p == null ? this.T : c0037p;
        b1 b1Var = this.U;
        if (!p251z9.j.a(b1Var.f193a, t2)) {
            b1Var.f193a = t2;
            z14 = true;
        }
        b1Var.f194b = c1452f;
        if (b1Var.f196d != enumC0047u0) {
            b1Var.f196d = enumC0047u0;
            z14 = true;
        }
        if (b1Var.f197e != z11) {
            b1Var.f197e = z11;
        } else {
            z13 = z14;
        }
        b1Var.f195c = c0037p2;
        b1Var.f198f = this.R;
        C0031m c0031m = this.f137W;
        c0031m.f315F = enumC0047u0;
        c0031m.f317H = z11;
        this.f135P = c1452f;
        this.Q = c0037p;
        C0017f c0017f = C0017f.f235w;
        EnumC0047u0 enumC0047u1 = b1Var.f196d;
        EnumC0047u0 enumC0047u2 = EnumC0047u0.f424r;
        if (enumC0047u1 != enumC0047u2) {
            enumC0047u2 = EnumC0047u0.f425s;
        }
        G0(c0017f, z10, jVar, enumC0047u2, z13);
        if (z12) {
            this.f138X = null;
            this.f139Y = null;
            AbstractC0283f.o(this);
        }
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        if (this.f143J && (this.f138X == null || this.f139Y == null)) {
            this.f138X = new R0(0, this);
            this.f139Y = new O0(this, null);
        }
        R0 r10 = this.f138X;
        if (r10 != null) {
            F9.f[] fVarArr = R0.u.f7181a;
            jVar.e(R0.i.f7087d, new R0.a(null, r10));
        }
        O0 o10 = this.f139Y;
        if (o10 != null) {
            F9.f[] fVarArr2 = R0.u.f7181a;
            jVar.e(R0.i.f7088e, o10);
        }
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // B0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        if (this.f19338E) {
            p063g1.c cVar = AbstractC0283f.x(this).f3912P;
            C0037p c0037p = this.T;
            c0037p.getClass();
            c0037p.f368a = new C1431u(new p151p.V(cVar));
        }
        C0045t0 c0045t0 = this.f140Z;
        if (c0045t0 != null) {
            c0045t0.f420e = AbstractC0283f.x(this).f3912P;
        }
    }

    @Override // A.T, l0.q
    public final void m0() {
        R();
        if (this.f19338E) {
            p063g1.c cVar = AbstractC0283f.x(this).f3912P;
            C0037p c0037p = this.T;
            c0037p.getClass();
            c0037p.f368a = new C1431u(new p151p.V(cVar));
        }
        C0045t0 c0045t0 = this.f140Z;
        if (c0045t0 != null) {
            c0045t0.f420e = AbstractC0283f.x(this).f3912P;
        }
    }

    @Override // A.T
    public final void D0(long j) {
    }
}
