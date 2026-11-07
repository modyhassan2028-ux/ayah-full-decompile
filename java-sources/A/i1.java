package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.f f263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D0.v f265v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(p241y9.f fVar, C0053x0 c0053x0, D0.v vVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f261r = i10;
        this.f263t = fVar;
        this.f264u = c0053x0;
        this.f265v = vVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f261r) {
            case 0:
                return new i1(this.f263t, this.f264u, this.f265v, cVar, 0);
            default:
                return new i1(this.f263t, this.f264u, this.f265v, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f261r) {
            case 0:
                break;
        }
        return ((i1) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f261r) {
            case 0:
                int i10 = this.f262s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    p171r0.c cVar = new p171r0.c(this.f265v.f1134c);
                    this.f262s = 1;
                    Object objD = this.f263t.d(this.f264u, cVar, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i11 = this.f262s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    p171r0.c cVar2 = new p171r0.c(this.f265v.f1134c);
                    this.f262s = 1;
                    Object objD2 = this.f263t.d(this.f264u, cVar2, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objD2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }
}
