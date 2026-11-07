package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S0 f108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ long f109u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(S0 s10, long j, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f106r = i10;
        this.f108t = s10;
        this.f109u = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f106r) {
            case 0:
                return new O0(this.f108t, this.f109u, cVar, 0);
            case 1:
                return new O0(this.f108t, this.f109u, cVar, 1);
            case 2:
                return new O0(this.f108t, this.f109u, cVar, 2);
            default:
                O0 o10 = new O0(this.f108t, cVar);
                o10.f109u = ((p171r0.c) obj).f21387a;
                return o10;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f106r) {
            case 0:
                return ((O0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((O0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((O0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                long j = ((p171r0.c) obj).f21387a;
                O0 o10 = new O0(this.f108t, (p150o9.c) obj2);
                o10.f109u = j;
                return o10.invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f106r) {
            case 0:
                int i10 = this.f107s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    b1 b1Var = this.f108t.U;
                    long j = this.f109u;
                    this.f107s = 1;
                    Object objC = b1Var.c(j, false, this);
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
                return p110k9.y.f19095a;
            case 1:
                int i11 = this.f107s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    b1 b1Var2 = this.f108t.U;
                    P0 p10 = new P0(this.f109u, null);
                    this.f107s = 1;
                    Object objF = b1Var2.f(p232y.T.f24455s, p10, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 2:
                int i12 = this.f107s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    b1 b1Var3 = this.f108t.U;
                    long j10 = this.f109u;
                    this.f107s = 1;
                    Object objC2 = b1Var3.c(j10, true, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objC2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i13 = this.f107s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                long j11 = this.f109u;
                b1 b1Var4 = this.f108t.U;
                this.f107s = 1;
                Object objA = androidx.compose.foundation.gestures.a.a(b1Var4, j11, this);
                p161p9.a aVar4 = p161p9.a.f21156r;
                return objA == aVar4 ? aVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(S0 s10, p150o9.c cVar) {
        super(2, cVar);
        this.f106r = 3;
        this.f108t = s10;
    }
}
