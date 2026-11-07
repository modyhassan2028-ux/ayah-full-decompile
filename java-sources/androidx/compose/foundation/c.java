package androidx.compose.foundation;

import B.j;
import R0.g;
import Z.C0690k;
import Z.C0698o;
import l0.o;
import l0.r;
import p232y.J;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f11774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f11777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f11778v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(J j, boolean z10, String str, g gVar, p241y9.a aVar) {
        super(3);
        this.f11774r = j;
        this.f11775s = z10;
        this.f11776t = str;
        this.f11777u = gVar;
        this.f11778v = aVar;
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
        r rVarB = f.a(o.f19333a, jVar, this.f11774r).b(new ClickableElement(jVar, null, this.f11775s, this.f11776t, this.f11777u, this.f11778v));
        c0698o.p(false);
        return rVarB;
    }
}
