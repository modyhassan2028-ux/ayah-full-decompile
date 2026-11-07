package A;

import K9.AbstractC0405x;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b1 f169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p251z9.u f170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f171t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f172u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1 f174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p251z9.u f175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f176y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(b1 b1Var, p251z9.u uVar, long j, p150o9.c cVar) {
        super(2, cVar);
        this.f174w = b1Var;
        this.f175x = uVar;
        this.f176y = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        Y0 y10 = new Y0(this.f174w, this.f175x, this.f176y, cVar);
        y10.f173v = obj;
        return y10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((Z0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        p251z9.u uVar;
        long j;
        b1 b1Var2;
        int i10 = this.f172u;
        EnumC0047u0 enumC0047u0 = EnumC0047u0.f425s;
        if (i10 == 0) {
            p110k9.a.e(obj);
            Z0 z10 = (Z0) this.f173v;
            b1Var = this.f174w;
            X0 x9 = new X0(0, b1Var, z10);
            C0037p c0037p = b1Var.f195c;
            p251z9.u uVar2 = this.f175x;
            long j10 = uVar2.f24885r;
            EnumC0047u0 enumC0047u1 = b1Var.f196d;
            long j11 = this.f176y;
            float fD = b1Var.d(enumC0047u1 == enumC0047u0 ? p063g1.q.b(j11) : p063g1.q.c(j11));
            this.f173v = b1Var;
            this.f169r = b1Var;
            this.f170s = uVar2;
            this.f171t = j10;
            this.f172u = 1;
            c0037p.getClass();
            obj = AbstractC0405x.I(c0037p.f369b, new C0035o(fD, c0037p, x9, null), this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (obj == aVar) {
                return aVar;
            }
            uVar = uVar2;
            j = j10;
            b1Var2 = b1Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f171t;
            uVar = this.f170s;
            b1Var = this.f169r;
            b1Var2 = (b1) this.f173v;
            p110k9.a.e(obj);
        }
        float fD2 = b1Var2.d(((Number) obj).floatValue());
        uVar.f24885r = b1Var.f196d == enumC0047u0 ? p063g1.q.a(j, fD2, 0.0f, 2) : p063g1.q.a(j, 0.0f, fD2, 1);
        return p110k9.y.f19095a;
    }
}
