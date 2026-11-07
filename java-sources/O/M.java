package O;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class M extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f6307s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(N n6, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6306r = i10;
        this.f6307s = n6;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6306r) {
            case 0:
                return new M(this.f6307s, cVar, 0);
            case 1:
                return new M(this.f6307s, cVar, 1);
            default:
                return new M(this.f6307s, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6306r) {
            case 0:
                M m10 = (M) create(interfaceC0402u, cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                m10.invokeSuspend(yVar);
                return yVar;
            case 1:
                M m11 = (M) create(interfaceC0402u, cVar);
                p110k9.y yVar2 = p110k9.y.f19095a;
                m11.invokeSuspend(yVar2);
                return yVar2;
            default:
                M m12 = (M) create(interfaceC0402u, cVar);
                p110k9.y yVar3 = p110k9.y.f19095a;
                m12.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6306r) {
            case 0:
                p110k9.a.e(obj);
                this.f6307s.b(true);
                break;
            case 1:
                p110k9.a.e(obj);
                this.f6307s.d();
                break;
            default:
                p110k9.a.e(obj);
                this.f6307s.m();
                break;
        }
        return p110k9.y.f19095a;
    }
}
