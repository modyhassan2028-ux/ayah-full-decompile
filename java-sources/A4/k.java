package A4;

import K9.InterfaceC0402u;
import W.C0561g1;
import W.P;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(P p10, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f531r = i10;
        this.f533t = p10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f531r) {
            case 0:
                return new k(this.f533t, cVar, 0);
            case 1:
                return new k(this.f533t, cVar, 1);
            case 2:
                return new k(this.f533t, cVar, 2);
            case 3:
                return new k(this.f533t, cVar, 3);
            case 4:
                return new k(this.f533t, cVar, 4);
            case 5:
                return new k(this.f533t, cVar, 5);
            case 6:
                return new k(this.f533t, cVar, 6);
            case 7:
                return new k(this.f533t, cVar, 7);
            default:
                return new k(this.f533t, cVar, 8);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f531r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((k) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f531r) {
            case 0:
                int i10 = this.f532s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g1 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC = c0561g1.c(this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 1:
                int i11 = this.f532s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g2 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC2 = c0561g2.c(this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objC2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 2:
                int i12 = this.f532s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g3 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objA = c0561g3.a(this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 3:
                int i13 = this.f532s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g4 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC3 = c0561g4.c(this);
                    p161p9.a aVar4 = p161p9.a.f21156r;
                    if (objC3 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 4:
                int i14 = this.f532s;
                if (i14 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g5 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC4 = c0561g5.c(this);
                    p161p9.a aVar5 = p161p9.a.f21156r;
                    if (objC4 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 5:
                int i15 = this.f532s;
                if (i15 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g6 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC5 = c0561g6.c(this);
                    p161p9.a aVar6 = p161p9.a.f21156r;
                    if (objC5 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 6:
                int i16 = this.f532s;
                if (i16 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g7 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC6 = c0561g7.c(this);
                    p161p9.a aVar7 = p161p9.a.f21156r;
                    if (objC6 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            case 7:
                int i17 = this.f532s;
                if (i17 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g8 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC7 = c0561g8.c(this);
                    p161p9.a aVar8 = p161p9.a.f21156r;
                    if (objC7 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            default:
                int i18 = this.f532s;
                if (i18 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g9 = this.f533t.f8750a;
                    this.f532s = 1;
                    Object objC8 = c0561g9.c(this);
                    p161p9.a aVar9 = p161p9.a.f21156r;
                    if (objC8 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
        }
    }
}
