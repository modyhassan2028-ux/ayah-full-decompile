package O;

import H0.InterfaceC0219s;
import K.t0;
import U0.C0515g;
import Z0.C0710a;
import Z0.InterfaceC0716g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f6285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U0.I f6287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.s f6288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f6289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6290f;
    public final C0515g g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z0.y f6291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t0 f6292i;

    public G(Z0.y yVar, Z0.s sVar, t0 t0Var, T t2) {
        C0515g c0515g = yVar.f10953a;
        long j = yVar.f10954b;
        U0.I i10 = t0Var != null ? t0Var.f4794a : null;
        this.f6285a = c0515g;
        this.f6286b = j;
        this.f6287c = i10;
        this.f6288d = sVar;
        this.f6289e = t2;
        this.f6290f = j;
        this.g = c0515g;
        this.f6291h = yVar;
        this.f6292i = t0Var;
    }

    public final List a(p241y9.c cVar) {
        if (!U0.K.b(this.f6290f)) {
            return p120l9.l.S(new InterfaceC0716g[]{new C0710a("", 0), new Z0.x(U0.K.e(this.f6290f), U0.K.e(this.f6290f))});
        }
        InterfaceC0716g interfaceC0716g = (InterfaceC0716g) cVar.e(this);
        if (interfaceC0716g != null) {
            return AbstractC0813f2.K(interfaceC0716g);
        }
        return null;
    }

    public final Integer b() {
        U0.I i10 = this.f6287c;
        if (i10 == null) {
            return null;
        }
        U0.p pVar = i10.f8024b;
        int iD = U0.K.d(this.f6290f);
        Z0.s sVar = this.f6288d;
        return Integer.valueOf(sVar.a(pVar.c(pVar.d(sVar.b(iD)), true)));
    }

    public final Integer c() {
        U0.I i10 = this.f6287c;
        if (i10 == null) {
            return null;
        }
        int iE = U0.K.e(this.f6290f);
        Z0.s sVar = this.f6288d;
        return Integer.valueOf(sVar.a(i10.f(i10.f8024b.d(sVar.b(iE)))));
    }

    public final Integer d() {
        int length;
        U0.I i10 = this.f6287c;
        if (i10 == null) {
            return null;
        }
        int iQ = q();
        while (true) {
            C0515g c0515g = this.f6285a;
            if (iQ < c0515g.f8060s.length()) {
                int length2 = this.g.f8060s.length() - 1;
                if (iQ <= length2) {
                    length2 = iQ;
                }
                long jI = i10.i(length2);
                int i11 = U0.K.f8034c;
                int i12 = (int) (jI & 4294967295L);
                if (i12 > iQ) {
                    length = this.f6288d.a(i12);
                    break;
                }
                iQ++;
            } else {
                length = c0515g.f8060s.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iA;
        U0.I i10 = this.f6287c;
        if (i10 == null) {
            return null;
        }
        for (int iQ = q(); iQ > 0; iQ--) {
            int length = this.g.f8060s.length() - 1;
            if (iQ <= length) {
                length = iQ;
            }
            long jI = i10.i(length);
            int i11 = U0.K.f8034c;
            int i12 = (int) (jI >> 32);
            if (i12 < iQ) {
                iA = this.f6288d.a(i12);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean f() {
        U0.I i10 = this.f6287c;
        return (i10 != null ? i10.g(q()) : null) != p055f1.j.f15910s;
    }

    public final int g(U0.I i10, int i11) {
        int iQ = q();
        T t2 = this.f6289e;
        if (t2.f6339a == null) {
            t2.f6339a = Float.valueOf(i10.c(iQ).f21389a);
        }
        U0.p pVar = i10.f8024b;
        int iD = pVar.d(iQ) + i11;
        if (iD < 0) {
            return 0;
        }
        if (iD >= pVar.f8111f) {
            return this.g.f8060s.length();
        }
        float fB = pVar.b(iD) - 1;
        Float f3 = t2.f6339a;
        p251z9.j.b(f3);
        float fFloatValue = f3.floatValue();
        if ((f() && fFloatValue >= i10.e(iD)) || (!f() && fFloatValue <= i10.d(iD))) {
            return pVar.c(iD, true);
        }
        return this.f6288d.a(pVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f3.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(t0 t0Var, int i10) {
        p171r0.e eVarJ;
        InterfaceC0219s interfaceC0219s = t0Var.f4795b;
        U0.I i11 = t0Var.f4794a;
        if (interfaceC0219s == null) {
            eVarJ = p171r0.e.f21388e;
        } else {
            InterfaceC0219s interfaceC0219s2 = t0Var.f4796c;
            eVarJ = interfaceC0219s2 != null ? interfaceC0219s2.J(interfaceC0219s, true) : null;
            if (eVarJ == null) {
                eVarJ = p171r0.e.f21388e;
            }
        }
        long j = this.f6291h.f10954b;
        int i12 = U0.K.f8034c;
        int i13 = (int) (j & 4294967295L);
        Z0.s sVar = this.f6288d;
        p171r0.e eVarC = i11.c(sVar.b(i13));
        float f3 = eVarC.f21389a;
        return sVar.a(i11.f8024b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eVarJ.c() & 4294967295L)) * i10) + eVarC.f21390b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)));
    }

    public final void i() {
        T t2 = this.f6289e;
        t2.f6339a = null;
        C0515g c0515g = this.g;
        if (c0515g.f8060s.length() > 0) {
            if (f()) {
                t2.f6339a = null;
                if (c0515g.f8060s.length() > 0) {
                    String str = c0515g.f8060s;
                    long j = this.f6290f;
                    int i10 = U0.K.f8034c;
                    int iU = K.T.u((int) (j & 4294967295L), str);
                    if (iU != -1) {
                        p(iU, iU);
                        return;
                    }
                    return;
                }
                return;
            }
            t2.f6339a = null;
            if (c0515g.f8060s.length() > 0) {
                String str2 = c0515g.f8060s;
                long j10 = this.f6290f;
                int i11 = U0.K.f8034c;
                int iR = K.T.r((int) (j10 & 4294967295L), str2);
                if (iR != -1) {
                    p(iR, iR);
                }
            }
        }
    }

    public final void j() {
        this.f6289e.f6339a = null;
        C0515g c0515g = this.g;
        String str = c0515g.f8060s;
        String str2 = c0515g.f8060s;
        if (str.length() > 0) {
            int iS = K.T.s(str2, U0.K.d(this.f6290f));
            if (iS == U0.K.d(this.f6290f) && iS != str2.length()) {
                iS = K.T.s(str2, iS + 1);
            }
            p(iS, iS);
        }
    }

    public final void k() {
        this.f6289e.f6339a = null;
        C0515g c0515g = this.g;
        String str = c0515g.f8060s;
        String str2 = c0515g.f8060s;
        if (str.length() > 0) {
            int iT = K.T.t(str2, U0.K.e(this.f6290f));
            if (iT == U0.K.e(this.f6290f) && iT != 0) {
                iT = K.T.t(str2, iT - 1);
            }
            p(iT, iT);
        }
    }

    public final void l() {
        T t2 = this.f6289e;
        t2.f6339a = null;
        C0515g c0515g = this.g;
        if (c0515g.f8060s.length() > 0) {
            if (f()) {
                t2.f6339a = null;
                if (c0515g.f8060s.length() > 0) {
                    String str = c0515g.f8060s;
                    long j = this.f6290f;
                    int i10 = U0.K.f8034c;
                    int iR = K.T.r((int) (j & 4294967295L), str);
                    if (iR != -1) {
                        p(iR, iR);
                        return;
                    }
                    return;
                }
                return;
            }
            t2.f6339a = null;
            if (c0515g.f8060s.length() > 0) {
                String str2 = c0515g.f8060s;
                long j10 = this.f6290f;
                int i11 = U0.K.f8034c;
                int iU = K.T.u((int) (j10 & 4294967295L), str2);
                if (iU != -1) {
                    p(iU, iU);
                }
            }
        }
    }

    public final void m() {
        Integer numB;
        this.f6289e.f6339a = null;
        if (this.g.f8060s.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        p(iIntValue, iIntValue);
    }

    public final void n() {
        Integer numC;
        this.f6289e.f6339a = null;
        if (this.g.f8060s.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        p(iIntValue, iIntValue);
    }

    public final void o() {
        if (this.g.f8060s.length() > 0) {
            int i10 = U0.K.f8034c;
            this.f6290f = va.g.e((int) (this.f6286b >> 32), (int) (this.f6290f & 4294967295L));
        }
    }

    public final void p(int i10, int i11) {
        this.f6290f = va.g.e(i10, i11);
    }

    public final int q() {
        long j = this.f6290f;
        int i10 = U0.K.f8034c;
        return this.f6288d.b((int) (j & 4294967295L));
    }
}
