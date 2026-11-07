package va;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f23412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f23413b;

    public m(l lVar) {
        this.f23412a = lVar;
    }

    @Override // va.n
    public final String a(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // va.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.f23412a.b(sSLSocket);
    }

    @Override // va.n
    public final boolean c() {
        return true;
    }

    @Override // va.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        p251z9.j.e(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f23413b == null && this.f23412a.b(sSLSocket)) {
                this.f23413b = this.f23412a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23413b;
    }
}
