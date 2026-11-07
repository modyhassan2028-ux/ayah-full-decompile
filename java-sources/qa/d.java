package qa;

import Da.h;
import java.io.IOException;
import ka.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21361v;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21354t) {
            return;
        }
        if (!this.f21361v) {
            b(e.g);
        }
        this.f21354t = true;
    }

    @Override // qa.a, Da.y
    public final long o(long j, h hVar) throws IOException {
        j.e(hVar, "sink");
        if (this.f21354t) {
            throw new IllegalStateException("closed");
        }
        if (this.f21361v) {
            return -1L;
        }
        long jO = super.o(8192L, hVar);
        if (jO != -1) {
            return jO;
        }
        this.f21361v = true;
        b(l.f19177s);
        return -1L;
    }
}
