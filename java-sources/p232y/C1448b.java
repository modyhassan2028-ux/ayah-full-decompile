package p232y;

import B.j;
import B.k;
import B.l;
import B.m;
import K9.InterfaceC0402u;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1448b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC1450d f24475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f24476u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1448b(AbstractC1450d abstractC1450d, l lVar, c cVar, int i10) {
        super(2, cVar);
        this.f24473r = i10;
        this.f24475t = abstractC1450d;
        this.f24476u = lVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f24473r) {
            case 0:
                return new C1448b(this.f24475t, this.f24476u, cVar, 0);
            case 1:
                return new C1448b(this.f24475t, this.f24476u, cVar, 1);
            default:
                return new C1448b(this.f24475t, this.f24476u, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f24473r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C1448b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f24473r) {
            case 0:
                int i10 = this.f24474s;
                if (i10 == 0) {
                    a.e(obj);
                    j jVar = this.f24475t.f24484H;
                    if (jVar != null) {
                        k kVar = new k(this.f24476u);
                        this.f24474s = 1;
                        Object objA = jVar.a(kVar, this);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
            case 1:
                int i11 = this.f24474s;
                if (i11 == 0) {
                    a.e(obj);
                    j jVar2 = this.f24475t.f24484H;
                    if (jVar2 != null) {
                        this.f24474s = 1;
                        Object objA2 = jVar2.a(this.f24476u, this);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
            default:
                int i12 = this.f24474s;
                if (i12 == 0) {
                    a.e(obj);
                    j jVar3 = this.f24475t.f24484H;
                    if (jVar3 != null) {
                        m mVar = new m(this.f24476u);
                        this.f24474s = 1;
                        Object objA3 = jVar3.a(mVar, this);
                        p161p9.a aVar3 = p161p9.a.f21156r;
                        if (objA3 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
        }
    }
}
