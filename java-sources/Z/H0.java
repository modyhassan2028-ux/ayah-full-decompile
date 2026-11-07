package Z;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f10602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X f10603v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(p241y9.e eVar, X x9, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f10599r = i10;
        this.f10602u = eVar;
        this.f10603v = x9;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f10599r) {
            case 0:
                H0 h7 = new H0(this.f10602u, this.f10603v, cVar, 0);
                h7.f10601t = obj;
                return h7;
            case 1:
                H0 h10 = new H0(this.f10602u, this.f10603v, cVar, 1);
                h10.f10601t = obj;
                return h10;
            default:
                H0 h11 = new H0(this.f10602u, this.f10603v, cVar, 2);
                h11.f10601t = obj;
                return h11;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f10599r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((H0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10599r) {
            case 0:
                int i10 = this.f10600s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    C0691k0 c0691k0 = new C0691k0(this.f10603v, ((InterfaceC0402u) this.f10601t).getCoroutineContext());
                    this.f10600s = 1;
                    Object objInvoke = this.f10602u.invoke(c0691k0, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objInvoke == aVar) {
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
                int i11 = this.f10600s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    C0691k0 c0691k1 = new C0691k0(this.f10603v, ((InterfaceC0402u) this.f10601t).getCoroutineContext());
                    this.f10600s = 1;
                    Object objInvoke2 = this.f10602u.invoke(c0691k1, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objInvoke2 == aVar2) {
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
                int i12 = this.f10600s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C0691k0 c0691k2 = new C0691k0(this.f10603v, ((InterfaceC0402u) this.f10601t).getCoroutineContext());
                    this.f10600s = 1;
                    Object objInvoke3 = this.f10602u.invoke(c0691k2, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objInvoke3 == aVar3) {
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
