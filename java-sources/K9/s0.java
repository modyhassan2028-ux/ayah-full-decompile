package K9;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends P9.q implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5394v;

    public s0(long j, q9.c cVar) {
        super(cVar, cVar.getContext());
        this.f5394v = j;
    }

    @Override // K9.h0
    public final String S() {
        return super.S() + "(timeMillis=" + this.f5394v + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0405x.o(this.f5346t);
        q(new r0("Timed out waiting for " + this.f5394v + " ms", this));
    }
}
