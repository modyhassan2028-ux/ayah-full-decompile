package K;

import K0.AbstractC0359n0;
import Z.C0690k;
import Z.C0698o;
import Z.L0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U0.L f4490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(int i10, int i11, U0.L l10) {
        super(3);
        this.f4488r = i10;
        this.f4489s = i11;
        this.f4490t = l10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(408240218);
        int i10 = this.f4488r;
        int i11 = this.f4489s;
        T.z(i10, i11);
        l0.o oVar = l0.o.f19333a;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            c0698o.p(false);
            return oVar;
        }
        p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
        Y0.d dVar = (Y0.d) c0698o.k(AbstractC0359n0.f5120k);
        p063g1.m mVar = (p063g1.m) c0698o.k(AbstractC0359n0.f5123n);
        U0.L l10 = this.f4490t;
        boolean zG = c0698o.g(l10) | c0698o.g(mVar);
        Object objH = c0698o.H();
        Z.S s10 = C0690k.f10683a;
        if (zG || objH == s10) {
            objH = B0.c.a0(l10, mVar);
            c0698o.e0(objH);
        }
        U0.L l11 = (U0.L) objH;
        boolean zG2 = c0698o.g(dVar) | c0698o.g(l11);
        Object objH2 = c0698o.H();
        if (zG2 || objH2 == s10) {
            U0.C c10 = l11.f8037a;
            Y0.e eVar = c10.f7999f;
            Y0.l lVar = c10.f7996c;
            if (lVar == null) {
                lVar = Y0.l.f10359t;
            }
            Y0.j jVar = c10.f7997d;
            int i12 = jVar != null ? jVar.f10356a : 0;
            Y0.k kVar = c10.f7998e;
            objH2 = ((Y0.f) dVar).b(eVar, lVar, i12, kVar != null ? kVar.f10357a : 65535);
            c0698o.e0(objH2);
        }
        L0 l12 = (L0) objH2;
        boolean zG3 = c0698o.g(l12.getValue()) | c0698o.g(cVar) | c0698o.g(dVar) | c0698o.g(l10) | c0698o.g(mVar);
        Object objH3 = c0698o.H();
        if (zG3 || objH3 == s10) {
            objH3 = Integer.valueOf((int) (i0.a(l11, cVar, dVar, i0.f4650a, 1) & 4294967295L));
            c0698o.e0(objH3);
        }
        int iIntValue = ((Number) objH3).intValue();
        boolean zG4 = c0698o.g(l12.getValue()) | c0698o.g(cVar) | c0698o.g(dVar) | c0698o.g(l10) | c0698o.g(mVar);
        Object objH4 = c0698o.H();
        if (zG4 || objH4 == s10) {
            StringBuilder sb = new StringBuilder();
            String str = i0.f4650a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objH4 = Integer.valueOf((int) (i0.a(l11, cVar, dVar, sb.toString(), 2) & 4294967295L));
            c0698o.e0(objH4);
        }
        int iIntValue2 = ((Number) objH4).intValue() - iIntValue;
        Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
        l0.r rVarE = androidx.compose.foundation.layout.c.e(oVar, numValueOf != null ? cVar.b0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? cVar.b0(numValueOf2.intValue()) : Float.NaN);
        c0698o.p(false);
        return rVarE;
    }
}
