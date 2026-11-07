package ra;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class w extends Da.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f21747n;

    public w(x xVar) {
        this.f21747n = xVar;
    }

    @Override // Da.e
    public final void j() {
        this.f21747n.e(EnumC1290b.CANCEL);
        p pVar = this.f21747n.f21749b;
        synchronized (pVar) {
            long j = pVar.f21699E;
            long j10 = pVar.f21698D;
            if (j < j10) {
                return;
            }
            pVar.f21698D = j10 + 1;
            pVar.f21700F = System.nanoTime() + ((long) 1000000000);
            na.c.c(pVar.f21718y, android.support.v4.media.session.p.B(new StringBuilder(), pVar.f21713t, " ping"), new B3.f(20, pVar));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
