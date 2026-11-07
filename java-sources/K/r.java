package K;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0 f4764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f4765t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(w0 w0Var, p241y9.c cVar, int i10) {
        super(1);
        this.f4763r = i10;
        this.f4764s = w0Var;
        this.f4765t = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4763r) {
            case 0:
                U0.I i10 = (U0.I) obj;
                w0 w0Var = this.f4764s;
                if (w0Var != null) {
                    w0Var.f4812a.setValue(i10);
                }
                p241y9.c cVar = this.f4765t;
                if (cVar != null) {
                    cVar.e(i10);
                }
                return p110k9.y.f19095a;
            default:
                w0 w0Var2 = this.f4764s;
                p093j0.r rVar = w0Var2.f4814c;
                p241y9.c cVar2 = this.f4765t;
                rVar.add(cVar2);
                return new D.e0(3, w0Var2, cVar2);
        }
    }
}
