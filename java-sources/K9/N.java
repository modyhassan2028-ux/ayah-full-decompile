package K9;

/* JADX INFO: loaded from: classes.dex */
public final class N extends O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s0 f5329t;

    public N(long j, s0 s0Var) {
        super(j);
        this.f5329t = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5329t.run();
    }

    @Override // K9.O
    public final String toString() {
        return super.toString() + this.f5329t;
    }
}
