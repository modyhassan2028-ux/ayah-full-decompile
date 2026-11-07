package D;

import G.C0175i;
import W.A2;
import W.AbstractC0586o0;
import W.V0;
import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: D.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0068k extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f994t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068k(int i10, int i11, Object obj) {
        super(2);
        this.f992r = i11;
        this.f993s = obj;
        this.f994t = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f992r;
        p110k9.y yVar = p110k9.y.f19095a;
        int i11 = this.f994t;
        Object obj3 = this.f993s;
        switch (i10) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0071n.a((l0.r) obj3, (C0698o) obj, C0672b.y(i11 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                p074h0.d dVar = AbstractC0586o0.f9293a;
                V0.f((l0.r) obj3, (C0698o) obj, C0672b.y(i11 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                A2.n((l0.r) obj3, (C0698o) obj, C0672b.y(i11 | 1));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    F.i iVar = (F.i) obj3;
                    C0175i c0175iE = iVar.f2055b.f2052a.e(i11);
                    ((p074h0.d) c0175iE.f2702c.f11366u).i(iVar.f2056c, Integer.valueOf(i11 - c0175iE.f2700a), c0698o, 0);
                }
                break;
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068k(l0.r rVar, int i10) {
        super(2);
        this.f992r = 1;
        p074h0.d dVar = AbstractC0586o0.f9293a;
        this.f993s = rVar;
        this.f994t = i10;
    }
}
