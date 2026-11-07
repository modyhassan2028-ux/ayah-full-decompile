package A;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements C0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f92r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f93s;

    public L0(b1 b1Var, boolean z10) {
        this.f92r = b1Var;
        this.f93s = z10;
    }

    @Override // C0.a
    public final long B(int i10, long j, long j10) {
        if (!this.f93s) {
            return 0L;
        }
        b1 b1Var = this.f92r;
        if (b1Var.f193a.c()) {
            return 0L;
        }
        return b1Var.h(b1Var.d(b1Var.f193a.e(b1Var.d(b1Var.g(j10)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // C0.a
    public final Object T(long j, long j10, p150o9.c cVar) {
        K0 k7;
        long jD;
        long j11;
        if (cVar instanceof K0) {
            k7 = (K0) cVar;
            int i10 = k7.f89u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k7.f89u = i10 - Integer.MIN_VALUE;
            } else {
                k7 = new K0(this, (q9.c) cVar);
            }
        } else {
            k7 = new K0(this, (q9.c) cVar);
        }
        Object objB = k7.f87s;
        int i11 = k7.f89u;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = k7.f86r;
                p110k9.a.e(objB);
                j11 = ((p063g1.q) objB).f16269a;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = k7.f86r;
                p110k9.a.e(objB);
                j11 = ((p063g1.q) objB).f16269a;
            }
            jD = p063g1.q.d(j10, j11);
        } else {
            p110k9.a.e(objB);
            jD = 0;
            if (this.f93s) {
                b1 b1Var = this.f92r;
                if (b1Var.f199h) {
                    j11 = 0;
                } else {
                    k7.f86r = j10;
                    k7.f89u = 1;
                    objB = b1Var.b(j10, k7);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objB == aVar) {
                        return aVar;
                    }
                    j11 = ((p063g1.q) objB).f16269a;
                }
                jD = p063g1.q.d(j10, j11);
            }
        }
        return new p063g1.q(jD);
    }

    @Override // C0.a
    public final Object h(long j, p150o9.c cVar) {
        return new p063g1.q(0L);
    }

    @Override // C0.a
    public final /* synthetic */ long m(long j, int i10) {
        return 0L;
    }
}
