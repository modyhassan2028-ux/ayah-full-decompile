package i7;

/* JADX INFO: renamed from: i7.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1010p1 extends AbstractC1002n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1010p1(C1021t1 c1021t1, C1023u0 c1023u0, int i10) {
        super(c1023u0);
        this.f17506e = i10;
        this.f17507f = c1021t1;
    }

    @Override // i7.AbstractC1002n
    public final void a() {
        switch (this.f17506e) {
            case 0:
                C1021t1 c1021t1 = this.f17507f;
                c1021t1.o();
                if (c1021t1.F()) {
                    X x9 = ((C1023u0) c1021t1.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17178E.a("Inactivity, disconnecting from the service");
                    c1021t1.w();
                    break;
                }
                break;
            default:
                X x10 = ((C1023u0) this.f17507f.f16104r).f17584w;
                C1023u0.m(x10);
                x10.f17185z.a("Tasks have been queued for a long time");
                break;
        }
    }
}
