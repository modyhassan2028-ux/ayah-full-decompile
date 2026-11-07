package Ga;

import K9.InterfaceC0402u;

/* JADX INFO: renamed from: Ga.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0195d extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B.b f3010s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0195d(B.b bVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f3009r = i10;
        this.f3010s = bVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3009r) {
            case 0:
                return new C0195d(this.f3010s, cVar, 0);
            case 1:
                return new C0195d(this.f3010s, cVar, 1);
            case 2:
                return new C0195d(this.f3010s, cVar, 2);
            default:
                return new C0195d(this.f3010s, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f3009r) {
            case 0:
                C0195d c0195d = (C0195d) create(interfaceC0402u, cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                c0195d.invokeSuspend(yVar);
                return yVar;
            case 1:
                C0195d c0195d2 = (C0195d) create(interfaceC0402u, cVar);
                p110k9.y yVar2 = p110k9.y.f19095a;
                c0195d2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                C0195d c0195d3 = (C0195d) create(interfaceC0402u, cVar);
                p110k9.y yVar3 = p110k9.y.f19095a;
                c0195d3.invokeSuspend(yVar3);
                return yVar3;
            default:
                C0195d c0195d4 = (C0195d) create(interfaceC0402u, cVar);
                p110k9.y yVar4 = p110k9.y.f19095a;
                c0195d4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3009r) {
            case 0:
                p110k9.a.e(obj);
                break;
            case 1:
                p110k9.a.e(obj);
                break;
            case 2:
                p110k9.a.e(obj);
                break;
            default:
                p110k9.a.e(obj);
                break;
        }
        return p110k9.y.f19095a;
    }
}
