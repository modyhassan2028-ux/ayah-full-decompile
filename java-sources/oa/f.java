package oa;

import Da.y;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Da.l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f20409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Ca.r f20414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ca.r rVar, y yVar, long j) {
        super(yVar);
        p251z9.j.e(yVar, "delegate");
        this.f20414x = rVar;
        this.f20409s = j;
        this.f20411u = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f20412v) {
            return iOException;
        }
        this.f20412v = true;
        if (iOException == null && this.f20411u) {
            this.f20411u = false;
        }
        Ca.r rVar = this.f20414x;
        m mVar = (m) rVar.f849c;
        if (iOException != null) {
            rVar.e(iOException);
        }
        return mVar.e(rVar, false, true, iOException);
    }

    @Override // Da.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20413w) {
            return;
        }
        this.f20413w = true;
        try {
            super.close();
        } catch (IOException e10) {
            throw b(e10);
        }
    }

    @Override // Da.y
    public final long o(long j, Da.h hVar) throws IOException {
        Ca.r rVar = this.f20414x;
        p251z9.j.e(hVar, "sink");
        if (this.f20413w) {
            throw new IllegalStateException("closed");
        }
        try {
            long jO = this.f1367r.o(8192L, hVar);
            if (this.f20411u) {
                this.f20411u = false;
            }
            if (jO == -1) {
                b(null);
                return -1L;
            }
            long j10 = this.f20410t + jO;
            long j11 = this.f20409s;
            if (j11 == -1 || j10 <= j11) {
                this.f20410t = j10;
                if (((pa.d) rVar.f851e).c()) {
                    b(null);
                }
                return jO;
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
        } catch (IOException e10) {
            throw b(e10);
        }
    }
}
