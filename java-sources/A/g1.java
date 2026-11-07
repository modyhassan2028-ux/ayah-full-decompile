package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f245t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(C0053x0 c0053x0, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f243r = i10;
        this.f245t = c0053x0;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f243r) {
            case 0:
                return new g1(this.f245t, cVar, 0);
            default:
                return new g1(this.f245t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f243r) {
            case 0:
                break;
        }
        return ((g1) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f243r) {
            case 0:
                int i10 = this.f244s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f244s = 1;
                    Object objD = this.f245t.d(this);
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
                int i11 = this.f244s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f244s = 1;
                    Object objD2 = this.f245t.d(this);
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
}
