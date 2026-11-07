package G;

import K9.InterfaceC0402u;
import p223x.C1411c;

/* JADX INFO: renamed from: G.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182p extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0185t f2719t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0182p(C0185t c0185t, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f2717r = i10;
        this.f2719t = c0185t;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2717r) {
            case 0:
                return new C0182p(this.f2719t, cVar, 0);
            case 1:
                return new C0182p(this.f2719t, cVar, 1);
            case 2:
                return new C0182p(this.f2719t, cVar, 2);
            case 3:
                return new C0182p(this.f2719t, cVar, 3);
            default:
                return new C0182p(this.f2719t, cVar, 4);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f2717r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C0182p) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f2717r;
        p110k9.y yVar = p110k9.y.f19095a;
        C0185t c0185t = this.f2719t;
        p161p9.a aVar = p161p9.a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f2718s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C1411c c1411c = c0185t.f2747p;
                Float f3 = new Float(1.0f);
                this.f2718s = 1;
                return c1411c.e(f3, this) == aVar ? aVar : yVar;
            case 1:
                int i12 = this.f2718s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C1411c c1411c2 = c0185t.f2746o;
                    p063g1.j jVar = new p063g1.j(0L);
                    this.f2718s = 1;
                    if (c1411c2.e(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                int i13 = C0185t.f2733t;
                c0185t.g(0L);
                c0185t.f(false);
                return yVar;
            case 2:
                int i14 = this.f2718s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C1411c c1411c3 = c0185t.f2746o;
                this.f2718s = 1;
                return c1411c3.f(this) == aVar ? aVar : yVar;
            case 3:
                int i15 = this.f2718s;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C1411c c1411c4 = c0185t.f2747p;
                this.f2718s = 1;
                return c1411c4.f(this) == aVar ? aVar : yVar;
            default:
                int i16 = this.f2718s;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C1411c c1411c5 = c0185t.f2747p;
                this.f2718s = 1;
                return c1411c5.f(this) == aVar ? aVar : yVar;
        }
    }
}
