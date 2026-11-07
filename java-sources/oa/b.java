package oa;

import Da.A;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ka.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20386a = new b();

    @Override // ka.o
    public final ka.u a(pa.f fVar) throws IOException {
        pa.d eVar;
        m mVar = fVar.f21169a;
        synchronized (mVar) {
            try {
                if (!mVar.f20423C) {
                    throw new IllegalStateException("released");
                }
                if (mVar.f20422B) {
                    throw new IllegalStateException("Check failed.");
                }
                if (mVar.f20421A) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = mVar.f20433x;
        p251z9.j.b(gVar);
        n nVarA = gVar.a();
        ka.r rVar = mVar.f20427r;
        nVarA.getClass();
        int i10 = fVar.g;
        Socket socket = nVarA.f20440f;
        Da.j jVar = nVarA.f20442i;
        Da.i iVar = nVarA.j;
        ra.p pVar = nVarA.f20444l;
        if (pVar != null) {
            eVar = new ra.q(rVar, nVarA, fVar, pVar);
        } else {
            socket.setSoTimeout(i10);
            A aD = jVar.d();
            long j = i10;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aD.g(j);
            iVar.d().g(fVar.f21175h);
            eVar = new qa.e(rVar, nVarA, jVar, iVar);
        }
        Ca.r rVar2 = new Ca.r(mVar, gVar, eVar);
        mVar.f20435z = rVar2;
        mVar.f20425E = rVar2;
        synchronized (mVar) {
            mVar.f20421A = true;
            mVar.f20422B = true;
        }
        if (mVar.f20424D) {
            throw new IOException("Canceled");
        }
        return pa.f.a(fVar, 0, rVar2, null, 61).b(fVar.f21173e);
    }
}
