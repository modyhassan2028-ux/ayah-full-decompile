package R9;

import K9.AbstractC0405x;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f7443t;

    public j(Runnable runnable, long j, boolean z10) {
        super(j, z10);
        this.f7443t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7443t.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7443t;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0405x.p(runnable));
        sb.append(", ");
        sb.append(this.f7441r);
        sb.append(", ");
        return p245z2.a.F(sb, this.f7442s ? "Blocking" : "Non-blocking", ']');
    }
}
