package Ga;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f3070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f3071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f3072v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(A a9, z zVar, z zVar2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f3068r = i10;
        this.f3070t = a9;
        this.f3071u = zVar;
        this.f3072v = zVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3068r) {
            case 0:
                return new r(this.f3070t, this.f3071u, this.f3072v, cVar, 0);
            default:
                return new r(this.f3070t, this.f3071u, this.f3072v, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f3068r) {
            case 0:
                break;
        }
        return ((r) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3068r) {
            case 0:
                int i10 = this.f3069s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f3069s = 1;
                    Object objB = A.b(this.f3070t, this.f3071u, this.f3072v, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objB == aVar) {
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
                int i11 = this.f3069s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f3069s = 1;
                    Object objB2 = A.b(this.f3070t, this.f3071u, this.f3072v, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objB2 == aVar2) {
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
