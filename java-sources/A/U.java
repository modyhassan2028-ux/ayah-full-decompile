package A;

/* JADX INFO: loaded from: classes.dex */
public final class U extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f149r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f149r = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f149r) {
            case 0:
                long j = ((p171r0.c) obj2).f21387a;
                U u8 = new U(3, (p150o9.c) obj3, 0);
                p110k9.y yVar = p110k9.y.f19095a;
                u8.invokeSuspend(yVar);
                return yVar;
            case 1:
                ((Number) obj2).floatValue();
                U u10 = new U(3, (p150o9.c) obj3, 1);
                p110k9.y yVar2 = p110k9.y.f19095a;
                u10.invokeSuspend(yVar2);
                return yVar2;
            default:
                long j10 = ((p171r0.c) obj2).f21387a;
                U u11 = new U(3, (p150o9.c) obj3, 2);
                p110k9.y yVar3 = p110k9.y.f19095a;
                u11.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f149r;
        p110k9.y yVar = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                break;
            case 1:
                p110k9.a.e(obj);
                break;
            default:
                p110k9.a.e(obj);
                break;
        }
        return yVar;
    }
}
