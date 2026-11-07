package A;

import K9.InterfaceC0402u;
import p223x.C1408a0;
import p223x.C1411c;
import p223x.C1419h;
import p223x.EnumC1418g;

/* JADX INFO: loaded from: classes.dex */
public final class W extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f157t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0.q f158u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f159v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(X x9, long j, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f155r = i10;
        this.f158u = x9;
        this.f159v = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f155r) {
            case 0:
                W w9 = new W((X) this.f158u, this.f159v, cVar, 0);
                w9.f157t = obj;
                return w9;
            case 1:
                W w10 = new W((X) this.f158u, this.f159v, cVar, 1);
                w10.f157t = obj;
                return w10;
            default:
                return new W((p214w.M) this.f157t, this.f159v, (p214w.O) this.f158u, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f155r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((W) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f155r;
        p110k9.y yVar = p110k9.y.f19095a;
        long j = this.f159v;
        p161p9.a aVar = p161p9.a.f21156r;
        l0.q qVar = this.f158u;
        switch (i10) {
            case 0:
                int i11 = this.f156s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f157t;
                p241y9.f fVar = ((X) qVar).S;
                p171r0.c cVar = new p171r0.c(j);
                this.f156s = 1;
                return fVar.d(interfaceC0402u, cVar, this) == aVar ? aVar : yVar;
            case 1:
                X x9 = (X) qVar;
                int i12 = this.f156s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0402u interfaceC0402u2 = (InterfaceC0402u) this.f157t;
                p241y9.f fVar2 = x9.T;
                long jF = p063g1.q.f(j, x9.U ? -1.0f : 1.0f);
                EnumC0047u0 enumC0047u0 = x9.Q;
                U u8 = V.f152a;
                Float f3 = new Float(enumC0047u0 == EnumC0047u0.f424r ? p063g1.q.c(jF) : p063g1.q.b(jF));
                this.f156s = 1;
                return fVar2.d(interfaceC0402u2, f3, this) == aVar ? aVar : yVar;
            default:
                p214w.O o10 = (p214w.O) qVar;
                p214w.M m10 = (p214w.M) this.f157t;
                int i13 = this.f156s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    C1411c c1411c = m10.f23449a;
                    p063g1.l lVar = new p063g1.l(j);
                    C1408a0 c1408a0 = o10.f23456G;
                    this.f156s = 1;
                    obj = C1411c.c(c1411c, lVar, c1408a0, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                EnumC1418g enumC1418g = ((C1419h) obj).f23984b;
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(p214w.M m10, long j, p214w.O o10, p150o9.c cVar) {
        super(2, cVar);
        this.f155r = 2;
        this.f157t = m10;
        this.f159v = j;
        this.f158u = o10;
    }
}
