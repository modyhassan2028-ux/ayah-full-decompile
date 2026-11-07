package androidx.compose.foundation.selection;

import B.j;
import Z.C0690k;
import Z.C0698o;
import l0.o;
import l0.r;
import p232y.J;
import p241y9.f;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f11869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11870s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11871t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(J j, boolean z10, p241y9.a aVar) {
        super(3);
        this.f11869r = j;
        this.f11870s = z10;
        this.f11871t = aVar;
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
        r rVarB = androidx.compose.foundation.f.a(o.f19333a, jVar, this.f11869r).b(new SelectableElement(this.f11870s, jVar, null, this.f11871t));
        c0698o.p(false);
        return rVarB;
    }
}
