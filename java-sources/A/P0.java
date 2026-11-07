package A;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f117s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(long j, p150o9.c cVar) {
        super(2, cVar);
        this.f117s = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        P0 p10 = new P0(this.f117s, cVar);
        p10.f116r = obj;
        return p10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        P0 p10 = (P0) create((Z0) obj, (p150o9.c) obj2);
        p110k9.y yVar = p110k9.y.f19095a;
        p10.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        b1 b1Var = ((Z0) this.f116r).f178a;
        b1.a(b1Var, b1Var.j, this.f117s, 1);
        return p110k9.y.f19095a;
    }
}
