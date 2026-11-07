package T1;

import K9.C0395m;
import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: renamed from: T1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497n extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f7711t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0497n(B b5, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f7709r = i10;
        this.f7711t = b5;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7709r) {
            case 0:
                return new C0497n(this.f7711t, cVar, 0);
            case 1:
                return new C0497n(this.f7711t, cVar, 1);
            default:
                return new C0497n(this.f7711t, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7709r) {
            case 0:
                return ((C0497n) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0497n) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((C0497n) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7709r) {
            case 0:
                int i10 = this.f7710s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f7710s = 1;
                    Object objE = B.e(this.f7711t, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 1:
                int i11 = this.f7710s;
                p110k9.y yVar = p110k9.y.f19095a;
                B b5 = this.f7711t;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    Aa.a aVar3 = b5.f7568i;
                    this.f7710s = 1;
                    Object objP = ((C0395m) aVar3.f555s).p(this);
                    if (objP != aVar2) {
                        objP = yVar;
                    }
                    if (objP != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0415h interfaceC0415hG = AbstractC0419l.g(b5.h().c(), -1);
                E5.e eVar = new E5.e(6, b5);
                this.f7710s = 2;
                if (interfaceC0415hG.d(eVar, this) != aVar2) {
                    return yVar;
                }
                return aVar2;
            default:
                B b10 = this.f7711t;
                O8.c cVar = b10.f7567h;
                int i12 = this.f7710s;
                p161p9.a aVar4 = p161p9.a.f21156r;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            p110k9.a.e(obj);
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p110k9.a.e(obj);
                        }
                        return (d0) obj;
                    }
                    p110k9.a.e(obj);
                    if (cVar.p() instanceof L) {
                        return cVar.p();
                    }
                    this.f7710s = 1;
                    if (b10.i(this) == aVar4) {
                        return aVar4;
                    }
                    this.f7710s = 2;
                    obj = B.f(b10, false, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    return (d0) obj;
                } catch (Throwable th) {
                    return new W(th, -1);
                }
        }
    }
}
