package T1;

/* JADX INFO: renamed from: T1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0490g extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7678t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0490g(Object obj, p150o9.c cVar, int i10) {
        super(1, cVar);
        this.f7676r = i10;
        this.f7678t = obj;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f7676r) {
            case 0:
                return new C0490g((InterfaceC0488e) this.f7678t, cVar, 0);
            default:
                return new C0490g((C0507y) this.f7678t, cVar, 1);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f7676r) {
            case 0:
                break;
        }
        return ((C0490g) create(cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7676r) {
            case 0:
                int i10 = this.f7677s;
                p110k9.y yVar = p110k9.y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0488e interfaceC0488e = (InterfaceC0488e) this.f7678t;
                this.f7677s = 1;
                interfaceC0488e.a();
                p161p9.a aVar = p161p9.a.f21156r;
                return yVar == aVar ? aVar : yVar;
            default:
                int i11 = this.f7677s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                C0507y c0507y = (C0507y) this.f7678t;
                this.f7677s = 1;
                Object objE = c0507y.e(this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objE == aVar2 ? aVar2 : objE;
        }
    }
}
