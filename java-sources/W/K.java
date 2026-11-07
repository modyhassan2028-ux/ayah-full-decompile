package W;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class K extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8625t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(C0561g1 c0561g1, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f8623r = i10;
        this.f8625t = c0561g1;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f8623r) {
            case 0:
                return new K(this.f8625t, cVar, 0);
            case 1:
                return new K(this.f8625t, cVar, 1);
            default:
                return new K(this.f8625t, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f8623r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((K) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8623r) {
            case 0:
                int i10 = this.f8624s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f8624s = 1;
                    Object objA = this.f8625t.a(this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 1:
                int i11 = this.f8624s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f8624s = 1;
                    Object objD = this.f8625t.d(this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i12 = this.f8624s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    this.f8624s = 1;
                    Object objC = this.f8625t.c(this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objC == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }
}
