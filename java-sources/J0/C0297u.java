package J0;

import H0.C0214m;

/* JADX INFO: renamed from: J0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297u extends Q {
    @Override // H0.H
    public final int H(int i10) {
        M.k kVarT = this.f3972C.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.b((j0) i11.f3914W.f4065d, i11.m(), i10);
    }

    @Override // H0.H
    public final int N(int i10) {
        M.k kVarT = this.f3972C.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.e((j0) i11.f3914W.f4065d, i11.m(), i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        M.k kVarT = this.f3972C.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.c((j0) i11.f3914W.f4065d, i11.m(), i10);
    }

    @Override // H0.H
    public final H0.U a(long j) {
        a0(j);
        j0 j0Var = this.f3972C;
        p011b0.e eVarZ = j0Var.f4125C.z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            V v10 = ((I) objArr[i11]).f3915X.f3959q;
            p251z9.j.b(v10);
            v10.f3988A = G.f3891t;
        }
        I i12 = j0Var.f4125C;
        Q.s0(this, i12.f3910N.a(this, i12.m(), j));
        return this;
    }

    @Override // H0.H
    public final int d(int i10) {
        M.k kVarT = this.f3972C.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.i((j0) i11.f3914W.f4065d, i11.m(), i10);
    }

    @Override // J0.P
    public final int h0(C0214m c0214m) {
        V v10 = this.f3972C.f4125C.f3915X.f3959q;
        p251z9.j.b(v10);
        J j = v10.f3997J;
        if (!v10.f3989B) {
            M m10 = v10.f4004w;
            if (m10.f3948d == E.f3883s) {
                j.f3939f = true;
                if (j.f3935b) {
                    m10.f3950f = true;
                    m10.g = true;
                }
            } else {
                j.g = true;
            }
        }
        C0297u c0297u = v10.o().f4179e0;
        if (c0297u != null) {
            c0297u.f3970y = true;
        }
        v10.r();
        C0297u c0297u2 = v10.o().f4179e0;
        if (c0297u2 != null) {
            c0297u2.f3970y = false;
        }
        Integer num = (Integer) j.f3941i.get(c0214m);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f3977H.g(iIntValue, c0214m);
        return iIntValue;
    }

    @Override // J0.Q
    public final void t0() {
        V v10 = this.f3972C.f4125C.f3915X.f3959q;
        p251z9.j.b(v10);
        v10.l0();
    }
}
