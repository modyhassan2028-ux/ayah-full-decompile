package K;

import H0.InterfaceC0219s;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0.I f4794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0219s f4795b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0219s f4796c;

    public t0(U0.I i10, InterfaceC0219s interfaceC0219s) {
        this.f4794a = i10;
        this.f4796c = interfaceC0219s;
    }

    public final long a(long j) {
        p171r0.e eVarJ;
        InterfaceC0219s interfaceC0219s = this.f4795b;
        p171r0.e eVar = p171r0.e.f21388e;
        if (interfaceC0219s != null) {
            if (interfaceC0219s.C()) {
                InterfaceC0219s interfaceC0219s2 = this.f4796c;
                eVarJ = interfaceC0219s2 != null ? interfaceC0219s2.J(interfaceC0219s, true) : null;
            } else {
                eVarJ = eVar;
            }
            if (eVarJ != null) {
                eVar = eVarJ;
            }
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = eVar.f21389a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = eVar.f21391c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = eVar.f21390b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = eVar.f21392d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z10) {
        if (z10) {
            j = a(j);
        }
        return this.f4794a.f8024b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        U0.I i10 = this.f4794a;
        int iE = i10.f8024b.e(fIntBitsToFloat);
        int i11 = (int) (jD >> 32);
        return Float.intBitsToFloat(i11) >= i10.d(iE) && Float.intBitsToFloat(i11) <= i10.e(iE);
    }

    public final long d(long j) {
        InterfaceC0219s interfaceC0219s;
        InterfaceC0219s interfaceC0219s2 = this.f4795b;
        if (interfaceC0219s2 == null) {
            return j;
        }
        if (!interfaceC0219s2.C()) {
            interfaceC0219s2 = null;
        }
        if (interfaceC0219s2 == null || (interfaceC0219s = this.f4796c) == null) {
            return j;
        }
        InterfaceC0219s interfaceC0219s3 = interfaceC0219s.C() ? interfaceC0219s : null;
        return interfaceC0219s3 == null ? j : interfaceC0219s2.B(interfaceC0219s3, j);
    }

    public final long e(long j) {
        InterfaceC0219s interfaceC0219s;
        InterfaceC0219s interfaceC0219s2 = this.f4795b;
        if (interfaceC0219s2 == null) {
            return j;
        }
        if (!interfaceC0219s2.C()) {
            interfaceC0219s2 = null;
        }
        if (interfaceC0219s2 == null || (interfaceC0219s = this.f4796c) == null) {
            return j;
        }
        InterfaceC0219s interfaceC0219s3 = interfaceC0219s.C() ? interfaceC0219s : null;
        return interfaceC0219s3 == null ? j : interfaceC0219s3.B(interfaceC0219s2, j);
    }
}
