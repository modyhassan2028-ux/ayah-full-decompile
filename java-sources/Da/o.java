package Da;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class o implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f1374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Inflater f1375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1377u;

    public o(t tVar, Inflater inflater) {
        this.f1374r = tVar;
        this.f1375s = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f1377u) {
            return;
        }
        this.f1375s.end();
        this.f1377u = true;
        this.f1374r.close();
    }

    @Override // Da.y
    public final A d() {
        return this.f1374r.f1392r.d();
    }

    @Override // Da.y
    public final long o(long j, h hVar) throws IOException {
        long j10;
        Inflater inflater = this.f1375s;
        p251z9.j.e(hVar, "sink");
        while (!this.f1377u) {
            try {
                u uVarH = hVar.H(1);
                int iMin = (int) Math.min(8192L, 8192 - uVarH.f1397c);
                boolean zNeedsInput = inflater.needsInput();
                t tVar = this.f1374r;
                if (zNeedsInput && !tVar.y()) {
                    u uVar = tVar.f1393s.f1361r;
                    p251z9.j.b(uVar);
                    int i10 = uVar.f1397c;
                    int i11 = uVar.f1396b;
                    int i12 = i10 - i11;
                    this.f1376t = i12;
                    inflater.setInput(uVar.f1395a, i11, i12);
                }
                int iInflate = inflater.inflate(uVarH.f1395a, uVarH.f1397c, iMin);
                int i13 = this.f1376t;
                if (i13 != 0) {
                    int remaining = i13 - inflater.getRemaining();
                    this.f1376t -= remaining;
                    tVar.skip(remaining);
                }
                if (iInflate > 0) {
                    uVarH.f1397c += iInflate;
                    j10 = iInflate;
                    hVar.f1362s += j10;
                } else {
                    if (uVarH.f1396b == uVarH.f1397c) {
                        hVar.f1361r = uVarH.a();
                        v.a(uVarH);
                    }
                    j10 = 0;
                }
                if (j10 > 0) {
                    return j10;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (tVar.y()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalStateException("closed");
    }
}
