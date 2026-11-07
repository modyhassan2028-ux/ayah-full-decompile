package androidx.compose.foundation;

import B.j;
import Z.C0690k;
import Z.C0698o;
import l0.o;
import l0.r;
import p232y.J;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f11781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(J j, p241y9.a aVar, p241y9.a aVar2) {
        super(3);
        this.f11781r = j;
        this.f11782s = aVar;
        this.f11783t = aVar2;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(-1525724089);
        Object objH = c0698o.H();
        if (objH == C0690k.f10683a) {
            objH = new j();
            c0698o.e0(objH);
        }
        j jVar = (j) objH;
        r rVarB = f.a(o.f19333a, jVar, this.f11781r).b(new CombinedClickableElement(jVar, null, this.f11782s, this.f11783t));
        c0698o.p(false);
        return rVarB;
    }
}
