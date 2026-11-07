package p214w;

import D.J;
import H0.H;
import H0.K;
import H0.U;
import Z.X;
import androidx.compose.animation.a;
import p063g1.l;
import p120l9.s;
import p223x.j0;
import p223x.k0;

/* JADX INFO: renamed from: w.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1399l extends J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public k0 f23510G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public X f23511H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1401n f23512I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f23513J;

    @Override // D.J, J0.InterfaceC0302z
    public final H0.J e(K k7, H h7, long j) {
        long j10;
        U uA = h7.a(j);
        if (k7.t()) {
            j10 = (((long) uA.f3168r) << 32) | (((long) uA.f3169s) & 4294967295L);
        } else {
            k0 k0Var = this.f23510G;
            if (k0Var == null) {
                j10 = (((long) uA.f3168r) << 32) | (((long) uA.f3169s) & 4294967295L);
                this.f23513J = j10;
            } else {
                long j11 = (((long) uA.f3169s) & 4294967295L) | (((long) uA.f3168r) << 32);
                j0 j0VarA = k0Var.a(new C1398k(this, j11, 0), new C1398k(this, j11, 1));
                this.f23512I.f23521e = j0VarA;
                j10 = ((l) j0VarA.getValue()).f16260a;
                this.f23513J = ((l) j0VarA.getValue()).f16260a;
            }
        }
        return k7.g0((int) (j10 >> 32), (int) (4294967295L & j10), s.f19441r, new C1397j(this, uA, j10));
    }

    @Override // l0.q
    public final void p0() {
        this.f23513J = a.f11739a;
    }
}
