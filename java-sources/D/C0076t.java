package D;

import H0.InterfaceC0215n;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: renamed from: D.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076t implements H0.I, S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0064g f1026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.h f1027b;

    public C0076t(InterfaceC0064g interfaceC0064g, l0.h hVar) {
        this.f1026a = interfaceC0064g;
        this.f1027b = hVar;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        return AbstractC0060c.e(this, p063g1.a.i(j), p063g1.a.j(j), p063g1.a.g(j), p063g1.a.h(j), k7.E(this.f1026a.a()), k7, list, new H0.U[list.size()], list.size());
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f1026a.a());
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
                int iMin2 = Math.min(h7.d(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h7.H(iMin2));
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
                iMax = Math.max(iMax, h10.H(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f1026a.a());
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
            int iP = h7.P(i10);
            if (fD == 0.0f) {
                i11 += iP;
            } else if (fD > 0.0f) {
                f3 += fD;
                iMax = Math.max(iMax, Math.round(iP / fD));
            }
        }
        return ((list.size() - 1) * iE) + Math.round(iMax * f3) + i11;
    }

    @Override // D.S
    public final long d(int i10, int i11, int i12, boolean z10) {
        return !z10 ? p063g1.b.a(0, i12, i10, i11) : AbstractC0813f2.z(0, i12, i10, i11);
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f1026a.a());
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
                int iMin2 = Math.min(h7.d(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h7.N(iMin2));
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
                iMax = Math.max(iMax, h10.N(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0076t)) {
            return false;
        }
        C0076t c0076t = (C0076t) obj;
        return p251z9.j.a(this.f1026a, c0076t.f1026a) && this.f1027b.equals(c0076t.f1027b);
    }

    @Override // D.S
    public final H0.J f(H0.U[] uArr, H0.K k7, int[] iArr, int i10, int i11) {
        return k7.g0(i11, i10, p120l9.s.f19441r, new C0075s(uArr, this, i11, k7, iArr));
    }

    @Override // D.S
    public final void g(int i10, H0.K k7, int[] iArr, int[] iArr2) {
        this.f1026a.d(i10, k7, iArr, iArr2);
    }

    @Override // D.S
    public final int h(H0.U u8) {
        return u8.f3168r;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1027b.f19324a) + (this.f1026a.hashCode() * 31);
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int iE = interfaceC0215n.E(this.f1026a.a());
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
            int iD = h7.d(i10);
            if (fD == 0.0f) {
                i11 += iD;
            } else if (fD > 0.0f) {
                f3 += fD;
                iMax = Math.max(iMax, Math.round(iD / fD));
            }
        }
        return ((list.size() - 1) * iE) + Math.round(iMax * f3) + i11;
    }

    @Override // D.S
    public final int j(H0.U u8) {
        return u8.f3169s;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f1026a + ", horizontalAlignment=" + this.f1027b + ')';
    }
}
