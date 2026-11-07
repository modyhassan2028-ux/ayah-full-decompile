package ra;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Da.y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Da.j f21727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21729t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21730u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21732w;

    public s(Da.j jVar) {
        p251z9.j.e(jVar, "source");
        this.f21727r = jVar;
    }

    @Override // Da.y
    public final Da.A d() {
        return this.f21727r.d();
    }

    @Override // Da.y
    public final long o(long j, Da.h hVar) throws IOException {
        int i10;
        int i11;
        p251z9.j.e(hVar, "sink");
        do {
            int i12 = this.f21731v;
            Da.j jVar = this.f21727r;
            if (i12 == 0) {
                jVar.skip(this.f21732w);
                this.f21732w = 0;
                if ((this.f21729t & 4) == 0) {
                    i10 = this.f21730u;
                    int iK = la.c.k(jVar);
                    this.f21731v = iK;
                    this.f21728s = iK;
                    int i13 = jVar.readByte() & 255;
                    this.f21729t = jVar.readByte() & 255;
                    Logger logger = t.f21733u;
                    if (logger.isLoggable(Level.FINE)) {
                        Da.k kVar = h.f21674a;
                        logger.fine(h.b(true, this.f21730u, this.f21728s, i13, this.f21729t));
                    }
                    i11 = jVar.readInt() & Integer.MAX_VALUE;
                    this.f21730u = i11;
                    if (i13 != 9) {
                        throw new IOException(i13 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jO = jVar.o(Math.min(8192L, i12), hVar);
                if (jO != -1) {
                    this.f21731v -= (int) jO;
                    return jO;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
