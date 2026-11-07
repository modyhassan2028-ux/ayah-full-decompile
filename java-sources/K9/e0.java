package K9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends C0389g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h0 f5356z;

    public e0(p150o9.c cVar, h0 h0Var) {
        super(1, cVar);
        this.f5356z = h0Var;
    }

    @Override // K9.C0389g
    public final Throwable q(h0 h0Var) {
        Throwable thC;
        h0 h0Var2 = this.f5356z;
        h0Var2.getClass();
        Object obj = h0.f5371r.get(h0Var2);
        if (!(obj instanceof g0) || (thC = ((g0) obj).c()) == null) {
            return obj instanceof C0397o ? ((C0397o) obj).f5385a : h0Var.E();
        }
        return thC;
    }

    @Override // K9.C0389g
    public final String y() {
        return "AwaitContinuation";
    }
}
