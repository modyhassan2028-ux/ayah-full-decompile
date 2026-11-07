package N;

import E6.u;
import J0.AbstractC0283f;
import U0.C0515g;
import U0.H;
import U0.I;
import U0.L;
import U0.p;
import java.util.List;
import p063g1.m;
import p180s0.q;
import p180s0.r;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f5949s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(1);
        this.f5948r = i10;
        this.f5949s = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        p063g1.c cVar;
        I i10;
        switch (this.f5948r) {
            case 0:
                List list = (List) obj;
                k kVar = this.f5949s;
                e eVarV0 = kVar.v0();
                L l10 = kVar.f5951G;
                r rVar = kVar.f5957M;
                L lE = L.e(l10, rVar != null ? rVar.a() : q.g, 0L, null, null, 0L, 0, 0L, 16777214);
                m mVar = eVarV0.f5923o;
                I i11 = null;
                if (mVar == null || (cVar = eVarV0.f5918i) == null) {
                    i10 = null;
                } else {
                    C0515g c0515g = new C0515g(eVarV0.f5911a);
                    if (eVarV0.j == null || eVarV0.f5922n == null) {
                        i10 = null;
                    } else {
                        long j = eVarV0.f5924p & (-8589934589L);
                        int i12 = eVarV0.f5916f;
                        boolean z10 = eVarV0.f5915e;
                        int i13 = eVarV0.f5914d;
                        Y0.d dVar = eVarV0.f5913c;
                        p120l9.r rVar2 = p120l9.r.f19440r;
                        i10 = new I(new H(c0515g, lE, rVar2, i12, z10, i13, cVar, mVar, dVar, j), new p(new u(c0515g, lE, rVar2, cVar, dVar), j, eVarV0.f5916f, eVarV0.f5914d), eVarV0.f5920l);
                    }
                }
                if (i10 != null) {
                    list.add(i10);
                    i11 = i10;
                }
                return Boolean.valueOf(i11 != null);
            case 1:
                String str = ((C0515g) obj).f8060s;
                k kVar2 = this.f5949s;
                i iVar = kVar2.Q;
                if (iVar == null) {
                    i iVar2 = new i(kVar2.f5950F, str);
                    e eVar = new e(str, kVar2.f5951G, kVar2.f5952H, kVar2.f5953I, kVar2.f5954J, kVar2.f5955K, kVar2.f5956L);
                    eVar.c(kVar2.v0().f5918i);
                    iVar2.f5947d = eVar;
                    kVar2.Q = iVar2;
                } else if (!p251z9.j.a(str, iVar.f5945b)) {
                    iVar.f5945b = str;
                    e eVar2 = iVar.f5947d;
                    if (eVar2 != null) {
                        L l11 = kVar2.f5951G;
                        Y0.d dVar2 = kVar2.f5952H;
                        int i14 = kVar2.f5953I;
                        boolean z11 = kVar2.f5954J;
                        int i15 = kVar2.f5955K;
                        int i16 = kVar2.f5956L;
                        eVar2.f5911a = str;
                        eVar2.f5912b = l11;
                        eVar2.f5913c = dVar2;
                        eVar2.f5914d = i14;
                        eVar2.f5915e = z11;
                        eVar2.f5916f = i15;
                        eVar2.g = i16;
                        eVar2.b();
                    }
                }
                AbstractC0283f.o(kVar2);
                AbstractC0283f.n(kVar2);
                AbstractC0283f.m(kVar2);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                k kVar3 = this.f5949s;
                i iVar3 = kVar3.Q;
                if (iVar3 == null) {
                    return Boolean.FALSE;
                }
                iVar3.f5946c = zBooleanValue;
                AbstractC0283f.o(kVar3);
                AbstractC0283f.n(kVar3);
                AbstractC0283f.m(kVar3);
                return Boolean.TRUE;
        }
    }
}
