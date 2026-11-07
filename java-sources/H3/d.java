package H3;

import A4.l;
import F9.n;
import H2.j;
import K9.InterfaceC0402u;
import M.k;
import N9.AbstractC0419l;
import T1.InterfaceC0491h;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3346r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f3348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X1.e f3350v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, X1.e eVar, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f3348t = kVar;
        this.f3350v = eVar;
        this.f3349u = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3346r) {
            case 0:
                return new d(this.f3348t, this.f3350v, this.f3349u, cVar);
            default:
                return new d(this.f3348t, this.f3349u, this.f3350v, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f3346r) {
            case 0:
                break;
        }
        return ((d) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3346r) {
            case 0:
                int i10 = this.f3347s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                j jVar = new j(((InterfaceC0491h) this.f3348t.f5618s).b(), this.f3350v, this.f3349u, 1);
                this.f3347s = 1;
                Object objP = AbstractC0419l.p(jVar, this);
                p161p9.a aVar = p161p9.a.f21156r;
                return objP == aVar ? aVar : objP;
            default:
                int i11 = this.f3347s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    InterfaceC0491h interfaceC0491h = (InterfaceC0491h) this.f3348t.f5618s;
                    l lVar = new l(this.f3349u, this.f3350v, (p150o9.c) null, 1);
                    this.f3347s = 1;
                    Object objT = n.t(interfaceC0491h, lVar, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objT == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, Object obj, X1.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f3348t = kVar;
        this.f3349u = obj;
        this.f3350v = eVar;
    }
}
