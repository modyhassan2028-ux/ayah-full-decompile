package J3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f4271r = i10;
        this.f4273t = str;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f4271r) {
            case 0:
                l lVar = new l(this.f4273t, cVar, 0);
                lVar.f4272s = obj;
                return lVar;
            case 1:
                l lVar2 = new l(this.f4273t, cVar, 1);
                lVar2.f4272s = obj;
                return lVar2;
            default:
                l lVar3 = new l(this.f4273t, cVar, 2);
                lVar3.f4272s = obj;
                return lVar3;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        X1.b bVar = (X1.b) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f4271r) {
            case 0:
                l lVar = (l) create(bVar, cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                lVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                l lVar2 = (l) create(bVar, cVar);
                p110k9.y yVar2 = p110k9.y.f19095a;
                lVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                l lVar3 = (l) create(bVar, cVar);
                p110k9.y yVar3 = p110k9.y.f19095a;
                lVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f4271r;
        p110k9.y yVar = p110k9.y.f19095a;
        String str = this.f4273t;
        switch (i10) {
            case 0:
                X1.b bVar = (X1.b) this.f4272s;
                p110k9.a.e(obj);
                X1.e eVar = F3.a.f2344a;
                bVar.e(F3.a.f2353l, str);
                break;
            case 1:
                X1.b bVar2 = (X1.b) this.f4272s;
                p110k9.a.e(obj);
                X1.e eVar2 = F3.a.f2344a;
                bVar2.e(F3.a.g, str);
                break;
            default:
                X1.b bVar3 = (X1.b) this.f4272s;
                p110k9.a.e(obj);
                X1.e eVar3 = F3.a.f2344a;
                bVar3.e(F3.a.f2349f, str);
                break;
        }
        return yVar;
    }
}
