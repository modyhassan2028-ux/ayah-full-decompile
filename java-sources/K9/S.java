package K9;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends AbstractC0399q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5336w = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p120l9.k f5339v;

    public final void g0(boolean z10) {
        long j = this.f5337t - (z10 ? 4294967296L : 1L);
        this.f5337t = j;
        if (j <= 0 && this.f5338u) {
            shutdown();
        }
    }

    public final void h0(F f3) {
        p120l9.k kVar = this.f5339v;
        if (kVar == null) {
            kVar = new p120l9.k();
            this.f5339v = kVar;
        }
        kVar.addLast(f3);
    }

    public abstract Thread i0();

    public final void j0(boolean z10) {
        this.f5337t = (z10 ? 4294967296L : 1L) + this.f5337t;
        if (z10) {
            return;
        }
        this.f5338u = true;
    }

    public abstract long k0();

    public final boolean l0() {
        p120l9.k kVar = this.f5339v;
        if (kVar == null) {
            return false;
        }
        F f3 = (F) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (f3 == null) {
            return false;
        }
        f3.run();
        return true;
    }

    public void m0(long j, O o10) {
        RunnableC0406y.f5416A.r0(j, o10);
    }

    public abstract void shutdown();
}
