package A;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p251z9.s f19s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f20t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(p251z9.s sVar, float f3, p150o9.c cVar) {
        super(2, cVar);
        this.f19s = sVar;
        this.f20t = f3;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        B0 b5 = new B0(this.f19s, this.f20t, cVar);
        b5.f18r = obj;
        return b5;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        B0 b5 = (B0) create((C0) obj, (p150o9.c) obj2);
        p110k9.y yVar = p110k9.y.f19095a;
        b5.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        this.f19s.f24883r = ((C0) this.f18r).a(this.f20t);
        return p110k9.y.f19095a;
    }
}
