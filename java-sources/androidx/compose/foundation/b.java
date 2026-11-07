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
public final class b extends k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f11772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, String str, p241y9.a aVar) {
        super(3);
        this.f11771r = z10;
        this.f11772s = str;
        this.f11773t = aVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        j jVar;
        r rVarB;
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(-756081143);
        J j = (J) c0698o.k(f.f11784a);
        boolean z10 = j instanceof O;
        if (z10) {
            c0698o.T(617653824);
            c0698o.p(false);
            jVar = null;
        } else {
            c0698o.T(617786442);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new j();
                c0698o.e0(objH);
            }
            jVar = (j) objH;
            c0698o.p(false);
        }
        j jVar2 = jVar;
        boolean z11 = this.f11771r;
        String str = this.f11772s;
        p241y9.a aVar = this.f11773t;
        if (z10) {
            rVarB = new ClickableElement(jVar2, (O) j, z11, str, null, aVar);
        } else if (j == null) {
            rVarB = new ClickableElement(jVar2, null, z11, str, null, aVar);
        } else {
            o oVar = o.f19333a;
            rVarB = jVar2 != null ? f.a(oVar, jVar2, j).b(new ClickableElement(jVar2, null, z11, str, null, aVar)) : l0.a.a(oVar, new c(j, z11, str, null, aVar));
        }
        c0698o.p(false);
        return rVarB;
    }
}
