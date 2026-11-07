package O;

import Z.C0690k;
import Z.C0698o;

/* JADX INFO: renamed from: O.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0440h extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f6374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6375s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0440h(p241y9.a aVar, boolean z10) {
        super(3);
        this.f6374r = aVar;
        this.f6375s = z10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        l0.r rVar = (l0.r) obj;
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(-196777734);
        long j = ((U) c0698o.k(V.f6342a)).f6340a;
        boolean zF = c0698o.f(j);
        p241y9.a aVar = this.f6374r;
        boolean zG = zF | c0698o.g(aVar);
        boolean z10 = this.f6375s;
        boolean zH = zG | c0698o.h(z10);
        Object objH = c0698o.H();
        if (zH || objH == C0690k.f10683a) {
            objH = new C0439g(j, aVar, z10);
            c0698o.e0(objH);
        }
        l0.r rVarB = androidx.compose.ui.draw.a.b(rVar, (p241y9.c) objH);
        c0698o.p(false);
        return rVarB;
    }
}
