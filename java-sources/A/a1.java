package A;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1 f187u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, p150o9.c cVar) {
        super(2, cVar);
        this.f187u = b1Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        a1 a1Var = new a1(this.f187u, cVar);
        a1Var.f186t = ((p063g1.q) obj).f16269a;
        return a1Var;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((p063g1.q) obj).f16269a;
        a1 a1Var = new a1(this.f187u, (p150o9.c) obj2);
        a1Var.f186t = j;
        return a1Var.invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f185s;
        b1 b1Var = this.f187u;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            j = this.f186t;
            C0.d dVar = b1Var.f198f;
            this.f186t = j;
            this.f185s = 1;
            obj = dVar.b(j, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            j = this.f186t;
            p110k9.a.e(obj);
        } else {
            if (i10 == 2) {
                j10 = this.f184r;
                j = this.f186t;
                p110k9.a.e(obj);
                j11 = ((p063g1.q) obj).f16269a;
                C0.d dVar2 = b1Var.f198f;
                long jD = p063g1.q.d(j10, j11);
                this.f186t = j;
                this.f184r = j11;
                this.f185s = 3;
                obj = dVar2.a(jD, j11, this);
                if (obj != aVar) {
                    j12 = j;
                    j13 = j11;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f184r;
            j12 = this.f186t;
            p110k9.a.e(obj);
        }
        return new p063g1.q(p063g1.q.d(j12, p063g1.q.d(j13, ((p063g1.q) obj).f16269a)));
        long jD2 = p063g1.q.d(j, ((p063g1.q) obj).f16269a);
        this.f186t = j;
        this.f184r = jD2;
        this.f185s = 2;
        obj = b1Var.b(jD2, this);
        if (obj != aVar) {
            j10 = jD2;
            j11 = ((p063g1.q) obj).f16269a;
            C0.d dVar3 = b1Var.f198f;
            long jD3 = p063g1.q.d(j10, j11);
            this.f186t = j;
            this.f184r = j11;
            this.f185s = 3;
            obj = dVar3.a(jD3, j11, this);
            if (obj != aVar) {
                j12 = j;
                j13 = j11;
                return new p063g1.q(p063g1.q.d(j12, p063g1.q.d(j13, ((p063g1.q) obj).f16269a)));
            }
        }
        return aVar;
    }
}
