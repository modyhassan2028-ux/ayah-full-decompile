package Ga;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f2992t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(J j, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f2990r = i10;
        this.f2992t = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2990r) {
            case 0:
                return new H(this.f2992t, cVar, 0);
            default:
                return new H(this.f2992t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f2990r) {
            case 0:
                break;
        }
        return ((H) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2990r) {
            case 0:
                int i10 = this.f2991s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f2991s = 1;
                    Object objA = J.a(this.f2992t, this);
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
            default:
                int i11 = this.f2991s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f2991s = 1;
                    Object objC = this.f2992t.c(this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objC == aVar2) {
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
