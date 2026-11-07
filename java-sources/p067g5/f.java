package p067g5;

import F.s;
import java.util.List;
import p079h5.b;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import p241y9.g;
import p243z0.a;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ s f16308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ s f16309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f16310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f16311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f16312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, e eVar, a aVar, c cVar) {
        super(4, cVar);
        this.f16310u = list;
        this.f16311v = eVar;
        this.f16312w = aVar;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        e eVar = this.f16311v;
        a aVar = this.f16312w;
        f fVar = new f(this.f16310u, eVar, aVar, (c) obj4);
        fVar.f16308s = (s) obj2;
        fVar.f16309t = (s) obj3;
        return fVar.invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        s sVar = this.f16308s;
        s sVar2 = this.f16309t;
        int i10 = this.f16307r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            int i11 = sVar.f2110a;
            List list = this.f16310u;
            p079h5.e eVar = (p079h5.e) list.get(i11);
            p079h5.e eVar2 = (p079h5.e) list.get(sVar2.f2110a);
            if ((eVar instanceof b) && (eVar2 instanceof b)) {
                p058f5.b bVar = new p058f5.b(((b) eVar).f16458a, sVar2.f2110a - 1);
                this.f16308s = null;
                this.f16309t = null;
                this.f16307r = 1;
                Object objInvoke = this.f16311v.invoke(bVar, this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objInvoke == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        this.f16312w.a(27);
        return y.f19095a;
    }
}
