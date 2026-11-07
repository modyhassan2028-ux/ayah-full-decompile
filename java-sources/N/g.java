package N;

import J0.AbstractC0283f;
import U0.C0515g;
import U0.H;
import U0.I;
import U0.L;
import java.util.List;
import p180s0.q;
import p180s0.r;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f5932s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f5931r = i10;
        this.f5932s = hVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        I i10;
        switch (this.f5931r) {
            case 0:
                List list = (List) obj;
                h hVar = this.f5932s;
                I i11 = hVar.v0().f5908n;
                if (i11 != null) {
                    H h7 = i11.f8023a;
                    C0515g c0515g = h7.f8015a;
                    L l10 = hVar.f5934G;
                    r rVar = hVar.f5943P;
                    i10 = new I(new H(c0515g, L.e(l10, rVar != null ? rVar.a() : q.g, 0L, null, null, 0L, 0, 0L, 16777214), h7.f8017c, h7.f8018d, h7.f8019e, h7.f8020f, h7.g, h7.f8021h, h7.f8022i, h7.j), i11.f8024b, i11.f8025c);
                    list.add(i10);
                } else {
                    i10 = null;
                }
                return Boolean.valueOf(i10 != null);
            case 1:
                C0515g c0515g2 = (C0515g) obj;
                h hVar2 = this.f5932s;
                f fVar = hVar2.U;
                p120l9.r rVar2 = p120l9.r.f19440r;
                if (fVar == null) {
                    f fVar2 = new f(hVar2.f5933F, c0515g2);
                    d dVar = new d(c0515g2, hVar2.f5934G, hVar2.f5935H, hVar2.f5937J, hVar2.f5938K, hVar2.f5939L, hVar2.f5940M, rVar2);
                    dVar.c(hVar2.v0().j);
                    fVar2.f5930d = dVar;
                    hVar2.U = fVar2;
                } else if (!p251z9.j.a(c0515g2, fVar.f5928b)) {
                    fVar.f5928b = c0515g2;
                    d dVar2 = fVar.f5930d;
                    if (dVar2 != null) {
                        L l11 = hVar2.f5934G;
                        Y0.d dVar3 = hVar2.f5935H;
                        int i12 = hVar2.f5937J;
                        boolean z10 = hVar2.f5938K;
                        int i13 = hVar2.f5939L;
                        int i14 = hVar2.f5940M;
                        dVar2.f5897a = c0515g2;
                        boolean zC = l11.c(dVar2.f5905k);
                        dVar2.f5905k = l11;
                        if (!zC) {
                            dVar2.f5906l = null;
                            dVar2.f5908n = null;
                            dVar2.f5910p = -1;
                            dVar2.f5909o = -1;
                        }
                        dVar2.f5898b = dVar3;
                        dVar2.f5899c = i12;
                        dVar2.f5900d = z10;
                        dVar2.f5901e = i13;
                        dVar2.f5902f = i14;
                        dVar2.g = rVar2;
                        dVar2.f5906l = null;
                        dVar2.f5908n = null;
                        dVar2.f5910p = -1;
                        dVar2.f5909o = -1;
                    }
                }
                AbstractC0283f.o(hVar2);
                AbstractC0283f.n(hVar2);
                AbstractC0283f.m(hVar2);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                h hVar3 = this.f5932s;
                f fVar3 = hVar3.U;
                if (fVar3 == null) {
                    return Boolean.FALSE;
                }
                p241y9.c cVar = hVar3.Q;
                if (cVar != null) {
                    cVar.e(fVar3);
                }
                f fVar4 = hVar3.U;
                if (fVar4 != null) {
                    fVar4.f5929c = zBooleanValue;
                }
                AbstractC0283f.o(hVar3);
                AbstractC0283f.n(hVar3);
                AbstractC0283f.m(hVar3);
                return Boolean.TRUE;
        }
    }
}
