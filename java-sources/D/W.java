package D;

import H0.InterfaceC0215n;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W implements H0.I, S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0062e f922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.i f923b;

    public W(InterfaceC0062e interfaceC0062e, l0.i iVar) {
        this.f922a = interfaceC0062e;
        this.f923b = iVar;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        return AbstractC0060c.e(this, p063g1.a.j(j), p063g1.a.i(j), p063g1.a.h(j), p063g1.a.g(j), k7.E(this.f922a.a()), k7, list, new H0.U[list.size()], list.size());
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f922a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f3 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            H0.H h7 = (H0.H) list.get(i12);
            float fD = AbstractC0060c.d(AbstractC0060c.c(h7));
            int iH = h7.H(i10);
            if (fD == 0.0f) {
                i11 += iH;
            } else if (fD > 0.0f) {
                f3 += fD;
                iMax = Math.max(iMax, Math.round(iH / fD));
            }
        }
        return ((list.size() - 1) * iE) + Math.round(iMax * f3) + i11;
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f922a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE, i10);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            H0.H h7 = (H0.H) list.get(i11);
            float fD = AbstractC0060c.d(AbstractC0060c.c(h7));
            if (fD == 0.0f) {
                int iMin2 = Math.min(h7.N(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h7.P(iMin2));
            } else if (fD > 0.0f) {
                f3 += fD;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            H0.H h10 = (H0.H) list.get(i12);
            float fD2 = AbstractC0060c.d(AbstractC0060c.c(h10));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, h10.P(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // D.S
    public final long d(int i10, int i11, int i12, boolean z10) {
        return !z10 ? p063g1.b.a(i10, i11, 0, i12) : AbstractC0813f2.A(i10, i11, 0, i12);
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f922a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f3 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            H0.H h7 = (H0.H) list.get(i12);
            float fD = AbstractC0060c.d(AbstractC0060c.c(h7));
            int iN = h7.N(i10);
            if (fD == 0.0f) {
                i11 += iN;
            } else if (fD > 0.0f) {
                f3 += fD;
                iMax = Math.max(iMax, Math.round(iN / fD));
            }
        }
        return ((list.size() - 1) * iE) + Math.round(iMax * f3) + i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w9 = (W) obj;
        return p251z9.j.a(this.f922a, w9.f922a) && p251z9.j.a(this.f923b, w9.f923b);
    }

    @Override // D.S
    public final H0.J f(H0.U[] uArr, H0.K k7, int[] iArr, int i10, int i11) {
        return k7.g0(i10, i11, p120l9.s.f19441r, new V(uArr, this, i11, iArr));
    }

    @Override // D.S
    public final void g(int i10, H0.K k7, int[] iArr, int[] iArr2) {
        this.f922a.b(k7, i10, iArr, k7.getLayoutDirection(), iArr2);
    }

    @Override // D.S
    public final int h(H0.U u8) {
        return u8.f3169s;
    }

    public final int hashCode() {
        return this.f923b.hashCode() + (this.f922a.hashCode() * 31);
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f922a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE, i10);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            H0.H h7 = (H0.H) list.get(i11);
            float fD = AbstractC0060c.d(AbstractC0060c.c(h7));
            if (fD == 0.0f) {
                int iMin2 = Math.min(h7.N(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h7.d(iMin2));
            } else if (fD > 0.0f) {
                f3 += fD;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            H0.H h10 = (H0.H) list.get(i12);
            float fD2 = AbstractC0060c.d(AbstractC0060c.c(h10));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, h10.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // D.S
    public final int j(H0.U u8) {
        return u8.f3168r;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f922a + ", verticalAlignment=" + this.f923b + ')';
    }
}
