package p067g5;

import F.C0153b;
import Ga.A;
import Z.C0698o;
import java.util.List;
import l0.o;
import p074h0.j;
import p079h5.b;
import p110k9.y;
import p185s8.u0;
import p241y9.c;
import p241y9.g;
import p243z0.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f16303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f16304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f16305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f16306u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, A a9, c cVar, a aVar) {
        super(4);
        this.f16303r = list;
        this.f16304s = a9;
        this.f16305t = cVar;
        this.f16306u = aVar;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        C0698o c0698o;
        C0153b c0153b = (C0153b) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0698o c0698o2 = (C0698o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (c0698o2.g(c0153b) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= c0698o2.e(iIntValue) ? 32 : 16;
        }
        if (c0698o2.K(i10 & 1, (i10 & 147) != 146)) {
            p079h5.e eVar = (p079h5.e) this.f16303r.get(iIntValue);
            c0698o2.T(1270440534);
            if (eVar instanceof b) {
                c0698o2.T(1270495124);
                c0698o = c0698o2;
                u0.c(c0153b, this.f16304s, a.g(eVar), null, false, null, j.d(1085653192, new d((b) eVar, this.f16305t, c0153b, this.f16306u), c0698o2), c0698o, (i10 & 14) | 1572864);
                c0698o.p(false);
            } else {
                c0698o = c0698o2;
                c0698o.T(1271428007);
                a.b(eVar, this.f16305t, p245z2.a.q(c0153b), o.f19333a, c0698o2, 3072);
                c0698o.p(false);
            }
            c0698o.p(false);
        } else {
            c0698o2.N();
        }
        return y.f19095a;
    }
}
