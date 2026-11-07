package A;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.InterfaceC0416i;
import Z.C0672b;

/* JADX INFO: renamed from: A.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0028k0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028k0(int i10, p150o9.c cVar) {
        super(2, cVar);
        this.f291r = 1;
        this.f293t = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f291r) {
            case 0:
                C0028k0 c0028k0 = new C0028k0(2, cVar, 0);
                c0028k0.f292s = obj;
                return c0028k0;
            case 1:
                C0028k0 c0028k1 = new C0028k0(this.f293t, cVar);
                c0028k1.f292s = obj;
                return c0028k1;
            default:
                C0028k0 c0028k2 = new C0028k0(2, cVar, 2);
                c0028k2.f292s = obj;
                return c0028k2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f291r) {
            case 0:
                return ((C0028k0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                C0028k0 c0028k0 = (C0028k0) create((X1.b) obj, (p150o9.c) obj2);
                p110k9.y yVar = p110k9.y.f19095a;
                c0028k0.invokeSuspend(yVar);
                return yVar;
            default:
                return ((C0028k0) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0402u interfaceC0402u;
        InterfaceC0416i interfaceC0416i;
        p207v2.c0 c0Var;
        int i10 = this.f291r;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f293t;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    interfaceC0402u = (InterfaceC0402u) this.f292s;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0402u = (InterfaceC0402u) this.f292s;
                    p110k9.a.e(obj);
                }
                while (AbstractC0405x.v(interfaceC0402u.getCoroutineContext())) {
                    C0017f c0017f = C0017f.f234v;
                    this.f292s = interfaceC0402u;
                    this.f293t = 1;
                    if (C0672b.p(getContext()).b0(c0017f, this) == aVar) {
                        return aVar;
                    }
                }
                return yVar;
            case 1:
                X1.b bVar = (X1.b) this.f292s;
                p110k9.a.e(obj);
                X1.e eVar = F3.a.f2344a;
                bVar.e(F3.a.j, new Integer(this.f293t));
                return yVar;
            default:
                int i12 = this.f293t;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    interfaceC0416i = (InterfaceC0416i) this.f292s;
                    c0Var = null;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                        return yVar;
                    }
                    interfaceC0416i = (InterfaceC0416i) this.f292s;
                    p110k9.a.e(obj);
                    c0Var = (p207v2.c0) obj;
                }
                Boolean boolValueOf = Boolean.valueOf(c0Var == p207v2.c0.f23216r);
                this.f292s = null;
                this.f293t = 2;
                return interfaceC0416i.b(boolValueOf, this) == aVar ? aVar : yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028k0(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f291r = i11;
    }
}
