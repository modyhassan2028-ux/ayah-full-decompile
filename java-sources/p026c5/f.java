package p026c5;

import F.C0153b;
import Z.C0698o;
import Z.X;
import androidx.compose.foundation.layout.b;
import java.util.List;
import l0.o;
import p047e5.d;
import p047e5.e;
import p047e5.h;
import p047e5.i;
import p047e5.j;
import p106k4.a;
import p110k9.y;
import p241y9.c;
import p241y9.g;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f13486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.f f13487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p241y9.f f13488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f13489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f13490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ X f13491x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, a aVar, p241y9.f fVar, p241y9.f fVar2, c cVar, c cVar2, X x9) {
        super(4);
        this.f13485r = list;
        this.f13486s = aVar;
        this.f13487t = fVar;
        this.f13488u = fVar2;
        this.f13489v = cVar;
        this.f13490w = cVar2;
        this.f13491x = x9;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        C0153b c0153b = (C0153b) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0698o c0698o = (C0698o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (c0698o.g(c0153b) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= c0698o.e(iIntValue) ? 32 : 16;
        }
        if (c0698o.K(i10 & 1, (i10 & 147) != 146)) {
            j jVar = (j) this.f13485r.get(iIntValue);
            c0698o.T(-1211185428);
            boolean z10 = jVar instanceof i;
            o oVar = o.f19333a;
            if (z10) {
                c0698o.T(-1211191195);
                p006a5.a.h((i) jVar, b.h(oVar, 10), c0698o, 48);
                c0698o.p(false);
            } else {
                boolean z11 = jVar instanceof h;
                a aVar = this.f13486s;
                if (z11) {
                    c0698o.T(-1211003521);
                    p006a5.a.g((h) jVar, aVar, oVar, c0698o, 384);
                    c0698o.p(false);
                } else if (jVar instanceof p047e5.g) {
                    c0698o.T(-1210767270);
                    p006a5.a.f((p047e5.g) jVar, this.f13487t, this.f13488u, b.l(oVar, 0.0f, 10, 0.0f, 0.0f, 13), (List) this.f13491x.getValue(), c0698o, 3072);
                    c0698o.p(false);
                } else if (jVar instanceof d) {
                    c0698o.T(-1210412103);
                    p006a5.a.c((d) jVar, aVar, oVar, c0698o, 384);
                    c0698o.p(false);
                } else if (jVar instanceof p047e5.c) {
                    c0698o.T(-1210177929);
                    p006a5.a.b((p047e5.c) jVar, aVar, oVar, c0698o, 384);
                    c0698o.p(false);
                } else if (jVar instanceof p047e5.f) {
                    c0698o.T(-1209941089);
                    p006a5.a.e((p047e5.f) jVar, this.f13489v, oVar, c0698o, 384);
                    c0698o.p(false);
                } else if (jVar instanceof p047e5.b) {
                    c0698o.T(-1209708372);
                    p006a5.a.a((p047e5.b) jVar, this.f13490w, b.j(oVar, 0.0f, 2, 1), c0698o, 384);
                    c0698o.p(false);
                } else {
                    if (!(jVar instanceof e)) {
                        c0698o.T(792213495);
                        c0698o.p(false);
                        throw new A6.a();
                    }
                    c0698o.T(-1209432937);
                    p006a5.a.d((e) jVar, b.j(oVar, 0.0f, 2, 1), c0698o, 48);
                    c0698o.p(false);
                }
            }
            c0698o.p(false);
        } else {
            c0698o.N();
        }
        return y.f19095a;
    }
}
