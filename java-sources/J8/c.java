package J8;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f4393s;

    public /* synthetic */ c(d dVar, int i10) {
        this.f4392r = i10;
        this.f4393s = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        K8.b bVarG;
        K8.b bVarJ;
        switch (this.f4392r) {
            case 0:
                this.f4393s.b();
                return;
            case 1:
                this.f4393s.b();
                return;
            default:
                d dVar = this.f4393s;
                synchronized (d.f4394m) {
                    try {
                        p050e8.f fVar = dVar.f4395a;
                        fVar.a();
                        M.k kVarE = M.k.e(fVar.f15843a);
                        try {
                            bVarG = dVar.f4397c.G();
                            if (kVarE != null) {
                                kVarE.H();
                            }
                        } catch (Throwable th) {
                            if (kVarE != null) {
                                kVarE.H();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i10 = bVarG.f5308b;
                    if (i10 == 5) {
                        bVarJ = dVar.j(bVarG);
                    } else {
                        if (i10 == 3) {
                            bVarJ = dVar.j(bVarG);
                        } else if (!dVar.f4398d.a(bVarG)) {
                            return;
                        } else {
                            bVarJ = dVar.c(bVarG);
                        }
                    }
                    dVar.g(bVarJ);
                    dVar.n(bVarG, bVarJ);
                    if (bVarJ.f5308b == 4) {
                        dVar.m(bVarJ.f5307a);
                    }
                    int i11 = bVarJ.f5308b;
                    if (i11 == 5) {
                        dVar.k(new f());
                        return;
                    } else if (i11 == 2 || i11 == 1) {
                        dVar.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.l(bVarJ);
                        return;
                    }
                } catch (f e10) {
                    dVar.k(e10);
                    return;
                }
        }
    }
}
