package u;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public G9.h f22659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D f22660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long[] f22661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ D f22665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ G9.h f22666z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d5, G9.h hVar, p150o9.c cVar) {
        super(2, cVar);
        this.f22665y = d5;
        this.f22666z = hVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        C c10 = new C(this.f22665y, this.f22666z, cVar);
        c10.f22664x = obj;
        return c10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((G9.j) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        G9.j jVar;
        D d5;
        long[] jArr;
        int i10;
        G9.h hVar;
        int i11 = this.f22663w;
        if (i11 == 0) {
            p110k9.a.e(obj);
            jVar = (G9.j) this.f22664x;
            d5 = this.f22665y;
            B b5 = d5.f22668s;
            jArr = b5.f22654c;
            i10 = b5.f22656e;
            hVar = this.f22666z;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f22662v;
            jArr = this.f22661u;
            d5 = this.f22660t;
            hVar = this.f22659s;
            jVar = (G9.j) this.f22664x;
            p110k9.a.e(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return p110k9.y.f19095a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        hVar.f2935t = i10;
        Object obj2 = d5.f22668s.f22653b[i10];
        this.f22664x = jVar;
        this.f22659s = hVar;
        this.f22660t = d5;
        this.f22661u = jArr;
        this.f22662v = i12;
        this.f22663w = 1;
        jVar.b(obj2, this);
        return p161p9.a.f21156r;
    }
}
