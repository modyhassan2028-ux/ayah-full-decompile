package p067g5;

import D0.F;
import F.C0153b;
import Ga.C0194c;
import Ga.C0201j;
import Ga.k;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import l0.m;
import l0.r;
import p079h5.b;
import p110k9.y;
import p241y9.c;
import p241y9.g;
import p243z0.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f16299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f16300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0153b f16301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f16302u;

    public d(b bVar, c cVar, C0153b c0153b, a aVar) {
        this.f16299r = bVar;
        this.f16300s = cVar;
        this.f16301t = c0153b;
        this.f16302u = aVar;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        k kVar = (k) obj;
        ((Boolean) obj2).getClass();
        C0698o c0698o = (C0698o) obj3;
        int iIntValue = ((Number) obj4).intValue();
        j.e(kVar, "$this$ReorderableItem");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0698o.g(kVar) ? 4 : 2;
        }
        if (c0698o.K(iIntValue & 1, (iIntValue & 131) != 130)) {
            r rVarQ = p245z2.a.q(this.f16301t);
            a aVar = this.f16302u;
            boolean zI = c0698o.i(aVar);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (zI || objH == s10) {
                objH = new F(2, aVar);
                c0698o.e0(objH);
            }
            c cVar = (c) objH;
            boolean zI2 = c0698o.i(aVar);
            Object objH2 = c0698o.H();
            if (zI2 || objH2 == s10) {
                objH2 = new c(aVar);
                c0698o.e0(objH2);
            }
            p241y9.a aVar2 = (p241y9.a) objH2;
            j.e(cVar, "onDragStarted");
            j.e(aVar2, "onDragStopped");
            a.b(this.f16299r, this.f16300s, rVarQ, new m(new C0201j(kVar, C0194c.f3008a, cVar, aVar2, 0)), c0698o, 0);
        } else {
            c0698o.N();
        }
        return y.f19095a;
    }
}
