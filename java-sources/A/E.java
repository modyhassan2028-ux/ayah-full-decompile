package A;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f28r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f29s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i10, p241y9.a aVar) {
        super(1);
        this.f28r = i10;
        this.f29s = aVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f28r;
        p110k9.y yVar = p110k9.y.f19095a;
        p241y9.a aVar = this.f29s;
        switch (i10) {
            case 0:
                aVar.invoke();
                return yVar;
            case 1:
                return new p171r0.c(((p171r0.c) aVar.invoke()).f21387a);
            default:
                R0.f fVar = new R0.f(((Number) aVar.invoke()).floatValue(), new E9.a(0.0f, 1.0f), 0);
                F9.f[] fVarArr = R0.u.f7181a;
                R0.v vVar = R0.s.f7158c;
                F9.f fVar2 = R0.u.f7181a[1];
                vVar.a((R0.j) obj, fVar);
                return yVar;
        }
    }
}
