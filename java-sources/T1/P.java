package T1;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class P extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f7619s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(U u8, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f7618r = i10;
        this.f7619s = u8;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7618r) {
            case 0:
                return new P(this.f7619s, cVar, 0);
            default:
                return new P(this.f7619s, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f7618r) {
            case 0:
                break;
        }
        return ((P) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7618r;
        p110k9.a.e(obj);
        switch (i10) {
            case 0:
                return new Integer(Z.f7652b.nativeGetCounterValue(((Z) this.f7619s.f7642i.getValue()).f7653a));
            default:
                return new Integer(Z.f7652b.nativeIncrementAndGetCounterValue(((Z) this.f7619s.f7642i.getValue()).f7653a));
        }
    }
}
