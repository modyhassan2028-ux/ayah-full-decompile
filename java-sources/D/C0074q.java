package D;

import H0.InterfaceC0215n;
import java.util.List;

/* JADX INFO: renamed from: D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074q implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.j f1017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1018b;

    public C0074q(l0.j jVar, boolean z10) {
        this.f1017a = jVar;
        this.f1018b = z10;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        int iJ;
        int i10;
        H0.U uA;
        boolean zIsEmpty = list.isEmpty();
        p120l9.s sVar = p120l9.s.f19441r;
        if (zIsEmpty) {
            return k7.g0(p063g1.a.j(j), p063g1.a.i(j), sVar, C0069l.f996t);
        }
        long j10 = this.f1018b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            H0.H h7 = (H0.H) list.get(0);
            Object objI = h7.i();
            C0067j c0067j = objI instanceof C0067j ? (C0067j) objI : null;
            if (c0067j != null ? c0067j.f989G : false) {
                iJ = p063g1.a.j(j);
                i10 = p063g1.a.i(j);
                int iJ2 = p063g1.a.j(j);
                int i11 = p063g1.a.i(j);
                if (!((i11 >= 0) & (iJ2 >= 0))) {
                    p063g1.i.a("width and height must be >= 0");
                }
                uA = h7.a(p063g1.b.h(iJ2, iJ2, i11, i11));
            } else {
                uA = h7.a(j10);
                iJ = Math.max(p063g1.a.j(j), uA.f3168r);
                i10 = Math.max(p063g1.a.i(j), uA.f3169s);
            }
            int i12 = i10;
            int i13 = iJ;
            return k7.g0(i13, i12, sVar, new C0072o(uA, h7, k7, i13, i12, this));
        }
        H0.U[] uArr = new H0.U[list.size()];
        p251z9.t tVar = new p251z9.t();
        tVar.f24884r = p063g1.a.j(j);
        p251z9.t tVar2 = new p251z9.t();
        tVar2.f24884r = p063g1.a.i(j);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            H0.H h10 = (H0.H) list.get(i14);
            Object objI2 = h10.i();
            C0067j c0067j2 = objI2 instanceof C0067j ? (C0067j) objI2 : null;
            if (c0067j2 != null ? c0067j2.f989G : false) {
                z10 = true;
            } else {
                H0.U uA2 = h10.a(j10);
                uArr[i14] = uA2;
                tVar.f24884r = Math.max(tVar.f24884r, uA2.f3168r);
                tVar2.f24884r = Math.max(tVar2.f24884r, uA2.f3169s);
            }
        }
        if (z10) {
            int i15 = tVar.f24884r;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = tVar2.f24884r;
            long jA = p063g1.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                H0.H h11 = (H0.H) list.get(i18);
                Object objI3 = h11.i();
                C0067j c0067j3 = objI3 instanceof C0067j ? (C0067j) objI3 : null;
                if (c0067j3 != null ? c0067j3.f989G : false) {
                    uArr[i18] = h11.a(jA);
                }
            }
        }
        return k7.g0(tVar.f24884r, tVar2.f24884r, sVar, new C0073p(uArr, list, k7, tVar, tVar2, this));
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0074q)) {
            return false;
        }
        C0074q c0074q = (C0074q) obj;
        return this.f1017a.equals(c0074q.f1017a) && this.f1018b == c0074q.f1018b;
    }

    public final int hashCode() {
        return (this.f1017a.hashCode() * 31) + (this.f1018b ? 1231 : 1237);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f1017a + ", propagateMinConstraints=" + this.f1018b + ')';
    }
}
