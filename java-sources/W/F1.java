package W;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8542v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f8538r = i10;
        this.f8539s = obj;
        this.f8540t = obj2;
        this.f8541u = obj3;
        this.f8542v = obj4;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f8538r) {
            case 0:
                return new H1((I1) this.f8539s, (p063g1.c) this.f8540t, (p241y9.c) this.f8541u, (p241y9.c) this.f8542v);
            case 1:
                ((p104k1.o) this.f8539s).f((p241y9.a) this.f8540t, (p104k1.n) this.f8541u, (p063g1.m) this.f8542v);
                return p110k9.y.f19095a;
            default:
                Number number = (Number) this.f8541u;
                Number number2 = (Number) this.f8539s;
                p223x.D d5 = (p223x.D) this.f8540t;
                if (!number2.equals(d5.f23824r) || !number.equals(d5.f23825s)) {
                    p223x.C c10 = (p223x.C) this.f8542v;
                    d5.f23824r = number2;
                    d5.f23825s = number;
                    d5.f23828v = new p223x.i0(c10, d5.f23826t, number2, number, null);
                    d5.f23832z.f23849b.setValue(Boolean.TRUE);
                    d5.f23829w = false;
                    d5.f23830x = true;
                }
                return p110k9.y.f19095a;
        }
    }
}
