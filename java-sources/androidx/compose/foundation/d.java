package androidx.compose.foundation;

import B.j;
import Z.C0690k;
import Z.C0698o;
import l0.o;
import l0.r;
import p232y.J;
import p232y.O;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p241y9.a aVar, p241y9.a aVar2) {
        super(3);
        this.f11779r = aVar;
        this.f11780s = aVar2;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        j jVar;
        r rVarB;
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(-1534186401);
        J j = (J) c0698o.k(f.f11784a);
        boolean z10 = j instanceof O;
        if (z10) {
            c0698o.T(-1726068379);
            c0698o.p(false);
            jVar = null;
        } else {
            c0698o.T(-1725935761);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new j();
                c0698o.e0(objH);
            }
            jVar = (j) objH;
            c0698o.p(false);
        }
        p241y9.a aVar = this.f11779r;
        p241y9.a aVar2 = this.f11780s;
        if (z10) {
            rVarB = new CombinedClickableElement(jVar, (O) j, aVar2, aVar);
        } else if (j == null) {
            rVarB = new CombinedClickableElement(jVar, null, aVar2, aVar);
        } else {
            o oVar = o.f19333a;
            rVarB = jVar != null ? f.a(oVar, jVar, j).b(new CombinedClickableElement(jVar, null, aVar2, aVar)) : l0.a.a(oVar, new e(j, aVar2, aVar));
        }
        c0698o.p(false);
        return rVarB;
    }
}
