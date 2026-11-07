package W;

import D.AbstractC0066i;
import Z.C0690k;
import Z.C0698o;

/* JADX INFO: renamed from: W.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596s extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D.d0 f9345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f9346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E2 f9347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ U0.L f9349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f9350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9351x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596s(D.d0 d0Var, float f3, E2 e10, p074h0.d dVar, U0.L l10, p241y9.e eVar, p074h0.d dVar2) {
        super(2);
        this.f9345r = d0Var;
        this.f9346s = f3;
        this.f9347t = e10;
        this.f9348u = dVar;
        this.f9349v = l10;
        this.f9350w = eVar;
        this.f9351x = dVar2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            l0.r rVarF = androidx.compose.foundation.layout.c.f(com.google.android.gms.internal.measurement.B1.n(D.h0.a(l0.o.f19333a, this.f9345r)), 0.0f, this.f9346s, 1);
            boolean zG = c0698o.g(null);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new r();
                c0698o.e0(objH);
            }
            r rVar = (r) objH;
            E2 e10 = this.f9347t;
            AbstractC0614y.c(rVarF, rVar, e10.f8531c, e10.f8532d, e10.f8533e, this.f9348u, this.f9349v, AbstractC0066i.f981e, AbstractC0066i.f977a, this.f9350w, this.f9351x, c0698o, 113246208, 3126);
        }
        return p110k9.y.f19095a;
    }
}
