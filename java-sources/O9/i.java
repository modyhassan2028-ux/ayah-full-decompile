package O9;

import F2.D;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6529r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f6532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f6533v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, InterfaceC0416i interfaceC0416i, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f6532u = kVar;
        this.f6533v = interfaceC0416i;
        this.f6531t = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6529r) {
            case 0:
                return new i(this.f6532u, this.f6533v, this.f6531t, cVar);
            default:
                i iVar = new i(this.f6532u, this.f6533v, cVar);
                iVar.f6531t = obj;
                return iVar;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6529r) {
            case 0:
                break;
        }
        return ((i) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [q9.i, y9.f] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6529r) {
            case 0:
                int i10 = this.f6530s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    ?? r10 = this.f6532u.f6539v;
                    Object obj2 = this.f6531t;
                    this.f6530s = 1;
                    Object objD = r10.d(this.f6533v, obj2, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i11 = this.f6530s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f6531t;
                    p251z9.v vVar = new p251z9.v();
                    k kVar = this.f6532u;
                    InterfaceC0415h interfaceC0415h = kVar.f6528u;
                    D d5 = new D(vVar, interfaceC0402u, kVar, this.f6533v);
                    this.f6530s = 1;
                    Object objD2 = interfaceC0415h.d(d5, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objD2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        super(2, cVar);
        this.f6532u = kVar;
        this.f6533v = interfaceC0416i;
    }
}
