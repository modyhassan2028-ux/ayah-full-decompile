package A4;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import W.C0561g1;
import W.P;
import Z.X;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f530u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(P p10, X x9, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f527r = i10;
        this.f529t = p10;
        this.f530u = x9;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f527r) {
            case 0:
                return new j(this.f529t, this.f530u, cVar, 0);
            case 1:
                return new j(this.f529t, this.f530u, cVar, 1);
            case 2:
                return new j(this.f529t, this.f530u, cVar, 2);
            default:
                return new j(this.f529t, this.f530u, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f527r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((j) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f527r) {
            case 0:
                int i10 = this.f528s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    this.f530u.setValue(Boolean.TRUE);
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                this.f528s = 1;
                if (AbstractC0405x.k(50L, this) == aVar) {
                    return aVar;
                }
                C0561g1 c0561g1 = this.f529t.f8750a;
                this.f528s = 2;
                if (c0561g1.a(this) == aVar) {
                    return aVar;
                }
                this.f530u.setValue(Boolean.TRUE);
                return y.f19095a;
            case 1:
                int i11 = this.f528s;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    this.f530u.setValue(Boolean.TRUE);
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                this.f528s = 1;
                if (AbstractC0405x.k(50L, this) == aVar2) {
                    return aVar2;
                }
                C0561g1 c0561g2 = this.f529t.f8750a;
                this.f528s = 2;
                if (c0561g2.a(this) == aVar2) {
                    return aVar2;
                }
                this.f530u.setValue(Boolean.TRUE);
                return y.f19095a;
            case 2:
                int i12 = this.f528s;
                p161p9.a aVar3 = p161p9.a.f21156r;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    this.f530u.setValue(Boolean.TRUE);
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                this.f528s = 1;
                if (AbstractC0405x.k(50L, this) == aVar3) {
                    return aVar3;
                }
                C0561g1 c0561g3 = this.f529t.f8750a;
                this.f528s = 2;
                if (c0561g3.a(this) == aVar3) {
                    return aVar3;
                }
                this.f530u.setValue(Boolean.TRUE);
                return y.f19095a;
            default:
                int i13 = this.f528s;
                p161p9.a aVar4 = p161p9.a.f21156r;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    this.f530u.setValue(Boolean.TRUE);
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                this.f528s = 1;
                if (AbstractC0405x.k(50L, this) == aVar4) {
                    return aVar4;
                }
                C0561g1 c0561g4 = this.f529t.f8750a;
                this.f528s = 2;
                if (c0561g4.a(this) == aVar4) {
                    return aVar4;
                }
                this.f530u.setValue(Boolean.TRUE);
                return y.f19095a;
        }
    }
}
