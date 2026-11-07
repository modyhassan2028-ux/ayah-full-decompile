package oa;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements t, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20418a;

    public /* synthetic */ j(p pVar) {
        this.f20418a = pVar;
    }

    @Override // oa.g
    public n a() throws Throwable {
        IOException iOException = null;
        while (true) {
            p pVar = this.f20418a;
            if (pVar.f20467k.m()) {
                throw new IOException("Canceled");
            }
            try {
                s sVarE = pVar.e();
                if (!sVarE.d()) {
                    r rVarF = sVarE.f();
                    if (rVarF.f20474b == null && rVarF.f20475c == null) {
                        rVarF = sVarE.b();
                    }
                    s sVar = rVarF.f20474b;
                    Throwable th = rVarF.f20475c;
                    if (th != null) {
                        throw th;
                    }
                    if (sVar != null) {
                        pVar.f20471o.addFirst(sVar);
                    }
                }
                return sVarE.c();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    p110k9.a.a(iOException, e10);
                }
                if (!pVar.f(null)) {
                    throw iOException;
                }
            }
        }
    }

    @Override // oa.t
    public boolean b(ka.n nVar) {
        p251z9.j.e(nVar, "url");
        return this.f20418a.b(nVar);
    }

    @Override // oa.g
    public t c() {
        return this.f20418a;
    }

    @Override // oa.t
    public p120l9.k d() {
        return this.f20418a.f20471o;
    }

    @Override // oa.t
    public s e() {
        return this.f20418a.a();
    }

    @Override // oa.t
    public boolean f(n nVar) {
        return this.f20418a.f(nVar);
    }

    @Override // oa.t
    public ka.a g() {
        return this.f20418a.f20466i;
    }

    @Override // oa.t
    public boolean h() {
        return this.f20418a.f20467k.m();
    }
}
