package N9;

/* JADX INFO: renamed from: N9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429w implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p251z9.t f6256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f6258t;

    public C0429w(p251z9.t tVar, int i10, InterfaceC0416i interfaceC0416i) {
        this.f6256r = tVar;
        this.f6257s = i10;
        this.f6258t = interfaceC0416i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        C0428v c0428v;
        if (cVar instanceof C0428v) {
            c0428v = (C0428v) cVar;
            int i10 = c0428v.f6255t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0428v.f6255t = i10 - Integer.MIN_VALUE;
            } else {
                c0428v = new C0428v(this, cVar);
            }
        } else {
            c0428v = new C0428v(this, cVar);
        }
        Object obj2 = c0428v.f6253r;
        int i11 = c0428v.f6255t;
        p110k9.y yVar = p110k9.y.f19095a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj2);
            return yVar;
        }
        p110k9.a.e(obj2);
        p251z9.t tVar = this.f6256r;
        int i12 = tVar.f24884r;
        if (i12 < this.f6257s) {
            tVar.f24884r = i12 + 1;
            return yVar;
        }
        c0428v.f6255t = 1;
        Object objB = this.f6258t.b(obj, c0428v);
        p161p9.a aVar = p161p9.a.f21156r;
        return objB == aVar ? aVar : yVar;
    }
}
