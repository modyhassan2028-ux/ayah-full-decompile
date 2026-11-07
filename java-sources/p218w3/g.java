package p218w3;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import N9.k0;
import R9.d;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import q9.i;
import z3.h;
import z3.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f23669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23670u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10, c cVar, int i11) {
        super(2, cVar);
        this.f23667r = i11;
        this.f23669t = hVar;
        this.f23670u = i10;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23667r) {
            case 0:
                return new g(this.f23669t, this.f23670u, cVar, 0);
            case 1:
                return new g(this.f23669t, this.f23670u, cVar, 1);
            case 2:
                return new g(this.f23669t, this.f23670u, cVar, 2);
            default:
                return new g(this.f23669t, this.f23670u, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f23667r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((g) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f23667r;
        z3.g gVar = z3.g.f24791a;
        y yVar = y.f19095a;
        c cVar = null;
        int i11 = this.f23670u;
        h hVar = this.f23669t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                k0 k0Var = hVar.f23672b;
                int i12 = this.f23668s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    this.f23668s = 1;
                    if (AbstractC0405x.k(3000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                j jVar = (j) k0Var.getValue();
                if (!(jVar instanceof h) || ((h) jVar).f24792a != i11) {
                    return yVar;
                }
                k0Var.getClass();
                k0Var.n(null, gVar);
                return yVar;
            case 1:
                int i13 = this.f23668s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                d dVar = d.f7436t;
                g gVar2 = new g(hVar, i11, cVar, 0);
                this.f23668s = 1;
                return AbstractC0405x.I(dVar, gVar2, this) == aVar ? aVar : yVar;
            case 2:
                k0 k0Var2 = hVar.f23673c;
                int i14 = this.f23668s;
                if (i14 == 0) {
                    p110k9.a.e(obj);
                    this.f23668s = 1;
                    if (AbstractC0405x.k(3000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                j jVar2 = (j) k0Var2.getValue();
                if (!(jVar2 instanceof z3.i) || ((z3.i) jVar2).f24794a != i11) {
                    return yVar;
                }
                k0Var2.getClass();
                k0Var2.n(null, gVar);
                return yVar;
            default:
                int i15 = this.f23668s;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar2 = H.f5322a;
                d dVar2 = d.f7436t;
                g gVar3 = new g(hVar, i11, cVar, 2);
                this.f23668s = 1;
                return AbstractC0405x.I(dVar2, gVar3, this) == aVar ? aVar : yVar;
        }
    }
}
