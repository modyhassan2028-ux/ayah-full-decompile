package W;

import K9.InterfaceC0402u;
import p223x.C1411c;

/* JADX INFO: loaded from: classes.dex */
public final class V extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f8866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Object obj, float f3, boolean z10, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f8863r = i10;
        this.f8867v = obj;
        this.f8865t = f3;
        this.f8866u = z10;
        this.f8868w = obj2;
        this.f8869x = obj3;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f8863r) {
            case 0:
                return new V((C1411c) this.f8867v, this.f8865t, this.f8866u, (W) this.f8868w, (B.i) this.f8869x, cVar, 0);
            default:
                return new V((C0576l) this.f8867v, this.f8865t, this.f8866u, (Z.X) this.f8868w, (Z.X) this.f8869x, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f8863r) {
            case 0:
                break;
        }
        return ((V) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object dVar;
        Object objE;
        int i10 = this.f8863r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f8869x;
        Object obj3 = this.f8867v;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj4 = this.f8868w;
        switch (i10) {
            case 0:
                W w9 = (W) obj4;
                C1411c c1411c = (C1411c) obj3;
                int i11 = this.f8864s;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                float f3 = ((p063g1.f) c1411c.f23945e.getValue()).f16252r;
                float f7 = this.f8865t;
                if (p063g1.f.a(f3, f7)) {
                    return yVar;
                }
                if (this.f8866u) {
                    float f10 = ((p063g1.f) c1411c.f23945e.getValue()).f16252r;
                    p223x.u0 u0Var = null;
                    if (p063g1.f.a(f10, w9.f8886b)) {
                        dVar = new B.l(0L);
                    } else if (p063g1.f.a(f10, w9.f8888d)) {
                        dVar = new B.g();
                    } else {
                        dVar = p063g1.f.a(f10, w9.f8887c) ? new B.d() : null;
                    }
                    B.i iVar = (B.i) obj2;
                    this.f8864s = 2;
                    p223x.u0 u0Var2 = X.x.f9804b;
                    p223x.u0 u0Var3 = X.x.f9803a;
                    if (iVar != null) {
                        if ((iVar instanceof B.l) || (iVar instanceof B.b) || (iVar instanceof B.g) || (iVar instanceof B.d)) {
                            u0Var = u0Var3;
                        }
                    } else if (dVar != null) {
                        if ((dVar instanceof B.l) || (dVar instanceof B.b)) {
                            u0Var = u0Var2;
                        } else if (dVar instanceof B.g) {
                            u0Var = X.x.f9805c;
                        } else if (dVar instanceof B.d) {
                            u0Var = u0Var2;
                        }
                    }
                    p223x.u0 u0Var4 = u0Var;
                    if (u0Var4 == null ? (objE = c1411c.e(new p063g1.f(f7), this)) != aVar : (objE = C1411c.c(c1411c, new p063g1.f(f7), u0Var4, null, this, 12)) != aVar) {
                        objE = yVar;
                    }
                    if (objE != aVar) {
                        return yVar;
                    }
                } else {
                    p063g1.f fVar = new p063g1.f(f7);
                    this.f8864s = 1;
                    if (c1411c.e(fVar, this) != aVar) {
                        return yVar;
                    }
                }
                return aVar;
            default:
                Z.X x9 = (Z.X) obj4;
                int i12 = this.f8864s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                float f11 = A2.f8452a;
                float fD = p171r0.c.d(((p171r0.c) x9.getValue()).f21387a);
                float fE = p171r0.c.e(((p171r0.c) x9.getValue()).f21387a);
                long j = ((p063g1.j) ((Z.X) obj2).getValue()).f16254a;
                this.f8864s = 1;
                return A2.p((C0576l) obj3, fD, fE, this.f8865t, this.f8866u, j, this) == aVar ? aVar : yVar;
        }
    }
}
