package W;

/* JADX INFO: renamed from: W.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0593q1 extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9330s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0593q1(Object obj, p150o9.c cVar, int i10) {
        super(3, cVar);
        this.f9329r = i10;
        this.f9330s = obj;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f9329r) {
            case 0:
                ((Number) obj2).floatValue();
                C0593q1 c0593q1 = new C0593q1((C0604u1) this.f9330s, (p150o9.c) obj3, 0);
                p110k9.y yVar = p110k9.y.f19095a;
                c0593q1.invokeSuspend(yVar);
                return yVar;
            default:
                C0593q1 c0593q2 = new C0593q1((p251z9.r) this.f9330s, (p150o9.c) obj3, 1);
                p110k9.y yVar2 = p110k9.y.f19095a;
                c0593q2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f9329r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f9330s;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                ((C0604u1) obj2).f9396C.invoke();
                break;
            default:
                p110k9.a.e(obj);
                ((p251z9.r) obj2).f24882r = true;
                break;
        }
        return yVar;
    }
}
