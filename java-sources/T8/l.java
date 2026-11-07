package T8;

import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class l extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f7964t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f7962r = i10;
        this.f7964t = nVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7962r) {
            case 0:
                return new l(this.f7964t, cVar, 0);
            default:
                return new l(this.f7964t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f7962r) {
            case 0:
                break;
        }
        return ((l) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7962r) {
            case 0:
                int i10 = this.f7963s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    n nVar = this.f7964t;
                    InterfaceC0415h interfaceC0415hB = nVar.f7969b.b();
                    k kVar = new k(0, nVar.f7970c);
                    this.f7963s = 1;
                    Object objD = interfaceC0415hB.d(kVar, this);
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
                return y.f19095a;
            default:
                int i11 = this.f7963s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                InterfaceC0415h interfaceC0415hB2 = this.f7964t.f7969b.b();
                this.f7963s = 1;
                Object objP = AbstractC0419l.p(interfaceC0415hB2, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objP == aVar2 ? aVar2 : objP;
        }
    }
}
