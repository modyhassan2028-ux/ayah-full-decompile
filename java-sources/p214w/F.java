package p214w;

import A.C0023i;
import D.C0082z;
import D.J;
import H0.H;
import H0.K;
import H0.U;
import androidx.compose.animation.c;
import l0.e;
import p063g1.b;
import p063g1.j;
import p063g1.l;
import p063g1.m;
import p120l9.s;
import p223x.j0;
import p223x.k0;
import p223x.q0;
import p241y9.a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public q0 f23429G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public k0 f23430H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public k0 f23431I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public k0 f23432J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public G f23433K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public H f23434L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public a f23435M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public y f23436N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f23437O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public e f23438P;
    public final E Q;
    public final E R;

    public F(q0 q0Var, k0 k0Var, k0 k0Var2, k0 k0Var3, G g, H h7, a aVar, y yVar) {
        super(1);
        this.f23429G = q0Var;
        this.f23430H = k0Var;
        this.f23431I = k0Var2;
        this.f23432J = k0Var3;
        this.f23433K = g;
        this.f23434L = h7;
        this.f23435M = aVar;
        this.f23436N = yVar;
        this.f23437O = c.f11740a;
        b.b(0, 0, 15);
        this.Q = new E(this, 0);
        this.R = new E(this, 1);
    }

    @Override // D.J, J0.InterfaceC0302z
    public final H0.J e(K k7, H h7, long j) {
        long j10;
        long j11;
        j0 j0VarA = null;
        if (this.f23429G.f24065a.i() == this.f23429G.f24068d.getValue()) {
            this.f23438P = null;
        } else if (this.f23438P == null) {
            e eVarX0 = x0();
            if (eVarX0 == null) {
                eVarX0 = l0.c.f19313r;
            }
            this.f23438P = eVarX0;
        }
        boolean zT = k7.t();
        s sVar = s.f19441r;
        if (zT) {
            U uA = h7.a(j);
            long j12 = (((long) uA.f3168r) << 32) | (((long) uA.f3169s) & 4294967295L);
            this.f23437O = j12;
            return k7.g0((int) (j12 >> 32), (int) (4294967295L & j12), sVar, new C0082z(uA, 12));
        }
        if (!((Boolean) this.f23435M.invoke()).booleanValue()) {
            U uA2 = h7.a(j);
            return k7.g0(uA2.f3168r, uA2.f3169s, sVar, new C0082z(uA2, 13));
        }
        y yVar = this.f23436N;
        k0 k0Var = yVar.f23553a;
        k0 k0Var2 = yVar.f23554b;
        q0 q0Var = yVar.f23555c;
        G g = yVar.f23556d;
        H h10 = yVar.f23557e;
        k0 k0Var3 = yVar.f23558f;
        j0 j0VarA2 = k0Var != null ? k0Var.a(new z(g, h10, 0), new z(g, h10, 1)) : null;
        j0 j0VarA3 = k0Var2 != null ? k0Var2.a(new z(g, h10, 2), new z(g, h10, 3)) : null;
        if (q0Var.f24065a.i() == x.f23549r) {
            T t2 = h10.f23443a;
        } else {
            T t10 = h10.f23443a;
        }
        C0023i c0023i = new C0023i(j0VarA2, j0VarA3, k0Var3 != null ? k0Var3.a(C1390c.f23473A, new C0023i(j0VarA, g, h10, 23)) : null, 22);
        U uA3 = h7.a(j);
        long j13 = (((long) uA3.f3169s) & 4294967295L) | (((long) uA3.f3168r) << 32);
        long j14 = !l.a(this.f23437O, c.f11740a) ? this.f23437O : j13;
        k0 k0Var4 = this.f23430H;
        if (k0Var4 != null) {
            j0VarA = k0Var4.a(this.Q, new D(this, j14, 0));
        }
        if (j0VarA != null) {
            j13 = ((l) j0VarA.getValue()).f16260a;
        }
        long jD = b.d(j, j13);
        k0 k0Var5 = this.f23431I;
        long jA = 0;
        long j15 = k0Var5 != null ? ((j) k0Var5.a(C1390c.f23476D, new D(this, j14, 1)).getValue()).f16254a : 0L;
        k0 k0Var6 = this.f23432J;
        if (k0Var6 != null) {
            j10 = ((j) k0Var6.a(this.R, new D(this, j14, 2)).getValue()).f16254a;
        } else {
            j10 = 0;
        }
        e eVar = this.f23438P;
        if (eVar != null) {
            long j16 = j14;
            j11 = j10;
            jA = eVar.a(j16, jD, m.f16261r);
        } else {
            j11 = j10;
        }
        return k7.g0((int) (jD >> 32), (int) (jD & 4294967295L), sVar, new C(uA3, j.c(jA, j11), j15, c0023i, 0));
    }

    @Override // l0.q
    public final void l0() {
        this.f23437O = c.f11740a;
    }

    public final e x0() {
        if (this.f23429G.f().b(x.f23549r, x.f23550s)) {
            C1406t c1406t = this.f23433K.f23440a.f23467c;
            if (c1406t != null) {
                return c1406t.f23535a;
            }
            C1406t c1406t2 = this.f23434L.f23443a.f23467c;
            if (c1406t2 != null) {
                return c1406t2.f23535a;
            }
            return null;
        }
        C1406t c1406t3 = this.f23434L.f23443a.f23467c;
        if (c1406t3 != null) {
            return c1406t3.f23535a;
        }
        C1406t c1406t4 = this.f23433K.f23440a.f23467c;
        if (c1406t4 != null) {
            return c1406t4.f23535a;
        }
        return null;
    }
}
