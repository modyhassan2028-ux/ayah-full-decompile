package qa;

import Da.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ka.l;
import ka.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f21360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, n nVar, long j) {
        super(eVar, nVar);
        j.e(nVar, "url");
        this.f21360w = eVar;
        this.f21359v = j;
        if (j == 0) {
            b(l.f19177s);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zE;
        if (this.f21354t) {
            return;
        }
        if (this.f21359v != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = la.e.f19451a;
            j.e(timeUnit, "timeUnit");
            try {
                zE = la.e.e(this, 100);
            } catch (IOException unused) {
                zE = false;
            }
            if (!zE) {
                this.f21360w.f21363b.h();
                b(e.g);
            }
        }
        this.f21354t = true;
    }

    @Override // qa.a, Da.y
    public final long o(long j, h hVar) throws IOException {
        j.e(hVar, "sink");
        if (this.f21354t) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f21359v;
        if (j10 == 0) {
            return -1L;
        }
        long jO = super.o(Math.min(j10, 8192L), hVar);
        if (jO == -1) {
            this.f21360w.f21363b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(e.g);
            throw protocolException;
        }
        long j11 = this.f21359v - jO;
        this.f21359v = j11;
        if (j11 == 0) {
            b(l.f19177s);
        }
        return jO;
    }
}
