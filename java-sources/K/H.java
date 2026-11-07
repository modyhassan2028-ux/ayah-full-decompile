package K;

import A.C0012c0;
import A.R0;
import A.V0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D0.z f4474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g0 f4475u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(D0.z zVar, g0 g0Var, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f4472r = i10;
        this.f4474t = zVar;
        this.f4475u = g0Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f4472r) {
            case 0:
                return new H(this.f4474t, this.f4475u, cVar, 0);
            case 1:
                return new H(this.f4474t, this.f4475u, cVar, 1);
            default:
                return new H(this.f4474t, this.f4475u, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f4472r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((H) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4472r) {
            case 0:
                int i10 = this.f4473s;
                p110k9.y yVar = p110k9.y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                this.f4473s = 1;
                Object objJ = AbstractC0405x.j(new A4.l(this.f4474t, this.f4475u, (p150o9.c) null, 4), this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objJ != aVar) {
                    objJ = yVar;
                }
                return objJ == aVar ? aVar : yVar;
            case 1:
                int i11 = this.f4473s;
                p110k9.y yVar2 = p110k9.y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar2;
                }
                p110k9.a.e(obj);
                this.f4473s = 1;
                Object objC = V0.c(this.f4474t, new C0012c0(this.f4475u, (p150o9.c) null, 3), this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objC != aVar2) {
                    objC = yVar2;
                }
                return objC == aVar2 ? aVar2 : yVar2;
            default:
                int i12 = this.f4473s;
                p110k9.y yVar3 = p110k9.y.f19095a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar3;
                }
                p110k9.a.e(obj);
                this.f4473s = 1;
                g0 g0Var = this.f4475u;
                Object objD = A.I.d(this.f4474t, new Z(g0Var, 0), new C0306a0(g0Var, 0), new C0306a0(g0Var, 1), new R0(8, g0Var), this);
                p161p9.a aVar3 = p161p9.a.f21156r;
                if (objD != aVar3) {
                    objD = yVar3;
                }
                return objD == aVar3 ? aVar3 : yVar3;
        }
    }
}
