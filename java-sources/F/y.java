package F;

import A.C0;
import K9.InterfaceC0402u;
import p232y.T;

/* JADX INFO: loaded from: classes.dex */
public final class y extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2139r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f2140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2141t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a9, int i10, p150o9.c cVar) {
        super(2, cVar);
        this.f2140s = a9;
        this.f2141t = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2139r) {
            case 0:
                return new y(this.f2140s, cVar);
            default:
                return new y(this.f2140s, this.f2141t, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2139r) {
            case 0:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                y yVar = (y) create((C0) obj, (p150o9.c) obj2);
                p110k9.y yVar2 = p110k9.y.f19095a;
                yVar.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2139r) {
            case 0:
                int i10 = this.f2141t;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    x xVar = new x(2, null, 0);
                    this.f2141t = 1;
                    Object objA = this.f2140s.a(T.f24454r, xVar, this);
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
                p110k9.a.e(obj);
                this.f2140s.j(this.f2141t, 0, true);
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a9, p150o9.c cVar) {
        super(2, cVar);
        this.f2140s = a9;
    }
}
